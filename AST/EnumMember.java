package AST;

public class EnumMember {
    PropertyName propertyName;
    SingleExpression singleExpression;

    public PropertyName getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(PropertyName propertyName) {
        this.propertyName = propertyName;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    @Override
    public String toString() {
        return '\n' +
                "propertyName=" + propertyName + '\n' +
                ", singleExpression=" + singleExpression + '\n' +
                '}';
    }
}
