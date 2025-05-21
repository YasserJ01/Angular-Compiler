package AST;

import java.util.ArrayList;
import java.util.List;

public class CaseClauses {
    List<CaseClause> caseClause = new ArrayList<CaseClause>();

    public List<CaseClause> getCaseClause() {
        return caseClause;
    }

    public void setCaseClause(List<CaseClause> caseClause) {
        this.caseClause = caseClause;
    }

    @Override
    public String toString() {
        return "CaseClauses{" +
                "caseClause=" + caseClause +
                '}';
    }
}
