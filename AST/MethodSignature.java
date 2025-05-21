package AST;

public class MethodSignature {
    PropertyName propertyName;
    CallSignature callSignature;

    public PropertyName getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(PropertyName propertyName) {
        this.propertyName = propertyName;
    }

    public CallSignature getCallSignature() {
        return callSignature;
    }

    public void setCallSignature(CallSignature callSignature) {
        this.callSignature = callSignature;
    }

    @Override
    public String toString() {
        return "MethodSignature{" +
                "propertyName=" + propertyName + '\n' +
                ", callSignature=" + callSignature + '\n' +
                '}';
    }
}
