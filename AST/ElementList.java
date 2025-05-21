package AST;

import java.util.ArrayList;
import java.util.List;

public class ElementList {
    List<ArrayElement> arrayElement = new ArrayList<ArrayElement>();

    public List<ArrayElement> getArrayElement() {
        return arrayElement;
    }

    public void setArrayElement(List<ArrayElement> arrayElement) {
        this.arrayElement = arrayElement;
    }

    @Override
    public String toString() {
        return "ElementList{" +'\n'+
                arrayElement +'\n'+
                '}';
    }
}
