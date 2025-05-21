package AST;

public class ArrayType {
    PrimaryType primaryType;

    public PrimaryType getPrimaryType() {
        return primaryType;
    }

    public void setPrimaryType(PrimaryType primaryType) {
        this.primaryType = primaryType;
    }

    @Override
    public String toString() {
        return "ArrayType{" +
                "primaryType=" + primaryType +
                '}';
    }
}
