package com.misiontic2022.semana4;

// @author JuliandresCanon

// Abstract convierta a la clase en una plantilla. No se puede instanciar en el Main.
public abstract class SeleccionFutbol {
    
    protected String Nombre;
    protected String Apellido;
    public int ID;
    public int Edad;

    public SeleccionFutbol(String Nombre, String Apellido, int ID, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ID = ID;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public void Viajar() {
        System.out.println("Viajar * Clase padre");
    }
    
    public void Concentracion() {
        System.out.println("Concentracion * Clase padre");
    }
    
    public void Entrenamiento() {
        System.out.println("Entrenamiento * Clase padre");
    }
    
    public void PartidoFutbol() {
        System.out.println("PartidoFutbol * Clase padre");
    }
}
