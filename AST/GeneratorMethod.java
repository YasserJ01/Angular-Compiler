package AST;

public class GeneratorMethod {
    String Async;
    PropertyName propertyName;
    FormalParameterList formalParameterList;
    FunctionBody functionBody;

    public String getAsync() {
        return Async;
    }

    public void setAsync(String async) {
        Async = async;
    }

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

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        if (propertyName != null && functionBody != null) {
            if (Async != null) {
                if (formalParameterList != null) {
                    return "GeneratorMethod{" +
                            "Async='" + Async + '\n' +
                            ", propertyName=" + propertyName + '\n' +
                            ", formalParameterList=" + formalParameterList + '\n' +
                            ", functionBody=" + functionBody + '\n' +
                            '}';
                } else {
                    return "GeneratorMethod{" +
                            "Async='" + Async + '\n' +
                            ", propertyName=" + propertyName + '\n' +
                            ", functionBody=" + functionBody + '\n' +
                            '}';
                }
            } else {
                if (formalParameterList != null) {
                    return "GeneratorMethod{" +
                            ", propertyName=" + propertyName + '\n' +
                            ", formalParameterList=" + formalParameterList + '\n' +
                            ", functionBody=" + functionBody + '\n' +
                            '}';
                } else {
                    return "GeneratorMethod{" +
                            ", propertyName=" + propertyName + '\n' +
                            ", functionBody=" + functionBody + '\n' +
                            '}';
                }
            }
        }
        return "";
    }
}
