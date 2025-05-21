package AST;

public class PropertyMemberDeclaration {
    PropertyMemberBase propertyMemberBase;
    PropertyName propertyName;
    TypeAnnotation typeAnnotation;
    String semiColon;
    CallSignature callSignature;
    FunctionBody functionBody;
    AbstractDeclaration abstractDeclaration;

    public PropertyMemberBase getPropertyMemberBase() {
        return propertyMemberBase;
    }

    public void setPropertyMemberBase(PropertyMemberBase propertyMemberBase) {
        this.propertyMemberBase = propertyMemberBase;
    }

    public PropertyName getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(PropertyName propertyName) {
        this.propertyName = propertyName;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public String getSemiColon() {
        return semiColon;
    }

    public void setSemiColon(String semiColon) {
        this.semiColon = semiColon;
    }

    public CallSignature getCallSignature() {
        return callSignature;
    }

    public void setCallSignature(CallSignature callSignature) {
        this.callSignature = callSignature;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    public AbstractDeclaration getAbstractDeclaration() {
        return abstractDeclaration;
    }

    public void setAbstractDeclaration(AbstractDeclaration abstractDeclaration) {
        this.abstractDeclaration = abstractDeclaration;
    }

    @Override
    public String toString() {
        if (propertyMemberBase != null && propertyName != null) {
            if (typeAnnotation != null) {
                return "PropertyMemberDeclaration{" +'\n'+
                        propertyMemberBase +'\n'+
                        propertyName +'\n'+
                        typeAnnotation +'\n'+
                        ", semiColon='" + semiColon + '\n'+
                        '}';
            } else {
                return "PropertyMemberDeclaration{" +'\n'+
                        propertyMemberBase +'\n'+
                        propertyName +'\n'+
                        ", semiColon='" + semiColon + '\n'+
                        callSignature +'\n'+
                        functionBody +'\n'+
                        '}';
            }
        } else if (propertyMemberBase != null || propertyName != null) {
            return "PropertyMemberDeclaration{" +'\n'+
                    abstractDeclaration + '\n' +
                    '}';

        }
        return "";
    }
}
