package AST;

import java.util.ArrayList;
import java.util.List;

public class RequiredParameterList {
    List<RequiredParameter> requiredParameter = new ArrayList<RequiredParameter>();

    public List<RequiredParameter> getRequiredParameter() {
        return requiredParameter;
    }

    public void setRequiredParameter(List<RequiredParameter> requiredParameter) {
        this.requiredParameter = requiredParameter;
    }

    @Override
    public String toString() {
        return "RequiredParameterList{\n" +
                "requiredParameter=" + requiredParameter + '\n' +
                '}';
    }
}
