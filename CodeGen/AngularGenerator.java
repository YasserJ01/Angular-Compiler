package CodeGen;

import AST.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.File;

import org.apache.commons.io.FileUtils;

public class AngularGenerator {
    int counter = 0;
    String rootName = "";
    boolean firstComponent = true;
    boolean isVisitUseState = true;
    boolean noRepeatDot = false;
    boolean hasMap = false;
    boolean hasSquareBracket = false;
    String rootComponent = "";
    boolean onlyOne = true;
    boolean standard = false;
    int sizeOfObject = 0;
    int counterForObject = 0;
    boolean haveProps = false;
    Map<String, String> map = new HashMap<>();
    private boolean isGeneratingInterface = false;
    private List<String> interfaceProperties = new ArrayList<>();
    private String currentInterfaceName = "";


    public void generate(Program program) {
        String Space = "\t\t";

        File source = new File("Result\\style.css");
        File dest = new File("Result\\generate.css");
        try {
            FileUtils.copyFile(source, dest);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        try {
            FileWriter fw = new FileWriter("Result\\GeneratedCode.html");
            generate("<!DOCTYPE html>", fw);
            generate("\n<html>", fw);
            generate("\n<head>", fw);
            generate("\n<title>React App</title>", fw);
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
            generate("        const app = new AppComponent();\n",fw);
            generate("        app.render();\n",fw);
            generate("        new ProductDetailsComponent();\n",fw);
            generate("        new ProductListComponent();\n",fw);
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

    private void generateClassDeclaration(ClassDeclaration classDeclaration, String s, FileWriter fw) {
        if (classDeclaration.getIdentifier() != null && classDeclaration.getClassTail() != null) {
            generate("function " + classDeclaration.getIdentifier().getIdentifier() + "() {", fw);
            generate("\n", fw);
            String componentName = classDeclaration.getIdentifier().getIdentifier();
            List<ClassElement> classElements = classDeclaration.getClassTail().getclassElement();

            if ("ProductDetailsComponent".equals(componentName)) {
                generateProductDetailsComponent(classDeclaration, classElements, fw);
            }else if ("ProductListComponent".equals(componentName)){
                generateProductListComponent(classDeclaration, classElements, fw);
            }else {

                VariableDeclaration productsVarDecl = classDeclaration.getClassTail().getclassElement().get(0)
                        .getStatement().getVariableStatement().getVariableDeclarationList()
                        .getVariableDeclaration().get(0);

                generate("    this." + productsVarDecl.getIdentifierOrKeyWord().getIdentifier().getIdentifier() + " = [", fw);
                generate("\n", fw);

                // Get the array literal containing all Product instances
                ArrayLiteral productsArray = productsVarDecl.getSingleExpression().get(0).getArrayLiteral();
                ElementList elementList = productsArray.getElementList();

                // Get the primary type (should be "Product")
                String primaryType = productsVarDecl.getTypeAnnotation().getType_()
                        .getUnionOrIntersectionOrPrimaryType().getPrimaryType().getPrimaryType().get(0)
                        .getTypeReference().getTypeName().getIdentifier().getIdentifier();

                // Loop through all array elements (each new Product() instance)
                for (ArrayElement arrayElement : elementList.getArrayElement()) {
                    if (arrayElement.getSingleExpression() != null &&
                            arrayElement.getSingleExpression().getObjectLiteral() != null) {

                        ObjectLiteral productObject = arrayElement.getSingleExpression().getObjectLiteral();
                        List<PropertyAssignment> properties = productObject.getPropertyAssignment();

                        // Generate: new Product(param1, param2, param3, param4, param5)
                        generate("        new " + primaryType + "(", fw);

                        // Generate all parameters in order
                        for (int i = 0; i < properties.size(); i++) {
                            PropertyAssignment property = properties.get(i);

                            if (i > 0) {
                                generate(", ", fw); // Add comma between parameters
                            }

                            // Extract the value based on its type
                            SingleExpression valueExpression = property.getSingleExpression().get(0);
                            if (valueExpression.getLiteral() != null) {
                                if (valueExpression.getLiteral().getNumericLiteral() != null) {
                                    // Numeric value
                                    generate(valueExpression.getLiteral().getNumericLiteral().getDecimalLiteral(), fw);
                                } else if (valueExpression.getLiteral().getStringLiteral() != null) {
                                    // String value - add quotes
                                    generate(valueExpression.getLiteral().getStringLiteral(), fw);
                                }
                            }
                        }

                        generate("),", fw);
                        generate("\n", fw);
                    }
                }

                //choosenproduct
                String proprtyName = classDeclaration.getClassTail().getclassElement().get(1).getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().get(0).getIdentifierOrKeyWord().getIdentifier().getIdentifier();
                //products
                String proprtyName1 = classDeclaration.getClassTail().getclassElement().get(0).getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().get(0).getIdentifierOrKeyWord().getIdentifier().getIdentifier();
                //productId
                String proprtyAssignemnt1 = classDeclaration.getClassTail().getclassElement().get(0).getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().get(0).getSingleExpression().get(0).getArrayLiteral().getElementList().getArrayElement().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(0).getPropertyName().getIdentifierName().getIdentifier().getIdentifier();
                //div
                String htmlTagStartName = classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlTagStartName().getHtmlTagName().getIdentifier();
                //button
                String htmlTagStartName1 = classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(0).getHtmlTagStartName().getHtmlTagName().getIdentifier();
                //ngfor
                String angularDirective = classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(0).getHtmlAttribute().get(0).getHtmlAttributeName().getAngularDirective();
                generate("    ];", fw);
                generate("    ];", fw);
                generate("\n", fw);
                generate("     this." + proprtyName + " = " + classDeclaration.getClassTail().getclassElement().get(1).getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().get(0).getSingleExpression().get(0).getSingleExpression().getIdentifierName().getReservedWord().getNullLiteral() + "; \n", fw);
                generate("}", fw);
                generate("\n\n", fw);

                generate(classDeclaration.getIdentifier().getIdentifier() + ".prototype.setChoosenProduct = " + "function(" + proprtyAssignemnt1 + ") { \n ", fw);
                generate("     this." + proprtyName + " = " + proprtyAssignemnt1 + "; \n", fw);
                generate("     this.render(); \n", fw);
                generate("     ProductDetailsComponent.prototype.render(this." + proprtyName1 + "[this." + proprtyName + "]); \n", fw);
                generate("}; \n", fw);
                generate("\n", fw);

                // Generate the render method
                generate(classDeclaration.getIdentifier().getIdentifier() + ".prototype.render = function() {\n", fw);
                generate("    const container = document.getElementById(" + classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(0).getSingleExpression().get(0).getLiteral().getStringLiteral() + "); \n", fw);
                generate("    container.innerHTML = ''; \n", fw);
                generate("\n", fw);

                if (angularDirective != null) {
                    generate("    for (const item of this." + proprtyName1 + ") {\n", fw);
                    generate("        const " + htmlTagStartName1 + " = document.createElement('" + htmlTagStartName1 + "');\n", fw);
                    generate("\n", fw);
                    generate("        " + htmlTagStartName1 + ".onclick = () => this." + proprtyName + "(item." + proprtyAssignemnt1 + ");\n", fw);
                    generate("\n", fw);
                    generate("        // <app-product-list [data]=\"item\"></app-product-list> conversion\n", fw);
                    generate("        const productList = document.createElement('" + htmlTagStartName + "');\n", fw);
                    generate("        productList.innerHTML = ProductListComponent.prototype.render(item);\n", fw);
                    generate("        " + htmlTagStartName1 + ".appendChild(productList);\n", fw);
                    generate("\n", fw);
                    generate("        container.appendChild(" + htmlTagStartName1 + ");\n", fw);
                    generate("    }\n", fw);
                    generate("};\n", fw);
                }

            }
        }
    }

    private void generateProductDetailsComponent(ClassDeclaration classDeclaration, List<ClassElement> classElements, FileWriter fw) {
        //ngIf*
        String angularDirective = classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlAttribute().get(1).getHtmlAttributeName().getAngularDirective();
        //item
        String item=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(0).getHtmlContent().getInterpolationExpressions().get(0).getHtmlSequence().getPropertyName().getIdentifierName().getIdentifier().getIdentifier();

        // Initialize the component
        generate("    this."+item+" = null;", fw);
        generate("\n", fw);
        generate("}", fw);
        generate("\n\n", fw);

        // Generate render method
        String selector = getComponentSelector(classDeclaration);

        generate("ProductDetailsComponent.prototype.render = function("+item+") {", fw);
        generate("\n", fw);
        generate("    this."+item+" = "+item+";", fw);
        generate("\n", fw);
        generate("    const container = document.getElementById(" + selector + ");", fw);
        generate("\n", fw);
        generate("    container.innerHTML = '';", fw);
        generate("\n\n", fw);
        generate("    if (!this."+item+") {", fw);
        generate("\n", fw);
        generate("        return;", fw);
        generate("\n", fw);
        generate("    }", fw);
        generate("\n", fw);
        String htmlTagStartName = classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlTagStartName().getHtmlTagName().getIdentifier();
        String className = classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlAttribute().get(0).getHtmlAttributeValue().getStringLiteral();
        //h1
        String htmlTagStartName1=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(0).getHtmlTagStartName().getHtmlTagName().getIdentifier();
        //img
        String htmlTagStartName2=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(1).getHtmlTagName().getIdentifier();
        //src
        String htmlAttribute=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(1).getHtmlAttribute().get(0).getHtmlAttributeName().getIdentifiers().get(0);
        //price
        String htmlAttribute1=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(2).getHtmlContent().getInterpolationExpressions().get(0).getHtmlSequence().getIdentifierName().getIdentifier().getIdentifier();
        //details
        String htmlAtrribute2=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(3).getHtmlContent().getInterpolationExpressions().get(0).getHtmlSequence().getIdentifierName().getIdentifier().getIdentifier();
        //p number 1
        String htmlTagName=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(2).getHtmlTagStartName().getHtmlTagName().getIdentifier();
        //p number 2
        String htmlTagName1=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(3).getHtmlTagStartName().getHtmlTagName().getIdentifier();

        if (angularDirective != null) {
            if (htmlTagStartName != null) {
                generate("    const " + htmlTagStartName + " = document.createElement('" + htmlTagStartName + "');", fw);
                generate("\n", fw);
                generate("    " + htmlTagStartName + ".className = " + className + ";", fw);
                generate("\n", fw);

            }
        }
        String interpolationExpression = classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(0).getHtmlContent().getInterpolationExpressions().toString()/*getHtmlAttribute().get(0).getHtmlAttributeName().getAngularDirective()*/;
        if (interpolationExpression != null) {
            generate("    const "+htmlTagStartName1+" = document.createElement('"+htmlTagStartName1+"');", fw);
            generate("\n", fw);
            generate("    "+htmlTagStartName1+".textContent = this."+classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(0).getHtmlContent().getInterpolationExpressions().get(0).getHtmlSequence().getPropertyName().getIdentifierName().getIdentifier().getIdentifier()+"."+classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(0).getHtmlContent().getInterpolationExpressions().get(0).getHtmlSequence().getIdentifierName().getIdentifier().getIdentifier()+";", fw);
            generate("\n", fw);
        }
        //name
        String name=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(0).getHtmlContent().getInterpolationExpressions().get(0).getHtmlSequence().getIdentifierName().getIdentifier().getIdentifier();
        if (htmlTagStartName2 != null) {
            if (htmlAttribute != null) {
                generate("    const "+htmlTagStartName2+" = document.createElement('"+htmlTagStartName2+"');", fw);
                generate("\n", fw);
                generate("    "+htmlTagStartName2+"."+htmlAttribute+" = this."+item+".imgSrc;", fw);
                generate("\n", fw);
                generate("    "+htmlTagStartName2+".alt = this."+item+"."+name+";", fw);
                generate("\n\n", fw);
            }
        }
        generate("\n", fw);
        generate("    const "+htmlAttribute1+" = document.createElement('"+htmlTagName+"');", fw);
        generate("\n", fw);
        generate("    "+htmlAttribute1+".textContent = `Price: $${this."+item+"."+htmlAttribute1+"}`;", fw);
        generate("\n\n", fw);

        generate("    // {{item.details}} conversion", fw);
        generate("\n", fw);
        generate("    const "+htmlAtrribute2+" = document.createElement('"+htmlTagName1+"');", fw);
        generate("\n", fw);
        generate("    "+htmlAtrribute2+".textContent = this."+item+"."+htmlAtrribute2+";", fw);
        generate("\n\n", fw);

        generate("    "+htmlTagStartName+".appendChild("+htmlTagStartName1+");", fw);
        generate("\n", fw);
        generate("    "+htmlTagStartName+".appendChild("+htmlTagStartName2+");", fw);
        generate("\n", fw);
        generate("    "+htmlTagStartName+".appendChild("+htmlAttribute1+");", fw);
        generate("\n", fw);
        generate("    "+htmlTagStartName+".appendChild("+htmlAtrribute2+");", fw);
        generate("\n\n", fw);
        generate("    container.appendChild("+htmlTagStartName+");", fw);
        generate("\n", fw);
        generate("};", fw);
        generate("\n", fw);

    }
    //TODO: h1,img,div in one "for" loop maybe ?
    //TODO: one sample for all html elements maybe ?
    //TODO: one sample for components in one for loop maybe ?
    //TODO: one sample for html contents maybe ?
    //TODO: implement the html attribute,tag of the same html content/element maybe ?

    private void generateProductListComponent(ClassDeclaration classDeclaration, List<ClassElement> classElements, FileWriter fw) {
        //ProductListComponent
        String componentClass = classDeclaration.getIdentifier().getIdentifier();
        //data
        String componentClassProperty = classDeclaration.getClassTail().getclassElement().get(0).getPropertyMemberDeclaration().getPropertyName().getIdentifierName().getIdentifier().getIdentifier();
        //TODO: null statement
        generate("    this."+componentClassProperty+" = null;", fw);
        generate("\n", fw);
        generate("}", fw);
        generate("\n\n", fw);

        //div
        String htmlTagStartName = classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlTagStartName().getHtmlTagName().getIdentifier();
        //h1
        String htmlTagStartName1=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(0).getHtmlTagStartName().getHtmlTagName().getIdentifier();
        //img
        String htmlTagName=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(1).getHtmlTagName().getIdentifier();
        //src
        String htmlAttribute=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(1).getHtmlAttribute().get(0).getHtmlAttributeName().getIdentifiers().get(0);
        //src
        String htmlAttributeValue=classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getHtmlElement().getHtmlContent().getHtmlElement().get(1).getHtmlAttribute().get(0).getHtmlAttributeValue().getStringLiteral();

        generate(componentClass+".prototype.render = function("+componentClassProperty+") {", fw);
        generate("\n", fw);
        generate("    this."+componentClassProperty+" = "+componentClassProperty+";", fw);
        generate("\n", fw);
        generate("    const "+htmlTagStartName+" = document.createElement('"+htmlTagStartName+"');", fw);
        generate("\n\n", fw);
        generate("\n", fw);
        generate("    const "+htmlTagStartName1+" = document.createElement('"+htmlTagStartName1+"');", fw);
        generate("\n", fw);
        generate("    "+htmlTagStartName1+".textContent = this."+componentClassProperty+".name;", fw);
        generate("\n\n", fw);

        generate("\n", fw);
        generate("    const "+htmlTagName+" = document.createElement('"+htmlTagName+"');", fw);
        generate("\n", fw);
        //TODO : CUT THE " " FROM THE imgSrc STRING
        generate("    "+htmlTagName+"."+htmlAttribute+" = this."+componentClassProperty+".imgSrc;", fw);
        generate("\n", fw);
        generate("    "+htmlTagName+".alt = this."+componentClassProperty+".name;", fw);
        generate("\n\n", fw);

        generate("    "+htmlTagStartName+".appendChild("+htmlTagStartName1+");", fw);
        generate("\n", fw);
        generate("    "+htmlTagStartName+".appendChild("+htmlTagName+");", fw);
        generate("\n\n", fw);

        generate("    return "+htmlTagStartName+".outerHTML;", fw);
        generate("\n", fw);
        generate("};", fw);
        generate("\n", fw);
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
//        generate("    constructor(",fw);
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
//                    String interfaceName = nextExpression.getIdentifierName().getIdentifier().getIdentifier();
                    currentInterfaceName = nextExpression.getIdentifierName().getIdentifier().getIdentifier();
                    isGeneratingInterface = true;
                    interfaceProperties.clear(); // Reset properties list
                    generate("class " + currentInterfaceName + " {", fw);
                    generate("\n", fw);
//                    generate("    constructor(",fw);
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