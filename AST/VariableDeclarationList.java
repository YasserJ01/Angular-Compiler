package AST;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclarationList {
    List<VariableDeclaration> variableDeclaration = new ArrayList<VariableDeclaration>();

    public List<VariableDeclaration> getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(List<VariableDeclaration> variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    @Override
    public String toString() {
        return "VariableDeclarationList{\n" +
                variableDeclaration +'\n'+
                '}';
    }
}
