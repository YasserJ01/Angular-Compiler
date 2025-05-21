package AST;

public class Statement {
    Block block;
    VariableStatement variableStatement;
    ImportStatement importStatement;
    ExportStatement exportStatement;
    EmptyStatement_ emptyStatement_;
    ClassDeclaration classDeclaration;
    FunctionDeclaration functionDeclaration;
    ExpressionStatement expressionStatement;
    IfStatement ifStatement;
    IterationStatement iterationStatement;
    ContinueStatement continueStatement;
    BreakStatement breakStatement;
    ReturnStatement returnStatement;
    YieldStatement yieldStatement;
    WithStatement withStatement;
    LabelledStatement labelledStatement;
    SwitchStatement switchStatement;
    ThrowStatement throwStatement;
    TryStatement tryStatement;
    DebuggerStatement debuggerStatement;
    ArrowFunctionDeclaration arrowFunctionDeclaration;

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public ImportStatement getImportStatement() {
        return importStatement;
    }

    public void setImportStatement(ImportStatement importStatement) {
        this.importStatement = importStatement;
    }

    public ExportStatement getExportStatement() {
        return exportStatement;
    }

    public void setExportStatement(ExportStatement exportStatement) {
        this.exportStatement = exportStatement;
    }

    public EmptyStatement_ getEmptyStatement_() {
        return emptyStatement_;
    }

    public void setEmptyStatement_(EmptyStatement_ emptyStatement_) {
        this.emptyStatement_ = emptyStatement_;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public ExpressionStatement getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(ExpressionStatement expressionStatement) {
        this.expressionStatement = expressionStatement;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public IterationStatement getIterationStatement() {
        return iterationStatement;
    }

    public void setIterationStatement(IterationStatement iterationStatement) {
        this.iterationStatement = iterationStatement;
    }

    public ContinueStatement getContinueStatement() {
        return continueStatement;
    }

    public void setContinueStatement(ContinueStatement continueStatement) {
        this.continueStatement = continueStatement;
    }

    public BreakStatement getBreakStatement() {
        return breakStatement;
    }

    public void setBreakStatement(BreakStatement breakStatement) {
        this.breakStatement = breakStatement;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    public YieldStatement getYieldStatement() {
        return yieldStatement;
    }

    public void setYieldStatement(YieldStatement yieldStatement) {
        this.yieldStatement = yieldStatement;
    }

    public WithStatement getWithStatement() {
        return withStatement;
    }

    public void setWithStatement(WithStatement withStatement) {
        this.withStatement = withStatement;
    }

    public LabelledStatement getLabelledStatement() {
        return labelledStatement;
    }

    public void setLabelledStatement(LabelledStatement labelledStatement) {
        this.labelledStatement = labelledStatement;
    }

    public SwitchStatement getSwitchStatement() {
        return switchStatement;
    }

    public void setSwitchStatement(SwitchStatement switchStatement) {
        this.switchStatement = switchStatement;
    }

    public ThrowStatement getThrowStatement() {
        return throwStatement;
    }

    public void setThrowStatement(ThrowStatement throwStatement) {
        this.throwStatement = throwStatement;
    }

    public TryStatement getTryStatement() {
        return tryStatement;
    }

    public void setTryStatement(TryStatement tryStatement) {
        this.tryStatement = tryStatement;
    }

    public DebuggerStatement getDebuggerStatement() {
        return debuggerStatement;
    }

    public void setDebuggerStatement(DebuggerStatement debuggerStatement) {
        this.debuggerStatement = debuggerStatement;
    }

    public ArrowFunctionDeclaration getArrowFunctionDeclaration() {
        return arrowFunctionDeclaration;
    }

    public void setArrowFunctionDeclaration(ArrowFunctionDeclaration arrowFunctionDeclaration) {
        this.arrowFunctionDeclaration = arrowFunctionDeclaration;
    }

    @Override
    public String toString() {
        if (block != null) {
            return "Statement{" +'\n'+
                    "block=" + block + '\n' +
                    "}";
        } else if (variableStatement != null) {
            return "Statement{" +'\n'+
                    variableStatement + '\n' +
                    "}";
        } else if (importStatement != null) {
            return "Statement{" +'\n'+
                     importStatement + '\n' +
                    "}";
        }else if (exportStatement != null) {
            return "Statement{\n" +
                    "exportStatement=" + exportStatement + '\n' +
                    "}";

        }  else if (emptyStatement_ != null) {
            return "Statement{\n" +
                    "emptyStatement=" + emptyStatement_ + '\n' +
                    "}";
        } else if (classDeclaration != null) {
            return "Statement{\n" +
                    classDeclaration + '\n' +
                    "}";
        } else if (functionDeclaration != null) {
            return "Statement{\n" +
                    "functionDeclaration=" + functionDeclaration + '\n' +
                    "}";
        } else if (expressionStatement != null) {
            return "Statement{" +'\n'+
                    expressionStatement + '\n' +
                    "}";
        } else if (ifStatement != null) {
            return "Statement{\n" +
                    "ifStatement=" + ifStatement + '\n' +
                    "}";
        } else if (iterationStatement != null) {
            return "Statement{\n" +
                    "iterationStatement=" + iterationStatement + '\n' +
                    "}";
        } else if (continueStatement != null) {
            return "Statement{\n" +
                    "continueStatement=" + continueStatement + '\n' +
                    "}";
        } else if (breakStatement != null) {
            return "Statement{\n" +
                    "breakStatement=" + breakStatement + '\n' +
                    "}";
        } else if (returnStatement != null) {
            return "Statement{\n" +
                    "returnStatement=" + returnStatement + '\n' +
                    "}";
        } else if (yieldStatement != null) {
            return "Statement{\n" +
                    "yieldStatement=" + yieldStatement + '\n' +
                    "}";
        } else if (withStatement != null) {
            return "Statement{\n" +
                    "withStatement=" + withStatement + '\n' +
                    "}";
        } else if (labelledStatement != null) {
            return "Statement{\n" +
                    "labelledStatement=" + labelledStatement + '\n' +
                    "}";
        } else if (switchStatement != null) {
            return "Statement{\n" +
                    "switchStatement=" + switchStatement + '\n' +
                    "}";
        } else if (throwStatement != null) {
            return "Statement{\n" +
                    "throwStatement=" + throwStatement + '\n' +
                    "}";
        } else if (tryStatement != null) {
            return "Statement{\n" +
                    "tryStatement=" + tryStatement + '\n' +
                    "}";
        } else if (debuggerStatement != null) {
            return "Statement{\n" +
                    "debuggerStatement=" + debuggerStatement + '\n' +
                    "}";
        }
            return "Statement{\n" +
                    "arrowFunctionDeclaration=" + arrowFunctionDeclaration + '\n' +
                    "}";
    }
}
