package AST;

public class AccessibilityModifier {
    String publicAM;
    String privateAM;
    String protectedAM;

    public String getPublicAM() {
        return publicAM;
    }

    public void setPublicAM(String publicAM) {
        this.publicAM = publicAM;
    }

    public String getPrivateAM() {
        return privateAM;
    }

    public void setPrivateAM(String privateAM) {
        this.privateAM = privateAM;
    }

    public String getProtectedAM() {
        return protectedAM;
    }

    public void setProtectedAM(String protectedAM) {
        this.protectedAM = protectedAM;
    }

    @Override
    public String toString() {
        return "AccessibilityModifier{\n" +
                "publicAM='" + publicAM + '\n' +
                ", privateAM='" + privateAM + '\n' +
                ", protectedAM='" + protectedAM + '\n' +
                '}';
    }
}
