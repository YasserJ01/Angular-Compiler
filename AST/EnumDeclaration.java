package AST;

public class EnumDeclaration {
    String constant;
    String enumerate;

    Identifier identifier;

    EnumBody enumBody;

    public String getConstant() {
        return constant;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }

    public String getEnumerate() {
        return enumerate;
    }

    public void setEnumerate(String enumerate) {
        this.enumerate = enumerate;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public EnumBody getEnumBody() {
        return enumBody;
    }

    public void setEnumBody(EnumBody enumBody) {
        this.enumBody = enumBody;
    }

    @Override
    public String toString() {
        return '\n' +
                "constant='" + constant + '\'' + '\n' +
                ", enumerate='" + enumerate + '\'' + '\n' +
                ", identifier=" + identifier + '\n' +
                ", enumBody=" + enumBody + '\n' +
                '}';
    }
}
