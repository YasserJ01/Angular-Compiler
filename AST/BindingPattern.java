package AST;

public class BindingPattern {
    ArrayLiteral arrayLiteral;
    ObjectLiteral objectLiteral;

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    @Override
    public String toString() {
        if (arrayLiteral != null) {
            return "BindingPattern{" +
                    "arrayLiteral=" + arrayLiteral + '\n' +
                    '}';
        }
        return "BindingPattern{" +
                ", objectLiteral=" + objectLiteral + '\n' +
                '}';
    }
}
