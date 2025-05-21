package AST;

public class VarModifier {
    String Var;
    String Let;
    String Const;

    public String getVar() {
        return Var;
    }

    public void setVar(String var) {
        Var = var;
    }

    public String getLet() {
        return Let;
    }

    public void setLet(String let) {
        Let = let;
    }

    public String getConst() {
        return Const;
    }

    public void setConst(String aConst) {
        Const = aConst;
    }

    @Override
    public String toString() {
        if (Var != null) {
            return "VarModifier\n" +
                    "Var=" + Var + '\n';

        } else if (Let != null) {
            return "VarModifier\n" +
                    ", Let=" + Let + '\n' +
                    '}';
        }
        return "VarModifier\n" +
                ", Const=" + Const + '\n' +
                '}';
    }
}
