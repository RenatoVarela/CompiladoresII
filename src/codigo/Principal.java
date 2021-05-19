/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Principal {
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\Lexer.flex";
        String ruta2 = "C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\LexerCup.flex";
        String[] rutaS = {"-parser", "ArbolSemantico", "C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\ArbolSemantico.cup"};
        String[] rutaS2 = {"-parser", "CupArbol", "C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\CupArbol.cup"};

        generar(ruta1, ruta2, rutaS , rutaS2 );
    }
    public static void generar( String ruta1, String ruta2, String[] rutaS , String[] rutaS2) throws IOException, Exception{
        File archivo;
        
        archivo = new File(ruta1);
        jflex.Main.generate(archivo);
        archivo = new File(ruta2);
        jflex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        jflex.Main.generate(archivo);
        java_cup.Main.main(rutaS2);
        
        Path rutaSym = Paths.get("C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\sym.java"), 
                Paths.get("C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\sym.java")
        );
        Path rutaSin = Paths.get("C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\ArbolSemantico.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\ArbolSemantico.java"), 
                Paths.get("C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\ArbolSemantico.java")
        );
        
        Path rutaSin2 = Paths.get("C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\CupArbol.java");
        if (Files.exists(rutaSin2)) {
            Files.delete(rutaSin2);
        }
        Files.move(
                Paths.get("C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\CupArbol.java"), 
                Paths.get("C:\\Users\\renat\\OneDrive\\Documentos\\NetBeansProjects\\AnalizadorLexico\\src\\codigo\\CupArbol.java")
        );
    }
}
