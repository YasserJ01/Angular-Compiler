package AST;

public class TryStatement {
    String Try;
    Block block;
    CatchProduction catchProduction;
    FinallyProduction finallyProduction;

    public String getTry() {
        return Try;
    }

    public void setTry(String aTry) {
        Try = aTry;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public CatchProduction getCatchProduction() {
        return catchProduction;
    }

    public void setCatchProduction(CatchProduction catchProduction) {
        this.catchProduction = catchProduction;
    }

    public FinallyProduction getFinallyProduction() {
        return finallyProduction;
    }

    public void setFinallyProduction(FinallyProduction finallyProduction) {
        this.finallyProduction = finallyProduction;
    }

    @Override
    public String toString() {
        if (finallyProduction != null) {
            if (catchProduction != null) {
                return "TryStatement{" +
                        "Try='" + Try + '\'' +
                        ", block=" + block +
                        ", catchProduction=" + catchProduction +
                        ", finallyProduction=" + finallyProduction +
                        '}';
            } else {
                return "TryStatement{" +
                        "Try='" + Try + '\'' +
                        ", block=" + block +
                        ", finallyProduction=" + finallyProduction +
                        '}';
            }
        } else {
            if (catchProduction != null) {
                return "TryStatement{" +
                        "Try='" + Try + '\'' +
                        ", block=" + block +
                        ", catchProduction=" + catchProduction +
                        '}';
            }
        }
        return "";
    }
}
