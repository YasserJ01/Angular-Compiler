package AST;


public class TypeArguments {
    TypeArgumentList typeArgumentList;

    public TypeArgumentList getTypeArgumentList() {
        return typeArgumentList;
    }

    public void setTypeArgumentList(TypeArgumentList typeArgumentList) {
        this.typeArgumentList = typeArgumentList;
    }

    @Override
    public String toString() {
        if (typeArgumentList != null) {
            return "TypeArguments{" +'\n'+
                     typeArgumentList + '\n' +
                    '}';
        }
        return "TypeArguments{" +'\n'+
                '}';
    }
}
