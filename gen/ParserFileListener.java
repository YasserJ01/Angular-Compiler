// Generated from C:/Users/Yasser/Documents/NetBeansProjects/untitled2/ParserFile.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserFile}.
 */
public interface ParserFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserFile#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserFile.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserFile.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(ParserFile.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(ParserFile.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(ParserFile.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(ParserFile.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParserFile.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParserFile.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ParserFile.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ParserFile.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(ParserFile.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(ParserFile.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(ParserFile.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(ParserFile.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(ParserFile.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(ParserFile.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ParserFile.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ParserFile.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#classHeritage}.
	 * @param ctx the parse tree
	 */
	void enterClassHeritage(ParserFile.ClassHeritageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#classHeritage}.
	 * @param ctx the parse tree
	 */
	void exitClassHeritage(ParserFile.ClassHeritageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#classTail}.
	 * @param ctx the parse tree
	 */
	void enterClassTail(ParserFile.ClassTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#classTail}.
	 * @param ctx the parse tree
	 */
	void exitClassTail(ParserFile.ClassTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ParserFile.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ParserFile.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(ParserFile.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(ParserFile.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(ParserFile.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(ParserFile.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(ParserFile.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(ParserFile.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#abstractDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclaration(ParserFile.AbstractDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#abstractDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclaration(ParserFile.AbstractDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportFromBlock(ParserFile.ImportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportFromBlock(ParserFile.ImportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#importModuleItems}.
	 * @param ctx the parse tree
	 */
	void enterImportModuleItems(ParserFile.ImportModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#importModuleItems}.
	 * @param ctx the parse tree
	 */
	void exitImportModuleItems(ParserFile.ImportModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#importAliasName}.
	 * @param ctx the parse tree
	 */
	void enterImportAliasName(ParserFile.ImportAliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#importAliasName}.
	 * @param ctx the parse tree
	 */
	void exitImportAliasName(ParserFile.ImportAliasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#moduleExportName}.
	 * @param ctx the parse tree
	 */
	void enterModuleExportName(ParserFile.ModuleExportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#moduleExportName}.
	 * @param ctx the parse tree
	 */
	void exitModuleExportName(ParserFile.ModuleExportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#importedBinding}.
	 * @param ctx the parse tree
	 */
	void enterImportedBinding(ParserFile.ImportedBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#importedBinding}.
	 * @param ctx the parse tree
	 */
	void exitImportedBinding(ParserFile.ImportedBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#importDefault}.
	 * @param ctx the parse tree
	 */
	void enterImportDefault(ParserFile.ImportDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#importDefault}.
	 * @param ctx the parse tree
	 */
	void exitImportDefault(ParserFile.ImportDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#importNamespace}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespace(ParserFile.ImportNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#importNamespace}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespace(ParserFile.ImportNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#importFrom}.
	 * @param ctx the parse tree
	 */
	void enterImportFrom(ParserFile.ImportFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#importFrom}.
	 * @param ctx the parse tree
	 */
	void exitImportFrom(ParserFile.ImportFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(ParserFile.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(ParserFile.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterExportFromBlock(ParserFile.ExportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitExportFromBlock(ParserFile.ExportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#exportModuleItems}.
	 * @param ctx the parse tree
	 */
	void enterExportModuleItems(ParserFile.ExportModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#exportModuleItems}.
	 * @param ctx the parse tree
	 */
	void exitExportModuleItems(ParserFile.ExportModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#exportAliasName}.
	 * @param ctx the parse tree
	 */
	void enterExportAliasName(ParserFile.ExportAliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#exportAliasName}.
	 * @param ctx the parse tree
	 */
	void exitExportAliasName(ParserFile.ExportAliasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ParserFile.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ParserFile.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(ParserFile.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(ParserFile.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ParserFile.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ParserFile.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement_(ParserFile.EmptyStatement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement_(ParserFile.EmptyStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ParserFile.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ParserFile.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ParserFile.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ParserFile.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(ParserFile.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(ParserFile.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ParserFile.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ParserFile.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ParserFile.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ParserFile.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForVarStatement(ParserFile.ForVarStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForVarStatement(ParserFile.ForVarStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(ParserFile.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(ParserFile.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForVarInStatement(ParserFile.ForVarInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForVarInStatement(ParserFile.ForVarInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForOfStatement(ParserFile.ForOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForOfStatement(ParserFile.ForOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarOfStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForVarOfStatement(ParserFile.ForVarOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarOfStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForVarOfStatement(ParserFile.ForVarOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(ParserFile.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(ParserFile.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(ParserFile.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(ParserFile.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(ParserFile.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(ParserFile.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ParserFile.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ParserFile.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ParserFile.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ParserFile.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(ParserFile.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(ParserFile.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(ParserFile.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(ParserFile.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(ParserFile.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(ParserFile.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(ParserFile.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(ParserFile.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(ParserFile.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(ParserFile.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(ParserFile.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(ParserFile.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(ParserFile.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(ParserFile.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(ParserFile.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(ParserFile.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#classExtendsClause}.
	 * @param ctx the parse tree
	 */
	void enterClassExtendsClause(ParserFile.ClassExtendsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#classExtendsClause}.
	 * @param ctx the parse tree
	 */
	void exitClassExtendsClause(ParserFile.ClassExtendsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#implementsClause}.
	 * @param ctx the parse tree
	 */
	void enterImplementsClause(ParserFile.ImplementsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#implementsClause}.
	 * @param ctx the parse tree
	 */
	void exitImplementsClause(ParserFile.ImplementsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(ParserFile.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(ParserFile.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyMemberDeclaration(ParserFile.PropertyMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyMemberDeclaration(ParserFile.PropertyMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#propertyMemberBase}.
	 * @param ctx the parse tree
	 */
	void enterPropertyMemberBase(ParserFile.PropertyMemberBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#propertyMemberBase}.
	 * @param ctx the parse tree
	 */
	void exitPropertyMemberBase(ParserFile.PropertyMemberBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#indexMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIndexMemberDeclaration(ParserFile.IndexMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#indexMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIndexMemberDeclaration(ParserFile.IndexMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#iteratorBlock}.
	 * @param ctx the parse tree
	 */
	void enterIteratorBlock(ParserFile.IteratorBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#iteratorBlock}.
	 * @param ctx the parse tree
	 */
	void exitIteratorBlock(ParserFile.IteratorBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#iteratorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIteratorDefinition(ParserFile.IteratorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#iteratorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIteratorDefinition(ParserFile.IteratorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ParserFile.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ParserFile.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArg(ParserFile.FormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArg(ParserFile.FormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterArg(ParserFile.LastFormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterArg(ParserFile.LastFormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(ParserFile.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(ParserFile.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(ParserFile.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(ParserFile.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(ParserFile.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(ParserFile.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(ParserFile.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(ParserFile.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(ParserFile.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(ParserFile.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ParserFile.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ParserFile.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ParserFile.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ParserFile.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ParserFile.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ParserFile.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(ParserFile.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(ParserFile.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(ParserFile.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(ParserFile.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(ParserFile.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(ParserFile.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(ParserFile.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(ParserFile.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(ParserFile.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(ParserFile.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#objectExpressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpressionSequence(ParserFile.ObjectExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#objectExpressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpressionSequence(ParserFile.ObjectExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlTagStartName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagStartName(ParserFile.HtmlTagStartNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlTagStartName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagStartName(ParserFile.HtmlTagStartNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlTagClosingName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagClosingName(ParserFile.HtmlTagClosingNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlTagClosingName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagClosingName(ParserFile.HtmlTagClosingNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagName(ParserFile.HtmlTagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagName(ParserFile.HtmlTagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(ParserFile.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(ParserFile.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeName(ParserFile.HtmlAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeName(ParserFile.HtmlAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeValue(ParserFile.HtmlAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeValue(ParserFile.HtmlAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#asExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsExpression(ParserFile.AsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#asExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsExpression(ParserFile.AsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(ParserFile.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(ParserFile.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(ParserFile.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(ParserFile.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(ParserFile.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(ParserFile.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ParserFile.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ParserFile.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ParserFile.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ParserFile.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(ParserFile.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(ParserFile.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(ParserFile.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(ParserFile.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ParserFile.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ParserFile.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#identifierOrKeyWord}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrKeyWord(ParserFile.IdentifierOrKeyWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#identifierOrKeyWord}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrKeyWord(ParserFile.IdentifierOrKeyWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#bindingPattern}.
	 * @param ctx the parse tree
	 */
	void enterBindingPattern(ParserFile.BindingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#bindingPattern}.
	 * @param ctx the parse tree
	 */
	void exitBindingPattern(ParserFile.BindingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(ParserFile.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(ParserFile.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(ParserFile.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(ParserFile.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(ParserFile.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(ParserFile.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(ParserFile.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(ParserFile.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ParserFile.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ParserFile.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(ParserFile.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(ParserFile.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(ParserFile.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(ParserFile.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(ParserFile.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(ParserFile.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	void enterUnionOrIntersectionOrPrimaryType(ParserFile.UnionOrIntersectionOrPrimaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	void exitUnionOrIntersectionOrPrimaryType(ParserFile.UnionOrIntersectionOrPrimaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryType(ParserFile.PrimaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryType(ParserFile.PrimaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#predefinedType}.
	 * @param ctx the parse tree
	 */
	void enterPredefinedType(ParserFile.PredefinedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#predefinedType}.
	 * @param ctx the parse tree
	 */
	void exitPredefinedType(ParserFile.PredefinedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(ParserFile.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(ParserFile.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#typeGeneric}.
	 * @param ctx the parse tree
	 */
	void enterTypeGeneric(ParserFile.TypeGenericContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#typeGeneric}.
	 * @param ctx the parse tree
	 */
	void exitTypeGeneric(ParserFile.TypeGenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ParserFile.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ParserFile.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#tupleElementTypes}.
	 * @param ctx the parse tree
	 */
	void enterTupleElementTypes(ParserFile.TupleElementTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#tupleElementTypes}.
	 * @param ctx the parse tree
	 */
	void exitTupleElementTypes(ParserFile.TupleElementTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(ParserFile.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(ParserFile.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#constructorType}.
	 * @param ctx the parse tree
	 */
	void enterConstructorType(ParserFile.ConstructorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#constructorType}.
	 * @param ctx the parse tree
	 */
	void exitConstructorType(ParserFile.ConstructorTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(ParserFile.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(ParserFile.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#callSignature}.
	 * @param ctx the parse tree
	 */
	void enterCallSignature(ParserFile.CallSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#callSignature}.
	 * @param ctx the parse tree
	 */
	void exitCallSignature(ParserFile.CallSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ParserFile.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ParserFile.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ParserFile.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ParserFile.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#restParameter}.
	 * @param ctx the parse tree
	 */
	void enterRestParameter(ParserFile.RestParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#restParameter}.
	 * @param ctx the parse tree
	 */
	void exitRestParameter(ParserFile.RestParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#requiredParameter}.
	 * @param ctx the parse tree
	 */
	void enterRequiredParameter(ParserFile.RequiredParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#requiredParameter}.
	 * @param ctx the parse tree
	 */
	void exitRequiredParameter(ParserFile.RequiredParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#accessibilityModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessibilityModifier(ParserFile.AccessibilityModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#accessibilityModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessibilityModifier(ParserFile.AccessibilityModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#identifierOrPattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrPattern(ParserFile.IdentifierOrPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#identifierOrPattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrPattern(ParserFile.IdentifierOrPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#indexSignature}.
	 * @param ctx the parse tree
	 */
	void enterIndexSignature(ParserFile.IndexSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#indexSignature}.
	 * @param ctx the parse tree
	 */
	void exitIndexSignature(ParserFile.IndexSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ParserFile.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ParserFile.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceTypeList(ParserFile.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceTypeList(ParserFile.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#namespaceName}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceName(ParserFile.NamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#namespaceName}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceName(ParserFile.NamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#decoratorList}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorList(ParserFile.DecoratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#decoratorList}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorList(ParserFile.DecoratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(ParserFile.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(ParserFile.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#decoratorMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorMemberExpression(ParserFile.DecoratorMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#decoratorMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorMemberExpression(ParserFile.DecoratorMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#decoratorCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorCallExpression(ParserFile.DecoratorCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#decoratorCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorCallExpression(ParserFile.DecoratorCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(ParserFile.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(ParserFile.EosContext ctx);
}