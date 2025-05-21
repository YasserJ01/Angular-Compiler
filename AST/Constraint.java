package AST;

public class Constraint {
    Type_ type_;

    public Type_ getType_() {
        return type_;
    }

    public void setType_(Type_ type_) {
        this.type_ = type_;
    }

    @Override
    public String toString() {
        return "Constraint{" +
                "type_=" + type_ +
                '}';
    }
}
