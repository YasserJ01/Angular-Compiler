package app;

import AST.Program;
import CodeGen.AngularGenerator;
import SymbolTable.SymbolTable;
import Visitor.BaseVisitor;
import CodeGen.CodeGenerator;
import CodeGen.AngularToVanilla;
import gen.LexerFile;
import gen.ParserFile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
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
//        String source = "product-details.txt";
//        String source = "product-details.txt";
//        CharStream cs = fromFileName(source);
        String[] sources = {"test1.txt", "test2.txt", "test3.txt"};

        StringBuilder combined = new StringBuilder();
        for (String s : sources) {
            combined.append(java.nio.file.Files.readString(java.nio.file.Path.of(s)));
            combined.append("\n");          // keep them separated
        }

        CharStream cs = CharStreams.fromString(combined.toString());
        LexerFile lexer = new LexerFile(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        ParserFile parser = new ParserFile(token);
        ParseTree tree = parser.program();
        BaseVisitor baseVisitor=  new BaseVisitor();
        Program doc = (Program) baseVisitor.visit(tree);

        System.out.println(doc);
//        AngularGenerator generator = new AngularGenerator();
//        generator.generate(doc);
        new AngularGenerator().generate(doc);

//        try {
//            // AST-independent demo generator (static)
////            new CodeGenerator().generate();
//            // AST-driven template translator (dynamic) using existing Angular-like sources
//            new AngularToVanilla().generateFromTemplates(
//                    java.nio.file.Paths.get("DifferentTestsInOne.txt"),
//                    java.nio.file.Paths.get("DifferentTestsInOne.txt"),
//                    java.nio.file.Paths.get("DifferentTestsInOne.txt")
//            );
//            System.out.println("Code generation complete. Open dist/index.html in a browser.");
//        } catch (Exception e) {
//            System.err.println("Code generation failed: " + e.getMessage());
//        }
    }
}

//
//// --- NgRx state management test ---
//import { Store, select } from '@ngrx/store';
//        import { createAction, createReducer, createSelector } from '@ngrx/store';
//        import { RouterModule, Routes } from '@angular/router';
//
//        const loadProducts = createAction('[Products] Load Products');
//        const setProducts = createAction('[Products] Set Products');
//
//        const reducer = createReducer({});
//
//        const selectFeature = (state) => state.products;
//        const selectProducts = createSelector(selectFeature, (f) => f.list);
//
//class ProductsComponent {
//    constructor(private store: Store, private router: Router) {}
//    ngOnInit() {
//        this.store.dispatch(loadProducts());
//        this.store.select(selectProducts);
//        this.router.navigate(['/home']);
//        this.router.navigateByUrl('/details');
//    }
//}
//
//const routes: Routes = [
//        { path: 'home', component: ProductsComponent },
//        { path: 'details', component: ProductsComponent }
//        ];
//
//        RouterModule.forRoot(routes);

