package AST;

public class TypeQuery {
    TypeQueryExpression typeQueryExpression;

    public TypeQueryExpression getTypeQueryExpression() {
        return typeQueryExpression;
    }

    public void setTypeQueryExpression(TypeQueryExpression typeQueryExpression) {
        this.typeQueryExpression = typeQueryExpression;
    }

    @Override
    public String toString() {
        return "TypeQuery{\n" +
                "typeQueryExpression=" + typeQueryExpression + '\n' +
                '}';
    }
}
