package AST;

public class BreakStatement {
    String Break;
    Identifier identifier;
    Eos eos;

    public String getBreak() {
        return Break;
    }

    public void setBreak(String aBreak) {
        Break = aBreak;
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
                    ", Break=" + Break + '\n' +
                    ", identifier=" + identifier + '\n' +
                    ", eos=" + eos + '\n' +

                    '}';
        }
        return '\n' +'{'+
                ", Break=" + Break + '\n' +
                ", eos=" + eos + '\n' +
                '}';
    }
}
