package AST;

import java.util.ArrayList;
import java.util.List;

public class SourceElements {
    List<Statement> statement = new ArrayList<Statement>();

    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(List<Statement> statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "SourceElements{\n" +
                statement + '\n' +
                '}';
    }
}
