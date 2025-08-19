
parser grammar ParserFile;

options {
    tokenVocab = LexerFile;
}

program
    : sourceElements? EOF
    ;

sourceElements
    : sourceElement+
    ;

sourceElement
    : statement+
    ;



statement
    : block
    | variableStatement
    | importStatement
    | exportStatement
    | emptyStatement_ // ;
    | classDeclaration
    | functionDeclaration
    | expressionStatement
    | ifStatement
    | iterationStatement
    | continueStatement
    | breakStatement
    | returnStatement
    | switchStatement
    | throwStatement
    | tryStatement
    ;

block
    : '{' statementList? '}'
    ;

variableStatement
    : bindingPattern typeAnnotation?  SemiColon?
    | accessibilityModifier? varModifier? ReadOnly? variableDeclarationList SemiColon?
    | Declare varModifier? variableDeclarationList SemiColon?
    ;

importStatement
    : Import importFromBlock
    ;

exportStatement
    : Export Default? (exportFromBlock | declaration) eos
    | Export Default singleExpression eos
    ;
classDeclaration
    : decoratorList? (Export Default?)? Abstract? Class identifier typeParameters? classHeritage classTail
    ;

classHeritage
    : classExtendsClause? implementsClause?
    ;



classTail
    : '{' classElement* '}'
    ;

functionDeclaration
    : Async? Function_ '*'? identifier callSignature (('{' functionBody '}') | SemiColon)
    ;

reservedWord
    : keyword
    | NullLiteral
    | BooleanLiteral
    ;
keyword
    : Break
    | Do
    | Instanceof
    | Typeof
    | Case
    | Else
    | New
    | Var
    | Catch
    | Finally
    | Return
    | Void
    | Continue
    | For
    | Switch
    | While
    | Debugger
    | Function_
    | This
    | With
    | Default
    | If
    | Throw
    | Delete
    | In
    | Try
    | Class
    | Enum
    | Extends
    | Super
    | Const
    | Export
    | Import
    | Implements
    | Let
    | Private
    | Public
    | Interface
    | Package
    | Protected
    | Static
    | Yield
    | Async
    | Await
    | ReadOnly
    | From
    | As
    | Require
    | TypeAlias
    | String
    | Boolean
    | Number
    | Module
    ;

statementList
    :  statement+
    ;



abstractDeclaration
    : Abstract (identifier callSignature | variableStatement) eos
    ;


importFromBlock
    : importDefault? (importNamespace | importModuleItems) importFrom eos
    | StringLiteral eos
    ;

importModuleItems
    : '{' (importAliasName ',')* (importAliasName ','?)? '}'
    ;

importAliasName
    : moduleExportName (As importedBinding)?
    ;

moduleExportName
    : identifierName
    | StringLiteral
    ;

importedBinding
    : Identifier
    | Yield
    | Await
    ;

importDefault
    : aliasName ','
    ;

importNamespace
    : ('*' | identifierName) (As identifierName)?
    ;

importFrom
    : From StringLiteral
    ;

aliasName
    : identifierName (As identifierName)?
    ;



exportFromBlock
    : importNamespace importFrom eos
    | exportModuleItems importFrom? eos
    ;

exportModuleItems
    : '{' (exportAliasName ',')* (exportAliasName ','?)? '}'
    ;

exportAliasName
    : moduleExportName (As moduleExportName)?
    ;

declaration
    : variableStatement
    | classDeclaration
    | functionDeclaration
    ;


variableDeclarationList
    : '('? variableDeclaration ')'? (',' variableDeclaration)*
    ;

variableDeclaration
    : (identifierOrKeyWord | arrayLiteral | objectLiteral) typeAnnotation? singleExpression? (
        '=' typeParameters? singleExpression
    )?
    ;

emptyStatement_
    : SemiColon
    ;

expressionStatement
    : expressionSequence SemiColon?
    ;

ifStatement
    : If '(' expressionSequence ')' statement (Else statement)?
    ;

iterationStatement
    : Do statement While '(' expressionSequence ')' eos                                                                     # DoStatement
    | While '(' expressionSequence ')' statement                                                                            # WhileStatement
    | For '(' expressionSequence? SemiColon expressionSequence? SemiColon expressionSequence? ')' statement                 # ForStatement
    | For '(' varModifier variableDeclarationList SemiColon expressionSequence? SemiColon expressionSequence? ')' statement # ForVarStatement
    | For '(' singleExpression In expressionSequence ')' statement                                                          # ForInStatement
    | For '(' varModifier variableDeclaration In expressionSequence ')' statement                                           # ForVarInStatement
    | For Await? '(' singleExpression identifier  expressionSequence (As type_)? ')' statement                            # ForOfStatement
    | For Await? '(' varModifier variableDeclaration identifier  expressionSequence (As type_)? ')' statement             # ForVarOfStatement
    ;

varModifier
    : Var
    | Let
    | Const
    ;

continueStatement
    : Continue (identifier)? eos
    ;

breakStatement
    : Break (identifier)? eos
    ;

returnStatement
    : Return ( expressionSequence)? eos
    | Return '(' htmlElements ')' eos
    ;

switchStatement
    : Switch '(' expressionSequence ')' caseBlock
    ;

caseBlock
    : '{' caseClauses? (defaultClause caseClauses?)? '}'
    ;

caseClauses
    : caseClause+
    ;

caseClause
    : Case expressionSequence ':' statementList?
    ;

defaultClause
    : Default ':' statementList?
    ;


throwStatement
    : Throw  expressionSequence eos
    ;

tryStatement
    : Try block (catchProduction finallyProduction? | finallyProduction)
    ;

catchProduction
    : Catch ('(' identifier typeAnnotation? ')')? block
    ;

finallyProduction
    : Finally block
    ;





classExtendsClause
    : Extends typeReference
    ;

implementsClause
    : Implements classOrInterfaceTypeList
    ;

classElement
    : constructorDeclaration
    | decoratorList? propertyMemberDeclaration
    | indexMemberDeclaration
    | statement
    ;

propertyMemberDeclaration
    : propertyMemberBase propertyName '?'? typeAnnotation?  SemiColon
    | propertyMemberBase propertyName callSignature (('{' functionBody '}') | SemiColon)
    | abstractDeclaration
    ;

propertyMemberBase
    : accessibilityModifier? Async? Static? ReadOnly?
    ;

indexMemberDeclaration
    : indexSignature SemiColon
    ;


iteratorBlock
    : '{' iteratorDefinition (',' iteratorDefinition)* ','? '}'
    ;

iteratorDefinition
    : '[' singleExpression ']' '(' formalParameterList? ')' '{' functionBody '}'
    ;





formalParameterList
    : formalParameterArg (',' formalParameterArg)* (',' lastFormalParameterArg)? ','?
    | lastFormalParameterArg
    | arrayLiteral
    | objectLiteral (':' formalParameterList)?
    ;
formalParameterArg
    : decorator? accessibilityModifier? assignable '?'? typeAnnotation? (
        '=' singleExpression
    )?
    ;

lastFormalParameterArg
    : Ellipsis identifier typeAnnotation?
    ;

functionBody
    : sourceElements?
    ;




elementList
    : ','* arrayElement? (','+ arrayElement) * ','*
    ;

arrayElement
    : Ellipsis? (singleExpression | identifier) ','?
    ;



propertyAssignment
    : propertyName (':' | '=') singleExpression
    | '[' singleExpression ']' ':' singleExpression
    | identifierOrKeyWord
    | Ellipsis? singleExpression
    | restParameter
    ;


propertyName
    : identifierName
    | StringLiteral
    | numericLiteral
    | '[' singleExpression ']'
    ;

arguments
    : '(' (argumentList ','?)? ')'
    ;

argumentList
    : argument (',' argument)*
    ;

argument
    : Ellipsis? (singleExpression | identifier)
    ;

// Intentionally removed helper productions to avoid left recursion.

expressionSequence
    : singleExpression (',' singleExpression)*
    ;



singleExpression
    : Class identifier? typeParameters? classHeritage classTail
    //Optional Chaining
    | singleExpression '?.'? '[' expressionSequence ']'
    | singleExpression '?.' singleExpression
    //Member Access
    | singleExpression '!'? '.' '#'? identifierName typeGeneric? //Accesses a property or method of an object.
    | singleExpression '?'? '.' '#'? identifierName typeGeneric? //Accesses a property or method of an object using optional chaining.
    //Constructor Calls
    | New singleExpression typeArguments? arguments //Creates a new instance of an object using the new operator.
    | New singleExpression typeArguments?// Creates a new instance of an object without arguments.
    //Function Calls
    | singleExpression arguments //Calls a function or method with arguments.
    //Unary Operators
    | singleExpression  '++'
    | singleExpression  '--'
    | Delete singleExpression
    | Void singleExpression
    | Typeof singleExpression
    | '++' singleExpression
    | '--' singleExpression
    | '+' singleExpression
    | '-' singleExpression
    | '~' singleExpression
    | '!' singleExpression
    | Await singleExpression
    //Binary Operators
    | <assoc = right> singleExpression '**' singleExpression
    | singleExpression ('*' | '/' | '%') singleExpression
    | singleExpression ('+' | '-') singleExpression
    | singleExpression '??' singleExpression
    | singleExpression ('<<' | '>' '>' | '>' '>' '>') singleExpression
    | singleExpression ('<' | '>' | '<=' | '>=') singleExpression
    | singleExpression Instanceof singleExpression
    | singleExpression In singleExpression
    | singleExpression ('==' | '!=' | '===' | '!==') singleExpression
    | singleExpression '&' singleExpression
    | singleExpression '^' singleExpression
    | singleExpression '|' singleExpression
    | singleExpression '&&' singleExpression
    | singleExpression '||' singleExpression
    | singleExpression '?' singleExpression ':' singleExpression
    | singleExpression '=' singleExpression
    | singleExpression '=>' singleExpression
    | singleExpression assignmentOperator singleExpression
    | iteratorBlock
    | This
    | '@'? identifierName singleExpression?
    | Super
    | literal
    | arrayLiteral
    | objectLiteral
    | htmlElement
    | '(' expressionSequence ')'
    | typeArguments expressionSequence?
    | singleExpression As asExpression
    | singleExpression '!'
    ;

htmlElements
    : htmlElement+
    ;

htmlElement
    : '<' htmlTagStartName htmlAttribute* '>' htmlContent '<' '/' htmlTagClosingName '>'
    | '<' htmlTagName htmlAttribute* htmlContent '/' '>'
    | '<' htmlTagName htmlAttribute* '/' '>'
    | '<' htmlTagName htmlAttribute* '>'
    ;
//htmlContent
//    :  htmlContentPart* (~('<' | '{')+)*
//    ;
//
//htmlContentPart
//    : htmlElement
//    | interpolationExpression
//    ;

htmlContent
    : ((htmlElement | interpolationExpression)  (~('<' | '{')+)?)*
    ;

objectExpressionSequence
    : '{' expressionSequence '}'
    ;

htmlTagStartName
    : htmlTagName
    ;

htmlTagClosingName
    : htmlTagName
    ;

htmlTagName
    : TagName
    | keyword
    | Identifier
    ;

htmlAttribute
    : '*'? (htmlAttributeName | Class) ('=' htmlAttributeValue)?
    | AngularDirective '=' propertyName
    ;

htmlAttributeName
    : TagName
    | AngularDirective
    | Identifier ('-' Identifier)*
    |'(' Identifier ')'
    |'[' Identifier ']'
    ;

htmlAttributeValue
    : AttributeValue
    | StringLiteral
    | interpolationExpression
    | objectExpressionSequence
    ;

interpolationExpression
    :  DOUBLE_L_CURLY htmlSequence DOUBLE_R_CURLY
    ;

htmlSequence
    : propertyName '.' identifierName
    ;

asExpression
    : predefinedType ('[' ']')?
    | singleExpression
    ;

assignable
    : identifier
    | keyword
    | arrayLiteral
    | objectLiteral
    ;

arrayLiteral
    : ('[' elementList ']')
    ;

objectLiteral
    : '{' (propertyAssignment (',' propertyAssignment)* ','?)? '}'
    ;

assignmentOperator
    : '*='
    | '/='
    | '%='
    | '+='
    | '-='
    | '<<='
    | '>>='
    | '>>>='
    | '&='
    | '^='
    | '|='
    | '**='
    | '??='
    ;

literal
    : NullLiteral
    | BooleanLiteral
    | StringLiteral
    | numericLiteral
    ;


numericLiteral
    : DecimalLiteral
    ;


identifierName
    : identifier
    | reservedWord
    ;
identifier
    : Identifier
    | Async
    | As
    | From
    | Yield
    | Of
    | Any
    | Any
    | Number
    | Boolean
    | String
    | Unique
    | Symbol
    | Never
    | Undefined
    | Object
    | KeyOf
    | TypeAlias
    | Constructor
    | Namespace
    | Abstract
    // Angular-specific identifiers
    | StoreModule
    | EffectsModule
    | CreateAction
    | CreateReducer
    | CreateSelector
    | RouterModule
    | Select
    | Dispatch
    | Navigate
    | NavigateByUrl
    | ForRoot
    | ForFeature
    ;

identifierOrKeyWord
    : identifier
    | TypeAlias
    | Require
    ;




bindingPattern
    : (arrayLiteral | objectLiteral)
    ;


typeParameters
    : '<' typeParameterList? '>'
    ;

typeParameterList
    : typeParameter (',' typeParameter)*
    ;

typeParameter
    : identifier constraint?
    | identifier '=' typeArgument
    | typeParameters
    ;

constraint
    : 'extends' type_
    ;

typeArguments
    : '<' typeArgumentList? '>'
    ;

typeArgumentList
    : typeArgument (',' typeArgument)*
    ;

typeArgument
    : type_
    ;

type_
    : ('|' | '&')? unionOrIntersectionOrPrimaryType
    | functionType
    | constructorType
    | typeGeneric
    ;

unionOrIntersectionOrPrimaryType
    : primaryType
    ;

primaryType
    : '(' type_ ')'
    | predefinedType
    | typeReference
    | primaryType '[' primaryType? ']'
    | '[' tupleElementTypes ']'
    | This
    | typeReference Is primaryType
    | KeyOf primaryType
    ;

predefinedType
    : Any
    | NullLiteral
    | Number
    | DecimalLiteral
    | Boolean
    | BooleanLiteral
    | String
    | StringLiteral
    | Unique? Symbol
    | Never
    | Undefined
    | Object
    | Void
    ;

typeReference
    : typeName typeGeneric?
    ;

typeGeneric
    : '<' typeArgumentList typeGeneric?'>'
    ;

typeName
    : identifier
    | namespaceName
    ;

tupleElementTypes
    : type_ (',' type_)* ','?
    ;

functionType
    : typeParameters? '(' parameterList? ')' '=>' type_
    ;

constructorType
    : 'new' typeParameters? '(' parameterList? ')' '=>' type_
    ;




typeAnnotation
    : ':' type_
    ;

callSignature
    : typeParameters? '(' parameterList? ')' typeAnnotation?
    ;

parameterList
    : restParameter
    | parameter (',' parameter)* (',' restParameter)? ','?
    ;


parameter
    : requiredParameter
    ;
//    | optionalParameter

//optionalParameter
//    : decoratorList? (
//        accessibilityModifier? identifierOrPattern (
//            '?' typeAnnotation?
//            | typeAnnotation?
//        )
//    )
//    ;

restParameter
    : '...' singleExpression typeAnnotation?
    ;
requiredParameter
    : decoratorList? accessibilityModifier? identifierOrPattern typeAnnotation?
    ;

accessibilityModifier
    : Public
    | Private
    | Protected
    ;

identifierOrPattern
    : identifierName
    | bindingPattern
    ;



indexSignature
    : '[' identifier ':' (Number | String) ']' typeAnnotation
    ;


constructorDeclaration
    : accessibilityModifier? Constructor '(' formalParameterList? ')' (
        ('{' functionBody '}')
        | SemiColon
    )?
    ;
classOrInterfaceTypeList
    : typeReference (',' typeReference)*
    ;
namespaceName
    : identifier ('.'+ identifier)*
    ;

decoratorList
    : decorator+
    ;

decorator
    : '@' (decoratorMemberExpression | decoratorCallExpression)
    ;

decoratorMemberExpression
    : identifier
    | decoratorMemberExpression '.' identifierName
    | '(' singleExpression ')'
    ;

decoratorCallExpression
    : decoratorMemberExpression arguments
    ;

eos
    : SemiColon
    | EOF
    ;
