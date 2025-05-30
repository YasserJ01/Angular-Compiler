package AST;

public class ForVarInStatement {
    String For;
    VarModifier varModifier;
    VariableDeclaration variableDeclaration;
    String in;
    ExpressionSequence expressionSequence;
    Statement statement;

    public String getFor() {
        return For;
    }

    public void setFor(String aFor) {
        For = aFor;
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
        return "ForVarInStatement{" +'\n' +
                For + '\n' +
                ", varModifier=" + varModifier +'\n' +
                ", variableDeclaration=" + variableDeclaration +'\n' +
                in +'\n' +
                ", expressionSequence=" + expressionSequence +'\n' +
                ", statement=" + statement +'\n' +
                '}';
    }
}
