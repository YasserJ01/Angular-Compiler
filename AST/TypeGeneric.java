package AST;

public class TypeGeneric {
    TypeArgumentList typeArgumentList;
    TypeGeneric typeGeneric;

    public TypeArgumentList getTypeArgumentList() {
        return typeArgumentList;
    }

    public void setTypeArgumentList(TypeArgumentList typeArgumentList) {
        this.typeArgumentList = typeArgumentList;
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
            return "TypeGeneric{" +
                    "typeArgumentList=" + typeArgumentList +
                    ", typeGeneric=" + typeGeneric +
                    '}';
        }
        return "TypeGeneric{" +
                "typeArgumentList=" + typeArgumentList +
                '}';
    }
}
