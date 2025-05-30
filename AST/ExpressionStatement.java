package AST;

public class ExpressionStatement {
    ExpressionSequence expressionSequence;
//    String SemiColon;

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }

//    public String getSemColon() {
//        return SemiColon;
//    }

//    public void setSemiColon(String semiColon) {
//        SemiColon = semiColon;
//    }

    @Override
    public String toString() {
        return "ExpressionStatement{" + '\n' +
                expressionSequence + '\n' +
//                    ",SemiColon=" + SemiColon + '\n' +

                '}';
    }
}
