package com.misiontic2022.semana2;

// @author JuliandresCanon

public class Animal {
    
    private String nombre;
    private int edad;
    private String especie;

    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }
    
    public void DatosAnimal() {
        
        System.out.println("Nombre del Animal: " + this.nombre);
        System.out.println("Edad del Animal: " + this.edad);
        System.out.println("Especie del Animal: " + this.especie);
        Bozal(this.especie);
        
    }
    
    public void Bozal(String especie) {
        
        if ("PERRO".equals(especie.toUpperCase())) {
            System.out.println("El perro debe llevar bozal");
        }        
        
    }
    
}
