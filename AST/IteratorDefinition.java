package AST;

public class IteratorDefinition {
    SingleExpression singleExpression;
    FormalParameterList formalParameterList;
    FunctionBody functionBody;

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public FormalParameterList getFormalParameterList() {
        return formalParameterList;
    }

    public void setFormalParameterList(FormalParameterList formalParameterList) {
        this.formalParameterList = formalParameterList;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        if (formalParameterList != null) {
            return "IteratorDefinition{" +
                    "singleExpression=" + singleExpression +
                    ", formalParameterList=" + formalParameterList +
                    ", functionBody=" + functionBody +
                    '}';
        }
        return "IteratorDefinition{" +
                "singleExpression=" + singleExpression +
                ", functionBody=" + functionBody +
                '}';
    }
}
