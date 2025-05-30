package AST;

import java.util.ArrayList;
import java.util.List;

public class ForStatement {
    String For;
    List<ExpressionSequence> expressionSequence = new ArrayList<ExpressionSequence>();
    Statement statement;

    public String getFor() {
        return For;
    }

    public void setFor(String aFor) {
        For = aFor;
    }

    public List<ExpressionSequence> getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(List<ExpressionSequence> expressionSequence) {
        this.expressionSequence = expressionSequence;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "ForStatement{" +'\n' +
                For + '\n' +
                ", expressionSequence=" + expressionSequence +'\n' +
                ", statement=" + statement +'\n' +
                '}';
    }
}
