package AST;

public class Parameter {
    RequiredParameter requiredParameter;

    OptionalParameter optionalParameter;

    public RequiredParameter getRequiredParameter() {
        return requiredParameter;
    }

    public void setRequiredParameter(RequiredParameter requiredParameter) {
        this.requiredParameter = requiredParameter;
    }

    public OptionalParameter getOptionalParameter() {
        return optionalParameter;
    }

    public void setOptionalParameter(OptionalParameter optionalParameter) {
        this.optionalParameter = optionalParameter;
}

    @Override
    public String toString() {
        if (requiredParameter != null) {
            return "Parameter{" +'\n'+
                    requiredParameter + '\n' +
                    '}';
        }
        return "Parameter{" +'\n'+
                optionalParameter+ '\n' +
                '}';
//        return "Parameter{\n" +
//                ", optionalParameter=" + optionalParameter + '\n' +
//                '}';

    }
}
