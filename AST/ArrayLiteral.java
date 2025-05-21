package AST;

public class ArrayLiteral {
    ElementList elementList;

    public ElementList getElementList() {
        return elementList;
    }

    public void setElementList(ElementList elementList) {
        this.elementList = elementList;
    }

    @Override
    public String toString() {
        return "ArrayLiteral{" +'\n'+
                elementList +'\n'+
                '}';
    }
}
