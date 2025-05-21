package AST;

public class TypeParameters {
    TypeParameterList typeParameterList;

    public TypeParameterList getTypeParameterList() {
        return typeParameterList;
    }

    public void setTypeParameterList(TypeParameterList typeParameterList) {
        this.typeParameterList = typeParameterList;
    }

    @Override
    public String toString() {
        if (typeParameterList != null) {
            return "TypeParameters{" +
                    "typeParameterList=" + typeParameterList +
                    '}';
        }
        return "";
    }
}
