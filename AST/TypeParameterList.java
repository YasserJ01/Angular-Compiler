package AST;

import java.util.ArrayList;
import java.util.List;

public class TypeParameterList {
    List<TypeParameter> typeParameter = new ArrayList<TypeParameter>();

    public List<TypeParameter> getTypeParameter() {
        return typeParameter;
    }

    public void setTypeParameter(List<TypeParameter> typeParameter) {
        this.typeParameter = typeParameter;
    }

    @Override
    public String toString() {
        return "TypeParameterList{" +
                "typeParameter=" + typeParameter + '\n' +
                '}';
    }
}
