package AST;

public class FormalParameterArg {
    Decorator decorator;
    AccessibilityModifier accessibilityModifier;
    Assignable assignable;
    TypeAnnotation typeAnnotation;
    SingleExpression singleExpression;

    public Decorator getDecorator() {
        return decorator;
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    public AccessibilityModifier getAccessibilityModifier() {
        return accessibilityModifier;
    }

    public void setAccessibilityModifier(AccessibilityModifier accessibilityModifier) {
        this.accessibilityModifier = accessibilityModifier;
    }

    public Assignable getAssignable() {
        return assignable;
    }

    public void setAssignable(Assignable assignable) {
        this.assignable = assignable;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    @Override
    public String toString() {
        if (assignable != null) {
            if (decorator != null) {
                if (accessibilityModifier != null) {
                    if (typeAnnotation != null) {
                        if (singleExpression != null) {
                            return "FormalParameterArg{" +
                                    "decorator=" + decorator + '\n' +
                                    ", accessibilityModifier=" + accessibilityModifier + '\n' +
                                    ", assignable=" + assignable + '\n' +
                                    ", typeAnnotation=" + typeAnnotation + '\n' +
                                    ", singleExpression=" + singleExpression + '\n' +
                                    '}';
                            // Case 1: All are not null
                        } else {
                            return "FormalParameterArg{" +
                                    "decorator=" + decorator + '\n' +
                                    ", accessibilityModifier=" + accessibilityModifier + '\n' +
                                    ", assignable=" + assignable + '\n' +
                                    ", typeAnnotation=" + typeAnnotation + '\n' +
                                    '}';
                            // Case 2: decorator, accessibilityModifier, and typeAnnotation are not null, singleExpression is null
                        }
                    } else {
                        if (singleExpression != null) {
                            return "FormalParameterArg{" +
                                    "decorator=" + decorator + '\n' +
                                    ", accessibilityModifier=" + accessibilityModifier + '\n' +
                                    ", assignable=" + assignable + '\n' +
                                    ", singleExpression=" + singleExpression + '\n' +
                                    '}';
                            // Case 3: decorator, accessibilityModifier, and singleExpression are not null, typeAnnotation is null
                        } else {
                            return "FormalParameterArg{" +
                                    "decorator=" + decorator + '\n' +
                                    ", accessibilityModifier=" + accessibilityModifier + '\n' +
                                    ", assignable=" + assignable + '\n' +
                                    '}';
                            // Case 4: decorator and accessibilityModifier are not null, typeAnnotation and singleExpression are null
                        }
                    }
                } else {
                    if (typeAnnotation != null) {
                        if (singleExpression != null) {
                            return "FormalParameterArg{" +
                                    "decorator=" + decorator + '\n' +
                                    ", assignable=" + assignable + '\n' +
                                    ", typeAnnotation=" + typeAnnotation + '\n' +
                                    ", singleExpression=" + singleExpression + '\n' +
                                    '}';
                            // Case 5: decorator, typeAnnotation, and singleExpression are not null, accessibilityModifier is null
                        } else {
                            return "FormalParameterArg{" +
                                    "decorator=" + decorator + '\n' +
                                    ", assignable=" + assignable + '\n' +
                                    ", typeAnnotation=" + typeAnnotation + '\n' +
                                    '}';
                            // Case 6: decorator and typeAnnotation are not null, accessibilityModifier and singleExpression are null
                        }
                    } else {
                        if (singleExpression != null) {
                            return "FormalParameterArg{" +
                                    "decorator=" + decorator + '\n' +
                                    ", assignable=" + assignable + '\n' +
                                    ", singleExpression=" + singleExpression + '\n' +
                                    '}';
                            // Case 7: decorator and singleExpression are not null, accessibilityModifier and typeAnnotation are null
                        } else {
                            return "FormalParameterArg{" +
                                    "decorator=" + decorator + '\n' +
                                    ", assignable=" + assignable + '\n' +
                                    '}';
                            // Case 8: decorator is not null, accessibilityModifier, typeAnnotation, and singleExpression are null
                        }
                    }
                }
            } else {
                if (accessibilityModifier != null) {
                    if (typeAnnotation != null) {
                        if (singleExpression != null) {
                            return "FormalParameterArg{" +
                                    ", accessibilityModifier=" + accessibilityModifier + '\n' +
                                    ", assignable=" + assignable + '\n' +
                                    ", typeAnnotation=" + typeAnnotation + '\n' +
                                    ", singleExpression=" + singleExpression + '\n' +
                                    '}';
                            // Case 9: accessibilityModifier, typeAnnotation, and singleExpression are not null, decorator is null
                        } else {
                            return "FormalParameterArg{" +
                                    ", accessibilityModifier=" + accessibilityModifier + '\n' +
                                    ", assignable=" + assignable + '\n' +
                                    ", typeAnnotation=" + typeAnnotation + '\n' +
                                    '}';
                            // Case 10: accessibilityModifier and typeAnnotation are not null, decorator and singleExpression are null
                        }
                    } else {
                        if (singleExpression != null) {
                            return "FormalParameterArg{" +
                                    ", accessibilityModifier=" + accessibilityModifier + '\n' +
                                    ", assignable=" + assignable + '\n' +
                                    ", singleExpression=" + singleExpression + '\n' +
                                    '}';
                            // Case 11: accessibilityModifier and singleExpression are not null, decorator and typeAnnotation are null
                        } else {
                            return "FormalParameterArg{" +
                                    ", accessibilityModifier=" + accessibilityModifier + '\n' +
                                    ", assignable=" + assignable + '\n' +
                                    '}';
                            // Case 12: accessibilityModifier is not null, decorator, typeAnnotation, and singleExpression are null
                        }
                    }
                } else {
                    if (typeAnnotation != null) {
                        if (singleExpression != null) {
                            return "FormalParameterArg{" +
                                    ", assignable=" + assignable + '\n' +
                                    ", typeAnnotation=" + typeAnnotation + '\n' +
                                    ", singleExpression=" + singleExpression + '\n' +
                                    '}';
                            // Case 13: typeAnnotation and singleExpression are not null, decorator and accessibilityModifier are null
                        } else {
                            return "FormalParameterArg{" +
                                    ", assignable=" + assignable + '\n' +
                                    ", typeAnnotation=" + typeAnnotation + '\n' +
                                    '}';
                            // Case 14: typeAnnotation is not null, decorator, accessibilityModifier, and singleExpression are null
                        }
                    } else {
                        if (singleExpression != null) {
                            return "FormalParameterArg{" +
                                    ", assignable=" + assignable + '\n' +
                                    ", singleExpression=" + singleExpression + '\n' +
                                    '}';
                            // Case 15: singleExpression is not null, decorator, accessibilityModifier, and typeAnnotation are null
                        } else {
                            return "FormalParameterArg{" +
                                    ", assignable=" + assignable + '\n' +
                                    '}';
                            // Case 16: All are null
                        }
                    }
                }
            }

        }
        return "";
    }
}
