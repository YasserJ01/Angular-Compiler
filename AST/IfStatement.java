package AST;

public class IfStatement {
    String If;
    ExpressionSequence expressionSequence;
    Statement statement;
    String Else;

    public String getIf() {
        return If;
    }

    public void setIf(String anIf) {
        If = anIf;
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

    public String getElse() {
        return Else;
    }

    public void setElse(String anElse) {
        Else = anElse;
    }

    @Override
    public String toString() {
        if (statement != null && Else != null) {
            return "IfStatement{" +
                    "If='" + If + '\'' + '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +
                    ", statement=" + statement + '\n' +
                    ", Else='" + Else + '\n' +
                    ", statement=" + statement + '\n' +
                    '}';
        }
        return "IfStatement{" +
                "If='" + If + '\n' +
                ", expressionSequence=" + expressionSequence + '\n' +
                ", statement=" + statement + '\n' +
                '}';
    }
}
