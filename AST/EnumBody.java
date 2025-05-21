package AST;

public class EnumBody {
    EnumMemberList enumMemberList;

    public EnumMemberList getEnumMemberList() {
        return enumMemberList;
    }

    public void setEnumMemberList(EnumMemberList enumMemberList) {
        this.enumMemberList = enumMemberList;
    }

    @Override
    public String toString() {
        return '\n' +
                "enumMemberList=" + enumMemberList + '\n' +
                '}';
    }
}
