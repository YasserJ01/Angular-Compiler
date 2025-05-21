package AST;

public class Block {
    StatementList statementList;

    public StatementList getStatementList() {
        return statementList;
    }

    public void setStatementList(StatementList statementList) {
        this.statementList = statementList;
    }

    @Override
    public String toString() {

        if(statementList!=null){
            return '{'+'\n'+
                    "statementList"+statementList+'\n'+
                    '}';
        }
        return "";
    }
}
