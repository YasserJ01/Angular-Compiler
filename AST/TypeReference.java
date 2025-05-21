package AST;

public class TypeReference {
    TypeName typeName;
    TypeGeneric typeGeneric;

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }

    public TypeGeneric getTypeGeneric() {
        return typeGeneric;
    }

    public void setTypeGeneric(TypeGeneric typeGeneric) {
        this.typeGeneric = typeGeneric;
    }

    @Override
    public String toString() {
        if (typeGeneric != null) {
            return "TypeReference{" +
                    "typeName=" + typeName +
                    ", typeGeneric=" + typeGeneric +
                    '}';
        }
        return "TypeReference{" +
                "typeName=" + typeName +
                '}';
    }
}
