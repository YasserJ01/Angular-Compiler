package AST;

public class ReturnStatement {
    String Return;
    ExpressionSequence expressionSequence;
    Eos eos;

    public String getReturn() {
        return Return;
    }

    public void setReturn(String aReturn) {
        Return = aReturn;
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
        if (expressionSequence != null ) {
            return '\n' +'{'+
                    ", Return=" + Return + '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +
                    ", eos=" + eos + '\n' +

                    '}';
        }
        return '\n' +'{'+
                ", Return=" + Return + '\n' +
                ", eos=" + eos + '\n' +
                '}';
    }
}
