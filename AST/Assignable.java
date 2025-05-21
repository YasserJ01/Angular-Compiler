package AST;

public class Assignable {
    Identifier identifier;
    Keyword keyword;
    ArrayLiteral arrayLiteral;
    ObjectLiteral objectLiteral;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
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

    @Override
    public String toString() {
        if (identifier != null) {
            return "Assignable{" +
                    "identifier=" + identifier +
                    '}';
        } else if (keyword != null) {
            return "Assignable{" +
                    ", keyword=" + keyword +

                    '}';

        } else if (arrayLiteral != null) {
            return "Assignable{" +
                    ", arrayLiteral=" + arrayLiteral +
                    '}';

        }
        return "Assignable{" +
                ", objectLiteral=" + objectLiteral +
                '}';
    }
}
