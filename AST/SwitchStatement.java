package AST;

public class SwitchStatement {
    String Switch;
    ExpressionSequence expressionSequence;
    CaseBlock caseBlock;

    public String getSwitch() {
        return Switch;
    }

    public void setSwitch(String aSwitch) {
        Switch = aSwitch;
    }

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }

    public CaseBlock getCaseBlock() {
        return caseBlock;
    }

    public void setCaseBlock(CaseBlock caseBlock) {
        this.caseBlock = caseBlock;
    }

    @Override
    public String toString() {
        return "SwitchStatement{\n" +
                "Switch='" + Switch + '\'' +
                ", expressionSequence=" + expressionSequence +
                ", caseBlock=" + caseBlock +
                '}';
    }
}
