package AST;

import java.util.ArrayList;
import java.util.List;

public class IteratorBlock {
    IteratorBlock iteratorBlock;
    List<IteratorDefinition> iteratorDefinition=new ArrayList<IteratorDefinition>();

    public IteratorBlock getIteratorBlock() {
        return iteratorBlock;
    }

    public void setIteratorBlock(IteratorBlock iteratorBlock) {
        this.iteratorBlock = iteratorBlock;
    }

    public List<IteratorDefinition> getIteratorDefinition() {
        return iteratorDefinition;
    }

    public void setIteratorDefinition(List<IteratorDefinition> iteratorDefinition) {
        this.iteratorDefinition = iteratorDefinition;
    }

    @Override
    public String toString() {
        return "IteratorBlock{" +
                "iteratorBlock=" + iteratorBlock +'\n'+
                ", iteratorDefinition=" + iteratorDefinition +'\n'+
                '}';
    }
}
