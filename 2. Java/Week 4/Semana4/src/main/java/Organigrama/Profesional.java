package Organigrama;

// @author JuliandresCanon

public class Profesional extends JefeArea{
    
    public String cargo;

    public Profesional(String cargo, String Area, String nombre, String apellido, String sexo, int edad) {
        super(Area, nombre, apellido, sexo, edad);
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + "-> " + cargo; 

    //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
