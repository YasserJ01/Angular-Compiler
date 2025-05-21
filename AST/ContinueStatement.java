package AST;

public class ContinueStatement {
    String Continue ;
    Identifier identifier;
    Eos eos;

    public String getContinue() {
        return Continue;
    }

    public void setContinue(String aContinue) {
        Continue = aContinue;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }

    @Override
    public String toString() {
        if (identifier != null ) {
            return '\n' +'{'+
                    ", Continue=" + Continue + '\n' +
                    ", identifier=" + identifier + '\n' +
                    ", eos=" + eos + '\n' +

                    '}';
        }
        return '\n' +'{'+
                ", Continue=" + Continue + '\n' +
                ", eos=" + eos + '\n' +
                '}';
    }
}
