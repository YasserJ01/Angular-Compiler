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
		ForRoot=136, ForFeature=137, Select=138, Dispatch=139, Navigate=140, At=141, 
		Identifier=142, AngularDirective=143, StringLiteral=144, WhiteSpaces=145, 
		HtmlComment=146, CDataComment=147, UnexpectedCharacter=148, TagOpen=149, 
		TagClose=150, TagSlashClose=151, TagSlash=152, TagName=153, AttributeValue=154, 
		Attribute=155, TagEquals=156;
	public static final int
		RULE_program = 0, RULE_sourceElements = 1, RULE_sourceElement = 2, RULE_statement = 3, 
		RULE_block = 4, RULE_variableStatement = 5, RULE_importStatement = 6, 
		RULE_exportStatement = 7, RULE_classDeclaration = 8, RULE_classHeritage = 9, 
		RULE_classTail = 10, RULE_functionDeclaration = 11, RULE_reservedWord = 12, 
		RULE_keyword = 13, RULE_statementList = 14, RULE_abstractDeclaration = 15, 
		RULE_importFromBlock = 16, RULE_importModuleItems = 17, RULE_importAliasName = 18, 
		RULE_moduleExportName = 19, RULE_importedBinding = 20, RULE_importDefault = 21, 
		RULE_importNamespace = 22, RULE_importFrom = 23, RULE_aliasName = 24, 
		RULE_exportFromBlock = 25, RULE_exportModuleItems = 26, RULE_exportAliasName = 27, 
		RULE_declaration = 28, RULE_variableDeclarationList = 29, RULE_variableDeclaration = 30, 
		RULE_emptyStatement_ = 31, RULE_expressionStatement = 32, RULE_ifStatement = 33, 
		RULE_iterationStatement = 34, RULE_varModifier = 35, RULE_continueStatement = 36, 
		RULE_breakStatement = 37, RULE_returnStatement = 38, RULE_switchStatement = 39, 
		RULE_caseBlock = 40, RULE_caseClauses = 41, RULE_caseClause = 42, RULE_defaultClause = 43, 
		RULE_throwStatement = 44, RULE_tryStatement = 45, RULE_catchProduction = 46, 
		RULE_finallyProduction = 47, RULE_classExtendsClause = 48, RULE_implementsClause = 49, 
		RULE_classElement = 50, RULE_propertyMemberDeclaration = 51, RULE_propertyMemberBase = 52, 
		RULE_indexMemberDeclaration = 53, RULE_iteratorBlock = 54, RULE_iteratorDefinition = 55, 
		RULE_formalParameterList = 56, RULE_formalParameterArg = 57, RULE_lastFormalParameterArg = 58, 
		RULE_functionBody = 59, RULE_elementList = 60, RULE_arrayElement = 61, 
		RULE_propertyAssignment = 62, RULE_propertyName = 63, RULE_arguments = 64, 
		RULE_argumentList = 65, RULE_argument = 66, RULE_expressionSequence = 67, 
		RULE_singleExpression = 68, RULE_htmlElements = 69, RULE_htmlElement = 70, 
		RULE_htmlContent = 71, RULE_objectExpressionSequence = 72, RULE_htmlTagStartName = 73, 
		RULE_htmlTagClosingName = 74, RULE_htmlTagName = 75, RULE_htmlAttribute = 76, 
		RULE_htmlAttributeName = 77, RULE_htmlAttributeValue = 78, RULE_interpolationExpression = 79, 
		RULE_htmlSequence = 80, RULE_asExpression = 81, RULE_assignable = 82, 
		RULE_arrayLiteral = 83, RULE_objectLiteral = 84, RULE_assignmentOperator = 85, 
		RULE_literal = 86, RULE_numericLiteral = 87, RULE_identifierName = 88, 
		RULE_identifier = 89, RULE_identifierOrKeyWord = 90, RULE_bindingPattern = 91, 
		RULE_typeParameters = 92, RULE_typeParameterList = 93, RULE_typeParameter = 94, 
		RULE_constraint = 95, RULE_typeArguments = 96, RULE_typeArgumentList = 97, 
		RULE_typeArgument = 98, RULE_type_ = 99, RULE_unionOrIntersectionOrPrimaryType = 100, 
		RULE_primaryType = 101, RULE_predefinedType = 102, RULE_typeReference = 103, 
		RULE_typeGeneric = 104, RULE_typeName = 105, RULE_tupleElementTypes = 106, 
		RULE_functionType = 107, RULE_constructorType = 108, RULE_typeAnnotation = 109, 
		RULE_callSignature = 110, RULE_parameterList = 111, RULE_parameter = 112, 
		RULE_restParameter = 113, RULE_requiredParameter = 114, RULE_accessibilityModifier = 115, 
		RULE_identifierOrPattern = 116, RULE_indexSignature = 117, RULE_constructorDeclaration = 118, 
		RULE_classOrInterfaceTypeList = 119, RULE_namespaceName = 120, RULE_decoratorList = 121, 
		RULE_decorator = 122, RULE_decoratorMemberExpression = 123, RULE_decoratorCallExpression = 124, 
		RULE_eos = 125;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElements", "sourceElement", "statement", "block", "variableStatement", 
			"importStatement", "exportStatement", "classDeclaration", "classHeritage", 
			"classTail", "functionDeclaration", "reservedWord", "keyword", "statementList", 
			"abstractDeclaration", "importFromBlock", "importModuleItems", "importAliasName", 
			"moduleExportName", "importedBinding", "importDefault", "importNamespace", 
			"importFrom", "aliasName", "exportFromBlock", "exportModuleItems", "exportAliasName", 
			"declaration", "variableDeclarationList", "variableDeclaration", "emptyStatement_", 
			"expressionStatement", "ifStatement", "iterationStatement", "varModifier", 
			"continueStatement", "breakStatement", "returnStatement", "switchStatement", 
			"caseBlock", "caseClauses", "caseClause", "defaultClause", "throwStatement", 
			"tryStatement", "catchProduction", "finallyProduction", "classExtendsClause", 
			"implementsClause", "classElement", "propertyMemberDeclaration", "propertyMemberBase", 
			"indexMemberDeclaration", "iteratorBlock", "iteratorDefinition", "formalParameterList", 
			"formalParameterArg", "lastFormalParameterArg", "functionBody", "elementList", 
			"arrayElement", "propertyAssignment", "propertyName", "arguments", "argumentList", 
			"argument", "expressionSequence", "singleExpression", "htmlElements", 
			"htmlElement", "htmlContent", "objectExpressionSequence", "htmlTagStartName", 
			"htmlTagClosingName", "htmlTagName", "htmlAttribute", "htmlAttributeName", 
			"htmlAttributeValue", "interpolationExpression", "htmlSequence", "asExpression", 
			"assignable", "arrayLiteral", "objectLiteral", "assignmentOperator", 
			"literal", "numericLiteral", "identifierName", "identifier", "identifierOrKeyWord", 
			"bindingPattern", "typeParameters", "typeParameterList", "typeParameter", 
			"constraint", "typeArguments", "typeArgumentList", "typeArgument", "type_", 
			"unionOrIntersectionOrPrimaryType", "primaryType", "predefinedType", 
			"typeReference", "typeGeneric", "typeName", "tupleElementTypes", "functionType", 
			"constructorType", "typeAnnotation", "callSignature", "parameterList", 
			"parameter", "restParameter", "requiredParameter", "accessibilityModifier", 
			"identifierOrPattern", "indexSignature", "constructorDeclaration", "classOrInterfaceTypeList", 
			"namespaceName", "decoratorList", "decorator", "decoratorMemberExpression", 
			"decoratorCallExpression", "eos"
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
			"'dispatch'", "'navigate'", "'@'", null, null, null, null, null, null, 
			null, null, null, "'/>'"
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
			"ForRoot", "ForFeature", "Select", "Dispatch", "Navigate", "At", "Identifier", 
			"AngularDirective", "StringLiteral", "WhiteSpaces", "HtmlComment", "CDataComment", 
			"UnexpectedCharacter", "TagOpen", "TagClose", "TagSlashClose", "TagSlash", 
			"TagName", "AttributeValue", "Attribute", "TagEquals"
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
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1073741825L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
				{
				setState(252);
				sourceElements();
				}
			}

			setState(255);
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
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
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
			setState(258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(257);
				sourceElement();
				}
				}
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1073741825L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0) );
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
	public static class SourceElementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSourceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSourceElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSourceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sourceElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(262);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(265); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				importStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				exportStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				emptyStatement_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(273);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(274);
				expressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(275);
				ifStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(276);
				iterationStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(277);
				continueStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(278);
				breakStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(279);
				returnStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(280);
				switchStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(281);
				throwStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(282);
				tryStatement();
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
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(OpenBrace);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1073741825L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
				{
				setState(286);
				statementList();
				}
			}

			setState(289);
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
		enterRule(_localctx, 10, RULE_variableStatement);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				bindingPattern();
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(292);
					typeAnnotation();
					}
				}

				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(295);
					match(SemiColon);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 19L) != 0)) {
					{
					setState(298);
					accessibilityModifier();
					}
				}

				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 18253611009L) != 0)) {
					{
					setState(301);
					varModifier();
					}
				}

				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ReadOnly) {
					{
					setState(304);
					match(ReadOnly);
					}
				}

				setState(307);
				variableDeclarationList();
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(308);
					match(SemiColon);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(Declare);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 18253611009L) != 0)) {
					{
					setState(312);
					varModifier();
					}
				}

				setState(315);
				variableDeclarationList();
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(316);
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
		enterRule(_localctx, 12, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(Import);
			setState(322);
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
		enterRule(_localctx, 14, RULE_exportStatement);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(Export);
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(325);
					match(Default);
					}
					break;
				}
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(328);
					exportFromBlock();
					}
					break;
				case 2:
					{
					setState(329);
					declaration();
					}
					break;
				}
				setState(332);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(Export);
				setState(335);
				match(Default);
				setState(336);
				singleExpression(0);
				setState(337);
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
		enterRule(_localctx, 16, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(341);
				decoratorList();
				}
			}

			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(344);
				match(Export);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Default) {
					{
					setState(345);
					match(Default);
					}
				}

				}
			}

			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(350);
				match(Abstract);
				}
			}

			setState(353);
			match(Class);
			setState(354);
			identifier();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(355);
				typeParameters();
				}
			}

			setState(358);
			classHeritage();
			setState(359);
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
		enterRule(_localctx, 18, RULE_classHeritage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(361);
				classExtendsClause();
				}
			}

			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(364);
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
		enterRule(_localctx, 20, RULE_classTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(OpenBrace);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1073741825L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
				{
				{
				setState(368);
				classElement();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
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
		enterRule(_localctx, 22, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(376);
				match(Async);
				}
			}

			setState(379);
			match(Function_);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Multiply) {
				{
				setState(380);
				match(Multiply);
				}
			}

			setState(383);
			identifier();
			setState(384);
			callSignature();
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				{
				{
				setState(385);
				match(OpenBrace);
				setState(386);
				functionBody();
				setState(387);
				match(CloseBrace);
				}
				}
				break;
			case SemiColon:
				{
				setState(389);
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
		enterRule(_localctx, 24, RULE_reservedWord);
		try {
			setState(395);
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
				setState(392);
				keyword();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
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
		enterRule(_localctx, 26, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
		enterRule(_localctx, 28, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(399);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(402); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 30, RULE_abstractDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(Abstract);
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(405);
				identifier();
				setState(406);
				callSignature();
				}
				break;
			case 2:
				{
				setState(408);
				variableStatement();
				}
				break;
			}
			setState(411);
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
		enterRule(_localctx, 32, RULE_importFromBlock);
		try {
			setState(425);
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
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(413);
					importDefault();
					}
					break;
				}
				setState(418);
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
				case Identifier:
					{
					setState(416);
					importNamespace();
					}
					break;
				case OpenBrace:
					{
					setState(417);
					importModuleItems();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(420);
				importFrom();
				setState(421);
				eos();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(StringLiteral);
				setState(424);
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
		enterRule(_localctx, 34, RULE_importModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(OpenBrace);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(428);
					importAliasName();
					setState(429);
					match(Comma);
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & -34359738373L) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & 2883543L) != 0)) {
				{
				setState(436);
				importAliasName();
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(437);
					match(Comma);
					}
				}

				}
			}

			setState(442);
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
		enterRule(_localctx, 36, RULE_importAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			moduleExportName();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(445);
				match(As);
				setState(446);
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
		enterRule(_localctx, 38, RULE_moduleExportName);
		try {
			setState(451);
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
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
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
		enterRule(_localctx, 40, RULE_importedBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1125899906842627L) != 0)) ) {
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
		enterRule(_localctx, 42, RULE_importDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			aliasName();
			setState(456);
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
		enterRule(_localctx, 44, RULE_importNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
				{
				setState(458);
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
			case Identifier:
				{
				setState(459);
				identifierName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(462);
				match(As);
				setState(463);
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
		enterRule(_localctx, 46, RULE_importFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(From);
			setState(467);
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
		enterRule(_localctx, 48, RULE_aliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			identifierName();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(470);
				match(As);
				setState(471);
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
		enterRule(_localctx, 50, RULE_exportFromBlock);
		int _la;
		try {
			setState(484);
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
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				importNamespace();
				setState(475);
				importFrom();
				setState(476);
				eos();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				exportModuleItems();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==From) {
					{
					setState(479);
					importFrom();
					}
				}

				setState(482);
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
		enterRule(_localctx, 52, RULE_exportModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(OpenBrace);
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(487);
					exportAliasName();
					setState(488);
					match(Comma);
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & -34359738373L) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & 2883543L) != 0)) {
				{
				setState(495);
				exportAliasName();
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(496);
					match(Comma);
					}
				}

				}
			}

			setState(501);
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
		enterRule(_localctx, 54, RULE_exportAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			moduleExportName();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(504);
				match(As);
				setState(505);
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
		enterRule(_localctx, 56, RULE_declaration);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				variableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
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
		enterRule(_localctx, 58, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(513);
				match(OpenParen);
				}
			}

			setState(516);
			variableDeclaration();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseParen) {
				{
				setState(517);
				match(CloseParen);
				}
			}

			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(520);
				match(Comma);
				setState(521);
				variableDeclaration();
				}
				}
				setState(526);
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
		enterRule(_localctx, 60, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
			case Identifier:
				{
				setState(527);
				identifierOrKeyWord();
				}
				break;
			case OpenBracket:
				{
				setState(528);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				{
				setState(529);
				objectLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(532);
				typeAnnotation();
				}
			}

			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(535);
				singleExpression(0);
				}
				break;
			}
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(538);
				match(Assign);
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(539);
					typeParameters();
					}
					break;
				}
				setState(542);
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
		enterRule(_localctx, 62, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
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
		enterRule(_localctx, 64, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			expressionSequence();
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(548);
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
		enterRule(_localctx, 66, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(If);
			setState(552);
			match(OpenParen);
			setState(553);
			expressionSequence();
			setState(554);
			match(CloseParen);
			setState(555);
			statement();
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(556);
				match(Else);
				setState(557);
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
		enterRule(_localctx, 68, RULE_iterationStatement);
		int _la;
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				match(Do);
				setState(561);
				statement();
				setState(562);
				match(While);
				setState(563);
				match(OpenParen);
				setState(564);
				expressionSequence();
				setState(565);
				match(CloseParen);
				setState(566);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(While);
				setState(569);
				match(OpenParen);
				setState(570);
				expressionSequence();
				setState(571);
				match(CloseParen);
				setState(572);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				match(For);
				setState(575);
				match(OpenParen);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
					{
					setState(576);
					expressionSequence();
					}
				}

				setState(579);
				match(SemiColon);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
					{
					setState(580);
					expressionSequence();
					}
				}

				setState(583);
				match(SemiColon);
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
					{
					setState(584);
					expressionSequence();
					}
				}

				setState(587);
				match(CloseParen);
				setState(588);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(589);
				match(For);
				setState(590);
				match(OpenParen);
				setState(591);
				varModifier();
				setState(592);
				variableDeclarationList();
				setState(593);
				match(SemiColon);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
					{
					setState(594);
					expressionSequence();
					}
				}

				setState(597);
				match(SemiColon);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
					{
					setState(598);
					expressionSequence();
					}
				}

				setState(601);
				match(CloseParen);
				setState(602);
				statement();
				}
				break;
			case 5:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(604);
				match(For);
				setState(605);
				match(OpenParen);
				setState(606);
				singleExpression(0);
				setState(607);
				match(In);
				setState(608);
				expressionSequence();
				setState(609);
				match(CloseParen);
				setState(610);
				statement();
				}
				break;
			case 6:
				_localctx = new ForVarInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(612);
				match(For);
				setState(613);
				match(OpenParen);
				setState(614);
				varModifier();
				setState(615);
				variableDeclaration();
				setState(616);
				match(In);
				setState(617);
				expressionSequence();
				setState(618);
				match(CloseParen);
				setState(619);
				statement();
				}
				break;
			case 7:
				_localctx = new ForOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(621);
				match(For);
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Await) {
					{
					setState(622);
					match(Await);
					}
				}

				setState(625);
				match(OpenParen);
				setState(626);
				singleExpression(0);
				setState(627);
				identifier();
				setState(628);
				expressionSequence();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==As) {
					{
					setState(629);
					match(As);
					setState(630);
					type_();
					}
				}

				setState(633);
				match(CloseParen);
				setState(634);
				statement();
				}
				break;
			case 8:
				_localctx = new ForVarOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(636);
				match(For);
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Await) {
					{
					setState(637);
					match(Await);
					}
				}

				setState(640);
				match(OpenParen);
				setState(641);
				varModifier();
				setState(642);
				variableDeclaration();
				setState(643);
				identifier();
				setState(644);
				expressionSequence();
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==As) {
					{
					setState(645);
					match(As);
					setState(646);
					type_();
					}
				}

				setState(649);
				match(CloseParen);
				setState(650);
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
		enterRule(_localctx, 70, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
		enterRule(_localctx, 72, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(Continue);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 27020017212063787L) != 0)) {
				{
				setState(657);
				identifier();
				}
			}

			setState(660);
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
		enterRule(_localctx, 74, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(Break);
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 27020017212063787L) != 0)) {
				{
				setState(663);
				identifier();
				}
			}

			setState(666);
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
		enterRule(_localctx, 76, RULE_returnStatement);
		int _la;
		try {
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				match(Return);
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
					{
					setState(669);
					expressionSequence();
					}
				}

				setState(672);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				match(Return);
				setState(674);
				match(OpenParen);
				setState(675);
				htmlElements();
				setState(676);
				match(CloseParen);
				setState(677);
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
		enterRule(_localctx, 78, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(Switch);
			setState(682);
			match(OpenParen);
			setState(683);
			expressionSequence();
			setState(684);
			match(CloseParen);
			setState(685);
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
		enterRule(_localctx, 80, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(OpenBrace);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(688);
				caseClauses();
				}
			}

			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(691);
				defaultClause();
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(692);
					caseClauses();
					}
				}

				}
			}

			setState(697);
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
		enterRule(_localctx, 82, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(699);
				caseClause();
				}
				}
				setState(702); 
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
		enterRule(_localctx, 84, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(Case);
			setState(705);
			expressionSequence();
			setState(706);
			match(Colon);
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(707);
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
		enterRule(_localctx, 86, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(Default);
			setState(711);
			match(Colon);
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(712);
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
		enterRule(_localctx, 88, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(Throw);
			setState(716);
			expressionSequence();
			setState(717);
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
		enterRule(_localctx, 90, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(Try);
			setState(720);
			block();
			setState(726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Catch:
				{
				setState(721);
				catchProduction();
				setState(723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(722);
					finallyProduction();
					}
					break;
				}
				}
				break;
			case Finally:
				{
				setState(725);
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
		enterRule(_localctx, 92, RULE_catchProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(Catch);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(729);
				match(OpenParen);
				setState(730);
				identifier();
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(731);
					typeAnnotation();
					}
				}

				setState(734);
				match(CloseParen);
				}
			}

			setState(738);
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
		enterRule(_localctx, 94, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(Finally);
			setState(741);
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
		enterRule(_localctx, 96, RULE_classExtendsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(Extends);
			setState(744);
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
		enterRule(_localctx, 98, RULE_implementsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(Implements);
			setState(747);
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
		enterRule(_localctx, 100, RULE_classElement);
		int _la;
		try {
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(750);
					decoratorList();
					}
				}

				setState(753);
				propertyMemberDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(754);
				indexMemberDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(755);
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
		enterRule(_localctx, 102, RULE_propertyMemberDeclaration);
		int _la;
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				propertyMemberBase();
				setState(759);
				propertyName();
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(760);
					match(QuestionMark);
					}
				}

				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(763);
					typeAnnotation();
					}
				}

				setState(766);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				propertyMemberBase();
				setState(769);
				propertyName();
				setState(770);
				callSignature();
				setState(776);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBrace:
					{
					{
					setState(771);
					match(OpenBrace);
					setState(772);
					functionBody();
					setState(773);
					match(CloseBrace);
					}
					}
					break;
				case SemiColon:
					{
					setState(775);
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
				setState(778);
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
		enterRule(_localctx, 104, RULE_propertyMemberBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(781);
				accessibilityModifier();
				}
				break;
			}
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(784);
				match(Async);
				}
				break;
			}
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(787);
				match(Static);
				}
				break;
			}
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(790);
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
		enterRule(_localctx, 106, RULE_indexMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			indexSignature();
			setState(794);
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
		enterRule(_localctx, 108, RULE_iteratorBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(OpenBrace);
			setState(797);
			iteratorDefinition();
			setState(802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(798);
					match(Comma);
					setState(799);
					iteratorDefinition();
					}
					} 
				}
				setState(804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(805);
				match(Comma);
				}
			}

			setState(808);
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
		enterRule(_localctx, 110, RULE_iteratorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(OpenBracket);
			setState(811);
			singleExpression(0);
			setState(812);
			match(CloseBracket);
			setState(813);
			match(OpenParen);
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611686018427355000L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 16383L) != 0)) {
				{
				setState(814);
				formalParameterList();
				}
			}

			setState(817);
			match(CloseParen);
			setState(818);
			match(OpenBrace);
			setState(819);
			functionBody();
			setState(820);
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
		enterRule(_localctx, 112, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				formalParameterArg();
				setState(827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(823);
						match(Comma);
						setState(824);
						formalParameterArg();
						}
						} 
					}
					setState(829);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				setState(832);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(830);
					match(Comma);
					setState(831);
					lastFormalParameterArg();
					}
					break;
				}
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(834);
					match(Comma);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				lastFormalParameterArg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(838);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(839);
				objectLiteral();
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(840);
					match(Colon);
					setState(841);
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
		enterRule(_localctx, 114, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(846);
				decorator();
				}
			}

			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(849);
				accessibilityModifier();
				}
				break;
			}
			setState(852);
			assignable();
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(853);
				match(QuestionMark);
				}
			}

			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(856);
				typeAnnotation();
				}
			}

			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(859);
				match(Assign);
				setState(860);
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
		enterRule(_localctx, 116, RULE_lastFormalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(Ellipsis);
			setState(864);
			identifier();
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(865);
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
		enterRule(_localctx, 118, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221423448L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1073741825L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
				{
				setState(868);
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
		enterRule(_localctx, 120, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(871);
					match(Comma);
					}
					} 
				}
				setState(876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221391192L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
				{
				setState(877);
				arrayElement();
				}
			}

			setState(888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(881); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(880);
						match(Comma);
						}
						}
						setState(883); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(885);
					arrayElement();
					}
					} 
				}
				setState(890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(891);
				match(Comma);
				}
				}
				setState(896);
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
		enterRule(_localctx, 122, RULE_arrayElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(897);
				match(Ellipsis);
				}
			}

			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(900);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(901);
				identifier();
				}
				break;
			}
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(904);
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
		enterRule(_localctx, 124, RULE_propertyAssignment);
		int _la;
		try {
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				propertyName();
				setState(908);
				_la = _input.LA(1);
				if ( !(_la==Assign || _la==Colon) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(909);
				singleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				match(OpenBracket);
				setState(912);
				singleExpression(0);
				setState(913);
				match(CloseBracket);
				setState(914);
				match(Colon);
				setState(915);
				singleExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				identifierOrKeyWord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(918);
					match(Ellipsis);
					}
				}

				setState(921);
				singleExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(922);
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
		enterRule(_localctx, 126, RULE_propertyName);
		try {
			setState(932);
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
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
				numericLiteral();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(928);
				match(OpenBracket);
				setState(929);
				singleExpression(0);
				setState(930);
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
		enterRule(_localctx, 128, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(OpenParen);
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221391192L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
				{
				setState(935);
				argumentList();
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(936);
					match(Comma);
					}
				}

				}
			}

			setState(941);
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
		enterRule(_localctx, 130, RULE_argumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			argument();
			setState(948);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(944);
					match(Comma);
					setState(945);
					argument();
					}
					} 
				}
				setState(950);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
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
		enterRule(_localctx, 132, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(951);
				match(Ellipsis);
				}
			}

			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(954);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(955);
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
		enterRule(_localctx, 134, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			singleExpression(0);
			setState(963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(959);
					match(Comma);
					setState(960);
					singleExpression(0);
					}
					} 
				}
				setState(965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ParserFile.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(ParserFile.CloseBracket, 0); }
		public TerminalNode Dot() { return getToken(ParserFile.Dot, 0); }
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(967);
				match(Class);
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 27020017212063787L) != 0)) {
					{
					setState(968);
					identifier();
					}
				}

				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(971);
					typeParameters();
					}
				}

				setState(974);
				classHeritage();
				setState(975);
				classTail();
				}
				break;
			case 2:
				{
				setState(977);
				match(New);
				setState(978);
				singleExpression(0);
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(979);
					typeArguments();
					}
				}

				setState(982);
				arguments();
				}
				break;
			case 3:
				{
				setState(984);
				match(New);
				setState(985);
				singleExpression(0);
				setState(987);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(986);
					typeArguments();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(989);
				match(Delete);
				setState(990);
				singleExpression(39);
				}
				break;
			case 5:
				{
				setState(991);
				match(Void);
				setState(992);
				singleExpression(38);
				}
				break;
			case 6:
				{
				setState(993);
				match(Typeof);
				setState(994);
				singleExpression(37);
				}
				break;
			case 7:
				{
				setState(995);
				match(PlusPlus);
				setState(996);
				singleExpression(36);
				}
				break;
			case 8:
				{
				setState(997);
				match(MinusMinus);
				setState(998);
				singleExpression(35);
				}
				break;
			case 9:
				{
				setState(999);
				match(Plus);
				setState(1000);
				singleExpression(34);
				}
				break;
			case 10:
				{
				setState(1001);
				match(Minus);
				setState(1002);
				singleExpression(33);
				}
				break;
			case 11:
				{
				setState(1003);
				match(BitNot);
				setState(1004);
				singleExpression(32);
				}
				break;
			case 12:
				{
				setState(1005);
				match(Not);
				setState(1006);
				singleExpression(31);
				}
				break;
			case 13:
				{
				setState(1007);
				match(Await);
				setState(1008);
				singleExpression(30);
				}
				break;
			case 14:
				{
				setState(1009);
				iteratorBlock();
				}
				break;
			case 15:
				{
				setState(1010);
				match(This);
				}
				break;
			case 16:
				{
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(1011);
					match(At);
					}
				}

				setState(1014);
				identifierName();
				setState(1016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1015);
					singleExpression(0);
					}
					break;
				}
				}
				break;
			case 17:
				{
				setState(1018);
				match(Super);
				}
				break;
			case 18:
				{
				setState(1019);
				literal();
				}
				break;
			case 19:
				{
				setState(1020);
				arrayLiteral();
				}
				break;
			case 20:
				{
				setState(1021);
				objectLiteral();
				}
				break;
			case 21:
				{
				setState(1022);
				htmlElement();
				}
				break;
			case 22:
				{
				setState(1023);
				match(OpenParen);
				setState(1024);
				expressionSequence();
				setState(1025);
				match(CloseParen);
				}
				break;
			case 23:
				{
				setState(1027);
				typeArguments();
				setState(1029);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1028);
					expressionSequence();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1033);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(1034);
						match(QuestionMarkDot);
						setState(1035);
						singleExpression(48);
						}
						break;
					case 2:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1036);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1037);
						match(Power);
						setState(1038);
						singleExpression(29);
						}
						break;
					case 3:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1039);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1040);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1041);
						singleExpression(29);
						}
						break;
					case 4:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1042);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1043);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1044);
						singleExpression(28);
						}
						break;
					case 5:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1045);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1046);
						match(NullCoalesce);
						setState(1047);
						singleExpression(27);
						}
						break;
					case 6:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1048);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1055);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
						case 1:
							{
							setState(1049);
							match(LeftShiftArithmetic);
							}
							break;
						case 2:
							{
							setState(1050);
							match(MoreThan);
							setState(1051);
							match(MoreThan);
							}
							break;
						case 3:
							{
							setState(1052);
							match(MoreThan);
							setState(1053);
							match(MoreThan);
							setState(1054);
							match(MoreThan);
							}
							break;
						}
						setState(1057);
						singleExpression(26);
						}
						break;
					case 7:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1058);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1059);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1060);
						singleExpression(25);
						}
						break;
					case 8:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1061);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1062);
						match(Instanceof);
						setState(1063);
						singleExpression(24);
						}
						break;
					case 9:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1064);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1065);
						match(In);
						setState(1066);
						singleExpression(23);
						}
						break;
					case 10:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1067);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1068);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1069);
						singleExpression(22);
						}
						break;
					case 11:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1070);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1071);
						match(BitAnd);
						setState(1072);
						singleExpression(21);
						}
						break;
					case 12:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1073);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1074);
						match(BitXOr);
						setState(1075);
						singleExpression(20);
						}
						break;
					case 13:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1076);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1077);
						match(BitOr);
						setState(1078);
						singleExpression(19);
						}
						break;
					case 14:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1079);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1080);
						match(And);
						setState(1081);
						singleExpression(18);
						}
						break;
					case 15:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1082);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1083);
						match(Or);
						setState(1084);
						singleExpression(17);
						}
						break;
					case 16:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1085);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1086);
						match(QuestionMark);
						setState(1087);
						singleExpression(0);
						setState(1088);
						match(Colon);
						setState(1089);
						singleExpression(16);
						}
						break;
					case 17:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1091);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1092);
						match(Assign);
						setState(1093);
						singleExpression(15);
						}
						break;
					case 18:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1094);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1095);
						assignmentOperator();
						setState(1096);
						singleExpression(14);
						}
						break;
					case 19:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1098);
						if (!(precpred(_ctx, 48))) throw new FailedPredicateException(this, "precpred(_ctx, 48)");
						setState(1100);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMarkDot) {
							{
							setState(1099);
							match(QuestionMarkDot);
							}
						}

						setState(1102);
						match(OpenBracket);
						setState(1103);
						expressionSequence();
						setState(1104);
						match(CloseBracket);
						}
						break;
					case 20:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1106);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(1108);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Not) {
							{
							setState(1107);
							match(Not);
							}
						}

						setState(1110);
						match(Dot);
						setState(1112);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Hashtag) {
							{
							setState(1111);
							match(Hashtag);
							}
						}

						setState(1114);
						identifierName();
						setState(1116);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
						case 1:
							{
							setState(1115);
							typeGeneric();
							}
							break;
						}
						}
						break;
					case 21:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1118);
						if (!(precpred(_ctx, 45))) throw new FailedPredicateException(this, "precpred(_ctx, 45)");
						setState(1120);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark) {
							{
							setState(1119);
							match(QuestionMark);
							}
						}

						setState(1122);
						match(Dot);
						setState(1124);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Hashtag) {
							{
							setState(1123);
							match(Hashtag);
							}
						}

						setState(1126);
						identifierName();
						setState(1128);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
						case 1:
							{
							setState(1127);
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
						setState(1130);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(1131);
						arguments();
						}
						break;
					case 23:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1132);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(1133);
						match(PlusPlus);
						}
						break;
					case 24:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1134);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(1135);
						match(MinusMinus);
						}
						break;
					case 25:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1136);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1137);
						match(As);
						setState(1138);
						asExpression();
						}
						break;
					case 26:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(1139);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1140);
						match(Not);
						}
						break;
					}
					} 
				}
				setState(1145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
		enterRule(_localctx, 138, RULE_htmlElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1146);
				htmlElement();
				}
				}
				setState(1149); 
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
		enterRule(_localctx, 140, RULE_htmlElement);
		int _la;
		try {
			setState(1199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1151);
				match(LessThan);
				setState(1152);
				htmlTagStartName();
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388648L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 288652588616777729L) != 0)) {
					{
					{
					setState(1153);
					htmlAttribute();
					}
					}
					setState(1158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1159);
				match(MoreThan);
				setState(1160);
				htmlContent();
				setState(1161);
				match(LessThan);
				setState(1162);
				match(Divide);
				setState(1163);
				htmlTagClosingName();
				setState(1164);
				match(MoreThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1166);
				match(LessThan);
				setState(1167);
				htmlTagName();
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388648L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 288652588616777729L) != 0)) {
					{
					{
					setState(1168);
					htmlAttribute();
					}
					}
					setState(1173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1174);
				htmlContent();
				setState(1175);
				match(Divide);
				setState(1176);
				match(MoreThan);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1178);
				match(LessThan);
				setState(1179);
				htmlTagName();
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388648L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 288652588616777729L) != 0)) {
					{
					{
					setState(1180);
					htmlAttribute();
					}
					}
					setState(1185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1186);
				match(Divide);
				setState(1187);
				match(MoreThan);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1189);
				match(LessThan);
				setState(1190);
				htmlTagName();
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388648L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 288652588616777729L) != 0)) {
					{
					{
					setState(1191);
					htmlAttribute();
					}
					}
					setState(1196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1197);
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
		enterRule(_localctx, 142, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1203);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LessThan:
						{
						setState(1201);
						htmlElement();
						}
						break;
					case DOUBLE_L_CURLY:
						{
						setState(1202);
						interpolationExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
					case 1:
						{
						setState(1206); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1205);
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
							setState(1208); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					}
					} 
				}
				setState(1216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
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
		enterRule(_localctx, 144, RULE_objectExpressionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(OpenBrace);
			setState(1218);
			expressionSequence();
			setState(1219);
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
		enterRule(_localctx, 146, RULE_htmlTagStartName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
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
		enterRule(_localctx, 148, RULE_htmlTagClosingName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
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
		enterRule(_localctx, 150, RULE_htmlTagName);
		try {
			setState(1228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TagName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
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
				setState(1226);
				keyword();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1227);
				match(Identifier);
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
		enterRule(_localctx, 152, RULE_htmlAttribute);
		int _la;
		try {
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply) {
					{
					setState(1230);
					match(Multiply);
					}
				}

				setState(1235);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
				case OpenParen:
				case Identifier:
				case AngularDirective:
				case TagName:
					{
					setState(1233);
					htmlAttributeName();
					}
					break;
				case Class:
					{
					setState(1234);
					match(Class);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(1237);
					match(Assign);
					setState(1238);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				match(AngularDirective);
				setState(1242);
				match(Assign);
				setState(1243);
				propertyName();
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
		enterRule(_localctx, 154, RULE_htmlAttributeName);
		int _la;
		try {
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TagName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				match(TagName);
				}
				break;
			case AngularDirective:
				enterOuterAlt(_localctx, 2);
				{
				setState(1247);
				match(AngularDirective);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1248);
				match(Identifier);
				setState(1253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Minus) {
					{
					{
					setState(1249);
					match(Minus);
					setState(1250);
					match(Identifier);
					}
					}
					setState(1255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(1256);
				match(OpenParen);
				setState(1257);
				match(Identifier);
				setState(1258);
				match(CloseParen);
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(1259);
				match(OpenBracket);
				setState(1260);
				match(Identifier);
				setState(1261);
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
		enterRule(_localctx, 156, RULE_htmlAttributeValue);
		try {
			setState(1268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AttributeValue:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				match(AttributeValue);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				match(StringLiteral);
				}
				break;
			case DOUBLE_L_CURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1266);
				interpolationExpression();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 4);
				{
				setState(1267);
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
		enterRule(_localctx, 158, RULE_interpolationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(DOUBLE_L_CURLY);
			setState(1271);
			htmlSequence();
			setState(1272);
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
		enterRule(_localctx, 160, RULE_htmlSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			propertyName();
			setState(1275);
			match(Dot);
			setState(1276);
			identifierName();
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
		enterRule(_localctx, 162, RULE_asExpression);
		try {
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				predefinedType();
				setState(1281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1279);
					match(OpenBracket);
					setState(1280);
					match(CloseBracket);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
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
		enterRule(_localctx, 164, RULE_assignable);
		try {
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1287);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1288);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1289);
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
		enterRule(_localctx, 166, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1292);
			match(OpenBracket);
			setState(1293);
			elementList();
			setState(1294);
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
		enterRule(_localctx, 168, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(OpenBrace);
			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460751221391192L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 49151L) != 0)) {
				{
				setState(1297);
				propertyAssignment();
				setState(1302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1298);
						match(Comma);
						setState(1299);
						propertyAssignment();
						}
						} 
					}
					setState(1304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				}
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1305);
					match(Comma);
					}
				}

				}
			}

			setState(1310);
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
		enterRule(_localctx, 170, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
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
		enterRule(_localctx, 172, RULE_literal);
		try {
			setState(1318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1316);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1317);
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
		enterRule(_localctx, 174, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
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
		enterRule(_localctx, 176, RULE_identifierName);
		try {
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1323);
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
		enterRule(_localctx, 178, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 27020017212063787L) != 0)) ) {
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
		enterRule(_localctx, 180, RULE_identifierOrKeyWord);
		try {
			setState(1331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329);
				match(TypeAlias);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1330);
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
		enterRule(_localctx, 182, RULE_bindingPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				{
				setState(1333);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				{
				setState(1334);
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
		enterRule(_localctx, 184, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			match(LessThan);
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 27020017212063787L) != 0)) {
				{
				setState(1338);
				typeParameterList();
				}
			}

			setState(1341);
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
		enterRule(_localctx, 186, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			typeParameter();
			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1344);
				match(Comma);
				setState(1345);
				typeParameter();
				}
				}
				setState(1350);
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
		enterRule(_localctx, 188, RULE_typeParameter);
		int _la;
		try {
			setState(1360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1351);
				identifier();
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1352);
					constraint();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1355);
				identifier();
				setState(1356);
				match(Assign);
				setState(1357);
				typeArgument();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1359);
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
		enterRule(_localctx, 190, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			match(Extends);
			setState(1363);
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
		enterRule(_localctx, 192, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			match(LessThan);
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4035226641587241000L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & -1657329060873760735L) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 5631L) != 0)) {
				{
				setState(1366);
				typeArgumentList();
				}
			}

			setState(1369);
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
		enterRule(_localctx, 194, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			typeArgument();
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1372);
				match(Comma);
				setState(1373);
				typeArgument();
				}
				}
				setState(1378);
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
		enterRule(_localctx, 196, RULE_typeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
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
		enterRule(_localctx, 198, RULE_type_);
		int _la;
		try {
			setState(1388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BitAnd || _la==BitOr) {
					{
					setState(1381);
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

				setState(1384);
				unionOrIntersectionOrPrimaryType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1385);
				functionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1386);
				constructorType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1387);
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
		enterRule(_localctx, 200, RULE_unionOrIntersectionOrPrimaryType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
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
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_primaryType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1393);
				match(OpenParen);
				setState(1394);
				type_();
				setState(1395);
				match(CloseParen);
				}
				break;
			case 2:
				{
				setState(1397);
				predefinedType();
				}
				break;
			case 3:
				{
				setState(1398);
				typeReference();
				}
				break;
			case 4:
				{
				setState(1399);
				match(OpenBracket);
				setState(1400);
				tupleElementTypes();
				setState(1401);
				match(CloseBracket);
				}
				break;
			case 5:
				{
				setState(1403);
				match(This);
				}
				break;
			case 6:
				{
				setState(1404);
				typeReference();
				setState(1405);
				match(Is);
				setState(1406);
				primaryType(2);
				}
				break;
			case 7:
				{
				setState(1408);
				match(KeyOf);
				setState(1409);
				primaryType(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryType);
					setState(1412);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(1413);
					match(OpenBracket);
					setState(1415);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4035225266123964456L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & -51791533152305023L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 175L) != 0)) {
						{
						setState(1414);
						primaryType(0);
						}
					}

					setState(1417);
					match(CloseBracket);
					}
					} 
				}
				setState(1422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
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
		enterRule(_localctx, 204, RULE_predefinedType);
		int _la;
		try {
			setState(1439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Any:
				enterOuterAlt(_localctx, 1);
				{
				setState(1423);
				match(Any);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				match(NullLiteral);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(1425);
				match(Number);
				}
				break;
			case DecimalLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1426);
				match(DecimalLiteral);
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 5);
				{
				setState(1427);
				match(Boolean);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(1428);
				match(BooleanLiteral);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 7);
				{
				setState(1429);
				match(String);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 8);
				{
				setState(1430);
				match(StringLiteral);
				}
				break;
			case Unique:
			case Symbol:
				enterOuterAlt(_localctx, 9);
				{
				setState(1432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Unique) {
					{
					setState(1431);
					match(Unique);
					}
				}

				setState(1434);
				match(Symbol);
				}
				break;
			case Never:
				enterOuterAlt(_localctx, 10);
				{
				setState(1435);
				match(Never);
				}
				break;
			case Undefined:
				enterOuterAlt(_localctx, 11);
				{
				setState(1436);
				match(Undefined);
				}
				break;
			case Object:
				enterOuterAlt(_localctx, 12);
				{
				setState(1437);
				match(Object);
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 13);
				{
				setState(1438);
				match(Void);
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
		enterRule(_localctx, 206, RULE_typeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			typeName();
			setState(1443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1442);
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
		enterRule(_localctx, 208, RULE_typeGeneric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(LessThan);
			setState(1446);
			typeArgumentList();
			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(1447);
				typeGeneric();
				}
			}

			setState(1450);
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
		enterRule(_localctx, 210, RULE_typeName);
		try {
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1452);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1453);
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
		enterRule(_localctx, 212, RULE_tupleElementTypes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			type_();
			setState(1461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1457);
					match(Comma);
					setState(1458);
					type_();
					}
					} 
				}
				setState(1463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1464);
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
		enterRule(_localctx, 214, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(1467);
				typeParameters();
				}
			}

			setState(1470);
			match(OpenParen);
			setState(1472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2882303761517084536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 16383L) != 0)) {
				{
				setState(1471);
				parameterList();
				}
			}

			setState(1474);
			match(CloseParen);
			setState(1475);
			match(ARROW);
			setState(1476);
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
		enterRule(_localctx, 216, RULE_constructorType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(New);
			setState(1480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(1479);
				typeParameters();
				}
			}

			setState(1482);
			match(OpenParen);
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2882303761517084536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 16383L) != 0)) {
				{
				setState(1483);
				parameterList();
				}
			}

			setState(1486);
			match(CloseParen);
			setState(1487);
			match(ARROW);
			setState(1488);
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
		enterRule(_localctx, 218, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			match(Colon);
			setState(1491);
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
		enterRule(_localctx, 220, RULE_callSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(1493);
				typeParameters();
				}
			}

			setState(1496);
			match(OpenParen);
			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2882303761517084536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 16383L) != 0)) {
				{
				setState(1497);
				parameterList();
				}
			}

			setState(1500);
			match(CloseParen);
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1501);
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
		enterRule(_localctx, 222, RULE_parameterList);
		int _la;
		try {
			int _alt;
			setState(1520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1504);
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
			case At:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1505);
				parameter();
				setState(1510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1506);
						match(Comma);
						setState(1507);
						parameter();
						}
						} 
					}
					setState(1512);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				}
				setState(1515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1513);
					match(Comma);
					setState(1514);
					restParameter();
					}
					break;
				}
				setState(1518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1517);
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
		enterRule(_localctx, 224, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
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
		enterRule(_localctx, 226, RULE_restParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			match(Ellipsis);
			setState(1525);
			singleExpression(0);
			setState(1527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1526);
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
		enterRule(_localctx, 228, RULE_requiredParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1529);
				decoratorList();
				}
			}

			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1532);
				accessibilityModifier();
				}
				break;
			}
			setState(1535);
			identifierOrPattern();
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1536);
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
		enterRule(_localctx, 230, RULE_accessibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
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
		enterRule(_localctx, 232, RULE_identifierOrPattern);
		try {
			setState(1543);
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
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1541);
				identifierName();
				}
				break;
			case OpenBracket:
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
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
		enterRule(_localctx, 234, RULE_indexSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			match(OpenBracket);
			setState(1546);
			identifier();
			setState(1547);
			match(Colon);
			setState(1548);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1549);
			match(CloseBracket);
			setState(1550);
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
		enterRule(_localctx, 236, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 19L) != 0)) {
				{
				setState(1552);
				accessibilityModifier();
				}
			}

			setState(1555);
			match(Constructor);
			setState(1556);
			match(OpenParen);
			setState(1558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611686018427355000L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -4611686019501129729L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 16383L) != 0)) {
				{
				setState(1557);
				formalParameterList();
				}
			}

			setState(1560);
			match(CloseParen);
			setState(1566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				{
				setState(1561);
				match(OpenBrace);
				setState(1562);
				functionBody();
				setState(1563);
				match(CloseBrace);
				}
				}
				break;
			case 2:
				{
				setState(1565);
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
		enterRule(_localctx, 238, RULE_classOrInterfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			typeReference();
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1569);
				match(Comma);
				setState(1570);
				typeReference();
				}
				}
				setState(1575);
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
		enterRule(_localctx, 240, RULE_namespaceName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			identifier();
			setState(1585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1578); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1577);
						match(Dot);
						}
						}
						setState(1580); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Dot );
					setState(1582);
					identifier();
					}
					} 
				}
				setState(1587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
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
		enterRule(_localctx, 242, RULE_decoratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1588);
				decorator();
				}
				}
				setState(1591); 
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
		enterRule(_localctx, 244, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			match(At);
			setState(1596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1594);
				decoratorMemberExpression(0);
				}
				break;
			case 2:
				{
				setState(1595);
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
		int _startState = 246;
		enterRecursionRule(_localctx, 246, RULE_decoratorMemberExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
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
			case Identifier:
				{
				setState(1599);
				identifier();
				}
				break;
			case OpenParen:
				{
				setState(1600);
				match(OpenParen);
				setState(1601);
				singleExpression(0);
				setState(1602);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DecoratorMemberExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decoratorMemberExpression);
					setState(1606);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1607);
					match(Dot);
					setState(1608);
					identifierName();
					}
					} 
				}
				setState(1613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
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
		enterRule(_localctx, 248, RULE_decoratorCallExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			decoratorMemberExpression(0);
			setState(1615);
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
		enterRule(_localctx, 250, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
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
		case 68:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 101:
			return primaryType_sempred((PrimaryTypeContext)_localctx, predIndex);
		case 123:
			return decoratorMemberExpression_sempred((DecoratorMemberExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 47);
		case 1:
			return precpred(_ctx, 29);
		case 2:
			return precpred(_ctx, 28);
		case 3:
			return precpred(_ctx, 27);
		case 4:
			return precpred(_ctx, 26);
		case 5:
			return precpred(_ctx, 25);
		case 6:
			return precpred(_ctx, 24);
		case 7:
			return precpred(_ctx, 23);
		case 8:
			return precpred(_ctx, 22);
		case 9:
			return precpred(_ctx, 21);
		case 10:
			return precpred(_ctx, 20);
		case 11:
			return precpred(_ctx, 19);
		case 12:
			return precpred(_ctx, 18);
		case 13:
			return precpred(_ctx, 17);
		case 14:
			return precpred(_ctx, 16);
		case 15:
			return precpred(_ctx, 15);
		case 16:
			return precpred(_ctx, 14);
		case 17:
			return precpred(_ctx, 13);
		case 18:
			return precpred(_ctx, 48);
		case 19:
			return precpred(_ctx, 46);
		case 20:
			return precpred(_ctx, 45);
		case 21:
			return precpred(_ctx, 42);
		case 22:
			return precpred(_ctx, 41);
		case 23:
			return precpred(_ctx, 40);
		case 24:
			return precpred(_ctx, 2);
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryType_sempred(PrimaryTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean decoratorMemberExpression_sempred(DecoratorMemberExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u009c\u0654\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"|\u0002}\u0007}\u0001\u0000\u0003\u0000\u00fe\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0004\u0001\u0103\b\u0001\u000b\u0001\f\u0001\u0104"+
		"\u0001\u0002\u0004\u0002\u0108\b\u0002\u000b\u0002\f\u0002\u0109\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u011c\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0120\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0126\b\u0005\u0001\u0005\u0003\u0005\u0129"+
		"\b\u0005\u0001\u0005\u0003\u0005\u012c\b\u0005\u0001\u0005\u0003\u0005"+
		"\u012f\b\u0005\u0001\u0005\u0003\u0005\u0132\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0136\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u013a"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u013e\b\u0005\u0003\u0005"+
		"\u0140\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0147\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u014b\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0154\b\u0007\u0001\b\u0003\b\u0157\b\b"+
		"\u0001\b\u0001\b\u0003\b\u015b\b\b\u0003\b\u015d\b\b\u0001\b\u0003\b\u0160"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u0165\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0003\t\u016b\b\t\u0001\t\u0003\t\u016e\b\t\u0001\n\u0001\n\u0005"+
		"\n\u0172\b\n\n\n\f\n\u0175\t\n\u0001\n\u0001\n\u0001\u000b\u0003\u000b"+
		"\u017a\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u017e\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0187\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u018c"+
		"\b\f\u0001\r\u0001\r\u0001\u000e\u0004\u000e\u0191\b\u000e\u000b\u000e"+
		"\f\u000e\u0192\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u019a\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010"+
		"\u019f\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01a3\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01aa"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u01b0"+
		"\b\u0011\n\u0011\f\u0011\u01b3\t\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u01b7\b\u0011\u0003\u0011\u01b9\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01c0\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u01c4\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u01cd\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u01d1\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01d9\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01e1\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01e5\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01eb\b\u001a"+
		"\n\u001a\f\u001a\u01ee\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01f2"+
		"\b\u001a\u0003\u001a\u01f4\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01fb\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0200\b\u001c\u0001\u001d\u0003\u001d\u0203\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0207\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u020b\b\u001d\n\u001d\f\u001d\u020e\t\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0213\b\u001e\u0001\u001e\u0003\u001e"+
		"\u0216\b\u001e\u0001\u001e\u0003\u001e\u0219\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u021d\b\u001e\u0001\u001e\u0003\u001e\u0220\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u0226\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u022f\b!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0242\b\"\u0001\"\u0001"+
		"\"\u0003\"\u0246\b\"\u0001\"\u0001\"\u0003\"\u024a\b\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0254\b\"\u0001"+
		"\"\u0001\"\u0003\"\u0258\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0270"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0278\b\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u027f\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0288\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u028d\b\"\u0001#\u0001#\u0001$\u0001$\u0003$\u0293"+
		"\b$\u0001$\u0001$\u0001%\u0001%\u0003%\u0299\b%\u0001%\u0001%\u0001&\u0001"+
		"&\u0003&\u029f\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u02a8\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0003(\u02b2\b(\u0001(\u0001(\u0003(\u02b6\b(\u0003(\u02b8\b(\u0001"+
		"(\u0001(\u0001)\u0004)\u02bd\b)\u000b)\f)\u02be\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u02c5\b*\u0001+\u0001+\u0001+\u0003+\u02ca\b+\u0001,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0003-\u02d4\b-\u0001-\u0003-\u02d7"+
		"\b-\u0001.\u0001.\u0001.\u0001.\u0003.\u02dd\b.\u0001.\u0001.\u0003.\u02e1"+
		"\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00011\u0001"+
		"1\u00011\u00012\u00012\u00032\u02f0\b2\u00012\u00012\u00012\u00032\u02f5"+
		"\b2\u00013\u00013\u00013\u00033\u02fa\b3\u00013\u00033\u02fd\b3\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0003"+
		"3\u0309\b3\u00013\u00033\u030c\b3\u00014\u00034\u030f\b4\u00014\u0003"+
		"4\u0312\b4\u00014\u00034\u0315\b4\u00014\u00034\u0318\b4\u00015\u0001"+
		"5\u00015\u00016\u00016\u00016\u00016\u00056\u0321\b6\n6\f6\u0324\t6\u0001"+
		"6\u00036\u0327\b6\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u0003"+
		"7\u0330\b7\u00017\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u0005"+
		"8\u033a\b8\n8\f8\u033d\t8\u00018\u00018\u00038\u0341\b8\u00018\u00038"+
		"\u0344\b8\u00018\u00018\u00018\u00018\u00018\u00038\u034b\b8\u00038\u034d"+
		"\b8\u00019\u00039\u0350\b9\u00019\u00039\u0353\b9\u00019\u00019\u0003"+
		"9\u0357\b9\u00019\u00039\u035a\b9\u00019\u00019\u00039\u035e\b9\u0001"+
		":\u0001:\u0001:\u0003:\u0363\b:\u0001;\u0003;\u0366\b;\u0001<\u0005<\u0369"+
		"\b<\n<\f<\u036c\t<\u0001<\u0003<\u036f\b<\u0001<\u0004<\u0372\b<\u000b"+
		"<\f<\u0373\u0001<\u0005<\u0377\b<\n<\f<\u037a\t<\u0001<\u0005<\u037d\b"+
		"<\n<\f<\u0380\t<\u0001=\u0003=\u0383\b=\u0001=\u0001=\u0003=\u0387\b="+
		"\u0001=\u0003=\u038a\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u0398\b>\u0001>\u0001>\u0003"+
		">\u039c\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u03a5"+
		"\b?\u0001@\u0001@\u0001@\u0003@\u03aa\b@\u0003@\u03ac\b@\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0005A\u03b3\bA\nA\fA\u03b6\tA\u0001B\u0003B\u03b9"+
		"\bB\u0001B\u0001B\u0003B\u03bd\bB\u0001C\u0001C\u0001C\u0005C\u03c2\b"+
		"C\nC\fC\u03c5\tC\u0001D\u0001D\u0001D\u0003D\u03ca\bD\u0001D\u0003D\u03cd"+
		"\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u03d5\bD\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0003D\u03dc\bD\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u03f5"+
		"\bD\u0001D\u0001D\u0003D\u03f9\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0406\bD\u0003D\u0408\bD\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0003D\u0420\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u044d\bD\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0003D\u0455\bD\u0001D\u0001D\u0003D\u0459"+
		"\bD\u0001D\u0001D\u0003D\u045d\bD\u0001D\u0001D\u0003D\u0461\bD\u0001"+
		"D\u0001D\u0003D\u0465\bD\u0001D\u0001D\u0003D\u0469\bD\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0005D\u0476"+
		"\bD\nD\fD\u0479\tD\u0001E\u0004E\u047c\bE\u000bE\fE\u047d\u0001F\u0001"+
		"F\u0001F\u0005F\u0483\bF\nF\fF\u0486\tF\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0005F\u0492\bF\nF\fF\u0495\tF\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0005F\u049e\bF\nF\fF\u04a1"+
		"\tF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0005F\u04a9\bF\nF\fF\u04ac"+
		"\tF\u0001F\u0001F\u0003F\u04b0\bF\u0001G\u0001G\u0003G\u04b4\bG\u0001"+
		"G\u0004G\u04b7\bG\u000bG\fG\u04b8\u0003G\u04bb\bG\u0005G\u04bd\bG\nG\f"+
		"G\u04c0\tG\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001J\u0001J\u0001"+
		"K\u0001K\u0001K\u0003K\u04cd\bK\u0001L\u0003L\u04d0\bL\u0001L\u0001L\u0003"+
		"L\u04d4\bL\u0001L\u0001L\u0003L\u04d8\bL\u0001L\u0001L\u0001L\u0003L\u04dd"+
		"\bL\u0001M\u0001M\u0001M\u0001M\u0001M\u0005M\u04e4\bM\nM\fM\u04e7\tM"+
		"\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u04ef\bM\u0001N\u0001"+
		"N\u0001N\u0001N\u0003N\u04f5\bN\u0001O\u0001O\u0001O\u0001O\u0001P\u0001"+
		"P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0003Q\u0502\bQ\u0001Q\u0003Q\u0505"+
		"\bQ\u0001R\u0001R\u0001R\u0001R\u0003R\u050b\bR\u0001S\u0001S\u0001S\u0001"+
		"S\u0001T\u0001T\u0001T\u0001T\u0005T\u0515\bT\nT\fT\u0518\tT\u0001T\u0003"+
		"T\u051b\bT\u0003T\u051d\bT\u0001T\u0001T\u0001U\u0001U\u0001V\u0001V\u0001"+
		"V\u0001V\u0003V\u0527\bV\u0001W\u0001W\u0001X\u0001X\u0003X\u052d\bX\u0001"+
		"Y\u0001Y\u0001Z\u0001Z\u0001Z\u0003Z\u0534\bZ\u0001[\u0001[\u0003[\u0538"+
		"\b[\u0001\\\u0001\\\u0003\\\u053c\b\\\u0001\\\u0001\\\u0001]\u0001]\u0001"+
		"]\u0005]\u0543\b]\n]\f]\u0546\t]\u0001^\u0001^\u0003^\u054a\b^\u0001^"+
		"\u0001^\u0001^\u0001^\u0001^\u0003^\u0551\b^\u0001_\u0001_\u0001_\u0001"+
		"`\u0001`\u0003`\u0558\b`\u0001`\u0001`\u0001a\u0001a\u0001a\u0005a\u055f"+
		"\ba\na\fa\u0562\ta\u0001b\u0001b\u0001c\u0003c\u0567\bc\u0001c\u0001c"+
		"\u0001c\u0001c\u0003c\u056d\bc\u0001d\u0001d\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0003e\u0583\be\u0001e\u0001e\u0001e\u0003"+
		"e\u0588\be\u0001e\u0005e\u058b\be\ne\fe\u058e\te\u0001f\u0001f\u0001f"+
		"\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0003f\u0599\bf\u0001f\u0001"+
		"f\u0001f\u0001f\u0001f\u0003f\u05a0\bf\u0001g\u0001g\u0003g\u05a4\bg\u0001"+
		"h\u0001h\u0001h\u0003h\u05a9\bh\u0001h\u0001h\u0001i\u0001i\u0003i\u05af"+
		"\bi\u0001j\u0001j\u0001j\u0005j\u05b4\bj\nj\fj\u05b7\tj\u0001j\u0003j"+
		"\u05ba\bj\u0001k\u0003k\u05bd\bk\u0001k\u0001k\u0003k\u05c1\bk\u0001k"+
		"\u0001k\u0001k\u0001k\u0001l\u0001l\u0003l\u05c9\bl\u0001l\u0001l\u0003"+
		"l\u05cd\bl\u0001l\u0001l\u0001l\u0001l\u0001m\u0001m\u0001m\u0001n\u0003"+
		"n\u05d7\bn\u0001n\u0001n\u0003n\u05db\bn\u0001n\u0001n\u0003n\u05df\b"+
		"n\u0001o\u0001o\u0001o\u0001o\u0005o\u05e5\bo\no\fo\u05e8\to\u0001o\u0001"+
		"o\u0003o\u05ec\bo\u0001o\u0003o\u05ef\bo\u0003o\u05f1\bo\u0001p\u0001"+
		"p\u0001q\u0001q\u0001q\u0003q\u05f8\bq\u0001r\u0003r\u05fb\br\u0001r\u0003"+
		"r\u05fe\br\u0001r\u0001r\u0003r\u0602\br\u0001s\u0001s\u0001t\u0001t\u0003"+
		"t\u0608\bt\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001v\u0003"+
		"v\u0612\bv\u0001v\u0001v\u0001v\u0003v\u0617\bv\u0001v\u0001v\u0001v\u0001"+
		"v\u0001v\u0001v\u0003v\u061f\bv\u0001w\u0001w\u0001w\u0005w\u0624\bw\n"+
		"w\fw\u0627\tw\u0001x\u0001x\u0004x\u062b\bx\u000bx\fx\u062c\u0001x\u0005"+
		"x\u0630\bx\nx\fx\u0633\tx\u0001y\u0004y\u0636\by\u000by\fy\u0637\u0001"+
		"z\u0001z\u0001z\u0003z\u063d\bz\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0003{\u0645\b{\u0001{\u0001{\u0001{\u0005{\u064a\b{\n{\f{\u064d\t{"+
		"\u0001|\u0001|\u0001|\u0001}\u0001}\u0001}\u0000\u0003\u0088\u00ca\u00f6"+
		"~\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u0000\u000f\u0006\u0000>]_mooqryy|}\u0002\u0000\\]\u008e\u008e\u0003"+
		"\u0000EEccgg\u0002\u0000\u000b\u000b\u000e\u000e\u0001\u0000\u0017\u0019"+
		"\u0001\u0000\u0013\u0014\u0001\u0000\u001e!\u0001\u0000\"%\u0002\u0000"+
		"\u0007\u0007\u001e\u001e\u0001\u0000+7\u0007\u0000XY[[]]n{\u007f\u007f"+
		"\u0081\u008c\u008e\u008e\u0002\u0000&&((\u0002\u0000hill\u0002\u0000o"+
		"orr\u0001\u0001\t\t\u071d\u0000\u00fd\u0001\u0000\u0000\u0000\u0002\u0102"+
		"\u0001\u0000\u0000\u0000\u0004\u0107\u0001\u0000\u0000\u0000\u0006\u011b"+
		"\u0001\u0000\u0000\u0000\b\u011d\u0001\u0000\u0000\u0000\n\u013f\u0001"+
		"\u0000\u0000\u0000\f\u0141\u0001\u0000\u0000\u0000\u000e\u0153\u0001\u0000"+
		"\u0000\u0000\u0010\u0156\u0001\u0000\u0000\u0000\u0012\u016a\u0001\u0000"+
		"\u0000\u0000\u0014\u016f\u0001\u0000\u0000\u0000\u0016\u0179\u0001\u0000"+
		"\u0000\u0000\u0018\u018b\u0001\u0000\u0000\u0000\u001a\u018d\u0001\u0000"+
		"\u0000\u0000\u001c\u0190\u0001\u0000\u0000\u0000\u001e\u0194\u0001\u0000"+
		"\u0000\u0000 \u01a9\u0001\u0000\u0000\u0000\"\u01ab\u0001\u0000\u0000"+
		"\u0000$\u01bc\u0001\u0000\u0000\u0000&\u01c3\u0001\u0000\u0000\u0000("+
		"\u01c5\u0001\u0000\u0000\u0000*\u01c7\u0001\u0000\u0000\u0000,\u01cc\u0001"+
		"\u0000\u0000\u0000.\u01d2\u0001\u0000\u0000\u00000\u01d5\u0001\u0000\u0000"+
		"\u00002\u01e4\u0001\u0000\u0000\u00004\u01e6\u0001\u0000\u0000\u00006"+
		"\u01f7\u0001\u0000\u0000\u00008\u01ff\u0001\u0000\u0000\u0000:\u0202\u0001"+
		"\u0000\u0000\u0000<\u0212\u0001\u0000\u0000\u0000>\u0221\u0001\u0000\u0000"+
		"\u0000@\u0223\u0001\u0000\u0000\u0000B\u0227\u0001\u0000\u0000\u0000D"+
		"\u028c\u0001\u0000\u0000\u0000F\u028e\u0001\u0000\u0000\u0000H\u0290\u0001"+
		"\u0000\u0000\u0000J\u0296\u0001\u0000\u0000\u0000L\u02a7\u0001\u0000\u0000"+
		"\u0000N\u02a9\u0001\u0000\u0000\u0000P\u02af\u0001\u0000\u0000\u0000R"+
		"\u02bc\u0001\u0000\u0000\u0000T\u02c0\u0001\u0000\u0000\u0000V\u02c6\u0001"+
		"\u0000\u0000\u0000X\u02cb\u0001\u0000\u0000\u0000Z\u02cf\u0001\u0000\u0000"+
		"\u0000\\\u02d8\u0001\u0000\u0000\u0000^\u02e4\u0001\u0000\u0000\u0000"+
		"`\u02e7\u0001\u0000\u0000\u0000b\u02ea\u0001\u0000\u0000\u0000d\u02f4"+
		"\u0001\u0000\u0000\u0000f\u030b\u0001\u0000\u0000\u0000h\u030e\u0001\u0000"+
		"\u0000\u0000j\u0319\u0001\u0000\u0000\u0000l\u031c\u0001\u0000\u0000\u0000"+
		"n\u032a\u0001\u0000\u0000\u0000p\u034c\u0001\u0000\u0000\u0000r\u034f"+
		"\u0001\u0000\u0000\u0000t\u035f\u0001\u0000\u0000\u0000v\u0365\u0001\u0000"+
		"\u0000\u0000x\u036a\u0001\u0000\u0000\u0000z\u0382\u0001\u0000\u0000\u0000"+
		"|\u039b\u0001\u0000\u0000\u0000~\u03a4\u0001\u0000\u0000\u0000\u0080\u03a6"+
		"\u0001\u0000\u0000\u0000\u0082\u03af\u0001\u0000\u0000\u0000\u0084\u03b8"+
		"\u0001\u0000\u0000\u0000\u0086\u03be\u0001\u0000\u0000\u0000\u0088\u0407"+
		"\u0001\u0000\u0000\u0000\u008a\u047b\u0001\u0000\u0000\u0000\u008c\u04af"+
		"\u0001\u0000\u0000\u0000\u008e\u04be\u0001\u0000\u0000\u0000\u0090\u04c1"+
		"\u0001\u0000\u0000\u0000\u0092\u04c5\u0001\u0000\u0000\u0000\u0094\u04c7"+
		"\u0001\u0000\u0000\u0000\u0096\u04cc\u0001\u0000\u0000\u0000\u0098\u04dc"+
		"\u0001\u0000\u0000\u0000\u009a\u04ee\u0001\u0000\u0000\u0000\u009c\u04f4"+
		"\u0001\u0000\u0000\u0000\u009e\u04f6\u0001\u0000\u0000\u0000\u00a0\u04fa"+
		"\u0001\u0000\u0000\u0000\u00a2\u0504\u0001\u0000\u0000\u0000\u00a4\u050a"+
		"\u0001\u0000\u0000\u0000\u00a6\u050c\u0001\u0000\u0000\u0000\u00a8\u0510"+
		"\u0001\u0000\u0000\u0000\u00aa\u0520\u0001\u0000\u0000\u0000\u00ac\u0526"+
		"\u0001\u0000\u0000\u0000\u00ae\u0528\u0001\u0000\u0000\u0000\u00b0\u052c"+
		"\u0001\u0000\u0000\u0000\u00b2\u052e\u0001\u0000\u0000\u0000\u00b4\u0533"+
		"\u0001\u0000\u0000\u0000\u00b6\u0537\u0001\u0000\u0000\u0000\u00b8\u0539"+
		"\u0001\u0000\u0000\u0000\u00ba\u053f\u0001\u0000\u0000\u0000\u00bc\u0550"+
		"\u0001\u0000\u0000\u0000\u00be\u0552\u0001\u0000\u0000\u0000\u00c0\u0555"+
		"\u0001\u0000\u0000\u0000\u00c2\u055b\u0001\u0000\u0000\u0000\u00c4\u0563"+
		"\u0001\u0000\u0000\u0000\u00c6\u056c\u0001\u0000\u0000\u0000\u00c8\u056e"+
		"\u0001\u0000\u0000\u0000\u00ca\u0582\u0001\u0000\u0000\u0000\u00cc\u059f"+
		"\u0001\u0000\u0000\u0000\u00ce\u05a1\u0001\u0000\u0000\u0000\u00d0\u05a5"+
		"\u0001\u0000\u0000\u0000\u00d2\u05ae\u0001\u0000\u0000\u0000\u00d4\u05b0"+
		"\u0001\u0000\u0000\u0000\u00d6\u05bc\u0001\u0000\u0000\u0000\u00d8\u05c6"+
		"\u0001\u0000\u0000\u0000\u00da\u05d2\u0001\u0000\u0000\u0000\u00dc\u05d6"+
		"\u0001\u0000\u0000\u0000\u00de\u05f0\u0001\u0000\u0000\u0000\u00e0\u05f2"+
		"\u0001\u0000\u0000\u0000\u00e2\u05f4\u0001\u0000\u0000\u0000\u00e4\u05fa"+
		"\u0001\u0000\u0000\u0000\u00e6\u0603\u0001\u0000\u0000\u0000\u00e8\u0607"+
		"\u0001\u0000\u0000\u0000\u00ea\u0609\u0001\u0000\u0000\u0000\u00ec\u0611"+
		"\u0001\u0000\u0000\u0000\u00ee\u0620\u0001\u0000\u0000\u0000\u00f0\u0628"+
		"\u0001\u0000\u0000\u0000\u00f2\u0635\u0001\u0000\u0000\u0000\u00f4\u0639"+
		"\u0001\u0000\u0000\u0000\u00f6\u0644\u0001\u0000\u0000\u0000\u00f8\u064e"+
		"\u0001\u0000\u0000\u0000\u00fa\u0651\u0001\u0000\u0000\u0000\u00fc\u00fe"+
		"\u0003\u0002\u0001\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005\u0000\u0000\u0001\u0100\u0001\u0001\u0000\u0000\u0000\u0101\u0103"+
		"\u0003\u0004\u0002\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105\u0003\u0001\u0000\u0000\u0000\u0106\u0108"+
		"\u0003\u0006\u0003\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u0005\u0001\u0000\u0000\u0000\u010b\u011c"+
		"\u0003\b\u0004\u0000\u010c\u011c\u0003\n\u0005\u0000\u010d\u011c\u0003"+
		"\f\u0006\u0000\u010e\u011c\u0003\u000e\u0007\u0000\u010f\u011c\u0003>"+
		"\u001f\u0000\u0110\u011c\u0003\u0010\b\u0000\u0111\u011c\u0003\u0016\u000b"+
		"\u0000\u0112\u011c\u0003@ \u0000\u0113\u011c\u0003B!\u0000\u0114\u011c"+
		"\u0003D\"\u0000\u0115\u011c\u0003H$\u0000\u0116\u011c\u0003J%\u0000\u0117"+
		"\u011c\u0003L&\u0000\u0118\u011c\u0003N\'\u0000\u0119\u011c\u0003X,\u0000"+
		"\u011a\u011c\u0003Z-\u0000\u011b\u010b\u0001\u0000\u0000\u0000\u011b\u010c"+
		"\u0001\u0000\u0000\u0000\u011b\u010d\u0001\u0000\u0000\u0000\u011b\u010e"+
		"\u0001\u0000\u0000\u0000\u011b\u010f\u0001\u0000\u0000\u0000\u011b\u0110"+
		"\u0001\u0000\u0000\u0000\u011b\u0111\u0001\u0000\u0000\u0000\u011b\u0112"+
		"\u0001\u0000\u0000\u0000\u011b\u0113\u0001\u0000\u0000\u0000\u011b\u0114"+
		"\u0001\u0000\u0000\u0000\u011b\u0115\u0001\u0000\u0000\u0000\u011b\u0116"+
		"\u0001\u0000\u0000\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011b\u0118"+
		"\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\u0007\u0001\u0000\u0000\u0000\u011d\u011f"+
		"\u0005\u0007\u0000\u0000\u011e\u0120\u0003\u001c\u000e\u0000\u011f\u011e"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0005\b\u0000\u0000\u0122\t\u0001"+
		"\u0000\u0000\u0000\u0123\u0125\u0003\u00b6[\u0000\u0124\u0126\u0003\u00da"+
		"m\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0129\u0005\t\u0000\u0000"+
		"\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u0140\u0001\u0000\u0000\u0000\u012a\u012c\u0003\u00e6s\u0000\u012b"+
		"\u012a\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		"\u012e\u0001\u0000\u0000\u0000\u012d\u012f\u0003F#\u0000\u012e\u012d\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001"+
		"\u0000\u0000\u0000\u0130\u0132\u0005Z\u0000\u0000\u0131\u0130\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0135\u0003:\u001d\u0000\u0134\u0136\u0005\t\u0000"+
		"\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136\u0140\u0001\u0000\u0000\u0000\u0137\u0139\u0005~\u0000\u0000"+
		"\u0138\u013a\u0003F#\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d"+
		"\u0003:\u001d\u0000\u013c\u013e\u0005\t\u0000\u0000\u013d\u013c\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001"+
		"\u0000\u0000\u0000\u013f\u0123\u0001\u0000\u0000\u0000\u013f\u012b\u0001"+
		"\u0000\u0000\u0000\u013f\u0137\u0001\u0000\u0000\u0000\u0140\u000b\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0005e\u0000\u0000\u0142\u0143\u0003 \u0010"+
		"\u0000\u0143\r\u0001\u0000\u0000\u0000\u0144\u0146\u0005d\u0000\u0000"+
		"\u0145\u0147\u0005R\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148"+
		"\u014b\u00032\u0019\u0000\u0149\u014b\u00038\u001c\u0000\u014a\u0148\u0001"+
		"\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0003\u00fa}\u0000\u014d\u0154\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0005d\u0000\u0000\u014f\u0150\u0005R\u0000\u0000"+
		"\u0150\u0151\u0003\u0088D\u0000\u0151\u0152\u0003\u00fa}\u0000\u0152\u0154"+
		"\u0001\u0000\u0000\u0000\u0153\u0144\u0001\u0000\u0000\u0000\u0153\u014e"+
		"\u0001\u0000\u0000\u0000\u0154\u000f\u0001\u0000\u0000\u0000\u0155\u0157"+
		"\u0003\u00f2y\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0156\u0157\u0001"+
		"\u0000\u0000\u0000\u0157\u015c\u0001\u0000\u0000\u0000\u0158\u015a\u0005"+
		"d\u0000\u0000\u0159\u015b\u0005R\u0000\u0000\u015a\u0159\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0001\u0000\u0000"+
		"\u0000\u015c\u0158\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000"+
		"\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e\u0160\u0005\u007f\u0000"+
		"\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0005_\u0000\u0000"+
		"\u0162\u0164\u0003\u00b2Y\u0000\u0163\u0165\u0003\u00b8\\\u0000\u0164"+
		"\u0163\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0003\u0012\t\u0000\u0167\u0168"+
		"\u0003\u0014\n\u0000\u0168\u0011\u0001\u0000\u0000\u0000\u0169\u016b\u0003"+
		"`0\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000"+
		"\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u016e\u0003b1\u0000\u016d"+
		"\u016c\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e"+
		"\u0013\u0001\u0000\u0000\u0000\u016f\u0173\u0005\u0007\u0000\u0000\u0170"+
		"\u0172\u0003d2\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172\u0175\u0001"+
		"\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001"+
		"\u0000\u0000\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u0173\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0005\b\u0000\u0000\u0177\u0015\u0001\u0000"+
		"\u0000\u0000\u0178\u017a\u0005[\u0000\u0000\u0179\u0178\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b\u017d\u0005O\u0000\u0000\u017c\u017e\u0005\u0017\u0000\u0000"+
		"\u017d\u017c\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0003\u00b2Y\u0000\u0180"+
		"\u0186\u0003\u00dcn\u0000\u0181\u0182\u0005\u0007\u0000\u0000\u0182\u0183"+
		"\u0003v;\u0000\u0183\u0184\u0005\b\u0000\u0000\u0184\u0187\u0001\u0000"+
		"\u0000\u0000\u0185\u0187\u0005\t\u0000\u0000\u0186\u0181\u0001\u0000\u0000"+
		"\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0187\u0017\u0001\u0000\u0000"+
		"\u0000\u0188\u018c\u0003\u001a\r\u0000\u0189\u018c\u0005;\u0000\u0000"+
		"\u018a\u018c\u0005<\u0000\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018b"+
		"\u0189\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c"+
		"\u0019\u0001\u0000\u0000\u0000\u018d\u018e\u0007\u0000\u0000\u0000\u018e"+
		"\u001b\u0001\u0000\u0000\u0000\u018f\u0191\u0003\u0006\u0003\u0000\u0190"+
		"\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192"+
		"\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193"+
		"\u001d\u0001\u0000\u0000\u0000\u0194\u0199\u0005\u007f\u0000\u0000\u0195"+
		"\u0196\u0003\u00b2Y\u0000\u0196\u0197\u0003\u00dcn\u0000\u0197\u019a\u0001"+
		"\u0000\u0000\u0000\u0198\u019a\u0003\n\u0005\u0000\u0199\u0195\u0001\u0000"+
		"\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0003\u00fa}\u0000\u019c\u001f\u0001\u0000\u0000"+
		"\u0000\u019d\u019f\u0003*\u0015\u0000\u019e\u019d\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a3\u0003,\u0016\u0000\u01a1\u01a3\u0003\"\u0011\u0000\u01a2"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0003.\u0017\u0000\u01a5\u01a6"+
		"\u0003\u00fa}\u0000\u01a6\u01aa\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005"+
		"\u0090\u0000\u0000\u01a8\u01aa\u0003\u00fa}\u0000\u01a9\u019e\u0001\u0000"+
		"\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa!\u0001\u0000\u0000"+
		"\u0000\u01ab\u01b1\u0005\u0007\u0000\u0000\u01ac\u01ad\u0003$\u0012\u0000"+
		"\u01ad\u01ae\u0005\n\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af"+
		"\u01ac\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1"+
		"\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b6\u0003$\u0012\u0000\u01b5\u01b7\u0005\n\u0000\u0000\u01b6\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b4\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0005\b\u0000\u0000\u01bb#\u0001\u0000\u0000\u0000\u01bc\u01bf\u0003"+
		"&\u0013\u0000\u01bd\u01be\u0005X\u0000\u0000\u01be\u01c0\u0003(\u0014"+
		"\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c0%\u0001\u0000\u0000\u0000\u01c1\u01c4\u0003\u00b0X\u0000\u01c2"+
		"\u01c4\u0005\u0090\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c4\'\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0007\u0001\u0000\u0000\u01c6)\u0001\u0000\u0000\u0000\u01c7\u01c8\u0003"+
		"0\u0018\u0000\u01c8\u01c9\u0005\n\u0000\u0000\u01c9+\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cd\u0005\u0017\u0000\u0000\u01cb\u01cd\u0003\u00b0X\u0000"+
		"\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005X\u0000\u0000\u01cf"+
		"\u01d1\u0003\u00b0X\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d1-\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005"+
		"Y\u0000\u0000\u01d3\u01d4\u0005\u0090\u0000\u0000\u01d4/\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d8\u0003\u00b0X\u0000\u01d6\u01d7\u0005X\u0000\u0000\u01d7"+
		"\u01d9\u0003\u00b0X\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d91\u0001\u0000\u0000\u0000\u01da\u01db\u0003"+
		",\u0016\u0000\u01db\u01dc\u0003.\u0017\u0000\u01dc\u01dd\u0003\u00fa}"+
		"\u0000\u01dd\u01e5\u0001\u0000\u0000\u0000\u01de\u01e0\u00034\u001a\u0000"+
		"\u01df\u01e1\u0003.\u0017\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0003\u00fa}\u0000\u01e3\u01e5\u0001\u0000\u0000\u0000\u01e4\u01da"+
		"\u0001\u0000\u0000\u0000\u01e4\u01de\u0001\u0000\u0000\u0000\u01e53\u0001"+
		"\u0000\u0000\u0000\u01e6\u01ec\u0005\u0007\u0000\u0000\u01e7\u01e8\u0003"+
		"6\u001b\u0000\u01e8\u01e9\u0005\n\u0000\u0000\u01e9\u01eb\u0001\u0000"+
		"\u0000\u0000\u01ea\u01e7\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ed\u01f3\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f1\u00036\u001b\u0000\u01f0\u01f2\u0005\n\u0000"+
		"\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u0005\b\u0000\u0000\u01f65\u0001\u0000\u0000\u0000"+
		"\u01f7\u01fa\u0003&\u0013\u0000\u01f8\u01f9\u0005X\u0000\u0000\u01f9\u01fb"+
		"\u0003&\u0013\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fb7\u0001\u0000\u0000\u0000\u01fc\u0200\u0003\n"+
		"\u0005\u0000\u01fd\u0200\u0003\u0010\b\u0000\u01fe\u0200\u0003\u0016\u000b"+
		"\u0000\u01ff\u01fc\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000"+
		"\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u02009\u0001\u0000\u0000\u0000"+
		"\u0201\u0203\u0005\u0005\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000"+
		"\u0204\u0206\u0003<\u001e\u0000\u0205\u0207\u0005\u0006\u0000\u0000\u0206"+
		"\u0205\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207"+
		"\u020c\u0001\u0000\u0000\u0000\u0208\u0209\u0005\n\u0000\u0000\u0209\u020b"+
		"\u0003<\u001e\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020b\u020e\u0001"+
		"\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001"+
		"\u0000\u0000\u0000\u020d;\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000"+
		"\u0000\u0000\u020f\u0213\u0003\u00b4Z\u0000\u0210\u0213\u0003\u00a6S\u0000"+
		"\u0211\u0213\u0003\u00a8T\u0000\u0212\u020f\u0001\u0000\u0000\u0000\u0212"+
		"\u0210\u0001\u0000\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213"+
		"\u0215\u0001\u0000\u0000\u0000\u0214\u0216\u0003\u00dam\u0000\u0215\u0214"+
		"\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0218"+
		"\u0001\u0000\u0000\u0000\u0217\u0219\u0003\u0088D\u0000\u0218\u0217\u0001"+
		"\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021f\u0001"+
		"\u0000\u0000\u0000\u021a\u021c\u0005\u000b\u0000\u0000\u021b\u021d\u0003"+
		"\u00b8\\\u0000\u021c\u021b\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000"+
		"\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0220\u0003\u0088"+
		"D\u0000\u021f\u021a\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000"+
		"\u0000\u0220=\u0001\u0000\u0000\u0000\u0221\u0222\u0005\t\u0000\u0000"+
		"\u0222?\u0001\u0000\u0000\u0000\u0223\u0225\u0003\u0086C\u0000\u0224\u0226"+
		"\u0005\t\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001"+
		"\u0000\u0000\u0000\u0226A\u0001\u0000\u0000\u0000\u0227\u0228\u0005S\u0000"+
		"\u0000\u0228\u0229\u0005\u0005\u0000\u0000\u0229\u022a\u0003\u0086C\u0000"+
		"\u022a\u022b\u0005\u0006\u0000\u0000\u022b\u022e\u0003\u0006\u0003\u0000"+
		"\u022c\u022d\u0005C\u0000\u0000\u022d\u022f\u0003\u0006\u0003\u0000\u022e"+
		"\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f"+
		"C\u0001\u0000\u0000\u0000\u0230\u0231\u0005?\u0000\u0000\u0231\u0232\u0003"+
		"\u0006\u0003\u0000\u0232\u0233\u0005M\u0000\u0000\u0233\u0234\u0005\u0005"+
		"\u0000\u0000\u0234\u0235\u0003\u0086C\u0000\u0235\u0236\u0005\u0006\u0000"+
		"\u0000\u0236\u0237\u0003\u00fa}\u0000\u0237\u028d\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0005M\u0000\u0000\u0239\u023a\u0005\u0005\u0000\u0000\u023a"+
		"\u023b\u0003\u0086C\u0000\u023b\u023c\u0005\u0006\u0000\u0000\u023c\u023d"+
		"\u0003\u0006\u0003\u0000\u023d\u028d\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0005K\u0000\u0000\u023f\u0241\u0005\u0005\u0000\u0000\u0240\u0242\u0003"+
		"\u0086C\u0000\u0241\u0240\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000"+
		"\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0245\u0005\t\u0000"+
		"\u0000\u0244\u0246\u0003\u0086C\u0000\u0245\u0244\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000"+
		"\u0247\u0249\u0005\t\u0000\u0000\u0248\u024a\u0003\u0086C\u0000\u0249"+
		"\u0248\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a"+
		"\u024b\u0001\u0000\u0000\u0000\u024b\u024c\u0005\u0006\u0000\u0000\u024c"+
		"\u028d\u0003\u0006\u0003\u0000\u024d\u024e\u0005K\u0000\u0000\u024e\u024f"+
		"\u0005\u0005\u0000\u0000\u024f\u0250\u0003F#\u0000\u0250\u0251\u0003:"+
		"\u001d\u0000\u0251\u0253\u0005\t\u0000\u0000\u0252\u0254\u0003\u0086C"+
		"\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000"+
		"\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0257\u0005\t\u0000\u0000"+
		"\u0256\u0258\u0003\u0086C\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0257"+
		"\u0258\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259"+
		"\u025a\u0005\u0006\u0000\u0000\u025a\u025b\u0003\u0006\u0003\u0000\u025b"+
		"\u028d\u0001\u0000\u0000\u0000\u025c\u025d\u0005K\u0000\u0000\u025d\u025e"+
		"\u0005\u0005\u0000\u0000\u025e\u025f\u0003\u0088D\u0000\u025f\u0260\u0005"+
		"V\u0000\u0000\u0260\u0261\u0003\u0086C\u0000\u0261\u0262\u0005\u0006\u0000"+
		"\u0000\u0262\u0263\u0003\u0006\u0003\u0000\u0263\u028d\u0001\u0000\u0000"+
		"\u0000\u0264\u0265\u0005K\u0000\u0000\u0265\u0266\u0005\u0005\u0000\u0000"+
		"\u0266\u0267\u0003F#\u0000\u0267\u0268\u0003<\u001e\u0000\u0268\u0269"+
		"\u0005V\u0000\u0000\u0269\u026a\u0003\u0086C\u0000\u026a\u026b\u0005\u0006"+
		"\u0000\u0000\u026b\u026c\u0003\u0006\u0003\u0000\u026c\u028d\u0001\u0000"+
		"\u0000\u0000\u026d\u026f\u0005K\u0000\u0000\u026e\u0270\u0005\\\u0000"+
		"\u0000\u026f\u026e\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000"+
		"\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0005\u0005\u0000"+
		"\u0000\u0272\u0273\u0003\u0088D\u0000\u0273\u0274\u0003\u00b2Y\u0000\u0274"+
		"\u0277\u0003\u0086C\u0000\u0275\u0276\u0005X\u0000\u0000\u0276\u0278\u0003"+
		"\u00c6c\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000"+
		"\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a\u0005\u0006"+
		"\u0000\u0000\u027a\u027b\u0003\u0006\u0003\u0000\u027b\u028d\u0001\u0000"+
		"\u0000\u0000\u027c\u027e\u0005K\u0000\u0000\u027d\u027f\u0005\\\u0000"+
		"\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000"+
		"\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0281\u0005\u0005\u0000"+
		"\u0000\u0281\u0282\u0003F#\u0000\u0282\u0283\u0003<\u001e\u0000\u0283"+
		"\u0284\u0003\u00b2Y\u0000\u0284\u0287\u0003\u0086C\u0000\u0285\u0286\u0005"+
		"X\u0000\u0000\u0286\u0288\u0003\u00c6c\u0000\u0287\u0285\u0001\u0000\u0000"+
		"\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0005\u0006\u0000\u0000\u028a\u028b\u0003\u0006\u0003"+
		"\u0000\u028b\u028d\u0001\u0000\u0000\u0000\u028c\u0230\u0001\u0000\u0000"+
		"\u0000\u028c\u0238\u0001\u0000\u0000\u0000\u028c\u023e\u0001\u0000\u0000"+
		"\u0000\u028c\u024d\u0001\u0000\u0000\u0000\u028c\u025c\u0001\u0000\u0000"+
		"\u0000\u028c\u0264\u0001\u0000\u0000\u0000\u028c\u026d\u0001\u0000\u0000"+
		"\u0000\u028c\u027c\u0001\u0000\u0000\u0000\u028dE\u0001\u0000\u0000\u0000"+
		"\u028e\u028f\u0007\u0002\u0000\u0000\u028fG\u0001\u0000\u0000\u0000\u0290"+
		"\u0292\u0005J\u0000\u0000\u0291\u0293\u0003\u00b2Y\u0000\u0292\u0291\u0001"+
		"\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0294\u0001"+
		"\u0000\u0000\u0000\u0294\u0295\u0003\u00fa}\u0000\u0295I\u0001\u0000\u0000"+
		"\u0000\u0296\u0298\u0005>\u0000\u0000\u0297\u0299\u0003\u00b2Y\u0000\u0298"+
		"\u0297\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299"+
		"\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0003\u00fa}\u0000\u029bK\u0001"+
		"\u0000\u0000\u0000\u029c\u029e\u0005H\u0000\u0000\u029d\u029f\u0003\u0086"+
		"C\u0000\u029e\u029d\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000"+
		"\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a8\u0003\u00fa}\u0000"+
		"\u02a1\u02a2\u0005H\u0000\u0000\u02a2\u02a3\u0005\u0005\u0000\u0000\u02a3"+
		"\u02a4\u0003\u008aE\u0000\u02a4\u02a5\u0005\u0006\u0000\u0000\u02a5\u02a6"+
		"\u0003\u00fa}\u0000\u02a6\u02a8\u0001\u0000\u0000\u0000\u02a7\u029c\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a1\u0001\u0000\u0000\u0000\u02a8M\u0001\u0000"+
		"\u0000\u0000\u02a9\u02aa\u0005L\u0000\u0000\u02aa\u02ab\u0005\u0005\u0000"+
		"\u0000\u02ab\u02ac\u0003\u0086C\u0000\u02ac\u02ad\u0005\u0006\u0000\u0000"+
		"\u02ad\u02ae\u0003P(\u0000\u02aeO\u0001\u0000\u0000\u0000\u02af\u02b1"+
		"\u0005\u0007\u0000\u0000\u02b0\u02b2\u0003R)\u0000\u02b1\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b7\u0001\u0000"+
		"\u0000\u0000\u02b3\u02b5\u0003V+\u0000\u02b4\u02b6\u0003R)\u0000\u02b5"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b7\u02b3\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9"+
		"\u02ba\u0005\b\u0000\u0000\u02baQ\u0001\u0000\u0000\u0000\u02bb\u02bd"+
		"\u0003T*\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000"+
		"\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000"+
		"\u0000\u0000\u02bfS\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005B\u0000\u0000"+
		"\u02c1\u02c2\u0003\u0086C\u0000\u02c2\u02c4\u0005\u000e\u0000\u0000\u02c3"+
		"\u02c5\u0003\u001c\u000e\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000\u02c4"+
		"\u02c5\u0001\u0000\u0000\u0000\u02c5U\u0001\u0000\u0000\u0000\u02c6\u02c7"+
		"\u0005R\u0000\u0000\u02c7\u02c9\u0005\u000e\u0000\u0000\u02c8\u02ca\u0003"+
		"\u001c\u000e\u0000\u02c9\u02c8\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001"+
		"\u0000\u0000\u0000\u02caW\u0001\u0000\u0000\u0000\u02cb\u02cc\u0005T\u0000"+
		"\u0000\u02cc\u02cd\u0003\u0086C\u0000\u02cd\u02ce\u0003\u00fa}\u0000\u02ce"+
		"Y\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005W\u0000\u0000\u02d0\u02d6\u0003"+
		"\b\u0004\u0000\u02d1\u02d3\u0003\\.\u0000\u02d2\u02d4\u0003^/\u0000\u02d3"+
		"\u02d2\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d5\u02d7\u0003^/\u0000\u02d6\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d5\u0001\u0000\u0000\u0000\u02d7[\u0001\u0000"+
		"\u0000\u0000\u02d8\u02e0\u0005F\u0000\u0000\u02d9\u02da\u0005\u0005\u0000"+
		"\u0000\u02da\u02dc\u0003\u00b2Y\u0000\u02db\u02dd\u0003\u00dam\u0000\u02dc"+
		"\u02db\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd"+
		"\u02de\u0001\u0000\u0000\u0000\u02de\u02df\u0005\u0006\u0000\u0000\u02df"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e0\u02d9\u0001\u0000\u0000\u0000\u02e0"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e3\u0003\b\u0004\u0000\u02e3]\u0001\u0000\u0000\u0000\u02e4\u02e5"+
		"\u0005G\u0000\u0000\u02e5\u02e6\u0003\b\u0004\u0000\u02e6_\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e8\u0005a\u0000\u0000\u02e8\u02e9\u0003\u00ceg\u0000"+
		"\u02e9a\u0001\u0000\u0000\u0000\u02ea\u02eb\u0005f\u0000\u0000\u02eb\u02ec"+
		"\u0003\u00eew\u0000\u02ecc\u0001\u0000\u0000\u0000\u02ed\u02f5\u0003\u00ec"+
		"v\u0000\u02ee\u02f0\u0003\u00f2y\u0000\u02ef\u02ee\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f5\u0003f3\u0000\u02f2\u02f5\u0003j5\u0000\u02f3\u02f5\u0003"+
		"\u0006\u0003\u0000\u02f4\u02ed\u0001\u0000\u0000\u0000\u02f4\u02ef\u0001"+
		"\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f5e\u0001\u0000\u0000\u0000\u02f6\u02f7\u0003h4"+
		"\u0000\u02f7\u02f9\u0003~?\u0000\u02f8\u02fa\u0005\f\u0000\u0000\u02f9"+
		"\u02f8\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fc\u0001\u0000\u0000\u0000\u02fb\u02fd\u0003\u00dam\u0000\u02fc\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe"+
		"\u0001\u0000\u0000\u0000\u02fe\u02ff\u0005\t\u0000\u0000\u02ff\u030c\u0001"+
		"\u0000\u0000\u0000\u0300\u0301\u0003h4\u0000\u0301\u0302\u0003~?\u0000"+
		"\u0302\u0308\u0003\u00dcn\u0000\u0303\u0304\u0005\u0007\u0000\u0000\u0304"+
		"\u0305\u0003v;\u0000\u0305\u0306\u0005\b\u0000\u0000\u0306\u0309\u0001"+
		"\u0000\u0000\u0000\u0307\u0309\u0005\t\u0000\u0000\u0308\u0303\u0001\u0000"+
		"\u0000\u0000\u0308\u0307\u0001\u0000\u0000\u0000\u0309\u030c\u0001\u0000"+
		"\u0000\u0000\u030a\u030c\u0003\u001e\u000f\u0000\u030b\u02f6\u0001\u0000"+
		"\u0000\u0000\u030b\u0300\u0001\u0000\u0000\u0000\u030b\u030a\u0001\u0000"+
		"\u0000\u0000\u030cg\u0001\u0000\u0000\u0000\u030d\u030f\u0003\u00e6s\u0000"+
		"\u030e\u030d\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000"+
		"\u030f\u0311\u0001\u0000\u0000\u0000\u0310\u0312\u0005[\u0000\u0000\u0311"+
		"\u0310\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312"+
		"\u0314\u0001\u0000\u0000\u0000\u0313\u0315\u0005m\u0000\u0000\u0314\u0313"+
		"\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0317"+
		"\u0001\u0000\u0000\u0000\u0316\u0318\u0005Z\u0000\u0000\u0317\u0316\u0001"+
		"\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318i\u0001\u0000"+
		"\u0000\u0000\u0319\u031a\u0003\u00eau\u0000\u031a\u031b\u0005\t\u0000"+
		"\u0000\u031bk\u0001\u0000\u0000\u0000\u031c\u031d\u0005\u0007\u0000\u0000"+
		"\u031d\u0322\u0003n7\u0000\u031e\u031f\u0005\n\u0000\u0000\u031f\u0321"+
		"\u0003n7\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0321\u0324\u0001\u0000"+
		"\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000"+
		"\u0000\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000"+
		"\u0000\u0000\u0325\u0327\u0005\n\u0000\u0000\u0326\u0325\u0001\u0000\u0000"+
		"\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0328\u0001\u0000\u0000"+
		"\u0000\u0328\u0329\u0005\b\u0000\u0000\u0329m\u0001\u0000\u0000\u0000"+
		"\u032a\u032b\u0005\u0003\u0000\u0000\u032b\u032c\u0003\u0088D\u0000\u032c"+
		"\u032d\u0005\u0004\u0000\u0000\u032d\u032f\u0005\u0005\u0000\u0000\u032e"+
		"\u0330\u0003p8\u0000\u032f\u032e\u0001\u0000\u0000\u0000\u032f\u0330\u0001"+
		"\u0000\u0000\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0332\u0005"+
		"\u0006\u0000\u0000\u0332\u0333\u0005\u0007\u0000\u0000\u0333\u0334\u0003"+
		"v;\u0000\u0334\u0335\u0005\b\u0000\u0000\u0335o\u0001\u0000\u0000\u0000"+
		"\u0336\u033b\u0003r9\u0000\u0337\u0338\u0005\n\u0000\u0000\u0338\u033a"+
		"\u0003r9\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u033a\u033d\u0001\u0000"+
		"\u0000\u0000\u033b\u0339\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000"+
		"\u0000\u0000\u033c\u0340\u0001\u0000\u0000\u0000\u033d\u033b\u0001\u0000"+
		"\u0000\u0000\u033e\u033f\u0005\n\u0000\u0000\u033f\u0341\u0003t:\u0000"+
		"\u0340\u033e\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000"+
		"\u0341\u0343\u0001\u0000\u0000\u0000\u0342\u0344\u0005\n\u0000\u0000\u0343"+
		"\u0342\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344"+
		"\u034d\u0001\u0000\u0000\u0000\u0345\u034d\u0003t:\u0000\u0346\u034d\u0003"+
		"\u00a6S\u0000\u0347\u034a\u0003\u00a8T\u0000\u0348\u0349\u0005\u000e\u0000"+
		"\u0000\u0349\u034b\u0003p8\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034a"+
		"\u034b\u0001\u0000\u0000\u0000\u034b\u034d\u0001\u0000\u0000\u0000\u034c"+
		"\u0336\u0001\u0000\u0000\u0000\u034c\u0345\u0001\u0000\u0000\u0000\u034c"+
		"\u0346\u0001\u0000\u0000\u0000\u034c\u0347\u0001\u0000\u0000\u0000\u034d"+
		"q\u0001\u0000\u0000\u0000\u034e\u0350\u0003\u00f4z\u0000\u034f\u034e\u0001"+
		"\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0352\u0001"+
		"\u0000\u0000\u0000\u0351\u0353\u0003\u00e6s\u0000\u0352\u0351\u0001\u0000"+
		"\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0354\u0001\u0000"+
		"\u0000\u0000\u0354\u0356\u0003\u00a4R\u0000\u0355\u0357\u0005\f\u0000"+
		"\u0000\u0356\u0355\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000"+
		"\u0000\u0357\u0359\u0001\u0000\u0000\u0000\u0358\u035a\u0003\u00dam\u0000"+
		"\u0359\u0358\u0001\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000\u0000"+
		"\u035a\u035d\u0001\u0000\u0000\u0000\u035b\u035c\u0005\u000b\u0000\u0000"+
		"\u035c\u035e\u0003\u0088D\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035d"+
		"\u035e\u0001\u0000\u0000\u0000\u035es\u0001\u0000\u0000\u0000\u035f\u0360"+
		"\u0005\u000f\u0000\u0000\u0360\u0362\u0003\u00b2Y\u0000\u0361\u0363\u0003"+
		"\u00dam\u0000\u0362\u0361\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000"+
		"\u0000\u0000\u0363u\u0001\u0000\u0000\u0000\u0364\u0366\u0003\u0002\u0001"+
		"\u0000\u0365\u0364\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000"+
		"\u0000\u0366w\u0001\u0000\u0000\u0000\u0367\u0369\u0005\n\u0000\u0000"+
		"\u0368\u0367\u0001\u0000\u0000\u0000\u0369\u036c\u0001\u0000\u0000\u0000"+
		"\u036a\u0368\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000"+
		"\u036b\u036e\u0001\u0000\u0000\u0000\u036c\u036a\u0001\u0000\u0000\u0000"+
		"\u036d\u036f\u0003z=\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036e\u036f"+
		"\u0001\u0000\u0000\u0000\u036f\u0378\u0001\u0000\u0000\u0000\u0370\u0372"+
		"\u0005\n\u0000\u0000\u0371\u0370\u0001\u0000\u0000\u0000\u0372\u0373\u0001"+
		"\u0000\u0000\u0000\u0373\u0371\u0001\u0000\u0000\u0000\u0373\u0374\u0001"+
		"\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u0377\u0003"+
		"z=\u0000\u0376\u0371\u0001\u0000\u0000\u0000\u0377\u037a\u0001\u0000\u0000"+
		"\u0000\u0378\u0376\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000"+
		"\u0000\u0379\u037e\u0001\u0000\u0000\u0000\u037a\u0378\u0001\u0000\u0000"+
		"\u0000\u037b\u037d\u0005\n\u0000\u0000\u037c\u037b\u0001\u0000\u0000\u0000"+
		"\u037d\u0380\u0001\u0000\u0000\u0000\u037e\u037c\u0001\u0000\u0000\u0000"+
		"\u037e\u037f\u0001\u0000\u0000\u0000\u037fy\u0001\u0000\u0000\u0000\u0380"+
		"\u037e\u0001\u0000\u0000\u0000\u0381\u0383\u0005\u000f\u0000\u0000\u0382"+
		"\u0381\u0001\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383"+
		"\u0386\u0001\u0000\u0000\u0000\u0384\u0387\u0003\u0088D\u0000\u0385\u0387"+
		"\u0003\u00b2Y\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0386\u0385\u0001"+
		"\u0000\u0000\u0000\u0387\u0389\u0001\u0000\u0000\u0000\u0388\u038a\u0005"+
		"\n\u0000\u0000\u0389\u0388\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000"+
		"\u0000\u0000\u038a{\u0001\u0000\u0000\u0000\u038b\u038c\u0003~?\u0000"+
		"\u038c\u038d\u0007\u0003\u0000\u0000\u038d\u038e\u0003\u0088D\u0000\u038e"+
		"\u039c\u0001\u0000\u0000\u0000\u038f\u0390\u0005\u0003\u0000\u0000\u0390"+
		"\u0391\u0003\u0088D\u0000\u0391\u0392\u0005\u0004\u0000\u0000\u0392\u0393"+
		"\u0005\u000e\u0000\u0000\u0393\u0394\u0003\u0088D\u0000\u0394\u039c\u0001"+
		"\u0000\u0000\u0000\u0395\u039c\u0003\u00b4Z\u0000\u0396\u0398\u0005\u000f"+
		"\u0000\u0000\u0397\u0396\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000"+
		"\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399\u039c\u0003\u0088"+
		"D\u0000\u039a\u039c\u0003\u00e2q\u0000\u039b\u038b\u0001\u0000\u0000\u0000"+
		"\u039b\u038f\u0001\u0000\u0000\u0000\u039b\u0395\u0001\u0000\u0000\u0000"+
		"\u039b\u0397\u0001\u0000\u0000\u0000\u039b\u039a\u0001\u0000\u0000\u0000"+
		"\u039c}\u0001\u0000\u0000\u0000\u039d\u03a5\u0003\u00b0X\u0000\u039e\u03a5"+
		"\u0005\u0090\u0000\u0000\u039f\u03a5\u0003\u00aeW\u0000\u03a0\u03a1\u0005"+
		"\u0003\u0000\u0000\u03a1\u03a2\u0003\u0088D\u0000\u03a2\u03a3\u0005\u0004"+
		"\u0000\u0000\u03a3\u03a5\u0001\u0000\u0000\u0000\u03a4\u039d\u0001\u0000"+
		"\u0000\u0000\u03a4\u039e\u0001\u0000\u0000\u0000\u03a4\u039f\u0001\u0000"+
		"\u0000\u0000\u03a4\u03a0\u0001\u0000\u0000\u0000\u03a5\u007f\u0001\u0000"+
		"\u0000\u0000\u03a6\u03ab\u0005\u0005\u0000\u0000\u03a7\u03a9\u0003\u0082"+
		"A\u0000\u03a8\u03aa\u0005\n\u0000\u0000\u03a9\u03a8\u0001\u0000\u0000"+
		"\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ab\u03a7\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000\u03ad\u03ae\u0005\u0006\u0000"+
		"\u0000\u03ae\u0081\u0001\u0000\u0000\u0000\u03af\u03b4\u0003\u0084B\u0000"+
		"\u03b0\u03b1\u0005\n\u0000\u0000\u03b1\u03b3\u0003\u0084B\u0000\u03b2"+
		"\u03b0\u0001\u0000\u0000\u0000\u03b3\u03b6\u0001\u0000\u0000\u0000\u03b4"+
		"\u03b2\u0001\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5"+
		"\u0083\u0001\u0000\u0000\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b7"+
		"\u03b9\u0005\u000f\u0000\u0000\u03b8\u03b7\u0001\u0000\u0000\u0000\u03b8"+
		"\u03b9\u0001\u0000\u0000\u0000\u03b9\u03bc\u0001\u0000\u0000\u0000\u03ba"+
		"\u03bd\u0003\u0088D\u0000\u03bb\u03bd\u0003\u00b2Y\u0000\u03bc\u03ba\u0001"+
		"\u0000\u0000\u0000\u03bc\u03bb\u0001\u0000\u0000\u0000\u03bd\u0085\u0001"+
		"\u0000\u0000\u0000\u03be\u03c3\u0003\u0088D\u0000\u03bf\u03c0\u0005\n"+
		"\u0000\u0000\u03c0\u03c2\u0003\u0088D\u0000\u03c1\u03bf\u0001\u0000\u0000"+
		"\u0000\u03c2\u03c5\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000"+
		"\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000\u03c4\u0087\u0001\u0000\u0000"+
		"\u0000\u03c5\u03c3\u0001\u0000\u0000\u0000\u03c6\u03c7\u0006D\uffff\uffff"+
		"\u0000\u03c7\u03c9\u0005_\u0000\u0000\u03c8\u03ca\u0003\u00b2Y\u0000\u03c9"+
		"\u03c8\u0001\u0000\u0000\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000\u03ca"+
		"\u03cc\u0001\u0000\u0000\u0000\u03cb\u03cd\u0003\u00b8\\\u0000\u03cc\u03cb"+
		"\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03ce"+
		"\u0001\u0000\u0000\u0000\u03ce\u03cf\u0003\u0012\t\u0000\u03cf\u03d0\u0003"+
		"\u0014\n\u0000\u03d0\u0408\u0001\u0000\u0000\u0000\u03d1\u03d2\u0005D"+
		"\u0000\u0000\u03d2\u03d4\u0003\u0088D\u0000\u03d3\u03d5\u0003\u00c0`\u0000"+
		"\u03d4\u03d3\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000"+
		"\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6\u03d7\u0003\u0080@\u0000\u03d7"+
		"\u0408\u0001\u0000\u0000\u0000\u03d8\u03d9\u0005D\u0000\u0000\u03d9\u03db"+
		"\u0003\u0088D\u0000\u03da\u03dc\u0003\u00c0`\u0000\u03db\u03da\u0001\u0000"+
		"\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u0408\u0001\u0000"+
		"\u0000\u0000\u03dd\u03de\u0005U\u0000\u0000\u03de\u0408\u0003\u0088D\'"+
		"\u03df\u03e0\u0005I\u0000\u0000\u03e0\u0408\u0003\u0088D&\u03e1\u03e2"+
		"\u0005A\u0000\u0000\u03e2\u0408\u0003\u0088D%\u03e3\u03e4\u0005\u0011"+
		"\u0000\u0000\u03e4\u0408\u0003\u0088D$\u03e5\u03e6\u0005\u0012\u0000\u0000"+
		"\u03e6\u0408\u0003\u0088D#\u03e7\u03e8\u0005\u0013\u0000\u0000\u03e8\u0408"+
		"\u0003\u0088D\"\u03e9\u03ea\u0005\u0014\u0000\u0000\u03ea\u0408\u0003"+
		"\u0088D!\u03eb\u03ec\u0005\u0015\u0000\u0000\u03ec\u0408\u0003\u0088D"+
		" \u03ed\u03ee\u0005\u0016\u0000\u0000\u03ee\u0408\u0003\u0088D\u001f\u03ef"+
		"\u03f0\u0005\\\u0000\u0000\u03f0\u0408\u0003\u0088D\u001e\u03f1\u0408"+
		"\u0003l6\u0000\u03f2\u0408\u0005P\u0000\u0000\u03f3\u03f5\u0005\u008d"+
		"\u0000\u0000\u03f4\u03f3\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000"+
		"\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6\u03f8\u0003\u00b0"+
		"X\u0000\u03f7\u03f9\u0003\u0088D\u0000\u03f8\u03f7\u0001\u0000\u0000\u0000"+
		"\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u0408\u0001\u0000\u0000\u0000"+
		"\u03fa\u0408\u0005b\u0000\u0000\u03fb\u0408\u0003\u00acV\u0000\u03fc\u0408"+
		"\u0003\u00a6S\u0000\u03fd\u0408\u0003\u00a8T\u0000\u03fe\u0408\u0003\u008c"+
		"F\u0000\u03ff\u0400\u0005\u0005\u0000\u0000\u0400\u0401\u0003\u0086C\u0000"+
		"\u0401\u0402\u0005\u0006\u0000\u0000\u0402\u0408\u0001\u0000\u0000\u0000"+
		"\u0403\u0405\u0003\u00c0`\u0000\u0404\u0406\u0003\u0086C\u0000\u0405\u0404"+
		"\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000\u0406\u0408"+
		"\u0001\u0000\u0000\u0000\u0407\u03c6\u0001\u0000\u0000\u0000\u0407\u03d1"+
		"\u0001\u0000\u0000\u0000\u0407\u03d8\u0001\u0000\u0000\u0000\u0407\u03dd"+
		"\u0001\u0000\u0000\u0000\u0407\u03df\u0001\u0000\u0000\u0000\u0407\u03e1"+
		"\u0001\u0000\u0000\u0000\u0407\u03e3\u0001\u0000\u0000\u0000\u0407\u03e5"+
		"\u0001\u0000\u0000\u0000\u0407\u03e7\u0001\u0000\u0000\u0000\u0407\u03e9"+
		"\u0001\u0000\u0000\u0000\u0407\u03eb\u0001\u0000\u0000\u0000\u0407\u03ed"+
		"\u0001\u0000\u0000\u0000\u0407\u03ef\u0001\u0000\u0000\u0000\u0407\u03f1"+
		"\u0001\u0000\u0000\u0000\u0407\u03f2\u0001\u0000\u0000\u0000\u0407\u03f4"+
		"\u0001\u0000\u0000\u0000\u0407\u03fa\u0001\u0000\u0000\u0000\u0407\u03fb"+
		"\u0001\u0000\u0000\u0000\u0407\u03fc\u0001\u0000\u0000\u0000\u0407\u03fd"+
		"\u0001\u0000\u0000\u0000\u0407\u03fe\u0001\u0000\u0000\u0000\u0407\u03ff"+
		"\u0001\u0000\u0000\u0000\u0407\u0403\u0001\u0000\u0000\u0000\u0408\u0477"+
		"\u0001\u0000\u0000\u0000\u0409\u040a\n/\u0000\u0000\u040a\u040b\u0005"+
		"\r\u0000\u0000\u040b\u0476\u0003\u0088D0\u040c\u040d\n\u001d\u0000\u0000"+
		"\u040d\u040e\u0005\u001a\u0000\u0000\u040e\u0476\u0003\u0088D\u001d\u040f"+
		"\u0410\n\u001c\u0000\u0000\u0410\u0411\u0007\u0004\u0000\u0000\u0411\u0476"+
		"\u0003\u0088D\u001d\u0412\u0413\n\u001b\u0000\u0000\u0413\u0414\u0007"+
		"\u0005\u0000\u0000\u0414\u0476\u0003\u0088D\u001c\u0415\u0416\n\u001a"+
		"\u0000\u0000\u0416\u0417\u0005\u001b\u0000\u0000\u0417\u0476\u0003\u0088"+
		"D\u001b\u0418\u041f\n\u0019\u0000\u0000\u0419\u0420\u0005\u001d\u0000"+
		"\u0000\u041a\u041b\u0005\u001f\u0000\u0000\u041b\u0420\u0005\u001f\u0000"+
		"\u0000\u041c\u041d\u0005\u001f\u0000\u0000\u041d\u041e\u0005\u001f\u0000"+
		"\u0000\u041e\u0420\u0005\u001f\u0000\u0000\u041f\u0419\u0001\u0000\u0000"+
		"\u0000\u041f\u041a\u0001\u0000\u0000\u0000\u041f\u041c\u0001\u0000\u0000"+
		"\u0000\u0420\u0421\u0001\u0000\u0000\u0000\u0421\u0476\u0003\u0088D\u001a"+
		"\u0422\u0423\n\u0018\u0000\u0000\u0423\u0424\u0007\u0006\u0000\u0000\u0424"+
		"\u0476\u0003\u0088D\u0019\u0425\u0426\n\u0017\u0000\u0000\u0426\u0427"+
		"\u0005@\u0000\u0000\u0427\u0476\u0003\u0088D\u0018\u0428\u0429\n\u0016"+
		"\u0000\u0000\u0429\u042a\u0005V\u0000\u0000\u042a\u0476\u0003\u0088D\u0017"+
		"\u042b\u042c\n\u0015\u0000\u0000\u042c\u042d\u0007\u0007\u0000\u0000\u042d"+
		"\u0476\u0003\u0088D\u0016\u042e\u042f\n\u0014\u0000\u0000\u042f\u0430"+
		"\u0005&\u0000\u0000\u0430\u0476\u0003\u0088D\u0015\u0431\u0432\n\u0013"+
		"\u0000\u0000\u0432\u0433\u0005\'\u0000\u0000\u0433\u0476\u0003\u0088D"+
		"\u0014\u0434\u0435\n\u0012\u0000\u0000\u0435\u0436\u0005(\u0000\u0000"+
		"\u0436\u0476\u0003\u0088D\u0013\u0437\u0438\n\u0011\u0000\u0000\u0438"+
		"\u0439\u0005)\u0000\u0000\u0439\u0476\u0003\u0088D\u0012\u043a\u043b\n"+
		"\u0010\u0000\u0000\u043b\u043c\u0005*\u0000\u0000\u043c\u0476\u0003\u0088"+
		"D\u0011\u043d\u043e\n\u000f\u0000\u0000\u043e\u043f\u0005\f\u0000\u0000"+
		"\u043f\u0440\u0003\u0088D\u0000\u0440\u0441\u0005\u000e\u0000\u0000\u0441"+
		"\u0442\u0003\u0088D\u0010\u0442\u0476\u0001\u0000\u0000\u0000\u0443\u0444"+
		"\n\u000e\u0000\u0000\u0444\u0445\u0005\u000b\u0000\u0000\u0445\u0476\u0003"+
		"\u0088D\u000f\u0446\u0447\n\r\u0000\u0000\u0447\u0448\u0003\u00aaU\u0000"+
		"\u0448\u0449\u0003\u0088D\u000e\u0449\u0476\u0001\u0000\u0000\u0000\u044a"+
		"\u044c\n0\u0000\u0000\u044b\u044d\u0005\r\u0000\u0000\u044c\u044b\u0001"+
		"\u0000\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u044e\u0001"+
		"\u0000\u0000\u0000\u044e\u044f\u0005\u0003\u0000\u0000\u044f\u0450\u0003"+
		"\u0086C\u0000\u0450\u0451\u0005\u0004\u0000\u0000\u0451\u0476\u0001\u0000"+
		"\u0000\u0000\u0452\u0454\n.\u0000\u0000\u0453\u0455\u0005\u0016\u0000"+
		"\u0000\u0454\u0453\u0001\u0000\u0000\u0000\u0454\u0455\u0001\u0000\u0000"+
		"\u0000\u0455\u0456\u0001\u0000\u0000\u0000\u0456\u0458\u0005\u0010\u0000"+
		"\u0000\u0457\u0459\u0005\u001c\u0000\u0000\u0458\u0457\u0001\u0000\u0000"+
		"\u0000\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u045a\u0001\u0000\u0000"+
		"\u0000\u045a\u045c\u0003\u00b0X\u0000\u045b\u045d\u0003\u00d0h\u0000\u045c"+
		"\u045b\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000\u0000\u045d"+
		"\u0476\u0001\u0000\u0000\u0000\u045e\u0460\n-\u0000\u0000\u045f\u0461"+
		"\u0005\f\u0000\u0000\u0460\u045f\u0001\u0000\u0000\u0000\u0460\u0461\u0001"+
		"\u0000\u0000\u0000\u0461\u0462\u0001\u0000\u0000\u0000\u0462\u0464\u0005"+
		"\u0010\u0000\u0000\u0463\u0465\u0005\u001c\u0000\u0000\u0464\u0463\u0001"+
		"\u0000\u0000\u0000\u0464\u0465\u0001\u0000\u0000\u0000\u0465\u0466\u0001"+
		"\u0000\u0000\u0000\u0466\u0468\u0003\u00b0X\u0000\u0467\u0469\u0003\u00d0"+
		"h\u0000\u0468\u0467\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000"+
		"\u0000\u0469\u0476\u0001\u0000\u0000\u0000\u046a\u046b\n*\u0000\u0000"+
		"\u046b\u0476\u0003\u0080@\u0000\u046c\u046d\n)\u0000\u0000\u046d\u0476"+
		"\u0005\u0011\u0000\u0000\u046e\u046f\n(\u0000\u0000\u046f\u0476\u0005"+
		"\u0012\u0000\u0000\u0470\u0471\n\u0002\u0000\u0000\u0471\u0472\u0005X"+
		"\u0000\u0000\u0472\u0476\u0003\u00a2Q\u0000\u0473\u0474\n\u0001\u0000"+
		"\u0000\u0474\u0476\u0005\u0016\u0000\u0000\u0475\u0409\u0001\u0000\u0000"+
		"\u0000\u0475\u040c\u0001\u0000\u0000\u0000\u0475\u040f\u0001\u0000\u0000"+
		"\u0000\u0475\u0412\u0001\u0000\u0000\u0000\u0475\u0415\u0001\u0000\u0000"+
		"\u0000\u0475\u0418\u0001\u0000\u0000\u0000\u0475\u0422\u0001\u0000\u0000"+
		"\u0000\u0475\u0425\u0001\u0000\u0000\u0000\u0475\u0428\u0001\u0000\u0000"+
		"\u0000\u0475\u042b\u0001\u0000\u0000\u0000\u0475\u042e\u0001\u0000\u0000"+
		"\u0000\u0475\u0431\u0001\u0000\u0000\u0000\u0475\u0434\u0001\u0000\u0000"+
		"\u0000\u0475\u0437\u0001\u0000\u0000\u0000\u0475\u043a\u0001\u0000\u0000"+
		"\u0000\u0475\u043d\u0001\u0000\u0000\u0000\u0475\u0443\u0001\u0000\u0000"+
		"\u0000\u0475\u0446\u0001\u0000\u0000\u0000\u0475\u044a\u0001\u0000\u0000"+
		"\u0000\u0475\u0452\u0001\u0000\u0000\u0000\u0475\u045e\u0001\u0000\u0000"+
		"\u0000\u0475\u046a\u0001\u0000\u0000\u0000\u0475\u046c\u0001\u0000\u0000"+
		"\u0000\u0475\u046e\u0001\u0000\u0000\u0000\u0475\u0470\u0001\u0000\u0000"+
		"\u0000\u0475\u0473\u0001\u0000\u0000\u0000\u0476\u0479\u0001\u0000\u0000"+
		"\u0000\u0477\u0475\u0001\u0000\u0000\u0000\u0477\u0478\u0001\u0000\u0000"+
		"\u0000\u0478\u0089\u0001\u0000\u0000\u0000\u0479\u0477\u0001\u0000\u0000"+
		"\u0000\u047a\u047c\u0003\u008cF\u0000\u047b\u047a\u0001\u0000\u0000\u0000"+
		"\u047c\u047d\u0001\u0000\u0000\u0000\u047d\u047b\u0001\u0000\u0000\u0000"+
		"\u047d\u047e\u0001\u0000\u0000\u0000\u047e\u008b\u0001\u0000\u0000\u0000"+
		"\u047f\u0480\u0005\u001e\u0000\u0000\u0480\u0484\u0003\u0092I\u0000\u0481"+
		"\u0483\u0003\u0098L\u0000\u0482\u0481\u0001\u0000\u0000\u0000\u0483\u0486"+
		"\u0001\u0000\u0000\u0000\u0484\u0482\u0001\u0000\u0000\u0000\u0484\u0485"+
		"\u0001\u0000\u0000\u0000\u0485\u0487\u0001\u0000\u0000\u0000\u0486\u0484"+
		"\u0001\u0000\u0000\u0000\u0487\u0488\u0005\u001f\u0000\u0000\u0488\u0489"+
		"\u0003\u008eG\u0000\u0489\u048a\u0005\u001e\u0000\u0000\u048a\u048b\u0005"+
		"\u0018\u0000\u0000\u048b\u048c\u0003\u0094J\u0000\u048c\u048d\u0005\u001f"+
		"\u0000\u0000\u048d\u04b0\u0001\u0000\u0000\u0000\u048e\u048f\u0005\u001e"+
		"\u0000\u0000\u048f\u0493\u0003\u0096K\u0000\u0490\u0492\u0003\u0098L\u0000"+
		"\u0491\u0490\u0001\u0000\u0000\u0000\u0492\u0495\u0001\u0000\u0000\u0000"+
		"\u0493\u0491\u0001\u0000\u0000\u0000\u0493\u0494\u0001\u0000\u0000\u0000"+
		"\u0494\u0496\u0001\u0000\u0000\u0000\u0495\u0493\u0001\u0000\u0000\u0000"+
		"\u0496\u0497\u0003\u008eG\u0000\u0497\u0498\u0005\u0018\u0000\u0000\u0498"+
		"\u0499\u0005\u001f\u0000\u0000\u0499\u04b0\u0001\u0000\u0000\u0000\u049a"+
		"\u049b\u0005\u001e\u0000\u0000\u049b\u049f\u0003\u0096K\u0000\u049c\u049e"+
		"\u0003\u0098L\u0000\u049d\u049c\u0001\u0000\u0000\u0000\u049e\u04a1\u0001"+
		"\u0000\u0000\u0000\u049f\u049d\u0001\u0000\u0000\u0000\u049f\u04a0\u0001"+
		"\u0000\u0000\u0000\u04a0\u04a2\u0001\u0000\u0000\u0000\u04a1\u049f\u0001"+
		"\u0000\u0000\u0000\u04a2\u04a3\u0005\u0018\u0000\u0000\u04a3\u04a4\u0005"+
		"\u001f\u0000\u0000\u04a4\u04b0\u0001\u0000\u0000\u0000\u04a5\u04a6\u0005"+
		"\u001e\u0000\u0000\u04a6\u04aa\u0003\u0096K\u0000\u04a7\u04a9\u0003\u0098"+
		"L\u0000\u04a8\u04a7\u0001\u0000\u0000\u0000\u04a9\u04ac\u0001\u0000\u0000"+
		"\u0000\u04aa\u04a8\u0001\u0000\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000"+
		"\u0000\u04ab\u04ad\u0001\u0000\u0000\u0000\u04ac\u04aa\u0001\u0000\u0000"+
		"\u0000\u04ad\u04ae\u0005\u001f\u0000\u0000\u04ae\u04b0\u0001\u0000\u0000"+
		"\u0000\u04af\u047f\u0001\u0000\u0000\u0000\u04af\u048e\u0001\u0000\u0000"+
		"\u0000\u04af\u049a\u0001\u0000\u0000\u0000\u04af\u04a5\u0001\u0000\u0000"+
		"\u0000\u04b0\u008d\u0001\u0000\u0000\u0000\u04b1\u04b4\u0003\u008cF\u0000"+
		"\u04b2\u04b4\u0003\u009eO\u0000\u04b3\u04b1\u0001\u0000\u0000\u0000\u04b3"+
		"\u04b2\u0001\u0000\u0000\u0000\u04b4\u04ba\u0001\u0000\u0000\u0000\u04b5"+
		"\u04b7\b\b\u0000\u0000\u04b6\u04b5\u0001\u0000\u0000\u0000\u04b7\u04b8"+
		"\u0001\u0000\u0000\u0000\u04b8\u04b6\u0001\u0000\u0000\u0000\u04b8\u04b9"+
		"\u0001\u0000\u0000\u0000\u04b9\u04bb\u0001\u0000\u0000\u0000\u04ba\u04b6"+
		"\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000\u04bb\u04bd"+
		"\u0001\u0000\u0000\u0000\u04bc\u04b3\u0001\u0000\u0000\u0000\u04bd\u04c0"+
		"\u0001\u0000\u0000\u0000\u04be\u04bc\u0001\u0000\u0000\u0000\u04be\u04bf"+
		"\u0001\u0000\u0000\u0000\u04bf\u008f\u0001\u0000\u0000\u0000\u04c0\u04be"+
		"\u0001\u0000\u0000\u0000\u04c1\u04c2\u0005\u0007\u0000\u0000\u04c2\u04c3"+
		"\u0003\u0086C\u0000\u04c3\u04c4\u0005\b\u0000\u0000\u04c4\u0091\u0001"+
		"\u0000\u0000\u0000\u04c5\u04c6\u0003\u0096K\u0000\u04c6\u0093\u0001\u0000"+
		"\u0000\u0000\u04c7\u04c8\u0003\u0096K\u0000\u04c8\u0095\u0001\u0000\u0000"+
		"\u0000\u04c9\u04cd\u0005\u0099\u0000\u0000\u04ca\u04cd\u0003\u001a\r\u0000"+
		"\u04cb\u04cd\u0005\u008e\u0000\u0000\u04cc\u04c9\u0001\u0000\u0000\u0000"+
		"\u04cc\u04ca\u0001\u0000\u0000\u0000\u04cc\u04cb\u0001\u0000\u0000\u0000"+
		"\u04cd\u0097\u0001\u0000\u0000\u0000\u04ce\u04d0\u0005\u0017\u0000\u0000"+
		"\u04cf\u04ce\u0001\u0000\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000"+
		"\u04d0\u04d3\u0001\u0000\u0000\u0000\u04d1\u04d4\u0003\u009aM\u0000\u04d2"+
		"\u04d4\u0005_\u0000\u0000\u04d3\u04d1\u0001\u0000\u0000\u0000\u04d3\u04d2"+
		"\u0001\u0000\u0000\u0000\u04d4\u04d7\u0001\u0000\u0000\u0000\u04d5\u04d6"+
		"\u0005\u000b\u0000\u0000\u04d6\u04d8\u0003\u009cN\u0000\u04d7\u04d5\u0001"+
		"\u0000\u0000\u0000\u04d7\u04d8\u0001\u0000\u0000\u0000\u04d8\u04dd\u0001"+
		"\u0000\u0000\u0000\u04d9\u04da\u0005\u008f\u0000\u0000\u04da\u04db\u0005"+
		"\u000b\u0000\u0000\u04db\u04dd\u0003~?\u0000\u04dc\u04cf\u0001\u0000\u0000"+
		"\u0000\u04dc\u04d9\u0001\u0000\u0000\u0000\u04dd\u0099\u0001\u0000\u0000"+
		"\u0000\u04de\u04ef\u0005\u0099\u0000\u0000\u04df\u04ef\u0005\u008f\u0000"+
		"\u0000\u04e0\u04e5\u0005\u008e\u0000\u0000\u04e1\u04e2\u0005\u0014\u0000"+
		"\u0000\u04e2\u04e4\u0005\u008e\u0000\u0000\u04e3\u04e1\u0001\u0000\u0000"+
		"\u0000\u04e4\u04e7\u0001\u0000\u0000\u0000\u04e5\u04e3\u0001\u0000\u0000"+
		"\u0000\u04e5\u04e6\u0001\u0000\u0000\u0000\u04e6\u04ef\u0001\u0000\u0000"+
		"\u0000\u04e7\u04e5\u0001\u0000\u0000\u0000\u04e8\u04e9\u0005\u0005\u0000"+
		"\u0000\u04e9\u04ea\u0005\u008e\u0000\u0000\u04ea\u04ef\u0005\u0006\u0000"+
		"\u0000\u04eb\u04ec\u0005\u0003\u0000\u0000\u04ec\u04ed\u0005\u008e\u0000"+
		"\u0000\u04ed\u04ef\u0005\u0004\u0000\u0000\u04ee\u04de\u0001\u0000\u0000"+
		"\u0000\u04ee\u04df\u0001\u0000\u0000\u0000\u04ee\u04e0\u0001\u0000\u0000"+
		"\u0000\u04ee\u04e8\u0001\u0000\u0000\u0000\u04ee\u04eb\u0001\u0000\u0000"+
		"\u0000\u04ef\u009b\u0001\u0000\u0000\u0000\u04f0\u04f5\u0005\u009a\u0000"+
		"\u0000\u04f1\u04f5\u0005\u0090\u0000\u0000\u04f2\u04f5\u0003\u009eO\u0000"+
		"\u04f3\u04f5\u0003\u0090H\u0000\u04f4\u04f0\u0001\u0000\u0000\u0000\u04f4"+
		"\u04f1\u0001\u0000\u0000\u0000\u04f4\u04f2\u0001\u0000\u0000\u0000\u04f4"+
		"\u04f3\u0001\u0000\u0000\u0000\u04f5\u009d\u0001\u0000\u0000\u0000\u04f6"+
		"\u04f7\u00059\u0000\u0000\u04f7\u04f8\u0003\u00a0P\u0000\u04f8\u04f9\u0005"+
		":\u0000\u0000\u04f9\u009f\u0001\u0000\u0000\u0000\u04fa\u04fb\u0003~?"+
		"\u0000\u04fb\u04fc\u0005\u0010\u0000\u0000\u04fc\u04fd\u0003\u00b0X\u0000"+
		"\u04fd\u00a1\u0001\u0000\u0000\u0000\u04fe\u0501\u0003\u00ccf\u0000\u04ff"+
		"\u0500\u0005\u0003\u0000\u0000\u0500\u0502\u0005\u0004\u0000\u0000\u0501"+
		"\u04ff\u0001\u0000\u0000\u0000\u0501\u0502\u0001\u0000\u0000\u0000\u0502"+
		"\u0505\u0001\u0000\u0000\u0000\u0503\u0505\u0003\u0088D\u0000\u0504\u04fe"+
		"\u0001\u0000\u0000\u0000\u0504\u0503\u0001\u0000\u0000\u0000\u0505\u00a3"+
		"\u0001\u0000\u0000\u0000\u0506\u050b\u0003\u00b2Y\u0000\u0507\u050b\u0003"+
		"\u001a\r\u0000\u0508\u050b\u0003\u00a6S\u0000\u0509\u050b\u0003\u00a8"+
		"T\u0000\u050a\u0506\u0001\u0000\u0000\u0000\u050a\u0507\u0001\u0000\u0000"+
		"\u0000\u050a\u0508\u0001\u0000\u0000\u0000\u050a\u0509\u0001\u0000\u0000"+
		"\u0000\u050b\u00a5\u0001\u0000\u0000\u0000\u050c\u050d\u0005\u0003\u0000"+
		"\u0000\u050d\u050e\u0003x<\u0000\u050e\u050f\u0005\u0004\u0000\u0000\u050f"+
		"\u00a7\u0001\u0000\u0000\u0000\u0510\u051c\u0005\u0007\u0000\u0000\u0511"+
		"\u0516\u0003|>\u0000\u0512\u0513\u0005\n\u0000\u0000\u0513\u0515\u0003"+
		"|>\u0000\u0514\u0512\u0001\u0000\u0000\u0000\u0515\u0518\u0001\u0000\u0000"+
		"\u0000\u0516\u0514\u0001\u0000\u0000\u0000\u0516\u0517\u0001\u0000\u0000"+
		"\u0000\u0517\u051a\u0001\u0000\u0000\u0000\u0518\u0516\u0001\u0000\u0000"+
		"\u0000\u0519\u051b\u0005\n\u0000\u0000\u051a\u0519\u0001\u0000\u0000\u0000"+
		"\u051a\u051b\u0001\u0000\u0000\u0000\u051b\u051d\u0001\u0000\u0000\u0000"+
		"\u051c\u0511\u0001\u0000\u0000\u0000\u051c\u051d\u0001\u0000\u0000\u0000"+
		"\u051d\u051e\u0001\u0000\u0000\u0000\u051e\u051f\u0005\b\u0000\u0000\u051f"+
		"\u00a9\u0001\u0000\u0000\u0000\u0520\u0521\u0007\t\u0000\u0000\u0521\u00ab"+
		"\u0001\u0000\u0000\u0000\u0522\u0527\u0005;\u0000\u0000\u0523\u0527\u0005"+
		"<\u0000\u0000\u0524\u0527\u0005\u0090\u0000\u0000\u0525\u0527\u0003\u00ae"+
		"W\u0000\u0526\u0522\u0001\u0000\u0000\u0000\u0526\u0523\u0001\u0000\u0000"+
		"\u0000\u0526\u0524\u0001\u0000\u0000\u0000\u0526\u0525\u0001\u0000\u0000"+
		"\u0000\u0527\u00ad\u0001\u0000\u0000\u0000\u0528\u0529\u0005=\u0000\u0000"+
		"\u0529\u00af\u0001\u0000\u0000\u0000\u052a\u052d\u0003\u00b2Y\u0000\u052b"+
		"\u052d\u0003\u0018\f\u0000\u052c\u052a\u0001\u0000\u0000\u0000\u052c\u052b"+
		"\u0001\u0000\u0000\u0000\u052d\u00b1\u0001\u0000\u0000\u0000\u052e\u052f"+
		"\u0007\n\u0000\u0000\u052f\u00b3\u0001\u0000\u0000\u0000\u0530\u0534\u0003"+
		"\u00b2Y\u0000\u0531\u0534\u0005y\u0000\u0000\u0532\u0534\u0005|\u0000"+
		"\u0000\u0533\u0530\u0001\u0000\u0000\u0000\u0533\u0531\u0001\u0000\u0000"+
		"\u0000\u0533\u0532\u0001\u0000\u0000\u0000\u0534\u00b5\u0001\u0000\u0000"+
		"\u0000\u0535\u0538\u0003\u00a6S\u0000\u0536\u0538\u0003\u00a8T\u0000\u0537"+
		"\u0535\u0001\u0000\u0000\u0000\u0537\u0536\u0001\u0000\u0000\u0000\u0538"+
		"\u00b7\u0001\u0000\u0000\u0000\u0539\u053b\u0005\u001e\u0000\u0000\u053a"+
		"\u053c\u0003\u00ba]\u0000\u053b\u053a\u0001\u0000\u0000\u0000\u053b\u053c"+
		"\u0001\u0000\u0000\u0000\u053c\u053d\u0001\u0000\u0000\u0000\u053d\u053e"+
		"\u0005\u001f\u0000\u0000\u053e\u00b9\u0001\u0000\u0000\u0000\u053f\u0544"+
		"\u0003\u00bc^\u0000\u0540\u0541\u0005\n\u0000\u0000\u0541\u0543\u0003"+
		"\u00bc^\u0000\u0542\u0540\u0001\u0000\u0000\u0000\u0543\u0546\u0001\u0000"+
		"\u0000\u0000\u0544\u0542\u0001\u0000\u0000\u0000\u0544\u0545\u0001\u0000"+
		"\u0000\u0000\u0545\u00bb\u0001\u0000\u0000\u0000\u0546\u0544\u0001\u0000"+
		"\u0000\u0000\u0547\u0549\u0003\u00b2Y\u0000\u0548\u054a\u0003\u00be_\u0000"+
		"\u0549\u0548\u0001\u0000\u0000\u0000\u0549\u054a\u0001\u0000\u0000\u0000"+
		"\u054a\u0551\u0001\u0000\u0000\u0000\u054b\u054c\u0003\u00b2Y\u0000\u054c"+
		"\u054d\u0005\u000b\u0000\u0000\u054d\u054e\u0003\u00c4b\u0000\u054e\u0551"+
		"\u0001\u0000\u0000\u0000\u054f\u0551\u0003\u00b8\\\u0000\u0550\u0547\u0001"+
		"\u0000\u0000\u0000\u0550\u054b\u0001\u0000\u0000\u0000\u0550\u054f\u0001"+
		"\u0000\u0000\u0000\u0551\u00bd\u0001\u0000\u0000\u0000\u0552\u0553\u0005"+
		"a\u0000\u0000\u0553\u0554\u0003\u00c6c\u0000\u0554\u00bf\u0001\u0000\u0000"+
		"\u0000\u0555\u0557\u0005\u001e\u0000\u0000\u0556\u0558\u0003\u00c2a\u0000"+
		"\u0557\u0556\u0001\u0000\u0000\u0000\u0557\u0558\u0001\u0000\u0000\u0000"+
		"\u0558\u0559\u0001\u0000\u0000\u0000\u0559\u055a\u0005\u001f\u0000\u0000"+
		"\u055a\u00c1\u0001\u0000\u0000\u0000\u055b\u0560\u0003\u00c4b\u0000\u055c"+
		"\u055d\u0005\n\u0000\u0000\u055d\u055f\u0003\u00c4b\u0000\u055e\u055c"+
		"\u0001\u0000\u0000\u0000\u055f\u0562\u0001\u0000\u0000\u0000\u0560\u055e"+
		"\u0001\u0000\u0000\u0000\u0560\u0561\u0001\u0000\u0000\u0000\u0561\u00c3"+
		"\u0001\u0000\u0000\u0000\u0562\u0560\u0001\u0000\u0000\u0000\u0563\u0564"+
		"\u0003\u00c6c\u0000\u0564\u00c5\u0001\u0000\u0000\u0000\u0565\u0567\u0007"+
		"\u000b\u0000\u0000\u0566\u0565\u0001\u0000\u0000\u0000\u0566\u0567\u0001"+
		"\u0000\u0000\u0000\u0567\u0568\u0001\u0000\u0000\u0000\u0568\u056d\u0003"+
		"\u00c8d\u0000\u0569\u056d\u0003\u00d6k\u0000\u056a\u056d\u0003\u00d8l"+
		"\u0000\u056b\u056d\u0003\u00d0h\u0000\u056c\u0566\u0001\u0000\u0000\u0000"+
		"\u056c\u0569\u0001\u0000\u0000\u0000\u056c\u056a\u0001\u0000\u0000\u0000"+
		"\u056c\u056b\u0001\u0000\u0000\u0000\u056d\u00c7\u0001\u0000\u0000\u0000"+
		"\u056e\u056f\u0003\u00cae\u0000\u056f\u00c9\u0001\u0000\u0000\u0000\u0570"+
		"\u0571\u0006e\uffff\uffff\u0000\u0571\u0572\u0005\u0005\u0000\u0000\u0572"+
		"\u0573\u0003\u00c6c\u0000\u0573\u0574\u0005\u0006\u0000\u0000\u0574\u0583"+
		"\u0001\u0000\u0000\u0000\u0575\u0583\u0003\u00ccf\u0000\u0576\u0583\u0003"+
		"\u00ceg\u0000\u0577\u0578\u0005\u0003\u0000\u0000\u0578\u0579\u0003\u00d4"+
		"j\u0000\u0579\u057a\u0005\u0004\u0000\u0000\u057a\u0583\u0001\u0000\u0000"+
		"\u0000\u057b\u0583\u0005P\u0000\u0000\u057c\u057d\u0003\u00ceg\u0000\u057d"+
		"\u057e\u0005\u0080\u0000\u0000\u057e\u057f\u0003\u00cae\u0002\u057f\u0583"+
		"\u0001\u0000\u0000\u0000\u0580\u0581\u0005x\u0000\u0000\u0581\u0583\u0003"+
		"\u00cae\u0001\u0582\u0570\u0001\u0000\u0000\u0000\u0582\u0575\u0001\u0000"+
		"\u0000\u0000\u0582\u0576\u0001\u0000\u0000\u0000\u0582\u0577\u0001\u0000"+
		"\u0000\u0000\u0582\u057b\u0001\u0000\u0000\u0000\u0582\u057c\u0001\u0000"+
		"\u0000\u0000\u0582\u0580\u0001\u0000\u0000\u0000\u0583\u058c\u0001\u0000"+
		"\u0000\u0000\u0584\u0585\n\u0005\u0000\u0000\u0585\u0587\u0005\u0003\u0000"+
		"\u0000\u0586\u0588\u0003\u00cae\u0000\u0587\u0586\u0001\u0000\u0000\u0000"+
		"\u0587\u0588\u0001\u0000\u0000\u0000\u0588\u0589\u0001\u0000\u0000\u0000"+
		"\u0589\u058b\u0005\u0004\u0000\u0000\u058a\u0584\u0001\u0000\u0000\u0000"+
		"\u058b\u058e\u0001\u0000\u0000\u0000\u058c\u058a\u0001\u0000\u0000\u0000"+
		"\u058c\u058d\u0001\u0000\u0000\u0000\u058d\u00cb\u0001\u0000\u0000\u0000"+
		"\u058e\u058c\u0001\u0000\u0000\u0000\u058f\u05a0\u0005n\u0000\u0000\u0590"+
		"\u05a0\u0005;\u0000\u0000\u0591\u05a0\u0005o\u0000\u0000\u0592\u05a0\u0005"+
		"=\u0000\u0000\u0593\u05a0\u0005q\u0000\u0000\u0594\u05a0\u0005<\u0000"+
		"\u0000\u0595\u05a0\u0005r\u0000\u0000\u0596\u05a0\u0005\u0090\u0000\u0000"+
		"\u0597\u0599\u0005s\u0000\u0000\u0598\u0597\u0001\u0000\u0000\u0000\u0598"+
		"\u0599\u0001\u0000\u0000\u0000\u0599\u059a\u0001\u0000\u0000\u0000\u059a"+
		"\u05a0\u0005t\u0000\u0000\u059b\u05a0\u0005p\u0000\u0000\u059c\u05a0\u0005"+
		"u\u0000\u0000\u059d\u05a0\u0005v\u0000\u0000\u059e\u05a0\u0005I\u0000"+
		"\u0000\u059f\u058f\u0001\u0000\u0000\u0000\u059f\u0590\u0001\u0000\u0000"+
		"\u0000\u059f\u0591\u0001\u0000\u0000\u0000\u059f\u0592\u0001\u0000\u0000"+
		"\u0000\u059f\u0593\u0001\u0000\u0000\u0000\u059f\u0594\u0001\u0000\u0000"+
		"\u0000\u059f\u0595\u0001\u0000\u0000\u0000\u059f\u0596\u0001\u0000\u0000"+
		"\u0000\u059f\u0598\u0001\u0000\u0000\u0000\u059f\u059b\u0001\u0000\u0000"+
		"\u0000\u059f\u059c\u0001\u0000\u0000\u0000\u059f\u059d\u0001\u0000\u0000"+
		"\u0000\u059f\u059e\u0001\u0000\u0000\u0000\u05a0\u00cd\u0001\u0000\u0000"+
		"\u0000\u05a1\u05a3\u0003\u00d2i\u0000\u05a2\u05a4\u0003\u00d0h\u0000\u05a3"+
		"\u05a2\u0001\u0000\u0000\u0000\u05a3\u05a4\u0001\u0000\u0000\u0000\u05a4"+
		"\u00cf\u0001\u0000\u0000\u0000\u05a5\u05a6\u0005\u001e\u0000\u0000\u05a6"+
		"\u05a8\u0003\u00c2a\u0000\u05a7\u05a9\u0003\u00d0h\u0000\u05a8\u05a7\u0001"+
		"\u0000\u0000\u0000\u05a8\u05a9\u0001\u0000\u0000\u0000\u05a9\u05aa\u0001"+
		"\u0000\u0000\u0000\u05aa\u05ab\u0005\u001f\u0000\u0000\u05ab\u00d1\u0001"+
		"\u0000\u0000\u0000\u05ac\u05af\u0003\u00b2Y\u0000\u05ad\u05af\u0003\u00f0"+
		"x\u0000\u05ae\u05ac\u0001\u0000\u0000\u0000\u05ae\u05ad\u0001\u0000\u0000"+
		"\u0000\u05af\u00d3\u0001\u0000\u0000\u0000\u05b0\u05b5\u0003\u00c6c\u0000"+
		"\u05b1\u05b2\u0005\n\u0000\u0000\u05b2\u05b4\u0003\u00c6c\u0000\u05b3"+
		"\u05b1\u0001\u0000\u0000\u0000\u05b4\u05b7\u0001\u0000\u0000\u0000\u05b5"+
		"\u05b3\u0001\u0000\u0000\u0000\u05b5\u05b6\u0001\u0000\u0000\u0000\u05b6"+
		"\u05b9\u0001\u0000\u0000\u0000\u05b7\u05b5\u0001\u0000\u0000\u0000\u05b8"+
		"\u05ba\u0005\n\u0000\u0000\u05b9\u05b8\u0001\u0000\u0000\u0000\u05b9\u05ba"+
		"\u0001\u0000\u0000\u0000\u05ba\u00d5\u0001\u0000\u0000\u0000\u05bb\u05bd"+
		"\u0003\u00b8\\\u0000\u05bc\u05bb\u0001\u0000\u0000\u0000\u05bc\u05bd\u0001"+
		"\u0000\u0000\u0000\u05bd\u05be\u0001\u0000\u0000\u0000\u05be\u05c0\u0005"+
		"\u0005\u0000\u0000\u05bf\u05c1\u0003\u00deo\u0000\u05c0\u05bf\u0001\u0000"+
		"\u0000\u0000\u05c0\u05c1\u0001\u0000\u0000\u0000\u05c1\u05c2\u0001\u0000"+
		"\u0000\u0000\u05c2\u05c3\u0005\u0006\u0000\u0000\u05c3\u05c4\u00058\u0000"+
		"\u0000\u05c4\u05c5\u0003\u00c6c\u0000\u05c5\u00d7\u0001\u0000\u0000\u0000"+
		"\u05c6\u05c8\u0005D\u0000\u0000\u05c7\u05c9\u0003\u00b8\\\u0000\u05c8"+
		"\u05c7\u0001\u0000\u0000\u0000\u05c8\u05c9\u0001\u0000\u0000\u0000\u05c9"+
		"\u05ca\u0001\u0000\u0000\u0000\u05ca\u05cc\u0005\u0005\u0000\u0000\u05cb"+
		"\u05cd\u0003\u00deo\u0000\u05cc\u05cb\u0001\u0000\u0000\u0000\u05cc\u05cd"+
		"\u0001\u0000\u0000\u0000\u05cd\u05ce\u0001\u0000\u0000\u0000\u05ce\u05cf"+
		"\u0005\u0006\u0000\u0000\u05cf\u05d0\u00058\u0000\u0000\u05d0\u05d1\u0003"+
		"\u00c6c\u0000\u05d1\u00d9\u0001\u0000\u0000\u0000\u05d2\u05d3\u0005\u000e"+
		"\u0000\u0000\u05d3\u05d4\u0003\u00c6c\u0000\u05d4\u00db\u0001\u0000\u0000"+
		"\u0000\u05d5\u05d7\u0003\u00b8\\\u0000\u05d6\u05d5\u0001\u0000\u0000\u0000"+
		"\u05d6\u05d7\u0001\u0000\u0000\u0000\u05d7\u05d8\u0001\u0000\u0000\u0000"+
		"\u05d8\u05da\u0005\u0005\u0000\u0000\u05d9\u05db\u0003\u00deo\u0000\u05da"+
		"\u05d9\u0001\u0000\u0000\u0000\u05da\u05db\u0001\u0000\u0000\u0000\u05db"+
		"\u05dc\u0001\u0000\u0000\u0000\u05dc\u05de\u0005\u0006\u0000\u0000\u05dd"+
		"\u05df\u0003\u00dam\u0000\u05de\u05dd\u0001\u0000\u0000\u0000\u05de\u05df"+
		"\u0001\u0000\u0000\u0000\u05df\u00dd\u0001\u0000\u0000\u0000\u05e0\u05f1"+
		"\u0003\u00e2q\u0000\u05e1\u05e6\u0003\u00e0p\u0000\u05e2\u05e3\u0005\n"+
		"\u0000\u0000\u05e3\u05e5\u0003\u00e0p\u0000\u05e4\u05e2\u0001\u0000\u0000"+
		"\u0000\u05e5\u05e8\u0001\u0000\u0000\u0000\u05e6\u05e4\u0001\u0000\u0000"+
		"\u0000\u05e6\u05e7\u0001\u0000\u0000\u0000\u05e7\u05eb\u0001\u0000\u0000"+
		"\u0000\u05e8\u05e6\u0001\u0000\u0000\u0000\u05e9\u05ea\u0005\n\u0000\u0000"+
		"\u05ea\u05ec\u0003\u00e2q\u0000\u05eb\u05e9\u0001\u0000\u0000\u0000\u05eb"+
		"\u05ec\u0001\u0000\u0000\u0000\u05ec\u05ee\u0001\u0000\u0000\u0000\u05ed"+
		"\u05ef\u0005\n\u0000\u0000\u05ee\u05ed\u0001\u0000\u0000\u0000\u05ee\u05ef"+
		"\u0001\u0000\u0000\u0000\u05ef\u05f1\u0001\u0000\u0000\u0000\u05f0\u05e0"+
		"\u0001\u0000\u0000\u0000\u05f0\u05e1\u0001\u0000\u0000\u0000\u05f1\u00df"+
		"\u0001\u0000\u0000\u0000\u05f2\u05f3\u0003\u00e4r\u0000\u05f3\u00e1\u0001"+
		"\u0000\u0000\u0000\u05f4\u05f5\u0005\u000f\u0000\u0000\u05f5\u05f7\u0003"+
		"\u0088D\u0000\u05f6\u05f8\u0003\u00dam\u0000\u05f7\u05f6\u0001\u0000\u0000"+
		"\u0000\u05f7\u05f8\u0001\u0000\u0000\u0000\u05f8\u00e3\u0001\u0000\u0000"+
		"\u0000\u05f9\u05fb\u0003\u00f2y\u0000\u05fa\u05f9\u0001\u0000\u0000\u0000"+
		"\u05fa\u05fb\u0001\u0000\u0000\u0000\u05fb\u05fd\u0001\u0000\u0000\u0000"+
		"\u05fc\u05fe\u0003\u00e6s\u0000\u05fd\u05fc\u0001\u0000\u0000\u0000\u05fd"+
		"\u05fe\u0001\u0000\u0000\u0000\u05fe\u05ff\u0001\u0000\u0000\u0000\u05ff"+
		"\u0601\u0003\u00e8t\u0000\u0600\u0602\u0003\u00dam\u0000\u0601\u0600\u0001"+
		"\u0000\u0000\u0000\u0601\u0602\u0001\u0000\u0000\u0000\u0602\u00e5\u0001"+
		"\u0000\u0000\u0000\u0603\u0604\u0007\f\u0000\u0000\u0604\u00e7\u0001\u0000"+
		"\u0000\u0000\u0605\u0608\u0003\u00b0X\u0000\u0606\u0608\u0003\u00b6[\u0000"+
		"\u0607\u0605\u0001\u0000\u0000\u0000\u0607\u0606\u0001\u0000\u0000\u0000"+
		"\u0608\u00e9\u0001\u0000\u0000\u0000\u0609\u060a\u0005\u0003\u0000\u0000"+
		"\u060a\u060b\u0003\u00b2Y\u0000\u060b\u060c\u0005\u000e\u0000\u0000\u060c"+
		"\u060d\u0007\r\u0000\u0000\u060d\u060e\u0005\u0004\u0000\u0000\u060e\u060f"+
		"\u0003\u00dam\u0000\u060f\u00eb\u0001\u0000\u0000\u0000\u0610\u0612\u0003"+
		"\u00e6s\u0000\u0611\u0610\u0001\u0000\u0000\u0000\u0611\u0612\u0001\u0000"+
		"\u0000\u0000\u0612\u0613\u0001\u0000\u0000\u0000\u0613\u0614\u0005z\u0000"+
		"\u0000\u0614\u0616\u0005\u0005\u0000\u0000\u0615\u0617\u0003p8\u0000\u0616"+
		"\u0615\u0001\u0000\u0000\u0000\u0616\u0617\u0001\u0000\u0000\u0000\u0617"+
		"\u0618\u0001\u0000\u0000\u0000\u0618\u061e\u0005\u0006\u0000\u0000\u0619"+
		"\u061a\u0005\u0007\u0000\u0000\u061a\u061b\u0003v;\u0000\u061b\u061c\u0005"+
		"\b\u0000\u0000\u061c\u061f\u0001\u0000\u0000\u0000\u061d\u061f\u0005\t"+
		"\u0000\u0000\u061e\u0619\u0001\u0000\u0000\u0000\u061e\u061d\u0001\u0000"+
		"\u0000\u0000\u061e\u061f\u0001\u0000\u0000\u0000\u061f\u00ed\u0001\u0000"+
		"\u0000\u0000\u0620\u0625\u0003\u00ceg\u0000\u0621\u0622\u0005\n\u0000"+
		"\u0000\u0622\u0624\u0003\u00ceg\u0000\u0623\u0621\u0001\u0000\u0000\u0000"+
		"\u0624\u0627\u0001\u0000\u0000\u0000\u0625\u0623\u0001\u0000\u0000\u0000"+
		"\u0625\u0626\u0001\u0000\u0000\u0000\u0626\u00ef\u0001\u0000\u0000\u0000"+
		"\u0627\u0625\u0001\u0000\u0000\u0000\u0628\u0631\u0003\u00b2Y\u0000\u0629"+
		"\u062b\u0005\u0010\u0000\u0000\u062a\u0629\u0001\u0000\u0000\u0000\u062b"+
		"\u062c\u0001\u0000\u0000\u0000\u062c\u062a\u0001\u0000\u0000\u0000\u062c"+
		"\u062d\u0001\u0000\u0000\u0000\u062d\u062e\u0001\u0000\u0000\u0000\u062e"+
		"\u0630\u0003\u00b2Y\u0000\u062f\u062a\u0001\u0000\u0000\u0000\u0630\u0633"+
		"\u0001\u0000\u0000\u0000\u0631\u062f\u0001\u0000\u0000\u0000\u0631\u0632"+
		"\u0001\u0000\u0000\u0000\u0632\u00f1\u0001\u0000\u0000\u0000\u0633\u0631"+
		"\u0001\u0000\u0000\u0000\u0634\u0636\u0003\u00f4z\u0000\u0635\u0634\u0001"+
		"\u0000\u0000\u0000\u0636\u0637\u0001\u0000\u0000\u0000\u0637\u0635\u0001"+
		"\u0000\u0000\u0000\u0637\u0638\u0001\u0000\u0000\u0000\u0638\u00f3\u0001"+
		"\u0000\u0000\u0000\u0639\u063c\u0005\u008d\u0000\u0000\u063a\u063d\u0003"+
		"\u00f6{\u0000\u063b\u063d\u0003\u00f8|\u0000\u063c\u063a\u0001\u0000\u0000"+
		"\u0000\u063c\u063b\u0001\u0000\u0000\u0000\u063d\u00f5\u0001\u0000\u0000"+
		"\u0000\u063e\u063f\u0006{\uffff\uffff\u0000\u063f\u0645\u0003\u00b2Y\u0000"+
		"\u0640\u0641\u0005\u0005\u0000\u0000\u0641\u0642\u0003\u0088D\u0000\u0642"+
		"\u0643\u0005\u0006\u0000\u0000\u0643\u0645\u0001\u0000\u0000\u0000\u0644"+
		"\u063e\u0001\u0000\u0000\u0000\u0644\u0640\u0001\u0000\u0000\u0000\u0645"+
		"\u064b\u0001\u0000\u0000\u0000\u0646\u0647\n\u0002\u0000\u0000\u0647\u0648"+
		"\u0005\u0010\u0000\u0000\u0648\u064a\u0003\u00b0X\u0000\u0649\u0646\u0001"+
		"\u0000\u0000\u0000\u064a\u064d\u0001\u0000\u0000\u0000\u064b\u0649\u0001"+
		"\u0000\u0000\u0000\u064b\u064c\u0001\u0000\u0000\u0000\u064c\u00f7\u0001"+
		"\u0000\u0000\u0000\u064d\u064b\u0001\u0000\u0000\u0000\u064e\u064f\u0003"+
		"\u00f6{\u0000\u064f\u0650\u0003\u0080@\u0000\u0650\u00f9\u0001\u0000\u0000"+
		"\u0000\u0651\u0652\u0007\u000e\u0000\u0000\u0652\u00fb\u0001\u0000\u0000"+
		"\u0000\u00d7\u00fd\u0104\u0109\u011b\u011f\u0125\u0128\u012b\u012e\u0131"+
		"\u0135\u0139\u013d\u013f\u0146\u014a\u0153\u0156\u015a\u015c\u015f\u0164"+
		"\u016a\u016d\u0173\u0179\u017d\u0186\u018b\u0192\u0199\u019e\u01a2\u01a9"+
		"\u01b1\u01b6\u01b8\u01bf\u01c3\u01cc\u01d0\u01d8\u01e0\u01e4\u01ec\u01f1"+
		"\u01f3\u01fa\u01ff\u0202\u0206\u020c\u0212\u0215\u0218\u021c\u021f\u0225"+
		"\u022e\u0241\u0245\u0249\u0253\u0257\u026f\u0277\u027e\u0287\u028c\u0292"+
		"\u0298\u029e\u02a7\u02b1\u02b5\u02b7\u02be\u02c4\u02c9\u02d3\u02d6\u02dc"+
		"\u02e0\u02ef\u02f4\u02f9\u02fc\u0308\u030b\u030e\u0311\u0314\u0317\u0322"+
		"\u0326\u032f\u033b\u0340\u0343\u034a\u034c\u034f\u0352\u0356\u0359\u035d"+
		"\u0362\u0365\u036a\u036e\u0373\u0378\u037e\u0382\u0386\u0389\u0397\u039b"+
		"\u03a4\u03a9\u03ab\u03b4\u03b8\u03bc\u03c3\u03c9\u03cc\u03d4\u03db\u03f4"+
		"\u03f8\u0405\u0407\u041f\u044c\u0454\u0458\u045c\u0460\u0464\u0468\u0475"+
		"\u0477\u047d\u0484\u0493\u049f\u04aa\u04af\u04b3\u04b8\u04ba\u04be\u04cc"+
		"\u04cf\u04d3\u04d7\u04dc\u04e5\u04ee\u04f4\u0501\u0504\u050a\u0516\u051a"+
		"\u051c\u0526\u052c\u0533\u0537\u053b\u0544\u0549\u0550\u0557\u0560\u0566"+
		"\u056c\u0582\u0587\u058c\u0598\u059f\u05a3\u05a8\u05ae\u05b5\u05b9\u05bc"+
		"\u05c0\u05c8\u05cc\u05d6\u05da\u05de\u05e6\u05eb\u05ee\u05f0\u05f7\u05fa"+
		"\u05fd\u0601\u0607\u0611\u0616\u061e\u0625\u062c\u0631\u0637\u063c\u0644"+
		"\u064b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}