package AST;

import java.util.ArrayList;
import java.util.List;

public class UnionOrIntersectionOrPrimaryType {
//    List<UnionOrIntersectionOrPrimaryType> unionOrIntersectionOrPrimaryType = new ArrayList<UnionOrIntersectionOrPrimaryType>();
    PrimaryType primaryType;


//    public List<UnionOrIntersectionOrPrimaryType> getUnionOrIntersectionOrPrimaryType() {
//        return unionOrIntersectionOrPrimaryType;
//    }
//
//    public void setUnionOrIntersectionOrPrimaryType(List<UnionOrIntersectionOrPrimaryType> unionOrIntersectionOrPrimaryType) {
//        this.unionOrIntersectionOrPrimaryType = unionOrIntersectionOrPrimaryType;
//    }

    public PrimaryType getPrimaryType() {
        return primaryType;
    }

    public void setPrimaryType(PrimaryType primaryType) {
        this.primaryType = primaryType;
    }


    @Override
    public String toString() {
//        if (unionOrIntersectionOrPrimaryType != null) {
//            return "UnionOrIntersectionOrPrimaryType{" +
//                    "unionOrIntersectionOrPrimaryType=" + unionOrIntersectionOrPrimaryType + '\n' +
//                    unionOrIntersectionOrPrimaryType +
//                    '}';
//        }
        return "UnionOrIntersectionOrPrimaryType{" +'\n'+
                primaryType + '\n' +
                '}';
    }
}
