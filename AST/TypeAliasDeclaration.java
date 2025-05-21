package AST;

public class TypeAliasDeclaration {
    String export;
    Identifier identifier;
    TypeParameters typeParameters;
    Type_ type_;

    Eos eos;

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public TypeParameters getTypeParameters() {
        return typeParameters;
    }

    public void setTypeParameters(TypeParameters typeParameters) {
        this.typeParameters = typeParameters;
    }

    public Type_ getType_() {
        return type_;
    }

    public void setType_(Type_ type_) {
        this.type_ = type_;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }

    @Override
    public String toString() {
        if (export != null) {
            if (typeParameters != null){
                return "TypeAliasDeclaration{\n" +
                        "export='" + export + '\n' +
                        ", identifier=" + identifier + '\n' +
                        ", typeParameters" + typeParameters + '\n' +
                        ", type_=" + type_ + '\n' +
                        ", eos=" + eos + '\n' +
                        '}';
            } else {
                return "TypeAliasDeclaration{\n" +
                        "export='" + export + '\n' +
                        ", identifier=" + identifier + '\n' +
                        ", type_=" + type_ + '\n' +
                        ", eos=" + eos + '\n' +
                        '}';
            }
        } else {
            if (typeParameters != null){
                return "TypeAliasDeclaration{\n" +
                        ", identifier=" + identifier + '\n' +
                        ", typeParameters" + typeParameters + '\n' +
                        ", type_=" + type_ + '\n' +
                        ", eos=" + eos + '\n' +
                        '}';
            } else {
                return "TypeAliasDeclaration{\n" +
                        ", identifier=" + identifier + '\n' +
                        ", type_=" + type_ + '\n' +
                        ", eos=" + eos + '\n' +
                        '}';
            }
        }
    }
}
