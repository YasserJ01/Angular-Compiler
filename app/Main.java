package app;

import AST.Program;
import SymbolTable.SymbolTable;
import Visitor.BaseVisitor;
import gen.LexerFile;
import gen.ParserFile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static SymbolTable st = new SymbolTable();

    public static void main(String[] args) throws IOException {
//        String source = "DifferentTestsInOne.txt";
//        String source = "product-list.txt";
        String source = "product-details.txt";
//        String source = "app-component.txt";
        CharStream cs = fromFileName(source);
        LexerFile lexer = new LexerFile(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        ParserFile parser = new ParserFile(token);
        ParseTree tree = parser.program();
        BaseVisitor baseVisitor=  new BaseVisitor();
        Program doc = (Program) baseVisitor.visit(tree);

        System.out.println(doc);


    }
}
