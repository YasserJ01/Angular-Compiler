package AST;

public class PredefinedType {
    String any;
    String nullLiteral;
    String number;
    String decimalLiteral;
    String bool;
    String booleanLiteral;
    String string;
    String stringLiteral;
    String unique;
    String symbol;
    String never;
    String undefined;
    String object;
    String Void;

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public String getNullLiteral() {
        return nullLiteral;
    }

    public void setNullLiteral(String nullLiteral) {
        this.nullLiteral = nullLiteral;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDecimalLiteral() {
        return decimalLiteral;
    }

    public void setDecimalLiteral(String decimalLiteral) {
        this.decimalLiteral = decimalLiteral;
    }

    public String getBool() {
        return bool;
    }

    public void setBool(String bool) {
        this.bool = bool;
    }

    public String getBooleanLiteral() {
        return booleanLiteral;
    }

    public void setBooleanLiteral(String booleanLiteral) {
        this.booleanLiteral = booleanLiteral;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getNever() {
        return never;
    }

    public void setNever(String never) {
        this.never = never;
    }

    public String getUndefined() {
        return undefined;
    }

    public void setUndefined(String undefined) {
        this.undefined = undefined;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getVoid() {
        return Void;
    }

    public void setVoid(String aVoid) {
        Void = aVoid;
    }

    @Override
    public String toString() {
        if (any != null) {
            return "PredefinedType{" +
                    "any='" + any + "'\n" +
                    '}';

        } else if (nullLiteral != null) {
            return "PredefinedType{" +
                    "nullLiteral='" + nullLiteral + '\n' +
                    '}';
        } else if (number != null) {
            return "PredefinedType{" +
                    "number='" + number + '\n' +
                    '}';
        } else if (decimalLiteral != null) {
            return "PredefinedType{" +
                    "decimalLiteral='" + decimalLiteral + '\n' +
                    '}';
        } else if (bool != null) {
            return "PredefinedType{" +
                    "bool='" + bool + '\n' +
                    '}';
        } else if (booleanLiteral != null) {
            return "PredefinedType{" +
                    "booleanLiteral='" + booleanLiteral + '\n' +
                    '}';
        } else if (string != null) {
            return "PredefinedType{" +
                    "string='" + string + '\n' +
                    '}';
        } else if (stringLiteral != null) {
            return "PredefinedType{" +
                    "stringLiteral='" + stringLiteral + '\n' +
                    '}';
        } else if (symbol != null) {
            if (unique != null) {
                return "PredefinedType{" +
                        "unique='" + unique + '\n' +
                        "symbol='" + symbol + '\n' +
                        '}';
            } else {
                return "PredefinedType{" +
                        "symbol='" + symbol + '\n' +
                        '}';
            }
        } else if (never != null) {
            return "PredefinedType{" +
                    "never='" + never + '\n' +
                    '}';
        } else if (undefined != null) {
            return "PredefinedType{" +
                    "undefined='" + undefined + '\n' +
                    '}';
        } else if (object != null) {
            return "PredefinedType{" +
                    "object='" + object + '\n' +
                    '}';
        }
        return "PredefinedType{" +
                "Void='" + Void + '\n' +
                '}';

    }
}
