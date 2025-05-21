package AST;

public class ExportAliasName {
    ModuleExportName moduleExportName ;
    String as;


    public ModuleExportName getModuleExportName() {
        return moduleExportName;
    }

    public void setModuleExportName(ModuleExportName moduleExportName) {
        this.moduleExportName = moduleExportName;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    @Override
    public String toString() {
        if (moduleExportName != null && as!=null) {
            return '\n' +'{'+
                    ", moduleExportName=" + moduleExportName + '\n' +
                    ", as=" + as + '\n' +

                    '}';
        }
        return '\n' +'{'+
                ", moduleExportName=" + moduleExportName + '\n' +
                '}';
    }
}
