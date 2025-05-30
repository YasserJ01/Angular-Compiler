package AST;

import java.util.ArrayList;
import java.util.List;

public class IterationStatement {
    DoStatement doStatement;
    WhileStatement whileStatement;
    ForStatement forStatement;
    ForVarStatement forVarStatement;
    ForInStatement forInStatement;
    ForVarInStatement forVarInStatement;
    ForOfStatement forOfStatement;
    ForVarOfStatement forVarOfStatement;

    public DoStatement getDoStatement() {
        return doStatement;
    }

    public void setDoStatement(DoStatement doStatement) {
        this.doStatement = doStatement;
    }

    public WhileStatement getWhileStatement() {
        return whileStatement;
    }

    public void setWhileStatement(WhileStatement whileStatement) {
        this.whileStatement = whileStatement;
    }

    public ForStatement getForStatement() {
        return forStatement;
    }

    public void setForStatement(ForStatement forStatement) {
        this.forStatement = forStatement;
    }

    public ForVarStatement getForVarStatement() {
        return forVarStatement;
    }

    public void setForVarStatement(ForVarStatement forVarStatement) {
        this.forVarStatement = forVarStatement;
    }

    public ForInStatement getForInStatement() {
        return forInStatement;
    }

    public void setForInStatement(ForInStatement forInStatement) {
        this.forInStatement = forInStatement;
    }

    public ForVarInStatement getForVarInStatement() {
        return forVarInStatement;
    }

    public void setForVarInStatement(ForVarInStatement forVarInStatement) {
        this.forVarInStatement = forVarInStatement;
    }

    public ForOfStatement getForOfStatement() {
        return forOfStatement;
    }

    public void setForOfStatement(ForOfStatement forOfStatement) {
        this.forOfStatement = forOfStatement;
    }

    public ForVarOfStatement getForVarOfStatement() {
        return forVarOfStatement;
    }

    public void setForVarOfStatement(ForVarOfStatement forVarOfStatement) {
        this.forVarOfStatement = forVarOfStatement;
    }

    @Override
    public String toString() {
        if (doStatement != null) {
            return "IterationStatement{" + '\n' +
                    "Do Statement:" + doStatement + '\n' +
                    "}";
        } else if (whileStatement != null) {
            return "IterationStatement{" + '\n' +
                    "While Statement:" + whileStatement + '\n' +
                    "}";
        } else if (forStatement != null) {
            return "IterationStatement{" + '\n' +
                    "For Statement:" + forStatement + '\n' +
                    "}";
        } else if (forVarStatement != null) {
            return "IterationStatement{" + '\n' +
                    "For Var Statement:" + forVarStatement + '\n' +
                    "}";
        } else if (forInStatement != null) {
            return "IterationStatement{" + '\n' +
                    "For In Statement:" + forInStatement + '\n' +
                    "}";
        } else if (forVarInStatement != null) {
            return "IterationStatement{" + '\n' +
                    "For Var In Statement:" + forVarInStatement + '\n' +
                    "}";

        } else if (forOfStatement != null) {
            return "IterationStatement{" + '\n' +
                    "For Of Statement:" + forOfStatement + '\n' +
                    "}";
        }
        return "IterationStatement{" + '\n' +
                "For Var Of Statement:" + forVarOfStatement + '\n' +
                "}";
    }
}
