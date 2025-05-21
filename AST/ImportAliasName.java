package AST;

public class ImportAliasName {
    ModuleExportName moduleExportName;
    ImportedBinding importedBinding;
    String as;
    public ModuleExportName getModuleExportName() {
        return moduleExportName;
    }

    public void setModuleExportName(ModuleExportName moduleExportName) {
        this.moduleExportName = moduleExportName;
    }

    public ImportedBinding getImportedBinding() {
        return importedBinding;
    }

    public void setImportedBinding(ImportedBinding importedBinding) {
        this.importedBinding = importedBinding;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    @Override
    public String toString() {

        if (importedBinding != null && as!=null) {
            return "\n" +
                    moduleExportName + '\n' +
                    ", as=" + as + '\n' +
                    '}';
        }
        return "\n" +
                moduleExportName + '\n' +
                '}';

    }
}
