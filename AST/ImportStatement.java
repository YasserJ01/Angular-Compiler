package AST;

public class ImportStatement {
    String Import;
    ImportFromBlock importFromBlock;

    public String getImport() {
        return Import;
    }

    public void setImport(String anImport) {
        Import = anImport;
    }

    public ImportFromBlock getImportFromBlock() {
        return importFromBlock;
    }

    public void setImportFromBlock(ImportFromBlock importFromBlock) {
        this.importFromBlock = importFromBlock;
    }

    @Override
    public String toString() {
        return "ImportStatement{\n" +
                Import +'\n'+
                importFromBlock +'\n'+
                '}';
    }
}
