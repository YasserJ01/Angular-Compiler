package AST;

import java.util.ArrayList;
import java.util.List;

public class TupleElementTypes {
    List<Type_> type_=new ArrayList<Type_>();

    public List<Type_> getType_() {
        return type_;
    }

    public void setType_(List<Type_> type_) {
        this.type_ = type_;
    }

    @Override
    public String toString() {
        return "TupleElementTypes{" +
                "type_=" + type_ +
                '}';
    }
}
