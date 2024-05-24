package global.parcial;

import java.io.IOException;

public class Parcial {

    public static void main(String[] args) throws IOException {
        Archivo.crear();
        
        Estudiante est1 = new Estudiante("juan", "moreno");
        est1.generarCodigo();
        Estudiante est2 = new Estudiante("ana", "quintero");
        est2.generarCodigo();
        
        //Escribir en el archivo.txt
        Archivo.Escribir(est1, est1.getCodigo());
        Archivo.Escribir(est2, est2.getCodigo());
        
        
        
    }
}
