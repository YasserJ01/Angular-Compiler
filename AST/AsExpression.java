package AST;

public class AsExpression {
    PredefinedType predefinedType;
    SingleExpression singleExpression;

    public PredefinedType getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(PredefinedType predefinedType) {
        this.predefinedType = predefinedType;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    @Override
    public String toString() {
        if (predefinedType!=null) {
            return "AsExpression{" +
                    "predefinedType=" + predefinedType +
                    '}';
        }
        return "AsExpression{" +
                ", singleExpression=" + singleExpression +
                '}';
    }
}
