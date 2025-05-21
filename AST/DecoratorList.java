package AST;

import java.util.ArrayList;
import java.util.List;

public class DecoratorList {
    List<Decorator> decorator = new ArrayList<Decorator>();

    public List<Decorator> getDecorator() {
        return decorator;
    }

    public void setDecorator(List<Decorator> decorator) {
        this.decorator = decorator;
    }

    @Override
    public String toString() {
        return "\n" +
                "decorator=" + decorator + "\n" +
                '}';
    }
}
