package AST;

public class HtmlAttributeValue {
    String attributeValue;
    String stringLiteral;
    ObjectExpressionSequence objectExpressionSequence;

    InterpolationExpression interpolationExpression;


    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public ObjectExpressionSequence getObjectExpressionSequence() {
        return objectExpressionSequence;
    }

    public void setObjectExpressionSequence(ObjectExpressionSequence objectExpressionSequence) {
        this.objectExpressionSequence = objectExpressionSequence;
    }

    public InterpolationExpression getInterpolationExpression() {
        return interpolationExpression;
    }

    public void setInterpolationExpression(InterpolationExpression interpolationExpression) {
        this.interpolationExpression = interpolationExpression;
    }

    @Override
    public String toString() {
        if (attributeValue != null) {
            return "HtmlAttributeValue{" +
                    "attributeValue='" + attributeValue + '\n' +
                    '}';

        } else if (stringLiteral != null) {
            return "HtmlAttributeValue{" +
                    "stringLiteral='" + stringLiteral + '\n' +
                    '}';
        } else if (interpolationExpression != null) {
            return "HtmlAttributeValue{" + '\n' +
                    "interpolationExpression" + interpolationExpression + '\n' +
                    '}';
        }
        return "HtmlAttributeValue{" +
                "objectExpressionSequence=" + objectExpressionSequence +
                '}';
    }
}
