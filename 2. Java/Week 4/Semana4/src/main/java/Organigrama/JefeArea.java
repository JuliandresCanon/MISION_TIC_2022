package Organigrama;

// @author JuliandresCanon

public class JefeArea extends Persona{
    
    public String area;

    public JefeArea(String area, String nombre, String apellido, String sexo, int edad) {
        super(nombre, apellido, sexo, edad);
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString()+"-> " + area; 

    //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
