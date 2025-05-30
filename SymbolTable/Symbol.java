package SymbolTable;

public class Symbol {
     String name;
     String type;
     String value;
     int lineNumber;
     Scope scope;
     boolean isParameter;
     boolean namedOrNot;


    public boolean isNamedOrNot() {
        return namedOrNot;
    }

    public void setNamedOrNot(boolean namedOrNot) {
        this.namedOrNot = namedOrNot;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }



    public boolean isParameter() {
        return isParameter;
    }

    public void setParameter(boolean parameter) {
        isParameter = parameter;
    }

}