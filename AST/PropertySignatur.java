package AST;

public class PropertySignatur {
    String readOnly;
    PropertyName propertyName;
    TypeAnnotation typeAnnotation;

    public String getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(String readOnly) {
        this.readOnly = readOnly;
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

    @Override
    public String toString() {
        if (readOnly != null) {
            if (typeAnnotation != null) {
                return "PropertySignatur{" +
                        "readOnly='" + readOnly + '\n'+
                        ", propertyName=" + propertyName +
                        ", typeAnnotation=" + typeAnnotation +
                        '}';
            } else {
                return "PropertySignatur{" +
                        "readOnly='" + readOnly + '\n'+
                        ", propertyName=" + propertyName +
                        '}';
            }
        } else {
            if (typeAnnotation != null) {
                return "PropertySignatur\n{" +
                        ", propertyName=" + propertyName +'\n'+
                        ", typeAnnotation=" + typeAnnotation +'\n'+
                        '}';
            } else {
                return "PropertySignatur{" +
                        ", propertyName=" + propertyName +'\n'+
                        '}';
            }
        }

    }
}
