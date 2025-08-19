package AST;

public class Identifier {
    String identifier;
    String async;
    String as;
    String from;
    String yield;
    String of;
    String any;
    String number;
    String bool;
    String string;
    String unique;
    String symbol;
    String never;
    String undefined;
    String object;
    String keyOf;
    String typeAlias;
    String constructor;
    String namespace;
    String Abstract;
    // Angular-specific identifiers
    String storeModule;
    String effectsModule;
    String createAction;
    String createReducer;
    String createSelector;
    String routerModule;
    String forRoot;
    String forFeature;
    String select;
    String dispatch;
    String navigate;
    String navigateByUrl;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getYield() {
        return yield;
    }

    public void setYield(String yield) {
        this.yield = yield;
    }

    public String getOf() {
        return of;
    }

    public void setOf(String of) {
        this.of = of;
    }

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBool() {
        return bool;
    }

    public void setBool(String bool) {
        this.bool = bool;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
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

    public void setUndefined(String undefiened) {
        this.undefined = undefiened;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getKeyOf() {
        return keyOf;
    }

    public void setKeyOf(String keyOf) {
        this.keyOf = keyOf;
    }

    public String getTypeAlias() {
        return typeAlias;
    }

    public void setTypeAlias(String typeAlias) {
        this.typeAlias = typeAlias;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getAbstract() {
        return Abstract;
    }

    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    public String getStoreModule() {
        return storeModule;
    }

    public void setStoreModule(String storeModule) {
        this.storeModule = storeModule;
    }

    public String getEffectsModule() {
        return effectsModule;
    }

    public void setEffectsModule(String effectsModule) {
        this.effectsModule = effectsModule;
    }

    public String getCreateAction() {
        return createAction;
    }

    public void setCreateAction(String createAction) {
        this.createAction = createAction;
    }

    public String getCreateReducer() {
        return createReducer;
    }

    public void setCreateReducer(String createReducer) {
        this.createReducer = createReducer;
    }

    public String getCreateSelector() {
        return createSelector;
    }

    public void setCreateSelector(String createSelector) {
        this.createSelector = createSelector;
    }

    public String getRouterModule() {
        return routerModule;
    }

    public void setRouterModule(String routerModule) {
        this.routerModule = routerModule;
    }

    public String getForRoot() {
        return forRoot;
    }

    public void setForRoot(String forRoot) {
        this.forRoot = forRoot;
    }

    public String getForFeature() {
        return forFeature;
    }

    public void setForFeature(String forFeature) {
        this.forFeature = forFeature;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getDispatch() {
        return dispatch;
    }

    public void setDispatch(String dispatch) {
        this.dispatch = dispatch;
    }

    public String getNavigate() {
        return navigate;
    }

    public void setNavigate(String navigate) {
        this.navigate = navigate;
    }

    public String getNavigateByUrl() {
        return navigateByUrl;
    }

    public void setNavigateByUrl(String navigateByUrl) {
        this.navigateByUrl = navigateByUrl;
    }

    @Override
    public String toString() {
        if (identifier != null) {
            return "identifier='" + identifier + "'\n" +
                    '}';
        } else if (async != null) {
            return "Identifier{" +
                    "async='" + async + '\n' +
                    '}';
        } else if (as != null) {
            return "Identifier{" +
                    "as='" + as + '\n' +
                    '}';

        } else if (from != null) {
            return "Identifier{" +
                    "from='" + from + '\n' +
                    '}';

        } else if (yield != null) {
            return "Identifier{" +
                    "yield='" + yield + '\n' +
                    '}';

        } else if (of != null) {
            return "Identifier{" +
                    "of='" + of + '\n' +
                    '}';

        } else if (any != null) {
            return "Identifier{" +
                    "any='" + any + '\n' +
                    '}';

        } else if (number != null) {
            return "Identifier{" +
                    "number='" + number + '\n' +
                    '}';

        } else if (bool != null) {
            return "Identifier{" +
                    "bool='" + bool + '\n' +
                    '}';

        } else if (string != null) {
            return "Identifier{" +
                    "string='" + string + '\n' +
                    '}';

        } else if (unique != null) {
            return "Identifier{" +
                    "unique='" + unique + '\n' +
                    '}';

        } else if (symbol != null) {
            return "Identifier{" +
                    "symbol='" + symbol + '\n' +
                    '}';

        } else if (never != null) {
            return "Identifier{" +
                    "never='" + never + '\n' +
                    '}';
        } else if (undefined != null) {
            return "Identifier{" +
                    "undefined='" + undefined + '\n' +
                    '}';

        } else if (object != null) {
            return "Identifier{" +
                    "object='" + object + '\n' +
                    '}';

        } else if (keyOf != null) {

            return "Identifier{" +
                    "keyOf='" + keyOf + '\n' +
                    '}';
        } else if (typeAlias != null) {
            return "Identifier{" +
                    "typeAlias='" + typeAlias + '\n' +
                    '}';

        } else if (constructor != null) {
            return "Identifier{" +
                    "constructor='" + constructor + '\n' +
                    '}';

        } else if (namespace != null) {
            return "Identifier{" +
                    "namespace='" + namespace + '\n' +
                    '}';

        } else if (storeModule != null) {
            return "Identifier{" +
                    "storeModule='" + storeModule + '\n' +
                    '}';
        } else if (effectsModule != null) {
            return "Identifier{" +
                    "effectsModule='" + effectsModule + '\n' +
                    '}';
        } else if (createAction != null) {
            return "Identifier{" +
                    "createAction='" + createAction + '\n' +
                    '}';
        } else if (createReducer != null) {
            return "Identifier{" +
                    "createReducer='" + createReducer + '\n' +
                    '}';
        } else if (createSelector != null) {
            return "Identifier{" +
                    "createSelector='" + createSelector + '\n' +
                    '}';
        } else if (routerModule != null) {
            return "Identifier{" +
                    "routerModule='" + routerModule + '\n' +
                    '}';
        } else if (forRoot != null) {
            return "Identifier{" +
                    "forRoot='" + forRoot + '\n' +
                    '}';
        } else if (forFeature != null) {
            return "Identifier{" +
                    "forFeature='" + forFeature + '\n' +
                    '}';
        } else if (select != null) {
            return "Identifier{" +
                    "select='" + select + '\n' +
                    '}';
        } else if (dispatch != null) {
            return "Identifier{" +
                    "dispatch='" + dispatch + '\n' +
                    '}';
        } else if (navigate != null) {
            return "Identifier{" +
                    "navigate='" + navigate + '\n' +
                    '}';
        } else if (navigateByUrl != null) {
            return "Identifier{" +
                    "navigateByUrl='" + navigateByUrl + '\n' +
                    '}';
        }
        return "Identifier{" +
                ", Abstract='" + Abstract + '\'' +
                '}';
    }
}
