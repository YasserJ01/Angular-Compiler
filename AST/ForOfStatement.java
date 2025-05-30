package AST;

public class ForOfStatement {
    String For;
    String Await;
    SingleExpression singleExpression;
    Identifier identifier;
    ExpressionSequence expressionSequence;
    String As;
    Type_ type;
    Statement statement;

    public String getFor() {
        return For;
    }

    public void setFor(String aFor) {
        For = aFor;
    }

    public String getAwait() {
        return Await;
    }

    public void setAwait(String await) {
        Await = await;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }

    public String getAs() {
        return As;
    }

    public void setAs(String as) {
        As = as;
    }

    public Type_ getType() {
        return type;
    }

    public void setType(Type_ type) {
        this.type = type;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "ForOfStatement{" + '\n' +
                For + '\n' +
                Await + '\n' +
                ", singleExpression=" + singleExpression + '\n' +
                ", identifier=" + identifier + '\n' +
                ", expressionSequence=" + expressionSequence + '\n' +
                As + '\n' +
                ", type=" + type + '\n' +
                ", statement=" + statement + '\n' +
                '}';
    }
}
