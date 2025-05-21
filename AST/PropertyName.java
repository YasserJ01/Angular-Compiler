package AST;

public class PropertyName {
    IdentifierName identifierName;
    String stringLiteral;
    NumericLiteral numericLiteral;
    SingleExpression singleExpression;

    public IdentifierName getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(IdentifierName identifierName) {
        this.identifierName = identifierName;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public NumericLiteral getNumericLiteral() {
        return numericLiteral;
    }

    public void setNumericLiteral(NumericLiteral numericLiteral) {
        this.numericLiteral = numericLiteral;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    @Override
    public String toString() {
        if (identifierName != null) {
            return "PropertyName{" +'\n'+
                    identifierName +'\n'+
                    '}';
        } else if (stringLiteral != null) {
            return "PropertyName{" +'\n'+
                    ", stringLiteral='" + stringLiteral + '\'' +
                    '}';
        } else if (numericLiteral != null) {
            return "PropertyName{" +'\n'+
                    ", numericLiteral=" + numericLiteral +
                    '}';
        }
        return "PropertyName{" +'\n'+
                 singleExpression +'\n'+
                '}';
    }
}
