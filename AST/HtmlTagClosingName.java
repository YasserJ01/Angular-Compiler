package AST;

public class HtmlTagClosingName {
    HtmlTagName htmlTagName;

    public HtmlTagName getHtmlTagName() {
        return htmlTagName;
    }

    public void setHtmlTagName(HtmlTagName htmlTagName) {
        this.htmlTagName = htmlTagName;
    }

    @Override
    public String toString() {
        return "HtmlTagClosingName{" +'\n'+
                htmlTagName +
                '}';
    }
}
