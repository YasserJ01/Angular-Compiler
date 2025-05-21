package AST;

public class IndexSignature {
    Identifier identifier;
    String number;
    String string;

    TypeAnnotation typeAnnotation;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    @Override
    public String toString() {
        if (number != null) {
            return "IndexSignature{\n" +
                    "identifier=" + identifier + '\n' +
                    ", number='" + number + '\n' +
                    ", typeAnnotation=" + typeAnnotation +
                    '}';
        } else {
            return "IndexSignature{\n" +
                    "identifier=" + identifier + '\n' +
                    ", string='" + string + '\n' +
                    ", typeAnnotation=" + typeAnnotation +
                    '}';
        }
    }
}
