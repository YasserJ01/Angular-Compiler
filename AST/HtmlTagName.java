package AST;

public class HtmlTagName {
    String tagName;
    Keyword keyword;
    String identifier;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        if (tagName != null) {
            return "HtmlTagName{" +'\n'+
                    "TagName='" + tagName + "'\n" +
                    '}';
        } else if (keyword != null) {
            return "HtmlTagName{" +'\n'+
                    "Keyword='" + keyword + "'\n" +
                    '}';

        }
        return "HtmlTagName{" +'\n'+
                "Identifier='" + identifier + "'\n" +
                '}';
    }
}
