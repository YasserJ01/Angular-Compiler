package AST;

public class ClassElement {
    ConstructorDeclaration constructorDeclaration;
    DecoratorList decoratorList;
    PropertyMemberDeclaration propertyMemberDeclaration;
    IndexMemberDeclaration indexMemberDeclaration;
    Statement statement;

    public ConstructorDeclaration getConstructorDeclaration() {
        return constructorDeclaration;
    }

    public void setConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclaration = constructorDeclaration;
    }

    public DecoratorList getDecoratorList() {
        return decoratorList;
    }

    public void setDecoratorList(DecoratorList decoratorList) {
        this.decoratorList = decoratorList;
    }

    public PropertyMemberDeclaration getPropertyMemberDeclaration() {
        return propertyMemberDeclaration;
    }

    public void setPropertyMemberDeclaration(PropertyMemberDeclaration propertyMemberDeclaration) {
        this.propertyMemberDeclaration = propertyMemberDeclaration;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public IndexMemberDeclaration getIndexMemberDeclaration() {
        return indexMemberDeclaration;
    }

    public void setIndexMemberDeclaration(IndexMemberDeclaration indexMemberDeclaration) {
        this.indexMemberDeclaration = indexMemberDeclaration;
    }

    @Override
    public String toString() {
        if (constructorDeclaration != null) {
            return "ClassElement{" +'\n'+
                    constructorDeclaration + '\n' +
                    '}';
        } else if (propertyMemberDeclaration != null) {
            if (decoratorList != null) {
                return "ClassElement{" +'\n'+
                        "DecoratorList=" + decoratorList + '\n' +
                        propertyMemberDeclaration + '\n' +
                        '}';
            } else {
                return "ClassElement{" +'\n'+
                        propertyMemberDeclaration + '\n' +
                        '}';
            }
        } else if (indexMemberDeclaration != null) {
            return "ClassElement{" +'\n'+
                    indexMemberDeclaration + '\n' +
                    '}';
        }
        return "ClassElement{" +'\n'+
                statement + '\n' +
                '}';
    }
}
