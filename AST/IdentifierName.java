package AST;

public class IdentifierName {
    Identifier identifier;
    ReservedWord reservedWord;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public ReservedWord getReservedWord() {
        return reservedWord;
    }

    public void setReservedWord(ReservedWord reservedWord) {
        this.reservedWord = reservedWord;
    }

    @Override
    public String toString() {
        if (identifier != null) {
            return "IdentifierName{" +'\n'+
                    identifier +'\n'+
                    '}';
        }
        return "IdentifierName{" +'\n'+
                reservedWord +'\n'+
                '}';
    }
}
