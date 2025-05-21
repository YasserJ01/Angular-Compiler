package AST;

public class ClassHeritage {
    ClassExtendsClause classExtendsClause;
    ImplementsClause implementsClause;

    public ClassExtendsClause getClassExtendsClause() {
        return classExtendsClause;
    }

    public void setClassExtendsClause(ClassExtendsClause classExtendsClause) {
        this.classExtendsClause = classExtendsClause;
    }

    public ImplementsClause getImplementsClause() {
        return implementsClause;
    }

    public void setImplementsClause(ImplementsClause implementsClause) {
        this.implementsClause = implementsClause;
    }

    @Override
    public String toString() {
        if (classExtendsClause != null) {
            if (implementsClause != null) {
                return "ClassHeritage{" +
                        "classExtendsClause=" + classExtendsClause +
                        ", implementsClause=" + implementsClause +
                        '}';
            }else {
                return "ClassHeritage{" +
                        "classExtendsClause=" + classExtendsClause +
                        '}';

            }
        }else {
            if (implementsClause != null) {
                return "ClassHeritage{" +
                        ", implementsClause=" + implementsClause +
                        '}';
            }else {
                return "ClassHeritage{" +
                        '}';
            }
        }
    }
}
