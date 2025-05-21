package AST;

public class IdentifierOrPattern {
    IdentifierName identifierName;
    BindingPattern bindingPattern;

    public IdentifierName getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(IdentifierName identifierName) {
        this.identifierName = identifierName;
    }

    public BindingPattern getBindingPattern() {
        return bindingPattern;
    }

    public void setBindingPattern(BindingPattern bindingPattern) {
        this.bindingPattern = bindingPattern;
    }

    @Override
    public String toString() {
        if (identifierName != null) {
            return "IdentifierOrPattern{\n" +
                    "identifierName=" + identifierName +
                    '}';
        }
        return "IdentifierOrPattern{\n" +
                "bindingPattern=" + bindingPattern +
                '}';
    }
}
