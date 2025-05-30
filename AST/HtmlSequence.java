package AST;

public class HtmlSequence {
    PropertyName propertyName;
    IdentifierName identifierName;

    public PropertyName getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(PropertyName propertyName) {
        this.propertyName = propertyName;
    }

    public IdentifierName getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(IdentifierName identifierName) {
        this.identifierName = identifierName;
    }

    @Override
    public String toString() {
        return "HtmlSequence{" + '\n' +
                propertyName + identifierName + '\n'+
                '}';
    }
}
