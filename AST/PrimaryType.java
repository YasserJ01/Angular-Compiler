package AST;

import java.util.ArrayList;
import java.util.List;

public class PrimaryType {
    Type_ type_;
    PredefinedType predefinedType;
    TypeReference typeReference;
    ObjectType objectType;
    List<PrimaryType> primaryType = new ArrayList<PrimaryType>();

    TupleElementTypes tupleElementTypes;
    TypeQuery typeQuery;
    String This;
    String is;
    String keyOf;


    public Type_ getType_() {
        return type_;
    }

    public void setType_(Type_ type_) {
        this.type_ = type_;
    }

    public PredefinedType getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(PredefinedType predefinedType) {
        this.predefinedType = predefinedType;
    }

    public TypeReference getTypeReference() {
        return typeReference;
    }

    public void setTypeReference(TypeReference typeReference) {
        this.typeReference = typeReference;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public List<PrimaryType> getPrimaryType() {
        return primaryType;
    }

    public void setPrimaryType(List<PrimaryType> primaryType) {
        this.primaryType = primaryType;
    }

    public TupleElementTypes getTupleElementTypes() {
        return tupleElementTypes;
    }

    public void setTupleElementTypes(TupleElementTypes tupleElementTypes) {
        this.tupleElementTypes = tupleElementTypes;
    }

    public TypeQuery getTypeQuery() {
        return typeQuery;
    }

    public void setTypeQuery(TypeQuery typeQuery) {
        this.typeQuery = typeQuery;
    }

    public String getThis() {
        return This;
    }

    public void setThis(String aThis) {
        This = aThis;
    }

    public String getIs() {
        return is;
    }

    public void setIs(String is) {
        this.is = is;
    }

    public String getKeyOf() {
        return keyOf;
    }

    public void setKeyOf(String keyOf) {
        this.keyOf = keyOf;
    }

    @Override
    public String toString() {
        if (type_ != null) {
            return "PrimaryType{" + '\n' +
                    type_ + '\n' +
                    '}';
        } else if (predefinedType != null) {
            return "PrimaryType{" + '\n' +
                    predefinedType + '\n' +
                    '}';
        } else if (typeReference != null) {
            if (primaryType != null && is != null) {
                return "PrimaryType{" + '\n' +
                        typeReference + '\n' +
                        "is=" + is + '\n' +
                        primaryType + '\n' +
                        '}';
            }
            return "PrimaryType{" + '\n' +
                    typeReference + '\n' +
                    '}';
        } else if (objectType != null) {
            return "PrimaryType{" + '\n' +
                    "objectType=" + objectType + '\n' +
                    '}';
        } else if (primaryType != null) {
            if (keyOf != null) {
                return "PrimaryType{" + '\n' +
                        primaryType + '\n' +
                        "keyOf=" + keyOf + '\n' +
                        '}';
            }
            return "PrimaryType{" + '\n' +
                    primaryType + '\n' +
                    '}';
        } else if (tupleElementTypes != null) {
            return "PrimaryType{" + '\n' +
                    "tupleElementTypes=" + tupleElementTypes + '\n' +
                    '}';
        } else if (typeQuery != null) {
            return "PrimaryType{" + '\n' +
                    "typeQuery=" + typeQuery + '\n' +
                    '}';
        }
        return "PrimaryType{" + '\n' +
                "This=" + This + '\n' +
                '}';

    }
}

