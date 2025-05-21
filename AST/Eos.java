package AST;

public class Eos {
    String semicolon;

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        return '\n' +
                "semicolon='" + semicolon + "'\n" +
                '}';
    }
}
