package AST;

import java.util.ArrayList;
import java.util.List;

public class CaseClause {
    String Case;
    ExpressionSequence expressionSequence;
    List<StatementList> statementList = new ArrayList<StatementList>();

    public String getCase() {
        return Case;
    }

    public void setCase(String aCase) {
        Case = aCase;
    }

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
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
            return "CaseClause\n" +'{'+
                    ", Case=" + Case + '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +
                    ", statementList=" + statementList+
            '}';
        }
        return "CaseClause\n" +'{'+
                ", Case=" + Case + '\n' +
                ", expressionSequence=" + expressionSequence +
                '}';
    }
}
