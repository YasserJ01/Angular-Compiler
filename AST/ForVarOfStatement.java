package AST;

public class ForVarOfStatement {
    String For;
    String Await;
    VarModifier varModifier;
    VariableDeclaration variableDeclaration;
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

    public VarModifier getVarModifier() {
        return varModifier;
    }

    public void setVarModifier(VarModifier varModifier) {
        this.varModifier = varModifier;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
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
        return "ForVarOfStatement{" + '\n' +
                For + '\n' +
                Await + '\n' +
                ", varModifier=" + varModifier + '\n' +
                ", variableDeclaration=" + variableDeclaration + '\n' +
                ", identifier=" + identifier + '\n' +
                ", expressionSequence=" + expressionSequence + '\n' +
                As + '\n' +
                ", type=" + type + '\n' +
                ", statement=" + statement + '\n' +
                '}';
    }
}
