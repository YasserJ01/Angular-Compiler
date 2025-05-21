package AST;

public class ArrayElement {
    String ellipsis;
    SingleExpression singleExpression;
    Identifier identifier;

    public String getEllipsis() {
        return ellipsis;
    }

    public void setEllipsis(String ellipsis) {
        this.ellipsis = ellipsis;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        if (ellipsis != null) {
            if (singleExpression != null) {
                return "ArrayElement{" +'\n'+
                        "ellipsis='" + ellipsis +'\n'+
                        singleExpression +
                        '}';
            } else if (identifier != null) {
                return "ArrayElement{" +'\n'+
                        "ellipsis='" + ellipsis +'\n'+
                        ", identifier=" + identifier +
                        '}';
            }
        } else {
            if (singleExpression != null) {
                return "ArrayElement{" +'\n'+
                        singleExpression +'\n'+
                        '}';
            } else if (identifier != null) {
                return "ArrayElement{" +'\n'+
                        "identifier=" + identifier +
                        '}';
            }
        }
        return "";
    }
}
