package AST;

public class Decorator {
    DecoratorMemberExpression decoratorMemberExpression;
    DecoratorCallExpression decoratorCallExpression;

    public DecoratorMemberExpression getDecoratorMemberExpression() {
        return decoratorMemberExpression;
    }

    public void setDecoratorMemberExpression(DecoratorMemberExpression decoratorMemberExpression) {
        this.decoratorMemberExpression = decoratorMemberExpression;
    }

    public DecoratorCallExpression getDecoratorCallExpression() {
        return decoratorCallExpression;
    }

    public void setDecoratorCallExpression(DecoratorCallExpression decoratorCallExpression) {
        this.decoratorCallExpression = decoratorCallExpression;
    }

    @Override
    public String toString() {
        return "\n" +
                "decoratorMemberExpression=" + decoratorMemberExpression + "\n" +
                ", decoratorCallExpression=" + decoratorCallExpression + "\n" +
                '}';
    }
}
