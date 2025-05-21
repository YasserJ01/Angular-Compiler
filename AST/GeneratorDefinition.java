package AST;

public class GeneratorDefinition {
    IteratorDefinition iteratorDefinition;

    public IteratorDefinition getIteratorDefinition() {
        return iteratorDefinition;
    }

    public void setIteratorDefinition(IteratorDefinition iteratorDefinition) {
        this.iteratorDefinition = iteratorDefinition;
    }

    @Override
    public String toString() {
        return "GeneratorDefinition{" +
                "iteratorDefinition=" + iteratorDefinition +
                '}';
    }
}
