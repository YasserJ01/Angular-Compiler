package AST;

public class SingleExpression {
    AnonymousFunction anonymousFunction;

    String Classe;

    Identifier identifier;
    TypeParameters typeParameters;
    ClassHeritage classHeritage;
    ClassTail classTail;
    ExpressionSequence expressionSequence;
    IdentifierName identifierName;
    TypeGeneric typeGeneric;
    TypeArguments typeArguments;
    Arguments arguments;
    String New;
    String Delete;
    String Void;
    String TypeOf;
    String Await;
    String InstanceOf;
    String In;
    AssignmentOperator assignmentOperator;
    IteratorBlock iteratorBlock;
    GeneratorBlock generatorBlock;
    //    GeneratorFunctionDeclaration generatorFunctionDeclaration;
    YieldStatement yieldStatement;
    String This;
    String Super;
    Literal literal;
    ArrayLiteral arrayLiteral;
    ObjectLiteral objectLiteral;
    AsExpression asExpression;
    SingleExpression singleExpression;
    HtmlElement htmlElement;
    String As;


    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    public AnonymousFunction getAnonymousFunction() {
        return anonymousFunction;
    }

    public void setAnonymousFunction(AnonymousFunction anonymousFunction) {
        this.anonymousFunction = anonymousFunction;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public TypeParameters getTypeParameters() {
        return typeParameters;
    }

    public void setTypeParameters(TypeParameters typeParameters) {
        this.typeParameters = typeParameters;
    }

    public ClassHeritage getClassHeritage() {
        return classHeritage;
    }

    public void setClassHeritage(ClassHeritage classHeritage) {
        this.classHeritage = classHeritage;
    }

    public ClassTail getClassTail() {
        return classTail;
    }

    public void setClassTail(ClassTail classTail) {
        this.classTail = classTail;
    }

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }

    public IdentifierName getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(IdentifierName identifierName) {
        this.identifierName = identifierName;
    }

    public TypeGeneric getTypeGeneric() {
        return typeGeneric;
    }

    public void setTypeGeneric(TypeGeneric typeGeneric) {
        this.typeGeneric = typeGeneric;
    }

    public TypeArguments getTypeArguments() {
        return typeArguments;
    }

    public void setTypeArguments(TypeArguments typeArguments) {
        this.typeArguments = typeArguments;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    public String getNew() {
        return New;
    }

    public void setNew(String aNew) {
        New = aNew;
    }

    public String getDelete() {
        return Delete;
    }

    public void setDelete(String delete) {
        Delete = delete;
    }

    public String getVoid() {
        return Void;
    }

    public void setVoid(String aVoid) {
        Void = aVoid;
    }

    public String getTypeOf() {
        return TypeOf;
    }

    public void setTypeOf(String typeOf) {
        TypeOf = typeOf;
    }

    public String getAwait() {
        return Await;
    }

    public void setAwait(String await) {
        Await = await;
    }

    public String getInstanceOf() {
        return InstanceOf;
    }

    public void setInstanceOf(String instanceOf) {
        InstanceOf = instanceOf;
    }

    public String getIn() {
        return In;
    }

    public void setIn(String in) {
        In = in;
    }

    public AssignmentOperator getAssignmentOperator() {
        return assignmentOperator;
    }

    public void setAssignmentOperator(AssignmentOperator assignmentOperator) {
        this.assignmentOperator = assignmentOperator;
    }

    public IteratorBlock getIteratorBlock() {
        return iteratorBlock;
    }

    public void setIteratorBlock(IteratorBlock iteratorBlock) {
        this.iteratorBlock = iteratorBlock;
    }

    public GeneratorBlock getGeneratorBlock() {
        return generatorBlock;
    }

    public void setGeneratorBlock(GeneratorBlock generatorBlock) {
        this.generatorBlock = generatorBlock;
    }

//    public GeneratorFunctionDeclaration getGeneratorFunctionDeclaration() {
//        return generatorFunctionDeclaration;
//    }
//
//    public void setGeneratorFunctionDeclaration(GeneratorFunctionDeclaration generatorFunctionDeclaration) {
//        this.generatorFunctionDeclaration = generatorFunctionDeclaration;
//    }

    public YieldStatement getYieldStatement() {
        return yieldStatement;
    }

    public void setYieldStatement(YieldStatement yieldStatement) {
        this.yieldStatement = yieldStatement;
    }

    public String getThis() {
        return This;
    }

    public void setThis(String aThis) {
        This = aThis;
    }

    public String getSuper() {
        return Super;
    }

    public void setSuper(String aSuper) {
        Super = aSuper;
    }

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public AsExpression getAsExpression() {
        return asExpression;
    }

    public void setAsExpression(AsExpression asExpression) {
        this.asExpression = asExpression;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String classe) {
        Classe = classe;
    }

    public String getAs() {
        return As;
    }

    public void setAs(String as) {
        As = as;
    }

    @Override
    public String toString() {
        if (anonymousFunction != null) {
            return "SingleExpression{" + '\n'+
                    "anonymousFunction=" + anonymousFunction + '\n' +
                    '}';
        } else if (classHeritage != null && classTail != null && Classe != null) {
            if (identifier != null) {
                if (typeParameters != null) {
                    return "SingleExpression{" + '\n'+
                            "Class=" + Classe +
                            ", identifier=" + identifier +
                            ", typeParameters=" + typeParameters +
                            ", classHeritage=" + classHeritage +
                            ", classTail=" + classTail +
                            '}';
                } else {
                    return "SingleExpression{" + '\n'+
                            "Class=" + Classe +
                            ", identifier=" + identifier +
                            ", classHeritage=" + classHeritage +
                            ", classTail=" + classTail +
                            '}';
                }
            } else {
                if (typeParameters != null) {
                    return "SingleExpression{" + '\n'+
                            "Class=" + Classe +
                            ", typeParameters=" + typeParameters +
                            ", classHeritage=" + classHeritage +
                            ", classTail=" + classTail +
                            '}';
                } else {
                    return "SingleExpression{" + '\n'+
                            "Class=" + Classe +
                            ", classHeritage=" + classHeritage +
                            ", classTail=" + classTail +
                            '}';
                }
            }
        } else if (expressionSequence != null) {
            return "SingleExpression{" + '\n'+
                    "singleExpression=" + singleExpression + '\n' +
                    ", expressionSequence=" + expressionSequence +
                    '}';
        } else if (identifierName != null) {

            return "SingleExpression{" + '\n'+
                    identifierName +'\n'+
                    singleExpression + '\n' +
//                            ",typeGeneric=" + typeGeneric +
                    '}';


//                else {
//                    return "SingleExpression{" + '\n'+
//                            "singleExpression=" + singleExpression + '\n' +
//                            ", identifierName=" + identifierName +
//                            '}';
//                }
        } else if (typeGeneric != null) {
            return "SingleExpression{" + '\n'+
                    "singleExpression=" + singleExpression + '\n' +
                    ", typeGeneric=" + typeGeneric +
                    '}';
        } else if (arguments != null) {
            if (typeArguments != null) {
                return "SingleExpression{" + '\n'+
                        "New=" + New +'\n'+
                         singleExpression + '\n' +
                         typeArguments + '\n' +
                        ", arguments=" + arguments + '\n' +
                        '}';
            } else {
                return "SingleExpression{" + '\n'+
                        "New=" + New +'\n'+
                         singleExpression + '\n' +
                        ", arguments=" + arguments + '\n' +
                        '}';
            }
        } else if (typeArguments != null) {
            return "SingleExpression{" + '\n'+
                    "New=" + New +'\n'+
                     singleExpression + '\n' +
                     typeArguments + '\n' +
                    '}';
        } else if (Delete != null) {
            return "SingleExpression{" + '\n'+
                    "Delete=" + Delete +
                     singleExpression + '\n' +
                    '}';
        } else if (Void != null) {
            return "SingleExpression{" + '\n'+
                    "Void=" + Void +
                     singleExpression + '\n' +
                    '}';

        } else if (TypeOf != null) {
            return "SingleExpression{" + '\n'+
                    "TypeOf=" + TypeOf +
                     singleExpression + '\n' +
                    '}';
        } else if (Await != null) {
            return "SingleExpression{" + '\n'+
                    "Await=" + Await +
                     singleExpression + '\n' +
                    '}';
        } else if (InstanceOf != null) {
            return "SingleExpression{" + '\n'+
                     singleExpression + '\n' +
                    "InstanceOf=" + InstanceOf +
                     singleExpression + '\n' +
                    '}';
        } else if (In != null) {
            return "SingleExpression{" + '\n'+
                     singleExpression + '\n' +
                    "In=" + In +
                     singleExpression + '\n' +
                    '}';

        } else if (assignmentOperator != null) {
            return "SingleExpression{" + '\n'+
                     singleExpression + '\n' +
                    "assignmentOperator=" + assignmentOperator + '\n' +
                     singleExpression + '\n' +
                    '}';

        } else if (iteratorBlock != null) {
            return "SingleExpression{" + '\n'+
                    "iteratorBlock=" + iteratorBlock + '\n' +
                    '}';

        } else if (generatorBlock != null) {
            return "SingleExpression{" + '\n'+
                    "generatorBlock=" + generatorBlock + '\n' +
                    '}';

        } /*else if (ckas != null) {
                return "SingleExpression{" + '\n'+
                        "generatorFunctionDeclaration=" + generatorFunctionDeclaration + '\n' +
                        '}';
            */ else if (yieldStatement != null) {
            return "SingleExpression{" + '\n'+
                    "yieldStatement=" + yieldStatement + '\n' +
                    '}';
        } else if (htmlElement != null) {
            return "SingleExpression{" + '\n'+'\n'+
                     htmlElement + '\n' +
                    '}';

        } else if (This != null) {
            return "SingleExpression{" + '\n'+
                    "This=" + This + '\n' +
                    '}';
        } else if (Super != null) {
            return "SingleExpression{" + '\n'+
                    "Super=" + Super + '\n' +
                    '}';
        } else if (literal != null) {
            return "SingleExpression{" + '\n'+'\n'+
                    literal + '\n' +
                    '}';
        } else if (arrayLiteral != null) {
            return "SingleExpression{" + '\n'+'\n'+
                    arrayLiteral + '\n' +
                    '}';
        } else if (objectLiteral != null) {
            return "SingleExpression{" + '\n'+ '\n' +
                    objectLiteral + '\n' +
                    '}';
        } else if (asExpression != null && As != null) {
            return "SingleExpression{" + '\n'+
                    "singleExpression=" + singleExpression + '\n' +
                    ", As=" + As + '\n' +
                    ", asExpression=" + asExpression + '\n' +
                    '}';
        }

        return "SingleExpression{" + '\n'+
                "singleExpression=" + singleExpression + '\n' +
                '}';
    }
}
