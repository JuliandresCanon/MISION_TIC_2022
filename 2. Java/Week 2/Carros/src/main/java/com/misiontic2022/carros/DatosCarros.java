package com.misiontic2022.carros;

// @author JuliandresCanon

public class DatosCarros {
    
    private String marca;
    private String color;
    private int modelo;
    private String placa;
    private int cilindraje;
    private int pasajeros;

    public DatosCarros(String marca, String color, int modelo, String placa, 
            int cilindraje, int pasajeros) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.pasajeros = pasajeros;
    }
    
    public void TipoCarro(){
        
        System.out.println("Marca del automovil: " + this.marca);
        System.out.println("Color del automovil: " + this.color);
        System.out.println("Modelo del automovil: " + this.modelo);
        System.out.println("Placa del automovil: " + this.placa);
        System.out.println("Cilindraje del automovil: " + this.cilindraje);
        System.out.println("Pasajeros del automovil: " + this.pasajeros);
        
    }

    
}
