package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassTail {
    List<ClassElement> classElement = new ArrayList<ClassElement>();

    public List<ClassElement> getclassElement() {
        return classElement;
    }

    public void setClassElement(List<ClassElement> classElement) {
        this.classElement = classElement;
    }

    @Override
    public String toString() {
        return "ClassTail{" +'\n'+
                classElement +'\n'+
                '}';
    }
}