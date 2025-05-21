package AST;

public class WithStatement {
    String With;
    ExpressionSequence expressionSequence;
    Statement statement;

    public String getWith() {
        return With;
    }

    public void setWith(String with) {
        With = with;
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
        return "WithStatement{\n" +
                "With='" + With + '\'' +
                ", expressionSequence=" + expressionSequence +
                ", statement=" + statement +
                '}';
    }
}
