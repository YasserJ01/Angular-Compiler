package AST;

public class PropertyMemberBase {
    AccessibilityModifier accessibilityModifier;
    String Async;
    String Static;
    String ReadOnly;

    public AccessibilityModifier getAccessibilityModifier() {
        return accessibilityModifier;
    }

    public void setAccessibilityModifier(AccessibilityModifier accessibilityModifier) {
        this.accessibilityModifier = accessibilityModifier;
    }

    public String getAsync() {
        return Async;
    }

    public void setAsync(String async) {
        Async = async;
    }

    public String getStatic() {
        return Static;
    }

    public void setStatic(String aStatic) {
        Static = aStatic;
    }

    public String getReadOnly() {
        return ReadOnly;
    }

    public void setReadOnly(String readOnly) {
        ReadOnly = readOnly;
    }

    @Override
    public String toString() {
        if (accessibilityModifier != null) {
            if (Async != null) {
                if (Static != null) {
                    if (ReadOnly != null) {
                        return "PropertyMemberBase{" +
                                "accessibilityModifier=" + accessibilityModifier + '\n' +
                                ", Async='" + Async + '\n' +
                                ", Static='" + Static + '\n' +
                                ", ReadOnly='" + ReadOnly + '\n' +
                                '}';
                        // Case 1: All are not null
                    } else {
                        return "PropertyMemberBase{" +
                                "accessibilityModifier=" + accessibilityModifier + '\n' +
                                ", Async='" + Async + '\n' +
                                ", Static='" + Static + '\n' +
                                '}';
                        // Case 2: Async and Static are not null, ReadOnly is null
                    }
                } else {
                    if (ReadOnly != null) {
                        return "PropertyMemberBase{" +
                                "accessibilityModifier=" + accessibilityModifier + '\n' +
                                ", Async='" + Async + '\n' +
                                ", ReadOnly='" + ReadOnly + '\n' +
                                '}';
                        // Case 3: Async and ReadOnly are not null, Static is null
                    } else {
                        return "PropertyMemberBase{" +
                                "accessibilityModifier=" + accessibilityModifier + '\n' +
                                ", Async='" + Async + '\n' +
                                '}';
                        // Case 4: Async is not null, Static and ReadOnly are null
                    }
                }
            } else {
                if (Static != null) {
                    if (ReadOnly != null) {
                        return "PropertyMemberBase{" +
                                "accessibilityModifier=" + accessibilityModifier + '\n' +
                                ", Static='" + Static + '\n' +
                                ", ReadOnly='" + ReadOnly + '\n' +
                                '}';
                        // Case 5: Static and ReadOnly are not null, Async is null
                    } else {
                        return "PropertyMemberBase{" +
                                "accessibilityModifier=" + accessibilityModifier + '\n' +
                                ", Static='" + Static + '\n' +
                                '}';
                        // Case 6: Static is not null, Async and ReadOnly are null
                    }
                } else {
                    if (ReadOnly != null) {
                        return "PropertyMemberBase{" +
                                "accessibilityModifier=" + accessibilityModifier + '\n' +
                                ", ReadOnly='" + ReadOnly + '\n' +
                                '}';
                        // Case 7: ReadOnly is not null, Async and Static are null
                    } else {
                        return "PropertyMemberBase{" +
                                "accessibilityModifier=" + accessibilityModifier + '\n' +
                                '}';
                        // Case 8: All are null
                    }
                }
            }

        }
        return "";
    }
}
