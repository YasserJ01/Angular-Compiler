package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlContent {
    List<HtmlElement> htmlElement = new ArrayList<HtmlElement>();
    List<ObjectExpressionSequence> objectExpressionSequences = new ArrayList<ObjectExpressionSequence>();

    public List<HtmlElement> getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(List<HtmlElement> htmlElement) {
        this.htmlElement = htmlElement;
    }

    public List<ObjectExpressionSequence> getObjectExpressionSequences() {
        return objectExpressionSequences;
    }

    public void setObjectExpressionSequences(List<ObjectExpressionSequence> objectExpressionSequences) {
        this.objectExpressionSequences = objectExpressionSequences;
    }

    @Override
    public String toString() {
//        if (htmlElement != null) {
//            return "HtmlContent{" +
//                    "htmlElement=" + htmlElement +
//                    '}';
//        }
        return "HtmlContent{" +'\n'+
                htmlElement +'\n'+
                objectExpressionSequences +'\n'+
                '}';
    }
}

