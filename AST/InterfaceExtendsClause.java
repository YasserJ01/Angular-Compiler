package AST;

public class InterfaceExtendsClause {
    String extension;
    ClassOrInterfaceTypeList classOrInterfaceTypeList;

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public ClassOrInterfaceTypeList getClassOrInterfaceTypeList() {
        return classOrInterfaceTypeList;
    }

    public void setClassOrInterfaceTypeList(ClassOrInterfaceTypeList classOrInterfaceTypeList) {
        this.classOrInterfaceTypeList = classOrInterfaceTypeList;
    }

    @Override
    public String toString() {
        return '\n' +
                "extension='" + extension + '\'' + '\n' +
                ", classOrInterfaceTypeList=" + classOrInterfaceTypeList + '\n' +
                '}';
    }
}
