package AST;

public class Type_ {
    UnionOrIntersectionOrPrimaryType unionOrIntersectionOrPrimaryType;
    FunctionType functionType;
    ConstructorType constructorType;
    TypeGeneric typeGeneric;

    public UnionOrIntersectionOrPrimaryType getUnionOrIntersectionOrPrimaryType() {
        return unionOrIntersectionOrPrimaryType;
    }

    public void setUnionOrIntersectionOrPrimaryType(UnionOrIntersectionOrPrimaryType unionOrIntersectionOrPrimaryType) {
        this.unionOrIntersectionOrPrimaryType = unionOrIntersectionOrPrimaryType;
    }

    public FunctionType getFunctionType() {
        return functionType;
    }

    public void setFunctionType(FunctionType functionType) {
        this.functionType = functionType;
    }

    public ConstructorType getConstructorType() {
        return constructorType;
    }

    public void setConstructorType(ConstructorType constructorType) {
        this.constructorType = constructorType;
    }

    public TypeGeneric getTypeGeneric() {
        return typeGeneric;
    }

    public void setTypeGeneric(TypeGeneric typeGeneric) {
        this.typeGeneric = typeGeneric;
    }

    @Override
    public String toString() {
        if (unionOrIntersectionOrPrimaryType != null) {
            return "Type_{" +'\n'+
                    unionOrIntersectionOrPrimaryType + '\n' +
                    '}';
        } else if (functionType != null) {
            return "Type_{" +'\n'+
                    functionType + '\n' +
                    '}';
        } else if (constructorType != null) {
            return "Type_{" +'\n'+
                    constructorType + '\n' +
                    '}';
        }
        return "Type_{" +'\n'+
                typeGeneric + '\n' +
                '}';
    }
}
