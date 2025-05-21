package AST;

public class OptionalParameter {
    DecoratorList decoratorList ;
    AccessibilityModifier accessibilityModifier;
    IdentifierOrPattern identifierOrPattern;
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
        return "OptionalParameter{" +
                "decoratorList=" + decoratorList +
                ", accessibilityModifier=" + accessibilityModifier +
                ", identifierOrPattern=" + identifierOrPattern +
                ", typeAnnotation=" + typeAnnotation +
                '}';
    }
}
