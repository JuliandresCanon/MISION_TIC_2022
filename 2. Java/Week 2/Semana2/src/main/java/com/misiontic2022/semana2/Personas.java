package com.misiontic2022.semana2;

// @author JuliandresCanon

public class Personas {
    
    private String nombre;
    private String apellido;
    private String documento;
    private int edad;
    private String correo;
    private String lugar;    

    public Personas(String nombre, String apellido, String documento, int edad, String correo, String lugar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
        this.correo = correo;
        this.lugar = lugar;
    }
    
    public void DatosPersonas() {
        
        System.out.println("Nombre: " + this.nombre + " " + this.apellido);
        System.out.println("No. Identificación: " + this.documento);
        System.out.println("Edad: " + this.edad + " Años");
        System.out.println("Email: " + this.correo);
        System.out.println("Lugar de Nacimiento: " + this.lugar);
        Voto(this.edad);
    }
    
    public void Voto (int edad) {
    
        if (edad >= 18) {
            System.out.println("Puede Votar");
        } else {
            System.out.println("No puede votar");
        }
    
    }
    
}
