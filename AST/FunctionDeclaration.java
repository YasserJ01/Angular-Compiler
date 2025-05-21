package AST;

public class FunctionDeclaration {
    String async;
    String function_;
    Identifier identifier;
    CallSignature callSignature;
    FunctionBody functionBody;
    String semiColon;

    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public String getFunction_() {
        return function_;
    }

    public void setFunction_(String function_) {
        this.function_ = function_;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
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

    public String getSemiColon() {
        return semiColon;
    }

    public void setSemiColon(String semiColon) {
        this.semiColon = semiColon;
    }

    @Override
    public String toString() {
        if (async != null) {
            return "FunctionDeclaration{" +
                    "async='" + async + '\n' +
                    ", function_=" + function_ + '\n' +
                    ", identifier=" + identifier + '\n' +
                    ", callSignature=" + callSignature + '\n' +
                    ", functionBody=" + functionBody + '\n' +
                    ", semiColon='" + semiColon + '\n' +
                    '}';
        }
        return "FunctionDeclaration{" +
                ", function_=" + function_ + '\n' +
                ", identifier=" + identifier + '\n' +
                ", callSignature=" + callSignature + '\n' +
                ", functionBody=" + functionBody + '\n' +
                ", semiColon='" + semiColon + '\n' +
                '}';
    }
}
