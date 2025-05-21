package AST;

public class EmptyStatement_ {
    String SemiColon;

    public String getSemiColon() {
        return SemiColon;
    }

    public void setSemiColon(String semiColon) {
        SemiColon = semiColon;
    }

    @Override
    public String toString() {
        return "EmptyStatement_{\n" +
                "SemiColon='" + SemiColon + '\'' +
                '}';
    }
}
