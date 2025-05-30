package AST;

public class HtmlAttribute {
    HtmlAttributeName htmlAttributeName;
    HtmlAttributeValue htmlAttributeValue;
    String AngularDirective;
    PropertyName propertyName;


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

    public String getAngularDirective() {
        return AngularDirective;
    }

    public void setAngularDirective(String angularDirective) {
        AngularDirective = angularDirective;
    }

    public PropertyName getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(PropertyName propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public String toString() {
        if (AngularDirective != null && propertyName != null) {
            return "HtmlAttribute{" + '\n' +
                    AngularDirective + '\n' +
                    propertyName + '\n' +
                    '}';
        }
        else if (htmlAttributeValue != null) {
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
