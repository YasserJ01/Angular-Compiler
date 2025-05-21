package AST;

public class Program {
    SourceElements sourceElements;

    public SourceElements getSourceElements() {
        return sourceElements;
    }

    public void setSourceElements(SourceElements sourceElements) {
        this.sourceElements = sourceElements;
    }

    @Override
    public String toString() {
        if (sourceElements != null) {
            return "Program{\n" +
                    sourceElements + '\n' +
                    "}";
        }
        return " ";
    }
}
