package AST;

public class ImportFrom {
//    String From ;
    String StringLiteral ;

//    public String getFrom() {
//        return From;
//    }
//
//    public void setFrom(String from) {
//        From = from;
//    }

    public String getStringLiteral() {
        return StringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        StringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        return "ImportFrom\n" +'{'+
//                "'" + From + "'\n" +
                "StringLiteral='" + StringLiteral + '\n' +
                '}';
    }
}
