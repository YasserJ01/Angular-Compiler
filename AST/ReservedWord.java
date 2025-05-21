package AST;

public class ReservedWord {
    Keyword keyword;
    String nullLiteral;
    String boolLiteral;

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public String getNullLiteral() {
        return nullLiteral;
    }

    public void setNullLiteral(String nullLiteral) {
        this.nullLiteral = nullLiteral;
    }

    public String getBoolLiteral() {
        return boolLiteral;
    }

    public void setBoolLiteral(String boolLiteral) {
        this.boolLiteral = boolLiteral;
    }

    @Override
    public String toString() {
        if (keyword != null) {
            return "ReservedWord{" +'\n'+
                    "Keyword=" + keyword + "'\n" +
                    '}';
        } else if (nullLiteral != null) {
            return "ReservedWord{" +'\n'+
                    "NullLiteral='" + nullLiteral + "'\n" +
                    '}';
        }
        return "ReservedWord{" +'\n'+
                "BoolLiteral='" + boolLiteral + "'\n" +
                '}';
    }
}
