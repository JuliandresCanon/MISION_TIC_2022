package com.misiontic2022.semana2;

// @author JuliandresCanon

public class Mueble {
    
    private String color;
    private double alto;
    private double ancho;
    private double largo;
    private String material;

    public Mueble(String color, double alto, double ancho, double largo, String material) {
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.material = material;
    
    }

    public void infoMueble(double alto,double ancho,double largo) {
        
        System.out.println("Color" + this.color);
        System.out.println("Alto" + this.alto);
        System.out.println("Ancho" + this.ancho);
        System.out.println("Largo" + this.largo);
        System.out.println("Material" + this.material);
        
        double volumen = alto * ancho * largo;
        
        if (volumen > 2.5) {
            System.out.println("El mueble supera el limite de 2.5 m3");
        }
        
    }
    
}
