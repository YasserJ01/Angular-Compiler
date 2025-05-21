package AST;

public class ObjectExpressionSequence {
    ExpressionSequence expressionSequence;

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }

    @Override
    public String toString() {
        return "ObjectExpressionSequence{" +'\n'+
                expressionSequence +'\n'+
                '}';
    }
}
