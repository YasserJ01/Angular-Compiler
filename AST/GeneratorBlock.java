package AST;

import java.util.ArrayList;
import java.util.List;

public class GeneratorBlock {
    List<GeneratorDefinition> generatorDefinition = new ArrayList<GeneratorDefinition>();

    public List<GeneratorDefinition> getGeneratorDefinition() {
        return generatorDefinition;
    }

    public void setGeneratorDefinition(List<GeneratorDefinition> generatorDefinition) {
        this.generatorDefinition = generatorDefinition;
    }

    @Override
    public String toString() {
        return "GeneratorBlock{" +
                "generatorDefinition=" + generatorDefinition +
                '}';
    }
}
