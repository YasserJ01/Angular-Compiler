package AST;

public class LabelledStatement {
    Identifier identifier;
    Statement statement;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "LabelledStatement{" +
                "identifier=" + identifier +
                ", statement=" + statement +
                '}';
    }
}
