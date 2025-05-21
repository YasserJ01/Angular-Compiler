package AST;

public class LastFormalParameterArg {
    String ellipsis;
    Identifier identifier;
    TypeAnnotation typeAnnotation;

    public String getEllipsis() {
        return ellipsis;
    }

    public void setEllipsis(String ellipsis) {
        this.ellipsis = ellipsis;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    @Override
    public String toString() {
        if (typeAnnotation != null) {
            return "LastFormalParameterArg{" +
                    "ellipsis='" + ellipsis + '\n' +
                    ", identifier=" + identifier + '\n' +
                    ", typeAnnotation=" + typeAnnotation + '\n' +
                    '}';
        }
        return "LastFormalParameterArg{" +
                "ellipsis='" + ellipsis + '\n' +
                ", identifier=" + identifier + '\n' +
                '}';
    }
}
