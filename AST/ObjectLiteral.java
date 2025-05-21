package AST;

import java.util.ArrayList;
import java.util.List;

public class ObjectLiteral {
    List<PropertyAssignment> propertyAssignment = new ArrayList<PropertyAssignment>();

    public List<PropertyAssignment> getPropertyAssignment() {
        return propertyAssignment;
    }

    public void setPropertyAssignment(List<PropertyAssignment> propertyAssignment) {
        this.propertyAssignment = propertyAssignment;
    }

    @Override
    public String toString() {
        if (propertyAssignment != null) {
            return "ObjectLiteral{" +'\n'+
                    propertyAssignment +'\n'+
                    '}';
        }
        return "";
    }
}

