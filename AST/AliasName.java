package AST;

import java.util.ArrayList;
import java.util.List;

public class AliasName {
    List<IdentifierName> identifierName=new ArrayList<IdentifierName>();
    String as;

    public List<IdentifierName> getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(List<IdentifierName> identifierName) {
        this.identifierName = identifierName;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    @Override
    public String toString() {
        if (identifierName != null && as!=null) {
            return '\n' +
                    ", identifierName=" + identifierName + '\n' +
                    ", as=" + as + '\n' +

                    '}';
        }
        return '\n' +
                ", identifierName=" + identifierName + '\n' +
                '}';
    }
}
