package AST;

public class TypeParameter {
    Identifier identifier;
    Constraint constraint;
    TypeArgument typeArgument;
    TypeParameters typeParameters;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Constraint getConstraint() {
        return constraint;
    }

    public void setConstraint(Constraint constraint) {
        this.constraint = constraint;
    }

    public TypeArgument getTypeArgument() {
        return typeArgument;
    }

    public void setTypeArgument(TypeArgument typeArgument) {
        this.typeArgument = typeArgument;
    }

    public TypeParameters getTypeParameters() {
        return typeParameters;
    }

    public void setTypeParameters(TypeParameters typeParameters) {
        this.typeParameters = typeParameters;
    }

    @Override
    public String toString() {
        if (identifier!=null) {
            if (constraint != null) {
                return "TypeParameter{" +
                        "identifier=" + identifier +'\n'+
                        ", constraint=" + constraint +'\n'+
                        '}';
            } else {
                return "TypeParameter{" +
                        "identifier=" + identifier +'\n'+
                        ", typeArgument=" + typeArgument +'\n'+
                        '}';
            }
        }
        return "TypeParameter{" +
                ", typeParameters=" + typeParameters +
                '}';
    }
}
