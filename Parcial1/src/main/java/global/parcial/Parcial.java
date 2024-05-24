package global.parcial;

import java.io.File;
import java.io.IOException;

public class Parcial {

    public static void main(String[] args) throws IOException {
        // Rutas de los archivos
        String estudiantesFile = "estudiantes.txt";
        String actividadesFile = "actividades.txt";

        // Creando estudiantes
        Estudiante est1 = new Estudiante("Juan", " Diego", "01");
        Estudiante est2 = new Estudiante("AnaMaria", "Martinez", "2");
        Actividad act1 = new Actividad("Futbol",5);
        RegistroActividades Registro1 = new RegistroActividades();        
        
        //Enviar la informacion
        Registro1.agregarEstudiante(est1);
        Registro1.agregarActividad(act1);
        
        Registro1.guardarDatos(estudiantesFile, actividadesFile);
        Registro1.cargarDatos(estudiantesFile, actividadesFile);
        
        
        // Crear los archivos si no existen
        try {
            File estFile = new File(estudiantesFile);
            File actFile = new File(actividadesFile);

            if (estFile.createNewFile()) {
                System.out.println("Archivo de estudiantes creado: " + estFile.getName());
            } else {
                System.out.println("El archivo de estudiantes ya existe.");
            }

            if (actFile.createNewFile()) {
                System.out.println("Archivo de actividades creado: " + actFile.getName());
            } else {
                System.out.println("El archivo de actividades ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear los archivos: " + e.getMessage());
        }
    }
}
