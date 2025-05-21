package AST;

import java.util.ArrayList;
import java.util.List;

public class TypeArgumentList {
    List<TypeArgument>  typeArgument = new ArrayList<TypeArgument>();

    public List<TypeArgument> getTypeArgument() {
        return typeArgument;
    }

    public void setTypeArgument(List<TypeArgument> typeArgument) {
        this.typeArgument = typeArgument;
    }

    @Override
    public String toString() {
        return "TypeArgumentList{" +'\n'+
                typeArgument +'\n'+
                '}';
    }
}
