package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlElements {
    List<HtmlElement> htmlElement = new ArrayList<HtmlElement>();

    public List<HtmlElement> getHtmlElements() {
        return htmlElement;
    }

    public void setHtmlElements(List<HtmlElement> htmlElement) {
        this.htmlElement = htmlElement;
    }

    @Override
    public String toString() {
        return "HtmlElements{" +
                "htmlElement=" + htmlElement + '\n' +
                '}';
    }
}
