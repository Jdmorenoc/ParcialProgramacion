package global.parcial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class RegistroActividades {
    private List<Estudiante> estudiantes;
    private List<Actividad> actividades;

    public RegistroActividades() {
        this.estudiantes = new ArrayList<>();
        this.actividades = new ArrayList<>();
    }
    
    // Metodo para agregar estudiantes al registro
    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    
    //Metodo para agregar las actividades al registro
    public void agregarActividad(Actividad actividad){
        actividades.add(actividad);
    }
    
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public List<Actividad> getActividades() {
        return actividades;
    }
    
    public void guardarDatos(String estudiantesFile, String actividadesFile) throws IOException {
        FileWriter frEst = new FileWriter(estudiantesFile, true);
        PrintWriter prEst = new PrintWriter(frEst);
        for(Estudiante estudiante : estudiantes) {
            prEst.print(estudiante.getNombre() + "," + estudiante.getApellido() + "," + estudiante.getCodigoParticipacion());               
        }   
        prEst.close();    
        
        FileWriter frAct = new FileWriter(actividadesFile, true);
        PrintWriter prAct = new PrintWriter(frAct);
        for(Actividad actividad : actividades){
            prAct.print( "La actividad seleccionada es: " + actividad.getNombre() + ",");
            prAct.close();
        }       
    }
    
    public void cargarDatos(String estudiantesFile, String actividadesFile) throws IOException{
        FileReader frEst = new FileReader(estudiantesFile);
        BufferedReader bfEst = new BufferedReader(frEst);
        String line = bfEst.readLine();
        while(line != null){
            String[] data = line.split(",");
            Estudiante estudiante = new Estudiante(data[0],data[1],data[2],data[3]);
            estudiantes.add(estudiante);              
    }bfEst.close();
    
        FileReader frAct = new FileReader(actividadesFile);
        BufferedReader bfAct = new BufferedReader(frAct);
        String lina = bfAct.readLine();
        while(lina != null){
            String[] data = lina.split(",");
            Actividad actividad = new Actividad(data[0], Integer.parseInt(data[1]));
            actividades.add(actividad);              
    }bfAct.close();
}
}
