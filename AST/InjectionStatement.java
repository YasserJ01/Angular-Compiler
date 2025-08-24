package AST;

public class InjectionStatement {
    String injectType; // "inject", "Injectable"
    Identifier serviceName;
    TypeAnnotation serviceType;
    ArrayLiteral dependencies;

    public String getInjectType() {
        return injectType;
    }

    public void setInjectType(String injectType) {
        this.injectType = injectType;
    }

    public Identifier getServiceName() {
        return serviceName;
    }

    public void setServiceName(Identifier serviceName) {
        this.serviceName = serviceName;
    }

    public TypeAnnotation getServiceType() {
        return serviceType;
    }

    public void setServiceType(TypeAnnotation serviceType) {
        this.serviceType = serviceType;
    }

    public ArrayLiteral getDependencies() {
        return dependencies;
    }

    public void setDependencies(ArrayLiteral dependencies) {
        this.dependencies = dependencies;
    }

    @Override
    public String toString() {
        return "InjectionStatement{" + '\n' +
                "injectType=" + injectType + '\n' +
                ", serviceName=" + serviceName + '\n' +
                ", serviceType=" + serviceType + '\n' +
                ", dependencies=" + dependencies + '\n' +
                '}';
    }
}