package AST;

import java.util.ArrayList;
import java.util.List;

public class DefaultClause {
    String Default;
    List<StatementList> statementList = new ArrayList<StatementList>();

    public String getDefault() {
        return Default;
    }

    public void setDefault(String aDefault) {
        Default = aDefault;
    }

    public List<StatementList> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<StatementList> statementList) {
        this.statementList = statementList;
    }

    @Override
    public String toString() {
        if (statementList != null) {
            return "DefaultClause\n" +'{'+
                    ", Default=" + Default + '\n' +
                    ", statementList=" + statementList+
                    '}';
        }
        return "DefaultClause\n" +'{'+
                ", Default=" + Default + '\n' +
                '}';
    }
}
