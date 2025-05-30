package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlContent {
    List<HtmlElement> htmlElement = new ArrayList<HtmlElement>();

    public List<InterpolationExpression> getInterpolationExpressions() {
        return interpolationExpressions;
    }

    public void setInterpolationExpressions(List<InterpolationExpression> interpolationExpressions) {
        this.interpolationExpressions = interpolationExpressions;
    }

    List<InterpolationExpression> interpolationExpressions = new ArrayList<InterpolationExpression>();

    public List<HtmlElement> getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(List<HtmlElement> htmlElement) {
        this.htmlElement = htmlElement;
    }

//    public List<InterpolationExpression> getInterpolationExpression() {
//        return interpolationExpressions;
//    }
//
//    public void setInterpolationExpression(List<InterpolationExpression> objectExpressionSequences) {
//        this.objectExpressionSequences = objectExpressionSequences;
//    }

    @Override
    public String toString() {
//        if (htmlElement != null) {
//            return "HtmlContent{" +
//                    "htmlElement=" + htmlElement +
//                    '}';
//        }
        return "HtmlContent{" +'\n'+
                htmlElement +'\n'+
                interpolationExpressions +'\n'+
                '}';
    }
}

