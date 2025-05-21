package AST;

public class ImportFromBlock {
    String StringLiteral;
    ImportDefault importDefault;

    ImportNamespace importNamespace;
    ImportModuleItems importModuleItems;
    ImportFrom importFrom;
    Eos eos;

    public String getStringLiteral() {
        return StringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        StringLiteral = stringLiteral;
    }

    public ImportDefault getImportDefault() {
        return importDefault;
    }

    public void setImportDefault(ImportDefault importDefault) {
        this.importDefault = importDefault;
    }

    public ImportNamespace getImportNamespace() {
        return importNamespace;
    }

    public void setImportNamespace(ImportNamespace importNamespace) {
        this.importNamespace = importNamespace;
    }

    public ImportModuleItems getImportModuleItems() {
        return importModuleItems;
    }

    public void setImportModuleItems(ImportModuleItems importModuleItems) {
        this.importModuleItems = importModuleItems;
    }

    public ImportFrom getImportFrom() {
        return importFrom;
    }

    public void setImportFrom(ImportFrom importFrom) {
        this.importFrom = importFrom;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }

    @Override
    public String toString() {
        if (importFrom != null && eos != null) {
            if (importDefault != null) {
                if (importNamespace != null) {
                    return "ImportFromBlock{" +
                            ", importDefault=" + importDefault +
                            ", importNamespace=" + importNamespace +
                            ", importFrom=" + importFrom +
                            ", eos=" + eos +
                            '}';
                } else {
                    return "ImportFromBlock{" +'\n'+
                            importDefault + '\n' +
                            importModuleItems + '\n' +
                            importFrom + '\n' +
                            eos + '\n' +
                            '}';
                }
            } else {
                if (importNamespace != null) {
                    return "ImportFromBlock{" +
                            ", importNamespace=" + importNamespace +
                            ", importFrom=" + importFrom +
                            ", eos=" + eos +
                            '}';
                } else {
                    return "ImportFromBlock{" +
                            '\n'+ importModuleItems +
                            '\n' + importFrom +
                            '\n' + eos +
                            '}';
                }
            }
        }
        return "ImportFromBlock{" +
                "StringLiteral='" + StringLiteral + '\'' +
                ", eos=" + eos +
                '}';
    }


    //    @Override
//    public String toString() {
//        if (importDefault != null) {
//            if (importNamespace != null) {
//                return "ImportFromBlock{\n" +
//                        "importNamespace=" + importNamespace + '\n' +
//                        "}";
//            } else if (importModuleItems != null) {
//                return "ImportFromBlock{\n" +
//                        "importModuleItems=" + importModuleItems + '\n' +
//                        "}";
//            }
//            if (importFrom != null) {
//                return "ImportFromBlock{\n" +
//                        "importFrom=" + importFrom + '\n' +
//                        "}";
//            }
//            if (eos != null) {
//                return "ImportFromBlock{\n" +
//                        "eos=" + eos + '\n' +
//                        "}";
//            }
//        } else if (StringLiteral != null) {
//            return "ImportFromBlock{\n" +
//                    "StringLiteral=" + StringLiteral + '\n' +
//                    "}";
//        } else if (eos != null) {
//            return "ImportFromBlock{\n" +
//                    "eos=" + eos + '\n' +
//                    "}";
//        }
//
//        return "";
//    }
}
