package AST;

public class TupleType {
    TupleElementTypes tupleElementTypes;

    public TupleElementTypes getTupleElementTypes() {
        return tupleElementTypes;
    }

    public void setTupleElementTypes(TupleElementTypes tupleElementTypes) {
        this.tupleElementTypes = tupleElementTypes;
    }

    @Override
    public String toString() {
        return "TupleType{" +
                "tupleElementTypes=" + tupleElementTypes +
                '}';
    }
}
