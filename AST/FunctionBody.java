package AST;

public class FunctionBody {
    SourceElements sourceElements;

    public SourceElements getSourceElements() {
        return sourceElements;
    }

    public void setSourceElements(SourceElements sourceElements) {
        this.sourceElements = sourceElements;
    }

    @Override
    public String toString() {
        return "FunctionBody{" +'\n'+
                sourceElements +'\n'+
                '}';
    }
}
