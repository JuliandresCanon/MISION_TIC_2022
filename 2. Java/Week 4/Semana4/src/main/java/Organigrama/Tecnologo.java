package Organigrama;

// @author JuliandresCanon

public class Tecnologo extends JefeArea{
    
    public String tarea;

    public Tecnologo(String tarea, String Area, String nombre, String apellido, String sexo, int edad) {
        super(Area, nombre, apellido, sexo, edad);
        this.tarea = tarea;
    }

    @Override
    public String toString() {
        return super.toString() + "-> " + tarea; 

    //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
