package AST;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class ExportFromBlock {
    ImportNamespace importNamespace ;
    ExportModuleItems exportModuleItems ;
    Eos  eos;
    ImportFrom importFrom;

    public ImportNamespace getImportNamespace() {
        return importNamespace;
    }

    public void setImportNamespace(ImportNamespace importNamespace) {
        this.importNamespace = importNamespace;
    }

    public ExportModuleItems getExportModuleItems() {
        return exportModuleItems;
    }

    public void setExportModuleItems(ExportModuleItems exportModuleItems) {
        this.exportModuleItems = exportModuleItems;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }

    public ImportFrom getImportFrom() {
        return importFrom;
    }

    public void setImportFrom(ImportFrom importFrom) {
        this.importFrom = importFrom;
    }

    @Override
    public String toString() {
        if ( importNamespace != null&&importFrom!=null&&eos!=null) {
            return '\n' +
                    "importNamespace=" + importNamespace + '\n' + '\n' +
                    "importFrom=" + importFrom + '\n' +
                    "eos=" + eos ;
        }
        if ( importFrom!=null) {
            return '\n' +
                    "exportModuleItems=" + exportModuleItems + '\n' + '\n' +
                    "importFrom=" + importFrom + '\n' +
                    "eos=" + eos ;
        }else {
            return '\n'+
                    "exportModuleItems=" + exportModuleItems + '\n' + '\n' +

                    "eos=" + eos ;
        }
    }
}
