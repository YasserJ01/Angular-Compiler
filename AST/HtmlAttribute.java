package AST;

public class HtmlAttribute {
    HtmlAttributeName htmlAttributeName;
    HtmlAttributeValue htmlAttributeValue;

    String Classe;

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String classe) {
        Classe = classe;
    }

    public HtmlAttributeName getHtmlAttributeName() {
        return htmlAttributeName;
    }

    public void setHtmlAttributeName(HtmlAttributeName htmlAttributeName) {
        this.htmlAttributeName = htmlAttributeName;
    }

    public HtmlAttributeValue getHtmlAttributeValue() {
        return htmlAttributeValue;
    }

    public void setHtmlAttributeValue(HtmlAttributeValue htmlAttributeValue) {
        this.htmlAttributeValue = htmlAttributeValue;
    }

    @Override
    public String toString() {
        if (htmlAttributeValue != null) {
            return "HtmlAttribute{" + '\n' +
                    htmlAttributeName + '\n' +
                    Classe + '\n' +
                    htmlAttributeValue + '\n' +
                    '}';

        }
        return "HtmlAttribute{" + '\n' +
                htmlAttributeName + '\n' +
                Classe + '\n' +
                '}';
    }
}
