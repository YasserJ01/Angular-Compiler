package AST;
import java.util.ArrayList;
import java.util.List;
public class ExportModuleItems {
    List<ExportAliasName> exportAliasName = new ArrayList<ExportAliasName>();

    public List<ExportAliasName> getExportAliasName() {
        return exportAliasName;
    }

    public void setExportAliasName(List<ExportAliasName> exportAliasName) {
        this.exportAliasName = exportAliasName;
    }

    @Override
    public String toString() {


        if (exportAliasName != null) {
            return '\n' +'{'+
                    "exportAliasName=" + exportAliasName + '\n' +
                    '}';
        }
        return " ";
    }
}
