package AST;

public class ImportAliasDeclaration {
    Identifier identifier;
    NamespaceName nameSpaceName;

    String semicolon;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public NamespaceName getNamespaceName() {
        return nameSpaceName;
    }

    public void setNamespaceName(NamespaceName nameSpaceName) {
        this.nameSpaceName = nameSpaceName;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        return '\n' +
                "identifier=" + identifier +'\n'+
                ", nameSpaceName=" + nameSpaceName +'\n'+
                ", semicolon='" + semicolon +'\n'+
                '}';
    }
}
