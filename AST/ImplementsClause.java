package AST;

public class ImplementsClause {
    String Implements;
    ClassOrInterfaceTypeList classOrInterfaceTypeList;

    public String getImplements() {
        return Implements;
    }

    public void setImplements(String anImplements) {
        Implements = anImplements;
    }

    public ClassOrInterfaceTypeList getClassOrInterfaceTypeList() {
        return classOrInterfaceTypeList;
    }

    public void setClassOrInterfaceTypeList(ClassOrInterfaceTypeList classOrInterfaceTypeList) {
        this.classOrInterfaceTypeList = classOrInterfaceTypeList;
    }

    @Override
    public String toString() {
        return "ImplementsClause{" +
                "Implements='" + Implements + '\n' +
                ", classOrInterfaceTypeList=" + classOrInterfaceTypeList + '\n' +
                '}';
    }
}
