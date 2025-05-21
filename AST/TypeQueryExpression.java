package AST;

import java.util.ArrayList;
import java.util.List;

public class TypeQueryExpression {
    Identifier identifier;
    List<IdentifierName> identifierName = new ArrayList<IdentifierName>();

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public List<IdentifierName> getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(List<IdentifierName> identifierName) {
        this.identifierName = identifierName;
    }

    @Override
    public String toString() {
        if (identifier != null) {
            return "TypeQueryExpression{" +
                    "identifier=" + identifier +
                    '}';

        }
        return "TypeQueryExpression{" +
                ", identifierName=" + identifierName +
                '}';

    }
}
