package AST;

public class TypeBody {
    TypeMemberList typeMemberList;
    String semiColon;

    public TypeMemberList getTypeMemberList() {
        return typeMemberList;
    }

    public void setTypeMemberList(TypeMemberList typeMemberList) {
        this.typeMemberList = typeMemberList;
    }

    public String getSemiColon() {
        return semiColon;
    }

    public void setSemiColon(String semiColon) {
        this.semiColon = semiColon;
    }

    @Override
    public String toString() {
        if (semiColon!=null) {
            return "TypeBody{" +
                    "typeMemberList=" + typeMemberList +
                    ", semiColon='" + semiColon + '\n' +
                    '}';
        }
        return "TypeBody{" +
                "typeMemberList=" + typeMemberList +
                '}';
    }
}
