package AST;

import java.util.ArrayList;
import java.util.List;

public class ExpressionSequence {
    List<SingleExpression> singleExpression = new ArrayList<SingleExpression>();

    public List<SingleExpression> getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(List<SingleExpression> singleExpression) {
        this.singleExpression = singleExpression;
    }

    @Override
    public String toString() {
        return "ExpressionSequence{" +'\n'+
                singleExpression + '\n' +
                '}';
    }
}
