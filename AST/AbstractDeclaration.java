package AST;

public class AbstractDeclaration {
    String abstraction;
    Identifier identifier;
    CallSignature callSignature;
    VariableStatement variableStatement;
    Eos eos;

    public String getAbstraction() {
        return abstraction;
    }

    public void setAbstraction(String abstraction) {
        this.abstraction = abstraction;
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

    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }

    @Override
    public String toString() {
        if (identifier != null && callSignature != null) {
            return "AbstractDeclaration{\n" +
                    "Abstract=" + abstraction + '\n' +
                    "identifier=" + identifier + '\n' +
                    ", callSignature=" + callSignature + '\n' +
                    ", eos" + eos + '\n' +
                    "}";
        } else if (variableStatement != null) {
            return "AbstractDeclaration{\n" +
                    "Abstract=" + abstraction + '\n' +
                    ", variableStatement=" + variableStatement + '\n' +
                    ", eos" + eos + '\n' +
                    "}";
        }
        return "";
    }
}
