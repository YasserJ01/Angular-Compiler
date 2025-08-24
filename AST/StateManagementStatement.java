package AST;

public class StateManagementStatement {
    String stateType; // "signal", "store", "observable"
    Identifier stateName;
    TypeAnnotation typeAnnotation;
    SingleExpression initialValue;

    public String getStateType() {
        return stateType;
    }

    public void setStateType(String stateType) {
        this.stateType = stateType;
    }

    public Identifier getStateName() {
        return stateName;
    }

    public void setStateName(Identifier stateName) {
        this.stateName = stateName;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public SingleExpression getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(SingleExpression initialValue) {
        this.initialValue = initialValue;
    }

    @Override
    public String toString() {
        return "StateManagement{" + '\n' +
                "stateType=" + stateType + '\n' +
                ", stateName=" + stateName + '\n' +
                ", typeAnnotation=" + typeAnnotation + '\n' +
                ", initialValue=" + initialValue + '\n' +
                '}';
    }
}