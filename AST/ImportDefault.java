package AST;

public class ImportDefault {
    AliasName aliasName;

    public AliasName getAliasName() {
        return aliasName;
    }

    public void setAliasName(AliasName aliasName) {
        this.aliasName = aliasName;
    }

    @Override
    public String toString() {
        return "ImportDefault\n" +
                "aliasName=" + aliasName + '\n' +
                ',';

    }
}
