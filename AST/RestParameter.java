package AST;

public class RestParameter {
    SingleExpression singleExpression;
    TypeAnnotation typeAnnotation;

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    @Override
    public String toString() {
        if (typeAnnotation != null){
            return "RestParameter{\n" +
                    "singleExpression=" + singleExpression +
                    ", typeAnnotation=" + typeAnnotation +
                    '}';
        }
        return "RestParameter{\n" +
                "singleExpression=" + singleExpression +
                '}';
    }
}
