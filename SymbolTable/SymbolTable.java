package SymbolTable;

import app.Main;

import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {
    public ArrayList<Scope> scopes = new ArrayList<>();
    private Stack<Scope> scopeStack = new Stack<>();
    private Scope outside = new Scope(0, null, "Global Scope");

    public Scope getScopeByID(int id) {
        for (Scope scope : scopes) {
            if (scope.getId() == id) {
                return scope;
            }
        }
        return this.outside;
    }


    public void createScope(String name) {
//        Scope(0, null, "Global Scope");
        Scope parent = scopeStack.isEmpty() ? new Scope(getCurrentScopeID(),outside, "Global Scope") : scopeStack.peek();
        Scope scope = new Scope(parent, name);
        scopeStack.push(scope);
        scopes.add(scope);
    }


//    public void removeScope(String scopeTitle) {
//        Scope scopeToRemove = null;
//        for (Scope scope : scopes) {
//            if (scope.getName().equals(scopeTitle)) {
//                scopeToRemove = scope;
//                break;
//            }
//        }
//        if (scopeToRemove != null) {
//            scopeStack.remove(scopeToRemove);
//        }
//    }
//
//
//    public void removeScope() {
//        if (!scopeStack.isEmpty()) {
//            scopeStack.pop();
//        }
//    }


    public int getCurrentScopeID() {
        if (scopeStack.isEmpty()) return 0;

        else return scopeStack.peek().getId();
    }


    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public void addoutside() {
        this.scopes.add(this.outside);
    }

    public Stack<Scope> getScopeStack() {
        return scopeStack;
    }

    public void printSymbolTable() {
        SymbolTable st = Main.st; // Assuming app.Main.st is your instance of SymbolTable
        printScopes(st.getScopes());
    }


    private void printScopes(ArrayList<Scope> scopes) {
        for (Scope scope : scopes) {
            System.out.println("Scope ID: " + scope.getId() + ", Name: " + scope.getName() + "    parent Scope : " + scope.getParent());
            ArrayList<Row> rows = scope.getRows();
            for (Row row : rows) {
                // if(row.getScope().getId()== scope.getId())
                row.print();

            }
        }
    }


    public Scope getOutside() {
        return outside;
    }

    public void setOutside(Scope outside) {
        this.outside = outside;
    }
}