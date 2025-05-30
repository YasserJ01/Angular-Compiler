package AST;

public class WhileStatement {
    String whilee;
    ExpressionSequence expressionSequence;
    Statement statement;

    public String getWhilee() {
        return whilee;
    }

    public void setWhilee(String whilee) {
        this.whilee = whilee;
    }

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
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
        return "WhileStatement{" +'\n' +
                whilee + '\n' +
                ", expressionSequence=" + expressionSequence +'\n' +
                ", statement=" + statement +'\n' +
                '}';
    }
}
