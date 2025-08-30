package CodeGen;

import AST.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.File;

import org.apache.commons.io.FileUtils;

public class AngularGenerator {
    boolean hasSquareBracket = false;
    private boolean isGeneratingInterface = false;
    private List<String> interfaceProperties = new ArrayList<>();
    private String currentInterfaceName = "";

    // Helper classes for dynamic HTML generation
    private static class HtmlElement {
        String tagName;
        String className;
        Map<String, String> attributes = new HashMap<>();
        List<HtmlElement> children = new ArrayList<>();
        String textContent;
        String interpolation;
        boolean isSelfClosing;

        public HtmlElement(String tagName) {
            this.tagName = tagName;
        }
    }

    private static class ComponentInfo {
        String name;
        String selector;
        List<String> properties = new ArrayList<>();
        Map<String, String> propertyTypes = new HashMap<>();
        HtmlElement template;

        public ComponentInfo(String name, String selector) {
            this.name = name;
            this.selector = selector;
        }
    }

    public void generate(Program program) {
        String Space = "\t\t";

//        File source = new File("Result\\style.css");
//        File dest = new File("Result\\generate.css");
//        try {
////            FileUtils.copyFile(source, dest);
//            System.out.println("File copied successfully.");
//        } catch (IOException e) {
//            System.err.println("An error occurred: " + e.getMessage());
//        }

        try {
            FileWriter fw = new FileWriter("Result\\GeneratedCode.html");
            generate("<!DOCTYPE html>", fw);
            generate("\n<html>", fw);
            generate("\n<head>", fw);
            generate("\n<title>Angular App</title>", fw);
            generate("\n<link rel=\"stylesheet\" href=\"generate.css\"/>", fw);
            generate("\n</head>", fw);
            generate("\n<body>\n", fw);
            generate("\n<div id=\"app-root\"></div>", fw);
            generate("\n<div id=\"app-product-details\"></div>", fw);
            generate("\n<div id=\"app-product-list\"></div>\n\n", fw);
            generate("\n<script>\n", fw);
            if (program.getSourceElements() != null) {
                generateSourceElement(program.getSourceElements(), Space, fw);
            }
            generate("        const app = new AppComponent();\n", fw);
            generate("        app.render();\n", fw);
            generate("        new ProductDetailsComponent();\n", fw);
            generate("        new ProductListComponent();\n", fw);
            generate("\n", fw);
            generate("\n</script>", fw);
            generate("\n</body>", fw);
            generate("\n</html>", fw);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generate(String s, FileWriter fw) {
        try {
            System.out.print("\n");
            fw.append(s);
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }

    private void generateSourceElement(SourceElements sourceElements, String s, FileWriter fw) {
        List<Statement> statements = sourceElements.getStatement();
        for (int i = 0; i < statements.size(); i++) {
            if (statements.get(i).getExpressionStatement() != null) {
                generateExpressionStatement(statements.get(i).getExpressionStatement(), s, fw);
            }
            if (statements.get(i).getBlock() != null) {
                generateBlock(statements.get(i).getBlock(), s, fw);
            }
            if (statements.get(i).getClassDeclaration() != null) {
                generateClassDeclaration(statements.get(i).getClassDeclaration(), s, fw);
            }
        }
    }

    private HtmlElement extractHtmlElement(AST.HtmlElement htmlElement) {
        if (htmlElement == null) return null;

        String tagName = extractTagName(htmlElement);
        if (tagName == null || tagName.isEmpty()) {
            return null; // Skip elements without valid tag names
        }

        HtmlElement element = new HtmlElement(tagName);

        // Extract attributes
        if (htmlElement.getHtmlAttribute() != null) {
            for (HtmlAttribute attr : htmlElement.getHtmlAttribute()) {
                if (attr != null && attr.getHtmlAttributeName() != null) {
                    String attrName = extractAttributeName(attr.getHtmlAttributeName());
                    String attrValue = extractAttributeValue(attr.getHtmlAttributeValue());
                    if (attrName != null && !attrName.isEmpty()) {
                        element.attributes.put(attrName, attrValue != null ? attrValue : "");
                    }
                }
            }
        }

        // Extract children and content
        if (htmlElement.getHtmlContent() != null) {
            extractHtmlContent(htmlElement.getHtmlContent(), element);
        }

        return element;
    }

    // Helper method to safely extract tag name from different HTML element structures
    private String extractTagName(AST.HtmlElement htmlElement) {
        if (htmlElement == null) return null;

        // Try to get tag name from HtmlTagStartName
        if (htmlElement.getHtmlTagStartName() != null &&
                htmlElement.getHtmlTagStartName().getHtmlTagName() != null) {
            return htmlElement.getHtmlTagStartName().getHtmlTagName().getIdentifier();
        }

        // Try to get tag name from HtmlTagName (for self-closing tags)
        if (htmlElement.getHtmlTagName() != null) {
            return htmlElement.getHtmlTagName().getIdentifier();
        }

        // If no tag name found, return a default or null
        return null;
    }

    private void extractHtmlContent(HtmlContent htmlContent, HtmlElement parent) {
        if (htmlContent == null || parent == null) return;

        if (htmlContent.getHtmlElement() != null) {
            for (AST.HtmlElement childElement : htmlContent.getHtmlElement()) {
                if (childElement != null) {
                    HtmlElement child = extractHtmlElement(childElement);
                    if (child != null) {
                        parent.children.add(child);
                    }
                }
            }
        }

        if (htmlContent.getInterpolationExpressions() != null) {
            // Handle interpolation expressions like {{item.name}}
            for (InterpolationExpression interp : htmlContent.getInterpolationExpressions()) {
                if (interp != null) {
                    String interpolation = extractInterpolationExpression(interp);
                    if (interpolation != null && !interpolation.isEmpty()) {
                        parent.interpolation = interpolation;
                    }
                }
            }
        }
    }

    private String extractAttributeName(HtmlAttributeName attributeName) {
        if (attributeName.getAngularDirective() != null) {
            return attributeName.getAngularDirective();
        }
        if (attributeName.getIdentifiers() != null && !attributeName.getIdentifiers().isEmpty()) {
            return attributeName.getIdentifiers().get(0);
        }
        return "";
    }

    private String extractAttributeValue(HtmlAttributeValue attributeValue) {
        if (attributeValue != null && attributeValue.getStringLiteral() != null) {
            return attributeValue.getStringLiteral();
        }
        return "";
    }

    private String extractInterpolationExpression(InterpolationExpression interp) {
        if (interp == null) return null;

        if (interp.getHtmlSequence() != null) {
            HtmlSequence seq = interp.getHtmlSequence();
            if (seq.getPropertyName() != null &&
                    seq.getPropertyName().getIdentifierName() != null &&
                    seq.getPropertyName().getIdentifierName().getIdentifier() != null &&
                    seq.getIdentifierName() != null &&
                    seq.getIdentifierName().getIdentifier() != null) {

                String obj = seq.getPropertyName().getIdentifierName().getIdentifier().getIdentifier();
                String prop = seq.getIdentifierName().getIdentifier().getIdentifier();
                return obj + "." + prop;
            } else if (seq.getIdentifierName() != null &&
                    seq.getIdentifierName().getIdentifier() != null) {
                return seq.getIdentifierName().getIdentifier().getIdentifier();
            }
        }
        return null;
    }

    // Dynamic component info extraction
    private ComponentInfo extractComponentInfo(ClassDeclaration classDeclaration) {
        if (classDeclaration == null || classDeclaration.getIdentifier() == null) {
            return null;
        }

        String componentName = classDeclaration.getIdentifier().getIdentifier();
        String selector = getComponentSelector(classDeclaration);

        ComponentInfo componentInfo = new ComponentInfo(componentName, selector);

        // Extract properties from class elements
        if (classDeclaration.getClassTail() != null &&
                classDeclaration.getClassTail().getclassElement() != null) {

            List<ClassElement> classElements = classDeclaration.getClassTail().getclassElement();
            for (ClassElement element : classElements) {
                if (element != null) {
                    extractPropertyFromClassElement(element, componentInfo);
                }
            }
        }

        // Extract template
        try {
            if (classDeclaration.getDecoratorList() != null &&
                    classDeclaration.getDecoratorList().getDecorator() != null &&
                    !classDeclaration.getDecoratorList().getDecorator().isEmpty()) {

                AST.HtmlElement templateElement = getTemplateElement(classDeclaration);
                if (templateElement != null) {
                    componentInfo.template = extractHtmlElement(templateElement);
                }
            }
        } catch (Exception e) {
            // If template extraction fails, continue without template
            System.err.println("Warning: Could not extract template for component " + componentName + ": " + e.getMessage());
        }

        return componentInfo;
    }

    // Helper method to safely extract template element
    private AST.HtmlElement getTemplateElement(ClassDeclaration classDeclaration) {
        try {
            return classDeclaration.getDecoratorList()
                    .getDecorator().get(0).getDecoratorCallExpression().getArguments()
                    .getArgumentList().getArgument().get(0).getSingleExpression()
                    .getObjectLiteral().getPropertyAssignment().get(1)
                    .getSingleExpression().get(0).getHtmlElement();
        } catch (Exception e) {
            return null;
        }
    }

    // Helper method to extract property from class element
    private void extractPropertyFromClassElement(ClassElement element, ComponentInfo componentInfo) {
        try {
            if (element.getStatement() != null &&
                    element.getStatement().getVariableStatement() != null &&
                    element.getStatement().getVariableStatement().getVariableDeclarationList() != null &&
                    element.getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration() != null &&
                    !element.getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().isEmpty()) {

                VariableDeclaration varDecl = element.getStatement()
                        .getVariableStatement().getVariableDeclarationList()
                        .getVariableDeclaration().get(0);

                if (varDecl.getIdentifierOrKeyWord() != null &&
                        varDecl.getIdentifierOrKeyWord().getIdentifier() != null) {
                    String propName = varDecl.getIdentifierOrKeyWord().getIdentifier().getIdentifier();
                    componentInfo.properties.add(propName);
                }
            } else if (element.getPropertyMemberDeclaration() != null &&
                    element.getPropertyMemberDeclaration().getPropertyName() != null &&
                    element.getPropertyMemberDeclaration().getPropertyName().getIdentifierName() != null &&
                    element.getPropertyMemberDeclaration().getPropertyName().getIdentifierName().getIdentifier() != null) {
                String propName = element.getPropertyMemberDeclaration()
                        .getPropertyName().getIdentifierName().getIdentifier().getIdentifier();
                componentInfo.properties.add(propName);
            }
        } catch (Exception e) {
            // Skip this property if extraction fails
            System.err.println("Warning: Could not extract property from class element: " + e.getMessage());
        }
    }

    // Generic HTML element generation
    private void generateHtmlElement(HtmlElement element, String varPrefix, String indent, FileWriter fw) {
        if (element == null) return;

        String elementVar = varPrefix + element.tagName;

        // Create element
        generate(indent + "const " + elementVar + " = document.createElement('" + element.tagName + "');", fw);
        generate("\n", fw);

        // Set attributes
        for (Map.Entry<String, String> attr : element.attributes.entrySet()) {
            String attrName = attr.getKey();
            String attrValue = attr.getValue();

            if ("class".equals(attrName)) {
                generate(indent + elementVar + ".className = " + attrValue + ";", fw);
            } else if (attrName.startsWith("*ng") || attrName.startsWith("ng-")) {
                // Handle Angular directives - these are processed separately
                continue;
            } else {
                generate(indent + elementVar + "." + attrName + " = " + attrValue + ";", fw);
            }
            generate("\n", fw);
        }

        // Set text content or interpolation
        if (element.interpolation != null && !element.interpolation.isEmpty()) {
            String[] parts = element.interpolation.split("\\.");
            if (parts.length == 2) {
                generate(indent + elementVar + ".textContent = this." + parts[0] + "." + parts[1] + ";", fw);
            } else {
                generate(indent + elementVar + ".textContent = this." + element.interpolation + ";", fw);
            }
            generate("\n", fw);
        } else if (element.textContent != null) {
            generate(indent + elementVar + ".textContent = '" + element.textContent + "';", fw);
            generate("\n", fw);
        }

        // Generate children
        for (int i = 0; i < element.children.size(); i++) {
            HtmlElement child = element.children.get(i);
            String childVarPrefix = varPrefix + element.tagName + "Child" + i;
            generateHtmlElement(child, childVarPrefix, indent, fw);

            // Append child to parent
            String childVar = childVarPrefix + child.tagName;
            generate(indent + elementVar + ".appendChild(" + childVar + ");", fw);
            generate("\n", fw);
        }
    }

    // Generic component generation
    private void generateComponent(ComponentInfo componentInfo, FileWriter fw) {
        generate("function " + componentInfo.name + "() {", fw);
        generate("\n", fw);

        // Initialize properties
        for (String property : componentInfo.properties) {
            generate("    this." + property + " = null;", fw);
            generate("\n", fw);
        }

        generate("}", fw);
        generate("\n\n", fw);

        // Generate render method
        generateComponentRenderMethod(componentInfo, fw);
    }

    private void generateComponentRenderMethod(ComponentInfo componentInfo, FileWriter fw) {
        String methodParams = "";
        if (!componentInfo.properties.isEmpty()) {
            methodParams = componentInfo.properties.get(0); // Usually the main data property
        }

        generate(componentInfo.name + ".prototype.render = function(" + methodParams + ") {", fw);
        generate("\n", fw);

        if (!methodParams.isEmpty()) {
            generate("    this." + methodParams + " = " + methodParams + ";", fw);
            generate("\n", fw);
        }

        generate("    const container = document.getElementById(" + componentInfo.selector + ");", fw);
        generate("\n", fw);
        generate("    container.innerHTML = '';", fw);
        generate("\n\n", fw);

        // Handle conditional rendering
        if (componentInfo.template != null &&
                componentInfo.template.attributes.containsKey("*ngIf")) {
            generate("    if (!this." + methodParams + ") {", fw);
            generate("\n", fw);
            generate("        return;", fw);
            generate("\n", fw);
            generate("    }", fw);
            generate("\n", fw);
        }

        // Generate template elements
        if (componentInfo.template != null) {
            generateHtmlElement(componentInfo.template, "", "    ", fw);
            generate("\n", fw);
            generate("    container.appendChild(" + componentInfo.template.tagName + ");", fw);
            generate("\n", fw);
        }

        generate("};", fw);
        generate("\n", fw);
    }

    private void generateClassDeclaration(ClassDeclaration classDeclaration, String s, FileWriter fw) {
        if (classDeclaration == null ||
                classDeclaration.getIdentifier() == null ||
                classDeclaration.getClassTail() == null) {
            return; // Skip invalid class declarations
        }

        String componentName = classDeclaration.getIdentifier().getIdentifier();

        // Extract component information dynamically
        ComponentInfo componentInfo = extractComponentInfo(classDeclaration);
        if (componentInfo == null) {
            System.err.println("Warning: Could not extract component info for " + componentName);
            return;
        }

        // Use specialized generation for known components, otherwise use generic
        if ("ProductDetailsComponent".equals(componentName)) {
            generateProductDetailsComponent(classDeclaration,
                    classDeclaration.getClassTail().getclassElement(), fw);
        } else if ("ProductListComponent".equals(componentName)) {
            generateProductListComponent(classDeclaration,
                    classDeclaration.getClassTail().getclassElement(), fw);
        } else if ("AppComponent".equals(componentName)) {
            generateAppComponent(classDeclaration, componentInfo, fw);
        } else {
            // Generic component generation
            generateComponent(componentInfo, fw);
        }
    }

    // Specialized AppComponent generation with dynamic elements
    private void generateAppComponent(ClassDeclaration classDeclaration, ComponentInfo componentInfo, FileWriter fw) {
        generate("function " + componentInfo.name + "() {", fw);
        generate("\n", fw);

        // Extract and generate properties dynamically
        List<ClassElement> classElements = classDeclaration.getClassTail().getclassElement();

        for (ClassElement element : classElements) {
            if (element.getStatement() != null &&
                    element.getStatement().getVariableStatement() != null) {

                VariableDeclaration varDecl = element.getStatement()
                        .getVariableStatement().getVariableDeclarationList()
                        .getVariableDeclaration().get(0);

                String propName = varDecl.getIdentifierOrKeyWord().getIdentifier().getIdentifier();

                if (varDecl.getSingleExpression() != null &&
                        !varDecl.getSingleExpression().isEmpty() &&
                        varDecl.getSingleExpression().get(0).getArrayLiteral() != null) {

                    // This is an array property (like products)
                    generateArrayProperty(varDecl, fw);
                } else {
                    // Simple property
                    generate("    this." + propName + " = null;", fw);
                    generate("\n", fw);
                }
            }
        }

        generate("}", fw);
        generate("\n\n", fw);

        // Generate methods dynamically
        generateAppComponentMethods(classDeclaration, componentInfo, fw);
    }

    private void generateArrayProperty(VariableDeclaration varDecl, FileWriter fw) {
        String propName = varDecl.getIdentifierOrKeyWord().getIdentifier().getIdentifier();
        generate("    this." + propName + " = [", fw);
        generate("\n", fw);

        ArrayLiteral arrayLiteral = varDecl.getSingleExpression().get(0).getArrayLiteral();
        if (arrayLiteral != null && arrayLiteral.getElementList() != null) {
            ElementList elementList = arrayLiteral.getElementList();

            // Get the type name for constructor calls
            String typeName = "";
            if (varDecl.getTypeAnnotation() != null) {
                typeName = varDecl.getTypeAnnotation().getType_()
                        .getUnionOrIntersectionOrPrimaryType().getPrimaryType().getPrimaryType().get(0)
                        .getTypeReference().getTypeName().getIdentifier().getIdentifier();
            }

            for (ArrayElement arrayElement : elementList.getArrayElement()) {
                if (arrayElement.getSingleExpression() != null &&
                        arrayElement.getSingleExpression().getObjectLiteral() != null) {

                    generateObjectConstructorCall(arrayElement.getSingleExpression().getObjectLiteral(),
                            typeName, fw);
                }
            }
        }

        generate("    ];", fw);
        generate("\n", fw);
    }

    private void generateObjectConstructorCall(ObjectLiteral objectLiteral, String typeName, FileWriter fw) {
        generate("        new " + typeName + "(", fw);

        List<PropertyAssignment> properties = objectLiteral.getPropertyAssignment();
        for (int i = 0; i < properties.size(); i++) {
            if (i > 0) {
                generate(", ", fw);
            }

            PropertyAssignment property = properties.get(i);
            SingleExpression valueExpression = property.getSingleExpression().get(0);

            if (valueExpression.getLiteral() != null) {
                if (valueExpression.getLiteral().getNumericLiteral() != null) {
                    generate(valueExpression.getLiteral().getNumericLiteral().getDecimalLiteral(), fw);
                } else if (valueExpression.getLiteral().getStringLiteral() != null) {
                    generate(valueExpression.getLiteral().getStringLiteral(), fw);
                }
            }
        }

        generate("),", fw);
        generate("\n", fw);
    }

    private void generateAppComponentMethods(ClassDeclaration classDeclaration, ComponentInfo componentInfo, FileWriter fw) {
        // Extract method information dynamically
        List<ClassElement> classElements = classDeclaration.getClassTail().getclassElement();

        // Generate setChoosenProduct method
        if (classElements.size() >= 2) {
            String choosenProductProp = classElements.get(1).getStatement()
                    .getVariableStatement().getVariableDeclarationList()
                    .getVariableDeclaration().get(0).getIdentifierOrKeyWord()
                    .getIdentifier().getIdentifier();

            String productsProp = classElements.get(0).getStatement()
                    .getVariableStatement().getVariableDeclarationList()
                    .getVariableDeclaration().get(0).getIdentifierOrKeyWord()
                    .getIdentifier().getIdentifier();

            generate(componentInfo.name + ".prototype.setChoosenProduct = function(productId) {", fw);
            generate("\n", fw);
            generate("    this." + choosenProductProp + " = productId;", fw);
            generate("\n", fw);
            generate("    this.render();", fw);
            generate("\n", fw);
            generate("    ProductDetailsComponent.prototype.render(this." + productsProp + "[this." + choosenProductProp + "]);", fw);
            generate("\n", fw);
            generate("};", fw);
            generate("\n\n", fw);
        }

        // Generate render method
        generateAppComponentRenderMethod(classDeclaration, componentInfo, fw);
    }

    private void generateAppComponentRenderMethod(ClassDeclaration classDeclaration, ComponentInfo componentInfo, FileWriter fw) {
        generate(componentInfo.name + ".prototype.render = function() {", fw);
        generate("\n", fw);
        generate("    const container = document.getElementById(" + componentInfo.selector + ");", fw);
        generate("\n", fw);
        generate("    container.innerHTML = '';", fw);
        generate("\n\n", fw);

        // Check for *ngFor directive in template
        if (componentInfo.template != null && hasNgForDirective(componentInfo.template)) {
            String productsProp = "products"; // This could be extracted dynamically
            String buttonTag = "button"; // This could be extracted dynamically
            String divTag = componentInfo.template.tagName;

            generate("    for (const item of this." + productsProp + ") {", fw);
            generate("\n", fw);
            generate("        const " + buttonTag + " = document.createElement('" + buttonTag + "');", fw);
            generate("\n", fw);
            generate("        " + buttonTag + ".onclick = () => this.setChoosenProduct(item.productId);", fw);
            generate("\n\n", fw);
            generate("        const productList = document.createElement('" + divTag + "');", fw);
            generate("\n", fw);
            generate("        productList.innerHTML = ProductListComponent.prototype.render(item);", fw);
            generate("\n", fw);
            generate("        " + buttonTag + ".appendChild(productList);", fw);
            generate("\n\n", fw);
            generate("        container.appendChild(" + buttonTag + ");", fw);
            generate("\n", fw);
            generate("    }", fw);
            generate("\n", fw);
        }

        generate("};", fw);
        generate("\n\n", fw);
    }

    private boolean hasNgForDirective(HtmlElement element) {
        if (element.attributes.containsKey("*ngFor") || element.attributes.containsKey("ngFor")) {
            return true;
        }
        for (HtmlElement child : element.children) {
            if (hasNgForDirective(child)) {
                return true;
            }
        }
        return false;
    }
    private void generateProductDetailsComponent(ClassDeclaration classDeclaration, List<ClassElement> classElements, FileWriter fw) {
        ComponentInfo componentInfo = extractComponentInfo(classDeclaration);

        generate("function " + componentInfo.name + "() {", fw);
        generate("\n", fw);

        // Initialize properties dynamically
        for (String property : componentInfo.properties) {
            generate("    this." + property + " = null;", fw);
            generate("\n", fw);
        }

        generate("}", fw);
        generate("\n\n", fw);

        // Generate render method with dynamic template processing
        generate(componentInfo.name + ".prototype.render = function(item) {", fw);
        generate("\n", fw);
        generate("    this.item = item;", fw);
        generate("\n", fw);
        generate("    const container = document.getElementById(" + componentInfo.selector + ");", fw);
        generate("\n", fw);
        generate("    container.innerHTML = '';", fw);
        generate("\n\n", fw);
        generate("    if (!this.item) {", fw);
        generate("\n", fw);
        generate("        return;", fw);
        generate("\n", fw);
        generate("    }", fw);
        generate("\n", fw);

        // Generate template elements dynamically
        if (componentInfo.template != null) {
            generateHtmlElement(componentInfo.template, "", "    ", fw);
            generate("\n", fw);
            generate("    container.appendChild(" + componentInfo.template.tagName + ");", fw);
            generate("\n", fw);
        }

        generate("};", fw);
        generate("\n\n", fw);
    }

    private void generateProductListComponent(ClassDeclaration classDeclaration, List<ClassElement> classElements, FileWriter fw) {
        ComponentInfo componentInfo = extractComponentInfo(classDeclaration);

        generate("function " + componentInfo.name + "() {", fw);
        generate("\n", fw);

        // Initialize properties dynamically
        for (String property : componentInfo.properties) {
            generate("    this." + property + " = null;", fw);
            generate("\n", fw);
        }

        generate("}", fw);
        generate("\n\n", fw);

        // Generate render method
        String dataParam = componentInfo.properties.isEmpty() ? "data" : componentInfo.properties.get(0);

        generate(componentInfo.name + ".prototype.render = function(" + dataParam + ") {", fw);
        generate("\n", fw);
        generate("    this." + dataParam + " = " + dataParam + ";", fw);
        generate("\n", fw);

        // Generate template elements dynamically
        if (componentInfo.template != null) {
            generateHtmlElement(componentInfo.template, "", "    ", fw);
            generate("\n", fw);
            generate("    return " + componentInfo.template.tagName + ".outerHTML;", fw);
            generate("\n", fw);
        }

        generate("};", fw);
        generate("\n\n", fw);
    }

    private String getComponentSelector(ClassDeclaration classDeclaration) {
        try {
            return classDeclaration.getDecoratorList().getDecorator().get(0)
                    .getDecoratorCallExpression().getArguments().getArgumentList()
                    .getArgument().get(0).getSingleExpression().getObjectLiteral()
                    .getPropertyAssignment().get(0).getSingleExpression().get(0)
                    .getLiteral().getStringLiteral();
        } catch (Exception e) {
            return "'app-root'"; // default selector
        }
    }

    // Keep existing methods for compatibility, but they can now be simplified
    // using the dynamic generation helpers

    private void generateClassElement(ClassElement classElement, String s, FileWriter fw) {
        if (classElement.getStatement() != null) {
            generateStatement(classElement.getStatement(), s, fw);
        }
    }

    private void generateStatement(Statement statement, String s, FileWriter fw) {
        if (statement.getVariableStatement() != null) {
            generateVariableStatement(statement.getVariableStatement(), s, fw);
        }
    }

    private void generateBlock(Block block, String s, FileWriter fw) {
        generate("    constructor(", fw);
        if (block.getStatementList() != null) {
            generateStatementList(block.getStatementList(), s, fw);
        }
        completeInterfaceGeneration(fw);
    }

    private void completeInterfaceGeneration(FileWriter fw) {
        if (isGeneratingInterface && !interfaceProperties.isEmpty()) {
            // Generate all parameters
            for (int i = 0; i < interfaceProperties.size(); i++) {
                if (i > 0) {
                    generate(", ", fw);
                }
                generate(interfaceProperties.get(i), fw);
            }

            // Close constructor and generate body
            generate(") {", fw);
            generate("\n", fw);

            // Generate property assignments
            for (String prop : interfaceProperties) {
                generate("        this." + prop + " = " + prop + ";", fw);
                generate("\n", fw);
            }

            // Close the constructor and class
            generate("    }", fw);
            generate("\n", fw);
            generate("}", fw);
            generate("\n\n", fw);

            // Reset state
            isGeneratingInterface = false;
            interfaceProperties.clear();
            currentInterfaceName = "";
        }
    }

    private void generateStatementList(StatementList statementList, String s, FileWriter fw) {
        List<Statement> statements = statementList.getStatement();
        for (int i = 0; i < statements.size(); i++) {
            if (statements.get(i).getVariableStatement() != null) {
                generateVariableStatement(statements.get(i).getVariableStatement(), s, fw);
            }
        }
    }

    private void generateVariableStatement(VariableStatement variableStatement, String s, FileWriter fw) {
        if (variableStatement.getVariableDeclarationList() != null) {
            generateVariableDeclarationList(variableStatement.getVariableDeclarationList(), s, fw, "", "", false);
        }
    }

    private void generateVariableDeclarationList(VariableDeclarationList variableDeclarationList, String s, FileWriter fw, String name, String attribute, boolean hasContent) {
        if (variableDeclarationList.getVariableDeclaration() != null) {
            List<VariableDeclaration> variableDeclarations = variableDeclarationList.getVariableDeclaration();
            for (int i = 0; i < variableDeclarations.size(); i++) {
                generateVariableDeclaration(variableDeclarations.get(i), s, fw, name, attribute, hasContent);
            }
        }
    }

    private void generateVariableDeclaration(VariableDeclaration variableDeclaration, String s, FileWriter fw, String name, String attribute, Boolean hasContent) {
        if (variableDeclaration.getIdentifierOrKeyWord() != null) {
            String propName = variableDeclaration.getIdentifierOrKeyWord().getIdentifier().getIdentifier();
            if (isGeneratingInterface) {
                // Store the property name but don't generate it yet
                interfaceProperties.add(propName);
            } else {
                // Regular variable declaration (not part of interface)
                generate(propName + ", ", fw);
            }
        }
        for (int i = 0; i < variableDeclaration.getSingleExpression().size(); i++) {
            if (variableDeclaration.getSingleExpression() != null) {
                generateSingleExpression(variableDeclaration.getSingleExpression().get(i), s, fw, "", "", false);
            }
        }
    }

    private void generateExpressionStatement(ExpressionStatement expressionStatement, String s, FileWriter fw) {
        if (expressionStatement.getExpressionSequence() != null) {
            generateExpressionSequence(expressionStatement.getExpressionSequence(), s, fw, "", "", false);
        }
    }

    private void generateExpressionSequence(ExpressionSequence expressionSequence, String s, FileWriter fw, String name, String attribute, boolean hasContent) {
        if (expressionSequence.getSingleExpression() != null) {
            List<SingleExpression> singleExpressions = expressionSequence.getSingleExpression();
            for (int i = 0; i < singleExpressions.size(); i++) {
                generateSingleExpression(singleExpressions.get(i), s, fw, name, attribute, hasContent);
            }
        }
    }

    private void generateSingleExpression(SingleExpression singleExpression, String s, FileWriter fw, String name, String attribute, boolean hasContent) {
        String test = "";
        if (singleExpression.getSingleExpression() != null && singleExpression.getExpressionSequence() != null && !name.isEmpty()) {
            generate("(", fw);
            hasSquareBracket = true;
        }

        // Handle interface declaration pattern: interface Product
        if (singleExpression.getIdentifierName() != null && singleExpression.getSingleExpression() != null) {
            IdentifierName identifierName = singleExpression.getIdentifierName();
            SingleExpression nextExpression = singleExpression.getSingleExpression();

            // Check if this is an interface declaration: interface Product
            if (identifierName.getReservedWord() != null &&
                    identifierName.getReservedWord().getKeyword() != null &&
                    "interface".equals(identifierName.getReservedWord().getKeyword().getInterface())) {

                // This is an interface keyword, now check the next expression for the interface name
                if (nextExpression.getIdentifierName() != null &&
                        nextExpression.getIdentifierName().getIdentifier() != null) {

                    // Found interface declaration: interface Product
                    currentInterfaceName = nextExpression.getIdentifierName().getIdentifier().getIdentifier();
                    isGeneratingInterface = true;
                    interfaceProperties.clear(); // Reset properties list
                    generate("class " + currentInterfaceName + " {", fw);
                    generate("\n", fw);
                }
            }

            if (singleExpression.getIdentifierName().getReservedWord() == null && hasContent) {
                generate(name, fw);
            }

            if (nextExpression.getIdentifier() != null && singleExpression.getIdentifierName().getIdentifier() == null) {
                if (hasContent) {
                    generate(".textContent = ", fw);
                } else {
                    generate("", fw);
                    attribute = "";
                }
            }
        }
        if (singleExpression.getArrayLiteral() != null) {
            generateArrayLiteral(singleExpression.getArrayLiteral(), s, fw);
        }
        if (singleExpression.getObjectLiteral() != null) {
            generateObjectLiteral(singleExpression.getObjectLiteral(), s, fw);
        }
        if (singleExpression.getLiteral() != null) {
            generateLiteral(singleExpression.getLiteral(), s, fw);
        }
    }

    private void generateLiteral(Literal literal, String s, FileWriter fw) {
        if (literal.getNumericLiteral() != null) {
            generate(literal.getNumericLiteral().getDecimalLiteral(), fw);
        }
        if (literal.getStringLiteral() != null) {
            generate(literal.getStringLiteral(), fw);
        }
    }

    private void generateObjectLiteral(ObjectLiteral objectLiteral, String s, FileWriter fw) {
        for (int i = 0; i <= objectLiteral.getPropertyAssignment().size(); i++) {
            if (objectLiteral.getPropertyAssignment() != null) {
                generatePropertyAssignment(objectLiteral.getPropertyAssignment().get(i), s, fw);
            }
        }
    }

    private void generatePropertyAssignment(PropertyAssignment propertyAssignment, String s, FileWriter fw) {
        for (int i = 0; i <= propertyAssignment.getSingleExpression().size(); i++) {
            if (propertyAssignment.getSingleExpression() != null) {
                generateSingleExpression(propertyAssignment.getSingleExpression().get(i), s, fw, "", "", false);
            }
        }
    }

    private void generateArrayLiteral(ArrayLiteral arrayLiteral, String s, FileWriter fw) {
        if (arrayLiteral.getElementList() != null) {
            generateElementList(arrayLiteral.getElementList(), s, fw);
        }
    }

    private void generateElementList(ElementList elementList, String s, FileWriter fw) {
        for (int i = 0; i <= elementList.getArrayElement().size(); i++) {
            if (elementList.getArrayElement() != null) {
                generateArrayElement(elementList.getArrayElement().get(i), s, fw);
            }
        }
    }

    private void generateArrayElement(ArrayElement arrayElement, String s, FileWriter fw) {
        if (arrayElement.getSingleExpression() != null) {
            generateSingleExpression(arrayElement.getSingleExpression(), s, fw, "", "", false);
        }
    }

    private void generateIdentifierName(IdentifierName identifierName, String s, FileWriter fw, String name) {
        if (identifierName.getReservedWord() != null) {
            generateReservedWord(identifierName.getReservedWord(), s, fw, name);
        }
        if (identifierName.getIdentifier() != null) {
            generateIdentifier(identifierName.getIdentifier(), s, fw, name);
        }
    }

    private void generateReservedWord(ReservedWord reservedWord, String s, FileWriter fw, String name) {
        if (reservedWord.getKeyword() != null) {
            generateKeyWord(reservedWord.getKeyword(), s, fw, name);
        }
    }

    private void generateKeyWord(Keyword keyword, String s, FileWriter fw, String name) {
        if (keyword.getInterface() != null) {
            generate(keyword.getInterface(), fw);
        }
    }

    private void generateIdentifier(Identifier identifier, String s, FileWriter fw, String name) {
        if (identifier.getIdentifier() != null) {
            generate(identifier.getIdentifier(), fw);
        }
    }
}