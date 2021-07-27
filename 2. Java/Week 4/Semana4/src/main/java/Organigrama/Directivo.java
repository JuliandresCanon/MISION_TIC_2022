package Organigrama;

// @author JuliandresCanon

public class Directivo extends Persona{
    
    public String dependencia;

    public Directivo(String dependencia, String nombre, String apellido, String sexo, int edad) {
        super(nombre, apellido, sexo, edad);
        this.dependencia = dependencia;
    }

    @Override
    public String toString() {
        return super.toString()+"-> " + dependencia; 
    
    //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
