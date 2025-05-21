package AST;

public class ImportedBinding {
    String identifier;
    String yield;
    String  await;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getYield() {
        return yield;
    }

    public void setYield(String yield) {
        this.yield = yield;
    }

    public String getAwait() {
        return await;
    }

    public void setAwait(String await) {
        this.await = await;
    }

    @Override
    public String toString() {
        if (identifier != null) {
            return "ImportedBinding{\n" +
                    "identifier=" + identifier + '\n' +
                    "}";
        } else if (yield != null) {
            return "ImportedBinding{\n" +
                    "yield=" + yield + '\n' +
                    "}";
        } else if (await != null) {
            return "ImportedBinding{\n" +
                    "await=" + await + '\n' +
                    "}";
        }
        return "";
    }
}
