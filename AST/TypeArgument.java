package AST;

public class TypeArgument {
    Type_ type;

    public Type_ getType() {
        return type;
    }

    public void setType(Type_ type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TypeArgument{" +'\n'+
                type +'\n'+
                '}';
    }
}
