package SemanticCheck;

import SymbolTable.Scope;
import SymbolTable.SymbolTable;
import SymbolTable.*;
import java.util.ArrayList;
import java.util.List;

public class SemanticCheck {


    SymbolTable symbolTable = new SymbolTable();

    public List<String> Errors = new ArrayList<>();

    public List<ErrorContext> ErrorContexts = new ArrayList<>();

    // Inner class to store error context with related rows
    public static class ErrorContext {
        private String errorMessage;
        private List<Row> relatedRows;
        private String checkType;

        public ErrorContext(String errorMessage, List<Row> relatedRows, String checkType) {
            this.errorMessage = errorMessage;
            this.relatedRows = new ArrayList<>(relatedRows);
            this.checkType = checkType;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public List<Row> getRelatedRows() {
            return relatedRows;
        }

        public String getCheckType() {
            return checkType;
        }


        public void printErrorContext() {
            System.out.println("Error Context for: " + checkType);
            System.out.println("Error: " + errorMessage);
            System.out.println("Related Symbol Table Rows:");
            System.out.println("..........................................................");

            // Group rows by scope for better readability
            List<Scope> involvedScopes = new ArrayList<>();
            for (Row row : relatedRows) {
                if (!involvedScopes.contains(row.getScope())) {
                    involvedScopes.add(row.getScope());
                }
            }

            // Print each scope and its related rows
            for (Scope scope : involvedScopes) {
                System.out.println("Scope ID: " + scope.getId() + ", Name: " + scope.getName() +
                        "    parent Scope : " + scope.getParent());

                for (Row row : relatedRows) {
                    if (row.getScope().equals(scope)) {
                        row.print();
                    }
                }
            }
            System.out.println("===========================================================");
        }
    }
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public List<String> getErrors() {
        return Errors;
    }

    public void setErrors(ArrayList<String> errors) {
        Errors = errors;
    }

    public List<ErrorContext> getErrorContexts() {
        return ErrorContexts;
    }

    public SemanticCheck() {

    }

//    public void Check_ifDuplicate_class(SymbolTable symbolTable) {
//        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
//            Scope scope = symbolTable.getScopes().get(i);
//            for (int j = 0; j < scope.getRows().size(); j++) {
//                if (scope.getRows().get(j) != null && scope.getRows().get(j).getDatatype().equals("Class")) {
//
//                    String currentClassName = scope.getRows().get(j).getKey();
//                    int currentLineNumber = scope.getRows().get(j).getLineNumber();
//
//                    // Search for duplicate classes across ALL scopes
//                    for (int s = 0; s < symbolTable.getScopes().size(); s++) {
//                        Scope searchScope = symbolTable.getScopes().get(s);
//                        for (int k = 0; k < searchScope.getRows().size(); k++) {
//                            if (searchScope.getRows().get(k) != null &&
//                                    searchScope.getRows().get(k).getDatatype().equals("Class")) {
//
//                                String compareClassName = searchScope.getRows().get(k).getKey();
//                                int compareLineNumber = searchScope.getRows().get(k).getLineNumber();
//
//                                // Check if it's the same class name but different instances
//                                // (different line numbers to avoid comparing the same entry)
//                                if (currentClassName.equals(compareClassName) &&
//                                        currentLineNumber != compareLineNumber &&
//                                        currentLineNumber < compareLineNumber) { // Only report each duplicate once
//
//                                    Errors.add("the class " + compareClassName + " in line: " +
//                                            compareLineNumber + " already exists in line " + currentLineNumber);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }//    public void Check_PropertyMatching(SymbolTable symbolTable) {
////        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
////            Scope scope = symbolTable.getScopes().get(i);
////
////            // Find all Component Properties
////            for (int j = 0; j < scope.getRows().size(); j++) {
////                if (scope.getRows().get(j) != null && scope.getRows().get(j).getDatatype().equals("Class Property")) {
////
////                    String componentKey = scope.getRows().get(j).getKey();
////                    System.out.println("DEBUG: Found Component Property with key: '" + componentKey + "' in scope: " + scope.getId());
////
////                    // Look for corresponding Template Property with same key across ALL scopes
////                    boolean matchFound = false;
////                    for (int s = 0; s < symbolTable.getScopes().size(); s++) {
////                        Scope searchScope = symbolTable.getScopes().get(s);
////                        for (int k = 0; k < searchScope.getRows().size(); k++) {
////                            if (searchScope.getRows().get(k) != null &&
////                                    searchScope.getRows().get(k).getDatatype().equals("Template Property")) {
////
////                                String templateKey = searchScope.getRows().get(k).getKey();
////                                System.out.println("DEBUG: Comparing with Template Property key: '" + templateKey + "' in scope: " + searchScope.getId());
////                                System.out.println("DEBUG: Keys equal? " + componentKey.equals(templateKey));
////
////                                if (componentKey.equals(templateKey)) {
////                                    matchFound = true;
////                                    System.out.println("DEBUG: Match found for key: '" + componentKey + "'");
////                                    break;
////                                }
////                            }
////                        }
////                        if (matchFound) break; // Exit outer loop if match found
////                    }
////
////                    // If no matching Template Property found, add error
////                    if (!matchFound) {
////                        System.out.println("DEBUG: No match found for Component Property key: '" + componentKey + "'");
////                        Errors.add("Property in the template does not match the property in the component. Component Property key: " +
////                                componentKey + " in line: " + scope.getRows().get(j).getLineNumber());
////                    }
////                }
////            }
////        }
////    }
//
////    public void Check_PropertyMatching(SymbolTable symbolTable) {
////        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
////            Scope scope = symbolTable.getScopes().get(i);
////
////            // Find all Component Properties
////            for (int j = 0; j < scope.getRows().size(); j++) {
////                if (scope.getRows().get(j) != null && scope.getRows().get(j).getDatatype().equals("Class Property")) {
////
////                    String componentKey = scope.getRows().get(j).getKey();
////                    Row componentPropertyRow = scope.getRows().get(j);
////                    System.out.println("DEBUG: Found Component Property with key: '" + componentKey + "' in scope: " + scope.getId());
////
////                    // Look for corresponding Template Property with same key across ALL scopes
////                    boolean matchFound = false;
////                    Row matchingTemplateRow = null;
////
////                    for (int s = 0; s < symbolTable.getScopes().size(); s++) {
////                        Scope searchScope = symbolTable.getScopes().get(s);
////                        for (int k = 0; k < searchScope.getRows().size(); k++) {
////                            if (searchScope.getRows().get(k) != null &&
////                                    searchScope.getRows().get(k).getDatatype().equals("Template Property")) {
////
////                                String templateKey = searchScope.getRows().get(k).getKey();
////                                System.out.println("DEBUG: Comparing with Template Property key: '" + templateKey + "' in scope: " + searchScope.getId());
////                                System.out.println("DEBUG: Keys equal? " + componentKey.equals(templateKey));
////
////                                if (componentKey.equals(templateKey)) {
////                                    matchFound = true;
////                                    matchingTemplateRow = searchScope.getRows().get(k);
////                                    System.out.println("DEBUG: Match found for key: '" + componentKey + "'");
////                                    break;
////                                }
////                            }
////                        }
////                        if (matchFound) break; // Exit outer loop if match found
////                    }
////
////                    // If no matching Template Property found, add error with context
////                    if (!matchFound) {
////                        System.out.println("DEBUG: No match found for Component Property key: '" + componentKey + "'");
////                        String errorMessage = "Property in the template does not match the property in the component. Component Property key: " +
////                                componentKey + " in line: " + componentPropertyRow.getLineNumber();
////
////                        Errors.add(errorMessage);
////
////                        // Create error context with only the component property row (since template property doesn't exist)
////                        List<Row> relatedRows = new ArrayList<>();
////                        relatedRows.add(componentPropertyRow);
////
////                        // Add any template properties that were checked (for context)
////                        for (Scope searchScope : symbolTable.getScopes()) {
////                            for (Row row : searchScope.getRows()) {
////                                if (row != null && row.getDatatype().equals("Template Property")) {
////                                    relatedRows.add(row);
////                                }
////                            }
////                        }
////
////                        ErrorContext errorContext = new ErrorContext(errorMessage, relatedRows, "Property Matching Check");
////                        ErrorContexts.add(errorContext);
////                    }
////                }
////            }
////        }
////    }

    public void Check_ifDuplicate_class(SymbolTable symbolTable) {
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            Scope scope = symbolTable.getScopes().get(i);
            for (int j = 0; j < scope.getRows().size(); j++) {
                if (scope.getRows().get(j) != null && scope.getRows().get(j).getDatatype().equals("Class")) {

                    String currentClassName = scope.getRows().get(j).getKey();
                    int currentLineNumber = scope.getRows().get(j).getLineNumber();
                    Row currentClassRow = scope.getRows().get(j);

                    // Search for duplicate classes across ALL scopes
                    for (int s = 0; s < symbolTable.getScopes().size(); s++) {
                        Scope searchScope = symbolTable.getScopes().get(s);
                        for (int k = 0; k < searchScope.getRows().size(); k++) {
                            if (searchScope.getRows().get(k) != null &&
                                    searchScope.getRows().get(k).getDatatype().equals("Class")) {

                                String compareClassName = searchScope.getRows().get(k).getKey();
                                int compareLineNumber = searchScope.getRows().get(k).getLineNumber();
                                Row compareClassRow = searchScope.getRows().get(k);

                                // Check if it's the same class name but different instances
                                // (different line numbers to avoid comparing the same entry)
                                if (currentClassName.equals(compareClassName) &&
                                        currentLineNumber != compareLineNumber &&
                                        currentLineNumber < compareLineNumber) { // Only report each duplicate once

                                    String errorMessage = "the class " + compareClassName + " in line: " +
                                            compareLineNumber + " already exists in line " + currentLineNumber;

                                    // Create error context with both duplicate class rows
                                    List<Row> relatedRows = new ArrayList<>();
                                    relatedRows.add(currentClassRow);  // Original class
                                    relatedRows.add(compareClassRow);  // Duplicate class

                                    addErrorWithContext(errorMessage, relatedRows, "Duplicate Class Check");
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    public void Check_PropertyMatching(SymbolTable symbolTable) {
        // First check if templateUrl is used - if so, skip property matching entirely
        boolean isTemplateUrlUsed = false;
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            Scope scope = symbolTable.getScopes().get(i);
            for (int j = 0; j < scope.getRows().size(); j++) {
                Row row = scope.getRows().get(j);
                if (row != null && row.getDatatype().equals("Component Property") &&
                        row.getKey().equals("templateUrl")) {
                    isTemplateUrlUsed = true;
                    System.out.println("DEBUG: Found templateUrl - skipping property matching check");
                    return; // Exit the entire function
                }
            }
        }

        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            Scope scope = symbolTable.getScopes().get(i);

            // Find all Component Properties
            for (int j = 0; j < scope.getRows().size(); j++) {
                if (scope.getRows().get(j) != null && scope.getRows().get(j).getDatatype().equals("Class Property")) {

                    String componentKey = scope.getRows().get(j).getKey();
                    Row componentPropertyRow = scope.getRows().get(j);
                    System.out.println("DEBUG: Found Component Property with key: '" + componentKey + "' in scope: " + scope.getId());

                    // Look for corresponding Template Property with same key across ALL scopes
                    boolean matchFound = false;
                    Row matchingTemplateRow = null;

                    for (int s = 0; s < symbolTable.getScopes().size(); s++) {
                        Scope searchScope = symbolTable.getScopes().get(s);
                        for (int k = 0; k < searchScope.getRows().size(); k++) {
                            if (searchScope.getRows().get(k) != null &&
                                    searchScope.getRows().get(k).getDatatype().equals("Template Property")) {

                                String templateKey = searchScope.getRows().get(k).getKey();
                                System.out.println("DEBUG: Comparing with Template Property key: '" + templateKey + "' in scope: " + searchScope.getId());
                                System.out.println("DEBUG: Keys equal? " + componentKey.equals(templateKey));

                                if (componentKey.equals(templateKey)) {
                                    matchFound = true;
                                    matchingTemplateRow = searchScope.getRows().get(k);
                                    System.out.println("DEBUG: Match found for key: '" + componentKey + "'");
                                    break;
                                }
                            }
                        }
                        if (matchFound) break; // Exit outer loop if match found
                    }

                    // If no matching Template Property found, add error with context
                    if (!matchFound) {
                        System.out.println("DEBUG: No match found for Component Property key: '" + componentKey + "'");
                        String errorMessage = "Property in the template does not match the property in the component. Component Property key: " +
                                componentKey + " in line: " + componentPropertyRow.getLineNumber();

                        Errors.add(errorMessage);

                        // Create error context with only the component property row (since template property doesn't exist)
                        List<Row> relatedRows = new ArrayList<>();
                        relatedRows.add(componentPropertyRow);

                        // Add any template properties that were checked (for context)
                        for (Scope searchScope : symbolTable.getScopes()) {
                            for (Row row : searchScope.getRows()) {
                                if (row != null && row.getDatatype().equals("Template Property")) {
                                    relatedRows.add(row);
                                }
                            }
                        }

                        ErrorContext errorContext = new ErrorContext(errorMessage, relatedRows, "Property Matching Check");
                        ErrorContexts.add(errorContext);
                    }
                }
            }
        }
    }
    public void addErrorWithContext(String errorMessage, List<Row> relatedRows, String checkType) {
        Errors.add(errorMessage);
        ErrorContext errorContext = new ErrorContext(errorMessage, relatedRows, checkType);
        ErrorContexts.add(errorContext);
    }

    // Method to print errors with their contexts
    public void printErrorsWithContext() {
        if (this.Errors.isEmpty()) {
            System.out.println("No semantic errors");
        } else {
            System.out.println("Semantic error occurred. Please check the error log.");

            for (ErrorContext errorContext : ErrorContexts) {
                errorContext.printErrorContext();
                System.out.println(); // Add space between different errors
            }
        }
    }

//    public void printErrors() {
//        if (this.Errors.isEmpty()) {
//            System.out.println("No semantic errors");
//        } else {
//            System.out.println("Semantic error occurred. Please check the error log.");
//            for (String error : this.Errors) {
//                System.out.println(error);
//            }
//        }
//    }

//    public void Check_TemplateProperty(SymbolTable symbolTable) {
//        // First, find the Component scope
//        Scope componentScope = null;
//        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
//            Scope scope = symbolTable.getScopes().get(i);
//            if (scope.getName().equals("Component")) {
//                componentScope = scope;
//                break;
//            }
//        }
//
//        // If Component scope exists, check for template property
//        if (componentScope != null) {
//            boolean templatePropertyFound = false;
//            List<Row> componentPropertyRows = new ArrayList<>();
//
//            // Search for Component Property with key "template" in Component scope
//            for (int j = 0; j < componentScope.getRows().size(); j++) {
//                Row row = componentScope.getRows().get(j);
//                if (row != null && row.getDatatype().equals("Component Property")) {
//                    componentPropertyRows.add(row); // Collect all component properties for context
//
//                    if (row.getKey().equals("template") || row.getKey().equals("templateUrl")) {
//                        templatePropertyFound = true;
//                        System.out.println("DEBUG: Found template Component Property in Component scope");
//                        break;
//                    }
//                }
//            }
//
//            // If template property not found, add error
//            if (!templatePropertyFound) {
//                System.out.println("DEBUG: Template Component Property not found in Component scope");
//                String errorMessage = "Missing required Component Property 'template' in Component scope";
//
//                // Show all component properties as context (to show what's available vs what's missing)
//                addErrorWithContext(errorMessage, componentPropertyRows, "Template Property Check");
//            }
//        } else {
//            System.out.println("DEBUG: Component scope not found");
//            String errorMessage = "Component scope not found in symbol table";
//
//            // Collect all available scopes for context
//            List<Row> allScopeRows = new ArrayList<>();
//            for (Scope scope : symbolTable.getScopes()) {
//                for (Row row : scope.getRows()) {
//                    if (row != null && (row.getDatatype().equals("Decorator") ||
//                            row.getDatatype().equals("Component Property"))) {
//                        allScopeRows.add(row);
//                    }
//                }
//            }
//
//            addErrorWithContext(errorMessage, allScopeRows, "Template Property Check");
//        }
//    }

    public void Check_TemplateProperty(SymbolTable symbolTable) {
        // First, find the Component scope
        Scope componentScope = null;
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            Scope scope = symbolTable.getScopes().get(i);
            if (scope.getName().equals("Component")) {
                componentScope = scope;
                break;
            }
        }

        // If Component scope exists, check for template property
        if (componentScope != null) {
            boolean templatePropertyFound = false;
            boolean templateUrlFound = false;
            List<Row> componentPropertyRows = new ArrayList<>();

            // Search for Component Property with key "template" or "templateUrl" in Component scope
            for (int j = 0; j < componentScope.getRows().size(); j++) {
                Row row = componentScope.getRows().get(j);
                if (row != null && row.getDatatype().equals("Component Property")) {
                    componentPropertyRows.add(row); // Collect all component properties for context

                    if (row.getKey().equals("template")) {
                        templatePropertyFound = true;
                        System.out.println("DEBUG: Found template Component Property in Component scope");
                    } else if (row.getKey().equals("templateUrl")) {
                        templateUrlFound = true;
                        System.out.println("DEBUG: Found templateUrl Component Property in Component scope - skipping template check");
                    }
                }
            }

            // If templateUrl is found, skip the entire check
            if (templateUrlFound) {
                System.out.println("DEBUG: templateUrl found - skipping template property validation");
                return;
            }

            // If template property not found (and no templateUrl), add error
            if (!templatePropertyFound) {
                System.out.println("DEBUG: Template Component Property not found in Component scope");
                String errorMessage = "Missing required Component Property 'template' in Component scope";

                // Show all component properties as context (to show what's available vs what's missing)
                addErrorWithContext(errorMessage, componentPropertyRows, "Template Property Check");
            }
        } else {
            System.out.println("DEBUG: Component scope not found");
            String errorMessage = "Component scope not found in symbol table";

            // Collect all available scopes for context
            List<Row> allScopeRows = new ArrayList<>();
            for (Scope scope : symbolTable.getScopes()) {
                for (Row row : scope.getRows()) {
                    if (row != null && (row.getDatatype().equals("Decorator") ||
                            row.getDatatype().equals("Component Property"))) {
                        allScopeRows.add(row);
                    }
                }
            }

            addErrorWithContext(errorMessage, allScopeRows, "Template Property Check");
        }
    }
    public void Check_DecoratorImports(SymbolTable symbolTable) {
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            Scope scope = symbolTable.getScopes().get(i);

            // Find all Decorators
            for (int j = 0; j < scope.getRows().size(); j++) {
                if (scope.getRows().get(j) != null &&
                        scope.getRows().get(j).getDatatype().equals("Decorator")) {

                    String decoratorKey = scope.getRows().get(j).getKey();
                    Row decoratorRow = scope.getRows().get(j);
                    System.out.println("DEBUG: Found Decorator with key: '" + decoratorKey + "' in scope: " + scope.getId());

                    // Look for corresponding Import across ALL scopes
                    boolean importFound = false;
                    Row matchingImportRow = null;
                    List<Row> allImportRows = new ArrayList<>();

                    for (int s = 0; s < symbolTable.getScopes().size(); s++) {
                        Scope searchScope = symbolTable.getScopes().get(s);
                        for (int k = 0; k < searchScope.getRows().size(); k++) {
                            Row importRow = searchScope.getRows().get(k);
                            if (importRow != null && importRow.getDatatype().equals("Alias Import")) {
                                allImportRows.add(importRow); // Collect all imports for context

                                if (importRow.getKey().equals(decoratorKey)) {
                                    String importKey = importRow.getKey();
                                    System.out.println("DEBUG: Found Import with key: '" + importKey + "' in scope: " + searchScope.getId());

                                    importFound = true;
                                    matchingImportRow = importRow;
                                    System.out.println("DEBUG: Import found for " + decoratorKey + " decorator");
                                    break;
                                }
                            }
                        }
                        if (importFound) break; // Exit outer loop if import found
                    }

                    // If no matching Import found, add error
                    if (!importFound) {
                        System.out.println("DEBUG: No import found for " + decoratorKey + " decorator");
                        String errorMessage = decoratorKey + " is not imported in line: " + decoratorRow.getLineNumber();

                        // Create error context with decorator and all available imports
                        List<Row> relatedRows = new ArrayList<>();
                        relatedRows.add(decoratorRow);  // The decorator that needs import
                        relatedRows.addAll(allImportRows);  // All available imports for context

                        addErrorWithContext(errorMessage, relatedRows, "Decorator Import Check");
                    }
                }
            }
        }
    }
    public void Check_ConflictingTemplateProperties(SymbolTable symbolTable) {
        // Check if both 'template' and 'templateUrl' are defined in the same component
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            Scope scope = symbolTable.getScopes().get(i);
            if (scope.getName().equals("Component")) {

                Row templateRow = null;
                Row templateUrlRow = null;

                for (int j = 0; j < scope.getRows().size(); j++) {
                    Row row = scope.getRows().get(j);
                    if (row != null && row.getDatatype().equals("Component Property")) {
                        if (row.getKey().equals("template")) {
                            templateRow = row;
                        } else if (row.getKey().equals("templateUrl")) {
                            templateUrlRow = row;
                        }
                    }
                }

                // If both are found, it's an error
                if (templateRow != null && templateUrlRow != null) {
                    String errorMessage = "Component cannot have both 'template' and 'templateUrl' properties. " +
                            "Use either inline template or external template file, not both.";

                    List<Row> relatedRows = new ArrayList<>();
                    relatedRows.add(templateRow);
                    relatedRows.add(templateUrlRow);

                    addErrorWithContext(errorMessage, relatedRows, "Conflicting Template Properties Check");
                }
            }
        }
    }

    public void Check_InputOutputConflict(SymbolTable symbolTable) {
        // Check if same class property name exists in both Input and Output decorator scopes

        List<Row> inputProperties = new ArrayList<>();
        List<Row> outputProperties = new ArrayList<>();

        // Find all scopes and collect properties from Input and Output decorator scopes
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            Scope scope = symbolTable.getScopes().get(i);

            // Check if this is an Input decorator scope
            if (scope.getName().equals("Input")) {
                for (int j = 0; j < scope.getRows().size(); j++) {
                    Row row = scope.getRows().get(j);
                    if (row != null && row.getDatatype().equals("Class Property")) {
                        inputProperties.add(row);
                    }
                }
            }
            // Check if this is an Output decorator scope
            else if (scope.getName().equals("Output")) {
                for (int j = 0; j < scope.getRows().size(); j++) {
                    Row row = scope.getRows().get(j);
                    if (row != null && row.getDatatype().equals("Class Property")) {
                        outputProperties.add(row);
                    }
                }
            }
        }

        // Check for conflicts - same property name in both Input and Output scopes
        for (Row inputProperty : inputProperties) {
            for (Row outputProperty : outputProperties) {
                if (inputProperty.getKey().equals(outputProperty.getKey())) {
                    String propertyName = inputProperty.getKey();

                    String errorMessage = "Class property '" + propertyName +
                            "' cannot have both @Input and @Output decorators. " +
                            "@Input property at line " + inputProperty.getLineNumber() +
                            ", @Output property at line " + outputProperty.getLineNumber();

                    List<Row> relatedRows = new ArrayList<>();
                    relatedRows.add(inputProperty);   // Property in Input scope
                    relatedRows.add(outputProperty);  // Property in Output scope

                    // Also add the decorator rows for context
                    addDecoratorsToRelatedRows(relatedRows, symbolTable, "Input", "Output");

                    addErrorWithContext(errorMessage, relatedRows, "Input/Output Conflict Check");
                }
            }
        }
    }

    // Helper method to add decorator rows to related rows for better context
    private void addDecoratorsToRelatedRows(List<Row> relatedRows, SymbolTable symbolTable,
                                            String inputScopeName, String outputScopeName) {
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            Scope scope = symbolTable.getScopes().get(i);
            for (int j = 0; j < scope.getRows().size(); j++) {
                Row row = scope.getRows().get(j);
                if (row != null && row.getDatatype().equals("Decorator")) {
                    if (row.getKey().equals("Input") || row.getKey().equals("Output")) {
                        relatedRows.add(row);
                    }
                }
            }
        }
    }
}


