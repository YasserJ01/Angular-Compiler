//package CodeGen;
//
//import AST.*;
//import SymbolTable.*;
//import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
///**
// * Advanced template processor that handles Angular template syntax
// * and converts it to vanilla JavaScript DOM manipulation
// */
//public class AngularTemplateProcessor {
//
//    private final SymbolTable symbolTable;
//    private final AngularToVanilla.ComponentMetadata component;
//
//    // Pattern matchers for Angular syntax
//    private static final Pattern NG_FOR_PATTERN = Pattern.compile(
//            "\\*ngFor=\"\\s*let\\s+(\\w+)\\s+of\\s+(\\w+)(?:\\s*;\\s*index\\s+as\\s+(\\w+))?(?:\\s*;\\s*trackBy\\s*:\\s*(\\w+))?\\s*\"",
//            Pattern.CASE_INSENSITIVE
//    );
//
//    private static final Pattern NG_IF_PATTERN = Pattern.compile(
//            "\\*ngIf=\"([^\"]+)\"",
//            Pattern.CASE_INSENSITIVE
//    );
//
//    private static final Pattern INTERPOLATION_PATTERN = Pattern.compile(
//            "\\{\\{\\s*([^}]+)\\s*\\}\\}"
//    );
//
//    private static final Pattern EVENT_BINDING_PATTERN = Pattern.compile(
//            "\\(([^)]+)\\)=\"([^\"]+)\""
//    );
//
//    private static final Pattern PROPERTY_BINDING_PATTERN = Pattern.compile(
//            "\\[([^]]+)]=\"([^\"]+)\""
//    );
//
//    public AngularTemplateProcessor(SymbolTable symbolTable, AngularToVanilla.ComponentMetadata component) {
//        this.symbolTable = symbolTable;
//        this.component = component;
//    }
//
//    /**
//     * Processes Angular template and generates vanilla JavaScript DOM manipulation code
//     */
//    public String processTemplate(String template) {
//        if (template == null || template.trim().isEmpty()) {
//            return "      this.element.innerHTML = '<div>No template content</div>';";
//        }
//
//        StringBuilder js = new StringBuilder();
//        js.append("      this.element.innerHTML = '';\n");
//
//        // Parse template into DOM structure
//        List<TemplateElement> elements = parseTemplateStructure(template);
//
//        // Generate rendering code for each element
//        for (TemplateElement element : elements) {
//            generateElementCode(js, element, "this.element", 2);
//        }
//
//        return js.toString();
//    }
//
//    /**
//     * Parses template string into structured elements
//     */
//    private List<TemplateElement> parseTemplateStructure(String template) {
//        List<TemplateElement> elements = new ArrayList<>();
//
//        // Simple XML/HTML parser - in production, you'd want a more robust parser
//        String cleanTemplate = template.trim();
//
//        // Handle single root element case
//        if (cleanTemplate.startsWith("<") && cleanTemplate.endsWith(">")) {
//            TemplateElement element = parseElement(cleanTemplate);
//            if (element != null) {
//                elements.add(element);
//            }
//        } else {
//            // Handle multiple root elements or text content
//            elements.add(new TemplateElement("text", cleanTemplate, new HashMap<>(), new ArrayList<>()));
//        }
//
//        return elements;
//    }
//
//    /**
//     * Parses a single HTML element with Angular directives
//     */
//    private TemplateElement parseElement(String elementStr) {
//        // Extract tag name
//        Pattern tagPattern = Pattern.compile("<(\\w+)([^>]*)>(.*?)</\\1>", Pattern.DOTALL);
//        Matcher tagMatcher = tagPattern.matcher(elementStr);
//
//        if (!tagMatcher.find()) {
//            // Self-closing tag or invalid
//            Pattern selfClosingPattern = Pattern.compile("<(\\w+)([^>]*)/>");
//            Matcher selfClosingMatcher = selfClosingPattern.matcher(elementStr);
//            if (selfClosingMatcher.find()) {
//                return new TemplateElement(
//                        selfClosingMatcher.group(1),
//                        "",
//                        parseAttributes(selfClosingMatcher.group(2)),
//                        new ArrayList<>()
//                );
//            }
//            return null;
//        }
//
//        String tagName = tagMatcher.group(1);
//        String attributesStr = tagMatcher.group(2);
//        String content = tagMatcher.group(3);
//
//        Map<String, String> attributes = parseAttributes(attributesStr);
//        List<TemplateElement> children = parseChildren(content);
//
//        return new TemplateElement(tagName, content, attributes, children);
//    }
//
//    /**
//     * Parses attributes from attribute string
//     */
//    private Map<String, String> parseAttributes(String attributesStr) {
//        Map<String, String> attributes = new HashMap<>();
//
//        if (attributesStr == null || attributesStr.trim().isEmpty()) {
//            return attributes;
//        }
//
//        // Parse various attribute patterns
//        Pattern attrPattern = Pattern.compile("(\\S+)=([\"'])([^\"']*?)\\2|([*\\[\\(]?\\w+[\\]\\)]?)(?:=([\"'])([^\"']*?)\\5)?");
//        Matcher matcher = attrPattern.matcher(attributesStr);
//
//        while (matcher.find()) {
//            String name = matcher.group(1) != null ? matcher.group(1) : matcher.group(4);
//            String value = matcher.group(3) != null ? matcher.group(3) :
//                    (matcher.group(6) != null ? matcher.group(6) : "");
//
//            if (name != null) {
//                attributes.put(name.trim(), value);
//            }
//        }
//
//        return attributes;
//    }
//
//    /**
//     * Parses child elements from content string
//     */
//    private List<TemplateElement> parseChildren(String content) {
//        List<TemplateElement> children = new ArrayList<>();
//
//        if (content == null || content.trim().isEmpty()) {
//            return children;
//        }
//
//        // Simple approach - look for nested elements
//        if (content.contains("<")) {
//            // Has nested elements - would need more sophisticated parsing
//            // For now, treat as mixed content
//            children.add(new TemplateElement("text", content, new HashMap<>(), new ArrayList<>()));
//        } else {
//            // Pure text content
//            children.add(new TemplateElement("text", content, new HashMap<>(), new ArrayList<>()));
//        }
//
//        return children;
//    }
//
//    /**
//     * Generates JavaScript code for a template element
//     */
//    private void generateElementCode(StringBuilder js, TemplateElement element, String parentVar, int indentLevel) {
//        String indent = "  ".repeat(indentLevel);
//
//        if ("text".equals(element.getTagName())) {
//            // Handle text content with interpolation
//            String processedText = processInterpolations(element.getContent());
//            if (!processedText.trim().isEmpty()) {
//                js.append(indent).append("var textNode = document.createTextNode(`").append(processedText).append("`);\n");
//                js.append(indent).append(parentVar).append(".appendChild(textNode);\n");
//            }
//            return;
//        }
//
//        // Check for structural directives first
//        String ngFor = element.getAttributes().get("*ngFor");
//        String ngIf = element.getAttributes().get("*ngIf");
//
//        if (ngFor != null) {
//            generateNgForCode(js, element, parentVar, ngFor, indentLevel);
//            return;
//        }
//
//        if (ngIf != null) {
//            generateNgIfCode(js, element, parentVar, ngIf, indentLevel);
//            return;
//        }
//
//        // Regular element generation
//        String elemVar = "elem" + System.currentTimeMillis();
//        js.append(indent).append("var ").append(elemVar).append(" = document.createElement('").append(element.getTagName()).append("');\n");
//
//        // Process attributes
//        generateAttributeCode(js, element, elemVar, indentLevel);
//
//        // Process children
//        for (TemplateElement child : element.getChildren()) {
//            generateElementCode(js, child, elemVar, indentLevel);
//        }
//
//        // Append to parent
//        js.append(indent).append(parentVar).append(".appendChild(").append(elemVar).append(");\n");
//    }
//
//    /**
//     * Generates code for *ngFor directive
//     */
//    private void generateNgForCode(StringBuilder js, TemplateElement element, String parentVar, String ngFor, int indentLevel) {
//        String indent = "  ".repeat(indentLevel);
//
//        Matcher matcher = NG_FOR_PATTERN.matcher(ngFor);
//        if (!matcher.find()) {
//            return;
//        }
//
//        String itemVar = matcher.group(1);
//        String collectionVar = matcher.group(2);
//        String indexVar = matcher.group(3); // may be null
//
//        js.append(indent).append("if (this.").append(collectionVar).append(" && this.").append(collectionVar).append(".length > 0) {\n");
//        js.append(indent).append("  this.").append(collectionVar).append(".forEach((").append(itemVar);
//
//        if (indexVar != null) {
//            js.append(", ").append(indexVar);
//        }
//
//        js.append(") => {\n");
//
//        // Create element without ngFor attribute
//        TemplateElement cleanElement = new TemplateElement(
//                element.getTagName(),
//                element.getContent(),
//                new HashMap<>(element.getAttributes()),
//                element.getChildren()
//        );
//        cleanElement.getAttributes().remove("*ngFor");
//
//        // Generate element code within loop
//        generateElementCode(js, cleanElement, parentVar, indentLevel + 2);
//
//        js.append(indent).append("  });\n");
//        js.append(indent).append("}\n");
//    }
//
//    /**
//     * Generates code for *ngIf directive
//     */
//    private void generateNgIfCode(StringBuilder js, TemplateElement element, String parentVar, String ngIf, int indentLevel) {
//        String indent = "  ".repeat(indentLevel);
//
//        String condition = processCondition(ngIf);
//        js.append(indent).append("if (").append(condition).append(") {\n");
//
//        // Create element without ngIf attribute
//        TemplateElement cleanElement = new TemplateElement(
//                element.getTagName(),
//                element.getContent(),
//                new HashMap<>(element.getAttributes()),
//                element.getChildren()
//        );
//        cleanElement.getAttributes().remove("*ngIf");
//
//        // Generate element code within condition
//        generateElementCode(js, cleanElement, parentVar, indentLevel + 1);
//
//        js.append(indent).append("}\n");
//    }
//
//    /**
//     * Generates code for element attributes
//     */
//    private void generateAttributeCode(StringBuilder js, TemplateElement element, String elemVar, int indentLevel) {
//        String indent = "  ".repeat(indentLevel);
//
//        for (Map.Entry<String, String> attr : element.getAttributes().entrySet()) {
//            String attrName = attr.getKey();
//            String attrValue = attr.getValue();
//
//            // Skip structural directives (already processed)
//            if (attrName.startsWith("*ng")) {
//                continue;
//            }
//
//            // Handle event bindings
//            if (attrName.startsWith("(") && attrName.endsWith(")")) {
//                String eventName = attrName.substring(1, attrName.length() - 1);
//                String handler = attrValue;
//
//                js.append(indent).append(elemVar).append(".addEventListener('").append(eventName).append("', ");
//
//                if (handler.contains("$event")) {
//                    js.append("(event) => { ").append(handler.replace("$event", "event")).append(" });\n");
//                } else {
//                    js.append("() => { ").append(handler).append(" });\n");
//                }
//                continue;
//            }
//
//            // Handle property bindings
//            if (attrName.startsWith("[") && attrName.endsWith("]")) {
//                String propName = attrName.substring(1, attrName.length() - 1);
//                String propValue = processExpression(attrValue);
//
//                if ("src".equals(propName) || "href".equals(propName)) {
//                    js.append(indent).append(elemVar).append(".").append(propName).append(" = ").append(propValue).append(";\n");
//                } else {
//                    js.append(indent).append(elemVar).append(".setAttribute('").append(propName).append("', ").append(propValue).append(");\n");
//                }
//                continue;
//            }
//
//            // Regular attributes
//            if (!attrValue.isEmpty()) {
//                String processedValue = processInterpolations(attrValue);
//                js.append(indent).append(elemVar).append(".setAttribute('").append(attrName).append("', `").append(processedValue).append("`);\n");
//            } else {
//                js.append(indent).append(elemVar).append(".setAttribute('").append(attrName).append("', '');\n");
//            }
//        }
//    }
//
//    /**
//     * Processes interpolation expressions {{ }}
//     */
//    private String processInterpolations(String text) {
//        return INTERPOLATION_PATTERN.matcher(text).replaceAll("\\${this.$1}");
//    }
//
//    /**
//     * Processes Angular expressions for conditions
//     */
//    private String processCondition(String condition) {
//        return "this." + condition;
//    }
//
//    /**
//     * Processes Angular expressions
//     */
//    private String processExpression(String expression) {
//        return "this." + expression;
//    }
//
//    /**
//     * Template element representation
//     */
//    static class TemplateElement {
//        private final String tagName;
//        private final String content;
//        private final Map<String, String> attributes;
//        private final List<TemplateElement> children;
//
//        public TemplateElement(String tagName, String content, Map<String, String> attributes, List<TemplateElement> children) {
//            this.tagName = tagName;
//            this.content = content;
//            this.attributes = attributes;
//            this.children = children;
//        }
//
//        public String getTagName() { return tagName; }
//        public String getContent() { return content; }
//        public Map<String, String> getAttributes() { return attributes; }
//        public List<TemplateElement> getChildren() { return children; }
//    }
//}