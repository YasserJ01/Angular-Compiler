// Generated from C:/Users/Yasser/Documents/NetBeansProjects/untitled2/ParserFile.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParserFile extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, OpenBracket=3, CloseBracket=4, 
		OpenParen=5, CloseParen=6, OpenBrace=7, CloseBrace=8, SemiColon=9, Comma=10, 
		Assign=11, QuestionMark=12, QuestionMarkDot=13, Colon=14, Ellipsis=15, 
		Dot=16, PlusPlus=17, MinusMinus=18, Plus=19, Minus=20, BitNot=21, Not=22, 
		Multiply=23, Divide=24, Modulus=25, Power=26, NullCoalesce=27, Hashtag=28, 
		LeftShiftArithmetic=29, LessThan=30, MoreThan=31, LessThanEquals=32, GreaterThanEquals=33, 
		Equals_=34, NotEquals=35, IdentityEquals=36, IdentityNotEquals=37, BitAnd=38, 
		BitXOr=39, BitOr=40, And=41, Or=42, MultiplyAssign=43, DivideAssign=44, 
		ModulusAssign=45, PlusAssign=46, MinusAssign=47, LeftShiftArithmeticAssign=48, 
		RightShiftArithmeticAssign=49, RightShiftLogicalAssign=50, BitAndAssign=51, 
		BitXorAssign=52, BitOrAssign=53, PowerAssign=54, NullishCoalescingAssign=55, 
		ARROW=56, DOUBLE_L_CURLY=57, DOUBLE_R_CURLY=58, NullLiteral=59, BooleanLiteral=60, 
		DecimalLiteral=61, Break=62, Do=63, Instanceof=64, Typeof=65, Case=66, 
		Else=67, New=68, Var=69, Catch=70, Finally=71, Return=72, Void=73, Continue=74, 
		For=75, Switch=76, While=77, Debugger=78, Function_=79, This=80, With=81, 
		Default=82, If=83, Throw=84, Delete=85, In=86, Try=87, As=88, From=89, 
		ReadOnly=90, Async=91, Await=92, Yield=93, YieldStar=94, Class=95, Enum=96, 
		Extends=97, Super=98, Const=99, Export=100, Import=101, Implements=102, 
		Let=103, Private=104, Public=105, Interface=106, Package=107, Protected=108, 
		Static=109, Any=110, Number=111, Never=112, Boolean=113, String=114, Unique=115, 
		Symbol=116, Undefined=117, Object=118, Of=119, KeyOf=120, TypeAlias=121, 
		Constructor=122, Namespace=123, Require=124, Module=125, Declare=126, 
		Abstract=127, Is=128, StoreModule=129, EffectsModule=130, CreateAction=131, 
		CreateReducer=132, CreateSelector=133, RouterModule=134, NavigateByUrl=135, 
		ForRoot=136, ForFeature=137, Select=138, Dispatch=139, Navigate=140, Store=141, 
		Injectable=142, Signal=143, Computed=144, Effect=145, WritableSignal=146, 
		ReadonlySignal=147, BehaviorSubject=148, Observable=149, Subject=150, 
		Router=151, ActivatedRoute=152, Route=153, Routes=154, RouterOutlet=155, 
		RouterLink=156, RouterLinkActive=157, State=158, Action=159, Reducer=160, 
		Selector=161, OnInit=162, OnDestroy=163, OnChanges=164, AfterViewInit=165, 
		NgOnInit=166, NgOnDestroy=167, NgOnChanges=168, NgAfterViewInit=169, Inject=170, 
		Injector=171, InjectionToken=172, At=173, Identifier=174, AngularDirective=175, 
		StringLiteral=176, WhiteSpaces=177, HtmlComment=178, CDataComment=179, 
		UnexpectedCharacter=180, TagOpen=181, TagClose=182, TagSlashClose=183, 
		TagSlash=184, TagName=185, AttributeValue=186, Attribute=187, TagEquals=188;
	public static final int
		RULE_program = 0, RULE_sourceElements = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_variableStatement = 4, RULE_importStatement = 5, RULE_exportStatement = 6, 
		RULE_classDeclaration = 7, RULE_classHeritage = 8, RULE_classTail = 9, 
		RULE_functionDeclaration = 10, RULE_stateManagementStatement = 11, RULE_navigationStatement = 12, 
		RULE_injectionStatement = 13, RULE_routeDefinitionStatement = 14, RULE_reservedWord = 15, 
		RULE_keyword = 16, RULE_statementList = 17, RULE_abstractDeclaration = 18, 
		RULE_importFromBlock = 19, RULE_importModuleItems = 20, RULE_importAliasName = 21, 
		RULE_moduleExportName = 22, RULE_importedBinding = 23, RULE_importDefault = 24, 
		RULE_importNamespace = 25, RULE_importFrom = 26, RULE_aliasName = 27, 
		RULE_exportFromBlock = 28, RULE_exportModuleItems = 29, RULE_exportAliasName = 30, 
		RULE_declaration = 31, RULE_variableDeclarationList = 32, RULE_variableDeclaration = 33, 
		RULE_emptyStatement_ = 34, RULE_expressionStatement = 35, RULE_ifStatement = 36, 
		RULE_iterationStatement = 37, RULE_varModifier = 38, RULE_continueStatement = 39, 
		RULE_breakStatement = 40, RULE_returnStatement = 41, RULE_switchStatement = 42, 
		RULE_caseBlock = 43, RULE_caseClauses = 44, RULE_caseClause = 45, RULE_defaultClause = 46, 
		RULE_throwStatement = 47, RULE_tryStatement = 48, RULE_catchProduction = 49, 
		RULE_finallyProduction = 50, RULE_classExtendsClause = 51, RULE_implementsClause = 52, 
		RULE_classElement = 53, RULE_propertyMemberDeclaration = 54, RULE_propertyMemberBase = 55, 
		RULE_indexMemberDeclaration = 56, RULE_iteratorBlock = 57, RULE_iteratorDefinition = 58, 
		RULE_formalParameterList = 59, RULE_formalParameterArg = 60, RULE_lastFormalParameterArg = 61, 
		RULE_functionBody = 62, RULE_elementList = 63, RULE_arrayElement = 64, 
		RULE_propertyAssignment = 65, RULE_propertyName = 66, RULE_arguments = 67, 
		RULE_argumentList = 68, RULE_argument = 69, RULE_expressionSequence = 70, 
		RULE_singleExpression = 71, RULE_htmlElements = 72, RULE_htmlElement = 73, 
		RULE_htmlContent = 74, RULE_objectExpressionSequence = 75, RULE_htmlTagStartName = 76, 
		RULE_htmlTagClosingName = 77, RULE_htmlTagName = 78, RULE_htmlAttribute = 79, 
		RULE_htmlAttributeName = 80, RULE_htmlAttributeValue = 81, RULE_interpolationExpression = 82, 
		RULE_htmlSequence = 83, RULE_asExpression = 84, RULE_assignable = 85, 
		RULE_arrayLiteral = 86, RULE_objectLiteral = 87, RULE_assignmentOperator = 88, 
		RULE_literal = 89, RULE_numericLiteral = 90, RULE_identifierName = 91, 
		RULE_identifier = 92, RULE_identifierOrKeyWord = 93, RULE_bindingPattern = 94, 
		RULE_typeParameters = 95, RULE_typeParameterList = 96, RULE_typeParameter = 97, 
		RULE_constraint = 98, RULE_typeArguments = 99, RULE_typeArgumentList = 100, 
		RULE_typeArgument = 101, RULE_type_ = 102, RULE_unionOrIntersectionOrPrimaryType = 103, 
		RULE_primaryType = 104, RULE_predefinedType = 105, RULE_typeReference = 106, 
		RULE_typeGeneric = 107, RULE_typeName = 108, RULE_tupleElementTypes = 109, 
		RULE_functionType = 110, RULE_constructorType = 111, RULE_typeAnnotation = 112, 
		RULE_callSignature = 113, RULE_parameterList = 114, RULE_parameter = 115, 
		RULE_restParameter = 116, RULE_requiredParameter = 117, RULE_accessibilityModifier = 118, 
		RULE_identifierOrPattern = 119, RULE_indexSignature = 120, RULE_constructorDeclaration = 121, 
		RULE_classOrInterfaceTypeList = 122, RULE_namespaceName = 123, RULE_decoratorList = 124, 
		RULE_decorator = 125, RULE_decoratorMemberExpression = 126, RULE_decoratorCallExpression = 127, 
		RULE_eos = 128;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElements", "statement", "block", "variableStatement", 
			"importStatement", "exportStatement", "classDeclaration", "classHeritage", 
			"classTail", "functionDeclaration", "stateManagementStatement", "navigationStatement", 
			"injectionStatement", "routeDefinitionStatement", "reservedWord", "keyword", 
			"statementList", "abstractDeclaration", "importFromBlock", "importModuleItems", 
			"importAliasName", "moduleExportName", "importedBinding", "importDefault", 
			"importNamespace", "importFrom", "aliasName", "exportFromBlock", "exportModuleItems", 
			"exportAliasName", "declaration", "variableDeclarationList", "variableDeclaration", 
			"emptyStatement_", "expressionStatement", "ifStatement", "iterationStatement", 
			"varModifier", "continueStatement", "breakStatement", "returnStatement", 
			"switchStatement", "caseBlock", "caseClauses", "caseClause", "defaultClause", 
			"throwStatement", "tryStatement", "catchProduction", "finallyProduction", 
			"classExtendsClause", "implementsClause", "classElement", "propertyMemberDeclaration", 
			"propertyMemberBase", "indexMemberDeclaration", "iteratorBlock", "iteratorDefinition", 
			"formalParameterList", "formalParameterArg", "lastFormalParameterArg", 
			"functionBody", "elementList", "arrayElement", "propertyAssignment", 
			"propertyName", "arguments", "argumentList", "argument", "expressionSequence", 
			"singleExpression", "htmlElements", "htmlElement", "htmlContent", "objectExpressionSequence", 
			"htmlTagStartName", "htmlTagClosingName", "htmlTagName", "htmlAttribute", 
			"htmlAttributeName", "htmlAttributeValue", "interpolationExpression", 
			"htmlSequence", "asExpression", "assignable", "arrayLiteral", "objectLiteral", 
			"assignmentOperator", "literal", "numericLiteral", "identifierName", 
			"identifier", "identifierOrKeyWord", "bindingPattern", "typeParameters", 
			"typeParameterList", "typeParameter", "constraint", "typeArguments", 
			"typeArgumentList", "typeArgument", "type_", "unionOrIntersectionOrPrimaryType", 
			"primaryType", "predefinedType", "typeReference", "typeGeneric", "typeName", 
			"tupleElementTypes", "functionType", "constructorType", "typeAnnotation", 
			"callSignature", "parameterList", "parameter", "restParameter", "requiredParameter", 
			"accessibilityModifier", "identifierOrPattern", "indexSignature", "constructorDeclaration", 
			"classOrInterfaceTypeList", "namespaceName", "decoratorList", "decorator", 
			"decoratorMemberExpression", "decoratorCallExpression", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", 
			"'='", "'?'", "'?.'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", "'-'", 
			"'~'", "'!'", "'*'", "'/'", "'%'", "'**'", "'??'", "'#'", "'<<'", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", 
			"'|'", "'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
			"'>>='", "'>>>='", "'&='", "'^='", "'|='", "'**='", "'??='", "'=>'", 
			"'{{'", "'}}'", "'null'", null, null, "'break'", "'do'", "'instanceof'", 
			"'typeof'", "'case'", "'else'", "'new'", "'var'", "'catch'", "'finally'", 
			"'return'", "'void'", "'continue'", "'for'", "'switch'", "'while'", "'debugger'", 
			"'function'", "'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", 
			"'in'", "'try'", "'as'", "'from'", "'readonly'", "'async'", "'await'", 
			"'yield'", "'yield*'", "'class'", "'enum'", "'extends'", "'super'", "'const'", 
			"'export'", "'import'", "'implements'", "'let'", "'private'", "'public'", 
			"'interface'", "'package'", "'protected'", "'static'", "'any'", "'number'", 
			"'never'", "'boolean'", "'string'", "'unique'", "'symbol'", "'undefined'", 
			"'object'", "'of'", "'keyof'", "'type'", "'constructor'", "'namespace'", 
			"'require'", "'module'", "'declare'", "'abstract'", "'is'", "'StoreModule'", 
			"'EffectsModule'", "'createAction'", "'createReducer'", "'createSelector'", 
			"'RouterModule'", "'navigateByUrl'", "'forRoot'", "'forFeature'", "'select'", 
			"'dispatch'", "'navigate'", "'Store'", "'Injectable'", "'signal'", "'computed'", 
			"'effect'", "'WritableSignal'", "'ReadonlySignal'", "'BehaviorSubject'", 
			"'Observable'", "'Subject'", "'Router'", "'ActivatedRoute'", "'Route'", 
			"'Routes'", "'router-outlet'", "'routerLink'", "'routerLinkActive'", 
			"'state'", "'action'", "'reducer'", "'selector'", "'OnInit'", "'OnDestroy'", 
			"'OnChanges'", "'AfterViewInit'", "'ngOnInit'", "'ngOnDestroy'", "'ngOnChanges'", 
			"'ngAfterViewInit'", "'inject'", "'Injector'", "'InjectionToken'", "'@'", 
			null, null, null, null, null, null, null, null, null, "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "OpenBracket", "CloseBracket", 
			"OpenParen", "CloseParen", "OpenBrace", "CloseBrace", "SemiColon", "Comma", 
			"Assign", "QuestionMark", "QuestionMarkDot", "Colon", "Ellipsis", "Dot", 
			"PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", 
			"Divide", "Modulus", "Power", "NullCoalesce", "Hashtag", "LeftShiftArithmetic", 
			"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals_", 
			"NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", 
			"BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
			"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "NullishCoalescingAssign", "ARROW", "DOUBLE_L_CURLY", 
			"DOUBLE_R_CURLY", "NullLiteral", "BooleanLiteral", "DecimalLiteral", 
			"Break", "Do", "Instanceof", "Typeof", "Case", "Else", "New", "Var", 
			"Catch", "Finally", "Return", "Void", "Continue", "For", "Switch", "While", 
			"Debugger", "Function_", "This", "With", "Default", "If", "Throw", "Delete", 
			"In", "Try", "As", "From", "ReadOnly", "Async", "Await", "Yield", "YieldStar", 
			"Class", "Enum", "Extends", "Super", "Const", "Export", "Import", "Implements", 
			"Let", "Private", "Public", "Interface", "Package", "Protected", "Static", 
			"Any", "Number", "Never", "Boolean", "String", "Unique", "Symbol", "Undefined", 
			"Object", "Of", "KeyOf", "TypeAlias", "Constructor", "Namespace", "Require", 
			"Module", "Declare", "Abstract", "Is", "StoreModule", "EffectsModule", 
			"CreateAction", "CreateReducer", "CreateSelector", "RouterModule", "NavigateByUrl", 
			"ForRoot", "ForFeature", "Select", "Dispatch", "Navigate", "Store", "Injectable", 
			"Signal", "Computed", "Effect", "WritableSignal", "ReadonlySignal", "BehaviorSubject", 
			"Observable", "Subject", "Router", "ActivatedRoute", "Route", "Routes", 
			"RouterOutlet", "RouterLink", "RouterLinkActive", "State", "Action", 
			"Reducer", "Selector", "OnInit", "OnDestroy", "OnChanges", "AfterViewInit", 
			"NgOnInit", "NgOnDestroy", "NgOnChanges", "NgAfterViewInit", "Inject", 
			"Injector", "InjectionToken", "At", "Identifier", "AngularDirective", 
			"StringLiteral", "WhiteSpaces", "HtmlComment", "CDataComment", "UnexpectedCharacter", 
			"TagOpen", "TagClose", "TagSlashClose", "TagSlash", "TagName", "AttributeValue", 
			"Attribute", "TagEquals"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserFile(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ParserFile.EOF, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1073741825L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
				{
				setState(258);
				sourceElements();
				}
			}

			setState(261);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceElementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSourceElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSourceElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				statement();
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1073741825L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StateManagementStatementContext stateManagementStatement() {
			return getRuleContext(StateManagementStatementContext.class,0);
		}
		public NavigationStatementContext navigationStatement() {
			return getRuleContext(NavigationStatementContext.class,0);
		}
		public InjectionStatementContext injectionStatement() {
			return getRuleContext(InjectionStatementContext.class,0);
		}
		public RouteDefinitionStatementContext routeDefinitionStatement() {
			return getRuleContext(RouteDefinitionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				importStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				exportStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				emptyStatement_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(275);
				expressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(276);
				ifStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(277);
				iterationStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(278);
				continueStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(279);
				breakStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(280);
				returnStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(281);
				switchStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(282);
				throwStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(283);
				tryStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(284);
				stateManagementStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(285);
				navigationStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(286);
				injectionStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(287);
				routeDefinitionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ParserFile.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ParserFile.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(OpenBrace);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1073741825L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
				{
				setState(291);
				statementList();
				}
			}

			setState(294);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementContext extends ParserRuleContext {
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ParserFile.SemiColon, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public TerminalNode ReadOnly() { return getToken(ParserFile.ReadOnly, 0); }
		public TerminalNode Declare() { return getToken(ParserFile.Declare, 0); }
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableStatement);
		int _la;
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				bindingPattern();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(297);
					typeAnnotation();
					}
				}

				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(300);
					match(SemiColon);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 19L) != 0)) {
					{
					setState(303);
					accessibilityModifier();
					}
				}

				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 18253611009L) != 0)) {
					{
					setState(306);
					varModifier();
					}
				}

				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ReadOnly) {
					{
					setState(309);
					match(ReadOnly);
					}
				}

				setState(312);
				variableDeclarationList();
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(313);
					match(SemiColon);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(Declare);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 18253611009L) != 0)) {
					{
					setState(317);
					varModifier();
					}
				}

				setState(320);
				variableDeclarationList();
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(321);
					match(SemiColon);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(ParserFile.Import, 0); }
		public ImportFromBlockContext importFromBlock() {
			return getRuleContext(ImportFromBlockContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(Import);
			setState(327);
			importFromBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(ParserFile.Export, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportFromBlockContext exportFromBlock() {
			return getRuleContext(ExportFromBlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Default() { return getToken(ParserFile.Default, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exportStatement);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(Export);
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(330);
					match(Default);
					}
					break;
				}
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(333);
					exportFromBlock();
					}
					break;
				case 2:
					{
					setState(334);
					declaration();
					}
					break;
				}
				setState(337);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(Export);
				setState(340);
				match(Default);
				setState(341);
				singleExpression(0);
				setState(342);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(ParserFile.Class, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassHeritageContext classHeritage() {
			return getRuleContext(ClassHeritageContext.class,0);
		}
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public DecoratorListContext decoratorList() {
			return getRuleContext(DecoratorListContext.class,0);
		}
		public TerminalNode Export() { return getToken(ParserFile.Export, 0); }
		public TerminalNode Abstract() { return getToken(ParserFile.Abstract, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode Default() { return getToken(ParserFile.Default, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(346);
				decoratorList();
				}
			}

			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(349);
				match(Export);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Default) {
					{
					setState(350);
					match(Default);
					}
				}

				}
			}

			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(355);
				match(Abstract);
				}
			}

			setState(358);
			match(Class);
			setState(359);
			identifier();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(360);
				typeParameters();
				}
			}

			setState(363);
			classHeritage();
			setState(364);
			classTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassHeritageContext extends ParserRuleContext {
		public ClassExtendsClauseContext classExtendsClause() {
			return getRuleContext(ClassExtendsClauseContext.class,0);
		}
		public ImplementsClauseContext implementsClause() {
			return getRuleContext(ImplementsClauseContext.class,0);
		}
		public ClassHeritageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeritage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClassHeritage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClassHeritage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClassHeritage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeritageContext classHeritage() throws RecognitionException {
		ClassHeritageContext _localctx = new ClassHeritageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classHeritage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(366);
				classExtendsClause();
				}
			}

			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(369);
				implementsClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassTailContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ParserFile.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ParserFile.CloseBrace, 0); }
		public List<ClassElementContext> classElement() {
			return getRuleContexts(ClassElementContext.class);
		}
		public ClassElementContext classElement(int i) {
			return getRuleContext(ClassElementContext.class,i);
		}
		public ClassTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClassTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClassTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClassTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTailContext classTail() throws RecognitionException {
		ClassTailContext _localctx = new ClassTailContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(OpenBrace);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1073741825L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
				{
				{
				setState(373);
				classElement();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(ParserFile.Function_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ParserFile.SemiColon, 0); }
		public TerminalNode Async() { return getToken(ParserFile.Async, 0); }
		public TerminalNode Multiply() { return getToken(ParserFile.Multiply, 0); }
		public TerminalNode OpenBrace() { return getToken(ParserFile.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ParserFile.CloseBrace, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(381);
				match(Async);
				}
			}

			setState(384);
			match(Function_);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Multiply) {
				{
				setState(385);
				match(Multiply);
				}
			}

			setState(388);
			identifier();
			setState(389);
			callSignature();
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				{
				{
				setState(390);
				match(OpenBrace);
				setState(391);
				functionBody();
				setState(392);
				match(CloseBrace);
				}
				}
				break;
			case SemiColon:
				{
				setState(394);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateManagementStatementContext extends ParserRuleContext {
		public TerminalNode Signal() { return getToken(ParserFile.Signal, 0); }
		public TerminalNode LessThan() { return getToken(ParserFile.LessThan, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode MoreThan() { return getToken(ParserFile.MoreThan, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode WritableSignal() { return getToken(ParserFile.WritableSignal, 0); }
		public TerminalNode BehaviorSubject() { return getToken(ParserFile.BehaviorSubject, 0); }
		public TerminalNode Observable() { return getToken(ParserFile.Observable, 0); }
		public TerminalNode CreateAction() { return getToken(ParserFile.CreateAction, 0); }
		public TerminalNode StringLiteral() { return getToken(ParserFile.StringLiteral, 0); }
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode CreateReducer() { return getToken(ParserFile.CreateReducer, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CreateSelector() { return getToken(ParserFile.CreateSelector, 0); }
		public TerminalNode Store() { return getToken(ParserFile.Store, 0); }
		public TerminalNode Dot() { return getToken(ParserFile.Dot, 0); }
		public TerminalNode Select() { return getToken(ParserFile.Select, 0); }
		public TerminalNode Dispatch() { return getToken(ParserFile.Dispatch, 0); }
		public StateManagementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateManagementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStateManagementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStateManagementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStateManagementStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateManagementStatementContext stateManagementStatement() throws RecognitionException {
		StateManagementStatementContext _localctx = new StateManagementStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stateManagementStatement);
		int _la;
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(Signal);
				setState(398);
				match(LessThan);
				setState(399);
				type_();
				setState(400);
				match(MoreThan);
				setState(401);
				match(OpenParen);
				setState(402);
				singleExpression(0);
				setState(403);
				match(CloseParen);
				setState(404);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(WritableSignal);
				setState(407);
				match(LessThan);
				setState(408);
				type_();
				setState(409);
				match(MoreThan);
				setState(410);
				match(OpenParen);
				setState(411);
				singleExpression(0);
				setState(412);
				match(CloseParen);
				setState(413);
				eos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				match(BehaviorSubject);
				setState(416);
				match(LessThan);
				setState(417);
				type_();
				setState(418);
				match(MoreThan);
				setState(419);
				match(OpenParen);
				setState(420);
				singleExpression(0);
				setState(421);
				match(CloseParen);
				setState(422);
				eos();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				match(Observable);
				setState(425);
				match(LessThan);
				setState(426);
				type_();
				setState(427);
				match(MoreThan);
				setState(428);
				match(OpenParen);
				setState(429);
				singleExpression(0);
				setState(430);
				match(CloseParen);
				setState(431);
				eos();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				match(CreateAction);
				setState(434);
				match(OpenParen);
				setState(435);
				match(StringLiteral);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(436);
					match(Comma);
					setState(437);
					objectLiteral();
					}
				}

				setState(440);
				match(CloseParen);
				setState(441);
				eos();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(442);
				match(CreateReducer);
				setState(443);
				match(OpenParen);
				setState(444);
				identifier();
				setState(445);
				match(Comma);
				setState(446);
				singleExpression(0);
				setState(447);
				match(CloseParen);
				setState(448);
				eos();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(450);
				match(CreateSelector);
				setState(451);
				match(OpenParen);
				setState(452);
				singleExpression(0);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(453);
					match(Comma);
					setState(454);
					singleExpression(0);
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(460);
				match(CloseParen);
				setState(461);
				eos();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(463);
				match(Store);
				setState(464);
				match(Dot);
				setState(465);
				match(Select);
				setState(466);
				match(OpenParen);
				setState(467);
				singleExpression(0);
				setState(468);
				match(CloseParen);
				setState(469);
				eos();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(471);
				match(Store);
				setState(472);
				match(Dot);
				setState(473);
				match(Dispatch);
				setState(474);
				match(OpenParen);
				setState(475);
				singleExpression(0);
				setState(476);
				match(CloseParen);
				setState(477);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NavigationStatementContext extends ParserRuleContext {
		public TerminalNode Router() { return getToken(ParserFile.Router, 0); }
		public TerminalNode Dot() { return getToken(ParserFile.Dot, 0); }
		public TerminalNode Navigate() { return getToken(ParserFile.Navigate, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ParserFile.Comma, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode NavigateByUrl() { return getToken(ParserFile.NavigateByUrl, 0); }
		public TerminalNode StringLiteral() { return getToken(ParserFile.StringLiteral, 0); }
		public TerminalNode OpenBracket() { return getToken(ParserFile.OpenBracket, 0); }
		public TerminalNode RouterLink() { return getToken(ParserFile.RouterLink, 0); }
		public TerminalNode CloseBracket() { return getToken(ParserFile.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(ParserFile.Assign, 0); }
		public TerminalNode RouterLinkActive() { return getToken(ParserFile.RouterLinkActive, 0); }
		public NavigationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterNavigationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitNavigationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitNavigationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigationStatementContext navigationStatement() throws RecognitionException {
		NavigationStatementContext _localctx = new NavigationStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_navigationStatement);
		int _la;
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(Router);
				setState(482);
				match(Dot);
				setState(483);
				match(Navigate);
				setState(484);
				match(OpenParen);
				setState(485);
				arrayLiteral();
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(486);
					match(Comma);
					setState(487);
					objectLiteral();
					}
				}

				setState(490);
				match(CloseParen);
				setState(491);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(Router);
				setState(494);
				match(Dot);
				setState(495);
				match(NavigateByUrl);
				setState(496);
				match(OpenParen);
				setState(497);
				match(StringLiteral);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(498);
					match(Comma);
					setState(499);
					objectLiteral();
					}
				}

				setState(502);
				match(CloseParen);
				setState(503);
				eos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				match(OpenBracket);
				setState(505);
				match(RouterLink);
				setState(506);
				match(CloseBracket);
				setState(507);
				match(Assign);
				setState(508);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(509);
				match(RouterLinkActive);
				setState(510);
				match(Assign);
				setState(511);
				match(StringLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InjectionStatementContext extends ParserRuleContext {
		public TerminalNode Inject() { return getToken(ParserFile.Inject, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode At() { return getToken(ParserFile.At, 0); }
		public TerminalNode Injectable() { return getToken(ParserFile.Injectable, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ParserFile.Assign, 0); }
		public InjectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInjectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInjectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInjectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectionStatementContext injectionStatement() throws RecognitionException {
		InjectionStatementContext _localctx = new InjectionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_injectionStatement);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(Inject);
				setState(515);
				match(OpenParen);
				setState(516);
				identifier();
				setState(517);
				match(CloseParen);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(518);
					typeAnnotation();
					}
				}

				setState(521);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(At);
				setState(524);
				match(Injectable);
				setState(525);
				match(OpenParen);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBrace) {
					{
					setState(526);
					objectLiteral();
					}
				}

				setState(529);
				match(CloseParen);
				setState(530);
				eos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				identifier();
				setState(532);
				match(Assign);
				setState(533);
				match(Inject);
				setState(534);
				match(OpenParen);
				setState(535);
				identifier();
				setState(536);
				match(CloseParen);
				setState(537);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RouteDefinitionStatementContext extends ParserRuleContext {
		public TerminalNode Routes() { return getToken(ParserFile.Routes, 0); }
		public TerminalNode Assign() { return getToken(ParserFile.Assign, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Route() { return getToken(ParserFile.Route, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode RouterModule() { return getToken(ParserFile.RouterModule, 0); }
		public TerminalNode Dot() { return getToken(ParserFile.Dot, 0); }
		public TerminalNode ForRoot() { return getToken(ParserFile.ForRoot, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public TerminalNode Comma() { return getToken(ParserFile.Comma, 0); }
		public TerminalNode ForFeature() { return getToken(ParserFile.ForFeature, 0); }
		public RouteDefinitionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeDefinitionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterRouteDefinitionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitRouteDefinitionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitRouteDefinitionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteDefinitionStatementContext routeDefinitionStatement() throws RecognitionException {
		RouteDefinitionStatementContext _localctx = new RouteDefinitionStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_routeDefinitionStatement);
		int _la;
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(Routes);
				setState(542);
				match(Assign);
				setState(543);
				arrayLiteral();
				setState(544);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				match(Route);
				setState(547);
				match(Assign);
				setState(548);
				objectLiteral();
				setState(549);
				eos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				match(RouterModule);
				setState(552);
				match(Dot);
				setState(553);
				match(ForRoot);
				setState(554);
				match(OpenParen);
				setState(555);
				arrayLiteral();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(556);
					match(Comma);
					setState(557);
					objectLiteral();
					}
				}

				setState(560);
				match(CloseParen);
				setState(561);
				eos();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(563);
				match(RouterModule);
				setState(564);
				match(Dot);
				setState(565);
				match(ForFeature);
				setState(566);
				match(OpenParen);
				setState(567);
				arrayLiteral();
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(568);
					match(Comma);
					setState(569);
					objectLiteral();
					}
				}

				setState(572);
				match(CloseParen);
				setState(573);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(ParserFile.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ParserFile.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_reservedWord);
		try {
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Number:
			case Boolean:
			case String:
			case TypeAlias:
			case Require:
			case Module:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				keyword();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				match(BooleanLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ParserFile.Break, 0); }
		public TerminalNode Do() { return getToken(ParserFile.Do, 0); }
		public TerminalNode Instanceof() { return getToken(ParserFile.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(ParserFile.Typeof, 0); }
		public TerminalNode Case() { return getToken(ParserFile.Case, 0); }
		public TerminalNode Else() { return getToken(ParserFile.Else, 0); }
		public TerminalNode New() { return getToken(ParserFile.New, 0); }
		public TerminalNode Var() { return getToken(ParserFile.Var, 0); }
		public TerminalNode Catch() { return getToken(ParserFile.Catch, 0); }
		public TerminalNode Finally() { return getToken(ParserFile.Finally, 0); }
		public TerminalNode Return() { return getToken(ParserFile.Return, 0); }
		public TerminalNode Void() { return getToken(ParserFile.Void, 0); }
		public TerminalNode Continue() { return getToken(ParserFile.Continue, 0); }
		public TerminalNode For() { return getToken(ParserFile.For, 0); }
		public TerminalNode Switch() { return getToken(ParserFile.Switch, 0); }
		public TerminalNode While() { return getToken(ParserFile.While, 0); }
		public TerminalNode Debugger() { return getToken(ParserFile.Debugger, 0); }
		public TerminalNode Function_() { return getToken(ParserFile.Function_, 0); }
		public TerminalNode This() { return getToken(ParserFile.This, 0); }
		public TerminalNode With() { return getToken(ParserFile.With, 0); }
		public TerminalNode Default() { return getToken(ParserFile.Default, 0); }
		public TerminalNode If() { return getToken(ParserFile.If, 0); }
		public TerminalNode Throw() { return getToken(ParserFile.Throw, 0); }
		public TerminalNode Delete() { return getToken(ParserFile.Delete, 0); }
		public TerminalNode In() { return getToken(ParserFile.In, 0); }
		public TerminalNode Try() { return getToken(ParserFile.Try, 0); }
		public TerminalNode Class() { return getToken(ParserFile.Class, 0); }
		public TerminalNode Enum() { return getToken(ParserFile.Enum, 0); }
		public TerminalNode Extends() { return getToken(ParserFile.Extends, 0); }
		public TerminalNode Super() { return getToken(ParserFile.Super, 0); }
		public TerminalNode Const() { return getToken(ParserFile.Const, 0); }
		public TerminalNode Export() { return getToken(ParserFile.Export, 0); }
		public TerminalNode Import() { return getToken(ParserFile.Import, 0); }
		public TerminalNode Implements() { return getToken(ParserFile.Implements, 0); }
		public TerminalNode Let() { return getToken(ParserFile.Let, 0); }
		public TerminalNode Private() { return getToken(ParserFile.Private, 0); }
		public TerminalNode Public() { return getToken(ParserFile.Public, 0); }
		public TerminalNode Interface() { return getToken(ParserFile.Interface, 0); }
		public TerminalNode Package() { return getToken(ParserFile.Package, 0); }
		public TerminalNode Protected() { return getToken(ParserFile.Protected, 0); }
		public TerminalNode Static() { return getToken(ParserFile.Static, 0); }
		public TerminalNode Yield() { return getToken(ParserFile.Yield, 0); }
		public TerminalNode Async() { return getToken(ParserFile.Async, 0); }
		public TerminalNode Await() { return getToken(ParserFile.Await, 0); }
		public TerminalNode ReadOnly() { return getToken(ParserFile.ReadOnly, 0); }
		public TerminalNode From() { return getToken(ParserFile.From, 0); }
		public TerminalNode As() { return getToken(ParserFile.As, 0); }
		public TerminalNode Require() { return getToken(ParserFile.Require, 0); }
		public TerminalNode TypeAlias() { return getToken(ParserFile.TypeAlias, 0); }
		public TerminalNode String() { return getToken(ParserFile.String, 0); }
		public TerminalNode Boolean() { return getToken(ParserFile.Boolean, 0); }
		public TerminalNode Number() { return getToken(ParserFile.Number, 0); }
		public TerminalNode Module() { return getToken(ParserFile.Module, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & -4027625446047744001L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(584);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(587); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractDeclarationContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(ParserFile.Abstract, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public AbstractDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAbstractDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAbstractDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAbstractDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclarationContext abstractDeclaration() throws RecognitionException {
		AbstractDeclarationContext _localctx = new AbstractDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_abstractDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(Abstract);
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(590);
				identifier();
				setState(591);
				callSignature();
				}
				break;
			case 2:
				{
				setState(593);
				variableStatement();
				}
				break;
			}
			setState(596);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromBlockContext extends ParserRuleContext {
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ImportModuleItemsContext importModuleItems() {
			return getRuleContext(ImportModuleItemsContext.class,0);
		}
		public ImportDefaultContext importDefault() {
			return getRuleContext(ImportDefaultContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ParserFile.StringLiteral, 0); }
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_importFromBlock);
		try {
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
			case Multiply:
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case StoreModule:
			case EffectsModule:
			case CreateAction:
			case CreateReducer:
			case CreateSelector:
			case RouterModule:
			case NavigateByUrl:
			case ForRoot:
			case ForFeature:
			case Select:
			case Dispatch:
			case Navigate:
			case Store:
			case Injectable:
			case Signal:
			case Computed:
			case Effect:
			case WritableSignal:
			case ReadonlySignal:
			case BehaviorSubject:
			case Observable:
			case Subject:
			case Router:
			case ActivatedRoute:
			case Route:
			case Routes:
			case RouterOutlet:
			case RouterLink:
			case RouterLinkActive:
			case State:
			case Action:
			case Reducer:
			case Selector:
			case OnInit:
			case OnDestroy:
			case OnChanges:
			case AfterViewInit:
			case NgOnInit:
			case NgOnDestroy:
			case NgOnChanges:
			case NgAfterViewInit:
			case Inject:
			case Injector:
			case InjectionToken:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(598);
					importDefault();
					}
					break;
				}
				setState(603);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
				case NullLiteral:
				case BooleanLiteral:
				case Break:
				case Do:
				case Instanceof:
				case Typeof:
				case Case:
				case Else:
				case New:
				case Var:
				case Catch:
				case Finally:
				case Return:
				case Void:
				case Continue:
				case For:
				case Switch:
				case While:
				case Debugger:
				case Function_:
				case This:
				case With:
				case Default:
				case If:
				case Throw:
				case Delete:
				case In:
				case Try:
				case As:
				case From:
				case ReadOnly:
				case Async:
				case Await:
				case Yield:
				case Class:
				case Enum:
				case Extends:
				case Super:
				case Const:
				case Export:
				case Import:
				case Implements:
				case Let:
				case Private:
				case Public:
				case Interface:
				case Package:
				case Protected:
				case Static:
				case Any:
				case Number:
				case Never:
				case Boolean:
				case String:
				case Unique:
				case Symbol:
				case Undefined:
				case Object:
				case Of:
				case KeyOf:
				case TypeAlias:
				case Constructor:
				case Namespace:
				case Require:
				case Module:
				case Abstract:
				case StoreModule:
				case EffectsModule:
				case CreateAction:
				case CreateReducer:
				case CreateSelector:
				case RouterModule:
				case NavigateByUrl:
				case ForRoot:
				case ForFeature:
				case Select:
				case Dispatch:
				case Navigate:
				case Store:
				case Injectable:
				case Signal:
				case Computed:
				case Effect:
				case WritableSignal:
				case ReadonlySignal:
				case BehaviorSubject:
				case Observable:
				case Subject:
				case Router:
				case ActivatedRoute:
				case Route:
				case Routes:
				case RouterOutlet:
				case RouterLink:
				case RouterLinkActive:
				case State:
				case Action:
				case Reducer:
				case Selector:
				case OnInit:
				case OnDestroy:
				case OnChanges:
				case AfterViewInit:
				case NgOnInit:
				case NgOnDestroy:
				case NgOnChanges:
				case NgAfterViewInit:
				case Inject:
				case Injector:
				case InjectionToken:
				case Identifier:
					{
					setState(601);
					importNamespace();
					}
					break;
				case OpenBrace:
					{
					setState(602);
					importModuleItems();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(605);
				importFrom();
				setState(606);
				eos();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(StringLiteral);
				setState(609);
				eos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ParserFile.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ParserFile.CloseBrace, 0); }
		public List<ImportAliasNameContext> importAliasName() {
			return getRuleContexts(ImportAliasNameContext.class);
		}
		public ImportAliasNameContext importAliasName(int i) {
			return getRuleContext(ImportAliasNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public ImportModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importModuleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImportModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImportModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImportModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportModuleItemsContext importModuleItems() throws RecognitionException {
		ImportModuleItemsContext _localctx = new ImportModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_importModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(OpenBrace);
			setState(618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(613);
					importAliasName();
					setState(614);
					match(Comma);
					}
					} 
				}
				setState(620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & -34359738373L) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & 12384898975268823L) != 0)) {
				{
				setState(621);
				importAliasName();
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(622);
					match(Comma);
					}
				}

				}
			}

			setState(627);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportAliasNameContext extends ParserRuleContext {
		public ModuleExportNameContext moduleExportName() {
			return getRuleContext(ModuleExportNameContext.class,0);
		}
		public TerminalNode As() { return getToken(ParserFile.As, 0); }
		public ImportedBindingContext importedBinding() {
			return getRuleContext(ImportedBindingContext.class,0);
		}
		public ImportAliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImportAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImportAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImportAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportAliasNameContext importAliasName() throws RecognitionException {
		ImportAliasNameContext _localctx = new ImportAliasNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_importAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			moduleExportName();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(630);
				match(As);
				setState(631);
				importedBinding();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleExportNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ParserFile.StringLiteral, 0); }
		public ModuleExportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleExportName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterModuleExportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitModuleExportName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitModuleExportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleExportNameContext moduleExportName() throws RecognitionException {
		ModuleExportNameContext _localctx = new ModuleExportNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_moduleExportName);
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case StoreModule:
			case EffectsModule:
			case CreateAction:
			case CreateReducer:
			case CreateSelector:
			case RouterModule:
			case NavigateByUrl:
			case ForRoot:
			case ForFeature:
			case Select:
			case Dispatch:
			case Navigate:
			case Store:
			case Injectable:
			case Signal:
			case Computed:
			case Effect:
			case WritableSignal:
			case ReadonlySignal:
			case BehaviorSubject:
			case Observable:
			case Subject:
			case Router:
			case ActivatedRoute:
			case Route:
			case Routes:
			case RouterOutlet:
			case RouterLink:
			case RouterLinkActive:
			case State:
			case Action:
			case Reducer:
			case Selector:
			case OnInit:
			case OnDestroy:
			case OnChanges:
			case AfterViewInit:
			case NgOnInit:
			case NgOnDestroy:
			case NgOnChanges:
			case NgAfterViewInit:
			case Inject:
			case Injector:
			case InjectionToken:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportedBindingContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ParserFile.Identifier, 0); }
		public TerminalNode Yield() { return getToken(ParserFile.Yield, 0); }
		public TerminalNode Await() { return getToken(ParserFile.Await, 0); }
		public ImportedBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importedBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImportedBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImportedBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImportedBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportedBindingContext importedBinding() throws RecognitionException {
		ImportedBindingContext _localctx = new ImportedBindingContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_importedBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !(_la==Await || _la==Yield || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefaultContext extends ParserRuleContext {
		public AliasNameContext aliasName() {
			return getRuleContext(AliasNameContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ParserFile.Comma, 0); }
		public ImportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImportDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImportDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImportDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefaultContext importDefault() throws RecognitionException {
		ImportDefaultContext _localctx = new ImportDefaultContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_importDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			aliasName();
			setState(641);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNamespaceContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(ParserFile.Multiply, 0); }
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public TerminalNode As() { return getToken(ParserFile.As, 0); }
		public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImportNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImportNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImportNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamespaceContext importNamespace() throws RecognitionException {
		ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_importNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
				{
				setState(643);
				match(Multiply);
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case StoreModule:
			case EffectsModule:
			case CreateAction:
			case CreateReducer:
			case CreateSelector:
			case RouterModule:
			case NavigateByUrl:
			case ForRoot:
			case ForFeature:
			case Select:
			case Dispatch:
			case Navigate:
			case Store:
			case Injectable:
			case Signal:
			case Computed:
			case Effect:
			case WritableSignal:
			case ReadonlySignal:
			case BehaviorSubject:
			case Observable:
			case Subject:
			case Router:
			case ActivatedRoute:
			case Route:
			case Routes:
			case RouterOutlet:
			case RouterLink:
			case RouterLinkActive:
			case State:
			case Action:
			case Reducer:
			case Selector:
			case OnInit:
			case OnDestroy:
			case OnChanges:
			case AfterViewInit:
			case NgOnInit:
			case NgOnDestroy:
			case NgOnChanges:
			case NgAfterViewInit:
			case Inject:
			case Injector:
			case InjectionToken:
			case Identifier:
				{
				setState(644);
				identifierName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(647);
				match(As);
				setState(648);
				identifierName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromContext extends ParserRuleContext {
		public TerminalNode From() { return getToken(ParserFile.From, 0); }
		public TerminalNode StringLiteral() { return getToken(ParserFile.StringLiteral, 0); }
		public ImportFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImportFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImportFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImportFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromContext importFrom() throws RecognitionException {
		ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_importFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(From);
			setState(652);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasNameContext extends ParserRuleContext {
		public List<IdentifierNameContext> identifierName() {
			return getRuleContexts(IdentifierNameContext.class);
		}
		public IdentifierNameContext identifierName(int i) {
			return getRuleContext(IdentifierNameContext.class,i);
		}
		public TerminalNode As() { return getToken(ParserFile.As, 0); }
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			identifierName();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(655);
				match(As);
				setState(656);
				identifierName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportFromBlockContext extends ParserRuleContext {
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportModuleItemsContext exportModuleItems() {
			return getRuleContext(ExportModuleItemsContext.class,0);
		}
		public ExportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportFromBlockContext exportFromBlock() throws RecognitionException {
		ExportFromBlockContext _localctx = new ExportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exportFromBlock);
		int _la;
		try {
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case StoreModule:
			case EffectsModule:
			case CreateAction:
			case CreateReducer:
			case CreateSelector:
			case RouterModule:
			case NavigateByUrl:
			case ForRoot:
			case ForFeature:
			case Select:
			case Dispatch:
			case Navigate:
			case Store:
			case Injectable:
			case Signal:
			case Computed:
			case Effect:
			case WritableSignal:
			case ReadonlySignal:
			case BehaviorSubject:
			case Observable:
			case Subject:
			case Router:
			case ActivatedRoute:
			case Route:
			case Routes:
			case RouterOutlet:
			case RouterLink:
			case RouterLinkActive:
			case State:
			case Action:
			case Reducer:
			case Selector:
			case OnInit:
			case OnDestroy:
			case OnChanges:
			case AfterViewInit:
			case NgOnInit:
			case NgOnDestroy:
			case NgOnChanges:
			case NgAfterViewInit:
			case Inject:
			case Injector:
			case InjectionToken:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				importNamespace();
				setState(660);
				importFrom();
				setState(661);
				eos();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				exportModuleItems();
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==From) {
					{
					setState(664);
					importFrom();
					}
				}

				setState(667);
				eos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ParserFile.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ParserFile.CloseBrace, 0); }
		public List<ExportAliasNameContext> exportAliasName() {
			return getRuleContexts(ExportAliasNameContext.class);
		}
		public ExportAliasNameContext exportAliasName(int i) {
			return getRuleContext(ExportAliasNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public ExportModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportModuleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExportModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExportModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExportModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportModuleItemsContext exportModuleItems() throws RecognitionException {
		ExportModuleItemsContext _localctx = new ExportModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exportModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(OpenBrace);
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(672);
					exportAliasName();
					setState(673);
					match(Comma);
					}
					} 
				}
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & -34359738373L) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & 12384898975268823L) != 0)) {
				{
				setState(680);
				exportAliasName();
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(681);
					match(Comma);
					}
				}

				}
			}

			setState(686);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportAliasNameContext extends ParserRuleContext {
		public List<ModuleExportNameContext> moduleExportName() {
			return getRuleContexts(ModuleExportNameContext.class);
		}
		public ModuleExportNameContext moduleExportName(int i) {
			return getRuleContext(ModuleExportNameContext.class,i);
		}
		public TerminalNode As() { return getToken(ParserFile.As, 0); }
		public ExportAliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportAliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExportAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExportAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExportAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportAliasNameContext exportAliasName() throws RecognitionException {
		ExportAliasNameContext _localctx = new ExportAliasNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exportAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			moduleExportName();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(689);
				match(As);
				setState(690);
				moduleExportName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declaration);
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				variableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(698);
				match(OpenParen);
				}
			}

			setState(701);
			variableDeclaration();
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseParen) {
				{
				setState(702);
				match(CloseParen);
				}
			}

			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(705);
				match(Comma);
				setState(706);
				variableDeclaration();
				}
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierOrKeyWordContext identifierOrKeyWord() {
			return getRuleContext(IdentifierOrKeyWordContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Assign() { return getToken(ParserFile.Assign, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case As:
			case From:
			case Async:
			case Yield:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Abstract:
			case StoreModule:
			case EffectsModule:
			case CreateAction:
			case CreateReducer:
			case CreateSelector:
			case RouterModule:
			case NavigateByUrl:
			case ForRoot:
			case ForFeature:
			case Select:
			case Dispatch:
			case Navigate:
			case Store:
			case Injectable:
			case Signal:
			case Computed:
			case Effect:
			case WritableSignal:
			case ReadonlySignal:
			case BehaviorSubject:
			case Observable:
			case Subject:
			case Router:
			case ActivatedRoute:
			case Route:
			case Routes:
			case RouterOutlet:
			case RouterLink:
			case RouterLinkActive:
			case State:
			case Action:
			case Reducer:
			case Selector:
			case OnInit:
			case OnDestroy:
			case OnChanges:
			case AfterViewInit:
			case NgOnInit:
			case NgOnDestroy:
			case NgOnChanges:
			case NgAfterViewInit:
			case Inject:
			case Injector:
			case InjectionToken:
			case Identifier:
				{
				setState(712);
				identifierOrKeyWord();
				}
				break;
			case OpenBracket:
				{
				setState(713);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				{
				setState(714);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(717);
				typeAnnotation();
				}
			}

			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(720);
				singleExpression(0);
				}
				break;
			}
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(723);
				match(Assign);
				setState(725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(724);
					typeParameters();
					}
					break;
				}
				setState(727);
				singleExpression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ParserFile.SemiColon, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterEmptyStatement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitEmptyStatement_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitEmptyStatement_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ParserFile.SemiColon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			expressionSequence();
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(733);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ParserFile.If, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(ParserFile.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(If);
			setState(737);
			match(OpenParen);
			setState(738);
			expressionSequence();
			setState(739);
			match(CloseParen);
			setState(740);
			statement();
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(741);
				match(Else);
				setState(742);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForVarOfStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ParserFile.For, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Await() { return getToken(ParserFile.Await, 0); }
		public TerminalNode As() { return getToken(ParserFile.As, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ForVarOfStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterForVarOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitForVarOfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitForVarOfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(ParserFile.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(ParserFile.While, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForVarStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ParserFile.For, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(ParserFile.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ParserFile.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForVarStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterForVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitForVarStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitForVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForVarInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ParserFile.For, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode In() { return getToken(ParserFile.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForVarInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterForVarInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitForVarInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitForVarInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(ParserFile.While, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ParserFile.For, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(ParserFile.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ParserFile.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ParserFile.For, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode In() { return getToken(ParserFile.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForOfStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ParserFile.For, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Await() { return getToken(ParserFile.Await, 0); }
		public TerminalNode As() { return getToken(ParserFile.As, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ForOfStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterForOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitForOfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitForOfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_iterationStatement);
		int _la;
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				match(Do);
				setState(746);
				statement();
				setState(747);
				match(While);
				setState(748);
				match(OpenParen);
				setState(749);
				expressionSequence();
				setState(750);
				match(CloseParen);
				setState(751);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				match(While);
				setState(754);
				match(OpenParen);
				setState(755);
				expressionSequence();
				setState(756);
				match(CloseParen);
				setState(757);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(759);
				match(For);
				setState(760);
				match(OpenParen);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
					{
					setState(761);
					expressionSequence();
					}
				}

				setState(764);
				match(SemiColon);
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
					{
					setState(765);
					expressionSequence();
					}
				}

				setState(768);
				match(SemiColon);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
					{
					setState(769);
					expressionSequence();
					}
				}

				setState(772);
				match(CloseParen);
				setState(773);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(774);
				match(For);
				setState(775);
				match(OpenParen);
				setState(776);
				varModifier();
				setState(777);
				variableDeclarationList();
				setState(778);
				match(SemiColon);
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
					{
					setState(779);
					expressionSequence();
					}
				}

				setState(782);
				match(SemiColon);
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
					{
					setState(783);
					expressionSequence();
					}
				}

				setState(786);
				match(CloseParen);
				setState(787);
				statement();
				}
				break;
			case 5:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(789);
				match(For);
				setState(790);
				match(OpenParen);
				setState(791);
				singleExpression(0);
				setState(792);
				match(In);
				setState(793);
				expressionSequence();
				setState(794);
				match(CloseParen);
				setState(795);
				statement();
				}
				break;
			case 6:
				_localctx = new ForVarInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(797);
				match(For);
				setState(798);
				match(OpenParen);
				setState(799);
				varModifier();
				setState(800);
				variableDeclaration();
				setState(801);
				match(In);
				setState(802);
				expressionSequence();
				setState(803);
				match(CloseParen);
				setState(804);
				statement();
				}
				break;
			case 7:
				_localctx = new ForOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(806);
				match(For);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Await) {
					{
					setState(807);
					match(Await);
					}
				}

				setState(810);
				match(OpenParen);
				setState(811);
				singleExpression(0);
				setState(812);
				identifier();
				setState(813);
				expressionSequence();
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==As) {
					{
					setState(814);
					match(As);
					setState(815);
					type_();
					}
				}

				setState(818);
				match(CloseParen);
				setState(819);
				statement();
				}
				break;
			case 8:
				_localctx = new ForVarOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(821);
				match(For);
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Await) {
					{
					setState(822);
					match(Await);
					}
				}

				setState(825);
				match(OpenParen);
				setState(826);
				varModifier();
				setState(827);
				variableDeclaration();
				setState(828);
				identifier();
				setState(829);
				expressionSequence();
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==As) {
					{
					setState(830);
					match(As);
					setState(831);
					type_();
					}
				}

				setState(834);
				match(CloseParen);
				setState(835);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ParserFile.Var, 0); }
		public TerminalNode Let() { return getToken(ParserFile.Let, 0); }
		public TerminalNode Const() { return getToken(ParserFile.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterVarModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitVarModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitVarModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 18253611009L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(ParserFile.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(Continue);
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & -1580552159189L) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 6291455L) != 0)) {
				{
				setState(842);
				identifier();
				}
			}

			setState(845);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ParserFile.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(Break);
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & -1580552159189L) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 6291455L) != 0)) {
				{
				setState(848);
				identifier();
				}
			}

			setState(851);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ParserFile.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_returnStatement);
		int _la;
		try {
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				match(Return);
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
					{
					setState(854);
					expressionSequence();
					}
				}

				setState(857);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				match(Return);
				setState(859);
				match(OpenParen);
				setState(860);
				htmlElements();
				setState(861);
				match(CloseParen);
				setState(862);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(ParserFile.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(Switch);
			setState(867);
			match(OpenParen);
			setState(868);
			expressionSequence();
			setState(869);
			match(CloseParen);
			setState(870);
			caseBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ParserFile.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ParserFile.CloseBrace, 0); }
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(OpenBrace);
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(873);
				caseClauses();
				}
			}

			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(876);
				defaultClause();
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(877);
					caseClauses();
					}
				}

				}
			}

			setState(882);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCaseClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCaseClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(884);
				caseClause();
				}
				}
				setState(887); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(ParserFile.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ParserFile.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(Case);
			setState(890);
			expressionSequence();
			setState(891);
			match(Colon);
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(892);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(ParserFile.Default, 0); }
		public TerminalNode Colon() { return getToken(ParserFile.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDefaultClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDefaultClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(Default);
			setState(896);
			match(Colon);
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(897);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(ParserFile.Throw, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(Throw);
			setState(901);
			expressionSequence();
			setState(902);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(ParserFile.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(Try);
			setState(905);
			block();
			setState(911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Catch:
				{
				setState(906);
				catchProduction();
				setState(908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(907);
					finallyProduction();
					}
					break;
				}
				}
				break;
			case Finally:
				{
				setState(910);
				finallyProduction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(ParserFile.Catch, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCatchProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCatchProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCatchProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_catchProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(Catch);
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(914);
				match(OpenParen);
				setState(915);
				identifier();
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(916);
					typeAnnotation();
					}
				}

				setState(919);
				match(CloseParen);
				}
			}

			setState(923);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(ParserFile.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFinallyProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFinallyProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFinallyProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(Finally);
			setState(926);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassExtendsClauseContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(ParserFile.Extends, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public ClassExtendsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExtendsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClassExtendsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClassExtendsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClassExtendsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExtendsClauseContext classExtendsClause() throws RecognitionException {
		ClassExtendsClauseContext _localctx = new ClassExtendsClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classExtendsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(Extends);
			setState(929);
			typeReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImplementsClauseContext extends ParserRuleContext {
		public TerminalNode Implements() { return getToken(ParserFile.Implements, 0); }
		public ClassOrInterfaceTypeListContext classOrInterfaceTypeList() {
			return getRuleContext(ClassOrInterfaceTypeListContext.class,0);
		}
		public ImplementsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImplementsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImplementsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImplementsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsClauseContext implementsClause() throws RecognitionException {
		ImplementsClauseContext _localctx = new ImplementsClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_implementsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(Implements);
			setState(932);
			classOrInterfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassElementContext extends ParserRuleContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public PropertyMemberDeclarationContext propertyMemberDeclaration() {
			return getRuleContext(PropertyMemberDeclarationContext.class,0);
		}
		public DecoratorListContext decoratorList() {
			return getRuleContext(DecoratorListContext.class,0);
		}
		public IndexMemberDeclarationContext indexMemberDeclaration() {
			return getRuleContext(IndexMemberDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ClassElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClassElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClassElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClassElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_classElement);
		int _la;
		try {
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(935);
					decoratorList();
					}
				}

				setState(938);
				propertyMemberDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(939);
				indexMemberDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(940);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyMemberDeclarationContext extends ParserRuleContext {
		public PropertyMemberBaseContext propertyMemberBase() {
			return getRuleContext(PropertyMemberBaseContext.class,0);
		}
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ParserFile.SemiColon, 0); }
		public TerminalNode QuestionMark() { return getToken(ParserFile.QuestionMark, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(ParserFile.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ParserFile.CloseBrace, 0); }
		public AbstractDeclarationContext abstractDeclaration() {
			return getRuleContext(AbstractDeclarationContext.class,0);
		}
		public PropertyMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPropertyMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPropertyMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPropertyMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyMemberDeclarationContext propertyMemberDeclaration() throws RecognitionException {
		PropertyMemberDeclarationContext _localctx = new PropertyMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_propertyMemberDeclaration);
		int _la;
		try {
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				propertyMemberBase();
				setState(944);
				propertyName();
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(945);
					match(QuestionMark);
					}
				}

				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(948);
					typeAnnotation();
					}
				}

				setState(951);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(953);
				propertyMemberBase();
				setState(954);
				propertyName();
				setState(955);
				callSignature();
				setState(961);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBrace:
					{
					{
					setState(956);
					match(OpenBrace);
					setState(957);
					functionBody();
					setState(958);
					match(CloseBrace);
					}
					}
					break;
				case SemiColon:
					{
					setState(960);
					match(SemiColon);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(963);
				abstractDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyMemberBaseContext extends ParserRuleContext {
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TerminalNode Async() { return getToken(ParserFile.Async, 0); }
		public TerminalNode Static() { return getToken(ParserFile.Static, 0); }
		public TerminalNode ReadOnly() { return getToken(ParserFile.ReadOnly, 0); }
		public PropertyMemberBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyMemberBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPropertyMemberBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPropertyMemberBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPropertyMemberBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyMemberBaseContext propertyMemberBase() throws RecognitionException {
		PropertyMemberBaseContext _localctx = new PropertyMemberBaseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_propertyMemberBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(966);
				accessibilityModifier();
				}
				break;
			}
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(969);
				match(Async);
				}
				break;
			}
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(972);
				match(Static);
				}
				break;
			}
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(975);
				match(ReadOnly);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexMemberDeclarationContext extends ParserRuleContext {
		public IndexSignatureContext indexSignature() {
			return getRuleContext(IndexSignatureContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ParserFile.SemiColon, 0); }
		public IndexMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIndexMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIndexMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIndexMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexMemberDeclarationContext indexMemberDeclaration() throws RecognitionException {
		IndexMemberDeclarationContext _localctx = new IndexMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_indexMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			indexSignature();
			setState(979);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IteratorBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ParserFile.OpenBrace, 0); }
		public List<IteratorDefinitionContext> iteratorDefinition() {
			return getRuleContexts(IteratorDefinitionContext.class);
		}
		public IteratorDefinitionContext iteratorDefinition(int i) {
			return getRuleContext(IteratorDefinitionContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(ParserFile.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public IteratorBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIteratorBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIteratorBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIteratorBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratorBlockContext iteratorBlock() throws RecognitionException {
		IteratorBlockContext _localctx = new IteratorBlockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_iteratorBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(OpenBrace);
			setState(982);
			iteratorDefinition();
			setState(987);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(983);
					match(Comma);
					setState(984);
					iteratorDefinition();
					}
					} 
				}
				setState(989);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(990);
				match(Comma);
				}
			}

			setState(993);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IteratorDefinitionContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(ParserFile.OpenBracket, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ParserFile.CloseBracket, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ParserFile.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ParserFile.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public IteratorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIteratorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIteratorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIteratorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratorDefinitionContext iteratorDefinition() throws RecognitionException {
		IteratorDefinitionContext _localctx = new IteratorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_iteratorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(OpenBracket);
			setState(996);
			singleExpression(0);
			setState(997);
			match(CloseBracket);
			setState(998);
			match(OpenParen);
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611686018427355000L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 70368744177663L) != 0)) {
				{
				setState(999);
				formalParameterList();
				}
			}

			setState(1002);
			match(CloseParen);
			setState(1003);
			match(OpenBrace);
			setState(1004);
			functionBody();
			setState(1005);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public LastFormalParameterArgContext lastFormalParameterArg() {
			return getRuleContext(LastFormalParameterArgContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ParserFile.Colon, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				formalParameterArg();
				setState(1012);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1008);
						match(Comma);
						setState(1009);
						formalParameterArg();
						}
						} 
					}
					setState(1014);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(1017);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1015);
					match(Comma);
					setState(1016);
					lastFormalParameterArg();
					}
					break;
				}
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1019);
					match(Comma);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				lastFormalParameterArg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1023);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1024);
				objectLiteral();
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1025);
					match(Colon);
					setState(1026);
					formalParameterList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterArgContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(ParserFile.QuestionMark, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ParserFile.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFormalParameterArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1031);
				decorator();
				}
			}

			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1034);
				accessibilityModifier();
				}
				break;
			}
			setState(1037);
			assignable();
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(1038);
				match(QuestionMark);
				}
			}

			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1041);
				typeAnnotation();
				}
			}

			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1044);
				match(Assign);
				setState(1045);
				singleExpression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LastFormalParameterArgContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(ParserFile.Ellipsis, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterLastFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitLastFormalParameterArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitLastFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
		LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_lastFormalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(Ellipsis);
			setState(1049);
			identifier();
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1050);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1073741825L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
				{
				setState(1053);
				sourceElements();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementListContext extends ParserRuleContext {
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1056);
					match(Comma);
					}
					} 
				}
				setState(1061);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221391192L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
				{
				setState(1062);
				arrayElement();
				}
			}

			setState(1073);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1066); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1065);
						match(Comma);
						}
						}
						setState(1068); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(1070);
					arrayElement();
					}
					} 
				}
				setState(1075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1076);
				match(Comma);
				}
				}
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(ParserFile.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(ParserFile.Comma, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_arrayElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1082);
				match(Ellipsis);
				}
			}

			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1085);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(1086);
				identifier();
				}
				break;
			}
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1089);
				match(Comma);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(ParserFile.Colon, 0); }
		public TerminalNode Assign() { return getToken(ParserFile.Assign, 0); }
		public TerminalNode OpenBracket() { return getToken(ParserFile.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(ParserFile.CloseBracket, 0); }
		public IdentifierOrKeyWordContext identifierOrKeyWord() {
			return getRuleContext(IdentifierOrKeyWordContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(ParserFile.Ellipsis, 0); }
		public RestParameterContext restParameter() {
			return getRuleContext(RestParameterContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_propertyAssignment);
		int _la;
		try {
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				propertyName();
				setState(1093);
				_la = _input.LA(1);
				if ( !(_la==Assign || _la==Colon) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1094);
				singleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1096);
				match(OpenBracket);
				setState(1097);
				singleExpression(0);
				setState(1098);
				match(CloseBracket);
				setState(1099);
				match(Colon);
				setState(1100);
				singleExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1102);
				identifierOrKeyWord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1103);
					match(Ellipsis);
					}
				}

				setState(1106);
				singleExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1107);
				restParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ParserFile.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ParserFile.OpenBracket, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ParserFile.CloseBracket, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_propertyName);
		try {
			setState(1117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case StoreModule:
			case EffectsModule:
			case CreateAction:
			case CreateReducer:
			case CreateSelector:
			case RouterModule:
			case NavigateByUrl:
			case ForRoot:
			case ForFeature:
			case Select:
			case Dispatch:
			case Navigate:
			case Store:
			case Injectable:
			case Signal:
			case Computed:
			case Effect:
			case WritableSignal:
			case ReadonlySignal:
			case BehaviorSubject:
			case Observable:
			case Subject:
			case Router:
			case ActivatedRoute:
			case Route:
			case Routes:
			case RouterOutlet:
			case RouterLink:
			case RouterLinkActive:
			case State:
			case Action:
			case Reducer:
			case Selector:
			case OnInit:
			case OnDestroy:
			case OnChanges:
			case AfterViewInit:
			case NgOnInit:
			case NgOnDestroy:
			case NgOnChanges:
			case NgAfterViewInit:
			case Inject:
			case Injector:
			case InjectionToken:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
				numericLiteral();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(1113);
				match(OpenBracket);
				setState(1114);
				singleExpression(0);
				setState(1115);
				match(CloseBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ParserFile.Comma, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(OpenParen);
			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221391192L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
				{
				setState(1120);
				argumentList();
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1121);
					match(Comma);
					}
				}

				}
			}

			setState(1126);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_argumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			argument();
			setState(1133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1129);
					match(Comma);
					setState(1130);
					argument();
					}
					} 
				}
				setState(1135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(ParserFile.Ellipsis, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1136);
				match(Ellipsis);
				}
			}

			setState(1141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1139);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(1140);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			singleExpression(0);
			setState(1148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1144);
					match(Comma);
					setState(1145);
					singleExpression(0);
					}
					} 
				}
				setState(1150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(ParserFile.Class, 0); }
		public ClassHeritageContext classHeritage() {
			return getRuleContext(ClassHeritageContext.class,0);
		}
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode New() { return getToken(ParserFile.New, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Delete() { return getToken(ParserFile.Delete, 0); }
		public TerminalNode Void() { return getToken(ParserFile.Void, 0); }
		public TerminalNode Typeof() { return getToken(ParserFile.Typeof, 0); }
		public TerminalNode PlusPlus() { return getToken(ParserFile.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(ParserFile.MinusMinus, 0); }
		public TerminalNode Plus() { return getToken(ParserFile.Plus, 0); }
		public TerminalNode Minus() { return getToken(ParserFile.Minus, 0); }
		public TerminalNode BitNot() { return getToken(ParserFile.BitNot, 0); }
		public TerminalNode Not() { return getToken(ParserFile.Not, 0); }
		public TerminalNode Await() { return getToken(ParserFile.Await, 0); }
		public IteratorBlockContext iteratorBlock() {
			return getRuleContext(IteratorBlockContext.class,0);
		}
		public TerminalNode This() { return getToken(ParserFile.This, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode At() { return getToken(ParserFile.At, 0); }
		public TerminalNode Super() { return getToken(ParserFile.Super, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public TerminalNode Signal() { return getToken(ParserFile.Signal, 0); }
		public TerminalNode WritableSignal() { return getToken(ParserFile.WritableSignal, 0); }
		public TerminalNode Computed() { return getToken(ParserFile.Computed, 0); }
		public TerminalNode Effect() { return getToken(ParserFile.Effect, 0); }
		public TerminalNode Store() { return getToken(ParserFile.Store, 0); }
		public TerminalNode Dot() { return getToken(ParserFile.Dot, 0); }
		public TerminalNode Select() { return getToken(ParserFile.Select, 0); }
		public TerminalNode Dispatch() { return getToken(ParserFile.Dispatch, 0); }
		public TerminalNode CreateAction() { return getToken(ParserFile.CreateAction, 0); }
		public TerminalNode StringLiteral() { return getToken(ParserFile.StringLiteral, 0); }
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public TerminalNode CreateReducer() { return getToken(ParserFile.CreateReducer, 0); }
		public TerminalNode CreateSelector() { return getToken(ParserFile.CreateSelector, 0); }
		public TerminalNode Router() { return getToken(ParserFile.Router, 0); }
		public TerminalNode Navigate() { return getToken(ParserFile.Navigate, 0); }
		public TerminalNode NavigateByUrl() { return getToken(ParserFile.NavigateByUrl, 0); }
		public TerminalNode Inject() { return getToken(ParserFile.Inject, 0); }
		public TerminalNode QuestionMarkDot() { return getToken(ParserFile.QuestionMarkDot, 0); }
		public TerminalNode Power() { return getToken(ParserFile.Power, 0); }
		public TerminalNode Multiply() { return getToken(ParserFile.Multiply, 0); }
		public TerminalNode Divide() { return getToken(ParserFile.Divide, 0); }
		public TerminalNode Modulus() { return getToken(ParserFile.Modulus, 0); }
		public TerminalNode NullCoalesce() { return getToken(ParserFile.NullCoalesce, 0); }
		public TerminalNode LeftShiftArithmetic() { return getToken(ParserFile.LeftShiftArithmetic, 0); }
		public List<TerminalNode> MoreThan() { return getTokens(ParserFile.MoreThan); }
		public TerminalNode MoreThan(int i) {
			return getToken(ParserFile.MoreThan, i);
		}
		public TerminalNode LessThan() { return getToken(ParserFile.LessThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(ParserFile.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ParserFile.GreaterThanEquals, 0); }
		public TerminalNode Instanceof() { return getToken(ParserFile.Instanceof, 0); }
		public TerminalNode In() { return getToken(ParserFile.In, 0); }
		public TerminalNode Equals_() { return getToken(ParserFile.Equals_, 0); }
		public TerminalNode NotEquals() { return getToken(ParserFile.NotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(ParserFile.IdentityEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(ParserFile.IdentityNotEquals, 0); }
		public TerminalNode BitAnd() { return getToken(ParserFile.BitAnd, 0); }
		public TerminalNode BitXOr() { return getToken(ParserFile.BitXOr, 0); }
		public TerminalNode BitOr() { return getToken(ParserFile.BitOr, 0); }
		public TerminalNode And() { return getToken(ParserFile.And, 0); }
		public TerminalNode Or() { return getToken(ParserFile.Or, 0); }
		public TerminalNode QuestionMark() { return getToken(ParserFile.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(ParserFile.Colon, 0); }
		public TerminalNode Assign() { return getToken(ParserFile.Assign, 0); }
		public TerminalNode ARROW() { return getToken(ParserFile.ARROW, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ParserFile.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(ParserFile.CloseBracket, 0); }
		public TerminalNode Hashtag() { return getToken(ParserFile.Hashtag, 0); }
		public TypeGenericContext typeGeneric() {
			return getRuleContext(TypeGenericContext.class,0);
		}
		public TerminalNode As() { return getToken(ParserFile.As, 0); }
		public AsExpressionContext asExpression() {
			return getRuleContext(AsExpressionContext.class,0);
		}
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1152);
				match(Class);
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & -1580552159189L) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 6291455L) != 0)) {
					{
					setState(1153);
					identifier();
					}
				}

				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(1156);
					typeParameters();
					}
				}

				setState(1159);
				classHeritage();
				setState(1160);
				classTail();
				}
				break;
			case 2:
				{
				setState(1162);
				match(New);
				setState(1163);
				singleExpression(0);
				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(1164);
					typeArguments();
					}
				}

				setState(1167);
				arguments();
				}
				break;
			case 3:
				{
				setState(1169);
				match(New);
				setState(1170);
				singleExpression(0);
				setState(1172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1171);
					typeArguments();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(1174);
				match(Delete);
				setState(1175);
				singleExpression(52);
				}
				break;
			case 5:
				{
				setState(1176);
				match(Void);
				setState(1177);
				singleExpression(51);
				}
				break;
			case 6:
				{
				setState(1178);
				match(Typeof);
				setState(1179);
				singleExpression(50);
				}
				break;
			case 7:
				{
				setState(1180);
				match(PlusPlus);
				setState(1181);
				singleExpression(49);
				}
				break;
			case 8:
				{
				setState(1182);
				match(MinusMinus);
				setState(1183);
				singleExpression(48);
				}
				break;
			case 9:
				{
				setState(1184);
				match(Plus);
				setState(1185);
				singleExpression(47);
				}
				break;
			case 10:
				{
				setState(1186);
				match(Minus);
				setState(1187);
				singleExpression(46);
				}
				break;
			case 11:
				{
				setState(1188);
				match(BitNot);
				setState(1189);
				singleExpression(45);
				}
				break;
			case 12:
				{
				setState(1190);
				match(Not);
				setState(1191);
				singleExpression(44);
				}
				break;
			case 13:
				{
				setState(1192);
				match(Await);
				setState(1193);
				singleExpression(43);
				}
				break;
			case 14:
				{
				setState(1194);
				iteratorBlock();
				}
				break;
			case 15:
				{
				setState(1195);
				match(This);
				}
				break;
			case 16:
				{
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(1196);
					match(At);
					}
				}

				setState(1199);
				identifierName();
				setState(1201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1200);
					singleExpression(0);
					}
					break;
				}
				}
				break;
			case 17:
				{
				setState(1203);
				match(Super);
				}
				break;
			case 18:
				{
				setState(1204);
				literal();
				}
				break;
			case 19:
				{
				setState(1205);
				arrayLiteral();
				}
				break;
			case 20:
				{
				setState(1206);
				objectLiteral();
				}
				break;
			case 21:
				{
				setState(1207);
				htmlElement();
				}
				break;
			case 22:
				{
				setState(1208);
				match(OpenParen);
				setState(1209);
				expressionSequence();
				setState(1210);
				match(CloseParen);
				}
				break;
			case 23:
				{
				setState(1212);
				typeArguments();
				setState(1214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1213);
					expressionSequence();
					}
					break;
				}
				}
				break;
			case 24:
				{
				setState(1216);
				match(Signal);
				setState(1217);
				match(OpenParen);
				setState(1218);
				singleExpression(0);
				setState(1219);
				match(CloseParen);
				}
				break;
			case 25:
				{
				setState(1221);
				match(WritableSignal);
				setState(1222);
				match(OpenParen);
				setState(1223);
				singleExpression(0);
				setState(1224);
				match(CloseParen);
				}
				break;
			case 26:
				{
				setState(1226);
				match(Computed);
				setState(1227);
				match(OpenParen);
				setState(1228);
				singleExpression(0);
				setState(1229);
				match(CloseParen);
				}
				break;
			case 27:
				{
				setState(1231);
				match(Effect);
				setState(1232);
				match(OpenParen);
				setState(1233);
				singleExpression(0);
				setState(1234);
				match(CloseParen);
				}
				break;
			case 28:
				{
				setState(1236);
				match(Store);
				setState(1237);
				match(Dot);
				setState(1238);
				match(Select);
				setState(1239);
				match(OpenParen);
				setState(1240);
				singleExpression(0);
				setState(1241);
				match(CloseParen);
				}
				break;
			case 29:
				{
				setState(1243);
				match(Store);
				setState(1244);
				match(Dot);
				setState(1245);
				match(Dispatch);
				setState(1246);
				match(OpenParen);
				setState(1247);
				singleExpression(0);
				setState(1248);
				match(CloseParen);
				}
				break;
			case 30:
				{
				setState(1250);
				match(CreateAction);
				setState(1251);
				match(OpenParen);
				setState(1252);
				match(StringLiteral);
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1253);
					match(Comma);
					setState(1254);
					objectLiteral();
					}
				}

				setState(1257);
				match(CloseParen);
				}
				break;
			case 31:
				{
				setState(1258);
				match(CreateReducer);
				setState(1259);
				match(OpenParen);
				setState(1260);
				identifier();
				setState(1261);
				match(Comma);
				setState(1262);
				singleExpression(0);
				setState(1263);
				match(CloseParen);
				}
				break;
			case 32:
				{
				setState(1265);
				match(CreateSelector);
				setState(1266);
				match(OpenParen);
				setState(1267);
				singleExpression(0);
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1268);
					match(Comma);
					setState(1269);
					singleExpression(0);
					}
					}
					setState(1274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1275);
				match(CloseParen);
				}
				break;
			case 33:
				{
				setState(1277);
				match(Router);
				setState(1278);
				match(Dot);
				setState(1279);
				match(Navigate);
				setState(1280);
				match(OpenParen);
				setState(1281);
				arrayLiteral();
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1282);
					match(Comma);
					setState(1283);
					objectLiteral();
					}
				}

				setState(1286);
				match(CloseParen);
				}
				break;
			case 34:
				{
				setState(1288);
				match(Router);
				setState(1289);
				match(Dot);
				setState(1290);
				match(NavigateByUrl);
				setState(1291);
				match(OpenParen);
				setState(1292);
				match(StringLiteral);
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1293);
					match(Comma);
					setState(1294);
					objectLiteral();
					}
				}

				setState(1297);
				match(CloseParen);
				}
				break;
			case 35:
				{
				setState(1298);
				match(Inject);
				setState(1299);
				match(OpenParen);
				setState(1300);
				identifier();
				setState(1301);
				match(CloseParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1416);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
					case 1:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1305);
						if (!(precpred(_ctx, 60))) throw new FailedPredicateException(this, "precpred(_ctx, 60)");
						setState(1306);
						match(QuestionMarkDot);
						setState(1307);
						singleExpression(61);
						}
						break;
					case 2:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1308);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(1309);
						match(Power);
						setState(1310);
						singleExpression(42);
						}
						break;
					case 3:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1311);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(1312);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1313);
						singleExpression(42);
						}
						break;
					case 4:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1314);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(1315);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1316);
						singleExpression(41);
						}
						break;
					case 5:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1317);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(1318);
						match(NullCoalesce);
						setState(1319);
						singleExpression(40);
						}
						break;
					case 6:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1320);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(1327);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
						case 1:
							{
							setState(1321);
							match(LeftShiftArithmetic);
							}
							break;
						case 2:
							{
							setState(1322);
							match(MoreThan);
							setState(1323);
							match(MoreThan);
							}
							break;
						case 3:
							{
							setState(1324);
							match(MoreThan);
							setState(1325);
							match(MoreThan);
							setState(1326);
							match(MoreThan);
							}
							break;
						}
						setState(1329);
						singleExpression(39);
						}
						break;
					case 7:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1330);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(1331);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1332);
						singleExpression(38);
						}
						break;
					case 8:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1333);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(1334);
						match(Instanceof);
						setState(1335);
						singleExpression(37);
						}
						break;
					case 9:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1336);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1337);
						match(In);
						setState(1338);
						singleExpression(36);
						}
						break;
					case 10:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1339);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1340);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1341);
						singleExpression(35);
						}
						break;
					case 11:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1342);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1343);
						match(BitAnd);
						setState(1344);
						singleExpression(34);
						}
						break;
					case 12:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1345);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1346);
						match(BitXOr);
						setState(1347);
						singleExpression(33);
						}
						break;
					case 13:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1348);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1349);
						match(BitOr);
						setState(1350);
						singleExpression(32);
						}
						break;
					case 14:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1351);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1352);
						match(And);
						setState(1353);
						singleExpression(31);
						}
						break;
					case 15:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1354);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1355);
						match(Or);
						setState(1356);
						singleExpression(30);
						}
						break;
					case 16:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1357);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1358);
						match(QuestionMark);
						setState(1359);
						singleExpression(0);
						setState(1360);
						match(Colon);
						setState(1361);
						singleExpression(29);
						}
						break;
					case 17:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1363);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1364);
						match(Assign);
						setState(1365);
						singleExpression(28);
						}
						break;
					case 18:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1366);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1367);
						match(ARROW);
						setState(1368);
						singleExpression(27);
						}
						break;
					case 19:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1369);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1370);
						assignmentOperator();
						setState(1371);
						singleExpression(26);
						}
						break;
					case 20:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1373);
						if (!(precpred(_ctx, 61))) throw new FailedPredicateException(this, "precpred(_ctx, 61)");
						setState(1375);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMarkDot) {
							{
							setState(1374);
							match(QuestionMarkDot);
							}
						}

						setState(1377);
						match(OpenBracket);
						setState(1378);
						expressionSequence();
						setState(1379);
						match(CloseBracket);
						}
						break;
					case 21:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1381);
						if (!(precpred(_ctx, 59))) throw new FailedPredicateException(this, "precpred(_ctx, 59)");
						setState(1383);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Not) {
							{
							setState(1382);
							match(Not);
							}
						}

						setState(1385);
						match(Dot);
						setState(1387);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Hashtag) {
							{
							setState(1386);
							match(Hashtag);
							}
						}

						setState(1389);
						identifierName();
						setState(1391);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
						case 1:
							{
							setState(1390);
							typeGeneric();
							}
							break;
						}
						}
						break;
					case 22:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1393);
						if (!(precpred(_ctx, 58))) throw new FailedPredicateException(this, "precpred(_ctx, 58)");
						setState(1395);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark) {
							{
							setState(1394);
							match(QuestionMark);
							}
						}

						setState(1397);
						match(Dot);
						setState(1399);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Hashtag) {
							{
							setState(1398);
							match(Hashtag);
							}
						}

						setState(1401);
						identifierName();
						setState(1403);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
						case 1:
							{
							setState(1402);
							typeGeneric();
							}
							break;
						}
						}
						break;
					case 23:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1405);
						if (!(precpred(_ctx, 55))) throw new FailedPredicateException(this, "precpred(_ctx, 55)");
						setState(1406);
						arguments();
						}
						break;
					case 24:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1407);
						if (!(precpred(_ctx, 54))) throw new FailedPredicateException(this, "precpred(_ctx, 54)");
						setState(1408);
						match(PlusPlus);
						}
						break;
					case 25:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1409);
						if (!(precpred(_ctx, 53))) throw new FailedPredicateException(this, "precpred(_ctx, 53)");
						setState(1410);
						match(MinusMinus);
						}
						break;
					case 26:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1411);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1412);
						match(As);
						setState(1413);
						asExpression();
						}
						break;
					case 27:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1414);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1415);
						match(Not);
						}
						break;
					}
					} 
				}
				setState(1420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementsContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_htmlElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1421);
				htmlElement();
				}
				}
				setState(1424); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LessThan );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> LessThan() { return getTokens(ParserFile.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(ParserFile.LessThan, i);
		}
		public HtmlTagStartNameContext htmlTagStartName() {
			return getRuleContext(HtmlTagStartNameContext.class,0);
		}
		public List<TerminalNode> MoreThan() { return getTokens(ParserFile.MoreThan); }
		public TerminalNode MoreThan(int i) {
			return getToken(ParserFile.MoreThan, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode Divide() { return getToken(ParserFile.Divide, 0); }
		public HtmlTagClosingNameContext htmlTagClosingName() {
			return getRuleContext(HtmlTagClosingNameContext.class,0);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlTagNameContext htmlTagName() {
			return getRuleContext(HtmlTagNameContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_htmlElement);
		int _la;
		try {
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				match(LessThan);
				setState(1427);
				htmlTagStartName();
				setState(1431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388648L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 6917529027641081857L) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & 2051L) != 0)) {
					{
					{
					setState(1428);
					htmlAttribute();
					}
					}
					setState(1433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1434);
				match(MoreThan);
				setState(1435);
				htmlContent();
				setState(1436);
				match(LessThan);
				setState(1437);
				match(Divide);
				setState(1438);
				htmlTagClosingName();
				setState(1439);
				match(MoreThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1441);
				match(LessThan);
				setState(1442);
				htmlTagName();
				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388648L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 6917529027641081857L) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & 2051L) != 0)) {
					{
					{
					setState(1443);
					htmlAttribute();
					}
					}
					setState(1448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1449);
				htmlContent();
				setState(1450);
				match(Divide);
				setState(1451);
				match(MoreThan);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1453);
				match(LessThan);
				setState(1454);
				htmlTagName();
				setState(1458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388648L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 6917529027641081857L) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & 2051L) != 0)) {
					{
					{
					setState(1455);
					htmlAttribute();
					}
					}
					setState(1460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1461);
				match(Divide);
				setState(1462);
				match(MoreThan);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1464);
				match(LessThan);
				setState(1465);
				htmlTagName();
				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388648L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 6917529027641081857L) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & 2051L) != 0)) {
					{
					{
					setState(1466);
					htmlAttribute();
					}
					}
					setState(1471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1472);
				match(MoreThan);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<InterpolationExpressionContext> interpolationExpression() {
			return getRuleContexts(InterpolationExpressionContext.class);
		}
		public InterpolationExpressionContext interpolationExpression(int i) {
			return getRuleContext(InterpolationExpressionContext.class,i);
		}
		public List<TerminalNode> LessThan() { return getTokens(ParserFile.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(ParserFile.LessThan, i);
		}
		public List<TerminalNode> OpenBrace() { return getTokens(ParserFile.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(ParserFile.OpenBrace, i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1478);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LessThan:
						{
						setState(1476);
						htmlElement();
						}
						break;
					case DOUBLE_L_CURLY:
						{
						setState(1477);
						interpolationExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1485);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
					case 1:
						{
						setState(1481); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1480);
								_la = _input.LA(1);
								if ( _la <= 0 || (_la==OpenBrace || _la==LessThan) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1483); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					}
					} 
				}
				setState(1491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExpressionSequenceContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ParserFile.OpenBrace, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ParserFile.CloseBrace, 0); }
		public ObjectExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterObjectExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitObjectExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitObjectExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionSequenceContext objectExpressionSequence() throws RecognitionException {
		ObjectExpressionSequenceContext _localctx = new ObjectExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_objectExpressionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			match(OpenBrace);
			setState(1493);
			expressionSequence();
			setState(1494);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagStartNameContext extends ParserRuleContext {
		public HtmlTagNameContext htmlTagName() {
			return getRuleContext(HtmlTagNameContext.class,0);
		}
		public HtmlTagStartNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagStartName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlTagStartName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlTagStartName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlTagStartName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagStartNameContext htmlTagStartName() throws RecognitionException {
		HtmlTagStartNameContext _localctx = new HtmlTagStartNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_htmlTagStartName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			htmlTagName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagClosingNameContext extends ParserRuleContext {
		public HtmlTagNameContext htmlTagName() {
			return getRuleContext(HtmlTagNameContext.class,0);
		}
		public HtmlTagClosingNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagClosingName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlTagClosingName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlTagClosingName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlTagClosingName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagClosingNameContext htmlTagClosingName() throws RecognitionException {
		HtmlTagClosingNameContext _localctx = new HtmlTagClosingNameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_htmlTagClosingName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			htmlTagName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagNameContext extends ParserRuleContext {
		public TerminalNode TagName() { return getToken(ParserFile.TagName, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ParserFile.Identifier, 0); }
		public TerminalNode RouterOutlet() { return getToken(ParserFile.RouterOutlet, 0); }
		public HtmlTagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagNameContext htmlTagName() throws RecognitionException {
		HtmlTagNameContext _localctx = new HtmlTagNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_htmlTagName);
		try {
			setState(1504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TagName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1500);
				match(TagName);
				}
				break;
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Number:
			case Boolean:
			case String:
			case TypeAlias:
			case Require:
			case Module:
				enterOuterAlt(_localctx, 2);
				{
				setState(1501);
				keyword();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1502);
				match(Identifier);
				}
				break;
			case RouterOutlet:
				enterOuterAlt(_localctx, 4);
				{
				setState(1503);
				match(RouterOutlet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeNameContext htmlAttributeName() {
			return getRuleContext(HtmlAttributeNameContext.class,0);
		}
		public TerminalNode Class() { return getToken(ParserFile.Class, 0); }
		public TerminalNode Multiply() { return getToken(ParserFile.Multiply, 0); }
		public TerminalNode Assign() { return getToken(ParserFile.Assign, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public TerminalNode AngularDirective() { return getToken(ParserFile.AngularDirective, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode RouterLink() { return getToken(ParserFile.RouterLink, 0); }
		public TerminalNode StringLiteral() { return getToken(ParserFile.StringLiteral, 0); }
		public TerminalNode RouterLinkActive() { return getToken(ParserFile.RouterLinkActive, 0); }
		public TerminalNode OpenBracket() { return getToken(ParserFile.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(ParserFile.CloseBracket, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_htmlAttribute);
		int _la;
		try {
			setState(1536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(1506);
					match(Multiply);
					}
				}

				setState(1511);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
				case OpenParen:
				case RouterLink:
				case RouterLinkActive:
				case Identifier:
				case AngularDirective:
				case TagName:
					{
					setState(1509);
					htmlAttributeName();
					}
					break;
				case Class:
					{
					setState(1510);
					match(Class);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(1513);
					match(Assign);
					setState(1514);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				match(AngularDirective);
				setState(1518);
				match(Assign);
				setState(1519);
				propertyName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1520);
				match(RouterLink);
				setState(1521);
				match(Assign);
				setState(1522);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1523);
				match(RouterLinkActive);
				setState(1524);
				match(Assign);
				setState(1525);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1526);
				match(OpenBracket);
				setState(1527);
				match(RouterLink);
				setState(1528);
				match(CloseBracket);
				setState(1529);
				match(Assign);
				setState(1530);
				match(StringLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1531);
				match(OpenBracket);
				setState(1532);
				match(RouterLinkActive);
				setState(1533);
				match(CloseBracket);
				setState(1534);
				match(Assign);
				setState(1535);
				match(StringLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeNameContext extends ParserRuleContext {
		public TerminalNode TagName() { return getToken(ParserFile.TagName, 0); }
		public TerminalNode AngularDirective() { return getToken(ParserFile.AngularDirective, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ParserFile.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ParserFile.Identifier, i);
		}
		public List<TerminalNode> Minus() { return getTokens(ParserFile.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(ParserFile.Minus, i);
		}
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public TerminalNode OpenBracket() { return getToken(ParserFile.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(ParserFile.CloseBracket, 0); }
		public TerminalNode RouterLink() { return getToken(ParserFile.RouterLink, 0); }
		public TerminalNode RouterLinkActive() { return getToken(ParserFile.RouterLinkActive, 0); }
		public HtmlAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeNameContext htmlAttributeName() throws RecognitionException {
		HtmlAttributeNameContext _localctx = new HtmlAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_htmlAttributeName);
		int _la;
		try {
			setState(1556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TagName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1538);
				match(TagName);
				}
				break;
			case AngularDirective:
				enterOuterAlt(_localctx, 2);
				{
				setState(1539);
				match(AngularDirective);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1540);
				match(Identifier);
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Minus) {
					{
					{
					setState(1541);
					match(Minus);
					setState(1542);
					match(Identifier);
					}
					}
					setState(1547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(1548);
				match(OpenParen);
				setState(1549);
				match(Identifier);
				setState(1550);
				match(CloseParen);
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(1551);
				match(OpenBracket);
				setState(1552);
				match(Identifier);
				setState(1553);
				match(CloseBracket);
				}
				break;
			case RouterLink:
				enterOuterAlt(_localctx, 6);
				{
				setState(1554);
				match(RouterLink);
				}
				break;
			case RouterLinkActive:
				enterOuterAlt(_localctx, 7);
				{
				setState(1555);
				match(RouterLinkActive);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public TerminalNode AttributeValue() { return getToken(ParserFile.AttributeValue, 0); }
		public TerminalNode StringLiteral() { return getToken(ParserFile.StringLiteral, 0); }
		public InterpolationExpressionContext interpolationExpression() {
			return getRuleContext(InterpolationExpressionContext.class,0);
		}
		public ObjectExpressionSequenceContext objectExpressionSequence() {
			return getRuleContext(ObjectExpressionSequenceContext.class,0);
		}
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_htmlAttributeValue);
		try {
			setState(1562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AttributeValue:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558);
				match(AttributeValue);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1559);
				match(StringLiteral);
				}
				break;
			case DOUBLE_L_CURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1560);
				interpolationExpression();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 4);
				{
				setState(1561);
				objectExpressionSequence();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationExpressionContext extends ParserRuleContext {
		public TerminalNode DOUBLE_L_CURLY() { return getToken(ParserFile.DOUBLE_L_CURLY, 0); }
		public HtmlSequenceContext htmlSequence() {
			return getRuleContext(HtmlSequenceContext.class,0);
		}
		public TerminalNode DOUBLE_R_CURLY() { return getToken(ParserFile.DOUBLE_R_CURLY, 0); }
		public InterpolationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInterpolationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInterpolationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInterpolationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationExpressionContext interpolationExpression() throws RecognitionException {
		InterpolationExpressionContext _localctx = new InterpolationExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_interpolationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			match(DOUBLE_L_CURLY);
			setState(1565);
			htmlSequence();
			setState(1566);
			match(DOUBLE_R_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSequenceContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode Dot() { return getToken(ParserFile.Dot, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public HtmlSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlSequenceContext htmlSequence() throws RecognitionException {
		HtmlSequenceContext _localctx = new HtmlSequenceContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_htmlSequence);
		try {
			setState(1573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1568);
				propertyName();
				setState(1569);
				match(Dot);
				setState(1570);
				identifierName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1572);
				singleExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsExpressionContext extends ParserRuleContext {
		public PredefinedTypeContext predefinedType() {
			return getRuleContext(PredefinedTypeContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ParserFile.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(ParserFile.CloseBracket, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public AsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsExpressionContext asExpression() throws RecognitionException {
		AsExpressionContext _localctx = new AsExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_asExpression);
		try {
			setState(1581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1575);
				predefinedType();
				setState(1578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1576);
					match(OpenBracket);
					setState(1577);
					match(CloseBracket);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1580);
				singleExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_assignable);
		try {
			setState(1587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1583);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1584);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1585);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1586);
				objectLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(ParserFile.OpenBracket, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ParserFile.CloseBracket, 0); }
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1589);
			match(OpenBracket);
			setState(1590);
			elementList();
			setState(1591);
			match(CloseBracket);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ParserFile.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ParserFile.CloseBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			match(OpenBrace);
			setState(1605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221391192L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 211106232532991L) != 0)) {
				{
				setState(1594);
				propertyAssignment();
				setState(1599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1595);
						match(Comma);
						setState(1596);
						propertyAssignment();
						}
						} 
					}
					setState(1601);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				setState(1603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1602);
					match(Comma);
					}
				}

				}
			}

			setState(1607);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode MultiplyAssign() { return getToken(ParserFile.MultiplyAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(ParserFile.DivideAssign, 0); }
		public TerminalNode ModulusAssign() { return getToken(ParserFile.ModulusAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(ParserFile.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(ParserFile.MinusAssign, 0); }
		public TerminalNode LeftShiftArithmeticAssign() { return getToken(ParserFile.LeftShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftArithmeticAssign() { return getToken(ParserFile.RightShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftLogicalAssign() { return getToken(ParserFile.RightShiftLogicalAssign, 0); }
		public TerminalNode BitAndAssign() { return getToken(ParserFile.BitAndAssign, 0); }
		public TerminalNode BitXorAssign() { return getToken(ParserFile.BitXorAssign, 0); }
		public TerminalNode BitOrAssign() { return getToken(ParserFile.BitOrAssign, 0); }
		public TerminalNode PowerAssign() { return getToken(ParserFile.PowerAssign, 0); }
		public TerminalNode NullishCoalescingAssign() { return getToken(ParserFile.NullishCoalescingAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 72048797944905728L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(ParserFile.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ParserFile.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ParserFile.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_literal);
		try {
			setState(1615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1611);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1612);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1613);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1614);
				numericLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(ParserFile.DecimalLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			match(DecimalLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIdentifierName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIdentifierName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_identifierName);
		try {
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1620);
				reservedWord();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ParserFile.Identifier, 0); }
		public TerminalNode Async() { return getToken(ParserFile.Async, 0); }
		public TerminalNode As() { return getToken(ParserFile.As, 0); }
		public TerminalNode From() { return getToken(ParserFile.From, 0); }
		public TerminalNode Yield() { return getToken(ParserFile.Yield, 0); }
		public TerminalNode Of() { return getToken(ParserFile.Of, 0); }
		public TerminalNode Any() { return getToken(ParserFile.Any, 0); }
		public TerminalNode Number() { return getToken(ParserFile.Number, 0); }
		public TerminalNode Boolean() { return getToken(ParserFile.Boolean, 0); }
		public TerminalNode String() { return getToken(ParserFile.String, 0); }
		public TerminalNode Unique() { return getToken(ParserFile.Unique, 0); }
		public TerminalNode Symbol() { return getToken(ParserFile.Symbol, 0); }
		public TerminalNode Never() { return getToken(ParserFile.Never, 0); }
		public TerminalNode Undefined() { return getToken(ParserFile.Undefined, 0); }
		public TerminalNode Object() { return getToken(ParserFile.Object, 0); }
		public TerminalNode KeyOf() { return getToken(ParserFile.KeyOf, 0); }
		public TerminalNode TypeAlias() { return getToken(ParserFile.TypeAlias, 0); }
		public TerminalNode Constructor() { return getToken(ParserFile.Constructor, 0); }
		public TerminalNode Namespace() { return getToken(ParserFile.Namespace, 0); }
		public TerminalNode Abstract() { return getToken(ParserFile.Abstract, 0); }
		public TerminalNode StoreModule() { return getToken(ParserFile.StoreModule, 0); }
		public TerminalNode EffectsModule() { return getToken(ParserFile.EffectsModule, 0); }
		public TerminalNode CreateAction() { return getToken(ParserFile.CreateAction, 0); }
		public TerminalNode CreateReducer() { return getToken(ParserFile.CreateReducer, 0); }
		public TerminalNode CreateSelector() { return getToken(ParserFile.CreateSelector, 0); }
		public TerminalNode RouterModule() { return getToken(ParserFile.RouterModule, 0); }
		public TerminalNode Select() { return getToken(ParserFile.Select, 0); }
		public TerminalNode Dispatch() { return getToken(ParserFile.Dispatch, 0); }
		public TerminalNode Navigate() { return getToken(ParserFile.Navigate, 0); }
		public TerminalNode NavigateByUrl() { return getToken(ParserFile.NavigateByUrl, 0); }
		public TerminalNode ForRoot() { return getToken(ParserFile.ForRoot, 0); }
		public TerminalNode ForFeature() { return getToken(ParserFile.ForFeature, 0); }
		public TerminalNode Store() { return getToken(ParserFile.Store, 0); }
		public TerminalNode Injectable() { return getToken(ParserFile.Injectable, 0); }
		public TerminalNode Signal() { return getToken(ParserFile.Signal, 0); }
		public TerminalNode Computed() { return getToken(ParserFile.Computed, 0); }
		public TerminalNode Effect() { return getToken(ParserFile.Effect, 0); }
		public TerminalNode WritableSignal() { return getToken(ParserFile.WritableSignal, 0); }
		public TerminalNode ReadonlySignal() { return getToken(ParserFile.ReadonlySignal, 0); }
		public TerminalNode BehaviorSubject() { return getToken(ParserFile.BehaviorSubject, 0); }
		public TerminalNode Observable() { return getToken(ParserFile.Observable, 0); }
		public TerminalNode Subject() { return getToken(ParserFile.Subject, 0); }
		public TerminalNode Router() { return getToken(ParserFile.Router, 0); }
		public TerminalNode ActivatedRoute() { return getToken(ParserFile.ActivatedRoute, 0); }
		public TerminalNode Route() { return getToken(ParserFile.Route, 0); }
		public TerminalNode Routes() { return getToken(ParserFile.Routes, 0); }
		public TerminalNode RouterOutlet() { return getToken(ParserFile.RouterOutlet, 0); }
		public TerminalNode RouterLink() { return getToken(ParserFile.RouterLink, 0); }
		public TerminalNode RouterLinkActive() { return getToken(ParserFile.RouterLinkActive, 0); }
		public TerminalNode State() { return getToken(ParserFile.State, 0); }
		public TerminalNode Action() { return getToken(ParserFile.Action, 0); }
		public TerminalNode Reducer() { return getToken(ParserFile.Reducer, 0); }
		public TerminalNode Selector() { return getToken(ParserFile.Selector, 0); }
		public TerminalNode OnInit() { return getToken(ParserFile.OnInit, 0); }
		public TerminalNode OnDestroy() { return getToken(ParserFile.OnDestroy, 0); }
		public TerminalNode OnChanges() { return getToken(ParserFile.OnChanges, 0); }
		public TerminalNode AfterViewInit() { return getToken(ParserFile.AfterViewInit, 0); }
		public TerminalNode NgOnInit() { return getToken(ParserFile.NgOnInit, 0); }
		public TerminalNode NgOnDestroy() { return getToken(ParserFile.NgOnDestroy, 0); }
		public TerminalNode NgOnChanges() { return getToken(ParserFile.NgOnChanges, 0); }
		public TerminalNode NgAfterViewInit() { return getToken(ParserFile.NgAfterViewInit, 0); }
		public TerminalNode Inject() { return getToken(ParserFile.Inject, 0); }
		public TerminalNode Injector() { return getToken(ParserFile.Injector, 0); }
		public TerminalNode InjectionToken() { return getToken(ParserFile.InjectionToken, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & -1580552159189L) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 6291455L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierOrKeyWordContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeAlias() { return getToken(ParserFile.TypeAlias, 0); }
		public TerminalNode Require() { return getToken(ParserFile.Require, 0); }
		public IdentifierOrKeyWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrKeyWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIdentifierOrKeyWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIdentifierOrKeyWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIdentifierOrKeyWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrKeyWordContext identifierOrKeyWord() throws RecognitionException {
		IdentifierOrKeyWordContext _localctx = new IdentifierOrKeyWordContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_identifierOrKeyWord);
		try {
			setState(1628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1625);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1626);
				match(TypeAlias);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1627);
				match(Require);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BindingPatternContext extends ParserRuleContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public BindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBindingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBindingPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBindingPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingPatternContext bindingPattern() throws RecognitionException {
		BindingPatternContext _localctx = new BindingPatternContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_bindingPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				{
				setState(1630);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				{
				setState(1631);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(ParserFile.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(ParserFile.MoreThan, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			match(LessThan);
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & -1580552159189L) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 6291455L) != 0)) {
				{
				setState(1635);
				typeParameterList();
				}
			}

			setState(1638);
			match(MoreThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			typeParameter();
			setState(1645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1641);
				match(Comma);
				setState(1642);
				typeParameter();
				}
				}
				setState(1647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ParserFile.Assign, 0); }
		public TypeArgumentContext typeArgument() {
			return getRuleContext(TypeArgumentContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_typeParameter);
		int _la;
		try {
			setState(1657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1648);
				identifier();
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1649);
					constraint();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1652);
				identifier();
				setState(1653);
				match(Assign);
				setState(1654);
				typeArgument();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1656);
				typeParameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(ParserFile.Extends, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			match(Extends);
			setState(1660);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(ParserFile.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(ParserFile.MoreThan, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			match(LessThan);
			setState(1664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4035226641587241000L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -1657329060873760735L) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 24189255811071L) != 0)) {
				{
				setState(1663);
				typeArgumentList();
				}
			}

			setState(1666);
			match(MoreThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			typeArgument();
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1669);
				match(Comma);
				setState(1670);
				typeArgument();
				}
				}
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_typeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_Context extends ParserRuleContext {
		public UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType() {
			return getRuleContext(UnionOrIntersectionOrPrimaryTypeContext.class,0);
		}
		public TerminalNode BitOr() { return getToken(ParserFile.BitOr, 0); }
		public TerminalNode BitAnd() { return getToken(ParserFile.BitAnd, 0); }
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ConstructorTypeContext constructorType() {
			return getRuleContext(ConstructorTypeContext.class,0);
		}
		public TypeGenericContext typeGeneric() {
			return getRuleContext(TypeGenericContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 204, RULE_type_);
		int _la;
		try {
			setState(1685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BitAnd || _la==BitOr) {
					{
					setState(1678);
					_la = _input.LA(1);
					if ( !(_la==BitAnd || _la==BitOr) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1681);
				unionOrIntersectionOrPrimaryType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1682);
				functionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1683);
				constructorType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1684);
				typeGeneric();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnionOrIntersectionOrPrimaryTypeContext extends ParserRuleContext {
		public PrimaryTypeContext primaryType() {
			return getRuleContext(PrimaryTypeContext.class,0);
		}
		public UnionOrIntersectionOrPrimaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionOrIntersectionOrPrimaryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterUnionOrIntersectionOrPrimaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitUnionOrIntersectionOrPrimaryType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitUnionOrIntersectionOrPrimaryType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType() throws RecognitionException {
		UnionOrIntersectionOrPrimaryTypeContext _localctx = new UnionOrIntersectionOrPrimaryTypeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_unionOrIntersectionOrPrimaryType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			primaryType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryTypeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public PredefinedTypeContext predefinedType() {
			return getRuleContext(PredefinedTypeContext.class,0);
		}
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ParserFile.OpenBracket, 0); }
		public TupleElementTypesContext tupleElementTypes() {
			return getRuleContext(TupleElementTypesContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ParserFile.CloseBracket, 0); }
		public TerminalNode This() { return getToken(ParserFile.This, 0); }
		public TerminalNode Is() { return getToken(ParserFile.Is, 0); }
		public List<PrimaryTypeContext> primaryType() {
			return getRuleContexts(PrimaryTypeContext.class);
		}
		public PrimaryTypeContext primaryType(int i) {
			return getRuleContext(PrimaryTypeContext.class,i);
		}
		public TerminalNode KeyOf() { return getToken(ParserFile.KeyOf, 0); }
		public PrimaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPrimaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPrimaryType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPrimaryType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryTypeContext primaryType() throws RecognitionException {
		return primaryType(0);
	}

	private PrimaryTypeContext primaryType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryTypeContext _localctx = new PrimaryTypeContext(_ctx, _parentState);
		PrimaryTypeContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_primaryType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1690);
				match(OpenParen);
				setState(1691);
				type_();
				setState(1692);
				match(CloseParen);
				}
				break;
			case 2:
				{
				setState(1694);
				predefinedType();
				}
				break;
			case 3:
				{
				setState(1695);
				typeReference();
				}
				break;
			case 4:
				{
				setState(1696);
				match(OpenBracket);
				setState(1697);
				tupleElementTypes();
				setState(1698);
				match(CloseBracket);
				}
				break;
			case 5:
				{
				setState(1700);
				match(This);
				}
				break;
			case 6:
				{
				setState(1701);
				typeReference();
				setState(1702);
				match(Is);
				setState(1703);
				primaryType(2);
				}
				break;
			case 7:
				{
				setState(1705);
				match(KeyOf);
				setState(1706);
				primaryType(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1717);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryType);
					setState(1709);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(1710);
					match(OpenBracket);
					setState(1712);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4035225266123964456L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & -51791533152305023L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 755914244095L) != 0)) {
						{
						setState(1711);
						primaryType(0);
						}
					}

					setState(1714);
					match(CloseBracket);
					}
					} 
				}
				setState(1719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredefinedTypeContext extends ParserRuleContext {
		public TerminalNode Any() { return getToken(ParserFile.Any, 0); }
		public TerminalNode NullLiteral() { return getToken(ParserFile.NullLiteral, 0); }
		public TerminalNode Number() { return getToken(ParserFile.Number, 0); }
		public TerminalNode DecimalLiteral() { return getToken(ParserFile.DecimalLiteral, 0); }
		public TerminalNode Boolean() { return getToken(ParserFile.Boolean, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ParserFile.BooleanLiteral, 0); }
		public TerminalNode String() { return getToken(ParserFile.String, 0); }
		public TerminalNode StringLiteral() { return getToken(ParserFile.StringLiteral, 0); }
		public TerminalNode Symbol() { return getToken(ParserFile.Symbol, 0); }
		public TerminalNode Unique() { return getToken(ParserFile.Unique, 0); }
		public TerminalNode Never() { return getToken(ParserFile.Never, 0); }
		public TerminalNode Undefined() { return getToken(ParserFile.Undefined, 0); }
		public TerminalNode Object() { return getToken(ParserFile.Object, 0); }
		public TerminalNode Void() { return getToken(ParserFile.Void, 0); }
		public TerminalNode Observable() { return getToken(ParserFile.Observable, 0); }
		public TerminalNode Signal() { return getToken(ParserFile.Signal, 0); }
		public TerminalNode WritableSignal() { return getToken(ParserFile.WritableSignal, 0); }
		public TerminalNode ReadonlySignal() { return getToken(ParserFile.ReadonlySignal, 0); }
		public TerminalNode BehaviorSubject() { return getToken(ParserFile.BehaviorSubject, 0); }
		public TerminalNode Subject() { return getToken(ParserFile.Subject, 0); }
		public TerminalNode Router() { return getToken(ParserFile.Router, 0); }
		public TerminalNode ActivatedRoute() { return getToken(ParserFile.ActivatedRoute, 0); }
		public TerminalNode Routes() { return getToken(ParserFile.Routes, 0); }
		public PredefinedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefinedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPredefinedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPredefinedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPredefinedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredefinedTypeContext predefinedType() throws RecognitionException {
		PredefinedTypeContext _localctx = new PredefinedTypeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_predefinedType);
		int _la;
		try {
			setState(1745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Any:
				enterOuterAlt(_localctx, 1);
				{
				setState(1720);
				match(Any);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1721);
				match(NullLiteral);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(1722);
				match(Number);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1723);
				match(DecimalLiteral);
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 5);
				{
				setState(1724);
				match(Boolean);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(1725);
				match(BooleanLiteral);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 7);
				{
				setState(1726);
				match(String);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 8);
				{
				setState(1727);
				match(StringLiteral);
				}
				break;
			case Unique:
			case Symbol:
				enterOuterAlt(_localctx, 9);
				{
				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Unique) {
					{
					setState(1728);
					match(Unique);
					}
				}

				setState(1731);
				match(Symbol);
				}
				break;
			case Never:
				enterOuterAlt(_localctx, 10);
				{
				setState(1732);
				match(Never);
				}
				break;
			case Undefined:
				enterOuterAlt(_localctx, 11);
				{
				setState(1733);
				match(Undefined);
				}
				break;
			case Object:
				enterOuterAlt(_localctx, 12);
				{
				setState(1734);
				match(Object);
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 13);
				{
				setState(1735);
				match(Void);
				}
				break;
			case Observable:
				enterOuterAlt(_localctx, 14);
				{
				setState(1736);
				match(Observable);
				}
				break;
			case Signal:
				enterOuterAlt(_localctx, 15);
				{
				setState(1737);
				match(Signal);
				}
				break;
			case WritableSignal:
				enterOuterAlt(_localctx, 16);
				{
				setState(1738);
				match(WritableSignal);
				}
				break;
			case ReadonlySignal:
				enterOuterAlt(_localctx, 17);
				{
				setState(1739);
				match(ReadonlySignal);
				}
				break;
			case BehaviorSubject:
				enterOuterAlt(_localctx, 18);
				{
				setState(1740);
				match(BehaviorSubject);
				}
				break;
			case Subject:
				enterOuterAlt(_localctx, 19);
				{
				setState(1741);
				match(Subject);
				}
				break;
			case Router:
				enterOuterAlt(_localctx, 20);
				{
				setState(1742);
				match(Router);
				}
				break;
			case ActivatedRoute:
				enterOuterAlt(_localctx, 21);
				{
				setState(1743);
				match(ActivatedRoute);
				}
				break;
			case Routes:
				enterOuterAlt(_localctx, 22);
				{
				setState(1744);
				match(Routes);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeReferenceContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeGenericContext typeGeneric() {
			return getRuleContext(TypeGenericContext.class,0);
		}
		public TypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTypeReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTypeReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_typeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			typeName();
			setState(1749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1748);
				typeGeneric();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeGenericContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(ParserFile.LessThan, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode MoreThan() { return getToken(ParserFile.MoreThan, 0); }
		public TypeGenericContext typeGeneric() {
			return getRuleContext(TypeGenericContext.class,0);
		}
		public TypeGenericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeGeneric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTypeGeneric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTypeGeneric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTypeGeneric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeGenericContext typeGeneric() throws RecognitionException {
		TypeGenericContext _localctx = new TypeGenericContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_typeGeneric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			match(LessThan);
			setState(1752);
			typeArgumentList();
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(1753);
				typeGeneric();
				}
			}

			setState(1756);
			match(MoreThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_typeName);
		try {
			setState(1760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1758);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1759);
				namespaceName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleElementTypesContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public TupleElementTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleElementTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTupleElementTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTupleElementTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTupleElementTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleElementTypesContext tupleElementTypes() throws RecognitionException {
		TupleElementTypesContext _localctx = new TupleElementTypesContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_tupleElementTypes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			type_();
			setState(1767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1763);
					match(Comma);
					setState(1764);
					type_();
					}
					} 
				}
				setState(1769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1770);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public TerminalNode ARROW() { return getToken(ParserFile.ARROW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(1773);
				typeParameters();
				}
			}

			setState(1776);
			match(OpenParen);
			setState(1778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2882303761517084536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 70368744177663L) != 0)) {
				{
				setState(1777);
				parameterList();
				}
			}

			setState(1780);
			match(CloseParen);
			setState(1781);
			match(ARROW);
			setState(1782);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorTypeContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(ParserFile.New, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public TerminalNode ARROW() { return getToken(ParserFile.ARROW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterConstructorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitConstructorType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitConstructorType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorTypeContext constructorType() throws RecognitionException {
		ConstructorTypeContext _localctx = new ConstructorTypeContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_constructorType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			match(New);
			setState(1786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(1785);
				typeParameters();
				}
			}

			setState(1788);
			match(OpenParen);
			setState(1790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2882303761517084536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 70368744177663L) != 0)) {
				{
				setState(1789);
				parameterList();
				}
			}

			setState(1792);
			match(CloseParen);
			setState(1793);
			match(ARROW);
			setState(1794);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotationContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(ParserFile.Colon, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			match(Colon);
			setState(1797);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallSignatureContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public CallSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCallSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCallSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCallSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSignatureContext callSignature() throws RecognitionException {
		CallSignatureContext _localctx = new CallSignatureContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_callSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(1799);
				typeParameters();
				}
			}

			setState(1802);
			match(OpenParen);
			setState(1804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2882303761517084536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 70368744177663L) != 0)) {
				{
				setState(1803);
				parameterList();
				}
			}

			setState(1806);
			match(CloseParen);
			setState(1808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1807);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public RestParameterContext restParameter() {
			return getRuleContext(RestParameterContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_parameterList);
		int _la;
		try {
			int _alt;
			setState(1826);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1810);
				restParameter();
				}
				break;
			case OpenBracket:
			case OpenBrace:
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case StoreModule:
			case EffectsModule:
			case CreateAction:
			case CreateReducer:
			case CreateSelector:
			case RouterModule:
			case NavigateByUrl:
			case ForRoot:
			case ForFeature:
			case Select:
			case Dispatch:
			case Navigate:
			case Store:
			case Injectable:
			case Signal:
			case Computed:
			case Effect:
			case WritableSignal:
			case ReadonlySignal:
			case BehaviorSubject:
			case Observable:
			case Subject:
			case Router:
			case ActivatedRoute:
			case Route:
			case Routes:
			case RouterOutlet:
			case RouterLink:
			case RouterLinkActive:
			case State:
			case Action:
			case Reducer:
			case Selector:
			case OnInit:
			case OnDestroy:
			case OnChanges:
			case AfterViewInit:
			case NgOnInit:
			case NgOnDestroy:
			case NgOnChanges:
			case NgAfterViewInit:
			case Inject:
			case Injector:
			case InjectionToken:
			case At:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1811);
				parameter();
				setState(1816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1812);
						match(Comma);
						setState(1813);
						parameter();
						}
						} 
					}
					setState(1818);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				}
				setState(1821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1819);
					match(Comma);
					setState(1820);
					restParameter();
					}
					break;
				}
				setState(1824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1823);
					match(Comma);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public RequiredParameterContext requiredParameter() {
			return getRuleContext(RequiredParameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			requiredParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RestParameterContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(ParserFile.Ellipsis, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public RestParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterRestParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitRestParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitRestParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestParameterContext restParameter() throws RecognitionException {
		RestParameterContext _localctx = new RestParameterContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_restParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			match(Ellipsis);
			setState(1831);
			singleExpression(0);
			setState(1833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1832);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequiredParameterContext extends ParserRuleContext {
		public IdentifierOrPatternContext identifierOrPattern() {
			return getRuleContext(IdentifierOrPatternContext.class,0);
		}
		public DecoratorListContext decoratorList() {
			return getRuleContext(DecoratorListContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public RequiredParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterRequiredParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitRequiredParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitRequiredParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequiredParameterContext requiredParameter() throws RecognitionException {
		RequiredParameterContext _localctx = new RequiredParameterContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_requiredParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1835);
				decoratorList();
				}
			}

			setState(1839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1838);
				accessibilityModifier();
				}
				break;
			}
			setState(1841);
			identifierOrPattern();
			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1842);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessibilityModifierContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(ParserFile.Public, 0); }
		public TerminalNode Private() { return getToken(ParserFile.Private, 0); }
		public TerminalNode Protected() { return getToken(ParserFile.Protected, 0); }
		public AccessibilityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessibilityModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAccessibilityModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAccessibilityModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAccessibilityModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessibilityModifierContext accessibilityModifier() throws RecognitionException {
		AccessibilityModifierContext _localctx = new AccessibilityModifierContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_accessibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 19L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierOrPatternContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public IdentifierOrPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIdentifierOrPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIdentifierOrPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIdentifierOrPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrPatternContext identifierOrPattern() throws RecognitionException {
		IdentifierOrPatternContext _localctx = new IdentifierOrPatternContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_identifierOrPattern);
		try {
			setState(1849);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function_:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case As:
			case From:
			case ReadOnly:
			case Async:
			case Await:
			case Yield:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Require:
			case Module:
			case Abstract:
			case StoreModule:
			case EffectsModule:
			case CreateAction:
			case CreateReducer:
			case CreateSelector:
			case RouterModule:
			case NavigateByUrl:
			case ForRoot:
			case ForFeature:
			case Select:
			case Dispatch:
			case Navigate:
			case Store:
			case Injectable:
			case Signal:
			case Computed:
			case Effect:
			case WritableSignal:
			case ReadonlySignal:
			case BehaviorSubject:
			case Observable:
			case Subject:
			case Router:
			case ActivatedRoute:
			case Route:
			case Routes:
			case RouterOutlet:
			case RouterLink:
			case RouterLinkActive:
			case State:
			case Action:
			case Reducer:
			case Selector:
			case OnInit:
			case OnDestroy:
			case OnChanges:
			case AfterViewInit:
			case NgOnInit:
			case NgOnDestroy:
			case NgOnChanges:
			case NgAfterViewInit:
			case Inject:
			case Injector:
			case InjectionToken:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1847);
				identifierName();
				}
				break;
			case OpenBracket:
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1848);
				bindingPattern();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexSignatureContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(ParserFile.OpenBracket, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ParserFile.Colon, 0); }
		public TerminalNode CloseBracket() { return getToken(ParserFile.CloseBracket, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode Number() { return getToken(ParserFile.Number, 0); }
		public TerminalNode String() { return getToken(ParserFile.String, 0); }
		public IndexSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIndexSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIndexSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIndexSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexSignatureContext indexSignature() throws RecognitionException {
		IndexSignatureContext _localctx = new IndexSignatureContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_indexSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			match(OpenBracket);
			setState(1852);
			identifier();
			setState(1853);
			match(Colon);
			setState(1854);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1855);
			match(CloseBracket);
			setState(1856);
			typeAnnotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Constructor() { return getToken(ParserFile.Constructor, 0); }
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ParserFile.SemiColon, 0); }
		public TerminalNode OpenBrace() { return getToken(ParserFile.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ParserFile.CloseBrace, 0); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 19L) != 0)) {
				{
				setState(1858);
				accessibilityModifier();
				}
			}

			setState(1861);
			match(Constructor);
			setState(1862);
			match(OpenParen);
			setState(1864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611686018427355000L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 70368744177663L) != 0)) {
				{
				setState(1863);
				formalParameterList();
				}
			}

			setState(1866);
			match(CloseParen);
			setState(1872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				{
				setState(1867);
				match(OpenBrace);
				setState(1868);
				functionBody();
				setState(1869);
				match(CloseBrace);
				}
				}
				break;
			case 2:
				{
				setState(1871);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrInterfaceTypeListContext extends ParserRuleContext {
		public List<TypeReferenceContext> typeReference() {
			return getRuleContexts(TypeReferenceContext.class);
		}
		public TypeReferenceContext typeReference(int i) {
			return getRuleContext(TypeReferenceContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ParserFile.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ParserFile.Comma, i);
		}
		public ClassOrInterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClassOrInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClassOrInterfaceTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClassOrInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeListContext classOrInterfaceTypeList() throws RecognitionException {
		ClassOrInterfaceTypeListContext _localctx = new ClassOrInterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_classOrInterfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1874);
			typeReference();
			setState(1879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1875);
				match(Comma);
				setState(1876);
				typeReference();
				}
				}
				setState(1881);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(ParserFile.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ParserFile.Dot, i);
		}
		public NamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameContext namespaceName() throws RecognitionException {
		NamespaceNameContext _localctx = new NamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_namespaceName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1882);
			identifier();
			setState(1891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1884); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1883);
						match(Dot);
						}
						}
						setState(1886); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Dot );
					setState(1888);
					identifier();
					}
					} 
				}
				setState(1893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorListContext extends ParserRuleContext {
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDecoratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDecoratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDecoratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorListContext decoratorList() throws RecognitionException {
		DecoratorListContext _localctx = new DecoratorListContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_decoratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1894);
				decorator();
				}
				}
				setState(1897); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==At );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(ParserFile.At, 0); }
		public DecoratorMemberExpressionContext decoratorMemberExpression() {
			return getRuleContext(DecoratorMemberExpressionContext.class,0);
		}
		public DecoratorCallExpressionContext decoratorCallExpression() {
			return getRuleContext(DecoratorCallExpressionContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			match(At);
			setState(1902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1900);
				decoratorMemberExpression(0);
				}
				break;
			case 2:
				{
				setState(1901);
				decoratorCallExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorMemberExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ParserFile.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ParserFile.CloseParen, 0); }
		public DecoratorMemberExpressionContext decoratorMemberExpression() {
			return getRuleContext(DecoratorMemberExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(ParserFile.Dot, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public DecoratorMemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorMemberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDecoratorMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDecoratorMemberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDecoratorMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorMemberExpressionContext decoratorMemberExpression() throws RecognitionException {
		return decoratorMemberExpression(0);
	}

	private DecoratorMemberExpressionContext decoratorMemberExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DecoratorMemberExpressionContext _localctx = new DecoratorMemberExpressionContext(_ctx, _parentState);
		DecoratorMemberExpressionContext _prevctx = _localctx;
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_decoratorMemberExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case As:
			case From:
			case Async:
			case Yield:
			case Any:
			case Number:
			case Never:
			case Boolean:
			case String:
			case Unique:
			case Symbol:
			case Undefined:
			case Object:
			case Of:
			case KeyOf:
			case TypeAlias:
			case Constructor:
			case Namespace:
			case Abstract:
			case StoreModule:
			case EffectsModule:
			case CreateAction:
			case CreateReducer:
			case CreateSelector:
			case RouterModule:
			case NavigateByUrl:
			case ForRoot:
			case ForFeature:
			case Select:
			case Dispatch:
			case Navigate:
			case Store:
			case Injectable:
			case Signal:
			case Computed:
			case Effect:
			case WritableSignal:
			case ReadonlySignal:
			case BehaviorSubject:
			case Observable:
			case Subject:
			case Router:
			case ActivatedRoute:
			case Route:
			case Routes:
			case RouterOutlet:
			case RouterLink:
			case RouterLinkActive:
			case State:
			case Action:
			case Reducer:
			case Selector:
			case OnInit:
			case OnDestroy:
			case OnChanges:
			case AfterViewInit:
			case NgOnInit:
			case NgOnDestroy:
			case NgOnChanges:
			case NgAfterViewInit:
			case Inject:
			case Injector:
			case InjectionToken:
			case Identifier:
				{
				setState(1905);
				identifier();
				}
				break;
			case OpenParen:
				{
				setState(1906);
				match(OpenParen);
				setState(1907);
				singleExpression(0);
				setState(1908);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1917);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DecoratorMemberExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decoratorMemberExpression);
					setState(1912);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1913);
					match(Dot);
					setState(1914);
					identifierName();
					}
					} 
				}
				setState(1919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorCallExpressionContext extends ParserRuleContext {
		public DecoratorMemberExpressionContext decoratorMemberExpression() {
			return getRuleContext(DecoratorMemberExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public DecoratorCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorCallExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDecoratorCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDecoratorCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDecoratorCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorCallExpressionContext decoratorCallExpression() throws RecognitionException {
		DecoratorCallExpressionContext _localctx = new DecoratorCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_decoratorCallExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
			decoratorMemberExpression(0);
			setState(1921);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ParserFile.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(ParserFile.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SemiColon) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 71:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 104:
			return primaryType_sempred((PrimaryTypeContext)_localctx, predIndex);
		case 126:
			return decoratorMemberExpression_sempred((DecoratorMemberExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 60);
		case 1:
			return precpred(_ctx, 42);
		case 2:
			return precpred(_ctx, 41);
		case 3:
			return precpred(_ctx, 40);
		case 4:
			return precpred(_ctx, 39);
		case 5:
			return precpred(_ctx, 38);
		case 6:
			return precpred(_ctx, 37);
		case 7:
			return precpred(_ctx, 36);
		case 8:
			return precpred(_ctx, 35);
		case 9:
			return precpred(_ctx, 34);
		case 10:
			return precpred(_ctx, 33);
		case 11:
			return precpred(_ctx, 32);
		case 12:
			return precpred(_ctx, 31);
		case 13:
			return precpred(_ctx, 30);
		case 14:
			return precpred(_ctx, 29);
		case 15:
			return precpred(_ctx, 28);
		case 16:
			return precpred(_ctx, 27);
		case 17:
			return precpred(_ctx, 26);
		case 18:
			return precpred(_ctx, 25);
		case 19:
			return precpred(_ctx, 61);
		case 20:
			return precpred(_ctx, 59);
		case 21:
			return precpred(_ctx, 58);
		case 22:
			return precpred(_ctx, 55);
		case 23:
			return precpred(_ctx, 54);
		case 24:
			return precpred(_ctx, 53);
		case 25:
			return precpred(_ctx, 14);
		case 26:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean primaryType_sempred(PrimaryTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean decoratorMemberExpression_sempred(DecoratorMemberExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00bc\u0786\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0001\u0000\u0003\u0000\u0104\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0004\u0001\u0109\b\u0001\u000b\u0001\f\u0001\u010a\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0121\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0125\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u012b\b\u0004\u0001\u0004\u0003\u0004\u012e\b\u0004\u0001\u0004\u0003"+
		"\u0004\u0131\b\u0004\u0001\u0004\u0003\u0004\u0134\b\u0004\u0001\u0004"+
		"\u0003\u0004\u0137\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u013b\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u013f\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0143\b\u0004\u0003\u0004\u0145\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u014c\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0150\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0159\b\u0006\u0001\u0007\u0003\u0007\u015c\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0160\b\u0007\u0003\u0007\u0162\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0165\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u016a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003\b\u0170"+
		"\b\b\u0001\b\u0003\b\u0173\b\b\u0001\t\u0001\t\u0005\t\u0177\b\t\n\t\f"+
		"\t\u017a\t\t\u0001\t\u0001\t\u0001\n\u0003\n\u017f\b\n\u0001\n\u0001\n"+
		"\u0003\n\u0183\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u018c\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u01b7\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u01c8\b\u000b\n\u000b\f\u000b\u01cb\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u01e0\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u01e9\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u01f5\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0201\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0208\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0210\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u021c\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u022f"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u023b"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0240\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0245\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0004\u0011\u024a\b\u0011\u000b\u0011\f\u0011"+
		"\u024b\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0253\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u0258"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u025c\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0263\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0269\b\u0014"+
		"\n\u0014\f\u0014\u026c\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0270"+
		"\b\u0014\u0003\u0014\u0272\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0279\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u027d\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0286\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u028a\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0292\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u029a\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u029e\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u02a4\b\u001d\n"+
		"\u001d\f\u001d\u02a7\t\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u02ab"+
		"\b\u001d\u0003\u001d\u02ad\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u02b4\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u02b9\b\u001f\u0001 \u0003 \u02bc\b \u0001 \u0001"+
		" \u0003 \u02c0\b \u0001 \u0001 \u0005 \u02c4\b \n \f \u02c7\t \u0001!"+
		"\u0001!\u0001!\u0003!\u02cc\b!\u0001!\u0003!\u02cf\b!\u0001!\u0003!\u02d2"+
		"\b!\u0001!\u0001!\u0003!\u02d6\b!\u0001!\u0003!\u02d9\b!\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0003#\u02df\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u02e8\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u02fb\b%\u0001%\u0001%\u0003%\u02ff\b%\u0001%\u0001%\u0003%\u0303"+
		"\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u030d"+
		"\b%\u0001%\u0001%\u0003%\u0311\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0329\b%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u0331\b%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u0338\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u0341\b%\u0001%\u0001%\u0001%\u0003%\u0346\b%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0003\'\u034c\b\'\u0001\'\u0001\'\u0001(\u0001(\u0003(\u0352"+
		"\b(\u0001(\u0001(\u0001)\u0001)\u0003)\u0358\b)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u0361\b)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0003+\u036b\b+\u0001+\u0001+\u0003+\u036f\b+\u0003"+
		"+\u0371\b+\u0001+\u0001+\u0001,\u0004,\u0376\b,\u000b,\f,\u0377\u0001"+
		"-\u0001-\u0001-\u0001-\u0003-\u037e\b-\u0001.\u0001.\u0001.\u0003.\u0383"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00030\u038d"+
		"\b0\u00010\u00030\u0390\b0\u00011\u00011\u00011\u00011\u00031\u0396\b"+
		"1\u00011\u00011\u00031\u039a\b1\u00011\u00011\u00012\u00012\u00012\u0001"+
		"3\u00013\u00013\u00014\u00014\u00014\u00015\u00015\u00035\u03a9\b5\u0001"+
		"5\u00015\u00015\u00035\u03ae\b5\u00016\u00016\u00016\u00036\u03b3\b6\u0001"+
		"6\u00036\u03b6\b6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00036\u03c2\b6\u00016\u00036\u03c5\b6\u00017\u00037\u03c8"+
		"\b7\u00017\u00037\u03cb\b7\u00017\u00037\u03ce\b7\u00017\u00037\u03d1"+
		"\b7\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00059\u03da\b9\n"+
		"9\f9\u03dd\t9\u00019\u00039\u03e0\b9\u00019\u00019\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0003:\u03e9\b:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		";\u0001;\u0001;\u0005;\u03f3\b;\n;\f;\u03f6\t;\u0001;\u0001;\u0003;\u03fa"+
		"\b;\u0001;\u0003;\u03fd\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0404"+
		"\b;\u0003;\u0406\b;\u0001<\u0003<\u0409\b<\u0001<\u0003<\u040c\b<\u0001"+
		"<\u0001<\u0003<\u0410\b<\u0001<\u0003<\u0413\b<\u0001<\u0001<\u0003<\u0417"+
		"\b<\u0001=\u0001=\u0001=\u0003=\u041c\b=\u0001>\u0003>\u041f\b>\u0001"+
		"?\u0005?\u0422\b?\n?\f?\u0425\t?\u0001?\u0003?\u0428\b?\u0001?\u0004?"+
		"\u042b\b?\u000b?\f?\u042c\u0001?\u0005?\u0430\b?\n?\f?\u0433\t?\u0001"+
		"?\u0005?\u0436\b?\n?\f?\u0439\t?\u0001@\u0003@\u043c\b@\u0001@\u0001@"+
		"\u0003@\u0440\b@\u0001@\u0003@\u0443\b@\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u0451\bA\u0001"+
		"A\u0001A\u0003A\u0455\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0003B\u045e\bB\u0001C\u0001C\u0001C\u0003C\u0463\bC\u0003C\u0465\b"+
		"C\u0001C\u0001C\u0001D\u0001D\u0001D\u0005D\u046c\bD\nD\fD\u046f\tD\u0001"+
		"E\u0003E\u0472\bE\u0001E\u0001E\u0003E\u0476\bE\u0001F\u0001F\u0001F\u0005"+
		"F\u047b\bF\nF\fF\u047e\tF\u0001G\u0001G\u0001G\u0003G\u0483\bG\u0001G"+
		"\u0003G\u0486\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u048e"+
		"\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0495\bG\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0003G\u04ae\bG\u0001G\u0001G\u0003G\u04b2\bG\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u04bf\bG\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u04e8"+
		"\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0005G\u04f7\bG\nG\fG\u04fa\tG\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0505\bG\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0510\bG\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0518\bG\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003"+
		"G\u0530\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0560\bG\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0568\bG\u0001G\u0001G\u0003"+
		"G\u056c\bG\u0001G\u0001G\u0003G\u0570\bG\u0001G\u0001G\u0003G\u0574\b"+
		"G\u0001G\u0001G\u0003G\u0578\bG\u0001G\u0001G\u0003G\u057c\bG\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0005"+
		"G\u0589\bG\nG\fG\u058c\tG\u0001H\u0004H\u058f\bH\u000bH\fH\u0590\u0001"+
		"I\u0001I\u0001I\u0005I\u0596\bI\nI\fI\u0599\tI\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0005I\u05a5\bI\nI\fI\u05a8"+
		"\tI\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0005I\u05b1\bI\n"+
		"I\fI\u05b4\tI\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0005I\u05bc\b"+
		"I\nI\fI\u05bf\tI\u0001I\u0001I\u0003I\u05c3\bI\u0001J\u0001J\u0003J\u05c7"+
		"\bJ\u0001J\u0004J\u05ca\bJ\u000bJ\fJ\u05cb\u0003J\u05ce\bJ\u0005J\u05d0"+
		"\bJ\nJ\fJ\u05d3\tJ\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001M\u0001"+
		"M\u0001N\u0001N\u0001N\u0001N\u0003N\u05e1\bN\u0001O\u0003O\u05e4\bO\u0001"+
		"O\u0001O\u0003O\u05e8\bO\u0001O\u0001O\u0003O\u05ec\bO\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u0601\bO\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0005P\u0608\bP\nP\fP\u060b\tP\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u0615\bP\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0003Q\u061b\bQ\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0003S\u0626\bS\u0001T\u0001T\u0001T\u0003T\u062b\bT\u0001"+
		"T\u0003T\u062e\bT\u0001U\u0001U\u0001U\u0001U\u0003U\u0634\bU\u0001V\u0001"+
		"V\u0001V\u0001V\u0001W\u0001W\u0001W\u0001W\u0005W\u063e\bW\nW\fW\u0641"+
		"\tW\u0001W\u0003W\u0644\bW\u0003W\u0646\bW\u0001W\u0001W\u0001X\u0001"+
		"X\u0001Y\u0001Y\u0001Y\u0001Y\u0003Y\u0650\bY\u0001Z\u0001Z\u0001[\u0001"+
		"[\u0003[\u0656\b[\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0003]\u065d\b"+
		"]\u0001^\u0001^\u0003^\u0661\b^\u0001_\u0001_\u0003_\u0665\b_\u0001_\u0001"+
		"_\u0001`\u0001`\u0001`\u0005`\u066c\b`\n`\f`\u066f\t`\u0001a\u0001a\u0003"+
		"a\u0673\ba\u0001a\u0001a\u0001a\u0001a\u0001a\u0003a\u067a\ba\u0001b\u0001"+
		"b\u0001b\u0001c\u0001c\u0003c\u0681\bc\u0001c\u0001c\u0001d\u0001d\u0001"+
		"d\u0005d\u0688\bd\nd\fd\u068b\td\u0001e\u0001e\u0001f\u0003f\u0690\bf"+
		"\u0001f\u0001f\u0001f\u0001f\u0003f\u0696\bf\u0001g\u0001g\u0001h\u0001"+
		"h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001"+
		"h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0003h\u06ac\bh\u0001h\u0001"+
		"h\u0001h\u0003h\u06b1\bh\u0001h\u0005h\u06b4\bh\nh\fh\u06b7\th\u0001i"+
		"\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u06c2"+
		"\bi\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0003i\u06d2\bi\u0001j\u0001j\u0003j\u06d6"+
		"\bj\u0001k\u0001k\u0001k\u0003k\u06db\bk\u0001k\u0001k\u0001l\u0001l\u0003"+
		"l\u06e1\bl\u0001m\u0001m\u0001m\u0005m\u06e6\bm\nm\fm\u06e9\tm\u0001m"+
		"\u0003m\u06ec\bm\u0001n\u0003n\u06ef\bn\u0001n\u0001n\u0003n\u06f3\bn"+
		"\u0001n\u0001n\u0001n\u0001n\u0001o\u0001o\u0003o\u06fb\bo\u0001o\u0001"+
		"o\u0003o\u06ff\bo\u0001o\u0001o\u0001o\u0001o\u0001p\u0001p\u0001p\u0001"+
		"q\u0003q\u0709\bq\u0001q\u0001q\u0003q\u070d\bq\u0001q\u0001q\u0003q\u0711"+
		"\bq\u0001r\u0001r\u0001r\u0001r\u0005r\u0717\br\nr\fr\u071a\tr\u0001r"+
		"\u0001r\u0003r\u071e\br\u0001r\u0003r\u0721\br\u0003r\u0723\br\u0001s"+
		"\u0001s\u0001t\u0001t\u0001t\u0003t\u072a\bt\u0001u\u0003u\u072d\bu\u0001"+
		"u\u0003u\u0730\bu\u0001u\u0001u\u0003u\u0734\bu\u0001v\u0001v\u0001w\u0001"+
		"w\u0003w\u073a\bw\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"y\u0003y\u0744\by\u0001y\u0001y\u0001y\u0003y\u0749\by\u0001y\u0001y\u0001"+
		"y\u0001y\u0001y\u0001y\u0003y\u0751\by\u0001z\u0001z\u0001z\u0005z\u0756"+
		"\bz\nz\fz\u0759\tz\u0001{\u0001{\u0004{\u075d\b{\u000b{\f{\u075e\u0001"+
		"{\u0005{\u0762\b{\n{\f{\u0765\t{\u0001|\u0004|\u0768\b|\u000b|\f|\u0769"+
		"\u0001}\u0001}\u0001}\u0003}\u076f\b}\u0001~\u0001~\u0001~\u0001~\u0001"+
		"~\u0001~\u0003~\u0777\b~\u0001~\u0001~\u0001~\u0005~\u077c\b~\n~\f~\u077f"+
		"\t~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u0080\u0001\u0080\u0001"+
		"\u0080\u0000\u0003\u008e\u00d0\u00fc\u0081\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0000"+
		"\u000f\u0006\u0000>]_mooqryy|}\u0002\u0000\\]\u00ae\u00ae\u0003\u0000"+
		"EEccgg\u0002\u0000\u000b\u000b\u000e\u000e\u0001\u0000\u0017\u0019\u0001"+
		"\u0000\u0013\u0014\u0001\u0000\u001e!\u0001\u0000\"%\u0002\u0000\u0007"+
		"\u0007\u001e\u001e\u0001\u0000+7\u0007\u0000XY[[]]n{\u007f\u007f\u0081"+
		"\u00ac\u00ae\u00ae\u0002\u0000&&((\u0002\u0000hill\u0002\u0000oorr\u0001"+
		"\u0001\t\t\u0889\u0000\u0103\u0001\u0000\u0000\u0000\u0002\u0108\u0001"+
		"\u0000\u0000\u0000\u0004\u0120\u0001\u0000\u0000\u0000\u0006\u0122\u0001"+
		"\u0000\u0000\u0000\b\u0144\u0001\u0000\u0000\u0000\n\u0146\u0001\u0000"+
		"\u0000\u0000\f\u0158\u0001\u0000\u0000\u0000\u000e\u015b\u0001\u0000\u0000"+
		"\u0000\u0010\u016f\u0001\u0000\u0000\u0000\u0012\u0174\u0001\u0000\u0000"+
		"\u0000\u0014\u017e\u0001\u0000\u0000\u0000\u0016\u01df\u0001\u0000\u0000"+
		"\u0000\u0018\u0200\u0001\u0000\u0000\u0000\u001a\u021b\u0001\u0000\u0000"+
		"\u0000\u001c\u023f\u0001\u0000\u0000\u0000\u001e\u0244\u0001\u0000\u0000"+
		"\u0000 \u0246\u0001\u0000\u0000\u0000\"\u0249\u0001\u0000\u0000\u0000"+
		"$\u024d\u0001\u0000\u0000\u0000&\u0262\u0001\u0000\u0000\u0000(\u0264"+
		"\u0001\u0000\u0000\u0000*\u0275\u0001\u0000\u0000\u0000,\u027c\u0001\u0000"+
		"\u0000\u0000.\u027e\u0001\u0000\u0000\u00000\u0280\u0001\u0000\u0000\u0000"+
		"2\u0285\u0001\u0000\u0000\u00004\u028b\u0001\u0000\u0000\u00006\u028e"+
		"\u0001\u0000\u0000\u00008\u029d\u0001\u0000\u0000\u0000:\u029f\u0001\u0000"+
		"\u0000\u0000<\u02b0\u0001\u0000\u0000\u0000>\u02b8\u0001\u0000\u0000\u0000"+
		"@\u02bb\u0001\u0000\u0000\u0000B\u02cb\u0001\u0000\u0000\u0000D\u02da"+
		"\u0001\u0000\u0000\u0000F\u02dc\u0001\u0000\u0000\u0000H\u02e0\u0001\u0000"+
		"\u0000\u0000J\u0345\u0001\u0000\u0000\u0000L\u0347\u0001\u0000\u0000\u0000"+
		"N\u0349\u0001\u0000\u0000\u0000P\u034f\u0001\u0000\u0000\u0000R\u0360"+
		"\u0001\u0000\u0000\u0000T\u0362\u0001\u0000\u0000\u0000V\u0368\u0001\u0000"+
		"\u0000\u0000X\u0375\u0001\u0000\u0000\u0000Z\u0379\u0001\u0000\u0000\u0000"+
		"\\\u037f\u0001\u0000\u0000\u0000^\u0384\u0001\u0000\u0000\u0000`\u0388"+
		"\u0001\u0000\u0000\u0000b\u0391\u0001\u0000\u0000\u0000d\u039d\u0001\u0000"+
		"\u0000\u0000f\u03a0\u0001\u0000\u0000\u0000h\u03a3\u0001\u0000\u0000\u0000"+
		"j\u03ad\u0001\u0000\u0000\u0000l\u03c4\u0001\u0000\u0000\u0000n\u03c7"+
		"\u0001\u0000\u0000\u0000p\u03d2\u0001\u0000\u0000\u0000r\u03d5\u0001\u0000"+
		"\u0000\u0000t\u03e3\u0001\u0000\u0000\u0000v\u0405\u0001\u0000\u0000\u0000"+
		"x\u0408\u0001\u0000\u0000\u0000z\u0418\u0001\u0000\u0000\u0000|\u041e"+
		"\u0001\u0000\u0000\u0000~\u0423\u0001\u0000\u0000\u0000\u0080\u043b\u0001"+
		"\u0000\u0000\u0000\u0082\u0454\u0001\u0000\u0000\u0000\u0084\u045d\u0001"+
		"\u0000\u0000\u0000\u0086\u045f\u0001\u0000\u0000\u0000\u0088\u0468\u0001"+
		"\u0000\u0000\u0000\u008a\u0471\u0001\u0000\u0000\u0000\u008c\u0477\u0001"+
		"\u0000\u0000\u0000\u008e\u0517\u0001\u0000\u0000\u0000\u0090\u058e\u0001"+
		"\u0000\u0000\u0000\u0092\u05c2\u0001\u0000\u0000\u0000\u0094\u05d1\u0001"+
		"\u0000\u0000\u0000\u0096\u05d4\u0001\u0000\u0000\u0000\u0098\u05d8\u0001"+
		"\u0000\u0000\u0000\u009a\u05da\u0001\u0000\u0000\u0000\u009c\u05e0\u0001"+
		"\u0000\u0000\u0000\u009e\u0600\u0001\u0000\u0000\u0000\u00a0\u0614\u0001"+
		"\u0000\u0000\u0000\u00a2\u061a\u0001\u0000\u0000\u0000\u00a4\u061c\u0001"+
		"\u0000\u0000\u0000\u00a6\u0625\u0001\u0000\u0000\u0000\u00a8\u062d\u0001"+
		"\u0000\u0000\u0000\u00aa\u0633\u0001\u0000\u0000\u0000\u00ac\u0635\u0001"+
		"\u0000\u0000\u0000\u00ae\u0639\u0001\u0000\u0000\u0000\u00b0\u0649\u0001"+
		"\u0000\u0000\u0000\u00b2\u064f\u0001\u0000\u0000\u0000\u00b4\u0651\u0001"+
		"\u0000\u0000\u0000\u00b6\u0655\u0001\u0000\u0000\u0000\u00b8\u0657\u0001"+
		"\u0000\u0000\u0000\u00ba\u065c\u0001\u0000\u0000\u0000\u00bc\u0660\u0001"+
		"\u0000\u0000\u0000\u00be\u0662\u0001\u0000\u0000\u0000\u00c0\u0668\u0001"+
		"\u0000\u0000\u0000\u00c2\u0679\u0001\u0000\u0000\u0000\u00c4\u067b\u0001"+
		"\u0000\u0000\u0000\u00c6\u067e\u0001\u0000\u0000\u0000\u00c8\u0684\u0001"+
		"\u0000\u0000\u0000\u00ca\u068c\u0001\u0000\u0000\u0000\u00cc\u0695\u0001"+
		"\u0000\u0000\u0000\u00ce\u0697\u0001\u0000\u0000\u0000\u00d0\u06ab\u0001"+
		"\u0000\u0000\u0000\u00d2\u06d1\u0001\u0000\u0000\u0000\u00d4\u06d3\u0001"+
		"\u0000\u0000\u0000\u00d6\u06d7\u0001\u0000\u0000\u0000\u00d8\u06e0\u0001"+
		"\u0000\u0000\u0000\u00da\u06e2\u0001\u0000\u0000\u0000\u00dc\u06ee\u0001"+
		"\u0000\u0000\u0000\u00de\u06f8\u0001\u0000\u0000\u0000\u00e0\u0704\u0001"+
		"\u0000\u0000\u0000\u00e2\u0708\u0001\u0000\u0000\u0000\u00e4\u0722\u0001"+
		"\u0000\u0000\u0000\u00e6\u0724\u0001\u0000\u0000\u0000\u00e8\u0726\u0001"+
		"\u0000\u0000\u0000\u00ea\u072c\u0001\u0000\u0000\u0000\u00ec\u0735\u0001"+
		"\u0000\u0000\u0000\u00ee\u0739\u0001\u0000\u0000\u0000\u00f0\u073b\u0001"+
		"\u0000\u0000\u0000\u00f2\u0743\u0001\u0000\u0000\u0000\u00f4\u0752\u0001"+
		"\u0000\u0000\u0000\u00f6\u075a\u0001\u0000\u0000\u0000\u00f8\u0767\u0001"+
		"\u0000\u0000\u0000\u00fa\u076b\u0001\u0000\u0000\u0000\u00fc\u0776\u0001"+
		"\u0000\u0000\u0000\u00fe\u0780\u0001\u0000\u0000\u0000\u0100\u0783\u0001"+
		"\u0000\u0000\u0000\u0102\u0104\u0003\u0002\u0001\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005\u0000\u0000\u0001\u0106\u0001\u0001"+
		"\u0000\u0000\u0000\u0107\u0109\u0003\u0004\u0002\u0000\u0108\u0107\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0003\u0001"+
		"\u0000\u0000\u0000\u010c\u0121\u0003\u0006\u0003\u0000\u010d\u0121\u0003"+
		"\b\u0004\u0000\u010e\u0121\u0003\n\u0005\u0000\u010f\u0121\u0003\f\u0006"+
		"\u0000\u0110\u0121\u0003D\"\u0000\u0111\u0121\u0003\u000e\u0007\u0000"+
		"\u0112\u0121\u0003\u0014\n\u0000\u0113\u0121\u0003F#\u0000\u0114\u0121"+
		"\u0003H$\u0000\u0115\u0121\u0003J%\u0000\u0116\u0121\u0003N\'\u0000\u0117"+
		"\u0121\u0003P(\u0000\u0118\u0121\u0003R)\u0000\u0119\u0121\u0003T*\u0000"+
		"\u011a\u0121\u0003^/\u0000\u011b\u0121\u0003`0\u0000\u011c\u0121\u0003"+
		"\u0016\u000b\u0000\u011d\u0121\u0003\u0018\f\u0000\u011e\u0121\u0003\u001a"+
		"\r\u0000\u011f\u0121\u0003\u001c\u000e\u0000\u0120\u010c\u0001\u0000\u0000"+
		"\u0000\u0120\u010d\u0001\u0000\u0000\u0000\u0120\u010e\u0001\u0000\u0000"+
		"\u0000\u0120\u010f\u0001\u0000\u0000\u0000\u0120\u0110\u0001\u0000\u0000"+
		"\u0000\u0120\u0111\u0001\u0000\u0000\u0000\u0120\u0112\u0001\u0000\u0000"+
		"\u0000\u0120\u0113\u0001\u0000\u0000\u0000\u0120\u0114\u0001\u0000\u0000"+
		"\u0000\u0120\u0115\u0001\u0000\u0000\u0000\u0120\u0116\u0001\u0000\u0000"+
		"\u0000\u0120\u0117\u0001\u0000\u0000\u0000\u0120\u0118\u0001\u0000\u0000"+
		"\u0000\u0120\u0119\u0001\u0000\u0000\u0000\u0120\u011a\u0001\u0000\u0000"+
		"\u0000\u0120\u011b\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000"+
		"\u0000\u0120\u011d\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0005\u0001\u0000\u0000"+
		"\u0000\u0122\u0124\u0005\u0007\u0000\u0000\u0123\u0125\u0003\"\u0011\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0005\b\u0000\u0000\u0127"+
		"\u0007\u0001\u0000\u0000\u0000\u0128\u012a\u0003\u00bc^\u0000\u0129\u012b"+
		"\u0003\u00e0p\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001"+
		"\u0000\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012e\u0005"+
		"\t\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000"+
		"\u0000\u0000\u012e\u0145\u0001\u0000\u0000\u0000\u012f\u0131\u0003\u00ec"+
		"v\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0134\u0003L&\u0000\u0133"+
		"\u0132\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u0136\u0001\u0000\u0000\u0000\u0135\u0137\u0005Z\u0000\u0000\u0136\u0135"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u013a\u0003@ \u0000\u0139\u013b\u0005\t"+
		"\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u0145\u0001\u0000\u0000\u0000\u013c\u013e\u0005~\u0000"+
		"\u0000\u013d\u013f\u0003L&\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		"\u0142\u0003@ \u0000\u0141\u0143\u0005\t\u0000\u0000\u0142\u0141\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001"+
		"\u0000\u0000\u0000\u0144\u0128\u0001\u0000\u0000\u0000\u0144\u0130\u0001"+
		"\u0000\u0000\u0000\u0144\u013c\u0001\u0000\u0000\u0000\u0145\t\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005e\u0000\u0000\u0147\u0148\u0003&\u0013\u0000"+
		"\u0148\u000b\u0001\u0000\u0000\u0000\u0149\u014b\u0005d\u0000\u0000\u014a"+
		"\u014c\u0005R\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u0150"+
		"\u00038\u001c\u0000\u014e\u0150\u0003>\u001f\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0003\u0100\u0080\u0000\u0152\u0159\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0005d\u0000\u0000\u0154\u0155\u0005R\u0000\u0000"+
		"\u0155\u0156\u0003\u008eG\u0000\u0156\u0157\u0003\u0100\u0080\u0000\u0157"+
		"\u0159\u0001\u0000\u0000\u0000\u0158\u0149\u0001\u0000\u0000\u0000\u0158"+
		"\u0153\u0001\u0000\u0000\u0000\u0159\r\u0001\u0000\u0000\u0000\u015a\u015c"+
		"\u0003\u00f8|\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001"+
		"\u0000\u0000\u0000\u015c\u0161\u0001\u0000\u0000\u0000\u015d\u015f\u0005"+
		"d\u0000\u0000\u015e\u0160\u0005R\u0000\u0000\u015f\u015e\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162\u0001\u0000\u0000"+
		"\u0000\u0161\u015d\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u0165\u0005\u007f\u0000"+
		"\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0005_\u0000\u0000"+
		"\u0167\u0169\u0003\u00b8\\\u0000\u0168\u016a\u0003\u00be_\u0000\u0169"+
		"\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0003\u0010\b\u0000\u016c\u016d"+
		"\u0003\u0012\t\u0000\u016d\u000f\u0001\u0000\u0000\u0000\u016e\u0170\u0003"+
		"f3\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u0173\u0003h4\u0000\u0172"+
		"\u0171\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173"+
		"\u0011\u0001\u0000\u0000\u0000\u0174\u0178\u0005\u0007\u0000\u0000\u0175"+
		"\u0177\u0003j5\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u017a\u0001"+
		"\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001"+
		"\u0000\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u0178\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0005\b\u0000\u0000\u017c\u0013\u0001\u0000"+
		"\u0000\u0000\u017d\u017f\u0005[\u0000\u0000\u017e\u017d\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"+
		"\u0000\u0180\u0182\u0005O\u0000\u0000\u0181\u0183\u0005\u0017\u0000\u0000"+
		"\u0182\u0181\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0003\u00b8\\\u0000\u0185"+
		"\u018b\u0003\u00e2q\u0000\u0186\u0187\u0005\u0007\u0000\u0000\u0187\u0188"+
		"\u0003|>\u0000\u0188\u0189\u0005\b\u0000\u0000\u0189\u018c\u0001\u0000"+
		"\u0000\u0000\u018a\u018c\u0005\t\u0000\u0000\u018b\u0186\u0001\u0000\u0000"+
		"\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u0015\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u0005\u008f\u0000\u0000\u018e\u018f\u0005\u001e\u0000"+
		"\u0000\u018f\u0190\u0003\u00ccf\u0000\u0190\u0191\u0005\u001f\u0000\u0000"+
		"\u0191\u0192\u0005\u0005\u0000\u0000\u0192\u0193\u0003\u008eG\u0000\u0193"+
		"\u0194\u0005\u0006\u0000\u0000\u0194\u0195\u0003\u0100\u0080\u0000\u0195"+
		"\u01e0\u0001\u0000\u0000\u0000\u0196\u0197\u0005\u0092\u0000\u0000\u0197"+
		"\u0198\u0005\u001e\u0000\u0000\u0198\u0199\u0003\u00ccf\u0000\u0199\u019a"+
		"\u0005\u001f\u0000\u0000\u019a\u019b\u0005\u0005\u0000\u0000\u019b\u019c"+
		"\u0003\u008eG\u0000\u019c\u019d\u0005\u0006\u0000\u0000\u019d\u019e\u0003"+
		"\u0100\u0080\u0000\u019e\u01e0\u0001\u0000\u0000\u0000\u019f\u01a0\u0005"+
		"\u0094\u0000\u0000\u01a0\u01a1\u0005\u001e\u0000\u0000\u01a1\u01a2\u0003"+
		"\u00ccf\u0000\u01a2\u01a3\u0005\u001f\u0000\u0000\u01a3\u01a4\u0005\u0005"+
		"\u0000\u0000\u01a4\u01a5\u0003\u008eG\u0000\u01a5\u01a6\u0005\u0006\u0000"+
		"\u0000\u01a6\u01a7\u0003\u0100\u0080\u0000\u01a7\u01e0\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0005\u0095\u0000\u0000\u01a9\u01aa\u0005\u001e\u0000"+
		"\u0000\u01aa\u01ab\u0003\u00ccf\u0000\u01ab\u01ac\u0005\u001f\u0000\u0000"+
		"\u01ac\u01ad\u0005\u0005\u0000\u0000\u01ad\u01ae\u0003\u008eG\u0000\u01ae"+
		"\u01af\u0005\u0006\u0000\u0000\u01af\u01b0\u0003\u0100\u0080\u0000\u01b0"+
		"\u01e0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005\u0083\u0000\u0000\u01b2"+
		"\u01b3\u0005\u0005\u0000\u0000\u01b3\u01b6\u0005\u00b0\u0000\u0000\u01b4"+
		"\u01b5\u0005\n\u0000\u0000\u01b5\u01b7\u0003\u00aeW\u0000\u01b6\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u0006\u0000\u0000\u01b9\u01e0"+
		"\u0003\u0100\u0080\u0000\u01ba\u01bb\u0005\u0084\u0000\u0000\u01bb\u01bc"+
		"\u0005\u0005\u0000\u0000\u01bc\u01bd\u0003\u00b8\\\u0000\u01bd\u01be\u0005"+
		"\n\u0000\u0000\u01be\u01bf\u0003\u008eG\u0000\u01bf\u01c0\u0005\u0006"+
		"\u0000\u0000\u01c0\u01c1\u0003\u0100\u0080\u0000\u01c1\u01e0\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u0005\u0085\u0000\u0000\u01c3\u01c4\u0005\u0005"+
		"\u0000\u0000\u01c4\u01c9\u0003\u008eG\u0000\u01c5\u01c6\u0005\n\u0000"+
		"\u0000\u01c6\u01c8\u0003\u008eG\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005\u0006\u0000\u0000"+
		"\u01cd\u01ce\u0003\u0100\u0080\u0000\u01ce\u01e0\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d0\u0005\u008d\u0000\u0000\u01d0\u01d1\u0005\u0010\u0000\u0000"+
		"\u01d1\u01d2\u0005\u008a\u0000\u0000\u01d2\u01d3\u0005\u0005\u0000\u0000"+
		"\u01d3\u01d4\u0003\u008eG\u0000\u01d4\u01d5\u0005\u0006\u0000\u0000\u01d5"+
		"\u01d6\u0003\u0100\u0080\u0000\u01d6\u01e0\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0005\u008d\u0000\u0000\u01d8\u01d9\u0005\u0010\u0000\u0000\u01d9"+
		"\u01da\u0005\u008b\u0000\u0000\u01da\u01db\u0005\u0005\u0000\u0000\u01db"+
		"\u01dc\u0003\u008eG\u0000\u01dc\u01dd\u0005\u0006\u0000\u0000\u01dd\u01de"+
		"\u0003\u0100\u0080\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u018d"+
		"\u0001\u0000\u0000\u0000\u01df\u0196\u0001\u0000\u0000\u0000\u01df\u019f"+
		"\u0001\u0000\u0000\u0000\u01df\u01a8\u0001\u0000\u0000\u0000\u01df\u01b1"+
		"\u0001\u0000\u0000\u0000\u01df\u01ba\u0001\u0000\u0000\u0000\u01df\u01c2"+
		"\u0001\u0000\u0000\u0000\u01df\u01cf\u0001\u0000\u0000\u0000\u01df\u01d7"+
		"\u0001\u0000\u0000\u0000\u01e0\u0017\u0001\u0000\u0000\u0000\u01e1\u01e2"+
		"\u0005\u0097\u0000\u0000\u01e2\u01e3\u0005\u0010\u0000\u0000\u01e3\u01e4"+
		"\u0005\u008c\u0000\u0000\u01e4\u01e5\u0005\u0005\u0000\u0000\u01e5\u01e8"+
		"\u0003\u00acV\u0000\u01e6\u01e7\u0005\n\u0000\u0000\u01e7\u01e9\u0003"+
		"\u00aeW\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005\u0006"+
		"\u0000\u0000\u01eb\u01ec\u0003\u0100\u0080\u0000\u01ec\u0201\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0005\u0097\u0000\u0000\u01ee\u01ef\u0005\u0010"+
		"\u0000\u0000\u01ef\u01f0\u0005\u0087\u0000\u0000\u01f0\u01f1\u0005\u0005"+
		"\u0000\u0000\u01f1\u01f4\u0005\u00b0\u0000\u0000\u01f2\u01f3\u0005\n\u0000"+
		"\u0000\u01f3\u01f5\u0003\u00aeW\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f7\u0005\u0006\u0000\u0000\u01f7\u0201\u0003\u0100\u0080\u0000"+
		"\u01f8\u01f9\u0005\u0003\u0000\u0000\u01f9\u01fa\u0005\u009c\u0000\u0000"+
		"\u01fa\u01fb\u0005\u0004\u0000\u0000\u01fb\u01fc\u0005\u000b\u0000\u0000"+
		"\u01fc\u0201\u0005\u00b0\u0000\u0000\u01fd\u01fe\u0005\u009d\u0000\u0000"+
		"\u01fe\u01ff\u0005\u000b\u0000\u0000\u01ff\u0201\u0005\u00b0\u0000\u0000"+
		"\u0200\u01e1\u0001\u0000\u0000\u0000\u0200\u01ed\u0001\u0000\u0000\u0000"+
		"\u0200\u01f8\u0001\u0000\u0000\u0000\u0200\u01fd\u0001\u0000\u0000\u0000"+
		"\u0201\u0019\u0001\u0000\u0000\u0000\u0202\u0203\u0005\u00aa\u0000\u0000"+
		"\u0203\u0204\u0005\u0005\u0000\u0000\u0204\u0205\u0003\u00b8\\\u0000\u0205"+
		"\u0207\u0005\u0006\u0000\u0000\u0206\u0208\u0003\u00e0p\u0000\u0207\u0206"+
		"\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0001\u0000\u0000\u0000\u0209\u020a\u0003\u0100\u0080\u0000\u020a\u021c"+
		"\u0001\u0000\u0000\u0000\u020b\u020c\u0005\u00ad\u0000\u0000\u020c\u020d"+
		"\u0005\u008e\u0000\u0000\u020d\u020f\u0005\u0005\u0000\u0000\u020e\u0210"+
		"\u0003\u00aeW\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001"+
		"\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0212\u0005"+
		"\u0006\u0000\u0000\u0212\u021c\u0003\u0100\u0080\u0000\u0213\u0214\u0003"+
		"\u00b8\\\u0000\u0214\u0215\u0005\u000b\u0000\u0000\u0215\u0216\u0005\u00aa"+
		"\u0000\u0000\u0216\u0217\u0005\u0005\u0000\u0000\u0217\u0218\u0003\u00b8"+
		"\\\u0000\u0218\u0219\u0005\u0006\u0000\u0000\u0219\u021a\u0003\u0100\u0080"+
		"\u0000\u021a\u021c\u0001\u0000\u0000\u0000\u021b\u0202\u0001\u0000\u0000"+
		"\u0000\u021b\u020b\u0001\u0000\u0000\u0000\u021b\u0213\u0001\u0000\u0000"+
		"\u0000\u021c\u001b\u0001\u0000\u0000\u0000\u021d\u021e\u0005\u009a\u0000"+
		"\u0000\u021e\u021f\u0005\u000b\u0000\u0000\u021f\u0220\u0003\u00acV\u0000"+
		"\u0220\u0221\u0003\u0100\u0080\u0000\u0221\u0240\u0001\u0000\u0000\u0000"+
		"\u0222\u0223\u0005\u0099\u0000\u0000\u0223\u0224\u0005\u000b\u0000\u0000"+
		"\u0224\u0225\u0003\u00aeW\u0000\u0225\u0226\u0003\u0100\u0080\u0000\u0226"+
		"\u0240\u0001\u0000\u0000\u0000\u0227\u0228\u0005\u0086\u0000\u0000\u0228"+
		"\u0229\u0005\u0010\u0000\u0000\u0229\u022a\u0005\u0088\u0000\u0000\u022a"+
		"\u022b\u0005\u0005\u0000\u0000\u022b\u022e\u0003\u00acV\u0000\u022c\u022d"+
		"\u0005\n\u0000\u0000\u022d\u022f\u0003\u00aeW\u0000\u022e\u022c\u0001"+
		"\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0001"+
		"\u0000\u0000\u0000\u0230\u0231\u0005\u0006\u0000\u0000\u0231\u0232\u0003"+
		"\u0100\u0080\u0000\u0232\u0240\u0001\u0000\u0000\u0000\u0233\u0234\u0005"+
		"\u0086\u0000\u0000\u0234\u0235\u0005\u0010\u0000\u0000\u0235\u0236\u0005"+
		"\u0089\u0000\u0000\u0236\u0237\u0005\u0005\u0000\u0000\u0237\u023a\u0003"+
		"\u00acV\u0000\u0238\u0239\u0005\n\u0000\u0000\u0239\u023b\u0003\u00ae"+
		"W\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023d\u0005\u0006\u0000"+
		"\u0000\u023d\u023e\u0003\u0100\u0080\u0000\u023e\u0240\u0001\u0000\u0000"+
		"\u0000\u023f\u021d\u0001\u0000\u0000\u0000\u023f\u0222\u0001\u0000\u0000"+
		"\u0000\u023f\u0227\u0001\u0000\u0000\u0000\u023f\u0233\u0001\u0000\u0000"+
		"\u0000\u0240\u001d\u0001\u0000\u0000\u0000\u0241\u0245\u0003 \u0010\u0000"+
		"\u0242\u0245\u0005;\u0000\u0000\u0243\u0245\u0005<\u0000\u0000\u0244\u0241"+
		"\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0243"+
		"\u0001\u0000\u0000\u0000\u0245\u001f\u0001\u0000\u0000\u0000\u0246\u0247"+
		"\u0007\u0000\u0000\u0000\u0247!\u0001\u0000\u0000\u0000\u0248\u024a\u0003"+
		"\u0004\u0002\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u024a\u024b\u0001"+
		"\u0000\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024c\u0001"+
		"\u0000\u0000\u0000\u024c#\u0001\u0000\u0000\u0000\u024d\u0252\u0005\u007f"+
		"\u0000\u0000\u024e\u024f\u0003\u00b8\\\u0000\u024f\u0250\u0003\u00e2q"+
		"\u0000\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u0253\u0003\b\u0004\u0000"+
		"\u0252\u024e\u0001\u0000\u0000\u0000\u0252\u0251\u0001\u0000\u0000\u0000"+
		"\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0003\u0100\u0080\u0000"+
		"\u0255%\u0001\u0000\u0000\u0000\u0256\u0258\u00030\u0018\u0000\u0257\u0256"+
		"\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u025b"+
		"\u0001\u0000\u0000\u0000\u0259\u025c\u00032\u0019\u0000\u025a\u025c\u0003"+
		"(\u0014\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025a\u0001\u0000"+
		"\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u00034\u001a"+
		"\u0000\u025e\u025f\u0003\u0100\u0080\u0000\u025f\u0263\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u0005\u00b0\u0000\u0000\u0261\u0263\u0003\u0100\u0080"+
		"\u0000\u0262\u0257\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000"+
		"\u0000\u0263\'\u0001\u0000\u0000\u0000\u0264\u026a\u0005\u0007\u0000\u0000"+
		"\u0265\u0266\u0003*\u0015\u0000\u0266\u0267\u0005\n\u0000\u0000\u0267"+
		"\u0269\u0001\u0000\u0000\u0000\u0268\u0265\u0001\u0000\u0000\u0000\u0269"+
		"\u026c\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026a"+
		"\u026b\u0001\u0000\u0000\u0000\u026b\u0271\u0001\u0000\u0000\u0000\u026c"+
		"\u026a\u0001\u0000\u0000\u0000\u026d\u026f\u0003*\u0015\u0000\u026e\u0270"+
		"\u0005\n\u0000\u0000\u026f\u026e\u0001\u0000\u0000\u0000\u026f\u0270\u0001"+
		"\u0000\u0000\u0000\u0270\u0272\u0001\u0000\u0000\u0000\u0271\u026d\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0273\u0001"+
		"\u0000\u0000\u0000\u0273\u0274\u0005\b\u0000\u0000\u0274)\u0001\u0000"+
		"\u0000\u0000\u0275\u0278\u0003,\u0016\u0000\u0276\u0277\u0005X\u0000\u0000"+
		"\u0277\u0279\u0003.\u0017\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0278"+
		"\u0279\u0001\u0000\u0000\u0000\u0279+\u0001\u0000\u0000\u0000\u027a\u027d"+
		"\u0003\u00b6[\u0000\u027b\u027d\u0005\u00b0\u0000\u0000\u027c\u027a\u0001"+
		"\u0000\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027d-\u0001\u0000"+
		"\u0000\u0000\u027e\u027f\u0007\u0001\u0000\u0000\u027f/\u0001\u0000\u0000"+
		"\u0000\u0280\u0281\u00036\u001b\u0000\u0281\u0282\u0005\n\u0000\u0000"+
		"\u02821\u0001\u0000\u0000\u0000\u0283\u0286\u0005\u0017\u0000\u0000\u0284"+
		"\u0286\u0003\u00b6[\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0284"+
		"\u0001\u0000\u0000\u0000\u0286\u0289\u0001\u0000\u0000\u0000\u0287\u0288"+
		"\u0005X\u0000\u0000\u0288\u028a\u0003\u00b6[\u0000\u0289\u0287\u0001\u0000"+
		"\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a3\u0001\u0000\u0000"+
		"\u0000\u028b\u028c\u0005Y\u0000\u0000\u028c\u028d\u0005\u00b0\u0000\u0000"+
		"\u028d5\u0001\u0000\u0000\u0000\u028e\u0291\u0003\u00b6[\u0000\u028f\u0290"+
		"\u0005X\u0000\u0000\u0290\u0292\u0003\u00b6[\u0000\u0291\u028f\u0001\u0000"+
		"\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u02927\u0001\u0000\u0000"+
		"\u0000\u0293\u0294\u00032\u0019\u0000\u0294\u0295\u00034\u001a\u0000\u0295"+
		"\u0296\u0003\u0100\u0080\u0000\u0296\u029e\u0001\u0000\u0000\u0000\u0297"+
		"\u0299\u0003:\u001d\u0000\u0298\u029a\u00034\u001a\u0000\u0299\u0298\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0001"+
		"\u0000\u0000\u0000\u029b\u029c\u0003\u0100\u0080\u0000\u029c\u029e\u0001"+
		"\u0000\u0000\u0000\u029d\u0293\u0001\u0000\u0000\u0000\u029d\u0297\u0001"+
		"\u0000\u0000\u0000\u029e9\u0001\u0000\u0000\u0000\u029f\u02a5\u0005\u0007"+
		"\u0000\u0000\u02a0\u02a1\u0003<\u001e\u0000\u02a1\u02a2\u0005\n\u0000"+
		"\u0000\u02a2\u02a4\u0001\u0000\u0000\u0000\u02a3\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a4\u02a7\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02ac\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a8\u02aa\u0003<\u001e\u0000"+
		"\u02a9\u02ab\u0005\n\u0000\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ad\u0001\u0000\u0000\u0000\u02ac"+
		"\u02a8\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ae\u0001\u0000\u0000\u0000\u02ae\u02af\u0005\b\u0000\u0000\u02af;"+
		"\u0001\u0000\u0000\u0000\u02b0\u02b3\u0003,\u0016\u0000\u02b1\u02b2\u0005"+
		"X\u0000\u0000\u02b2\u02b4\u0003,\u0016\u0000\u02b3\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4=\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b9\u0003\b\u0004\u0000\u02b6\u02b9\u0003\u000e\u0007\u0000\u02b7"+
		"\u02b9\u0003\u0014\n\u0000\u02b8\u02b5\u0001\u0000\u0000\u0000\u02b8\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b9?\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bc\u0005\u0005\u0000\u0000\u02bb\u02ba\u0001"+
		"\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bd\u02bf\u0003B!\u0000\u02be\u02c0\u0005\u0006\u0000"+
		"\u0000\u02bf\u02be\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000"+
		"\u0000\u02c0\u02c5\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005\n\u0000\u0000"+
		"\u02c2\u02c4\u0003B!\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c4\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c6A\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001"+
		"\u0000\u0000\u0000\u02c8\u02cc\u0003\u00ba]\u0000\u02c9\u02cc\u0003\u00ac"+
		"V\u0000\u02ca\u02cc\u0003\u00aeW\u0000\u02cb\u02c8\u0001\u0000\u0000\u0000"+
		"\u02cb\u02c9\u0001\u0000\u0000\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000"+
		"\u02cc\u02ce\u0001\u0000\u0000\u0000\u02cd\u02cf\u0003\u00e0p\u0000\u02ce"+
		"\u02cd\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf"+
		"\u02d1\u0001\u0000\u0000\u0000\u02d0\u02d2\u0003\u008eG\u0000\u02d1\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d8"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d5\u0005\u000b\u0000\u0000\u02d4\u02d6"+
		"\u0003\u00be_\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d9\u0003"+
		"\u008eG\u0000\u02d8\u02d3\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000"+
		"\u0000\u0000\u02d9C\u0001\u0000\u0000\u0000\u02da\u02db\u0005\t\u0000"+
		"\u0000\u02dbE\u0001\u0000\u0000\u0000\u02dc\u02de\u0003\u008cF\u0000\u02dd"+
		"\u02df\u0005\t\u0000\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02de\u02df"+
		"\u0001\u0000\u0000\u0000\u02dfG\u0001\u0000\u0000\u0000\u02e0\u02e1\u0005"+
		"S\u0000\u0000\u02e1\u02e2\u0005\u0005\u0000\u0000\u02e2\u02e3\u0003\u008c"+
		"F\u0000\u02e3\u02e4\u0005\u0006\u0000\u0000\u02e4\u02e7\u0003\u0004\u0002"+
		"\u0000\u02e5\u02e6\u0005C\u0000\u0000\u02e6\u02e8\u0003\u0004\u0002\u0000"+
		"\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000"+
		"\u02e8I\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005?\u0000\u0000\u02ea\u02eb"+
		"\u0003\u0004\u0002\u0000\u02eb\u02ec\u0005M\u0000\u0000\u02ec\u02ed\u0005"+
		"\u0005\u0000\u0000\u02ed\u02ee\u0003\u008cF\u0000\u02ee\u02ef\u0005\u0006"+
		"\u0000\u0000\u02ef\u02f0\u0003\u0100\u0080\u0000\u02f0\u0346\u0001\u0000"+
		"\u0000\u0000\u02f1\u02f2\u0005M\u0000\u0000\u02f2\u02f3\u0005\u0005\u0000"+
		"\u0000\u02f3\u02f4\u0003\u008cF\u0000\u02f4\u02f5\u0005\u0006\u0000\u0000"+
		"\u02f5\u02f6\u0003\u0004\u0002\u0000\u02f6\u0346\u0001\u0000\u0000\u0000"+
		"\u02f7\u02f8\u0005K\u0000\u0000\u02f8\u02fa\u0005\u0005\u0000\u0000\u02f9"+
		"\u02fb\u0003\u008cF\u0000\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fe"+
		"\u0005\t\u0000\u0000\u02fd\u02ff\u0003\u008cF\u0000\u02fe\u02fd\u0001"+
		"\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0300\u0001"+
		"\u0000\u0000\u0000\u0300\u0302\u0005\t\u0000\u0000\u0301\u0303\u0003\u008c"+
		"F\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000"+
		"\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304\u0305\u0005\u0006\u0000"+
		"\u0000\u0305\u0346\u0003\u0004\u0002\u0000\u0306\u0307\u0005K\u0000\u0000"+
		"\u0307\u0308\u0005\u0005\u0000\u0000\u0308\u0309\u0003L&\u0000\u0309\u030a"+
		"\u0003@ \u0000\u030a\u030c\u0005\t\u0000\u0000\u030b\u030d\u0003\u008c"+
		"F\u0000\u030c\u030b\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000"+
		"\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u0310\u0005\t\u0000\u0000"+
		"\u030f\u0311\u0003\u008cF\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0310"+
		"\u0311\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312"+
		"\u0313\u0005\u0006\u0000\u0000\u0313\u0314\u0003\u0004\u0002\u0000\u0314"+
		"\u0346\u0001\u0000\u0000\u0000\u0315\u0316\u0005K\u0000\u0000\u0316\u0317"+
		"\u0005\u0005\u0000\u0000\u0317\u0318\u0003\u008eG\u0000\u0318\u0319\u0005"+
		"V\u0000\u0000\u0319\u031a\u0003\u008cF\u0000\u031a\u031b\u0005\u0006\u0000"+
		"\u0000\u031b\u031c\u0003\u0004\u0002\u0000\u031c\u0346\u0001\u0000\u0000"+
		"\u0000\u031d\u031e\u0005K\u0000\u0000\u031e\u031f\u0005\u0005\u0000\u0000"+
		"\u031f\u0320\u0003L&\u0000\u0320\u0321\u0003B!\u0000\u0321\u0322\u0005"+
		"V\u0000\u0000\u0322\u0323\u0003\u008cF\u0000\u0323\u0324\u0005\u0006\u0000"+
		"\u0000\u0324\u0325\u0003\u0004\u0002\u0000\u0325\u0346\u0001\u0000\u0000"+
		"\u0000\u0326\u0328\u0005K\u0000\u0000\u0327\u0329\u0005\\\u0000\u0000"+
		"\u0328\u0327\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000"+
		"\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u032b\u0005\u0005\u0000\u0000"+
		"\u032b\u032c\u0003\u008eG\u0000\u032c\u032d\u0003\u00b8\\\u0000\u032d"+
		"\u0330\u0003\u008cF\u0000\u032e\u032f\u0005X\u0000\u0000\u032f\u0331\u0003"+
		"\u00ccf\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000"+
		"\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0333\u0005\u0006"+
		"\u0000\u0000\u0333\u0334\u0003\u0004\u0002\u0000\u0334\u0346\u0001\u0000"+
		"\u0000\u0000\u0335\u0337\u0005K\u0000\u0000\u0336\u0338\u0005\\\u0000"+
		"\u0000\u0337\u0336\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000"+
		"\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033a\u0005\u0005\u0000"+
		"\u0000\u033a\u033b\u0003L&\u0000\u033b\u033c\u0003B!\u0000\u033c\u033d"+
		"\u0003\u00b8\\\u0000\u033d\u0340\u0003\u008cF\u0000\u033e\u033f\u0005"+
		"X\u0000\u0000\u033f\u0341\u0003\u00ccf\u0000\u0340\u033e\u0001\u0000\u0000"+
		"\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000"+
		"\u0000\u0342\u0343\u0005\u0006\u0000\u0000\u0343\u0344\u0003\u0004\u0002"+
		"\u0000\u0344\u0346\u0001\u0000\u0000\u0000\u0345\u02e9\u0001\u0000\u0000"+
		"\u0000\u0345\u02f1\u0001\u0000\u0000\u0000\u0345\u02f7\u0001\u0000\u0000"+
		"\u0000\u0345\u0306\u0001\u0000\u0000\u0000\u0345\u0315\u0001\u0000\u0000"+
		"\u0000\u0345\u031d\u0001\u0000\u0000\u0000\u0345\u0326\u0001\u0000\u0000"+
		"\u0000\u0345\u0335\u0001\u0000\u0000\u0000\u0346K\u0001\u0000\u0000\u0000"+
		"\u0347\u0348\u0007\u0002\u0000\u0000\u0348M\u0001\u0000\u0000\u0000\u0349"+
		"\u034b\u0005J\u0000\u0000\u034a\u034c\u0003\u00b8\\\u0000\u034b\u034a"+
		"\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u034d"+
		"\u0001\u0000\u0000\u0000\u034d\u034e\u0003\u0100\u0080\u0000\u034eO\u0001"+
		"\u0000\u0000\u0000\u034f\u0351\u0005>\u0000\u0000\u0350\u0352\u0003\u00b8"+
		"\\\u0000\u0351\u0350\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000"+
		"\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0354\u0003\u0100\u0080"+
		"\u0000\u0354Q\u0001\u0000\u0000\u0000\u0355\u0357\u0005H\u0000\u0000\u0356"+
		"\u0358\u0003\u008cF\u0000\u0357\u0356\u0001\u0000\u0000\u0000\u0357\u0358"+
		"\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000\u0359\u0361"+
		"\u0003\u0100\u0080\u0000\u035a\u035b\u0005H\u0000\u0000\u035b\u035c\u0005"+
		"\u0005\u0000\u0000\u035c\u035d\u0003\u0090H\u0000\u035d\u035e\u0005\u0006"+
		"\u0000\u0000\u035e\u035f\u0003\u0100\u0080\u0000\u035f\u0361\u0001\u0000"+
		"\u0000\u0000\u0360\u0355\u0001\u0000\u0000\u0000\u0360\u035a\u0001\u0000"+
		"\u0000\u0000\u0361S\u0001\u0000\u0000\u0000\u0362\u0363\u0005L\u0000\u0000"+
		"\u0363\u0364\u0005\u0005\u0000\u0000\u0364\u0365\u0003\u008cF\u0000\u0365"+
		"\u0366\u0005\u0006\u0000\u0000\u0366\u0367\u0003V+\u0000\u0367U\u0001"+
		"\u0000\u0000\u0000\u0368\u036a\u0005\u0007\u0000\u0000\u0369\u036b\u0003"+
		"X,\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000"+
		"\u0000\u036b\u0370\u0001\u0000\u0000\u0000\u036c\u036e\u0003\\.\u0000"+
		"\u036d\u036f\u0003X,\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036e\u036f"+
		"\u0001\u0000\u0000\u0000\u036f\u0371\u0001\u0000\u0000\u0000\u0370\u036c"+
		"\u0001\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0372"+
		"\u0001\u0000\u0000\u0000\u0372\u0373\u0005\b\u0000\u0000\u0373W\u0001"+
		"\u0000\u0000\u0000\u0374\u0376\u0003Z-\u0000\u0375\u0374\u0001\u0000\u0000"+
		"\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0375\u0001\u0000\u0000"+
		"\u0000\u0377\u0378\u0001\u0000\u0000\u0000\u0378Y\u0001\u0000\u0000\u0000"+
		"\u0379\u037a\u0005B\u0000\u0000\u037a\u037b\u0003\u008cF\u0000\u037b\u037d"+
		"\u0005\u000e\u0000\u0000\u037c\u037e\u0003\"\u0011\u0000\u037d\u037c\u0001"+
		"\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000\u037e[\u0001\u0000"+
		"\u0000\u0000\u037f\u0380\u0005R\u0000\u0000\u0380\u0382\u0005\u000e\u0000"+
		"\u0000\u0381\u0383\u0003\"\u0011\u0000\u0382\u0381\u0001\u0000\u0000\u0000"+
		"\u0382\u0383\u0001\u0000\u0000\u0000\u0383]\u0001\u0000\u0000\u0000\u0384"+
		"\u0385\u0005T\u0000\u0000\u0385\u0386\u0003\u008cF\u0000\u0386\u0387\u0003"+
		"\u0100\u0080\u0000\u0387_\u0001\u0000\u0000\u0000\u0388\u0389\u0005W\u0000"+
		"\u0000\u0389\u038f\u0003\u0006\u0003\u0000\u038a\u038c\u0003b1\u0000\u038b"+
		"\u038d\u0003d2\u0000\u038c\u038b\u0001\u0000\u0000\u0000\u038c\u038d\u0001"+
		"\u0000\u0000\u0000\u038d\u0390\u0001\u0000\u0000\u0000\u038e\u0390\u0003"+
		"d2\u0000\u038f\u038a\u0001\u0000\u0000\u0000\u038f\u038e\u0001\u0000\u0000"+
		"\u0000\u0390a\u0001\u0000\u0000\u0000\u0391\u0399\u0005F\u0000\u0000\u0392"+
		"\u0393\u0005\u0005\u0000\u0000\u0393\u0395\u0003\u00b8\\\u0000\u0394\u0396"+
		"\u0003\u00e0p\u0000\u0395\u0394\u0001\u0000\u0000\u0000\u0395\u0396\u0001"+
		"\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000\u0000\u0397\u0398\u0005"+
		"\u0006\u0000\u0000\u0398\u039a\u0001\u0000\u0000\u0000\u0399\u0392\u0001"+
		"\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a\u039b\u0001"+
		"\u0000\u0000\u0000\u039b\u039c\u0003\u0006\u0003\u0000\u039cc\u0001\u0000"+
		"\u0000\u0000\u039d\u039e\u0005G\u0000\u0000\u039e\u039f\u0003\u0006\u0003"+
		"\u0000\u039fe\u0001\u0000\u0000\u0000\u03a0\u03a1\u0005a\u0000\u0000\u03a1"+
		"\u03a2\u0003\u00d4j\u0000\u03a2g\u0001\u0000\u0000\u0000\u03a3\u03a4\u0005"+
		"f\u0000\u0000\u03a4\u03a5\u0003\u00f4z\u0000\u03a5i\u0001\u0000\u0000"+
		"\u0000\u03a6\u03ae\u0003\u00f2y\u0000\u03a7\u03a9\u0003\u00f8|\u0000\u03a8"+
		"\u03a7\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9"+
		"\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ae\u0003l6\u0000\u03ab\u03ae\u0003"+
		"p8\u0000\u03ac\u03ae\u0003\u0004\u0002\u0000\u03ad\u03a6\u0001\u0000\u0000"+
		"\u0000\u03ad\u03a8\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000"+
		"\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03aek\u0001\u0000\u0000\u0000"+
		"\u03af\u03b0\u0003n7\u0000\u03b0\u03b2\u0003\u0084B\u0000\u03b1\u03b3"+
		"\u0005\f\u0000\u0000\u03b2\u03b1\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001"+
		"\u0000\u0000\u0000\u03b3\u03b5\u0001\u0000\u0000\u0000\u03b4\u03b6\u0003"+
		"\u00e0p\u0000\u03b5\u03b4\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b8\u0005\t\u0000"+
		"\u0000\u03b8\u03c5\u0001\u0000\u0000\u0000\u03b9\u03ba\u0003n7\u0000\u03ba"+
		"\u03bb\u0003\u0084B\u0000\u03bb\u03c1\u0003\u00e2q\u0000\u03bc\u03bd\u0005"+
		"\u0007\u0000\u0000\u03bd\u03be\u0003|>\u0000\u03be\u03bf\u0005\b\u0000"+
		"\u0000\u03bf\u03c2\u0001\u0000\u0000\u0000\u03c0\u03c2\u0005\t\u0000\u0000"+
		"\u03c1\u03bc\u0001\u0000\u0000\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000"+
		"\u03c2\u03c5\u0001\u0000\u0000\u0000\u03c3\u03c5\u0003$\u0012\u0000\u03c4"+
		"\u03af\u0001\u0000\u0000\u0000\u03c4\u03b9\u0001\u0000\u0000\u0000\u03c4"+
		"\u03c3\u0001\u0000\u0000\u0000\u03c5m\u0001\u0000\u0000\u0000\u03c6\u03c8"+
		"\u0003\u00ecv\u0000\u03c7\u03c6\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001"+
		"\u0000\u0000\u0000\u03c8\u03ca\u0001\u0000\u0000\u0000\u03c9\u03cb\u0005"+
		"[\u0000\u0000\u03ca\u03c9\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000"+
		"\u0000\u0000\u03cb\u03cd\u0001\u0000\u0000\u0000\u03cc\u03ce\u0005m\u0000"+
		"\u0000\u03cd\u03cc\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000"+
		"\u0000\u03ce\u03d0\u0001\u0000\u0000\u0000\u03cf\u03d1\u0005Z\u0000\u0000"+
		"\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000"+
		"\u03d1o\u0001\u0000\u0000\u0000\u03d2\u03d3\u0003\u00f0x\u0000\u03d3\u03d4"+
		"\u0005\t\u0000\u0000\u03d4q\u0001\u0000\u0000\u0000\u03d5\u03d6\u0005"+
		"\u0007\u0000\u0000\u03d6\u03db\u0003t:\u0000\u03d7\u03d8\u0005\n\u0000"+
		"\u0000\u03d8\u03da\u0003t:\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000\u03da"+
		"\u03dd\u0001\u0000\u0000\u0000\u03db\u03d9\u0001\u0000\u0000\u0000\u03db"+
		"\u03dc\u0001\u0000\u0000\u0000\u03dc\u03df\u0001\u0000\u0000\u0000\u03dd"+
		"\u03db\u0001\u0000\u0000\u0000\u03de\u03e0\u0005\n\u0000\u0000\u03df\u03de"+
		"\u0001\u0000\u0000\u0000\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0\u03e1"+
		"\u0001\u0000\u0000\u0000\u03e1\u03e2\u0005\b\u0000\u0000\u03e2s\u0001"+
		"\u0000\u0000\u0000\u03e3\u03e4\u0005\u0003\u0000\u0000\u03e4\u03e5\u0003"+
		"\u008eG\u0000\u03e5\u03e6\u0005\u0004\u0000\u0000\u03e6\u03e8\u0005\u0005"+
		"\u0000\u0000\u03e7\u03e9\u0003v;\u0000\u03e8\u03e7\u0001\u0000\u0000\u0000"+
		"\u03e8\u03e9\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001\u0000\u0000\u0000"+
		"\u03ea\u03eb\u0005\u0006\u0000\u0000\u03eb\u03ec\u0005\u0007\u0000\u0000"+
		"\u03ec\u03ed\u0003|>\u0000\u03ed\u03ee\u0005\b\u0000\u0000\u03eeu\u0001"+
		"\u0000\u0000\u0000\u03ef\u03f4\u0003x<\u0000\u03f0\u03f1\u0005\n\u0000"+
		"\u0000\u03f1\u03f3\u0003x<\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f3"+
		"\u03f6\u0001\u0000\u0000\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f4"+
		"\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f9\u0001\u0000\u0000\u0000\u03f6"+
		"\u03f4\u0001\u0000\u0000\u0000\u03f7\u03f8\u0005\n\u0000\u0000\u03f8\u03fa"+
		"\u0003z=\u0000\u03f9\u03f7\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000"+
		"\u0000\u0000\u03fa\u03fc\u0001\u0000\u0000\u0000\u03fb\u03fd\u0005\n\u0000"+
		"\u0000\u03fc\u03fb\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000"+
		"\u0000\u03fd\u0406\u0001\u0000\u0000\u0000\u03fe\u0406\u0003z=\u0000\u03ff"+
		"\u0406\u0003\u00acV\u0000\u0400\u0403\u0003\u00aeW\u0000\u0401\u0402\u0005"+
		"\u000e\u0000\u0000\u0402\u0404\u0003v;\u0000\u0403\u0401\u0001\u0000\u0000"+
		"\u0000\u0403\u0404\u0001\u0000\u0000\u0000\u0404\u0406\u0001\u0000\u0000"+
		"\u0000\u0405\u03ef\u0001\u0000\u0000\u0000\u0405\u03fe\u0001\u0000\u0000"+
		"\u0000\u0405\u03ff\u0001\u0000\u0000\u0000\u0405\u0400\u0001\u0000\u0000"+
		"\u0000\u0406w\u0001\u0000\u0000\u0000\u0407\u0409\u0003\u00fa}\u0000\u0408"+
		"\u0407\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000\u0409"+
		"\u040b\u0001\u0000\u0000\u0000\u040a\u040c\u0003\u00ecv\u0000\u040b\u040a"+
		"\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000\u040c\u040d"+
		"\u0001\u0000\u0000\u0000\u040d\u040f\u0003\u00aaU\u0000\u040e\u0410\u0005"+
		"\f\u0000\u0000\u040f\u040e\u0001\u0000\u0000\u0000\u040f\u0410\u0001\u0000"+
		"\u0000\u0000\u0410\u0412\u0001\u0000\u0000\u0000\u0411\u0413\u0003\u00e0"+
		"p\u0000\u0412\u0411\u0001\u0000\u0000\u0000\u0412\u0413\u0001\u0000\u0000"+
		"\u0000\u0413\u0416\u0001\u0000\u0000\u0000\u0414\u0415\u0005\u000b\u0000"+
		"\u0000\u0415\u0417\u0003\u008eG\u0000\u0416\u0414\u0001\u0000\u0000\u0000"+
		"\u0416\u0417\u0001\u0000\u0000\u0000\u0417y\u0001\u0000\u0000\u0000\u0418"+
		"\u0419\u0005\u000f\u0000\u0000\u0419\u041b\u0003\u00b8\\\u0000\u041a\u041c"+
		"\u0003\u00e0p\u0000\u041b\u041a\u0001\u0000\u0000\u0000\u041b\u041c\u0001"+
		"\u0000\u0000\u0000\u041c{\u0001\u0000\u0000\u0000\u041d\u041f\u0003\u0002"+
		"\u0001\u0000\u041e\u041d\u0001\u0000\u0000\u0000\u041e\u041f\u0001\u0000"+
		"\u0000\u0000\u041f}\u0001\u0000\u0000\u0000\u0420\u0422\u0005\n\u0000"+
		"\u0000\u0421\u0420\u0001\u0000\u0000\u0000\u0422\u0425\u0001\u0000\u0000"+
		"\u0000\u0423\u0421\u0001\u0000\u0000\u0000\u0423\u0424\u0001\u0000\u0000"+
		"\u0000\u0424\u0427\u0001\u0000\u0000\u0000\u0425\u0423\u0001\u0000\u0000"+
		"\u0000\u0426\u0428\u0003\u0080@\u0000\u0427\u0426\u0001\u0000\u0000\u0000"+
		"\u0427\u0428\u0001\u0000\u0000\u0000\u0428\u0431\u0001\u0000\u0000\u0000"+
		"\u0429\u042b\u0005\n\u0000\u0000\u042a\u0429\u0001\u0000\u0000\u0000\u042b"+
		"\u042c\u0001\u0000\u0000\u0000\u042c\u042a\u0001\u0000\u0000\u0000\u042c"+
		"\u042d\u0001\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e"+
		"\u0430\u0003\u0080@\u0000\u042f\u042a\u0001\u0000\u0000\u0000\u0430\u0433"+
		"\u0001\u0000\u0000\u0000\u0431\u042f\u0001\u0000\u0000\u0000\u0431\u0432"+
		"\u0001\u0000\u0000\u0000\u0432\u0437\u0001\u0000\u0000\u0000\u0433\u0431"+
		"\u0001\u0000\u0000\u0000\u0434\u0436\u0005\n\u0000\u0000\u0435\u0434\u0001"+
		"\u0000\u0000\u0000\u0436\u0439\u0001\u0000\u0000\u0000\u0437\u0435\u0001"+
		"\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000\u0000\u0438\u007f\u0001"+
		"\u0000\u0000\u0000\u0439\u0437\u0001\u0000\u0000\u0000\u043a\u043c\u0005"+
		"\u000f\u0000\u0000\u043b\u043a\u0001\u0000\u0000\u0000\u043b\u043c\u0001"+
		"\u0000\u0000\u0000\u043c\u043f\u0001\u0000\u0000\u0000\u043d\u0440\u0003"+
		"\u008eG\u0000\u043e\u0440\u0003\u00b8\\\u0000\u043f\u043d\u0001\u0000"+
		"\u0000\u0000\u043f\u043e\u0001\u0000\u0000\u0000\u0440\u0442\u0001\u0000"+
		"\u0000\u0000\u0441\u0443\u0005\n\u0000\u0000\u0442\u0441\u0001\u0000\u0000"+
		"\u0000\u0442\u0443\u0001\u0000\u0000\u0000\u0443\u0081\u0001\u0000\u0000"+
		"\u0000\u0444\u0445\u0003\u0084B\u0000\u0445\u0446\u0007\u0003\u0000\u0000"+
		"\u0446\u0447\u0003\u008eG\u0000\u0447\u0455\u0001\u0000\u0000\u0000\u0448"+
		"\u0449\u0005\u0003\u0000\u0000\u0449\u044a\u0003\u008eG\u0000\u044a\u044b"+
		"\u0005\u0004\u0000\u0000\u044b\u044c\u0005\u000e\u0000\u0000\u044c\u044d"+
		"\u0003\u008eG\u0000\u044d\u0455\u0001\u0000\u0000\u0000\u044e\u0455\u0003"+
		"\u00ba]\u0000\u044f\u0451\u0005\u000f\u0000\u0000\u0450\u044f\u0001\u0000"+
		"\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000\u0451\u0452\u0001\u0000"+
		"\u0000\u0000\u0452\u0455\u0003\u008eG\u0000\u0453\u0455\u0003\u00e8t\u0000"+
		"\u0454\u0444\u0001\u0000\u0000\u0000\u0454\u0448\u0001\u0000\u0000\u0000"+
		"\u0454\u044e\u0001\u0000\u0000\u0000\u0454\u0450\u0001\u0000\u0000\u0000"+
		"\u0454\u0453\u0001\u0000\u0000\u0000\u0455\u0083\u0001\u0000\u0000\u0000"+
		"\u0456\u045e\u0003\u00b6[\u0000\u0457\u045e\u0005\u00b0\u0000\u0000\u0458"+
		"\u045e\u0003\u00b4Z\u0000\u0459\u045a\u0005\u0003\u0000\u0000\u045a\u045b"+
		"\u0003\u008eG\u0000\u045b\u045c\u0005\u0004\u0000\u0000\u045c\u045e\u0001"+
		"\u0000\u0000\u0000\u045d\u0456\u0001\u0000\u0000\u0000\u045d\u0457\u0001"+
		"\u0000\u0000\u0000\u045d\u0458\u0001\u0000\u0000\u0000\u045d\u0459\u0001"+
		"\u0000\u0000\u0000\u045e\u0085\u0001\u0000\u0000\u0000\u045f\u0464\u0005"+
		"\u0005\u0000\u0000\u0460\u0462\u0003\u0088D\u0000\u0461\u0463\u0005\n"+
		"\u0000\u0000\u0462\u0461\u0001\u0000\u0000\u0000\u0462\u0463\u0001\u0000"+
		"\u0000\u0000\u0463\u0465\u0001\u0000\u0000\u0000\u0464\u0460\u0001\u0000"+
		"\u0000\u0000\u0464\u0465\u0001\u0000\u0000\u0000\u0465\u0466\u0001\u0000"+
		"\u0000\u0000\u0466\u0467\u0005\u0006\u0000\u0000\u0467\u0087\u0001\u0000"+
		"\u0000\u0000\u0468\u046d\u0003\u008aE\u0000\u0469\u046a\u0005\n\u0000"+
		"\u0000\u046a\u046c\u0003\u008aE\u0000\u046b\u0469\u0001\u0000\u0000\u0000"+
		"\u046c\u046f\u0001\u0000\u0000\u0000\u046d\u046b\u0001\u0000\u0000\u0000"+
		"\u046d\u046e\u0001\u0000\u0000\u0000\u046e\u0089\u0001\u0000\u0000\u0000"+
		"\u046f\u046d\u0001\u0000\u0000\u0000\u0470\u0472\u0005\u000f\u0000\u0000"+
		"\u0471\u0470\u0001\u0000\u0000\u0000\u0471\u0472\u0001\u0000\u0000\u0000"+
		"\u0472\u0475\u0001\u0000\u0000\u0000\u0473\u0476\u0003\u008eG\u0000\u0474"+
		"\u0476\u0003\u00b8\\\u0000\u0475\u0473\u0001\u0000\u0000\u0000\u0475\u0474"+
		"\u0001\u0000\u0000\u0000\u0476\u008b\u0001\u0000\u0000\u0000\u0477\u047c"+
		"\u0003\u008eG\u0000\u0478\u0479\u0005\n\u0000\u0000\u0479\u047b\u0003"+
		"\u008eG\u0000\u047a\u0478\u0001\u0000\u0000\u0000\u047b\u047e\u0001\u0000"+
		"\u0000\u0000\u047c\u047a\u0001\u0000\u0000\u0000\u047c\u047d\u0001\u0000"+
		"\u0000\u0000\u047d\u008d\u0001\u0000\u0000\u0000\u047e\u047c\u0001\u0000"+
		"\u0000\u0000\u047f\u0480\u0006G\uffff\uffff\u0000\u0480\u0482\u0005_\u0000"+
		"\u0000\u0481\u0483\u0003\u00b8\\\u0000\u0482\u0481\u0001\u0000\u0000\u0000"+
		"\u0482\u0483\u0001\u0000\u0000\u0000\u0483\u0485\u0001\u0000\u0000\u0000"+
		"\u0484\u0486\u0003\u00be_\u0000\u0485\u0484\u0001\u0000\u0000\u0000\u0485"+
		"\u0486\u0001\u0000\u0000\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487"+
		"\u0488\u0003\u0010\b\u0000\u0488\u0489\u0003\u0012\t\u0000\u0489\u0518"+
		"\u0001\u0000\u0000\u0000\u048a\u048b\u0005D\u0000\u0000\u048b\u048d\u0003"+
		"\u008eG\u0000\u048c\u048e\u0003\u00c6c\u0000\u048d\u048c\u0001\u0000\u0000"+
		"\u0000\u048d\u048e\u0001\u0000\u0000\u0000\u048e\u048f\u0001\u0000\u0000"+
		"\u0000\u048f\u0490\u0003\u0086C\u0000\u0490\u0518\u0001\u0000\u0000\u0000"+
		"\u0491\u0492\u0005D\u0000\u0000\u0492\u0494\u0003\u008eG\u0000\u0493\u0495"+
		"\u0003\u00c6c\u0000\u0494\u0493\u0001\u0000\u0000\u0000\u0494\u0495\u0001"+
		"\u0000\u0000\u0000\u0495\u0518\u0001\u0000\u0000\u0000\u0496\u0497\u0005"+
		"U\u0000\u0000\u0497\u0518\u0003\u008eG4\u0498\u0499\u0005I\u0000\u0000"+
		"\u0499\u0518\u0003\u008eG3\u049a\u049b\u0005A\u0000\u0000\u049b\u0518"+
		"\u0003\u008eG2\u049c\u049d\u0005\u0011\u0000\u0000\u049d\u0518\u0003\u008e"+
		"G1\u049e\u049f\u0005\u0012\u0000\u0000\u049f\u0518\u0003\u008eG0\u04a0"+
		"\u04a1\u0005\u0013\u0000\u0000\u04a1\u0518\u0003\u008eG/\u04a2\u04a3\u0005"+
		"\u0014\u0000\u0000\u04a3\u0518\u0003\u008eG.\u04a4\u04a5\u0005\u0015\u0000"+
		"\u0000\u04a5\u0518\u0003\u008eG-\u04a6\u04a7\u0005\u0016\u0000\u0000\u04a7"+
		"\u0518\u0003\u008eG,\u04a8\u04a9\u0005\\\u0000\u0000\u04a9\u0518\u0003"+
		"\u008eG+\u04aa\u0518\u0003r9\u0000\u04ab\u0518\u0005P\u0000\u0000\u04ac"+
		"\u04ae\u0005\u00ad\u0000\u0000\u04ad\u04ac\u0001\u0000\u0000\u0000\u04ad"+
		"\u04ae\u0001\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000\u04af"+
		"\u04b1\u0003\u00b6[\u0000\u04b0\u04b2\u0003\u008eG\u0000\u04b1\u04b0\u0001"+
		"\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2\u0518\u0001"+
		"\u0000\u0000\u0000\u04b3\u0518\u0005b\u0000\u0000\u04b4\u0518\u0003\u00b2"+
		"Y\u0000\u04b5\u0518\u0003\u00acV\u0000\u04b6\u0518\u0003\u00aeW\u0000"+
		"\u04b7\u0518\u0003\u0092I\u0000\u04b8\u04b9\u0005\u0005\u0000\u0000\u04b9"+
		"\u04ba\u0003\u008cF\u0000\u04ba\u04bb\u0005\u0006\u0000\u0000\u04bb\u0518"+
		"\u0001\u0000\u0000\u0000\u04bc\u04be\u0003\u00c6c\u0000\u04bd\u04bf\u0003"+
		"\u008cF\u0000\u04be\u04bd\u0001\u0000\u0000\u0000\u04be\u04bf\u0001\u0000"+
		"\u0000\u0000\u04bf\u0518\u0001\u0000\u0000\u0000\u04c0\u04c1\u0005\u008f"+
		"\u0000\u0000\u04c1\u04c2\u0005\u0005\u0000\u0000\u04c2\u04c3\u0003\u008e"+
		"G\u0000\u04c3\u04c4\u0005\u0006\u0000\u0000\u04c4\u0518\u0001\u0000\u0000"+
		"\u0000\u04c5\u04c6\u0005\u0092\u0000\u0000\u04c6\u04c7\u0005\u0005\u0000"+
		"\u0000\u04c7\u04c8\u0003\u008eG\u0000\u04c8\u04c9\u0005\u0006\u0000\u0000"+
		"\u04c9\u0518\u0001\u0000\u0000\u0000\u04ca\u04cb\u0005\u0090\u0000\u0000"+
		"\u04cb\u04cc\u0005\u0005\u0000\u0000\u04cc\u04cd\u0003\u008eG\u0000\u04cd"+
		"\u04ce\u0005\u0006\u0000\u0000\u04ce\u0518\u0001\u0000\u0000\u0000\u04cf"+
		"\u04d0\u0005\u0091\u0000\u0000\u04d0\u04d1\u0005\u0005\u0000\u0000\u04d1"+
		"\u04d2\u0003\u008eG\u0000\u04d2\u04d3\u0005\u0006\u0000\u0000\u04d3\u0518"+
		"\u0001\u0000\u0000\u0000\u04d4\u04d5\u0005\u008d\u0000\u0000\u04d5\u04d6"+
		"\u0005\u0010\u0000\u0000\u04d6\u04d7\u0005\u008a\u0000\u0000\u04d7\u04d8"+
		"\u0005\u0005\u0000\u0000\u04d8\u04d9\u0003\u008eG\u0000\u04d9\u04da\u0005"+
		"\u0006\u0000\u0000\u04da\u0518\u0001\u0000\u0000\u0000\u04db\u04dc\u0005"+
		"\u008d\u0000\u0000\u04dc\u04dd\u0005\u0010\u0000\u0000\u04dd\u04de\u0005"+
		"\u008b\u0000\u0000\u04de\u04df\u0005\u0005\u0000\u0000\u04df\u04e0\u0003"+
		"\u008eG\u0000\u04e0\u04e1\u0005\u0006\u0000\u0000\u04e1\u0518\u0001\u0000"+
		"\u0000\u0000\u04e2\u04e3\u0005\u0083\u0000\u0000\u04e3\u04e4\u0005\u0005"+
		"\u0000\u0000\u04e4\u04e7\u0005\u00b0\u0000\u0000\u04e5\u04e6\u0005\n\u0000"+
		"\u0000\u04e6\u04e8\u0003\u00aeW\u0000\u04e7\u04e5\u0001\u0000\u0000\u0000"+
		"\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8\u04e9\u0001\u0000\u0000\u0000"+
		"\u04e9\u0518\u0005\u0006\u0000\u0000\u04ea\u04eb\u0005\u0084\u0000\u0000"+
		"\u04eb\u04ec\u0005\u0005\u0000\u0000\u04ec\u04ed\u0003\u00b8\\\u0000\u04ed"+
		"\u04ee\u0005\n\u0000\u0000\u04ee\u04ef\u0003\u008eG\u0000\u04ef\u04f0"+
		"\u0005\u0006\u0000\u0000\u04f0\u0518\u0001\u0000\u0000\u0000\u04f1\u04f2"+
		"\u0005\u0085\u0000\u0000\u04f2\u04f3\u0005\u0005\u0000\u0000\u04f3\u04f8"+
		"\u0003\u008eG\u0000\u04f4\u04f5\u0005\n\u0000\u0000\u04f5\u04f7\u0003"+
		"\u008eG\u0000\u04f6\u04f4\u0001\u0000\u0000\u0000\u04f7\u04fa\u0001\u0000"+
		"\u0000\u0000\u04f8\u04f6\u0001\u0000\u0000\u0000\u04f8\u04f9\u0001\u0000"+
		"\u0000\u0000\u04f9\u04fb\u0001\u0000\u0000\u0000\u04fa\u04f8\u0001\u0000"+
		"\u0000\u0000\u04fb\u04fc\u0005\u0006\u0000\u0000\u04fc\u0518\u0001\u0000"+
		"\u0000\u0000\u04fd\u04fe\u0005\u0097\u0000\u0000\u04fe\u04ff\u0005\u0010"+
		"\u0000\u0000\u04ff\u0500\u0005\u008c\u0000\u0000\u0500\u0501\u0005\u0005"+
		"\u0000\u0000\u0501\u0504\u0003\u00acV\u0000\u0502\u0503\u0005\n\u0000"+
		"\u0000\u0503\u0505\u0003\u00aeW\u0000\u0504\u0502\u0001\u0000\u0000\u0000"+
		"\u0504\u0505\u0001\u0000\u0000\u0000\u0505\u0506\u0001\u0000\u0000\u0000"+
		"\u0506\u0507\u0005\u0006\u0000\u0000\u0507\u0518\u0001\u0000\u0000\u0000"+
		"\u0508\u0509\u0005\u0097\u0000\u0000\u0509\u050a\u0005\u0010\u0000\u0000"+
		"\u050a\u050b\u0005\u0087\u0000\u0000\u050b\u050c\u0005\u0005\u0000\u0000"+
		"\u050c\u050f\u0005\u00b0\u0000\u0000\u050d\u050e\u0005\n\u0000\u0000\u050e"+
		"\u0510\u0003\u00aeW\u0000\u050f\u050d\u0001\u0000\u0000\u0000\u050f\u0510"+
		"\u0001\u0000\u0000\u0000\u0510\u0511\u0001\u0000\u0000\u0000\u0511\u0518"+
		"\u0005\u0006\u0000\u0000\u0512\u0513\u0005\u00aa\u0000\u0000\u0513\u0514"+
		"\u0005\u0005\u0000\u0000\u0514\u0515\u0003\u00b8\\\u0000\u0515\u0516\u0005"+
		"\u0006\u0000\u0000\u0516\u0518\u0001\u0000\u0000\u0000\u0517\u047f\u0001"+
		"\u0000\u0000\u0000\u0517\u048a\u0001\u0000\u0000\u0000\u0517\u0491\u0001"+
		"\u0000\u0000\u0000\u0517\u0496\u0001\u0000\u0000\u0000\u0517\u0498\u0001"+
		"\u0000\u0000\u0000\u0517\u049a\u0001\u0000\u0000\u0000\u0517\u049c\u0001"+
		"\u0000\u0000\u0000\u0517\u049e\u0001\u0000\u0000\u0000\u0517\u04a0\u0001"+
		"\u0000\u0000\u0000\u0517\u04a2\u0001\u0000\u0000\u0000\u0517\u04a4\u0001"+
		"\u0000\u0000\u0000\u0517\u04a6\u0001\u0000\u0000\u0000\u0517\u04a8\u0001"+
		"\u0000\u0000\u0000\u0517\u04aa\u0001\u0000\u0000\u0000\u0517\u04ab\u0001"+
		"\u0000\u0000\u0000\u0517\u04ad\u0001\u0000\u0000\u0000\u0517\u04b3\u0001"+
		"\u0000\u0000\u0000\u0517\u04b4\u0001\u0000\u0000\u0000\u0517\u04b5\u0001"+
		"\u0000\u0000\u0000\u0517\u04b6\u0001\u0000\u0000\u0000\u0517\u04b7\u0001"+
		"\u0000\u0000\u0000\u0517\u04b8\u0001\u0000\u0000\u0000\u0517\u04bc\u0001"+
		"\u0000\u0000\u0000\u0517\u04c0\u0001\u0000\u0000\u0000\u0517\u04c5\u0001"+
		"\u0000\u0000\u0000\u0517\u04ca\u0001\u0000\u0000\u0000\u0517\u04cf\u0001"+
		"\u0000\u0000\u0000\u0517\u04d4\u0001\u0000\u0000\u0000\u0517\u04db\u0001"+
		"\u0000\u0000\u0000\u0517\u04e2\u0001\u0000\u0000\u0000\u0517\u04ea\u0001"+
		"\u0000\u0000\u0000\u0517\u04f1\u0001\u0000\u0000\u0000\u0517\u04fd\u0001"+
		"\u0000\u0000\u0000\u0517\u0508\u0001\u0000\u0000\u0000\u0517\u0512\u0001"+
		"\u0000\u0000\u0000\u0518\u058a\u0001\u0000\u0000\u0000\u0519\u051a\n<"+
		"\u0000\u0000\u051a\u051b\u0005\r\u0000\u0000\u051b\u0589\u0003\u008eG"+
		"=\u051c\u051d\n*\u0000\u0000\u051d\u051e\u0005\u001a\u0000\u0000\u051e"+
		"\u0589\u0003\u008eG*\u051f\u0520\n)\u0000\u0000\u0520\u0521\u0007\u0004"+
		"\u0000\u0000\u0521\u0589\u0003\u008eG*\u0522\u0523\n(\u0000\u0000\u0523"+
		"\u0524\u0007\u0005\u0000\u0000\u0524\u0589\u0003\u008eG)\u0525\u0526\n"+
		"\'\u0000\u0000\u0526\u0527\u0005\u001b\u0000\u0000\u0527\u0589\u0003\u008e"+
		"G(\u0528\u052f\n&\u0000\u0000\u0529\u0530\u0005\u001d\u0000\u0000\u052a"+
		"\u052b\u0005\u001f\u0000\u0000\u052b\u0530\u0005\u001f\u0000\u0000\u052c"+
		"\u052d\u0005\u001f\u0000\u0000\u052d\u052e\u0005\u001f\u0000\u0000\u052e"+
		"\u0530\u0005\u001f\u0000\u0000\u052f\u0529\u0001\u0000\u0000\u0000\u052f"+
		"\u052a\u0001\u0000\u0000\u0000\u052f\u052c\u0001\u0000\u0000\u0000\u0530"+
		"\u0531\u0001\u0000\u0000\u0000\u0531\u0589\u0003\u008eG\'\u0532\u0533"+
		"\n%\u0000\u0000\u0533\u0534\u0007\u0006\u0000\u0000\u0534\u0589\u0003"+
		"\u008eG&\u0535\u0536\n$\u0000\u0000\u0536\u0537\u0005@\u0000\u0000\u0537"+
		"\u0589\u0003\u008eG%\u0538\u0539\n#\u0000\u0000\u0539\u053a\u0005V\u0000"+
		"\u0000\u053a\u0589\u0003\u008eG$\u053b\u053c\n\"\u0000\u0000\u053c\u053d"+
		"\u0007\u0007\u0000\u0000\u053d\u0589\u0003\u008eG#\u053e\u053f\n!\u0000"+
		"\u0000\u053f\u0540\u0005&\u0000\u0000\u0540\u0589\u0003\u008eG\"\u0541"+
		"\u0542\n \u0000\u0000\u0542\u0543\u0005\'\u0000\u0000\u0543\u0589\u0003"+
		"\u008eG!\u0544\u0545\n\u001f\u0000\u0000\u0545\u0546\u0005(\u0000\u0000"+
		"\u0546\u0589\u0003\u008eG \u0547\u0548\n\u001e\u0000\u0000\u0548\u0549"+
		"\u0005)\u0000\u0000\u0549\u0589\u0003\u008eG\u001f\u054a\u054b\n\u001d"+
		"\u0000\u0000\u054b\u054c\u0005*\u0000\u0000\u054c\u0589\u0003\u008eG\u001e"+
		"\u054d\u054e\n\u001c\u0000\u0000\u054e\u054f\u0005\f\u0000\u0000\u054f"+
		"\u0550\u0003\u008eG\u0000\u0550\u0551\u0005\u000e\u0000\u0000\u0551\u0552"+
		"\u0003\u008eG\u001d\u0552\u0589\u0001\u0000\u0000\u0000\u0553\u0554\n"+
		"\u001b\u0000\u0000\u0554\u0555\u0005\u000b\u0000\u0000\u0555\u0589\u0003"+
		"\u008eG\u001c\u0556\u0557\n\u001a\u0000\u0000\u0557\u0558\u00058\u0000"+
		"\u0000\u0558\u0589\u0003\u008eG\u001b\u0559\u055a\n\u0019\u0000\u0000"+
		"\u055a\u055b\u0003\u00b0X\u0000\u055b\u055c\u0003\u008eG\u001a\u055c\u0589"+
		"\u0001\u0000\u0000\u0000\u055d\u055f\n=\u0000\u0000\u055e\u0560\u0005"+
		"\r\u0000\u0000\u055f\u055e\u0001\u0000\u0000\u0000\u055f\u0560\u0001\u0000"+
		"\u0000\u0000\u0560\u0561\u0001\u0000\u0000\u0000\u0561\u0562\u0005\u0003"+
		"\u0000\u0000\u0562\u0563\u0003\u008cF\u0000\u0563\u0564\u0005\u0004\u0000"+
		"\u0000\u0564\u0589\u0001\u0000\u0000\u0000\u0565\u0567\n;\u0000\u0000"+
		"\u0566\u0568\u0005\u0016\u0000\u0000\u0567\u0566\u0001\u0000\u0000\u0000"+
		"\u0567\u0568\u0001\u0000\u0000\u0000\u0568\u0569\u0001\u0000\u0000\u0000"+
		"\u0569\u056b\u0005\u0010\u0000\u0000\u056a\u056c\u0005\u001c\u0000\u0000"+
		"\u056b\u056a\u0001\u0000\u0000\u0000\u056b\u056c\u0001\u0000\u0000\u0000"+
		"\u056c\u056d\u0001\u0000\u0000\u0000\u056d\u056f\u0003\u00b6[\u0000\u056e"+
		"\u0570\u0003\u00d6k\u0000\u056f\u056e\u0001\u0000\u0000\u0000\u056f\u0570"+
		"\u0001\u0000\u0000\u0000\u0570\u0589\u0001\u0000\u0000\u0000\u0571\u0573"+
		"\n:\u0000\u0000\u0572\u0574\u0005\f\u0000\u0000\u0573\u0572\u0001\u0000"+
		"\u0000\u0000\u0573\u0574\u0001\u0000\u0000\u0000\u0574\u0575\u0001\u0000"+
		"\u0000\u0000\u0575\u0577\u0005\u0010\u0000\u0000\u0576\u0578\u0005\u001c"+
		"\u0000\u0000\u0577\u0576\u0001\u0000\u0000\u0000\u0577\u0578\u0001\u0000"+
		"\u0000\u0000\u0578\u0579\u0001\u0000\u0000\u0000\u0579\u057b\u0003\u00b6"+
		"[\u0000\u057a\u057c\u0003\u00d6k\u0000\u057b\u057a\u0001\u0000\u0000\u0000"+
		"\u057b\u057c\u0001\u0000\u0000\u0000\u057c\u0589\u0001\u0000\u0000\u0000"+
		"\u057d\u057e\n7\u0000\u0000\u057e\u0589\u0003\u0086C\u0000\u057f\u0580"+
		"\n6\u0000\u0000\u0580\u0589\u0005\u0011\u0000\u0000\u0581\u0582\n5\u0000"+
		"\u0000\u0582\u0589\u0005\u0012\u0000\u0000\u0583\u0584\n\u000e\u0000\u0000"+
		"\u0584\u0585\u0005X\u0000\u0000\u0585\u0589\u0003\u00a8T\u0000\u0586\u0587"+
		"\n\r\u0000\u0000\u0587\u0589\u0005\u0016\u0000\u0000\u0588\u0519\u0001"+
		"\u0000\u0000\u0000\u0588\u051c\u0001\u0000\u0000\u0000\u0588\u051f\u0001"+
		"\u0000\u0000\u0000\u0588\u0522\u0001\u0000\u0000\u0000\u0588\u0525\u0001"+
		"\u0000\u0000\u0000\u0588\u0528\u0001\u0000\u0000\u0000\u0588\u0532\u0001"+
		"\u0000\u0000\u0000\u0588\u0535\u0001\u0000\u0000\u0000\u0588\u0538\u0001"+
		"\u0000\u0000\u0000\u0588\u053b\u0001\u0000\u0000\u0000\u0588\u053e\u0001"+
		"\u0000\u0000\u0000\u0588\u0541\u0001\u0000\u0000\u0000\u0588\u0544\u0001"+
		"\u0000\u0000\u0000\u0588\u0547\u0001\u0000\u0000\u0000\u0588\u054a\u0001"+
		"\u0000\u0000\u0000\u0588\u054d\u0001\u0000\u0000\u0000\u0588\u0553\u0001"+
		"\u0000\u0000\u0000\u0588\u0556\u0001\u0000\u0000\u0000\u0588\u0559\u0001"+
		"\u0000\u0000\u0000\u0588\u055d\u0001\u0000\u0000\u0000\u0588\u0565\u0001"+
		"\u0000\u0000\u0000\u0588\u0571\u0001\u0000\u0000\u0000\u0588\u057d\u0001"+
		"\u0000\u0000\u0000\u0588\u057f\u0001\u0000\u0000\u0000\u0588\u0581\u0001"+
		"\u0000\u0000\u0000\u0588\u0583\u0001\u0000\u0000\u0000\u0588\u0586\u0001"+
		"\u0000\u0000\u0000\u0589\u058c\u0001\u0000\u0000\u0000\u058a\u0588\u0001"+
		"\u0000\u0000\u0000\u058a\u058b\u0001\u0000\u0000\u0000\u058b\u008f\u0001"+
		"\u0000\u0000\u0000\u058c\u058a\u0001\u0000\u0000\u0000\u058d\u058f\u0003"+
		"\u0092I\u0000\u058e\u058d\u0001\u0000\u0000\u0000\u058f\u0590\u0001\u0000"+
		"\u0000\u0000\u0590\u058e\u0001\u0000\u0000\u0000\u0590\u0591\u0001\u0000"+
		"\u0000\u0000\u0591\u0091\u0001\u0000\u0000\u0000\u0592\u0593\u0005\u001e"+
		"\u0000\u0000\u0593\u0597\u0003\u0098L\u0000\u0594\u0596\u0003\u009eO\u0000"+
		"\u0595\u0594\u0001\u0000\u0000\u0000\u0596\u0599\u0001\u0000\u0000\u0000"+
		"\u0597\u0595\u0001\u0000\u0000\u0000\u0597\u0598\u0001\u0000\u0000\u0000"+
		"\u0598\u059a\u0001\u0000\u0000\u0000\u0599\u0597\u0001\u0000\u0000\u0000"+
		"\u059a\u059b\u0005\u001f\u0000\u0000\u059b\u059c\u0003\u0094J\u0000\u059c"+
		"\u059d\u0005\u001e\u0000\u0000\u059d\u059e\u0005\u0018\u0000\u0000\u059e"+
		"\u059f\u0003\u009aM\u0000\u059f\u05a0\u0005\u001f\u0000\u0000\u05a0\u05c3"+
		"\u0001\u0000\u0000\u0000\u05a1\u05a2\u0005\u001e\u0000\u0000\u05a2\u05a6"+
		"\u0003\u009cN\u0000\u05a3\u05a5\u0003\u009eO\u0000\u05a4\u05a3\u0001\u0000"+
		"\u0000\u0000\u05a5\u05a8\u0001\u0000\u0000\u0000\u05a6\u05a4\u0001\u0000"+
		"\u0000\u0000\u05a6\u05a7\u0001\u0000\u0000\u0000\u05a7\u05a9\u0001\u0000"+
		"\u0000\u0000\u05a8\u05a6\u0001\u0000\u0000\u0000\u05a9\u05aa\u0003\u0094"+
		"J\u0000\u05aa\u05ab\u0005\u0018\u0000\u0000\u05ab\u05ac\u0005\u001f\u0000"+
		"\u0000\u05ac\u05c3\u0001\u0000\u0000\u0000\u05ad\u05ae\u0005\u001e\u0000"+
		"\u0000\u05ae\u05b2\u0003\u009cN\u0000\u05af\u05b1\u0003\u009eO\u0000\u05b0"+
		"\u05af\u0001\u0000\u0000\u0000\u05b1\u05b4\u0001\u0000\u0000\u0000\u05b2"+
		"\u05b0\u0001\u0000\u0000\u0000\u05b2\u05b3\u0001\u0000\u0000\u0000\u05b3"+
		"\u05b5\u0001\u0000\u0000\u0000\u05b4\u05b2\u0001\u0000\u0000\u0000\u05b5"+
		"\u05b6\u0005\u0018\u0000\u0000\u05b6\u05b7\u0005\u001f\u0000\u0000\u05b7"+
		"\u05c3\u0001\u0000\u0000\u0000\u05b8\u05b9\u0005\u001e\u0000\u0000\u05b9"+
		"\u05bd\u0003\u009cN\u0000\u05ba\u05bc\u0003\u009eO\u0000\u05bb\u05ba\u0001"+
		"\u0000\u0000\u0000\u05bc\u05bf\u0001\u0000\u0000\u0000\u05bd\u05bb\u0001"+
		"\u0000\u0000\u0000\u05bd\u05be\u0001\u0000\u0000\u0000\u05be\u05c0\u0001"+
		"\u0000\u0000\u0000\u05bf\u05bd\u0001\u0000\u0000\u0000\u05c0\u05c1\u0005"+
		"\u001f\u0000\u0000\u05c1\u05c3\u0001\u0000\u0000\u0000\u05c2\u0592\u0001"+
		"\u0000\u0000\u0000\u05c2\u05a1\u0001\u0000\u0000\u0000\u05c2\u05ad\u0001"+
		"\u0000\u0000\u0000\u05c2\u05b8\u0001\u0000\u0000\u0000\u05c3\u0093\u0001"+
		"\u0000\u0000\u0000\u05c4\u05c7\u0003\u0092I\u0000\u05c5\u05c7\u0003\u00a4"+
		"R\u0000\u05c6\u05c4\u0001\u0000\u0000\u0000\u05c6\u05c5\u0001\u0000\u0000"+
		"\u0000\u05c7\u05cd\u0001\u0000\u0000\u0000\u05c8\u05ca\b\b\u0000\u0000"+
		"\u05c9\u05c8\u0001\u0000\u0000\u0000\u05ca\u05cb\u0001\u0000\u0000\u0000"+
		"\u05cb\u05c9\u0001\u0000\u0000\u0000\u05cb\u05cc\u0001\u0000\u0000\u0000"+
		"\u05cc\u05ce\u0001\u0000\u0000\u0000\u05cd\u05c9\u0001\u0000\u0000\u0000"+
		"\u05cd\u05ce\u0001\u0000\u0000\u0000\u05ce\u05d0\u0001\u0000\u0000\u0000"+
		"\u05cf\u05c6\u0001\u0000\u0000\u0000\u05d0\u05d3\u0001\u0000\u0000\u0000"+
		"\u05d1\u05cf\u0001\u0000\u0000\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000"+
		"\u05d2\u0095\u0001\u0000\u0000\u0000\u05d3\u05d1\u0001\u0000\u0000\u0000"+
		"\u05d4\u05d5\u0005\u0007\u0000\u0000\u05d5\u05d6\u0003\u008cF\u0000\u05d6"+
		"\u05d7\u0005\b\u0000\u0000\u05d7\u0097\u0001\u0000\u0000\u0000\u05d8\u05d9"+
		"\u0003\u009cN\u0000\u05d9\u0099\u0001\u0000\u0000\u0000\u05da\u05db\u0003"+
		"\u009cN\u0000\u05db\u009b\u0001\u0000\u0000\u0000\u05dc\u05e1\u0005\u00b9"+
		"\u0000\u0000\u05dd\u05e1\u0003 \u0010\u0000\u05de\u05e1\u0005\u00ae\u0000"+
		"\u0000\u05df\u05e1\u0005\u009b\u0000\u0000\u05e0\u05dc\u0001\u0000\u0000"+
		"\u0000\u05e0\u05dd\u0001\u0000\u0000\u0000\u05e0\u05de\u0001\u0000\u0000"+
		"\u0000\u05e0\u05df\u0001\u0000\u0000\u0000\u05e1\u009d\u0001\u0000\u0000"+
		"\u0000\u05e2\u05e4\u0005\u0017\u0000\u0000\u05e3\u05e2\u0001\u0000\u0000"+
		"\u0000\u05e3\u05e4\u0001\u0000\u0000\u0000\u05e4\u05e7\u0001\u0000\u0000"+
		"\u0000\u05e5\u05e8\u0003\u00a0P\u0000\u05e6\u05e8\u0005_\u0000\u0000\u05e7"+
		"\u05e5\u0001\u0000\u0000\u0000\u05e7\u05e6\u0001\u0000\u0000\u0000\u05e8"+
		"\u05eb\u0001\u0000\u0000\u0000\u05e9\u05ea\u0005\u000b\u0000\u0000\u05ea"+
		"\u05ec\u0003\u00a2Q\u0000\u05eb\u05e9\u0001\u0000\u0000\u0000\u05eb\u05ec"+
		"\u0001\u0000\u0000\u0000\u05ec\u0601\u0001\u0000\u0000\u0000\u05ed\u05ee"+
		"\u0005\u00af\u0000\u0000\u05ee\u05ef\u0005\u000b\u0000\u0000\u05ef\u0601"+
		"\u0003\u0084B\u0000\u05f0\u05f1\u0005\u009c\u0000\u0000\u05f1\u05f2\u0005"+
		"\u000b\u0000\u0000\u05f2\u0601\u0005\u00b0\u0000\u0000\u05f3\u05f4\u0005"+
		"\u009d\u0000\u0000\u05f4\u05f5\u0005\u000b\u0000\u0000\u05f5\u0601\u0005"+
		"\u00b0\u0000\u0000\u05f6\u05f7\u0005\u0003\u0000\u0000\u05f7\u05f8\u0005"+
		"\u009c\u0000\u0000\u05f8\u05f9\u0005\u0004\u0000\u0000\u05f9\u05fa\u0005"+
		"\u000b\u0000\u0000\u05fa\u0601\u0005\u00b0\u0000\u0000\u05fb\u05fc\u0005"+
		"\u0003\u0000\u0000\u05fc\u05fd\u0005\u009d\u0000\u0000\u05fd\u05fe\u0005"+
		"\u0004\u0000\u0000\u05fe\u05ff\u0005\u000b\u0000\u0000\u05ff\u0601\u0005"+
		"\u00b0\u0000\u0000\u0600\u05e3\u0001\u0000\u0000\u0000\u0600\u05ed\u0001"+
		"\u0000\u0000\u0000\u0600\u05f0\u0001\u0000\u0000\u0000\u0600\u05f3\u0001"+
		"\u0000\u0000\u0000\u0600\u05f6\u0001\u0000\u0000\u0000\u0600\u05fb\u0001"+
		"\u0000\u0000\u0000\u0601\u009f\u0001\u0000\u0000\u0000\u0602\u0615\u0005"+
		"\u00b9\u0000\u0000\u0603\u0615\u0005\u00af\u0000\u0000\u0604\u0609\u0005"+
		"\u00ae\u0000\u0000\u0605\u0606\u0005\u0014\u0000\u0000\u0606\u0608\u0005"+
		"\u00ae\u0000\u0000\u0607\u0605\u0001\u0000\u0000\u0000\u0608\u060b\u0001"+
		"\u0000\u0000\u0000\u0609\u0607\u0001\u0000\u0000\u0000\u0609\u060a\u0001"+
		"\u0000\u0000\u0000\u060a\u0615\u0001\u0000\u0000\u0000\u060b\u0609\u0001"+
		"\u0000\u0000\u0000\u060c\u060d\u0005\u0005\u0000\u0000\u060d\u060e\u0005"+
		"\u00ae\u0000\u0000\u060e\u0615\u0005\u0006\u0000\u0000\u060f\u0610\u0005"+
		"\u0003\u0000\u0000\u0610\u0611\u0005\u00ae\u0000\u0000\u0611\u0615\u0005"+
		"\u0004\u0000\u0000\u0612\u0615\u0005\u009c\u0000\u0000\u0613\u0615\u0005"+
		"\u009d\u0000\u0000\u0614\u0602\u0001\u0000\u0000\u0000\u0614\u0603\u0001"+
		"\u0000\u0000\u0000\u0614\u0604\u0001\u0000\u0000\u0000\u0614\u060c\u0001"+
		"\u0000\u0000\u0000\u0614\u060f\u0001\u0000\u0000\u0000\u0614\u0612\u0001"+
		"\u0000\u0000\u0000\u0614\u0613\u0001\u0000\u0000\u0000\u0615\u00a1\u0001"+
		"\u0000\u0000\u0000\u0616\u061b\u0005\u00ba\u0000\u0000\u0617\u061b\u0005"+
		"\u00b0\u0000\u0000\u0618\u061b\u0003\u00a4R\u0000\u0619\u061b\u0003\u0096"+
		"K\u0000\u061a\u0616\u0001\u0000\u0000\u0000\u061a\u0617\u0001\u0000\u0000"+
		"\u0000\u061a\u0618\u0001\u0000\u0000\u0000\u061a\u0619\u0001\u0000\u0000"+
		"\u0000\u061b\u00a3\u0001\u0000\u0000\u0000\u061c\u061d\u00059\u0000\u0000"+
		"\u061d\u061e\u0003\u00a6S\u0000\u061e\u061f\u0005:\u0000\u0000\u061f\u00a5"+
		"\u0001\u0000\u0000\u0000\u0620\u0621\u0003\u0084B\u0000\u0621\u0622\u0005"+
		"\u0010\u0000\u0000\u0622\u0623\u0003\u00b6[\u0000\u0623\u0626\u0001\u0000"+
		"\u0000\u0000\u0624\u0626\u0003\u008eG\u0000\u0625\u0620\u0001\u0000\u0000"+
		"\u0000\u0625\u0624\u0001\u0000\u0000\u0000\u0626\u00a7\u0001\u0000\u0000"+
		"\u0000\u0627\u062a\u0003\u00d2i\u0000\u0628\u0629\u0005\u0003\u0000\u0000"+
		"\u0629\u062b\u0005\u0004\u0000\u0000\u062a\u0628\u0001\u0000\u0000\u0000"+
		"\u062a\u062b\u0001\u0000\u0000\u0000\u062b\u062e\u0001\u0000\u0000\u0000"+
		"\u062c\u062e\u0003\u008eG\u0000\u062d\u0627\u0001\u0000\u0000\u0000\u062d"+
		"\u062c\u0001\u0000\u0000\u0000\u062e\u00a9\u0001\u0000\u0000\u0000\u062f"+
		"\u0634\u0003\u00b8\\\u0000\u0630\u0634\u0003 \u0010\u0000\u0631\u0634"+
		"\u0003\u00acV\u0000\u0632\u0634\u0003\u00aeW\u0000\u0633\u062f\u0001\u0000"+
		"\u0000\u0000\u0633\u0630\u0001\u0000\u0000\u0000\u0633\u0631\u0001\u0000"+
		"\u0000\u0000\u0633\u0632\u0001\u0000\u0000\u0000\u0634\u00ab\u0001\u0000"+
		"\u0000\u0000\u0635\u0636\u0005\u0003\u0000\u0000\u0636\u0637\u0003~?\u0000"+
		"\u0637\u0638\u0005\u0004\u0000\u0000\u0638\u00ad\u0001\u0000\u0000\u0000"+
		"\u0639\u0645\u0005\u0007\u0000\u0000\u063a\u063f\u0003\u0082A\u0000\u063b"+
		"\u063c\u0005\n\u0000\u0000\u063c\u063e\u0003\u0082A\u0000\u063d\u063b"+
		"\u0001\u0000\u0000\u0000\u063e\u0641\u0001\u0000\u0000\u0000\u063f\u063d"+
		"\u0001\u0000\u0000\u0000\u063f\u0640\u0001\u0000\u0000\u0000\u0640\u0643"+
		"\u0001\u0000\u0000\u0000\u0641\u063f\u0001\u0000\u0000\u0000\u0642\u0644"+
		"\u0005\n\u0000\u0000\u0643\u0642\u0001\u0000\u0000\u0000\u0643\u0644\u0001"+
		"\u0000\u0000\u0000\u0644\u0646\u0001\u0000\u0000\u0000\u0645\u063a\u0001"+
		"\u0000\u0000\u0000\u0645\u0646\u0001\u0000\u0000\u0000\u0646\u0647\u0001"+
		"\u0000\u0000\u0000\u0647\u0648\u0005\b\u0000\u0000\u0648\u00af\u0001\u0000"+
		"\u0000\u0000\u0649\u064a\u0007\t\u0000\u0000\u064a\u00b1\u0001\u0000\u0000"+
		"\u0000\u064b\u0650\u0005;\u0000\u0000\u064c\u0650\u0005<\u0000\u0000\u064d"+
		"\u0650\u0005\u00b0\u0000\u0000\u064e\u0650\u0003\u00b4Z\u0000\u064f\u064b"+
		"\u0001\u0000\u0000\u0000\u064f\u064c\u0001\u0000\u0000\u0000\u064f\u064d"+
		"\u0001\u0000\u0000\u0000\u064f\u064e\u0001\u0000\u0000\u0000\u0650\u00b3"+
		"\u0001\u0000\u0000\u0000\u0651\u0652\u0005=\u0000\u0000\u0652\u00b5\u0001"+
		"\u0000\u0000\u0000\u0653\u0656\u0003\u00b8\\\u0000\u0654\u0656\u0003\u001e"+
		"\u000f\u0000\u0655\u0653\u0001\u0000\u0000\u0000\u0655\u0654\u0001\u0000"+
		"\u0000\u0000\u0656\u00b7\u0001\u0000\u0000\u0000\u0657\u0658\u0007\n\u0000"+
		"\u0000\u0658\u00b9\u0001\u0000\u0000\u0000\u0659\u065d\u0003\u00b8\\\u0000"+
		"\u065a\u065d\u0005y\u0000\u0000\u065b\u065d\u0005|\u0000\u0000\u065c\u0659"+
		"\u0001\u0000\u0000\u0000\u065c\u065a\u0001\u0000\u0000\u0000\u065c\u065b"+
		"\u0001\u0000\u0000\u0000\u065d\u00bb\u0001\u0000\u0000\u0000\u065e\u0661"+
		"\u0003\u00acV\u0000\u065f\u0661\u0003\u00aeW\u0000\u0660\u065e\u0001\u0000"+
		"\u0000\u0000\u0660\u065f\u0001\u0000\u0000\u0000\u0661\u00bd\u0001\u0000"+
		"\u0000\u0000\u0662\u0664\u0005\u001e\u0000\u0000\u0663\u0665\u0003\u00c0"+
		"`\u0000\u0664\u0663\u0001\u0000\u0000\u0000\u0664\u0665\u0001\u0000\u0000"+
		"\u0000\u0665\u0666\u0001\u0000\u0000\u0000\u0666\u0667\u0005\u001f\u0000"+
		"\u0000\u0667\u00bf\u0001\u0000\u0000\u0000\u0668\u066d\u0003\u00c2a\u0000"+
		"\u0669\u066a\u0005\n\u0000\u0000\u066a\u066c\u0003\u00c2a\u0000\u066b"+
		"\u0669\u0001\u0000\u0000\u0000\u066c\u066f\u0001\u0000\u0000\u0000\u066d"+
		"\u066b\u0001\u0000\u0000\u0000\u066d\u066e\u0001\u0000\u0000\u0000\u066e"+
		"\u00c1\u0001\u0000\u0000\u0000\u066f\u066d\u0001\u0000\u0000\u0000\u0670"+
		"\u0672\u0003\u00b8\\\u0000\u0671\u0673\u0003\u00c4b\u0000\u0672\u0671"+
		"\u0001\u0000\u0000\u0000\u0672\u0673\u0001\u0000\u0000\u0000\u0673\u067a"+
		"\u0001\u0000\u0000\u0000\u0674\u0675\u0003\u00b8\\\u0000\u0675\u0676\u0005"+
		"\u000b\u0000\u0000\u0676\u0677\u0003\u00cae\u0000\u0677\u067a\u0001\u0000"+
		"\u0000\u0000\u0678\u067a\u0003\u00be_\u0000\u0679\u0670\u0001\u0000\u0000"+
		"\u0000\u0679\u0674\u0001\u0000\u0000\u0000\u0679\u0678\u0001\u0000\u0000"+
		"\u0000\u067a\u00c3\u0001\u0000\u0000\u0000\u067b\u067c\u0005a\u0000\u0000"+
		"\u067c\u067d\u0003\u00ccf\u0000\u067d\u00c5\u0001\u0000\u0000\u0000\u067e"+
		"\u0680\u0005\u001e\u0000\u0000\u067f\u0681\u0003\u00c8d\u0000\u0680\u067f"+
		"\u0001\u0000\u0000\u0000\u0680\u0681\u0001\u0000\u0000\u0000\u0681\u0682"+
		"\u0001\u0000\u0000\u0000\u0682\u0683\u0005\u001f\u0000\u0000\u0683\u00c7"+
		"\u0001\u0000\u0000\u0000\u0684\u0689\u0003\u00cae\u0000\u0685\u0686\u0005"+
		"\n\u0000\u0000\u0686\u0688\u0003\u00cae\u0000\u0687\u0685\u0001\u0000"+
		"\u0000\u0000\u0688\u068b\u0001\u0000\u0000\u0000\u0689\u0687\u0001\u0000"+
		"\u0000\u0000\u0689\u068a\u0001\u0000\u0000\u0000\u068a\u00c9\u0001\u0000"+
		"\u0000\u0000\u068b\u0689\u0001\u0000\u0000\u0000\u068c\u068d\u0003\u00cc"+
		"f\u0000\u068d\u00cb\u0001\u0000\u0000\u0000\u068e\u0690\u0007\u000b\u0000"+
		"\u0000\u068f\u068e\u0001\u0000\u0000\u0000\u068f\u0690\u0001\u0000\u0000"+
		"\u0000\u0690\u0691\u0001\u0000\u0000\u0000\u0691\u0696\u0003\u00ceg\u0000"+
		"\u0692\u0696\u0003\u00dcn\u0000\u0693\u0696\u0003\u00deo\u0000\u0694\u0696"+
		"\u0003\u00d6k\u0000\u0695\u068f\u0001\u0000\u0000\u0000\u0695\u0692\u0001"+
		"\u0000\u0000\u0000\u0695\u0693\u0001\u0000\u0000\u0000\u0695\u0694\u0001"+
		"\u0000\u0000\u0000\u0696\u00cd\u0001\u0000\u0000\u0000\u0697\u0698\u0003"+
		"\u00d0h\u0000\u0698\u00cf\u0001\u0000\u0000\u0000\u0699\u069a\u0006h\uffff"+
		"\uffff\u0000\u069a\u069b\u0005\u0005\u0000\u0000\u069b\u069c\u0003\u00cc"+
		"f\u0000\u069c\u069d\u0005\u0006\u0000\u0000\u069d\u06ac\u0001\u0000\u0000"+
		"\u0000\u069e\u06ac\u0003\u00d2i\u0000\u069f\u06ac\u0003\u00d4j\u0000\u06a0"+
		"\u06a1\u0005\u0003\u0000\u0000\u06a1\u06a2\u0003\u00dam\u0000\u06a2\u06a3"+
		"\u0005\u0004\u0000\u0000\u06a3\u06ac\u0001\u0000\u0000\u0000\u06a4\u06ac"+
		"\u0005P\u0000\u0000\u06a5\u06a6\u0003\u00d4j\u0000\u06a6\u06a7\u0005\u0080"+
		"\u0000\u0000\u06a7\u06a8\u0003\u00d0h\u0002\u06a8\u06ac\u0001\u0000\u0000"+
		"\u0000\u06a9\u06aa\u0005x\u0000\u0000\u06aa\u06ac\u0003\u00d0h\u0001\u06ab"+
		"\u0699\u0001\u0000\u0000\u0000\u06ab\u069e\u0001\u0000\u0000\u0000\u06ab"+
		"\u069f\u0001\u0000\u0000\u0000\u06ab\u06a0\u0001\u0000\u0000\u0000\u06ab"+
		"\u06a4\u0001\u0000\u0000\u0000\u06ab\u06a5\u0001\u0000\u0000\u0000\u06ab"+
		"\u06a9\u0001\u0000\u0000\u0000\u06ac\u06b5\u0001\u0000\u0000\u0000\u06ad"+
		"\u06ae\n\u0005\u0000\u0000\u06ae\u06b0\u0005\u0003\u0000\u0000\u06af\u06b1"+
		"\u0003\u00d0h\u0000\u06b0\u06af\u0001\u0000\u0000\u0000\u06b0\u06b1\u0001"+
		"\u0000\u0000\u0000\u06b1\u06b2\u0001\u0000\u0000\u0000\u06b2\u06b4\u0005"+
		"\u0004\u0000\u0000\u06b3\u06ad\u0001\u0000\u0000\u0000\u06b4\u06b7\u0001"+
		"\u0000\u0000\u0000\u06b5\u06b3\u0001\u0000\u0000\u0000\u06b5\u06b6\u0001"+
		"\u0000\u0000\u0000\u06b6\u00d1\u0001\u0000\u0000\u0000\u06b7\u06b5\u0001"+
		"\u0000\u0000\u0000\u06b8\u06d2\u0005n\u0000\u0000\u06b9\u06d2\u0005;\u0000"+
		"\u0000\u06ba\u06d2\u0005o\u0000\u0000\u06bb\u06d2\u0005=\u0000\u0000\u06bc"+
		"\u06d2\u0005q\u0000\u0000\u06bd\u06d2\u0005<\u0000\u0000\u06be\u06d2\u0005"+
		"r\u0000\u0000\u06bf\u06d2\u0005\u00b0\u0000\u0000\u06c0\u06c2\u0005s\u0000"+
		"\u0000\u06c1\u06c0\u0001\u0000\u0000\u0000\u06c1\u06c2\u0001\u0000\u0000"+
		"\u0000\u06c2\u06c3\u0001\u0000\u0000\u0000\u06c3\u06d2\u0005t\u0000\u0000"+
		"\u06c4\u06d2\u0005p\u0000\u0000\u06c5\u06d2\u0005u\u0000\u0000\u06c6\u06d2"+
		"\u0005v\u0000\u0000\u06c7\u06d2\u0005I\u0000\u0000\u06c8\u06d2\u0005\u0095"+
		"\u0000\u0000\u06c9\u06d2\u0005\u008f\u0000\u0000\u06ca\u06d2\u0005\u0092"+
		"\u0000\u0000\u06cb\u06d2\u0005\u0093\u0000\u0000\u06cc\u06d2\u0005\u0094"+
		"\u0000\u0000\u06cd\u06d2\u0005\u0096\u0000\u0000\u06ce\u06d2\u0005\u0097"+
		"\u0000\u0000\u06cf\u06d2\u0005\u0098\u0000\u0000\u06d0\u06d2\u0005\u009a"+
		"\u0000\u0000\u06d1\u06b8\u0001\u0000\u0000\u0000\u06d1\u06b9\u0001\u0000"+
		"\u0000\u0000\u06d1\u06ba\u0001\u0000\u0000\u0000\u06d1\u06bb\u0001\u0000"+
		"\u0000\u0000\u06d1\u06bc\u0001\u0000\u0000\u0000\u06d1\u06bd\u0001\u0000"+
		"\u0000\u0000\u06d1\u06be\u0001\u0000\u0000\u0000\u06d1\u06bf\u0001\u0000"+
		"\u0000\u0000\u06d1\u06c1\u0001\u0000\u0000\u0000\u06d1\u06c4\u0001\u0000"+
		"\u0000\u0000\u06d1\u06c5\u0001\u0000\u0000\u0000\u06d1\u06c6\u0001\u0000"+
		"\u0000\u0000\u06d1\u06c7\u0001\u0000\u0000\u0000\u06d1\u06c8\u0001\u0000"+
		"\u0000\u0000\u06d1\u06c9\u0001\u0000\u0000\u0000\u06d1\u06ca\u0001\u0000"+
		"\u0000\u0000\u06d1\u06cb\u0001\u0000\u0000\u0000\u06d1\u06cc\u0001\u0000"+
		"\u0000\u0000\u06d1\u06cd\u0001\u0000\u0000\u0000\u06d1\u06ce\u0001\u0000"+
		"\u0000\u0000\u06d1\u06cf\u0001\u0000\u0000\u0000\u06d1\u06d0\u0001\u0000"+
		"\u0000\u0000\u06d2\u00d3\u0001\u0000\u0000\u0000\u06d3\u06d5\u0003\u00d8"+
		"l\u0000\u06d4\u06d6\u0003\u00d6k\u0000\u06d5\u06d4\u0001\u0000\u0000\u0000"+
		"\u06d5\u06d6\u0001\u0000\u0000\u0000\u06d6\u00d5\u0001\u0000\u0000\u0000"+
		"\u06d7\u06d8\u0005\u001e\u0000\u0000\u06d8\u06da\u0003\u00c8d\u0000\u06d9"+
		"\u06db\u0003\u00d6k\u0000\u06da\u06d9\u0001\u0000\u0000\u0000\u06da\u06db"+
		"\u0001\u0000\u0000\u0000\u06db\u06dc\u0001\u0000\u0000\u0000\u06dc\u06dd"+
		"\u0005\u001f\u0000\u0000\u06dd\u00d7\u0001\u0000\u0000\u0000\u06de\u06e1"+
		"\u0003\u00b8\\\u0000\u06df\u06e1\u0003\u00f6{\u0000\u06e0\u06de\u0001"+
		"\u0000\u0000\u0000\u06e0\u06df\u0001\u0000\u0000\u0000\u06e1\u00d9\u0001"+
		"\u0000\u0000\u0000\u06e2\u06e7\u0003\u00ccf\u0000\u06e3\u06e4\u0005\n"+
		"\u0000\u0000\u06e4\u06e6\u0003\u00ccf\u0000\u06e5\u06e3\u0001\u0000\u0000"+
		"\u0000\u06e6\u06e9\u0001\u0000\u0000\u0000\u06e7\u06e5\u0001\u0000\u0000"+
		"\u0000\u06e7\u06e8\u0001\u0000\u0000\u0000\u06e8\u06eb\u0001\u0000\u0000"+
		"\u0000\u06e9\u06e7\u0001\u0000\u0000\u0000\u06ea\u06ec\u0005\n\u0000\u0000"+
		"\u06eb\u06ea\u0001\u0000\u0000\u0000\u06eb\u06ec\u0001\u0000\u0000\u0000"+
		"\u06ec\u00db\u0001\u0000\u0000\u0000\u06ed\u06ef\u0003\u00be_\u0000\u06ee"+
		"\u06ed\u0001\u0000\u0000\u0000\u06ee\u06ef\u0001\u0000\u0000\u0000\u06ef"+
		"\u06f0\u0001\u0000\u0000\u0000\u06f0\u06f2\u0005\u0005\u0000\u0000\u06f1"+
		"\u06f3\u0003\u00e4r\u0000\u06f2\u06f1\u0001\u0000\u0000\u0000\u06f2\u06f3"+
		"\u0001\u0000\u0000\u0000\u06f3\u06f4\u0001\u0000\u0000\u0000\u06f4\u06f5"+
		"\u0005\u0006\u0000\u0000\u06f5\u06f6\u00058\u0000\u0000\u06f6\u06f7\u0003"+
		"\u00ccf\u0000\u06f7\u00dd\u0001\u0000\u0000\u0000\u06f8\u06fa\u0005D\u0000"+
		"\u0000\u06f9\u06fb\u0003\u00be_\u0000\u06fa\u06f9\u0001\u0000\u0000\u0000"+
		"\u06fa\u06fb\u0001\u0000\u0000\u0000\u06fb\u06fc\u0001\u0000\u0000\u0000"+
		"\u06fc\u06fe\u0005\u0005\u0000\u0000\u06fd\u06ff\u0003\u00e4r\u0000\u06fe"+
		"\u06fd\u0001\u0000\u0000\u0000\u06fe\u06ff\u0001\u0000\u0000\u0000\u06ff"+
		"\u0700\u0001\u0000\u0000\u0000\u0700\u0701\u0005\u0006\u0000\u0000\u0701"+
		"\u0702\u00058\u0000\u0000\u0702\u0703\u0003\u00ccf\u0000\u0703\u00df\u0001"+
		"\u0000\u0000\u0000\u0704\u0705\u0005\u000e\u0000\u0000\u0705\u0706\u0003"+
		"\u00ccf\u0000\u0706\u00e1\u0001\u0000\u0000\u0000\u0707\u0709\u0003\u00be"+
		"_\u0000\u0708\u0707\u0001\u0000\u0000\u0000\u0708\u0709\u0001\u0000\u0000"+
		"\u0000\u0709\u070a\u0001\u0000\u0000\u0000\u070a\u070c\u0005\u0005\u0000"+
		"\u0000\u070b\u070d\u0003\u00e4r\u0000\u070c\u070b\u0001\u0000\u0000\u0000"+
		"\u070c\u070d\u0001\u0000\u0000\u0000\u070d\u070e\u0001\u0000\u0000\u0000"+
		"\u070e\u0710\u0005\u0006\u0000\u0000\u070f\u0711\u0003\u00e0p\u0000\u0710"+
		"\u070f\u0001\u0000\u0000\u0000\u0710\u0711\u0001\u0000\u0000\u0000\u0711"+
		"\u00e3\u0001\u0000\u0000\u0000\u0712\u0723\u0003\u00e8t\u0000\u0713\u0718"+
		"\u0003\u00e6s\u0000\u0714\u0715\u0005\n\u0000\u0000\u0715\u0717\u0003"+
		"\u00e6s\u0000\u0716\u0714\u0001\u0000\u0000\u0000\u0717\u071a\u0001\u0000"+
		"\u0000\u0000\u0718\u0716\u0001\u0000\u0000\u0000\u0718\u0719\u0001\u0000"+
		"\u0000\u0000\u0719\u071d\u0001\u0000\u0000\u0000\u071a\u0718\u0001\u0000"+
		"\u0000\u0000\u071b\u071c\u0005\n\u0000\u0000\u071c\u071e\u0003\u00e8t"+
		"\u0000\u071d\u071b\u0001\u0000\u0000\u0000\u071d\u071e\u0001\u0000\u0000"+
		"\u0000\u071e\u0720\u0001\u0000\u0000\u0000\u071f\u0721\u0005\n\u0000\u0000"+
		"\u0720\u071f\u0001\u0000\u0000\u0000\u0720\u0721\u0001\u0000\u0000\u0000"+
		"\u0721\u0723\u0001\u0000\u0000\u0000\u0722\u0712\u0001\u0000\u0000\u0000"+
		"\u0722\u0713\u0001\u0000\u0000\u0000\u0723\u00e5\u0001\u0000\u0000\u0000"+
		"\u0724\u0725\u0003\u00eau\u0000\u0725\u00e7\u0001\u0000\u0000\u0000\u0726"+
		"\u0727\u0005\u000f\u0000\u0000\u0727\u0729\u0003\u008eG\u0000\u0728\u072a"+
		"\u0003\u00e0p\u0000\u0729\u0728\u0001\u0000\u0000\u0000\u0729\u072a\u0001"+
		"\u0000\u0000\u0000\u072a\u00e9\u0001\u0000\u0000\u0000\u072b\u072d\u0003"+
		"\u00f8|\u0000\u072c\u072b\u0001\u0000\u0000\u0000\u072c\u072d\u0001\u0000"+
		"\u0000\u0000\u072d\u072f\u0001\u0000\u0000\u0000\u072e\u0730\u0003\u00ec"+
		"v\u0000\u072f\u072e\u0001\u0000\u0000\u0000\u072f\u0730\u0001\u0000\u0000"+
		"\u0000\u0730\u0731\u0001\u0000\u0000\u0000\u0731\u0733\u0003\u00eew\u0000"+
		"\u0732\u0734\u0003\u00e0p\u0000\u0733\u0732\u0001\u0000\u0000\u0000\u0733"+
		"\u0734\u0001\u0000\u0000\u0000\u0734\u00eb\u0001\u0000\u0000\u0000\u0735"+
		"\u0736\u0007\f\u0000\u0000\u0736\u00ed\u0001\u0000\u0000\u0000\u0737\u073a"+
		"\u0003\u00b6[\u0000\u0738\u073a\u0003\u00bc^\u0000\u0739\u0737\u0001\u0000"+
		"\u0000\u0000\u0739\u0738\u0001\u0000\u0000\u0000\u073a\u00ef\u0001\u0000"+
		"\u0000\u0000\u073b\u073c\u0005\u0003\u0000\u0000\u073c\u073d\u0003\u00b8"+
		"\\\u0000\u073d\u073e\u0005\u000e\u0000\u0000\u073e\u073f\u0007\r\u0000"+
		"\u0000\u073f\u0740\u0005\u0004\u0000\u0000\u0740\u0741\u0003\u00e0p\u0000"+
		"\u0741\u00f1\u0001\u0000\u0000\u0000\u0742\u0744\u0003\u00ecv\u0000\u0743"+
		"\u0742\u0001\u0000\u0000\u0000\u0743\u0744\u0001\u0000\u0000\u0000\u0744"+
		"\u0745\u0001\u0000\u0000\u0000\u0745\u0746\u0005z\u0000\u0000\u0746\u0748"+
		"\u0005\u0005\u0000\u0000\u0747\u0749\u0003v;\u0000\u0748\u0747\u0001\u0000"+
		"\u0000\u0000\u0748\u0749\u0001\u0000\u0000\u0000\u0749\u074a\u0001\u0000"+
		"\u0000\u0000\u074a\u0750\u0005\u0006\u0000\u0000\u074b\u074c\u0005\u0007"+
		"\u0000\u0000\u074c\u074d\u0003|>\u0000\u074d\u074e\u0005\b\u0000\u0000"+
		"\u074e\u0751\u0001\u0000\u0000\u0000\u074f\u0751\u0005\t\u0000\u0000\u0750"+
		"\u074b\u0001\u0000\u0000\u0000\u0750\u074f\u0001\u0000\u0000\u0000\u0750"+
		"\u0751\u0001\u0000\u0000\u0000\u0751\u00f3\u0001\u0000\u0000\u0000\u0752"+
		"\u0757\u0003\u00d4j\u0000\u0753\u0754\u0005\n\u0000\u0000\u0754\u0756"+
		"\u0003\u00d4j\u0000\u0755\u0753\u0001\u0000\u0000\u0000\u0756\u0759\u0001"+
		"\u0000\u0000\u0000\u0757\u0755\u0001\u0000\u0000\u0000\u0757\u0758\u0001"+
		"\u0000\u0000\u0000\u0758\u00f5\u0001\u0000\u0000\u0000\u0759\u0757\u0001"+
		"\u0000\u0000\u0000\u075a\u0763\u0003\u00b8\\\u0000\u075b\u075d\u0005\u0010"+
		"\u0000\u0000\u075c\u075b\u0001\u0000\u0000\u0000\u075d\u075e\u0001\u0000"+
		"\u0000\u0000\u075e\u075c\u0001\u0000\u0000\u0000\u075e\u075f\u0001\u0000"+
		"\u0000\u0000\u075f\u0760\u0001\u0000\u0000\u0000\u0760\u0762\u0003\u00b8"+
		"\\\u0000\u0761\u075c\u0001\u0000\u0000\u0000\u0762\u0765\u0001\u0000\u0000"+
		"\u0000\u0763\u0761\u0001\u0000\u0000\u0000\u0763\u0764\u0001\u0000\u0000"+
		"\u0000\u0764\u00f7\u0001\u0000\u0000\u0000\u0765\u0763\u0001\u0000\u0000"+
		"\u0000\u0766\u0768\u0003\u00fa}\u0000\u0767\u0766\u0001\u0000\u0000\u0000"+
		"\u0768\u0769\u0001\u0000\u0000\u0000\u0769\u0767\u0001\u0000\u0000\u0000"+
		"\u0769\u076a\u0001\u0000\u0000\u0000\u076a\u00f9\u0001\u0000\u0000\u0000"+
		"\u076b\u076e\u0005\u00ad\u0000\u0000\u076c\u076f\u0003\u00fc~\u0000\u076d"+
		"\u076f\u0003\u00fe\u007f\u0000\u076e\u076c\u0001\u0000\u0000\u0000\u076e"+
		"\u076d\u0001\u0000\u0000\u0000\u076f\u00fb\u0001\u0000\u0000\u0000\u0770"+
		"\u0771\u0006~\uffff\uffff\u0000\u0771\u0777\u0003\u00b8\\\u0000\u0772"+
		"\u0773\u0005\u0005\u0000\u0000\u0773\u0774\u0003\u008eG\u0000\u0774\u0775"+
		"\u0005\u0006\u0000\u0000\u0775\u0777\u0001\u0000\u0000\u0000\u0776\u0770"+
		"\u0001\u0000\u0000\u0000\u0776\u0772\u0001\u0000\u0000\u0000\u0777\u077d"+
		"\u0001\u0000\u0000\u0000\u0778\u0779\n\u0002\u0000\u0000\u0779\u077a\u0005"+
		"\u0010\u0000\u0000\u077a\u077c\u0003\u00b6[\u0000\u077b\u0778\u0001\u0000"+
		"\u0000\u0000\u077c\u077f\u0001\u0000\u0000\u0000\u077d\u077b\u0001\u0000"+
		"\u0000\u0000\u077d\u077e\u0001\u0000\u0000\u0000\u077e\u00fd\u0001\u0000"+
		"\u0000\u0000\u077f\u077d\u0001\u0000\u0000\u0000\u0780\u0781\u0003\u00fc"+
		"~\u0000\u0781\u0782\u0003\u0086C\u0000\u0782\u00ff\u0001\u0000\u0000\u0000"+
		"\u0783\u0784\u0007\u000e\u0000\u0000\u0784\u0101\u0001\u0000\u0000\u0000"+
		"\u00e7\u0103\u010a\u0120\u0124\u012a\u012d\u0130\u0133\u0136\u013a\u013e"+
		"\u0142\u0144\u014b\u014f\u0158\u015b\u015f\u0161\u0164\u0169\u016f\u0172"+
		"\u0178\u017e\u0182\u018b\u01b6\u01c9\u01df\u01e8\u01f4\u0200\u0207\u020f"+
		"\u021b\u022e\u023a\u023f\u0244\u024b\u0252\u0257\u025b\u0262\u026a\u026f"+
		"\u0271\u0278\u027c\u0285\u0289\u0291\u0299\u029d\u02a5\u02aa\u02ac\u02b3"+
		"\u02b8\u02bb\u02bf\u02c5\u02cb\u02ce\u02d1\u02d5\u02d8\u02de\u02e7\u02fa"+
		"\u02fe\u0302\u030c\u0310\u0328\u0330\u0337\u0340\u0345\u034b\u0351\u0357"+
		"\u0360\u036a\u036e\u0370\u0377\u037d\u0382\u038c\u038f\u0395\u0399\u03a8"+
		"\u03ad\u03b2\u03b5\u03c1\u03c4\u03c7\u03ca\u03cd\u03d0\u03db\u03df\u03e8"+
		"\u03f4\u03f9\u03fc\u0403\u0405\u0408\u040b\u040f\u0412\u0416\u041b\u041e"+
		"\u0423\u0427\u042c\u0431\u0437\u043b\u043f\u0442\u0450\u0454\u045d\u0462"+
		"\u0464\u046d\u0471\u0475\u047c\u0482\u0485\u048d\u0494\u04ad\u04b1\u04be"+
		"\u04e7\u04f8\u0504\u050f\u0517\u052f\u055f\u0567\u056b\u056f\u0573\u0577"+
		"\u057b\u0588\u058a\u0590\u0597\u05a6\u05b2\u05bd\u05c2\u05c6\u05cb\u05cd"+
		"\u05d1\u05e0\u05e3\u05e7\u05eb\u0600\u0609\u0614\u061a\u0625\u062a\u062d"+
		"\u0633\u063f\u0643\u0645\u064f\u0655\u065c\u0660\u0664\u066d\u0672\u0679"+
		"\u0680\u0689\u068f\u0695\u06ab\u06b0\u06b5\u06c1\u06d1\u06d5\u06da\u06e0"+
		"\u06e7\u06eb\u06ee\u06f2\u06fa\u06fe\u0708\u070c\u0710\u0718\u071d\u0720"+
		"\u0722\u0729\u072c\u072f\u0733\u0739\u0743\u0748\u0750\u0757\u075e\u0763"+
		"\u0769\u076e\u0776\u077d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}