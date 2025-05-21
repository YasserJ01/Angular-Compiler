package AST;

import java.util.ArrayList;
import java.util.List;

public class EnumMemberList {
    List<EnumMember> enumMember = new ArrayList<EnumMember>();

    public List<EnumMember> getEnumMember() {
        return enumMember;
    }

    public void setEnumMember(List<EnumMember> enumMember) {
        this.enumMember = enumMember;
    }

    @Override
    public String toString() {
        return '\n' +
                "enumMember=" + enumMember + '\n' +
                '}';
    }
}
