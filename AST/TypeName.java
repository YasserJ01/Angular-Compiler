package AST;

public class TypeName {
    Identifier identifier;
    NamespaceName namespaceName;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public NamespaceName getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(NamespaceName namespaceName) {
        this.namespaceName = namespaceName;
    }

    @Override
    public String toString() {
        if (identifier!=null) {
            return "TypeName{" +
                    "identifier=" + identifier +
                    '}';
        }
        return "TypeName{" +
                ", namespaceName=" + namespaceName +
                '}';
    }
}
