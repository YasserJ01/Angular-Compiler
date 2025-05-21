package AST;

import java.util.ArrayList;
import java.util.List;

public class IterationStatement {
    String Do;
    String While;
    String For;
    String SemiColon;
    String In;
    String Await;
    String As;
    Statement statement;
    ExpressionSequence expressionSequence;
    Eos eos;
    VarModifier varModifier;

    List<VariableDeclarationList> variableDeclarationList = new ArrayList<VariableDeclarationList>();
    SingleExpression singleExpression;
    VariableDeclaration variableDeclaration;
    Identifier identifier;
    Type_ type_;

    ModuleExportName moduleExportName;


    public ModuleExportName getModuleExportName() {
        return moduleExportName;
    }

    public void setModuleExportName(ModuleExportName moduleExportName) {
        this.moduleExportName = moduleExportName;
    }

    public String getDo() {
        return Do;
    }

    public void setDo(String aDo) {
        Do = aDo;
    }

    public String getWhile() {
        return While;
    }

    public void setWhile(String aWhile) {
        While = aWhile;
    }

    public String getFor() {
        return For;
    }

    public void setFor(String aFor) {
        For = aFor;
    }

    public String getSemiColon() {
        return SemiColon;
    }

    public void setSemiColon(String semiColon) {
        SemiColon = semiColon;
    }

    public String getIn() {
        return In;
    }

    public void setIn(String in) {
        In = in;
    }

    public String getAwait() {
        return Await;
    }

    public void setAwait(String await) {
        Await = await;
    }

    public String getAs() {
        return As;
    }

    public void setAs(String as) {
        As = as;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ExpressionSequence getExpressionSequence() {
        return expressionSequence;
    }

    public void setExpressionSequence(ExpressionSequence expressionSequence) {
        this.expressionSequence = expressionSequence;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }

    public VarModifier getVarModifier() {
        return varModifier;
    }

    public void setVarModifier(VarModifier varModifier) {
        this.varModifier = varModifier;
    }

    public List<VariableDeclarationList> getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(List<VariableDeclarationList> variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Type_ getType_() {
        return type_;
    }

    public void setType_(Type_ type_) {
        this.type_ = type_;
    }


    @Override
    public String toString() {
        if (Do != null && statement != null && While != null && expressionSequence != null && eos != null) {
            return "iterationStatement\n" + '{' +
                    ", Do=" + Do + '\n' +
                    ", statement=" + statement + '\n' +
                    ", While=" + While + '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' + ", moduleExportName=" + moduleExportName + '\n' +
                    ", eos=" + eos + '\n' +

                    '}';
        } else if (While != null && expressionSequence != null && statement != null) {
            return "iterationStatement\n" + '{' +
                    ", While=" + While + '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +
                    ", statement=" + statement + '\n' +


                    '}';
        } else if (For != null && expressionSequence != null && SemiColon != null && expressionSequence != null && SemiColon != null && statement != null) {
            return "iterationStatement\n" + '{' +
                    ", For=" + For + '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +
                    ", SemiColon=" + SemiColon + '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +
                    ", SemiColon=" + SemiColon + '\n' +
                    ", statement=" + statement + '\n' +

                    '}';
        } else if (For != null && SemiColon != null && SemiColon != null && statement != null) {
            return "iterationStatement\n" + '{' +
                    ", For=" + For + '\n' +

                    ", SemiColon=" + SemiColon + '\n' +

                    ", statement=" + statement + '\n' +

                    '}';
        }
        if (For != null && varModifier != null && variableDeclarationList != null && SemiColon != null && expressionSequence != null && statement != null) {
            return "iterationStatement\n" + '{' +
                    ", varModifier=" + varModifier + '\n' +
                    ", variableDeclarationList=" + variableDeclarationList + '\n' +
                    ", SemiColon=" + SemiColon + '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +
                    ", SemiColon=" + SemiColon + '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +
                    ", statement=" + statement + '\n' +

                    '}';
        } else if (For != null && varModifier != null && variableDeclarationList != null && SemiColon != null && statement != null) {
            return "iterationStatement\n" + '{' +
                    ", For=" + For + '\n' +

                    ", varModifier=" + SemiColon + '\n' +

                    ", variableDeclarationList=" + variableDeclarationList + '\n' +
                    ", SemiColon=" + SemiColon + '\n' +
                    ", statement=" + statement + '\n' +

                    '}';
        }

        if (For != null && varModifier != null && variableDeclarationList != null && SemiColon != null && expressionSequence != null && statement != null) {
            return "iterationStatement\n" + '{' +
                    ", For=" + For + '\n' +
                    ", singleExpression=" + singleExpression + '\n' +
                    ", In=" + In + '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +
                    '\n' +
                    ", statement=" + statement + '\n' +

                    '}';
        } else if (For != null && varModifier != null && variableDeclaration != null && In != null && expressionSequence != null && statement != null) {
            return "iterationStatement\n" + '{' +
                    ", For=" + For + '\n' +
                    ", varModifier=" + varModifier + '\n' +
                    ", In=" + In + '\n' +
                    ", variableDeclaration=" + variableDeclaration + '\n' +
                    '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +
                    ", statement=" + statement + '\n' +


                    '}';
        } else if (For != null && Await != null && singleExpression != null && identifier != null && expressionSequence != null && As != null && type_ != null && statement != null) {
            return "iterationStatement\n" + '{' +
                    ", For=" + For + '\n' +
                    ", Await=" + Await + '\n' +
                    ", singleExpression=" + singleExpression + '\n' +
                    ", identifier=" + identifier + '\n' +
                    '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +
                    ", As=" + As + '\n' +
                    ", type_=" + type_ + '\n' +
                    ", statement=" + statement + '\n' +


                    '}';
        } else if (For != null && singleExpression != null && identifier != null && expressionSequence != null && statement != null) {
            return "iterationStatement\n" + '{' +
                    ", For=" + For + '\n' +

                    ", singleExpression=" + singleExpression + '\n' +
                    ", identifier=" + identifier + '\n' +
                    '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +

                    ", statement=" + statement + '\n' + '}';
        } else if (For != null && Await != null && varModifier != null && variableDeclaration != null && identifier != null && expressionSequence != null && As != null && type_ != null && statement != null) {
            return "iterationStatement\n" + '{' +
                    ", For=" + For + '\n' +
                    ", Await=" + Await + '\n' +
                    ", varModifier=" + varModifier + '\n' +
                    ", variableDeclaration=" + variableDeclaration + '\n' +
                    '\n' +
                    ", identifier=" + identifier + '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +
                    ", As=" + As + '\n' +
                    ", type_=" + type_ + '\n' +
                    ", statement=" + statement + '\n' +


                    '}';
        } else if (For != null && varModifier != null && variableDeclaration != null && identifier != null && expressionSequence != null && statement != null) {
            return "iterationStatement\n" + '{' +
                    ", For=" + For + '\n' +
                    ", varModifier=" + varModifier + '\n' +
                    ", variableDeclaration=" + variableDeclaration + '\n' +
                    '\n' +
                    ", identifier=" + identifier + '\n' +
                    ", expressionSequence=" + expressionSequence + '\n' +

                    ", statement=" + statement + '\n' +
                    '}';
        }
        return "";
    }
}
