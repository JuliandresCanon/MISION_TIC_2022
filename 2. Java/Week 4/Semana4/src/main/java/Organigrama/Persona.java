package Organigrama;

// @author JuliandresCanon

public class Persona {
    
    public String nombre;
    public String apellido;
    public String sexo;
    public int edad;

    public Persona(String nombre, String apellido, String sexo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    
    
    @Override
    public String toString() {
        return "->" + nombre +' '+ apellido;
    }

}
