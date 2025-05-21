package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlAttributeName {
    String tagName;
    List<String> identifiers = new ArrayList<String>();
    String AngularDirective;

    public String getAngularDirective() {
        return AngularDirective;
    }

    public void setAngularDirective(String angularDirective) {
        AngularDirective = angularDirective;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagNdame) {
        this.tagName = tagName;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public String toString() {
        if (tagName != null) {
            return "HtmlAttributeName{" +'\n'+
                    "TagName='" + tagName + "'\n" +
                    '}';
        } else if (AngularDirective != null) {
            return "HtmlAttributeName{" +'\n'+
                    "AngularDirective='" + AngularDirective + "'\n" +
                    '}';
        }
        return "HtmlAttributeName{" +'\n'+
                "Identifiers=" + identifiers + '\n' +
                '}';
    }
}
