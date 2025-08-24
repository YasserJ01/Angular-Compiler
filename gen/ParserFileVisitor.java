// Generated from C:/Users/Yasser/Documents/NetBeansProjects/untitled2/ParserFile.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserFile}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserFile#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserFile.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#sourceElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElements(ParserFile.SourceElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserFile.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ParserFile.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(ParserFile.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(ParserFile.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(ParserFile.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ParserFile.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#classHeritage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeritage(ParserFile.ClassHeritageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#classTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTail(ParserFile.ClassTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ParserFile.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#stateManagementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateManagementStatement(ParserFile.StateManagementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#navigationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationStatement(ParserFile.NavigationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#injectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectionStatement(ParserFile.InjectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#routeDefinitionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteDefinitionStatement(ParserFile.RouteDefinitionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#reservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedWord(ParserFile.ReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(ParserFile.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(ParserFile.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#abstractDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclaration(ParserFile.AbstractDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#importFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromBlock(ParserFile.ImportFromBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#importModuleItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModuleItems(ParserFile.ImportModuleItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#importAliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAliasName(ParserFile.ImportAliasNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#moduleExportName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleExportName(ParserFile.ModuleExportNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#importedBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportedBinding(ParserFile.ImportedBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#importDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefault(ParserFile.ImportDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#importNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamespace(ParserFile.ImportNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#importFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFrom(ParserFile.ImportFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#aliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasName(ParserFile.AliasNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#exportFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportFromBlock(ParserFile.ExportFromBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#exportModuleItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportModuleItems(ParserFile.ExportModuleItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#exportAliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportAliasName(ParserFile.ExportAliasNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ParserFile.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(ParserFile.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ParserFile.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#emptyStatement_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement_(ParserFile.EmptyStatement_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ParserFile.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ParserFile.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(ParserFile.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ParserFile.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ParserFile.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarStatement(ParserFile.ForVarStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(ParserFile.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarInStatement(ParserFile.ForVarInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOfStatement(ParserFile.ForOfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForVarOfStatement}
	 * labeled alternative in {@link ParserFile#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarOfStatement(ParserFile.ForVarOfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarModifier(ParserFile.VarModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(ParserFile.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(ParserFile.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ParserFile.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ParserFile.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(ParserFile.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#caseClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClauses(ParserFile.CaseClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(ParserFile.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(ParserFile.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(ParserFile.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(ParserFile.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#catchProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchProduction(ParserFile.CatchProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#finallyProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyProduction(ParserFile.FinallyProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#classExtendsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExtendsClause(ParserFile.ClassExtendsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#implementsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsClause(ParserFile.ImplementsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElement(ParserFile.ClassElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyMemberDeclaration(ParserFile.PropertyMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#propertyMemberBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyMemberBase(ParserFile.PropertyMemberBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#indexMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexMemberDeclaration(ParserFile.IndexMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#iteratorBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteratorBlock(ParserFile.IteratorBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#iteratorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteratorDefinition(ParserFile.IteratorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ParserFile.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#formalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterArg(ParserFile.FormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameterArg(ParserFile.LastFormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(ParserFile.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(ParserFile.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(ParserFile.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(ParserFile.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(ParserFile.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ParserFile.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(ParserFile.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ParserFile.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#expressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSequence(ParserFile.ExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(ParserFile.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(ParserFile.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(ParserFile.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(ParserFile.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#objectExpressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpressionSequence(ParserFile.ObjectExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlTagStartName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagStartName(ParserFile.HtmlTagStartNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlTagClosingName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagClosingName(ParserFile.HtmlTagClosingNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagName(ParserFile.HtmlTagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(ParserFile.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlAttributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeName(ParserFile.HtmlAttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeValue(ParserFile.HtmlAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#interpolationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationExpression(ParserFile.InterpolationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSequence(ParserFile.HtmlSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#asExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsExpression(ParserFile.AsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable(ParserFile.AssignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(ParserFile.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(ParserFile.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(ParserFile.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ParserFile.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(ParserFile.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#identifierName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierName(ParserFile.IdentifierNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ParserFile.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#identifierOrKeyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrKeyWord(ParserFile.IdentifierOrKeyWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#bindingPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingPattern(ParserFile.BindingPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(ParserFile.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(ParserFile.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(ParserFile.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(ParserFile.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(ParserFile.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(ParserFile.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(ParserFile.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(ParserFile.Type_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionOrIntersectionOrPrimaryType(ParserFile.UnionOrIntersectionOrPrimaryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#primaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryType(ParserFile.PrimaryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#predefinedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefinedType(ParserFile.PredefinedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(ParserFile.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#typeGeneric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeGeneric(ParserFile.TypeGenericContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(ParserFile.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#tupleElementTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleElementTypes(ParserFile.TupleElementTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(ParserFile.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#constructorType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorType(ParserFile.ConstructorTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotation(ParserFile.TypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#callSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSignature(ParserFile.CallSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ParserFile.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ParserFile.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#restParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestParameter(ParserFile.RestParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#requiredParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiredParameter(ParserFile.RequiredParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#accessibilityModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessibilityModifier(ParserFile.AccessibilityModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#identifierOrPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrPattern(ParserFile.IdentifierOrPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#indexSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexSignature(ParserFile.IndexSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(ParserFile.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceTypeList(ParserFile.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#namespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceName(ParserFile.NamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#decoratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorList(ParserFile.DecoratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(ParserFile.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#decoratorMemberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorMemberExpression(ParserFile.DecoratorMemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#decoratorCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorCallExpression(ParserFile.DecoratorCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(ParserFile.EosContext ctx);
}