package AST;

public class HtmlAttributeValue {
    String attributeValue;
    String stringLiteral;
    ObjectExpressionSequence objectExpressionSequence;

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

    @Override
    public String toString() {
        if (attributeValue != null) {
            return "HtmlAttributeValue{" +
                    "attributeValue='" + attributeValue + '\n' +
                    '}';

        }
        if (stringLiteral != null) {
            return "HtmlAttributeValue{" +
                    "stringLiteral='" + stringLiteral + '\n' +
                    '}';
        }
        return "HtmlAttributeValue{" +
                "objectExpressionSequence=" + objectExpressionSequence +
                '}';
    }
}
