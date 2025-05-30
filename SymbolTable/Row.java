package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class Row {

    String Datatype;
    int lineNumber;
    Scope scope;
    boolean isParameter;
    String Key;
    public List<String> Value = new ArrayList<>();
    Row parentScope;  // مرجع للسطر الأب

    public String getDatatype() {
        return Datatype;
    }

    public void setDatatype(String type) {
        this.Datatype = type;
    }

    public List<String> getValue() {
        return Value;
    }

    public void setValue(List<String> value) {
        Value = value;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        this.Key = key;
    }

    public Row getParentScope() {
        return parentScope;
    }

    public void setParentScope(Row parentScope) {
        this.parentScope = parentScope;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public boolean isParameter() {
        return isParameter;
    }

    public void setParameter(boolean parameter) {
        isParameter = parameter;
    }


    public void print() {
        int symbolName = 15;
        int symbolType = 15;
        int symbolValue = 15;
        // System.out.print(app.Main.TEXT_BLUE);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Line Number: " + this.getLineNumber());
        stringBuilder.append("\t\t");
        stringBuilder.append(" - Symbol Name: " + this.getKey());
        for (int i=0;i<symbolName - this.getKey().length(); i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append("\t");
        stringBuilder.append(" - Symbol Type: " + this.getDatatype());
        for (int i=0;i<symbolType - this.getDatatype().length(); i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append("\t");
        stringBuilder.append(" - Symbol Value: " + this.getValue());
        for (int i=0;i<symbolValue - this.getKey().length(); i++){
            stringBuilder.append(" ");
        }

//        stringBuilder.append("\t");
//        stringBuilder.append(" - isParameter: " + this.isParameter());
//        for (int i=0;i<symbolValue - this.getKey().length(); i++){
//            stringBuilder.append(" ");
//        }
        System.out.println(stringBuilder);
    }
}
