package AST;

public class ModuleExportName {
    String StringLiteral;
    IdentifierName identifierName;

    public String getStringLiteral() {
        return StringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        StringLiteral = stringLiteral;
    }

    public IdentifierName getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(IdentifierName identifierName) {
        this.identifierName = identifierName;
    }

    @Override
    public String toString() {
        if (StringLiteral != null) {
            return "ModuleExportName\n" +
                    "StringLiteral='" + StringLiteral + '\n';
        } else if (identifierName != null) {
            return "ModuleExportName\n" +
                    identifierName + '\n' +
                    '}';
        }

        return " ";

    }

}
