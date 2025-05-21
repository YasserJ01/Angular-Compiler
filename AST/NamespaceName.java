package AST;

import java.util.ArrayList;
import java.util.List;

public class NamespaceName {
    List<Identifier> identifier = new ArrayList<Identifier>();

    public List<Identifier> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return '\n' +
                "identifier=" + identifier + '\n' +
                '}';
    }
}
