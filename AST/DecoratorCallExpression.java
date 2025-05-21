package AST;

public class DecoratorCallExpression {
    DecoratorMemberExpression decoratorMemberExpression;
    Arguments arguments;

    public DecoratorMemberExpression getDecoratorMemberExpression() {
        return decoratorMemberExpression;
    }

    public void setDecoratorMemberExpression(DecoratorMemberExpression decoratorMemberExpression) {
        this.decoratorMemberExpression = decoratorMemberExpression;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "\n" +
                "decoratorMemberExpression=" + decoratorMemberExpression +'\n' +
                arguments +'\n' +
                '}';
    }
}
