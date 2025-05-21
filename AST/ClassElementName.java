package AST;

public class ClassElementName {
    PropertyName propertyName;
    PrivateIdentifier privateIdentifier;

    public PropertyName getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(PropertyName propertyName) {
        this.propertyName = propertyName;
    }

    public PrivateIdentifier getPrivateIdentifier() {
        return privateIdentifier;
    }

    public void setPrivateIdentifier(PrivateIdentifier privateIdentifier) {
        this.privateIdentifier = privateIdentifier;
    }

    @Override
    public String toString() {
        if (propertyName != null) {
            return "ClassElementName{" +
                    "propertyName=" + propertyName +
                    '}';
        }
        return "ClassElementName{" +
                ", privateIdentifier=" + privateIdentifier +
                '}';
    }
}
