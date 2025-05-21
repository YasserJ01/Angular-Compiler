package AST;

import java.util.ArrayList;
import java.util.List;

public class FormalParameterList {
    List<FormalParameterArg> formalParameterArg = new ArrayList<FormalParameterArg>();
    LastFormalParameterArg lastFormalParameterArg;
    ArrayLiteral arrayLiteral;
    ObjectLiteral objectLiteral;
    FormalParameterList formalParameterList;

    public List<FormalParameterArg> getFormalParameterArg() {
        return formalParameterArg;
    }

    public void setFormalParameterArg(List<FormalParameterArg> formalParameterArg) {
        this.formalParameterArg = formalParameterArg;
    }

    public LastFormalParameterArg getLastFormalParameterArg() {
        return lastFormalParameterArg;
    }

    public void setLastFormalParameterArg(LastFormalParameterArg lastFormalParameterArg) {
        this.lastFormalParameterArg = lastFormalParameterArg;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public FormalParameterList getFormalParameterList() {
        return formalParameterList;
    }

    public void setFormalParameterList(FormalParameterList formalParameterList) {
        this.formalParameterList = formalParameterList;
    }

    @Override
    public String toString() {
        if (lastFormalParameterArg != null) {
            if (formalParameterArg != null) {
                return "FormalParameterList{" +
                        "formalParameterArg=" + formalParameterArg + '\n' +
                        ", lastFormalParameterArg=" + lastFormalParameterArg + '\n' +
                        '}';
            } else {
                return "FormalParameterList{" +
                        ", lastFormalParameterArg=" + lastFormalParameterArg + '\n' +
                        '}';
            }
        } else if (arrayLiteral != null) {
            return "FormalParameterList{" +
                    ", arrayLiteral=" + arrayLiteral + '\n' +
                    '}';
        } else if (objectLiteral != null) {
            if (formalParameterList != null) {
                return "FormalParameterList{" +
                        ", objectLiteral=" + objectLiteral + '\n' +
                        ", formalParameterList=" + formalParameterList + '\n' +
                        '}';
            }
            return "FormalParameterList{" +
                    ", objectLiteral=" + objectLiteral +
                    '}';
        }
        return "";
    }
}
