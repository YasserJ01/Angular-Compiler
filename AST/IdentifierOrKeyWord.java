package AST;

public class IdentifierOrKeyWord {
    Identifier identifier;
    String typeAlias;
    String require;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public String getTypeAlias() {
        return typeAlias;
    }

    public void setTypeAlias(String typeAlias) {
        this.typeAlias = typeAlias;
    }

    public String getRequire() {
        return require;
    }

    public void setRequire(String require) {
        this.require = require;
    }

    @Override
    public String toString() {
        if (identifier != null) {
            return "IdentifierOrKeyWord{" +'\n'+
                    identifier + '\n' +
                    '}';
        } else if (typeAlias != null) {
            return "IdentifierOrKeyWord{" +'\n'+
                    typeAlias + '\n' +
                    '}';
        }
        return "IdentifierOrKeyWord{" +'\n'+
                require + '\n' +
                '}';
    }
}
