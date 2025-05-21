package AST;

public class TypeAnnotation {
    Type_ type_;

    public Type_ getType_() {
        return type_;
    }

    public void setType_(Type_ type_) {
        this.type_ = type_;
    }

    @Override
    public String toString() {
        return "TypeAnnotation{" +'\n'+
                type_ + '\n' +
                '}';
    }
}
