package AST;

public class ClassExtendsClause {
    String Extends;
    TypeReference typeReference;

    public String getExtends() {
        return Extends;
    }

    public void setExtends(String anExtends) {
        Extends = anExtends;
    }

    public TypeReference getTypeReference() {
        return typeReference;
    }

    public void setTypeReference(TypeReference typeReference) {
        this.typeReference = typeReference;
    }

    @Override
    public String toString() {
        return "ClassExtendsClause{" +
                "Extends='" + Extends + '\n' +
                ", typeReference=" + typeReference + '\n' +
                '}';
    }
}
