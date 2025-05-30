package AST;

public class InterpolationExpression {
    HtmlSequence htmlSequence;
    String DOUBLE_L_CURLY;

    String DOUBLE_R_CURLY;

    public String getDOUBLE_R_CURLY() {
        return DOUBLE_R_CURLY;
    }

    public void setDOUBLE_R_CURLY(String DOUBLE_R_CURLY) {
        this.DOUBLE_R_CURLY = DOUBLE_R_CURLY;
    }

    public String getDOUBLE_L_CURLY() {
        return DOUBLE_L_CURLY;
    }

    public void setDOUBLE_L_CURLY(String double_curly) {
        this.DOUBLE_L_CURLY = double_curly;
    }

    public HtmlSequence getHtmlSequence() {
        return htmlSequence;
    }

    public void setHtmlSequence(HtmlSequence htmlSequence) {
        this.htmlSequence = htmlSequence;
    }

    @Override
    public String toString() {
        return "InterpolationExpression{" + '\n' +
                DOUBLE_L_CURLY + htmlSequence + DOUBLE_R_CURLY + '\n' +
                "}";
    }
}
