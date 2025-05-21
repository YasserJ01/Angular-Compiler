package AST;

public class ClassDeclaration {
    DecoratorList decoratorList;
    String Export;
    String Default;
    String Abstract;
    String Classe;
    Identifier identifier;
    TypeParameters typeParameters;
    ClassHeritage classHeritage;
    ClassTail classTail;

    public DecoratorList getDecoratorList() {
        return decoratorList;
    }

    public void setDecoratorList(DecoratorList decoratorList) {
        this.decoratorList = decoratorList;
    }

    public String getExport() {
        return Export;
    }

    public void setExport(String export) {
        Export = export;
    }

    public String getDefault() {
        return Default;
    }

    public void setDefault(String aDefault) {
        Default = aDefault;
    }

    public String getAbstract() {
        return Abstract;
    }

    public void setAbstract(String anAbstract) {
        Abstract = anAbstract;
    }

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String classe) {
        Classe = classe;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public TypeParameters getTypeParameters() {
        return typeParameters;
    }

    public void setTypeParameters(TypeParameters typeParameters) {
        this.typeParameters = typeParameters;
    }

    public ClassHeritage getClassHeritage() {
        return classHeritage;
    }

    public void setClassHeritage(ClassHeritage classHeritage) {
        this.classHeritage = classHeritage;
    }

    public ClassTail getClassTail() {
        return classTail;
    }

    public void setClassTail(ClassTail classTail) {
        this.classTail = classTail;
    }

    @Override
    public String toString() {
//        if (decoratorList != null) {
//            return "Class Declaration = " +'\n'+
//                    "decoratorlist"+decoratorList+'\n'+
//                    "}";
//        }
        if (Classe != null && identifier != null && classHeritage != null && classTail != null) {
            if (decoratorList != null) {
                if (Abstract != null) {
                    if (typeParameters != null) {
                        if (Default != null) {
                            return "ClassDeclaration{" +'\n'+
                                     decoratorList +'\n'+
                                    ", Export='" + Export +'\n'+
                                    ", Default='" + Default +'\n'+
                                    ", Abstract='" + Abstract +'\n'+
                                    ", Class='" + Classe +'\n'+
                                    ", identifier=" + identifier +'\n'+
                                     typeParameters +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 1: All are not null
                        } else {
                            if (Export != null) {
                                return "ClassDeclaration{" +'\n'+
                                        "decoratorList=" + decoratorList +'\n'+
                                        ", Export='" + Export + '\n'+
                                        ", Abstract='" + Abstract + '\n'+
                                        ", Class='" + Classe + '\n'+
                                        ", identifier=" + identifier +'\n'+
                                         typeParameters +'\n'+
                                         classHeritage +'\n'+
                                         classTail +'\n'+
                                        '}';
                            }
                            return "ClassDeclaration{" +'\n'+
                                    "decoratorList=" + decoratorList +'\n'+
                                    ", Abstract='" + Abstract + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     typeParameters +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 2: decoratorList, Abstract, and typeParameters are not null, Default is null
                        }
                    } else {
                        if (Default != null) {
                            return "ClassDeclaration{" +'\n'+
                                    "decoratorList=" + decoratorList +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Default='" + Default + '\n'+
                                    ", Abstract='" + Abstract + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 3: decoratorList, Abstract, and Default are not null, typeParameters is null
                        } else {
                            return "ClassDeclaration{" +'\n'+
                                    "decoratorList=" + decoratorList +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Abstract='" + Abstract + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 4: decoratorList and Abstract are not null, typeParameters and Default are null
                        }
                    }
                } else {
                    if (typeParameters != null) {
                        if (Default != null) {
                            return "ClassDeclaration{" +'\n'+
                                    "decoratorList=" + decoratorList +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Default='" + Default + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     typeParameters +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 5: decoratorList, typeParameters, and Default are not null, Abstract is null
                        } else {
                            return "ClassDeclaration{" +'\n'+
                                    "decoratorList=" + decoratorList +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     typeParameters +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 6: decoratorList and typeParameters are not null, Abstract and Default are null
                        }
                    } else {
                        if (Default != null) {
                            return "ClassDeclaration{" +'\n'+
                                    "decoratorList=" + decoratorList +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Default='" + Default + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 7: decoratorList and Default are not null, Abstract and typeParameters are null
                        } else {
                            return "ClassDeclaration{" +'\n'+
                                    "decoratorList=" + decoratorList +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 8: decoratorList is not null, Abstract, typeParameters, and Default are null
                        }
                    }
                }
            } else {
                if (Abstract != null) {
                    if (typeParameters != null) {
                        if (Default != null) {
                            return "ClassDeclaration{" +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Default='" + Default + '\n'+
                                    ", Abstract='" + Abstract + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     typeParameters +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 9: Abstract, typeParameters, and Default are not null, decoratorList is null
                        } else {
                            return "ClassDeclaration{" +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Abstract='" + Abstract + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     typeParameters +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 10: Abstract and typeParameters are not null, decoratorList and Default are null
                        }
                    } else {
                        if (Default != null) {
                            return "ClassDeclaration{" +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Default='" + Default + '\n'+
                                    ", Abstract='" + Abstract + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 11: Abstract and Default are not null, decoratorList and typeParameters are null
                        } else {
                            return "ClassDeclaration{" +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Default='" + Default + '\n'+
                                    ", Abstract='" + Abstract + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 12: Abstract is not null, decoratorList, typeParameters, and Default are null
                        }
                    }
                } else {
                    if (typeParameters != null) {
                        if (Default != null) {
                            return "ClassDeclaration{" +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Default='" + Default + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     typeParameters +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 13: typeParameters and Default are not null, decoratorList and Abstract are null
                        } else {
                            return "ClassDeclaration{" +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     typeParameters +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 14: typeParameters is not null, decoratorList, Abstract, and Default are null
                        }
                    } else {
                        if (Default != null) {
                            return "ClassDeclaration{" +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Default='" + Default + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     classHeritage +'\n'+
                                     classTail +'\n'+
                                    '}';
                            // Case 15: Default is not null, decoratorList, Abstract, and typeParameters are null
                        } else {
                            return "ClassDeclaration{" +'\n'+
                                    ", Export='" + Export + '\n'+
                                    ", Class='" + Classe + '\n'+
                                    ", identifier=" + identifier +'\n'+
                                     classHeritage +'\n'+
                                     classTail + '\n'+
                                    '}';
                            // Case 16: All are null
                        }
                    }
                }
            }

        }
        return "";
    }
}
