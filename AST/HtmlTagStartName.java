package AST;

public class HtmlTagStartName {
    HtmlTagName htmlTagName;

    public HtmlTagName getHtmlTagName() {
        return htmlTagName;
    }

    public void setHtmlTagName(HtmlTagName htmlTagName) {
        this.htmlTagName = htmlTagName;
    }

    @Override
    public String toString() {
        return "HtmlTagStartName{" +'\n'+
                htmlTagName + '\n' +
                '}';
    }
}
