package AST;

public class TypeMember {
    PropertySignatur propertySignatur;
    CallSignature callSignature;
    ConstructSignature constructSignature;
    IndexSignature indexSignature;
    MethodSignature methodSignature;

    Type_ type_;

    public PropertySignatur getPropertySignatur() {
        return propertySignatur;
    }

    public void setPropertySignatur(PropertySignatur propertySignatur) {
        this.propertySignatur = propertySignatur;
    }

    public CallSignature getCallSignature() {
        return callSignature;
    }

    public void setCallSignature(CallSignature callSignature) {
        this.callSignature = callSignature;
    }

    public ConstructSignature getConstructSignature() {
        return constructSignature;
    }

    public void setConstructSignature(ConstructSignature constructSignature) {
        this.constructSignature = constructSignature;
    }

    public IndexSignature getIndexSignature() {
        return indexSignature;
    }

    public void setIndexSignature(IndexSignature indexSignature) {
        this.indexSignature = indexSignature;
    }

    public Type_ getType_() {
        return type_;
    }

    public void setType_(Type_ type_) {
        this.type_ = type_;
    }

    public MethodSignature getMethodSignature() {
        return methodSignature;
    }

    public void setMethodSignature(MethodSignature methodSignature) {
        this.methodSignature = methodSignature;
    }

    @Override
    public String toString() {
        if (propertySignatur != null) {
            return "TypeMember{" +
                    "propertySignatur=" + propertySignatur +
                    '}';
        } else if (callSignature != null) {
            return "TypeMember{" +
                    ", callSignature=" + callSignature +
                    '}';
        } else if (constructSignature != null) {
            return "TypeMember{" +
                    ", constructSignature=" + constructSignature +
                    '}';
        } else if (indexSignature != null) {
            return "TypeMember{" +
                    ", indexSignature=" + indexSignature +
                    '}';

        } else if (methodSignature != null) {
            if (type_ != null) {
                return "TypeMember{" +
                        ", methodSignature=" + methodSignature +
                        ", type_=" + type_ +
                        '}';

            } else {
                return "TypeMember{" +
                        ", methodSignature=" + methodSignature +
                        '}';
            }
        }
        return "";
    }
}
