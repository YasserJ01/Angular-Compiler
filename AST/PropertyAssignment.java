package AST;

import java.util.ArrayList;
import java.util.List;

public class PropertyAssignment {
    PropertyName propertyName;
    List<SingleExpression> singleExpression = new ArrayList<SingleExpression>();
    GeneratorMethod generatorMethod;
    IdentifierOrKeyWord identifierOrKeyWord;
    String ellipsis;
    RestParameter restParameter;

    public PropertyName getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(PropertyName propertyName) {
        this.propertyName = propertyName;
    }

    public List<SingleExpression> getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(List<SingleExpression> singleExpression) {
        this.singleExpression = singleExpression;
    }

    public GeneratorMethod getGeneratorMethod() {
        return generatorMethod;
    }

    public void setGeneratorMethod(GeneratorMethod generatorMethod) {
        this.generatorMethod = generatorMethod;
    }

    public IdentifierOrKeyWord getIdentifierOrKeyWord() {
        return identifierOrKeyWord;
    }

    public void setIdentifierOrKeyWord(IdentifierOrKeyWord identifierOrKeyWord) {
        this.identifierOrKeyWord = identifierOrKeyWord;
    }

    public String getEllipsis() {
        return ellipsis;
    }

    public void setEllipsis(String ellipsis) {
        this.ellipsis = ellipsis;
    }

    public RestParameter getRestParameter() {
        return restParameter;
    }

    public void setRestParameter(RestParameter restParameter) {
        this.restParameter = restParameter;
    }

    @Override
    public String toString() {
        if (singleExpression != null) {
            if (propertyName != null) {
                return "PropertyAssignment{" +'\n'+
                        propertyName +'\n'+
                        singleExpression +'\n'+
                        '}';
            } else if (ellipsis != null) {
                return "PropertyAssignment{" +'\n'+
                        ", ellipsis='" + ellipsis + '\'' +
                        singleExpression +'\n'+
                        '}';
            }
            return "PropertyAssignment{" +'\n'+
                    singleExpression +'\n'+
                    '}';
        } else if (generatorMethod != null) {
            return "PropertyAssignment{" +'\n'+
                    generatorMethod +'\n'+
                    '}';
        } else if (identifierOrKeyWord != null) {
            return "PropertyAssignment{" +'\n'+
                    ", identifierOrKeyWord=" + identifierOrKeyWord +'\n'+
                    '}';
        }
        return "PropertyAssignment{" +
                restParameter +'\n'+
                '}';
    }
}
