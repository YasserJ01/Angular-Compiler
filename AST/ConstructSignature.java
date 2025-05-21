package AST;

public class ConstructSignature {
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
                    return "ConstructSignature{" +
                            "typeParameters=" + typeParameters + '\n' +
                            ", parameterList=" + parameterList + '\n' +
                            ", typeAnnotation=" + typeAnnotation + '\n' +
                            '}';
                    // Case 1: All are not null
                } else {
                    return "ConstructSignature{" +
                            "typeParameters=" + typeParameters + '\n' +
                            ", parameterList=" + parameterList + '\n' +
                            '}';
                    // Case 2: typeParameters and parameterList are not null, typeAnnotation is null
                }
            } else {
                if (typeAnnotation != null) {
                    return "ConstructSignature{" +
                            "typeParameters=" + typeParameters + '\n' +
                            ", typeAnnotation=" + typeAnnotation + '\n' +
                            '}';
                    // Case 3: typeParameters and typeAnnotation are not null, parameterList is null
                } else {
                    return "ConstructSignature{" +
                            "typeParameters=" + typeParameters + '\n' +
                            '}';
                    // Case 4: typeParameters is not null, parameterList and typeAnnotation are null
                }
            }
        } else {
            if (parameterList != null) {
                if (typeAnnotation != null) {
                    return "ConstructSignature{" +
                            ", parameterList=" + parameterList + '\n' +
                            ", typeAnnotation=" + typeAnnotation + '\n' +
                            '}';
                    // Case 5: parameterList and typeAnnotation are not null, typeParameters is null
                } else {
                    return "ConstructSignature{" +
                            ", parameterList=" + parameterList + '\n' +
                            '}';
                    // Case 6: parameterList is not null, typeParameters and typeAnnotation are null
                }
            } else {
                if (typeAnnotation != null) {
                    return "ConstructSignature{" +
                            ", typeAnnotation=" + typeAnnotation + '\n' +
                            '}';
                    // Case 7: typeAnnotation is not null, typeParameters and parameterList are null
                } else {
                    return "ConstructSignature{" + '}';
                    // Case 8: All are null
                }
            }
        }
    }
}
