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
            generate("\n<div id=\"app\"></div>\n\n", fw);
            generate("\n<script>\n", fw);
            if (program.getSourceElements() != null) {
                generateSourceElement(program.getSourceElements(), Space, fw);
            }
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

            List<ClassElement> classElements = classDeclaration.getClassTail().getclassElement();

            // Get the variable declaration for products array
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
                                generate(valueExpression.getLiteral().getStringLiteral() , fw);
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
            generate("    ];", fw);
            generate("\n", fw);
            generate("     this." + proprtyName + " = " + classDeclaration.getClassTail().getclassElement().get(1).getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().get(0).getSingleExpression().get(0).getSingleExpression().getIdentifierName().getReservedWord().getNullLiteral() + "; \n" ,fw);
            generate("}", fw);
            generate("\n\n", fw);
            generate(classDeclaration.getIdentifier().getIdentifier()+"."+proprtyName+" = "+"function("+proprtyAssignemnt1+") { \n ",fw);
            generate("     this."+ proprtyName + " = "+proprtyAssignemnt1+"; \n",fw);
            generate("     this.render(); \n",fw);
            generate("     ProductDetailsComponent.prototype.render(this."+proprtyName1+"[this."+proprtyAssignemnt1+"]); \n",fw);
            generate("}; \n",fw);
            generate(classDeclaration.getIdentifier().getIdentifier()+".prototype.render = function() {\n",fw);
            generate("    const container = document.getElementById("+classDeclaration.getDecoratorList().getDecorator().get(0).getDecoratorCallExpression().getArguments().getArgumentList().getArgument().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(0).getSingleExpression().get(0).getLiteral().getStringLiteral()+"); \n",fw);
            generate("    container.innerHTML = ''; \n",fw);

        }
    }

//    private void generateClassDeclaration(ClassDeclaration classDeclaration, String s, FileWriter fw) {
//        if (classDeclaration.getIdentifier() != null && classDeclaration.getClassTail() != null) {
//            generate("function " + classDeclaration.getIdentifier().getIdentifier() + "() {", fw);
//            generate("\n", fw);
//            List<ClassElement> classElements = classDeclaration.getClassTail().getclassElement();
//            generate("    this." + classDeclaration.getClassTail().getclassElement().get(0).getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().get(0).getIdentifierOrKeyWord().getIdentifier().getIdentifier() + " = [", fw);
//            generate("\n", fw);
//            String primaryType = classDeclaration.getClassTail().getclassElement().get(0).getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().get(0).getTypeAnnotation().getType_().getUnionOrIntersectionOrPrimaryType().getPrimaryType().getPrimaryType().get(0).getTypeReference().getTypeName().getIdentifier().getIdentifier();
//            String numberLiteral = classDeclaration.getClassTail().getclassElement().get(0).getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().get(0).getSingleExpression().get(0).getArrayLiteral().getElementList().getArrayElement().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(0).getSingleExpression().get(0).getLiteral().getNumericLiteral().getDecimalLiteral();
//            String stringLiteral = classDeclaration.getClassTail().getclassElement().get(0).getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().get(0).getSingleExpression().get(0).getArrayLiteral().getElementList().getArrayElement().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(1).getSingleExpression().get(0).getLiteral().getStringLiteral();
//            String stringLiteral2 = classDeclaration.getClassTail().getclassElement().get(0).getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().get(0).getSingleExpression().get(0).getArrayLiteral().getElementList().getArrayElement().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(2).getSingleExpression().get(0).getLiteral().getStringLiteral();
//            String stringLiteral3 = classDeclaration.getClassTail().getclassElement().get(0).getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().get(0).getSingleExpression().get(0).getArrayLiteral().getElementList().getArrayElement().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(3).getSingleExpression().get(0).getLiteral().getStringLiteral();
//            String stringLiteral4 = classDeclaration.getClassTail().getclassElement().get(0).getStatement().getVariableStatement().getVariableDeclarationList().getVariableDeclaration().get(0).getSingleExpression().get(0).getArrayLiteral().getElementList().getArrayElement().get(0).getSingleExpression().getObjectLiteral().getPropertyAssignment().get(4).getSingleExpression().get(0).getLiteral().getStringLiteral();
//
////                if (classDeclaration.getClassTail().getclassElement() != null) {
////                    generateClassElement(classDeclaration.getClassTail().getclassElement().get(0), s, fw);
////                }
//                generate("        new " + primaryType + "(" + numberLiteral + " , " + stringLiteral + stringLiteral2 + stringLiteral3 + stringLiteral4 +  ")," ,fw);
//                generate("\n", fw);
//            }
//            generate("    ];", fw);
//        }


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

    //    private void generateSingleExpression(SingleExpression singleExpression, String s, FileWriter fw , String name,String attribute,boolean hasContent) {
//        String test = "";
//        if (singleExpression.getSingleExpression() != null && singleExpression.getExpressionSequence() != null && !name.isEmpty()) {
//            generate("(",fw);
//            hasSquareBracket = true;
//        }
//
//        if (singleExpression.getSingleExpression() != null && singleExpression.getIdentifierName() != null) {
//            if (singleExpression.getIdentifierName().getReservedWord() == null && hasContent){
//                generate(name,fw);
//            }
//            SingleExpression singleExpressions = singleExpression.getSingleExpression();
//
//                if (singleExpressions.getIdentifier() != null && singleExpression.getIdentifierName().getIdentifier() == null) {
//                    if (hasContent) {
//                        generate(".textContent = ", fw);
//                    }
//                    else {
//                        generate("",fw);
//                        attribute = "";
//                    }
//                }
//        }
//
//    }
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