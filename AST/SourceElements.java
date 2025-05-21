package AST;

import java.util.ArrayList;
import java.util.List;

public class SourceElements {
    List<SourceElement> sourceElement = new ArrayList<SourceElement>();

    public List<SourceElement> getSourceElement() {
        return sourceElement;
    }

    public void setSourceElement(List<SourceElement> sourceElement) {
        this.sourceElement = sourceElement;
    }

    @Override
    public String toString() {
        return "SourceElements{" +'\n'+
                sourceElement +'\n'+
                '}';
    }
}
