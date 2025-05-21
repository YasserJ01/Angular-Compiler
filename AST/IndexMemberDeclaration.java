package AST;

public class IndexMemberDeclaration {
    IndexSignature indexSignature;
    String semiColon;

    public IndexSignature getIndexSignature() {
        return indexSignature;
    }

    public void setIndexSignature(IndexSignature indexSignature) {
        this.indexSignature = indexSignature;
    }

    public String getSemiColon() {
        return semiColon;
    }

    public void setSemiColon(String semiColon) {
        this.semiColon = semiColon;
    }

    @Override
    public String toString() {
        return "IndexMemberDeclaration{" +
                "indexSignature=" + indexSignature + '\n' +
                ", semiColon='" + semiColon + '\n' +
                '}';
    }
}
