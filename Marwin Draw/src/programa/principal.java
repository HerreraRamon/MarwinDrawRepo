/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author yumar
 */
public class principal {
    public static void main(String[] args) throws IOException, Exception {
        String ruta1 = "D:/proyecto/Marwin Draw/src/programa/Lexer.flex";
        String ruta2 = "D:/proyecto/Marwin Draw/src/programa/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "D:/proyecto/Marwin Draw/src/programa/Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1,String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        Path rutaSym = Paths.get("D:/proyecto/Marwin Draw/src/programa/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
            Paths.get("D:/proyecto/Marwin Draw/sym.java"), 
            Paths.get("D:/proyecto/Marwin Draw/src/programa/sym.java")
        );
        Path rutaSin = Paths.get("D:/proyecto/Marwin Draw/src/programa/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("D:/proyecto/Marwin Draw/Sintax.java"), 
                Paths.get("D:/proyecto/Marwin Draw/src/programa/Sintax.java")
        );
        
        
    }
}
