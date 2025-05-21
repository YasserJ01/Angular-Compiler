package AST;

public class FunctionType {
    TypeParameters typeParameters;
    ParameterList parameterList;
    Type_ type_;

    public TypeParameters getTypeParameters() {
        return typeParameters;
    }

    public void setTypeParameters(TypeParameters typeParameters) {
        this.typeParameters = typeParameters;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public Type_ getType_() {
        return type_;
    }

    public void setType_(Type_ type_) {
        this.type_ = type_;
    }

    @Override
    public String toString() {
        if (typeParameters != null) {
            if (parameterList != null) {
                return "FunctionType{" +
                        "typeParameters=" + typeParameters +
                        ", parameterList=" + parameterList +
                        ", type_=" + type_ +
                        '}';
            } else {
                return "FunctionType{" +
                        "typeParameters=" + typeParameters +
                        ", type_=" + type_ +
                        '}';
            }
        } else {
            if (parameterList != null) {
                return "FunctionType{" +
                        ", parameterList=" + parameterList +
                        ", type_=" + type_ +
                        '}';
            } else {
                return "FunctionType{" +
                        ", type_=" + type_ +
                        '}';
            }
        }

    }
}
