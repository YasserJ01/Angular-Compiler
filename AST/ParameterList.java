package AST;

import java.util.ArrayList;
import java.util.List;

public class ParameterList {
    RestParameter restParameter;
    List<Parameter> parameter = new ArrayList<Parameter>();

    public RestParameter getRestParameter() {
        return restParameter;
    }

    public void setRestParameter(RestParameter restParameter) {
        this.restParameter = restParameter;
    }

    public List<Parameter> getParameter() {
        return parameter;
    }

    public void setParameter(List<Parameter> parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        if (restParameter != null) {
            if (parameter != null) {
                return "ParameterList{\n" +
                        parameter + '\n' +
                        restParameter + '\n' +
                        '}';
            }
            return "ParameterList{\n" +
                    restParameter + '\n' +
                    '}';
        } else {
            if (parameter != null) {
                return "ParameterList{\n" +
                        parameter + '\n' +
                        '}';
            }
            return "";
        }
    }
}
