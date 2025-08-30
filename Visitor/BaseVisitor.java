package Visitor;

import AST.*;

import SymbolTable.SymbolTable;
import app.Main;
import gen.ParserFile;
import gen.ParserFileBaseVisitor;
import SymbolTable.Row;
import SemanticCheck.SemanticCheck;

import java.util.ArrayList;
import java.util.List;


public class BaseVisitor extends ParserFileBaseVisitor {

    SymbolTable symbolTable = Main.st;


    @Override
    public Program visitProgram(ParserFile.ProgramContext ctx) {
        this.symbolTable.addoutside();
        Program program = new Program();
        if (ctx.sourceElements() != null) {
            program.setSourceElements(visitSourceElements(ctx.sourceElements()));
        }

        System.out.println("SymbolTable");
        System.out.println("..........................................................");

        this.symbolTable.printSymbolTable();
        System.out.println("===========================================================");


        SemanticCheck semanticCheck = new SemanticCheck();

        //  semanticCheck.setSymbolTable(this.symbolTable);
        semanticCheck.Check_PropertyMatching(this.symbolTable);
        semanticCheck.Check_ifDuplicate_class(this.symbolTable);
        semanticCheck.Check_TemplateProperty(this.symbolTable);
        semanticCheck.Check_ConflictingTemplateProperties(this.symbolTable);
//        semanticCheck.Check_ComponentImport(this.symbolTable);
        semanticCheck.Check_DecoratorImports(this.symbolTable);
        semanticCheck.Check_InputOutputConflict(this.symbolTable);
        semanticCheck.printErrorsWithContext();


//        semanticCheck.printErrors();

        return program;
    }


    @Override
    public SourceElements visitSourceElements(ParserFile.SourceElementsContext ctx) {
        SourceElements sourceElement = new SourceElements();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement() != null) {
                sourceElement.getStatement().add(visitStatement(ctx.statement(i)));
            }
        }
        return sourceElement;
    }


    @Override
    public HtmlTagClosingName visitHtmlTagClosingName(ParserFile.HtmlTagClosingNameContext ctx) {
        HtmlTagClosingName htmlTagClosingName = new HtmlTagClosingName();
        if (ctx.htmlTagName() != null) {
            htmlTagClosingName.setHtmlTagName(visitHtmlTagName(ctx.htmlTagName()));
        }
        return htmlTagClosingName;

    }

    @Override
    public HtmlAttribute visitHtmlAttribute(ParserFile.HtmlAttributeContext ctx) {
        HtmlAttribute htmlAttribute = new HtmlAttribute();
        if (ctx.AngularDirective() != null) {
            htmlAttribute.setAngularDirective(ctx.AngularDirective().getText());
        }
        if (ctx.propertyName() != null) {
            htmlAttribute.setPropertyName(visitPropertyName(ctx.propertyName()));
            int scopeId = this.symbolTable.getCurrentScopeID();
            Row s1 = new Row();
            s1.setDatatype("Template Property");
            s1.setKey(ctx.propertyName().getText());
            s1.setLineNumber(ctx.propertyName().getStart().getLine());
            s1.setScope(this.symbolTable.getScopeByID(scopeId));
            this.symbolTable.getScopeByID(scopeId).setRows(s1);

        }
        if (ctx.htmlAttributeName() != null) {
            htmlAttribute.setHtmlAttributeName(visitHtmlAttributeName(ctx.htmlAttributeName()));
        }
        if (ctx.Class() != null) {
            htmlAttribute.setClasse(ctx.Class().getText());
        }
        if (ctx.htmlAttributeValue() != null) {
            htmlAttribute.setHtmlAttributeValue(visitHtmlAttributeValue(ctx.htmlAttributeValue()));
        }
        return htmlAttribute;
    }

    @Override
    public HtmlElement visitHtmlElement(ParserFile.HtmlElementContext ctx) {
        HtmlElement htmlElement = new HtmlElement();
        if (ctx.htmlTagStartName() != null) {
            htmlElement.setHtmlTagStartName(visitHtmlTagStartName(ctx.htmlTagStartName()));
        }
        for (int i = 0; i < ctx.htmlAttribute().size(); i++) {
            htmlElement.getHtmlAttribute().add(visitHtmlAttribute(ctx.htmlAttribute(i)));
        }
        if (ctx.htmlContent() != null) {
            htmlElement.setHtmlContent(visitHtmlContent(ctx.htmlContent()));
        }
        if (ctx.htmlTagName() != null) {
            htmlElement.setHtmlTagName(visitHtmlTagName(ctx.htmlTagName()));

        }
        if (ctx.htmlTagClosingName() != null) {
            htmlElement.setHtmlTagClosingName(visitHtmlTagClosingName(ctx.htmlTagClosingName()));
        }
        return htmlElement;

    }

    @Override
    public HtmlContent visitHtmlContent(ParserFile.HtmlContentContext ctx) {
        HtmlContent htmlContent = new HtmlContent();
        for (int i = 0; i < ctx.htmlElement().size(); i++) {
            if (ctx.htmlElement() != null) {
                htmlContent.getHtmlElement().add(visitHtmlElement(ctx.htmlElement(i)));
            }
        }
        for (int i = 0; i < ctx.interpolationExpression().size(); i++) {
            if (ctx.interpolationExpression() != null) {
                htmlContent.getInterpolationExpressions().add(visitInterpolationExpression(ctx.interpolationExpression(i)));
            }
        }
        return htmlContent;
    }

    @Override
    public ObjectExpressionSequence visitObjectExpressionSequence(ParserFile.ObjectExpressionSequenceContext ctx) {
        ObjectExpressionSequence objectExpressionSequence = new ObjectExpressionSequence();
        if (ctx.expressionSequence() != null) {
            objectExpressionSequence.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        }
        return objectExpressionSequence;
    }

    @Override
    public HtmlSequence visitHtmlSequence(ParserFile.HtmlSequenceContext ctx) {
        HtmlSequence htmlSequence = new HtmlSequence();
        if (ctx.propertyName() != null) {
            htmlSequence.setPropertyName(visitPropertyName(ctx.propertyName()));
        }
        if (ctx.identifierName() != null) {
            htmlSequence.setIdentifierName(visitIdentifierName(ctx.identifierName()));
        }
        return htmlSequence;

    }

    @Override
    public InterpolationExpression visitInterpolationExpression(ParserFile.InterpolationExpressionContext ctx) {
        InterpolationExpression interpolationExpression = new InterpolationExpression();
        if (ctx.htmlSequence() != null) {
            interpolationExpression.setHtmlSequence(visitHtmlSequence(ctx.htmlSequence()));
        }
        if (ctx.DOUBLE_L_CURLY() != null) {
            interpolationExpression.setDOUBLE_L_CURLY(ctx.DOUBLE_L_CURLY().getText());
        }
        if (ctx.DOUBLE_R_CURLY() != null) {
            interpolationExpression.setDOUBLE_R_CURLY(ctx.DOUBLE_R_CURLY().getText());
        }
        return interpolationExpression;
    }

    @Override
    public HtmlAttributeValue visitHtmlAttributeValue(ParserFile.HtmlAttributeValueContext ctx) {
        HtmlAttributeValue htmlAttributeValue = new HtmlAttributeValue();
        if (ctx.AttributeValue() != null) {
            htmlAttributeValue.setAttributeValue(ctx.AttributeValue().getText());
        }
        if (ctx.StringLiteral() != null) {
            htmlAttributeValue.setStringLiteral(ctx.StringLiteral().getText());

        }
        if (ctx.objectExpressionSequence() != null) {
            htmlAttributeValue.setObjectExpressionSequence(visitObjectExpressionSequence(ctx.objectExpressionSequence()));
        }
        if (ctx.interpolationExpression() != null) {
            htmlAttributeValue.setInterpolationExpression(visitInterpolationExpression(ctx.interpolationExpression()));
        }
        return htmlAttributeValue;
    }

    @Override
    public HtmlAttributeName visitHtmlAttributeName(ParserFile.HtmlAttributeNameContext ctx) {
        HtmlAttributeName htmlAttributeName = new HtmlAttributeName();
        if (ctx.AngularDirective() != null) {
            htmlAttributeName.setAngularDirective(ctx.AngularDirective().getText());
        }
        if (ctx.TagName() != null) {
            htmlAttributeName.setTagName(ctx.TagName().getText());
        }
        for (int i = 0; i < ctx.Identifier().size(); i++) {
            if (ctx.Identifier(i) != null) {
                htmlAttributeName.getIdentifiers().add(String.valueOf(ctx.Identifier().get(i)));
            }
        }

        return htmlAttributeName;
    }

    @Override
    public HtmlTagStartName visitHtmlTagStartName(ParserFile.HtmlTagStartNameContext ctx) {
        HtmlTagStartName htmlTagStartName = new HtmlTagStartName();
        if (ctx.htmlTagName() != null) {
            htmlTagStartName.setHtmlTagName(visitHtmlTagName(ctx.htmlTagName()));
        }
        return htmlTagStartName;
    }

    @Override
    public HtmlTagName visitHtmlTagName(ParserFile.HtmlTagNameContext ctx) {
        HtmlTagName htmlTagName = new HtmlTagName();
        if (ctx.TagName() != null) {
            htmlTagName.setTagName(ctx.TagName().getText());
        }
        if (ctx.keyword() != null) {
            htmlTagName.setKeyword(visitKeyword(ctx.keyword()));
        }
        if (ctx.Identifier() != null) {
            htmlTagName.setIdentifier(ctx.Identifier().getText());
//            Row row = new Row();
//            row.setType("Symbol Type : HTML Tag Name =====>");
//            row.setValue("Symbol :  " + ctx.Identifier().getText());
//            row.setLineNumber(ctx.Identifier().getSymbol().getLine());
//            symbolTable.getRows().add(row);
        }
        return htmlTagName;
    }

    @Override
    public ClassOrInterfaceTypeList visitClassOrInterfaceTypeList(ParserFile.ClassOrInterfaceTypeListContext ctx) {
        ClassOrInterfaceTypeList classOrInterfaceTypeList = new ClassOrInterfaceTypeList();
        for (int i = 0; i < ctx.typeReference().size(); i++) {
            if (ctx.typeReference() != null) {
                classOrInterfaceTypeList.getTypeReference().add(visitTypeReference(ctx.typeReference(i)));
            }
        }
        return classOrInterfaceTypeList;

    }

    @Override
    public ImplementsClause visitImplementsClause(ParserFile.ImplementsClauseContext ctx) {
        ImplementsClause implementsClause = new ImplementsClause();
        if (ctx.Implements() != null) {
            implementsClause.setImplements(ctx.Implements().getText());
        }
        if (ctx.classOrInterfaceTypeList() != null) {
            implementsClause.setClassOrInterfaceTypeList(visitClassOrInterfaceTypeList(ctx.classOrInterfaceTypeList()));
        }
        return implementsClause;

    }

    @Override
    public NamespaceName visitNamespaceName(ParserFile.NamespaceNameContext ctx) {
        NamespaceName namespaceName = new NamespaceName();
        for (int i = 0; i < ctx.identifier().size(); i++) {
            if (ctx.identifier() != null) {
                namespaceName.getIdentifier().add(visitIdentifier(ctx.identifier(i)));
            }
        }
        return namespaceName;
    }

    @Override
    public TypeName visitTypeName(ParserFile.TypeNameContext ctx) {
        TypeName typeName = new TypeName();
        if (ctx.identifier() != null) {
            typeName.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if (ctx.namespaceName() != null) {
            typeName.setNamespaceName(visitNamespaceName(ctx.namespaceName()));
        }

        return typeName;
    }

    @Override
    public TypeReference visitTypeReference(ParserFile.TypeReferenceContext ctx) {
        TypeReference typeReference = new TypeReference();
        if (ctx.typeGeneric() != null) {
            typeReference.setTypeGeneric(visitTypeGeneric(ctx.typeGeneric()));
        }
        if (ctx.typeName() != null) {
            typeReference.setTypeName(visitTypeName(ctx.typeName()));
        }
        return typeReference;
    }

    @Override
    public ClassExtendsClause visitClassExtendsClause(ParserFile.ClassExtendsClauseContext ctx) {
        ClassExtendsClause classExtendsClause = new ClassExtendsClause();
        if (ctx.Extends() != null) {
            classExtendsClause.setExtends(ctx.Extends().getText());
        }
        if (ctx.typeReference() != null) {
            classExtendsClause.setTypeReference(visitTypeReference(ctx.typeReference()));
        }
        return classExtendsClause;
    }

    @Override
    public ClassHeritage visitClassHeritage(ParserFile.ClassHeritageContext ctx) {
        ClassHeritage classHeritage = new ClassHeritage();
        if (ctx.classExtendsClause() != null) {
            classHeritage.setClassExtendsClause(visitClassExtendsClause(ctx.classExtendsClause()));
        }
        if (ctx.implementsClause() != null) {
            classHeritage.setImplementsClause(visitImplementsClause(ctx.implementsClause()));
        }
        return classHeritage;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(ParserFile.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration = new ClassDeclaration();
        if (ctx.decoratorList() != null) {
            classDeclaration.setDecoratorList(visitDecoratorList(ctx.decoratorList()));
        }
        if (ctx.Export() != null) {
            classDeclaration.setExport(ctx.Export().getText());
        }
        if (ctx.Default() != null) {
            classDeclaration.setDefault(ctx.Default().getText());
        }
        if (ctx.Abstract() != null) {
            classDeclaration.setAbstract(ctx.Abstract().getText());
        }
        if (ctx.Class() != null) {
            classDeclaration.setClasse(ctx.Class().getText());

        }
        if (ctx.identifier() != null) {
            Identifier identifier = visitIdentifier(ctx.identifier());
            classDeclaration.setIdentifier(identifier);
            int scopeId = this.symbolTable.getCurrentScopeID();
            Row s1 = new Row();
            s1.setDatatype("Class");
            s1.setKey(ctx.identifier().getText());
            s1.setLineNumber(ctx.identifier().getStart().getLine());
            s1.setScope(this.symbolTable.getScopeByID(scopeId));


            this.symbolTable.getScopeByID(scopeId).setRows(s1);

//            symbolTable.createScope(ctx.identifier().getText());


        }


//            Scope classScope = new Scope(className, currentScope);
//            currentScope = classScope;
//            symbolTable.addSymbol(className, "Class", "", ctx.identifier().getStart().getLine(), classScope.getId());

//            Row row = new Row();
//            row.setType("Symbol Type: Class =====>");
//            row.setValue("Symbol :  " + ctx.identifier().getText());
//            row.setLineNumber(ctx.identifier().getStart().getLine());
//            symbolTable.getRows().add(row);

        if (ctx.typeParameters() != null) {
            classDeclaration.setTypeParameters(visitTypeParameters(ctx.typeParameters()));
        }
        if (ctx.classHeritage() != null) {
            classDeclaration.setClassHeritage(visitClassHeritage(ctx.classHeritage()));
        }
        if (ctx.classTail() != null) {
            classDeclaration.setClassTail(visitClassTail(ctx.classTail()));
        }
        return classDeclaration;
    }

    @Override
    public WhileStatement visitWhileStatement(ParserFile.WhileStatementContext ctx) {
        WhileStatement whileStatement = new WhileStatement();
        whileStatement.setStatement(visitStatement(ctx.statement()));
        whileStatement.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        return whileStatement;
    }

    @Override
    public ForStatement visitForStatement(ParserFile.ForStatementContext ctx) {
        ForStatement forStatement = new ForStatement();

        forStatement.setStatement(visitStatement(ctx.statement()));
        for (int i = 0; i < ctx.expressionSequence().size(); i++) {
            if (ctx.expressionSequence() != null) {
//            forStatement.getExpressionSequence().add(visitExpressionSequence(ctx.expressionSequence(i)));
                forStatement.getExpressionSequence().add(visitExpressionSequence(ctx.expressionSequence(i)));

            }
        }
        return forStatement;

    }

    @Override
    public ForVarStatement visitForVarStatement(ParserFile.ForVarStatementContext ctx) {
        ForVarStatement forVarStatement = new ForVarStatement();
        forVarStatement.setStatement(visitStatement(ctx.statement()));
        for (int i = 0; i < ctx.expressionSequence().size(); i++) {
            if (ctx.expressionSequence() != null) {
//            forStatement.getExpressionSequence().add(visitExpressionSequence(ctx.expressionSequence(i)));
                forVarStatement.getExpressionSequence().add(visitExpressionSequence(ctx.expressionSequence(i)));
            }
        }
        forVarStatement.setVarModifier(visitVarModifier(ctx.varModifier()));
        forVarStatement.setVariableDeclarationList(visitVariableDeclarationList(ctx.variableDeclarationList()));
        return forVarStatement;

    }

    @Override
    public ForInStatement visitForInStatement(ParserFile.ForInStatementContext ctx) {
        ForInStatement forInStatement = new ForInStatement();
        forInStatement.setSingleExpression(visitSingleExpression(ctx.singleExpression()));
        forInStatement.setStatement(visitStatement(ctx.statement()));
        forInStatement.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        return forInStatement;

    }

    @Override
    public ForVarInStatement visitForVarInStatement(ParserFile.ForVarInStatementContext ctx) {
        ForVarInStatement forVarInStatement = new ForVarInStatement();
        forVarInStatement.setVarModifier(visitVarModifier(ctx.varModifier()));
        forVarInStatement.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        forVarInStatement.setStatement(visitStatement(ctx.statement()));
        forVarInStatement.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        return forVarInStatement;
    }


    @Override
    public ForOfStatement visitForOfStatement(ParserFile.ForOfStatementContext ctx) {
        ForOfStatement forOfStatement = new ForOfStatement();
        forOfStatement.setSingleExpression(visitSingleExpression(ctx.singleExpression()));
        forOfStatement.setIdentifier(visitIdentifier(ctx.identifier()));
        forOfStatement.setType(visitType_(ctx.type_()));
        forOfStatement.setStatement(visitStatement(ctx.statement()));
        forOfStatement.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        return forOfStatement;
    }

    @Override
    public ForVarOfStatement visitForVarOfStatement(ParserFile.ForVarOfStatementContext ctx) {
        ForVarOfStatement forVarOfStatement = new ForVarOfStatement();
        forVarOfStatement.setStatement(visitStatement(ctx.statement()));
        forVarOfStatement.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        forVarOfStatement.setIdentifier(visitIdentifier(ctx.identifier()));
        forVarOfStatement.setType(visitType_(ctx.type_()));
        forVarOfStatement.setVarModifier(visitVarModifier(ctx.varModifier()));
        forVarOfStatement.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        return forVarOfStatement;

    }

    @Override
    public DoStatement visitDoStatement(ParserFile.DoStatementContext ctx) {
        DoStatement doStatement = new DoStatement();
        doStatement.setStatement(visitStatement(ctx.statement()));
        doStatement.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        return doStatement;

    }

    @Override
    public Literal visitLiteral(ParserFile.LiteralContext ctx) {
        Literal literal = new Literal();
        if (ctx.NullLiteral() != null) {
            literal.setNullLiteral(ctx.NullLiteral().getText());
//            Row row = new Row();
//            row.setType("Symbol Type: Null =====>");
//            row.setValue("Symbol :  " + ctx.NullLiteral().getText());
//            row.setLineNumber(ctx.NullLiteral().getSymbol().getLine());
//            symbolTable.getRows().add(row);
        }
        if (ctx.BooleanLiteral() != null) {
            literal.setBoolLiteral(ctx.BooleanLiteral().getText());
//            Row row = new Row();
//            row.setType("Boolean =====>");
////            row.setValue("Symbol :  " + ctx.BooleanLiteral().getText());
//            row.setValue("Value : " + ctx.BooleanLiteral().getText());
//            row.setLineNumber(ctx.BooleanLiteral().getSymbol().getLine());
//            symbolTable.getRows().add(row);
        }
        if (ctx.StringLiteral() != null) {
            literal.setStringLiteral(ctx.StringLiteral().getText());
//            Row row = new Row();
//            row.setType("Symbol Type: String =====>");
//            row.setValue("Symbol :  " + ctx.StringLiteral().getText());
//            row.setLineNumber(ctx.StringLiteral().getSymbol().getLine());
//            symbolTable.getRows().add(row);
        }
        if (ctx.numericLiteral() != null) {
            literal.setNumericLiteral(visitNumericLiteral(ctx.numericLiteral()));
//            Row row = new Row();
//            row.setType("Symbol Type: Number =====>");
//            row.setValue("Symbol :  " + ctx.numericLiteral().getText());
//            row.setLineNumber(ctx.numericLiteral().getStart().getLine());
//            symbolTable.getRows().add(row);
        }
        return literal;
    }

    @Override
    public VariableDeclarationList visitVariableDeclarationList(ParserFile.VariableDeclarationListContext ctx) {
        VariableDeclarationList variableDeclarationList = new VariableDeclarationList();
        for (int i = 0; i < ctx.variableDeclaration().size(); i++) {
            if (ctx.variableDeclaration() != null) {
//                int scopeId = this.symbolTable.getCurrentScopeID();
//                Row s1 = new Row();
//                s1.setDatatype("Alias");
//                s1.setKey(ctx.variableDeclaration(i).singleExpression(i).getText());
//                s1.setLineNumber(ctx.variableDeclaration(i).singleExpression(i).getStart().getLine());
//                s1.setScope(this.symbolTable.getScopeByID(scopeId));
//                this.symbolTable.getScopeByID(scopeId).setRows(s1);

                variableDeclarationList.getVariableDeclaration().add(visitVariableDeclaration(ctx.variableDeclaration(i)));
            }
        }
        return variableDeclarationList;
    }

    @Override
    public VariableDeclaration visitVariableDeclaration(ParserFile.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        if (ctx.identifierOrKeyWord() != null) {
            variableDeclaration.setIdentifierOrKeyWord(visitIdentifierOrKeyWord(ctx.identifierOrKeyWord()));
            String identifierName = ctx.identifierOrKeyWord().getText();


//            Row row = new Row();
//            row.setType("Symbol Type: Variable =====>");
//            row.setValue("Symbol :  " + ctx.identifierOrKeyWord().getText());
//            row.setLineNumber(ctx.identifierOrKeyWord().getStart().getLine());
//            symbolTable.getRows().add(row);
        }
        if (ctx.arrayLiteral() != null) {
            variableDeclaration.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        }
        if (ctx.objectLiteral() != null) {
            variableDeclaration.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }
        if (ctx.typeAnnotation() != null) {
            variableDeclaration.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression() != null) {
                variableDeclaration.getSingleExpression().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }
        if (ctx.typeParameters() != null) {
            variableDeclaration.setTypeParameters(visitTypeParameters(ctx.typeParameters()));
        }
        return variableDeclaration;
    }

    @Override
    public VarModifier visitVarModifier(ParserFile.VarModifierContext ctx) {
        VarModifier varModifier = new VarModifier();
        if (ctx.Var() != null) {
            varModifier.setVar(ctx.Var().getText());
        }
        if (ctx.Let() != null) {
            varModifier.setLet(ctx.Let().getText());
        }
        if (ctx.Const() != null) {
            varModifier.setConst(ctx.Const().getText());
        }

        return varModifier;
    }

    @Override
    public VariableStatement visitVariableStatement(ParserFile.VariableStatementContext ctx) {
        VariableStatement variableStatement = new VariableStatement();
        if (ctx.bindingPattern() != null) {
            variableStatement.setBindingPattern(visitBindingPattern(ctx.bindingPattern()));
        }
        if (ctx.typeAnnotation() != null) {
            variableStatement.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        if (ctx.SemiColon() != null) {
            variableStatement.setSemiColon(ctx.SemiColon().getText());
        }
        if (ctx.accessibilityModifier() != null) {
            variableStatement.setAccessibilityModifier(visitAccessibilityModifier(ctx.accessibilityModifier()));
        }
        if (ctx.varModifier() != null) {
            variableStatement.setVarModifier(visitVarModifier(ctx.varModifier()));
        }
        if (ctx.ReadOnly() != null) {
            variableStatement.setReadOnly(ctx.ReadOnly().getText());
        }
        if (ctx.variableDeclarationList() != null) {
            variableStatement.setVariableDeclarationList(visitVariableDeclarationList(ctx.variableDeclarationList()));


        }
        if (ctx.Declare() != null) {
            variableStatement.setDeclare(ctx.Declare().getText());
        }
        return variableStatement;
    }

    @Override
    public ExpressionStatement visitExpressionStatement(ParserFile.ExpressionStatementContext ctx) {
        ExpressionStatement expressionStatement = new ExpressionStatement();
        if (ctx.expressionSequence() != null) {
            expressionStatement.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        }
//        if (ctx.SemiColon() != null) {
//            expressionStatement.setSemiColon(ctx.SemiColon().getText());
//        }
        return expressionStatement;
    }


    @Override
    public ExpressionSequence visitExpressionSequence(ParserFile.ExpressionSequenceContext ctx) {
        ExpressionSequence expressionSequence = new ExpressionSequence();
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression() != null) {
                expressionSequence.getSingleExpression().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }
        return expressionSequence;
    }


    //TODO
//    @Override
//    public SingleExpression visitSingleExpression(ParserFile.SingleExpressionContext ctx) {
//        SingleExpression singleExpression = new SingleExpression();
//        for (int i = 0; i < ctx.singleExpression().size(); i++) {
//            if (ctx.singleExpression() != null) {
//                singleExpression.setSingleExpression(visitSingleExpression(ctx.singleExpression(i)));
//            }
//        }
////        if (ctx.anonymousFunction() != null) {
////            singleExpression.setAnonymousFunction(visitAnonymousFunction(ctx.anonymousFunction()));
////        }
//        if (ctx.Class() != null) {
//            singleExpression.setClasse(ctx.Class().getText());
//        }
//        if (ctx.identifier() != null) {
//            singleExpression.setIdentifier(visitIdentifier(ctx.identifier()));
//        }
//        if (ctx.identifierName() != null) {
//            singleExpression.setIdentifierName(visitIdentifierName(ctx.identifierName()));
//        }
//        if (ctx.typeGeneric() != null) {
//            singleExpression.setTypeGeneric(visitTypeGeneric(ctx.typeGeneric()));
//        }
//        if (ctx.typeParameters() != null) {
//            singleExpression.setTypeParameters(visitTypeParameters(ctx.typeParameters()));
//        }
////        if (ctx.classHeritage() != null) {
////            singleExpression.setClassHeritage(visitClassHeritage(ctx.classHeritage()));
////        }
//        if (ctx.classTail() != null) {
//            singleExpression.setClassTail(visitClassTail(ctx.classTail()));
//        }
//        if (ctx.expressionSequence() != null) {
//            singleExpression.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
//        }
//        if (ctx.typeArguments() != null) {
//            singleExpression.setTypeArguments(visitTypeArguments(ctx.typeArguments()));
//        }
//        if (ctx.This() != null) {
//            singleExpression.setThis(ctx.This().getText());
//        }
//        if (ctx.identifierName() != null) {
//            singleExpression.setIdentifierName(visitIdentifierName(ctx.identifierName()));
//        }
//        if (ctx.literal() != null) {
//            singleExpression.setLiteral(visitLiteral(ctx.literal()));
//        }
//        if (ctx.objectLiteral() != null) {
//            singleExpression.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
////            Row row = new Row();
////            row.setType("Value: =====>") ;
////            row.setValue("Symbol :  " + ctx.objectLiteral().getText());
////            row.setLineNumber(ctx.objectLiteral().getStart().getLine());
////            symbolTable.getRows().add(row);
//        }
//        if (ctx.arrayLiteral() != null) {
//            singleExpression.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
////            Row row = new Row();
////            row.setType("Symbol Type: Array =====>");
////            row.setValue("Value :  " + ctx.arrayLiteral().getText());
////            row.setLineNumber(ctx.arrayLiteral().getStart().getLine());
////            symbolTable.getRows().add(row);
//        }
//        if (ctx.htmlElement() != null) {
//            singleExpression.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
//        }
//        if (ctx.arguments() != null) {
//            singleExpression.setArguments(visitArguments(ctx.arguments()));
//        }
//
//
//        return singleExpression;
//    }
    @Override
    public SingleExpression visitSingleExpression(ParserFile.SingleExpressionContext ctx) {
        SingleExpression singleExpression = new SingleExpression();

        // Recursive child expressions
        if (!ctx.singleExpression().isEmpty()) {
            singleExpression.setSingleExpression(visitSingleExpression(ctx.singleExpression(0)));
        }

        // Handle 'class' declarations
        if (ctx.Class() != null) {
            singleExpression.setClasse(ctx.Class().getText());
            if (ctx.identifier() != null) {
                singleExpression.setIdentifier(visitIdentifier(ctx.identifier()));
            }
            if (ctx.typeParameters() != null) {
                singleExpression.setTypeParameters(visitTypeParameters(ctx.typeParameters()));
            }
            if (ctx.classHeritage() != null) {
                singleExpression.setClassHeritage(visitClassHeritage(ctx.classHeritage()));
            }
            if (ctx.classTail() != null) {
                singleExpression.setClassTail(visitClassTail(ctx.classTail()));
            }
        }


        if (ctx.expressionSequence() != null) {
            singleExpression.setExpressionSequence(visitExpressionSequence(ctx.expressionSequence()));
        }

        if (ctx.identifierName() != null) {
            singleExpression.setIdentifierName(visitIdentifierName(ctx.identifierName()));
        }

        if (ctx.typeGeneric() != null) {
            singleExpression.setTypeGeneric(visitTypeGeneric(ctx.typeGeneric()));
        }

        if (ctx.arguments() != null) {
            singleExpression.setArguments(visitArguments(ctx.arguments()));
        }

        if (ctx.typeArguments() != null) {
            singleExpression.setTypeArguments(visitTypeArguments(ctx.typeArguments()));
        }

        if (ctx.New() != null) {
            singleExpression.setNew(ctx.New().getText());
        }

        if (ctx.Delete() != null) {
            singleExpression.setDelete(ctx.Delete().getText());
        }

        if (ctx.Void() != null) {
            singleExpression.setVoid(ctx.Void().getText());
        }

        if (ctx.Typeof() != null) {
            singleExpression.setTypeOf(ctx.Typeof().getText());
        }

        if (ctx.Await() != null) {
            singleExpression.setAwait(ctx.Await().getText());
        }

        if (ctx.Instanceof() != null) {
            singleExpression.setInstanceOf(ctx.Instanceof().getText());
        }

        if (ctx.In() != null) {
            singleExpression.setIn(ctx.In().getText());
        }


        if (ctx.This() != null) {
            singleExpression.setThis(ctx.This().getText());
        }

        if (ctx.Super() != null) {
            singleExpression.setSuper(ctx.Super().getText());
        }

        if (ctx.literal() != null) {
            singleExpression.setLiteral(visitLiteral(ctx.literal()));
        }

        if (ctx.arrayLiteral() != null) {
            singleExpression.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        }

        if (ctx.objectLiteral() != null) {
            singleExpression.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }


        if (ctx.As() != null) {
            singleExpression.setAs(ctx.As().getText());
        }

        if (ctx.htmlElement() != null) {
            singleExpression.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        }

        return singleExpression;
    }


    @Override
    public TypeArgumentList visitTypeArgumentList(ParserFile.TypeArgumentListContext ctx) {
        TypeArgumentList typeArgumentList = new TypeArgumentList();
        for (int i = 0; i < ctx.typeArgument().size(); i++) {
            if (ctx.typeArgument() != null) {
                typeArgumentList.getTypeArgument().add(visitTypeArgument(ctx.typeArgument(i)));
            }
        }
        return typeArgumentList;
    }

    @Override
    public TypeArguments visitTypeArguments(ParserFile.TypeArgumentsContext ctx) {
        TypeArguments typeArguments = new TypeArguments();
        if (ctx.typeArgumentList() != null) {
            typeArguments.setTypeArgumentList(visitTypeArgumentList(ctx.typeArgumentList()));
        }
        return typeArguments;

    }

    @Override
    public TypeGeneric visitTypeGeneric(ParserFile.TypeGenericContext ctx) {
        TypeGeneric typeGeneric = new TypeGeneric();
        if (ctx.typeArgumentList() != null) {
            typeGeneric.setTypeArgumentList(visitTypeArgumentList(ctx.typeArgumentList()));
        }
        if (ctx.typeGeneric() != null) {
            typeGeneric.setTypeGeneric(visitTypeGeneric(ctx.typeGeneric()));
        }
        return typeGeneric;
    }

    @Override
    public FunctionType visitFunctionType(ParserFile.FunctionTypeContext ctx) {
        FunctionType functionType = new FunctionType();
        if (ctx.typeParameters() != null) {
            functionType.setTypeParameters(visitTypeParameters(ctx.typeParameters()));
        }
        if (ctx.parameterList() != null) {
            functionType.setParameterList(visitParameterList(ctx.parameterList()));
        }
        if (ctx.type_() != null) {
            functionType.setType_(visitType_(ctx.type_()));
        }
        return functionType;
    }

    @Override
    public ConstructorType visitConstructorType(ParserFile.ConstructorTypeContext ctx) {
        ConstructorType constructorType = new ConstructorType();
        if (ctx.typeParameters() != null) {
            constructorType.setTypeParameters(visitTypeParameters(ctx.typeParameters()));
        }
        if (ctx.parameterList() != null) {
            constructorType.setParameterList(visitParameterList(ctx.parameterList()));
        }
        if (ctx.type_() != null) {
            constructorType.setType_(visitType_(ctx.type_()));
        }
        return constructorType;
    }

    @Override
    public BindingPattern visitBindingPattern(ParserFile.BindingPatternContext ctx) {
        BindingPattern bindingPattern = new BindingPattern();
        if (ctx.arrayLiteral() != null) {
            bindingPattern.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        }
        if (ctx.objectLiteral() != null) {
            bindingPattern.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }
        return bindingPattern;
    }

    @Override
    public IdentifierOrPattern visitIdentifierOrPattern(ParserFile.IdentifierOrPatternContext ctx) {
        IdentifierOrPattern identifierOrPattern = new IdentifierOrPattern();
        if (ctx.identifierName() != null) {
            identifierOrPattern.setIdentifierName(visitIdentifierName(ctx.identifierName()));
        }
        if (ctx.bindingPattern() != null) {
            identifierOrPattern.setBindingPattern(visitBindingPattern(ctx.bindingPattern()));
        }
        return identifierOrPattern;
    }

    @Override
    public RequiredParameter visitRequiredParameter(ParserFile.RequiredParameterContext ctx) {
        RequiredParameter requiredParameter = new RequiredParameter();
        if (ctx.decoratorList() != null) {
            requiredParameter.setDecoratorList(visitDecoratorList(ctx.decoratorList()));
        }
        if (ctx.accessibilityModifier() != null) {
            requiredParameter.setAccessibilityModifier(visitAccessibilityModifier(ctx.accessibilityModifier()));
        }
        if (ctx.identifierOrPattern() != null) {
            requiredParameter.setIdentifierOrPattern(visitIdentifierOrPattern(ctx.identifierOrPattern()));
        }
        if (ctx.typeAnnotation() != null) {
            requiredParameter.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        return requiredParameter;
    }


    //TODO
    @Override
    public PrimaryType visitPrimaryType(ParserFile.PrimaryTypeContext ctx) {
        PrimaryType primaryType = new PrimaryType();
        if (ctx.predefinedType() != null) {
            primaryType.setPredefinedType(visitPredefinedType(ctx.predefinedType()));
        }
        for (int i = 0; i < ctx.primaryType().size(); i++) {
            if (ctx.primaryType() != null) {
                primaryType.getPrimaryType().add(visitPrimaryType(ctx.primaryType(i)));
            }
        }
        if (ctx.typeReference() != null) {
            primaryType.setTypeReference(visitTypeReference(ctx.typeReference()));
        }


        return primaryType;
    }

    @Override
    public PredefinedType visitPredefinedType(ParserFile.PredefinedTypeContext ctx) {
        PredefinedType predefinedType = new PredefinedType();
        if (ctx.Any() != null) {
            predefinedType.setAny(ctx.Any().getText());
        }
        if (ctx.Number() != null) {
            predefinedType.setAny(ctx.Number().getText());
        }
        if (ctx.DecimalLiteral() != null) {
            predefinedType.setAny(ctx.DecimalLiteral().getText());
        }
        if (ctx.Boolean() != null) {
            predefinedType.setAny(ctx.Boolean().getText());
        }
        if (ctx.BooleanLiteral() != null) {
            predefinedType.setAny(ctx.BooleanLiteral().getText());
        }
        if (ctx.String() != null) {
            predefinedType.setAny(ctx.String().getText());
        }
        if (ctx.StringLiteral() != null) {
            predefinedType.setAny(ctx.StringLiteral().getText());
        }

        return predefinedType;

    }

    @Override
    public UnionOrIntersectionOrPrimaryType visitUnionOrIntersectionOrPrimaryType(ParserFile.UnionOrIntersectionOrPrimaryTypeContext ctx) {
        UnionOrIntersectionOrPrimaryType unionOrIntersectionOrPrimaryType = new UnionOrIntersectionOrPrimaryType();
//        for (int i = 0; i < ctx.unionOrIntersectionOrPrimaryType().size(); i++) {
//            if (ctx.unionOrIntersectionOrPrimaryType() != null) {
//                unionOrIntersectionOrPrimaryType.getUnionOrIntersectionOrPrimaryType().add(visitUnionOrIntersectionOrPrimaryType(ctx.unionOrIntersectionOrPrimaryType(i)));
//            }
//        }
        if (ctx.primaryType() != null) {
            unionOrIntersectionOrPrimaryType.setPrimaryType(visitPrimaryType(ctx.primaryType()));
        }
        return unionOrIntersectionOrPrimaryType;
    }

    @Override
    public TypeArgument visitTypeArgument(ParserFile.TypeArgumentContext ctx) {
        TypeArgument typeArgument = new TypeArgument();
        if (ctx.type_() != null) {
            typeArgument.setType(visitType_(ctx.type_()));
        }
        return typeArgument;
    }

    @Override
    public Constraint visitConstraint(ParserFile.ConstraintContext ctx) {
        Constraint constraint = new Constraint();
        if (ctx.type_() != null) {
            constraint.setType_(visitType_(ctx.type_()));
        }
        return constraint;
    }

    @Override
    public TypeParameterList visitTypeParameterList(ParserFile.TypeParameterListContext ctx) {
        TypeParameterList typeParameterList = new TypeParameterList();
        for (int i = 0; i < ctx.typeParameter().size(); i++) {
            if (ctx.typeParameter() != null) {
                typeParameterList.getTypeParameter().add(visitTypeParameter(ctx.typeParameter(i)));
            }
        }
        return typeParameterList;
    }

    @Override
    public TypeParameters visitTypeParameters(ParserFile.TypeParametersContext ctx) {
        TypeParameters typeParameters = new TypeParameters();
        if (ctx.typeParameterList() != null) {
            typeParameters.setTypeParameterList(visitTypeParameterList(ctx.typeParameterList()));
        }
        return typeParameters;
    }

    @Override
    public TypeParameter visitTypeParameter(ParserFile.TypeParameterContext ctx) {
        TypeParameter typeParameter = new TypeParameter();
        if (ctx.identifier() != null) {
            typeParameter.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if (ctx.constraint() != null) {
            typeParameter.setConstraint(visitConstraint(ctx.constraint()));
        }
        if (ctx.typeArgument() != null) {
            typeParameter.setTypeArgument(visitTypeArgument(ctx.typeArgument()));
        }
        if (ctx.typeParameters() != null) {
            typeParameter.setTypeParameters(visitTypeParameters(ctx.typeParameters()));
        }
        return typeParameter;
    }

    @Override
    public Type_ visitType_(ParserFile.Type_Context ctx) {
        Type_ type = new Type_();
        if (ctx.unionOrIntersectionOrPrimaryType() != null) {
            type.setUnionOrIntersectionOrPrimaryType(visitUnionOrIntersectionOrPrimaryType(ctx.unionOrIntersectionOrPrimaryType()));
        }
        if (ctx.functionType() != null) {
            type.setFunctionType(visitFunctionType(ctx.functionType()));
        }
        if (ctx.constructorType() != null) {
            type.setConstructorType(visitConstructorType(ctx.constructorType()));
        }
        if (ctx.typeGeneric() != null) {
            type.setTypeGeneric(visitTypeGeneric(ctx.typeGeneric()));
        }
        return type;
    }

    @Override
    public Parameter visitParameter(ParserFile.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        if (ctx.requiredParameter() != null) {
            parameter.setRequiredParameter(visitRequiredParameter(ctx.requiredParameter()));
        }
//        if (ctx.optionalParameter() != null) {
//            parameter.setOptionalParameter(visitOptionalParameter(ctx.optionalParameter()));
//        }
        return parameter;
    }

    @Override
    public ParameterList visitParameterList(ParserFile.ParameterListContext ctx) {
        ParameterList parameterList = new ParameterList();
        if (ctx.restParameter() != null) {
            parameterList.setRestParameter(visitRestParameter(ctx.restParameter()));
        }
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (ctx.parameter() != null) {
                parameterList.getParameter().add(visitParameter(ctx.parameter(i)));
            }
        }
        return parameterList;
    }

    @Override
    public RestParameter visitRestParameter(ParserFile.RestParameterContext ctx) {
        RestParameter restParameter = new RestParameter();
        if (ctx.singleExpression() != null) {
            restParameter.setSingleExpression(visitSingleExpression(ctx.singleExpression()));
        }
        if (ctx.typeAnnotation() != null) {
            restParameter.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        return restParameter;
    }

    @Override
    public Assignable visitAssignable(ParserFile.AssignableContext ctx) {
        Assignable assignable = new Assignable();
        if (ctx.identifier() != null) {
            assignable.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if (ctx.keyword() != null) {
            assignable.setKeyword(visitKeyword(ctx.keyword()));
        }
        if (ctx.arrayLiteral() != null) {
            assignable.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        }
        if (ctx.objectLiteral() != null) {
            assignable.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }
        return assignable;
    }

    @Override
    public IdentifierOrKeyWord visitIdentifierOrKeyWord(ParserFile.IdentifierOrKeyWordContext ctx) {
        IdentifierOrKeyWord identifierOrKeyWord = new IdentifierOrKeyWord();
        if (ctx.identifier() != null) {
            identifierOrKeyWord.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if (ctx.TypeAlias() != null) {
            identifierOrKeyWord.setTypeAlias(ctx.TypeAlias().getText());
        }
        if (ctx.Require() != null) {
            identifierOrKeyWord.setRequire(ctx.Require().getText());
        }
        return identifierOrKeyWord;
    }

//    @Override
//    public GeneratorMethod visitGeneratorMethod(ParserFile.GeneratorMethodContext ctx) {
//        GeneratorMethod generatorMethod = new GeneratorMethod();
//        if (ctx.Async() != null) {
//            generatorMethod.setAsync(ctx.Async().getText());
//        }
//        if (ctx.propertyName() != null) {
//            generatorMethod.setPropertyName(visitPropertyName(ctx.propertyName()));
//
//        }
//        if (ctx.formalParameterList() != null) {
//            generatorMethod.setFormalParameterList(visitFormalParameterList(ctx.formalParameterList()));
//        }
//        if (ctx.functionBody() != null) {
//            generatorMethod.setFunctionBody(visitFunctionBody(ctx.functionBody()));
//        }
//        return generatorMethod;
//    }

    @Override
    public ArrayElement visitArrayElement(ParserFile.ArrayElementContext ctx) {
        ArrayElement arrayElement = new ArrayElement();
        if (ctx.Ellipsis() != null) {
            arrayElement.setEllipsis(ctx.Ellipsis().getText());
        }
        if (ctx.singleExpression() != null) {
            arrayElement.setSingleExpression(visitSingleExpression(ctx.singleExpression()));
        }
        if (ctx.identifier() != null) {
            arrayElement.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        return arrayElement;
    }

    @Override
    public ElementList visitElementList(ParserFile.ElementListContext ctx) {
        ElementList elementList = new ElementList();
        for (int i = 0; i < ctx.arrayElement().size(); i++) {
            if (ctx.arrayElement() != null) {
                elementList.getArrayElement().add(visitArrayElement(ctx.arrayElement(i)));
            }
        }
        return elementList;
    }

    @Override
    public PropertyAssignment visitPropertyAssignment(ParserFile.PropertyAssignmentContext ctx) {
        PropertyAssignment propertyAssignment = new PropertyAssignment();
        if (ctx.propertyName() != null) {
            propertyAssignment.setPropertyName(visitPropertyName(ctx.propertyName()));
            String propertyName = ctx.propertyName().getText();
        }
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression() != null) {
                propertyAssignment.getSingleExpression().add(visitSingleExpression(ctx.singleExpression(i)));
//                Row row = new Row();
//                row.setType("Symbol Type: Assignment =====>");
//                row.setValue("Symbol :  " + ctx.singleExpression(i).getText());
//                row.setLineNumber(ctx.singleExpression().get(i).getStart().getLine());
//                symbolTable.getRows().add(row);
            }
        }
//        if (ctx.generatorMethod() != null) {
//            propertyAssignment.setGeneratorMethod(visitGeneratorMethod(ctx.generatorMethod()));
//        }
        if (ctx.identifierOrKeyWord() != null) {
            propertyAssignment.setIdentifierOrKeyWord(visitIdentifierOrKeyWord(ctx.identifierOrKeyWord()));
        }
        if (ctx.Ellipsis() != null) {
            propertyAssignment.setEllipsis(ctx.Ellipsis().getText());
        }
        if (ctx.restParameter() != null) {
            propertyAssignment.setRestParameter(visitRestParameter(ctx.restParameter()));
        }
        return propertyAssignment;
    }

    @Override
    public IndexSignature visitIndexSignature(ParserFile.IndexSignatureContext ctx) {
        IndexSignature indexSignature = new IndexSignature();
        if (ctx.identifier() != null) {
            indexSignature.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if (ctx.Number() != null) {
            indexSignature.setNumber(ctx.Number().getText());
        }
        if (ctx.String() != null) {
            indexSignature.setString(ctx.String().getText());
        }
        if (ctx.typeAnnotation() != null) {
            indexSignature.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        return indexSignature;
    }

    @Override
    public PropertyMemberBase visitPropertyMemberBase(ParserFile.PropertyMemberBaseContext ctx) {
        PropertyMemberBase propertyMemberBase = new PropertyMemberBase();
        if (ctx.accessibilityModifier() != null) {
            propertyMemberBase.setAccessibilityModifier(visitAccessibilityModifier(ctx.accessibilityModifier()));
        }
        if (ctx.Async() != null) {
            propertyMemberBase.setAsync(ctx.Async().getText());
        }
        if (ctx.Static() != null) {
            propertyMemberBase.setStatic(ctx.Static().getText());
        }
        if (ctx.ReadOnly() != null) {
            propertyMemberBase.setReadOnly(ctx.ReadOnly().getText());
        }
        return propertyMemberBase;
    }

    @Override
    public PropertyName visitPropertyName(ParserFile.PropertyNameContext ctx) {
        PropertyName propertyName = new PropertyName();
        if (ctx.identifierName() != null) {
            propertyName.setIdentifierName(visitIdentifierName(ctx.identifierName()));
        }
        if (ctx.StringLiteral() != null) {
            propertyName.setStringLiteral(ctx.StringLiteral().getText());
        }
        if (ctx.numericLiteral() != null) {
            propertyName.setNumericLiteral(visitNumericLiteral(ctx.numericLiteral()));
        }
        if (ctx.singleExpression() != null) {
            propertyName.setSingleExpression(visitSingleExpression(ctx.singleExpression()));
        }
        return propertyName;
    }

    @Override
    public TypeAnnotation visitTypeAnnotation(ParserFile.TypeAnnotationContext ctx) {
        TypeAnnotation typeAnnotation = new TypeAnnotation();
        if (ctx.type_() != null) {
            typeAnnotation.setType_(visitType_(ctx.type_()));
        }
        return typeAnnotation;
    }

    @Override
    public CallSignature visitCallSignature(ParserFile.CallSignatureContext ctx) {
        CallSignature callSignature = new CallSignature();
        if (ctx.typeParameters() != null) {
            callSignature.setTypeParameters(visitTypeParameters(ctx.typeParameters()));
        }
        if (ctx.parameterList() != null) {
            callSignature.setParameterList(visitParameterList(ctx.parameterList()));
        }
        if (ctx.typeAnnotation() != null) {
            callSignature.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        return callSignature;
    }

    @Override
    public AbstractDeclaration visitAbstractDeclaration(ParserFile.AbstractDeclarationContext ctx) {
        AbstractDeclaration abstractDeclaration = new AbstractDeclaration();
        if (ctx.Abstract() != null) {
            abstractDeclaration.setAbstraction(ctx.Abstract().getText());
        }
        if (ctx.identifier() != null) {
            abstractDeclaration.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if (ctx.callSignature() != null) {
            abstractDeclaration.setCallSignature(visitCallSignature(ctx.callSignature()));
        }
//        if (ctx.variableStatement() != null) {
//            abstractDeclaration.setVariableStatement(visitVariableStatement(ctx.variableStatement()));
//        }
        if (ctx.eos() != null) {
            abstractDeclaration.setEos(visitEos(ctx.eos()));
        }
        return abstractDeclaration;
    }

    @Override
    public FormalParameterArg visitFormalParameterArg(ParserFile.FormalParameterArgContext ctx) {
        FormalParameterArg formalParameterArg = new FormalParameterArg();
        if (ctx.decorator() != null) {
            formalParameterArg.setDecorator(visitDecorator(ctx.decorator()));
        }
        if (ctx.accessibilityModifier() != null) {
            formalParameterArg.setAccessibilityModifier(visitAccessibilityModifier(ctx.accessibilityModifier()));
        }
        if (ctx.assignable() != null) {
            formalParameterArg.setAssignable(visitAssignable(ctx.assignable()));
        }
        if (ctx.typeAnnotation() != null) {
            formalParameterArg.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        if (ctx.singleExpression() != null) {
            formalParameterArg.setSingleExpression(visitSingleExpression(ctx.singleExpression()));
        }
        return formalParameterArg;
    }

    @Override
    public LastFormalParameterArg visitLastFormalParameterArg(ParserFile.LastFormalParameterArgContext ctx) {
        LastFormalParameterArg lastFormalParameterArg = new LastFormalParameterArg();
        if (ctx.Ellipsis() != null) {
            lastFormalParameterArg.setEllipsis(ctx.Ellipsis().getText());
        }
        if (ctx.identifier() != null) {
            lastFormalParameterArg.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if (ctx.typeAnnotation() != null) {
            lastFormalParameterArg.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
        return lastFormalParameterArg;
    }

    @Override
    public ArrayLiteral visitArrayLiteral(ParserFile.ArrayLiteralContext ctx) {
        ArrayLiteral arrayLiteral = new ArrayLiteral();
        if (ctx.elementList() != null) {
            arrayLiteral.setElementList(visitElementList(ctx.elementList()));
        }
        return arrayLiteral;
    }

    @Override
    public ObjectLiteral visitObjectLiteral(ParserFile.ObjectLiteralContext ctx) {
        ObjectLiteral objectLiteral = new ObjectLiteral();
        for (int i = 0; i < ctx.propertyAssignment().size(); i++) {
            if (ctx.propertyAssignment() != null) {
                int scopeId = this.symbolTable.getCurrentScopeID();
                Row s1 = new Row();
                s1.setDatatype("Component Property");
                s1.setKey(ctx.propertyAssignment(i).propertyName().identifierName().identifier().getText());
                s1.setLineNumber(ctx.propertyAssignment(i).propertyName().identifierName().identifier().getStart().getLine());
                s1.setScope(this.symbolTable.getScopeByID(scopeId));
                this.symbolTable.getScopeByID(scopeId).setRows(s1);
                objectLiteral.getPropertyAssignment().add(visitPropertyAssignment(ctx.propertyAssignment(i)));
            }
        }
        return objectLiteral;
    }

    @Override
    public IndexMemberDeclaration visitIndexMemberDeclaration(ParserFile.IndexMemberDeclarationContext ctx) {
        IndexMemberDeclaration indexMemberDeclaration = new IndexMemberDeclaration();
        if (ctx.indexSignature() != null) {
            indexMemberDeclaration.setIndexSignature(visitIndexSignature(ctx.indexSignature()));
        }
        if (ctx.SemiColon() != null) {
            indexMemberDeclaration.setSemiColon(ctx.SemiColon().getText());
        }
        return indexMemberDeclaration;
    }

    @Override
    public PropertyMemberDeclaration visitPropertyMemberDeclaration(ParserFile.PropertyMemberDeclarationContext ctx) {
        PropertyMemberDeclaration propertyMemberDeclaration = new PropertyMemberDeclaration();
        if (ctx.propertyMemberBase() != null) {
            propertyMemberDeclaration.setPropertyMemberBase(visitPropertyMemberBase(ctx.propertyMemberBase()));
        }
        if (ctx.propertyName() != null) {
            propertyMemberDeclaration.setPropertyName(visitPropertyName(ctx.propertyName()));
        }
        if (ctx.typeAnnotation() != null) {
            propertyMemberDeclaration.setTypeAnnotation(visitTypeAnnotation(ctx.typeAnnotation()));
        }
//        if (ctx.SemiColon() != null) {
//            propertyMemberDeclaration.setSemiColon(ctx.SemiColon().getText());
//        }
        if (ctx.callSignature() != null) {
            propertyMemberDeclaration.setCallSignature(visitCallSignature(ctx.callSignature()));
        }
        if (ctx.functionBody() != null) {
            propertyMemberDeclaration.setFunctionBody(visitFunctionBody(ctx.functionBody()));
        }
        if (ctx.abstractDeclaration() != null) {
            propertyMemberDeclaration.setAbstractDeclaration(visitAbstractDeclaration(ctx.abstractDeclaration()));
        }


        return propertyMemberDeclaration;
    }


    @Override
    public FunctionBody visitFunctionBody(ParserFile.FunctionBodyContext ctx) {
        FunctionBody functionBody = new FunctionBody();
        if (ctx.sourceElements() != null) {
            int scopeId = this.symbolTable.getCurrentScopeID();
//            Row s1 = new Row();
//            s1.setDatatype("Decorator");
//            s1.setKey(ctx.decoratorCallExpression().decoratorMemberExpression().identifier().getText());
//            s1.setLineNumber(ctx.decoratorCallExpression().decoratorMemberExpression().identifier().getStart().getLine());
//            s1.setScope(this.symbolTable.getScopeByID(scopeId));
//
//
//            this.symbolTable.getScopeByID(scopeId).setRows(s1);
//
//            symbolTable.createScope(ctx.decoratorCallExpression().decoratorMemberExpression().identifier().getText());
//
//            s1.setDatatype("Decorator");

            functionBody.setSourceElements(visitSourceElements(ctx.sourceElements()));
        }
        return functionBody;
    }

    @Override
    public FormalParameterList visitFormalParameterList(ParserFile.FormalParameterListContext ctx) {
        FormalParameterList formalParameterList = new FormalParameterList();
        for (int i = 0; i < ctx.formalParameterArg().size(); i++) {
            if (ctx.formalParameterArg() != null) {
                formalParameterList.getFormalParameterArg().add(visitFormalParameterArg(ctx.formalParameterArg(i)));
            }
            if (ctx.lastFormalParameterArg() != null) {
                formalParameterList.setLastFormalParameterArg(visitLastFormalParameterArg(ctx.lastFormalParameterArg()));
            }
            if (ctx.arrayLiteral() != null) {
                formalParameterList.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
            }
            if (ctx.objectLiteral() != null) {
                formalParameterList.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
            }
            if (ctx.formalParameterList() != null) {
                formalParameterList.setFormalParameterList(visitFormalParameterList(ctx.formalParameterList()));
            }
        }
        return formalParameterList;
    }

    @Override
    public AccessibilityModifier visitAccessibilityModifier(ParserFile.AccessibilityModifierContext ctx) {
        AccessibilityModifier accessibilityModifier = new AccessibilityModifier();
        if (ctx.Public() != null) {
            accessibilityModifier.setPublicAM(ctx.Public().getText());
        }
        if (ctx.Private() != null) {
            accessibilityModifier.setPrivateAM(ctx.Private().getText());
        }
        if (ctx.Protected() != null) {
            accessibilityModifier.setProtectedAM(ctx.Protected().getText());
        }
        return accessibilityModifier;
    }

    @Override
    public Argument visitArgument(ParserFile.ArgumentContext ctx) {
        Argument argument = new Argument();
        if (ctx.Ellipsis() != null) {
            argument.setEllipsis(ctx.Ellipsis().getText());
        }
        if (ctx.singleExpression() != null) {
            argument.setSingleExpression(visitSingleExpression(ctx.singleExpression()));
        }
        if (ctx.identifier() != null) {
            argument.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        return argument;
    }

    @Override
    public ArgumentList visitArgumentList(ParserFile.ArgumentListContext ctx) {
        ArgumentList argumentList = new ArgumentList();
        for (int i = 0; i < ctx.argument().size(); i++) {
            if (ctx.argument() != null) {
                argumentList.getArgument().add(visitArgument(ctx.argument(i)));
            }
        }
        return argumentList;
    }

    @Override
    public Arguments visitArguments(ParserFile.ArgumentsContext ctx) {
        Arguments arguments = new Arguments();
        if (ctx.argumentList() != null) {
            arguments.setArgumentList(visitArgumentList(ctx.argumentList()));
        }
        return arguments;
    }

    @Override
    public DecoratorCallExpression visitDecoratorCallExpression(ParserFile.DecoratorCallExpressionContext ctx) {
        DecoratorCallExpression decoratorCallExpression = new DecoratorCallExpression();
        if (ctx.decoratorMemberExpression() != null) {
            decoratorCallExpression.setDecoratorMemberExpression(visitDecoratorMemberExpression(ctx.decoratorMemberExpression()));
            String decoratorName = ctx.decoratorMemberExpression().getText();
        }
        if (ctx.arguments() != null) {
            decoratorCallExpression.setArguments(visitArguments(ctx.arguments()));
        }

//        currentScope = newScope.getParentScope();
        return decoratorCallExpression;

    }


    @Override
    public DecoratorMemberExpression visitDecoratorMemberExpression(ParserFile.DecoratorMemberExpressionContext ctx) {
        DecoratorMemberExpression decoratorMemberExpression = new DecoratorMemberExpression();
        if (ctx.identifier() != null) {
            decoratorMemberExpression.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if (ctx.decoratorMemberExpression() != null) {
            decoratorMemberExpression.setDecoratorMemberExpression(visitDecoratorMemberExpression(ctx.decoratorMemberExpression()));
        }

        if (ctx.identifierName() != null) {
            decoratorMemberExpression.setIdentifierName(visitIdentifierName(ctx.identifierName()));
        }
        if (ctx.singleExpression() != null) {
            decoratorMemberExpression.setSingleExpression(visitSingleExpression(ctx.singleExpression()));
        }
        return decoratorMemberExpression;

    }

    @Override
    public Decorator visitDecorator(ParserFile.DecoratorContext ctx) {
        Decorator decorator = new Decorator();
        if (ctx.decoratorMemberExpression() != null) {
            decorator.setDecoratorMemberExpression(visitDecoratorMemberExpression(ctx.decoratorMemberExpression()));
        }
        if (ctx.decoratorCallExpression() != null) {
            int scopeId = this.symbolTable.getCurrentScopeID();
            Row s1 = new Row();
            s1.setDatatype("Decorator");
            s1.setKey(ctx.decoratorCallExpression().decoratorMemberExpression().identifier().getText());
            s1.setLineNumber(ctx.decoratorCallExpression().decoratorMemberExpression().identifier().getStart().getLine());
            s1.setScope(this.symbolTable.getScopeByID(scopeId));


            this.symbolTable.getScopeByID(scopeId).setRows(s1);

            symbolTable.createScope(ctx.decoratorCallExpression().decoratorMemberExpression().identifier().getText());

//            s1.setDatatype("Decorator");

            decorator.setDecoratorCallExpression(visitDecoratorCallExpression(ctx.decoratorCallExpression()));

//            Row row = new Row();
//            row.setType("Symbol Type: Decorator =====>");
//            row.setValue("Symbol :  " + ctx.decoratorCallExpression().getText());
//            row.setLineNumber(ctx.decoratorCallExpression().getStart().getLine());
//            symbolTable.getRows().add(row);
        }

        return decorator;

    }

    @Override
    public DecoratorList visitDecoratorList(ParserFile.DecoratorListContext ctx) {
        DecoratorList decoratorList = new DecoratorList();
        for (int i = 0; i < ctx.decorator().size(); i++) {
            if (ctx.decorator() != null) {
                decoratorList.getDecorator().add(visitDecorator(ctx.decorator(i)));
//                Row row = new Row();
//                row.setType("Symbol Type: Decorator =====>");
//                row.setValue("Symbol :  " + ctx.decorator(i).getText());
//                row.setLineNumber(ctx.decorator().get(i).getStart().getLine());
//                symbolTable.getRows().add(row);
            }
        }
        return decoratorList;


    }

    @Override
    public ConstructorDeclaration visitConstructorDeclaration(ParserFile.ConstructorDeclarationContext ctx) {
        ConstructorDeclaration constructorDeclaration = new ConstructorDeclaration();
        if (ctx.accessibilityModifier() != null) {
            constructorDeclaration.setAccessibilityModifier(visitAccessibilityModifier(ctx.accessibilityModifier()));
        }
        if (ctx.Constructor() != null) {
            constructorDeclaration.setConstructor(ctx.Constructor().getText());
        }
        if (ctx.formalParameterList() != null) {
            constructorDeclaration.setFormalParameterList(visitFormalParameterList(ctx.formalParameterList()));
        }
        if (ctx.functionBody() != null) {
            constructorDeclaration.setFunctionBody(visitFunctionBody(ctx.functionBody()));
        }
        if (ctx.SemiColon() != null) {
            constructorDeclaration.setsemiColon(ctx.SemiColon().getText());
        }
        return constructorDeclaration;
    }

    @Override
    public ClassElement visitClassElement(ParserFile.ClassElementContext ctx) {
        ClassElement classElement = new ClassElement();
        if (ctx.constructorDeclaration() != null) {
            classElement.setConstructorDeclaration(visitConstructorDeclaration(ctx.constructorDeclaration()));
        }
        if (ctx.decoratorList() != null) {
            classElement.setDecoratorList(visitDecoratorList(ctx.decoratorList()));
        }
        if (ctx.propertyMemberDeclaration() != null) {
            classElement.setPropertyMemberDeclaration(visitPropertyMemberDeclaration(ctx.propertyMemberDeclaration()));
        }
        if (ctx.indexMemberDeclaration() != null) {
            classElement.setIndexMemberDeclaration(visitIndexMemberDeclaration(ctx.indexMemberDeclaration()));
        }
        if (ctx.statement() != null) {
            classElement.setStatement(visitStatement(ctx.statement()));
        }

        return classElement;
    }

    @Override
    public ClassTail visitClassTail(ParserFile.ClassTailContext ctx) {
        ClassTail classTail = new ClassTail();
        for (int i = 0; i < ctx.classElement().size(); i++) {
            if (ctx.classElement() != null) {
                classTail.getclassElement().add(visitClassElement(ctx.classElement(i)));
                if (ctx.classElement(i).propertyMemberDeclaration() != null) {
                    int scopeId = this.symbolTable.getCurrentScopeID();
                    Row s1 = new Row();
                    s1.setDatatype("Class Property");
                    s1.setKey(ctx.classElement(i).propertyMemberDeclaration().propertyName().identifierName().identifier().getText());

                    s1.setLineNumber(ctx.classElement(i).propertyMemberDeclaration().propertyName().identifierName().identifier().getStart().getLine());
                    s1.setScope(this.symbolTable.getScopeByID(scopeId));
                    if (ctx.classElement(i).propertyMemberDeclaration().typeAnnotation() != null) {
                        List<String> valuesList = new ArrayList<>();
                        valuesList.add(ctx.classElement(i).propertyMemberDeclaration().typeAnnotation().type_().getText());
                        s1.setValue(valuesList);

                    }
                    this.symbolTable.getScopeByID(scopeId).setRows(s1);

                }
            }
        }
        return classTail;
    }



    @Override
    public StatementList visitStatementList(ParserFile.StatementListContext ctx) {
        StatementList statementList = new StatementList();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement() != null) {
                statementList.getStatement().add(visitStatement(ctx.statement(i)));
            }
        }
        return statementList;
    }

    @Override
    public Block visitBlock(ParserFile.BlockContext ctx) {
        Block block = new Block();
        if (ctx.statementList() != null) {
            block.setStatementList(visitStatementList(ctx.statementList()));
        }
        return block;
    }


    @Override
    public FunctionDeclaration visitFunctionDeclaration(ParserFile.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        if (ctx.Async() != null) {
            functionDeclaration.setAsync(ctx.Async().getText());
        }
        if (ctx.Function_() != null) {
            functionDeclaration.setFunction_(ctx.Function_().getText());
        }
        if (ctx.identifier() != null) {
            functionDeclaration.setIdentifier(visitIdentifier(ctx.identifier()));
            String functionName = ctx.identifier().getText();

        }
        if (ctx.callSignature() != null) {
            functionDeclaration.setCallSignature(visitCallSignature(ctx.callSignature()));
        }
        if (ctx.functionBody() != null) {
            functionDeclaration.setFunctionBody(visitFunctionBody(ctx.functionBody()));
            String functionBody = ctx.functionBody().getText();

        }
        if (ctx.SemiColon() != null) {
            functionDeclaration.setSemiColon(ctx.SemiColon().getText());
        }
        return functionDeclaration;
    }

    //TODO
    @Override
    public Statement visitStatement(ParserFile.StatementContext ctx) {
        Statement statement = new Statement();

        if (ctx.importStatement() != null) {
            statement.setImportStatement(visitImportStatement(ctx.importStatement()));
        }
        if (ctx.variableStatement() != null) {
            statement.setVariableStatement(visitVariableStatement(ctx.variableStatement()));
        }

        if (ctx.block() != null) {
            statement.setBlock(visitBlock(ctx.block()));
        }
        if (ctx.classDeclaration() != null) {
            statement.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));
        }
        if (ctx.expressionStatement() != null) {
            statement.setExpressionStatement(visitExpressionStatement(ctx.expressionStatement()));
        }
        if (ctx.functionDeclaration() != null) {
            statement.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));

        }
        if (ctx.iterationStatement() != null) {
            statement.setIterationStatement((IterationStatement) visit(ctx.iterationStatement()));
        }
        return statement;
    }

    @Override
    public ImportStatement visitImportStatement(ParserFile.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        if (ctx.Import() != null) {
            importStatement.setImport(ctx.Import().getText());
        }
        if (ctx.importFromBlock() != null) {
            importStatement.setImportFromBlock(visitImportFromBlock(ctx.importFromBlock()));
        }
        return importStatement;
    }

    @Override
    public AliasName visitAliasName(ParserFile.AliasNameContext ctx) {
        AliasName aliasName = new AliasName();
        for (int i = 0; i < ctx.identifierName().size(); i++) {
            if (ctx.identifierName() != null) {
                aliasName.getIdentifierName().add(visitIdentifierName(ctx.identifierName(i)));
            }
        }
        if (ctx.As() != null) {
            aliasName.setAs(ctx.As().getText());
        }
        return aliasName;
    }

    @Override
    public ImportDefault visitImportDefault(ParserFile.ImportDefaultContext ctx) {
        ImportDefault importDefault = new ImportDefault();
        if (ctx.aliasName() != null) {
            importDefault.setAliasName(visitAliasName(ctx.aliasName()));
        }
        return importDefault;
    }


    @Override
    public ImportNamespace visitImportNamespace(ParserFile.ImportNamespaceContext ctx) {
        ImportNamespace importNamespace = new ImportNamespace();
        for (int i = 0; i < ctx.identifierName().size(); i++) {
            if (ctx.identifierName() != null) {
                importNamespace.getIdentifierName().add(visitIdentifierName(ctx.identifierName(i)));
            }
        }
        if (ctx.As() != null) {
            importNamespace.setAs(ctx.As().getText());
        }
        return importNamespace;
    }

    @Override
    public ImportFromBlock visitImportFromBlock(ParserFile.ImportFromBlockContext ctx) {
        ImportFromBlock importFromBlock = new ImportFromBlock();
        if (ctx.importDefault() != null) {
            importFromBlock.setImportDefault(visitImportDefault(ctx.importDefault()));
        }
        if (ctx.importNamespace() != null) {
            importFromBlock.setImportNamespace(visitImportNamespace(ctx.importNamespace()));
        }
        if (ctx.importModuleItems() != null) {
            importFromBlock.setImportModuleItems(visitImportModuleItems(ctx.importModuleItems()));


        }
        if (ctx.importFrom() != null) {
            importFromBlock.setImportFrom(visitImportFrom(ctx.importFrom()));
        }
//        if (ctx.eos() != null) {
//            importFromBlock.setEos(visitEos(ctx.eos()));
//        }
        return importFromBlock;
    }

    @Override
    public ImportFrom visitImportFrom(ParserFile.ImportFromContext ctx) {
        ImportFrom importFrom = new ImportFrom();
//        if (ctx.From() != null) {
//            importFrom.setFrom(ctx.From().getText());
//        }
        if (ctx.StringLiteral() != null) {
            importFrom.setStringLiteral(ctx.StringLiteral().getText());
        }
        return importFrom;
    }

    @Override
    public ImportModuleItems visitImportModuleItems(ParserFile.ImportModuleItemsContext ctx) {
        ImportModuleItems importModuleItems = new ImportModuleItems();
        for (int i = 0; i < ctx.importAliasName().size(); i++) {
            if (ctx.importAliasName(i) != null) {
                importModuleItems.getImportAliasName().add(visitImportAliasName(ctx.importAliasName(i)));
            }
        }
        return importModuleItems;
    }

    @Override
    public ImportedBinding visitImportedBinding(ParserFile.ImportedBindingContext ctx) {
        ImportedBinding importedBinding = new ImportedBinding();
        if (ctx.Identifier() != null) {
            importedBinding.setIdentifier(ctx.Identifier().getText());
        }
        if (ctx.Yield() != null) {
            importedBinding.setYield(ctx.Yield().getText());
        }
        if (ctx.Await() != null) {
            importedBinding.setAwait(ctx.Await().getText());
        }
        return importedBinding;
    }

    @Override
    public ImportAliasName visitImportAliasName(ParserFile.ImportAliasNameContext ctx) {
        ImportAliasName importAliasName = new ImportAliasName();
        if (ctx.moduleExportName() != null) {
            importAliasName.setModuleExportName(visitModuleExportName(ctx.moduleExportName()));
            int scopeId = this.symbolTable.getCurrentScopeID();
            Row s1 = new Row();
            s1.setDatatype("Alias Import");
            s1.setKey(ctx.moduleExportName().identifierName().identifier().getText());
            s1.setLineNumber(ctx.moduleExportName().identifierName().identifier().getStart().getLine());
            s1.setScope(this.symbolTable.getScopeByID(scopeId));
            this.symbolTable.getScopeByID(scopeId).setRows(s1);
        }
        if (ctx.importedBinding() != null) {
            importAliasName.setImportedBinding(visitImportedBinding(ctx.importedBinding()));
        }
        if (ctx.As() != null) {
            importAliasName.setAs(ctx.As().getText());
        }
        return importAliasName;
    }

    @Override
    public ModuleExportName visitModuleExportName(ParserFile.ModuleExportNameContext ctx) {
        ModuleExportName moduleExportName = new ModuleExportName();
        if (ctx.identifierName() != null) {
            moduleExportName.setIdentifierName(visitIdentifierName(ctx.identifierName()));
        }
        if (ctx.StringLiteral() != null) {
            moduleExportName.setStringLiteral(ctx.StringLiteral().getText());
        }
        return moduleExportName;
    }

    @Override
    public ReservedWord visitReservedWord(ParserFile.ReservedWordContext ctx) {
        ReservedWord reservedWord = new ReservedWord();

        if (ctx.keyword() != null) {
            reservedWord.setKeyword(visitKeyword(ctx.keyword()));
        }
        if (ctx.NullLiteral() != null) {
            reservedWord.setNullLiteral(ctx.NullLiteral().getText());
        }
        if (ctx.BooleanLiteral() != null) {
            reservedWord.setBoolLiteral(ctx.BooleanLiteral().getText());
//            Row row = new Row();
//            row.setType("Symbol Type : Boolean =====>");
////            row.setValue("Symbol :  " + ctx.BooleanLiteral().getText());
//            row.setValue("Value : " + ctx.BooleanLiteral().getText());
//            row.setLineNumber(0);
//            symbolTable.getRows().add(row);
        }
        return reservedWord;
    }

    @Override
    public NumericLiteral visitNumericLiteral(ParserFile.NumericLiteralContext ctx) {
        NumericLiteral numericLiteral = new NumericLiteral();
        if (ctx.DecimalLiteral() != null) {
            numericLiteral.setDecimalLiteral(ctx.DecimalLiteral().getText());
//            Row row = new Row();
//            row.setType("Variable Type : DecimalLiteral ");
//            row.setValue("Symbol Value :" + ctx.DecimalLiteral().getText());
//            row.setLineNumber(0);
//            symbolTable.getRows().add(row);
        }
        return numericLiteral;
    }

    @Override
    public IdentifierName visitIdentifierName(ParserFile.IdentifierNameContext ctx) {
        IdentifierName identifierName = new IdentifierName();
        if (ctx.identifier() != null) {
            identifierName.setIdentifier(visitIdentifier(ctx.identifier()));
        }
        if (ctx.reservedWord() != null) {
            identifierName.setReservedWord(visitReservedWord(ctx.reservedWord()));
        }
        return identifierName;
    }

    @Override
    public Identifier visitIdentifier(ParserFile.IdentifierContext ctx) {
        Identifier identifier = new Identifier();
        if (ctx.Identifier() != null) {
            identifier.setIdentifier(ctx.Identifier().getText());
        }
        if (ctx.Async() != null) {
            identifier.setAsync(ctx.Async().getText());
        }
        if (ctx.As() != null) {
            identifier.setAs(ctx.As().getText());
        }
        if (ctx.From() != null) {
            identifier.setFrom(ctx.From().getText());
        }
        if (ctx.Yield() != null) {
            identifier.setYield(ctx.Yield().getText());
        }
        if (ctx.Of() != null) {
            identifier.setOf(ctx.Of().getText());
        }
        if (ctx.Any() != null) {
            identifier.setAny(ctx.Any().getText());
        }
        if (ctx.Number() != null) {
            identifier.setNumber(ctx.Number().getText());
        }
        if (ctx.Boolean() != null) {
            identifier.setBool(ctx.Boolean().getText());
        }
        if (ctx.String() != null) {
            identifier.setString(ctx.String().getText());
        }
        if (ctx.Unique() != null) {
            identifier.setUnique(ctx.Unique().getText());
        }
        if (ctx.Symbol() != null) {
            identifier.setSymbol(ctx.Symbol().getText());
        }
        if (ctx.Selector() != null) {
            identifier.setSelector(ctx.Selector().getText());
        }
        if (ctx.Never() != null) {
            identifier.setNever(ctx.Never().getText());
        }
        if (ctx.Undefined() != null) {
            identifier.setUndefined(ctx.Undefined().getText());
        }
        if (ctx.Object() != null) {
            identifier.setObject(ctx.Object().getText());
        }
        if (ctx.KeyOf() != null) {
            identifier.setKeyOf(ctx.KeyOf().getText());
        }
        if (ctx.TypeAlias() != null) {
            identifier.setTypeAlias(ctx.TypeAlias().getText());
        }
        if (ctx.Constructor() != null) {
            identifier.setConstructor(ctx.Constructor().getText());
        }
        if (ctx.Namespace() != null) {
            identifier.setNamespace(ctx.Namespace().getText());
        }
        if (ctx.Abstract() != null) {
            identifier.setAbstract(ctx.Abstract().getText());
        }
        // Angular-specific identifiers
        if (ctx.StoreModule() != null) {
            identifier.setStoreModule(ctx.StoreModule().getText());
        }
        if (ctx.EffectsModule() != null) {
            identifier.setEffectsModule(ctx.EffectsModule().getText());
        }
        if (ctx.CreateAction() != null) {
            identifier.setCreateAction(ctx.CreateAction().getText());
        }
        if (ctx.CreateReducer() != null) {
            identifier.setCreateReducer(ctx.CreateReducer().getText());
        }
        if (ctx.CreateSelector() != null) {
            identifier.setCreateSelector(ctx.CreateSelector().getText());
        }
        if (ctx.RouterModule() != null) {
            identifier.setRouterModule(ctx.RouterModule().getText());
        }
        if (ctx.ForRoot() != null) {
            identifier.setForRoot(ctx.ForRoot().getText());
        }
        if (ctx.ForFeature() != null) {
            identifier.setForFeature(ctx.ForFeature().getText());
        }
        if (ctx.Select() != null) {
            identifier.setSelect(ctx.Select().getText());
        }
        if (ctx.Dispatch() != null) {
            identifier.setDispatch(ctx.Dispatch().getText());
        }
        if (ctx.Navigate() != null) {
            identifier.setNavigate(ctx.Navigate().getText());
        }
        if (ctx.NavigateByUrl() != null) {
            identifier.setNavigateByUrl(ctx.NavigateByUrl().getText());
        }
        return identifier;
    }

    @Override
    public Keyword visitKeyword(ParserFile.KeywordContext ctx) {
        Keyword keyword = new Keyword();
        if (ctx.Break() != null) {
            keyword.setBreak(ctx.Break().getText());
        }
        if (ctx.Interface() != null) {
            keyword.setInterface(ctx.Interface().getText());

        }
        if (ctx.Do() != null) {
            keyword.setDo(ctx.Do().getText());
        }
        if (ctx.Instanceof() != null) {
            keyword.setInstanceOf(ctx.Instanceof().getText());
        }
        if (ctx.Typeof() != null) {
            keyword.setTypeOf(ctx.Typeof().getText());
        }
        if (ctx.Case() != null) {
            keyword.setCase(ctx.Case().getText());
        }
        if (ctx.Else() != null) {
            keyword.setElse(ctx.Else().getText());
        }
        if (ctx.New() != null) {
            keyword.setNew(ctx.New().getText());
        }
        if (ctx.Var() != null) {
            keyword.setVar(ctx.Var().getText());
        }
        if (ctx.Catch() != null) {
            keyword.setCatch(ctx.Catch().getText());
        }
        if (ctx.Finally() != null) {
            keyword.setFinally(ctx.Finally().getText());
        }
        if (ctx.Return() != null) {
            keyword.setReturn(ctx.Return().getText());
        }
        if (ctx.Void() != null) {
            keyword.setVoid(ctx.Void().getText());
        }
        if (ctx.Continue() != null) {
            keyword.setContinue(ctx.Continue().getText());
        }
        if (ctx.For() != null) {
            keyword.setFor(ctx.For().getText());
        }
        if (ctx.Switch() != null) {
            keyword.setSwitch(ctx.Switch().getText());
        }
        if (ctx.While() != null) {
            keyword.setWhile(ctx.While().getText());
        }
        if (ctx.Debugger() != null) {
            keyword.setDebugger(ctx.Debugger().getText());
        }
        if (ctx.Function_() != null) {
            keyword.setFunction_(ctx.Function_().getText());
        }
        if (ctx.This() != null) {
            keyword.setThis(ctx.This().getText());
        }
        if (ctx.With() != null) {
            keyword.setWith(ctx.With().getText());
        }
        if (ctx.Default() != null) {
            keyword.setDefault(ctx.Default().getText());
        }
        if (ctx.If() != null) {
            keyword.setIf(ctx.If().getText());
        }
        if (ctx.Throw() != null) {
            keyword.setThrow(ctx.Throw().getText());
        }
        if (ctx.Delete() != null) {
            keyword.setDelete(ctx.Delete().getText());
        }
        if (ctx.In() != null) {
            keyword.setIn(ctx.In().getText());
        }
        if (ctx.Try() != null) {
            keyword.setTry(ctx.Try().getText());
        }
        if (ctx.Class() != null) {
            keyword.setClasse(ctx.Class().getText());
        }
        if (ctx.Enum() != null) {
            keyword.setEnum(ctx.Enum().getText());

        }
        if (ctx.Extends() != null) {
            keyword.setExtends(ctx.Extends().getText());
        }
        if (ctx.Super() != null) {
            keyword.setSuper(ctx.Super().getText());
        }
        if (ctx.Const() != null) {
            keyword.setConst(ctx.Const().getText());
        }
        if (ctx.Export() != null) {
            keyword.setExport(ctx.Export().getText());
        }
        if (ctx.Import() != null) {
            keyword.setImport(ctx.Import().getText());
        }
        if (ctx.Implements() != null) {
            keyword.setImplements(ctx.Implements().getText());
        }
        if (ctx.Let() != null) {
            keyword.setLet(ctx.Let().getText());
        }
        if (ctx.Private() != null) {
            keyword.setPrivate(ctx.Private().getText());
        }
        if (ctx.Public() != null) {
            keyword.setPublic(ctx.Public().getText());
        }
        if (ctx.Interface() != null) {
            keyword.setInterface(ctx.Interface().getText());

        }
        if (ctx.Package() != null) {
            keyword.setPackage(ctx.Package().getText());
        }
        if (ctx.Protected() != null) {
            keyword.setProtected(ctx.Protected().getText());
        }
        if (ctx.Static() != null) {
            keyword.setStatic(ctx.Static().getText());
        }
        if (ctx.Yield() != null) {
            keyword.setYield(ctx.Yield().getText());
        }
        if (ctx.Async() != null) {
            keyword.setAsync(ctx.Async().getText());
        }
        if (ctx.Await() != null) {
            keyword.setAwait(ctx.Await().getText());
        }
        if (ctx.ReadOnly() != null) {
            keyword.setReadOnly(ctx.ReadOnly().getText());
        }
        if (ctx.From() != null) {
            keyword.setFrom(ctx.From().getText());
        }
        if (ctx.As() != null) {
            keyword.setAs(ctx.As().getText());
        }
        if (ctx.Require() != null) {
            keyword.setRequire(ctx.Require().getText());
        }
        if (ctx.TypeAlias() != null) {
            keyword.setTypeAlias(ctx.TypeAlias().getText());
        }
        if (ctx.String() != null) {
            keyword.setString(ctx.String().getText());
        }
        if (ctx.Number() != null) {
            keyword.setNumber(ctx.Number().getText());
        }
        if (ctx.Module() != null) {
            keyword.setModule(ctx.Module().getText());
        }
        if (ctx.Break() != null) {
            keyword.setBreak(ctx.Break().getText());
        }

        return keyword;
    }

    @Override
    public Eos visitEos(ParserFile.EosContext ctx) {
        Eos eos = new Eos();
        if (ctx.SemiColon() != null) {
            eos.setSemicolon(ctx.SemiColon().getText());
        }
        return eos;
    }


}
