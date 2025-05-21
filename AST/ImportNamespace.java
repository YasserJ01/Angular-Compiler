package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportNamespace {
    String As;
    List<IdentifierName> identifierName = new ArrayList<IdentifierName>();

    public String getAs() {
        return As;
    }

    public void setAs(String as) {
        As = as;
    }

    public List<IdentifierName> getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(List<IdentifierName> identifierName) {
        this.identifierName = identifierName;
    }

    @Override
    public String toString() {


        if (As != null && identifierName != null) {
            return '\n' +
                    "identifierName=" + identifierName + '\n' +
                    '}' + '\n' +
                    "as=" + As + '\n' +
                    '}';
        }
        return '\n' + '{' +
                "identifierName=" + identifierName + '\n' +
                '}';

    }
}