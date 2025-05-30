package SymbolTable;

import app.Main;

import java.util.ArrayList;

public class Scope {
    private static int contID = 0;
    private int id;
    private String name;
    private Scope parent;
    private ArrayList<Row> rows = new ArrayList<>();

    public  ArrayList<Row> getRows() {
        return rows;
    }

    public void setRows(Row row) {
        rows.add(row);
    }




    public Scope(Scope parent, String name) {
        this.id = ++contID;
        this.parent = parent;
        this.name = name;
    }
    public Scope(int id ,Scope parent, String name) {
        this.id = id;
        this.parent = parent;
        this.name = name;
    }

    public Scope(Scope parent) {
        this.parent = parent;
        this.id = ++contID;
    }
    public int getId() {
        return this.id;
    }

    public static int getContId() {
        return contID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addSymbol(Row row) {
        rows.add(row);
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  {  Scope ID: ").append(id).append(", Name: ").append(name + "  }  ");
        return sb.toString();
    }

}