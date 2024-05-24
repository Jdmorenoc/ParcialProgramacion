package global.parcial;

import java.util.Random;

public class Estudiante {
    public String name;
    public String lastname;
    public String codigo;

    public Estudiante(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        generarCodigo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getCodigo() {
        return codigo; 
    }
    
    public void generarCodigo(){
        Random random = new Random(); // Metodo Random
        int randomNumber = random.nextInt(100); 
        String randomNumberStr = String.valueOf(randomNumber);
        this.codigo = (this.name.charAt(0) + "" + this.lastname.charAt(0) + "" + this.lastname.charAt(1)+ "" + randomNumberStr);
               
    }
    
    
}
