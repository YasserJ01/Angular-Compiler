package AST;

public class InterfaceDeclaration {
    String export;
    String declare;
    String interfac;

    Identifier identifier;
    TypeParameter typeParameter;
    InterfaceExtendsClause interfaceExtendsClause;
    ObjectType objectType;
    String semicolon;

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public String getDeclare() {
        return declare;
    }

    public void setDeclare(String declare) {
        this.declare = declare;
    }

    public String getInterfac() {
        return interfac;
    }

    public void setInterfac(String interfac) {
        this.interfac = interfac;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public TypeParameter getTypeParameter() {
        return typeParameter;
    }

    public void setTypeParameter(TypeParameter typeParameter) {
        this.typeParameter = typeParameter;
    }

    public InterfaceExtendsClause getInterfaceExtendsClause() {
        return interfaceExtendsClause;
    }

    public void setInterfaceExtendsClause(InterfaceExtendsClause interfaceExtendsClause) {
        this.interfaceExtendsClause = interfaceExtendsClause;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        return '\n' +
                "export='" + export + '\'' + '\n' +
                ", declare='" + declare + '\'' + '\n' +
                ", interfac='" + interfac + '\'' + '\n' +
                ", identifier=" + identifier + '\n' +
                ", typeParameter=" + typeParameter + '\n' +
                ", interfaceExtendsClause=" + interfaceExtendsClause + '\n' +
                ", objectType=" + objectType + '\n' +
                ", semicolon='" + semicolon + '\'' + '\n' +
                '}';
    }
}
