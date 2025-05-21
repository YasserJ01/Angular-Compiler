package AST;

public class Declaration {
    VariableStatement variableStatement;
    ClassDeclaration classDeclaration;
    FunctionDeclaration functionDeclaration;


    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {

        if (variableStatement != null) {

            return '\n' +
                    "variableStatement=" + variableStatement + '\n';

        } else if (classDeclaration != null) {
            return '\n' +
                    ", classDeclaration=" + classDeclaration + '\n' +
                    '}';
        } else if (functionDeclaration != null) {
            return '\n' +
                    ", functionDeclaration=" + functionDeclaration + '\n' +
                    '}';
        }
        return "";
    }
}
