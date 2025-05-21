package AST;

public class RequiredParameter {
    DecoratorList decoratorList;
    IdentifierOrPattern identifierOrPattern;
    AccessibilityModifier accessibilityModifier;
    TypeAnnotation typeAnnotation;


    public DecoratorList getDecoratorList() {
        return decoratorList;
    }

    public void setDecoratorList(DecoratorList decoratorList) {
        this.decoratorList = decoratorList;
    }

    public AccessibilityModifier getAccessibilityModifier() {
        return accessibilityModifier;
    }

    public void setAccessibilityModifier(AccessibilityModifier accessibilityModifier) {
        this.accessibilityModifier = accessibilityModifier;
    }

    public IdentifierOrPattern getIdentifierOrPattern() {
        return identifierOrPattern;
    }

    public void setIdentifierOrPattern(IdentifierOrPattern identifierOrPattern) {
        this.identifierOrPattern = identifierOrPattern;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }



    @Override
    public String toString() {
        if (decoratorList != null) {
            if (accessibilityModifier != null) {
                if (typeAnnotation != null) {
                    return "RequiredParameter{" +'\n'+
                             decoratorList +'\n'+
                             identifierOrPattern +'\n'+
                             accessibilityModifier +'\n'+
                             typeAnnotation +'\n'+
                            '}';
                } else {
                    return "RequiredParameter{" +'\n'+
                             decoratorList +'\n'+
                             identifierOrPattern +'\n'+
                             accessibilityModifier +'\n'+
                            '}';
                    // Case 2: decoratorList and identifierOrPattern are not null, typeAnnotation is null
                }
            } else {
                if (typeAnnotation != null) {
                    return "RequiredParameter{" +'\n'+
                             decoratorList +'\n'+
                            identifierOrPattern +'\n'+
                             typeAnnotation +'\n'+
                            '}';
                    // Case 3: decoratorList and typeAnnotation are not null, identifierOrPattern is null
                } else {
                    return "RequiredParameter{" +'\n'+
                             decoratorList +'\n'+
                            identifierOrPattern +'\n'+
                            '}';
                    // Case 4: decoratorList is not null, identifierOrPattern and typeAnnotation are null
                }
            }
        } else {
            if (accessibilityModifier != null) {
                if (typeAnnotation != null) {
                    return "RequiredParameter{" +'\n'+
                             identifierOrPattern +'\n'+
                             accessibilityModifier +'\n'+
                             typeAnnotation +'\n'+
                            '}';
                    // Case 5: identifierOrPattern and typeAnnotation are not null, decoratorList is null
                } else {
                    return "RequiredParameter{" +'\n'+
                             identifierOrPattern +'\n'+
                             accessibilityModifier +'\n'+
                            '}';
                    // Case 6: identifierOrPattern is not null, decoratorList and typeAnnotation are null
                }
            } else {
                if (typeAnnotation != null) {
                    return "RequiredParameter{" +'\n'+
                             identifierOrPattern +'\n'+
                             typeAnnotation +'\n'+
                            '}';
                    // Case 7: typeAnnotation is not null, decoratorList and identifierOrPattern are null
                } else {
                    return "RequiredParameter{" +'\n'+
                            '}';
                    // Case 8: All are nulsl
                }
            }
        }
    }

}
