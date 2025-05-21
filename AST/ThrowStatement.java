package AST;

public class ThrowStatement {
    String Throw;
    ExpressionSequence expressionSequence;
    Eos eos;

    public String getThrow() {
        return Throw;
    }

    public void setThrow(String aThrow) {
        Throw = aThrow;
    }

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }

    @Override
    public String toString() {
        return "ThrowStatement{\n" +
                "Throw='" + Throw + '\'' +
                ", expressionSequence=" + expressionSequence +
                ", eos=" + eos +
                '}';
    }
}
