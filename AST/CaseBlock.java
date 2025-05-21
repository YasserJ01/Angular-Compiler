package AST;

public class CaseBlock {
    CaseClauses caseClauses;
    DefaultClause defaultClause;

    public CaseClauses getCaseClauses() {
        return caseClauses;
    }

    public void setCaseClauses(CaseClauses caseClauses) {
        this.caseClauses = caseClauses;
    }

    public DefaultClause getDefaultClause() {
        return defaultClause;
    }

    public void setDefaultClause(DefaultClause defaultClause) {
        this.defaultClause = defaultClause;
    }

    @Override
    public String toString() {
        return "CaseBlock{\n" +
                "caseClauses=" + caseClauses +
                ", defaultClause=" + defaultClause +
                '}';
    }
}
