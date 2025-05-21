package AST;

public class CallSignature {
    TypeParameters typeParameters;
    ParameterList parameterList;
    TypeAnnotation typeAnnotation;

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

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    @Override
    public String toString() {
        if (typeParameters != null) {
            if (parameterList != null) {
                if (typeAnnotation != null) {
                    return "CallSignature{" +'\n'+
                            typeParameters +'\n'+
                            parameterList +'\n'+
                            typeAnnotation +'\n'+
                            '}';
                } else {
                    return "CallSignature{" +'\n'+
                            typeParameters +'\n'+
                            parameterList +'\n'+
                            '}';
                    // Case 2: typeParameters and parameterList are not null, typeAnnotation is null
                }
            } else {
                if (typeAnnotation != null) {
                    return "CallSignature{" +'\n'+
                            typeParameters +'\n'+
                            typeAnnotation +'\n'+
                            '}';
                    // Case 3: typeParameters and typeAnnotation are not null, parameterList is null
                } else {
                    return "CallSignature{" +'\n'+
                            typeParameters +'\n'+
                            '}';
                    // Case 4: typeParameters is not null, parameterList and typeAnnotation are null
                }
            }
        } else {
            if (parameterList != null) {
                if (typeAnnotation != null) {
                    return "CallSignature{" +'\n'+
                            parameterList +'\n'+
                            typeAnnotation +'\n'+
                            '}';
                    // Case 5: parameterList and typeAnnotation are not null, typeParameters is null
                } else {
                    return "CallSignature{" +
                            parameterList +'\n'+
                            '}';
                    // Case 6: parameterList is not null, typeParameters and typeAnnotation are null
                }
            } else {
                if (typeAnnotation != null) {
                    return "CallSignature{" +'\n'+
                            typeAnnotation +'\n'+
                            '}';
                    // Case 7: typeAnnotation is not null, typeParameters and parameterList are null
                } else {
                    return "CallSignature{" +'\n'+
                            '}';
                    // Case 8: All are null
                }
            }
        }
    }

//        return "CallSignature{" +
//                "typeParameters=" + typeParameters +
//                ", parameterList=" + parameterList +
//                ", typeAnnotation=" + typeAnnotation +
//                '}'
}
