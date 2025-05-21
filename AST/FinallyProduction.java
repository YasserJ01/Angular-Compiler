package AST;

public class FinallyProduction {
    String Finally;
    Block block;

    public String getFinally() {
        return Finally;
    }

    public void setFinally(String aFinally) {
        Finally = aFinally;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "FinallyProduction{" +
                "Finally='" + Finally + '\'' +
                ", block=" + block +
                '}';
    }
}
