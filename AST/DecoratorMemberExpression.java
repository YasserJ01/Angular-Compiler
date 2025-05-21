package AST;

public class DecoratorMemberExpression {
    Identifier identifier;
    DecoratorMemberExpression decoratorMemberExpression;

    IdentifierName identifierName;

    SingleExpression singleExpression;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public DecoratorMemberExpression getDecoratorMemberExpression() {
        return decoratorMemberExpression;
    }

    public void setDecoratorMemberExpression(DecoratorMemberExpression decoratorMemberExpression) {
        this.decoratorMemberExpression = decoratorMemberExpression;
    }

    public IdentifierName getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(IdentifierName identifierName) {
        this.identifierName = identifierName;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }


    @Override
    public String toString() {
        if (identifier != null) {
            return "\n" +
                    identifier + '\n' +
                    '}';
        } else if (decoratorMemberExpression != null && identifierName != null) {
            return '\n' +
                    ", decoratorMemberExpression=" + decoratorMemberExpression + '\n' +
                    ", identifierName=" + identifierName + '\n' +
                    '}';
        }
        return '\n' +
                ", singleExpression=" + singleExpression + '\n' +
                '}';
    }
}
