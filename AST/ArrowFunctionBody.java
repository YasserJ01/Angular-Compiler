package AST;

public class ArrowFunctionBody {
    SingleExpression singleExpression;
    FunctionBody functionBody;

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        if (singleExpression != null) {
            return "ArrowFunctionBody{" +
                    "singleExpression=" + singleExpression + '\n' +
                    '}';
        }
        return "ArrowFunctionBody{" +
                ", functionBody=" + functionBody + '\n' +
                '}';
    }
}
