package AST;

public class ExportStatement {
    String Export;
    String Default;
    ExportFromBlock exportFromBlock;
    Declaration declaration;
    Eos eos;
    SingleExpression singleExpression;

    public String getExport() {
        return Export;
    }

    public void setExport(String export) {
        Export = export;
    }

    public String getDefault() {
        return Default;
    }

    public void setDefault(String aDefault) {
        Default = aDefault;
    }

    public ExportFromBlock getExportFromBlock() {
        return exportFromBlock;
    }

    public void setExportFromBlock(ExportFromBlock exportFromBlock) {
        this.exportFromBlock = exportFromBlock;
    }

    public Declaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }


    @Override
    public String toString() {


        if(Default!=null) {
            if(exportFromBlock!=null) {
                return '\n' +
                        "Export='" + Export + '\n' +
                        ", Default='" + Default + '\n' +
                        ", exportFromBlock=" + exportFromBlock + '\n' +
                        ", eos=" + eos + '\n' +
                        '}';
            }
            if(declaration!=null) {
                return '\n' +
                        "Export='" + '\n' +
                        ", Default='" + Default + '\n' +
                        ", declaration=" + declaration + '\n' +
                        ", eos=" + eos + '\n' +
                        '}';
            }
        }


        if(exportFromBlock!=null) {
            return "ExportStatement{" +
                    "Export='" + Export + '\'' +
                    ", exportFromBlock=" + exportFromBlock +
                    ", eos=" + eos +
                    '}';
        }
        if(declaration!=null) {
            return "ExportStatement{" +
                    "Export='" + Export + '\'' +
                    ", declaration=" + declaration +
                    ", eos=" + eos +
                    '}';
        }


        if(singleExpression!=null) {
            return "ExportStatement{" +
                    "Export='" + Export + '\'' +
                    ", Default='" + Default + '\'' +
                    ", singleExpression=" + singleExpression +
                    ", eos=" + eos +
                    '}';
        }

        return " ";


    }
}
