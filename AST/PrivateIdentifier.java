package AST;

public class PrivateIdentifier {
    IdentifierName identifierName;

    public IdentifierName getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(IdentifierName identifierName) {
        this.identifierName = identifierName;
    }

    @Override
    public String toString() {
        return "PrivateIdentifier{" +
                "identifierName=" + identifierName + '\n' +
                '}';
    }
}
