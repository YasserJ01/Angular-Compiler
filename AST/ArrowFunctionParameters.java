package AST;

public class ArrowFunctionParameters {
    PropertyName propertyName;
    FormalParameterList formalParameterList;

    public PropertyName getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(PropertyName propertyName) {
        this.propertyName = propertyName;
    }

    public FormalParameterList getFormalParameterList() {
        return formalParameterList;
    }

    public void setFormalParameterList(FormalParameterList formalParameterList) {
        this.formalParameterList = formalParameterList;
    }

    @Override
    public String toString() {
        if (propertyName != null) {
            return "ArrowFunctionParameters{" +
                    "propertyName=" + propertyName + '\n' +
                    '}';
        }
        return "ArrowFunctionParameters{" +
                ", formalParameterList=" + formalParameterList + '\n' +
                '}';
    }
}
