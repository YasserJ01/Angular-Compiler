package AST;

public class NumericLiteral {
    String decimalLiteral;

    public String getDecimalLiteral() {
        return decimalLiteral;
    }

    public void setDecimalLiteral(String decimalLiteral) {
        this.decimalLiteral = decimalLiteral;
    }

    @Override
    public String toString() {
        return "NumericLiteral{" +
                "decimalLiteral='" + decimalLiteral + '\n' +
                '}';
    }
}
