package AST;

public class DoStatement {
    String Do;
    Statement statement;
    String whilee;
    ExpressionSequence expressionSequence;

    public String getDo() {
        return Do;
    }

    public void setDo(String aDo) {
        Do = aDo;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

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

    @Override
    public String toString() {
        return "DoStatement{" +'\n' +
                  Do + '\n' +
                ", statement=" + statement +'\n' +
                ", expressionSequence=" + expressionSequence +'\n' +
                '}';
    }
}
