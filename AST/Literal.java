package AST;

public class Literal {
    String nullLiteral;
    String boolLiteral;
    String stringLiteral;
    NumericLiteral numericLiteral;

    public String getNullLiteral() {
        return nullLiteral;
    }

    public void setNullLiteral(String nullLiteral) {
        this.nullLiteral = nullLiteral;
    }

    public String getBoolLiteral() {
        return boolLiteral;
    }

    public void setBoolLiteral(String boolLiteral) {
        this.boolLiteral = boolLiteral;
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

    @Override
    public String toString() {
        if (nullLiteral != null) {
            return "Literal{" +
                    "nullLiteral='" + nullLiteral + '\n' +
                    '}';
        } else if (boolLiteral != null) {
            return "Literal{" +
                    ", boolLiteral='" + boolLiteral + '\n' +
                    '}';
        } else if (stringLiteral != null) {
            return "Literal{" +'\n'+
                    ", stringLiteral='" + stringLiteral + '\n' +
                    '}';
        }
        return "Literal{" +
                ", numericLiteral=" + numericLiteral + '\n' +
                '}';
    }
}
