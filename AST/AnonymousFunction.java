package AST;

public class AnonymousFunction {
    FunctionDeclaration functionDeclaration;
    String async;
    String function_;
    FormalParameterList formalParameterList;
    TypeAnnotation typeAnnotation;
    FunctionBody functionBody;
    ArrowFunctionDeclaration arrowFunctionDeclaration;


    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public String getFunction_() {
        return function_;
    }

    public void setFunction_(String function_) {
        this.function_ = function_;
    }

    public FormalParameterList getFormalParameterList() {
        return formalParameterList;
    }

    public void setFormalParameterList(FormalParameterList formalParameterList) {
        this.formalParameterList = formalParameterList;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    public ArrowFunctionDeclaration getArrowFunctionDeclaration() {
        return arrowFunctionDeclaration;
    }

    public void setArrowFunctionDeclaration(ArrowFunctionDeclaration arrowFunctionDeclaration) {
        this.arrowFunctionDeclaration = arrowFunctionDeclaration;
    }

    @Override
    public String toString() {
        if (functionDeclaration != null) {
            return "AnonymousFunction{" +
                    "functionDeclaration=" + functionDeclaration + '\n' +
                    '}';
        } else if (functionBody != null && function_ != null) {
            if (async != null) {
                if (formalParameterList != null) {
                    if (typeAnnotation != null) {
                        return "RequiredParameter{\n" +
                                "async=" + async + '\n' +
                                ", formalParameterList=" + formalParameterList + '\n' +
                                ", function_='" + function_ + '\n' +
                                ", typeAnnotation=" + typeAnnotation + '\n' +
                                ", functionBody=" + functionBody + '\n' +
                                '}';
                    } else {
                        return "RequiredParameter{" +
                                "async=" + async +
                                "function_=" + function_ + '\n' +
                                ", formalParameterList=" + formalParameterList +
                                ", functionBody=" + functionBody + '\n' +
                                '}';
                        // Case 2: async and formalParameterList are not null, typeAnnotation is null
                    }
                } else {
                    if (typeAnnotation != null) {
                        return "RequiredParameter{" +
                                "async=" + async + '\n' +
                                ", Function_=" + function_ + '\n' +
                                ", typeAnnotation=" + typeAnnotation + '\n' +
                                ", functionBody=" + functionBody + '\n' +
                                '}';
                        // Case 3: async and typeAnnotation are not null, formalParameterList is null
                    } else {
                        return "RequiredParameter{" +
                                "async=" + async +
                                ", Function_=" + function_ +
                                ", functionBody=" + functionBody + '\n' +
                                '}';
                        // Case 4: async is not null, formalParameterList and typeAnnotation are null
                    }
                }
            } else {
                if (formalParameterList != null) {
                    if (typeAnnotation != null) {
                        return "RequiredParameter{" +
                                ", formalParameterList=" + formalParameterList + '\n' +
                                ", Function_=" + function_ + '\n' +
                                ", typeAnnotation=" + typeAnnotation + '\n' +
                                ", functionBody=" + functionBody + '\n' +
                                '}';
                        // Case 5: formalParameterList and typeAnnotation are not null, async is null
                    } else {
                        return "RequiredParameter{" +
                                ", formalParameterList=" + formalParameterList + '\n' +
                                ", Function_=" + function_ + '\n' +
                                ", functionBody=" + functionBody + '\n' +
                                '}';
                        // Case 6: formalParameterList is not null, async and typeAnnotation are null
                    }
                } else {
                    if (typeAnnotation != null) {
                        return "RequiredParameter{" +
                                ", Function_=" + function_ + '\n' +
                                ", typeAnnotation=" + typeAnnotation + '\n' +
                                ", functionBody=" + functionBody + '\n' +
                                '}';
                        // Case 7: typeAnnotation is not null, async and formalParameterList are null
                    } else {
                        return "RequiredParameter{" +
                                ", Function_=" + function_ + '\n' +
                                ", functionBody=" + functionBody + '\n' +
                                '}';
                        // Case 8: All are null
                    }
                }
            }

        }
        return "AnonymousFunction{" +
                ", arrowFunctionDeclaration=" + arrowFunctionDeclaration +
                '}';
    }
}
