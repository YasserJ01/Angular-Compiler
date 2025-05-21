package AST;

public class ArrowFunctionDeclaration {
    String async;
    ArrowFunctionParameters arrowFunctionParameters;
    TypeAnnotation typeAnnotation;
    ArrowFunctionBody arrowFunctionBody;

    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public ArrowFunctionParameters getArrowFunctionParameters() {
        return arrowFunctionParameters;
    }

    public void setArrowFunctionParameters(ArrowFunctionParameters arrowFunctionParameters) {
        this.arrowFunctionParameters = arrowFunctionParameters;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public ArrowFunctionBody getArrowFunctionBody() {
        return arrowFunctionBody;
    }

    public void setArrowFunctionBody(ArrowFunctionBody arrowFunctionBody) {
        this.arrowFunctionBody = arrowFunctionBody;
    }

    @Override
    public String toString() {
        if (async == null) {
            if (typeAnnotation == null) {
                return "ArrowFunctionDeclaration{" +
                        ", arrowFunctionParameters=" + arrowFunctionParameters + '\n' +
                        ", arrowFunctionBody=" + arrowFunctionBody + '\n' +
                        '}';
            }
            return "ArrowFunctionDeclaration{" +
                    ", arrowFunctionParameters=" + arrowFunctionParameters + '\n' +
                    ", arrowFunctionBody=" + arrowFunctionBody + '\n' +
                    ", typeAnnotation=" + typeAnnotation + '\n' +
                    '}';
        } else if (typeAnnotation == null) {
            return "ArrowFunctionDeclaration{" +
                    "async='" + async + '\n' +
                    ", arrowFunctionParameters=" + arrowFunctionParameters + '\n' +
                    ", arrowFunctionBody=" + arrowFunctionBody + '\n' +
                    '}';
        }
        return "ArrowFunctionDeclaration{" +
                "async='" + async + '\n' +
                ", arrowFunctionParameters=" + arrowFunctionParameters + '\n' +
                ", typeAnnotation=" + typeAnnotation + '\n' +
                ", arrowFunctionBody=" + arrowFunctionBody + '\n' +
                '}';
    }
}
