package AST;

public class YieldStatement {
    String Yield;
    String YieldStar;
    ExpressionSequence expressionSequence;
    Eos eos;

    public String getYield() {
        return Yield;
    }

    public void setYield(String yield) {
        Yield = yield;
    }

    public String getYieldStar() {
        return YieldStar;
    }

    public void setYieldStar(String yieldStar) {
        YieldStar = yieldStar;
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
        if (expressionSequence != null) {
            if (Yield != null) {
                return '\n' + '{' +
                        ", Yield=" + Yield + '\n' +
                        ", expressionSequence=" + expressionSequence + '\n' +
                        ", eos=" + eos + '\n' +

                        '}';
            }
            if (YieldStar != null) {
                return '\n' + '{' +
                        ", YieldStar=" + YieldStar + '\n' +
                        ", expressionSequence=" + expressionSequence + '\n' +
                        ", eos=" + eos + '\n' +

                        '}';
            }
        }
        if (Yield != null) {
            return '\n' + '{' +
                    ", Yield=" + Yield + '\n' +
                    ", eos=" + eos + '\n' +
                    '}';
        } else if (YieldStar != null) {
            return '\n' + '{' +
                    ", YieldStar=" + YieldStar + '\n' +
                    ", eos=" + eos + '\n' +
                    '}';
        }
        return "";
    }
}
