package AST;

public class CatchProduction {
    String Catch;
    Identifier identifier;
    TypeAnnotation typeAnnotation;
    Block block;

    public String getCatch() {
        return Catch;
    }

    public void setCatch(String aCatch) {
        Catch = aCatch;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        if (typeAnnotation != null) {
            if (identifier != null) {
                return "CatchProduction{" +
                        "Catch='" + Catch + '\'' +
                        ", identifier=" + identifier +
                        ", typeAnnotation=" + typeAnnotation +
                        ", block=" + block +
                        '}';
            }else {
                return "CatchProduction{" +
                        "Catch='" + Catch + '\'' +
                        ", typeAnnotation=" + typeAnnotation +
                        ", block=" + block +
                        '}';
            }
        }else {
            if (identifier != null) {
                return "CatchProduction{" +
                        "Catch='" + Catch + '\'' +
                        ", identifier=" + identifier +
                        ", block=" + block +
                        '}';
            }else {
                return "CatchProduction{" +
                        "Catch='" + Catch + '\'' +
                        ", block=" + block +
                        '}';
            }
        }
    }
}
