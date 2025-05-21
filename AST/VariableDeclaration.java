package AST;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclaration {
    IdentifierOrKeyWord identifierOrKeyWord;
    ArrayLiteral arrayLiteral;
    ObjectLiteral objectLiteral;
    TypeAnnotation typeAnnotation;
    List<SingleExpression> singleExpression = new ArrayList<SingleExpression>();
    TypeParameters typeParameters;
    ModuleExportName moduleExportName;

    String as;


    public IdentifierOrKeyWord getIdentifierOrKeyWord() {
        return identifierOrKeyWord;
    }

    public void setIdentifierOrKeyWord(IdentifierOrKeyWord identifierOrKeyWord) {
        this.identifierOrKeyWord = identifierOrKeyWord;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public List<SingleExpression> getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(List<SingleExpression> singleExpression) {
        this.singleExpression = singleExpression;
    }

    public TypeParameters getTypeParameters() {
        return typeParameters;
    }

    public void setTypeParameters(TypeParameters typeParameters) {
        this.typeParameters = typeParameters;
    }

    public ModuleExportName getModuleExportName() {
        return moduleExportName;
    }

    public void setModuleExportName(ModuleExportName moduleExportName) {
        this.moduleExportName = moduleExportName;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    @Override
    public String toString() {
        return "VariableDeclaration{" +'\n'+
                identifierOrKeyWord +'\n'+
                arrayLiteral +'\n'+
                objectLiteral +'\n'+
                typeAnnotation +'\n'+
                singleExpression +'\n'+
                typeParameters +'\n'+
                moduleExportName +'\n'+
                ", as='" + as + '\n'+
                '}';
    }

    //    @Override
//    public String toString() {
//
////        if (singleExpression != null && typeAnnotation!=null) {
////            return '\n' +'{'+
////                    ", moduleExportName=" + moduleExportName + '\n' +
////                    ", as=" + as + '\n' +
////                    '}';
////        }
////        return '\n' +'{'+
////                ", moduleExportName=" + moduleExportName + '\n' +
////                '}';
//    }
}
