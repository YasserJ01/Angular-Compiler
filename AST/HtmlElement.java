package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    HtmlTagStartName htmlTagStartName;
    List<HtmlAttribute> htmlAttribute = new ArrayList<HtmlAttribute>();
    HtmlContent htmlContent;
    HtmlTagName htmlTagName;
    HtmlTagClosingName htmlTagClosingName;


    public HtmlTagStartName getHtmlTagStartName() {
        return htmlTagStartName;
    }

    public void setHtmlTagStartName(HtmlTagStartName htmlTagStartName) {
        this.htmlTagStartName = htmlTagStartName;
    }

    public List<HtmlAttribute> getHtmlAttribute() {
        return htmlAttribute;
    }

    public void setHtmlAttribute(List<HtmlAttribute> htmlAttribute) {
        this.htmlAttribute = htmlAttribute;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public HtmlTagName getHtmlTagName() {
        return htmlTagName;
    }

    public void setHtmlTagName(HtmlTagName htmlTagName) {
        this.htmlTagName = htmlTagName;
    }

    public HtmlTagClosingName getHtmlTagClosingName() {
        return htmlTagClosingName;
    }

    public void setHtmlTagClosingName(HtmlTagClosingName htmlTagClosingName) {
        this.htmlTagClosingName = htmlTagClosingName;
    }

    @Override
    public String toString() {
        if (htmlTagStartName != null) {
            return "HtmlElement{" +'\n'+
                    htmlTagStartName +'\n'+
                    htmlAttribute +'\n'+
                    htmlContent +'\n'+
                    htmlTagClosingName +'\n'+
                    '}';
        } else if (htmlContent != null) {
            return "HtmlElement{" +'\n'+
                     htmlTagName +'\n'+
                     htmlAttribute +'\n'+
                     htmlContent +'\n'+
                    '}';
        }
        return "HtmlElement{" +'\n'+
                htmlTagName +'\n'+
                htmlAttribute +'\n'+
                '}';
    }
}
