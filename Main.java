import AST.Program;
import Visitor.BaseVisitor;
import gen.LexerFile;
import gen.ParserFile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
//        String source = "HelloWorld.txt";
//        String source = "product-list.txt";
        String source = "product-details.txt";
//        String source = "DifferentTestsInOne.txt";
        CharStream cs = fromFileName(source);
        LexerFile lexer = new LexerFile(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        ParserFile parser = new ParserFile(token);
        ParseTree tree = parser.program();
        BaseVisitor baseVisitor=  new BaseVisitor();
        Program doc = (Program) baseVisitor.visit(tree);
//        SymbolTable symbolTable = baseVisitor.getSymbolTable();
//        System.out.println("Symbol Table: ");
//        System.out.println("========================================================================================================================");
//        symbolTable.printSymbols();
//        System.out.println("========================================================================================================================");
        System.out.println(doc);


    }
}
