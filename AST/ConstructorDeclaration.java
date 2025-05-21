package AST;

public class ConstructorDeclaration {
    AccessibilityModifier accessibilityModifier;
    String Constructor;
    FormalParameterList formalParameterList;
    FunctionBody functionBody;
    String semiColon;

    public AccessibilityModifier getAccessibilityModifier() {
        return accessibilityModifier;
    }

    public void setAccessibilityModifier(AccessibilityModifier accessibilityModifier) {
        this.accessibilityModifier = accessibilityModifier;
    }

    public String getConstructor() {
        return Constructor;
    }

    public void setConstructor(String constructor) {
        Constructor = constructor;
    }

    public FormalParameterList getFormalParameterList() {
        return formalParameterList;
    }

    public void setFormalParameterList(FormalParameterList formalParameterList) {
        this.formalParameterList = formalParameterList;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    public String getsemiColon() {
        return semiColon;
    }

    public void setsemiColon(String semiColon) {
        this.semiColon = semiColon;
    }

    @Override
    public String toString() {
        if (Constructor != null) {
            if (accessibilityModifier != null) {
                if (formalParameterList != null) {
                    if (functionBody != null || semiColon != null) {
                        if (functionBody != null) {
                            return "ConstructorDeclaration{" +
                                    "accessibilityModifier=" + accessibilityModifier +
                                    ", Constructor='" + Constructor + '\'' +
                                    ", formalParameterList=" + formalParameterList +
                                    ", functionBody=" + functionBody +
                                    '}';
                        } else {
                            return "ConstructorDeclaration{" +
                                    "accessibilityModifier=" + accessibilityModifier +
                                    ", Constructor='" + Constructor + '\'' +
                                    ", formalParameterList=" + formalParameterList +
                                    ", semiColon='" + semiColon + '\'' +
                                    '}';

                        }
                        // Case 1: All are not null (either functionBody or semiColon is not null)
                    } else {
                        return "ConstructorDeclaration{" +
                                "accessibilityModifier=" + accessibilityModifier +
                                ", Constructor='" + Constructor + '\'' +
                                ", formalParameterList=" + formalParameterList +
                                '}';
                        // Case 2: accessibilityModifier and formalParameterList are not null, both functionBody and semiColon are null
                    }
                } else {
                    if (functionBody != null || semiColon != null) {
                        if (functionBody != null) {
                            return "ConstructorDeclaration{" +
                                    "accessibilityModifier=" + accessibilityModifier +
                                    ", Constructor='" + Constructor + '\'' +
                                    ", functionBody=" + functionBody +
                                    '}';
                        } else {
                            return "ConstructorDeclaration{" +
                                    "accessibilityModifier=" + accessibilityModifier +
                                    ", Constructor='" + Constructor + '\'' +
                                    ", semiColon='" + semiColon + '\'' +
                                    '}';
                        }
                        // Case 3: accessibilityModifier and either functionBody or semiColon are not null, formalParameterList is null
                    } else {
                        return "ConstructorDeclaration{" +
                                "accessibilityModifier=" + accessibilityModifier +
                                ", Constructor='" + Constructor + '\'' +
                                '}';
                        // Case 4: accessibilityModifier is not null, formalParameterList, functionBody, and semiColon are null
                    }
                }
            } else {
                if (formalParameterList != null) {
                    if (functionBody != null || semiColon != null) {
                        if (functionBody != null) {
                            return "ConstructorDeclaration{" +
                                    ", Constructor='" + Constructor + '\'' +
                                    ", formalParameterList=" + formalParameterList +
                                    ", functionBody=" + functionBody +
                                    '}';

                        } else {
                            return "ConstructorDeclaration{" +
                                    ", Constructor='" + Constructor + '\'' +
                                    ", formalParameterList=" + formalParameterList +
                                    ", semiColon='" + semiColon + '\'' +
                                    '}';

                        }
                        // Case 5: formalParameterList and either functionBody or semiColon are not null, accessibilityModifier is null
                    } else {
                        return "ConstructorDeclaration{" +
                                ", Constructor='" + Constructor + '\'' +
                                ", formalParameterList=" + formalParameterList +
                                '}';
                        // Case 6: formalParameterList is not null, accessibilityModifier, functionBody, and semiColon are null
                    }
                } else {
                    if (functionBody != null || semiColon != null) {
                        if (functionBody != null) {
                            return "ConstructorDeclaration{" +
                                    ", Constructor='" + Constructor + '\'' +
                                    ", functionBody=" + functionBody +
                                    '}';
                        } else {
                            return "ConstructorDeclaration{" +
                                    ", Constructor='" + Constructor + '\'' +
                                    ", semiColon='" + semiColon + '\'' +
                                    '}';
                        }
                        // Case 7: Either functionBody or semiColon is not null, accessibilityModifier and formalParameterList are null
                    } else {
                        return "ConstructorDeclaration{" +
                                ", Constructor='" + Constructor + '\'' +
                                '}';
                        // Case 8: All are null
                    }
                }
            }
        }
        return "ConstructorDeclaration{\n" +
                "}";
    }

}
