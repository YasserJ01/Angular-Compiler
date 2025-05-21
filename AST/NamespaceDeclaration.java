package AST;

public class NamespaceDeclaration {
    String declare;
    String namespace;

    NamespaceName namespaceName;

    StatementList statementList;

    public String getDeclare() {
        return declare;
    }

    public void setDeclare(String declare) {
        this.declare = declare;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public NamespaceName getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(NamespaceName namespaceName) {
        this.namespaceName = namespaceName;
    }

    public StatementList getStatementList() {
        return statementList;
    }

    public void setStatementList(StatementList statementList) {
        this.statementList = statementList;
    }

    @Override
    public String toString() {
        return '\n' +
                "declare='" + declare + '\'' + '\n' +
                ", namespace='" + namespace + '\'' + '\n' +
                ", namespaceName=" + namespaceName + '\n' +
                ", statementList=" + statementList + '\n' +
                '}';
    }
}
