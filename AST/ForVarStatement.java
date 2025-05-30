package AST;

import java.util.ArrayList;
import java.util.List;

public class ForVarStatement {
    String For;
    VarModifier varModifier;
    VariableDeclarationList variableDeclarationList;
    List<ExpressionSequence> expressionSequence = new ArrayList<ExpressionSequence>();
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

    public VariableDeclarationList getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(VariableDeclarationList variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
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
        return "ForVarStatement{" +'\n' +
                For + '\n' +
                ", varModifier=" + varModifier +'\n' +
                ", variableDeclarationList=" + variableDeclarationList +'\n' +
                ", expressionSequence=" + expressionSequence +'\n' +
                ", statement=" + statement +'\n' +
                '}';
    }
}
