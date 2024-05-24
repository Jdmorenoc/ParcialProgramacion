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
        
        if(file.exists()== true){
            System.out.println("El archivo ya existe");
        } else{
            System.out.println("El archivo no existe");
        }     
    }
    
    public static void Escribir(Estudiante estudiante, String codigo) throws IOException{
        File file = new File("./datos.txt");
        FileWriter fr = new FileWriter(file, true);
        PrintWriter pr = new PrintWriter(fr);
        pr.println("Nombre: "+ estudiante.getName()+ ", Apellido: " + estudiante.getLastname() + ", Codigo: " + codigo );
        pr.close();
    }
  
    
    
    
    
}
