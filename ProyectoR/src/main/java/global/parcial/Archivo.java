package global.parcial;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Archivo {
     public static void crear() throws IOException{
        File file = new File("./datos.txt");
        file.createNewFile();
        
        if(file.exists() == true){
            System.out.println("El archivo ya existe");
        }
        else{
            System.out.println("El archivo ya existe");
        }
    }
    
//    public static void Escribir(String nombre,int edad) throws IOException {
//        File file = new File("./datos.txt");
//        FileWriter fw = new FileWriter(file,true); 
//        PrintWriter pw = new PrintWriter(fw);
//        
//        pw.print(nombre);
//        pw.println(edad);
//        pw.close();

//}
}
