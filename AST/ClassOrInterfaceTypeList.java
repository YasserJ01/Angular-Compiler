package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassOrInterfaceTypeList {
    List<TypeReference> typeReference = new ArrayList<TypeReference>();

    public List<TypeReference> getTypeReference() {
        return typeReference;
    }

    public void setTypeReference(List<TypeReference> typeReference) {
        this.typeReference = typeReference;
    }

    @Override
    public String toString() {
        return '\n' +
                "typeReference=" + typeReference + '\n' +
                '}';
    }
}
