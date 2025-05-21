package AST;

public class Arguments {
    ArgumentList argumentList;

    public ArgumentList getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(ArgumentList argumentList) {
        this.argumentList = argumentList;
    }

    @Override
    public String toString() {
        if (argumentList != null) {
            return "Arguments{" + '\n'+
                    argumentList +
                    '}';
        }
        return "";
    }
}
