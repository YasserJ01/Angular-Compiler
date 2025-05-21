//package AST;
//
//public class GeneratorFunctionDeclaration {
//    String Async;
//    String Function_;
//    Identifier identifier;
//    FormalParameterList formalParameterList;
//    FunctionBody functionBody;
//
//    public String getAsync() {
//        return Async;
//    }
//
//    public void setAsync(String async) {
//        Async = async;
//    }
//
//    public String getFunction_() {
//        return Function_;
//    }
//
//    public void setFunction_(String function_) {
//        Function_ = function_;
//    }
//
//    public Identifier getIdentifier() {
//        return identifier;
//    }
//
//    public void setIdentifier(Identifier identifier) {
//        this.identifier = identifier;
//    }
//
//    public FormalParameterList getFormalParameterList() {
//        return formalParameterList;
//    }
//
//    public void setFormalParameterList(FormalParameterList formalParameterList) {
//        this.formalParameterList = formalParameterList;
//    }
//
//    public FunctionBody getFunctionBody() {
//        return functionBody;
//    }
//
//    public void setFunctionBody(FunctionBody functionBody) {
//        this.functionBody = functionBody;
//    }
//
//    @Override
//    public String toString() {
//        if (Function_ != null && functionBody != null) {
//            if (Async != null) {
//                if (identifier != null) {
//                    if (formalParameterList != null) {
//                        return "GeneratorFunctionDeclaration{" +
//                                "Async='" + Async + '\n' +
//                                ", Function_='" + Function_ + '\n' +
//                                ", identifier=" + identifier + '\n' +
//                                ", formalParameterList=" + formalParameterList + '\n' +
//                                ", functionBody=" + functionBody + '\n' +
//                                '}';
//                        // Case 1: All are not null
//                    } else {
//                        return "GeneratorFunctionDeclaration{" +
//                                "Async='" + Async + '\n' +
//                                ", Function_='" + Function_ + '\n' +
//                                ", identifier=" + identifier + '\n' +
//                                ", functionBody=" + functionBody + '\n' +
//                                '}';
//                        // Case 2: Async and identifier are not null, formalParameterList is null
//                    }
//                } else {
//                    if (formalParameterList != null) {
//                        return "GeneratorFunctionDeclaration{" +
//                                "Async='" + Async + '\n' +
//                                ", Function_='" + Function_ + '\n' +
//                                ", formalParameterList=" + formalParameterList + '\n' +
//                                ", functionBody=" + functionBody + '\n' +
//                                '}';
//                        // Case 3: Async and formalParameterList are not null, identifier is null
//                    } else {
//                        return "GeneratorFunctionDeclaration{" +
//                                "Async='" + Async + '\n' +
//                                ", Function_='" + Function_ + '\n' +
//                                ", functionBody=" + functionBody + '\n' +
//                                '}';
//                        // Case 4: Async is not null, identifier and formalParameterList are null
//                    }
//                }
//            } else {
//                if (identifier != null) {
//                    if (formalParameterList != null) {
//                        return "GeneratorFunctionDeclaration{" +
//                                ", Function_='" + Function_ + '\n' +
//                                ", identifier=" + identifier + '\n' +
//                                ", formalParameterList=" + formalParameterList + '\n' +
//                                ", functionBody=" + functionBody + '\n' +
//                                '}';
//                        // Case 5: identifier and formalParameterList are not null, Async is null
//                    } else {
//                        return "GeneratorFunctionDeclaration{" +
//                                ", Function_='" + Function_ + '\n' +
//                                ", identifier=" + identifier + '\n' +
//                                ", functionBody=" + functionBody + '\n' +
//                                '}';
//                        // Case 6: identifier is not null, Async and formalParameterList are null
//                    }
//                } else {
//                    if (formalParameterList != null) {
//                        return "GeneratorFunctionDeclaration{" +
//                                ", Function_='" + Function_ + '\n' +
//                                ", formalParameterList=" + formalParameterList + '\n' +
//                                ", functionBody=" + functionBody + '\n' +
//                                '}';
//                        // Case 7: formalParameterList is not null, Async and identifier are null
//                    } else {
//                        return "GeneratorFunctionDeclaration{" +
//                                ", Function_='" + Function_ + '\n' +
//                                ", functionBody=" + functionBody + '\n' +
//                                '}';
//                        // Case 8: All are null
//                    }
//                }
//            }
//
//        }
//        return "";
//    }
//}
