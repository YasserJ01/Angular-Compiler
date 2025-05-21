package AST;

public class VariableStatement {
    VariableDeclarationList variableDeclarationList;
    BindingPattern bindingPattern;
    TypeAnnotation typeAnnotation;
    AccessibilityModifier accessibilityModifier;
    VarModifier varModifier;


    String ReadOnly;
    String SemiColon;
    String Declare;


    public VariableDeclarationList getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(VariableDeclarationList variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public String getSemiColon() {
        return SemiColon;
    }

    public void setSemiColon(String semiColon) {
        SemiColon = semiColon;
    }

    public AccessibilityModifier getAccessibilityModifier() {
        return accessibilityModifier;
    }

    public void setAccessibilityModifier(AccessibilityModifier accessibilityModifier) {
        this.accessibilityModifier = accessibilityModifier;
    }

    public VarModifier getVarModifier() {
        return varModifier;
    }

    public void setVarModifier(VarModifier varModifier) {
        this.varModifier = varModifier;
    }

    public String getReadOnly() {
        return ReadOnly;
    }

    public void setReadOnly(String readOnly) {
        ReadOnly = readOnly;
    }

    public BindingPattern getBindingPattern() {
        return bindingPattern;
    }

    public void setBindingPattern(BindingPattern bindingPattern) {
        this.bindingPattern = bindingPattern;
    }

    public String getDeclare() {
        return Declare;
    }

    public void setDeclare(String declare) {
        Declare = declare;
    }

    @Override
    public String toString() {
        if (typeAnnotation != null && SemiColon != null) {
            return "VariableStatement{"+'\n'+
                    "bindingPattern=" + bindingPattern +
                    ", typeAnnotation=" + typeAnnotation + '\n' +
                    ", SemiColon=" + SemiColon + '\n' +

                    '}';
        } else if (bindingPattern != null) {
            return "VariableStatement{"+'\n'+
                    ", bindingPattern=" + bindingPattern + '\n' +
                    '}';
        } else if (accessibilityModifier != null && varModifier != null && ReadOnly != null && SemiColon != null) {
            return "VariableStatement{"+'\n'+
                    "accessibilityModifier=" + accessibilityModifier +
                    ", varModifier=" + varModifier + '\n' +
                    ", ReadOnly=" + ReadOnly + '\n' +
                    '}' +
                    variableDeclarationList +
                    ", SemiColon=" + SemiColon + '\n' +
                    '}';
        } else if (variableDeclarationList != null) {
            return "VariableStatement{"+'\n'+
                    variableDeclarationList + '\n' +
                    '}';
        } else if (varModifier != null && SemiColon != null) {
            return "VariableStatement{"+'\n'+
                    "Declare=" + Declare +
                    ", varModifier=" + varModifier + '\n' +
                    ", SemiColon=" + SemiColon + '\n' +

                    '}';
        } else if (Declare != null && varModifier != null) {
            return "VariableStatement{"+'\n'+
                    "Declare=" + Declare +
                    ", varModifier=" + varModifier + '\n' +

                    '}';
        }
        return "";
    }
}
