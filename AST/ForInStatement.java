package AST;

public class ForInStatement {
    String For;
    SingleExpression singleExpression;
    String in;
    ExpressionSequence expressionSequence;
    Statement statement;

    public String getFor() {
        return For;
    }

    public void setFor(String aFor) {
        For = aFor;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
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
        return "ForInStatement{" +'\n' +
                 For + '\n' +
                ", singleExpression=" + singleExpression +'\n' +
                in +'\n' +
                ", expressionSequence=" + expressionSequence +'\n' +
                ", statement=" + statement +'\n' +
                '}';
    }
}
