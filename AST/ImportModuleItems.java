package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportModuleItems {
    List<ImportAliasName> importAliasName = new ArrayList<ImportAliasName>();

    public List<ImportAliasName> getImportAliasName() {
        return importAliasName;
    }

    public void setImportAliasName(List<ImportAliasName> importAliasName) {
        this.importAliasName = importAliasName;
    }

    @Override
    public String toString() {
        if (importAliasName != null) {

            return "ImportModuleItems\n" +'{'+
                    "importAliasName=" + importAliasName + '\n' +
                    '}';
        }
        return " " ;
    }
}
