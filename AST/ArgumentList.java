package AST;

import java.util.ArrayList;
import java.util.List;

public class ArgumentList {
    List<Argument> argument = new ArrayList<Argument>();

    public List<Argument> getArgument() {
        return argument;
    }

    public void setArgument(List<Argument> argument) {
        this.argument = argument;
    }

    @Override
    public String toString() {
        return "ArgumentList{" + '\n' +
                argument +
                '}';
    }
}
