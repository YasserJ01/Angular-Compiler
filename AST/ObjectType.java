package AST;

public class ObjectType {
    TypeBody typeBody;

    public TypeBody getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(TypeBody typeBody) {
        this.typeBody = typeBody;
    }

    @Override
    public String toString() {
        if (typeBody != null) {
            return "ObjectType{" +
                    "typeBody=" + typeBody +
                    '}';
        }
        return "";
    }
}
