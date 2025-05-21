package AST;

import java.util.ArrayList;
import java.util.List;

public class TypeMemberList {
    List<TypeMember> typeMember = new ArrayList<TypeMember>();
    String semiColon;

    public List<TypeMember> getTypeMember() {
        return typeMember;
    }

    public void setTypeMember(List<TypeMember> typeMember) {
        this.typeMember = typeMember;
    }

    public String getSemiColon() {
        return semiColon;
    }

    public void setSemiColon(String semiColon) {
        this.semiColon = semiColon;
    }

    @Override
    public String toString() {
        if (semiColon != null) {
            return "TypeMemberList{" +
                    "typeMember=" + typeMember +
                    ", semiColon='" + semiColon + '\'' +
                    '}';
        }

        return "TypeMemberList{" +
                "typeMember=" + typeMember +
                '}';
    }
}
