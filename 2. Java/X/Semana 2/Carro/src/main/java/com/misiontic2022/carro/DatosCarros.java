/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic2022.carro;

/**
 *
 * @author JuliandresCanon
 */
public class DatosCarro {
    private String marca;
    private String color;
    private int modelo;
    private String placa;
    private int cilindraje;
    private int pasajeros;

    public DatosCarro(String marca, String color, int anio, String placa, int cilindraje, int cantidad_pasajeros) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.pasajeros = pasajeros;
    }
    
    public void TipoCarro(){
        System.out.println("Marca del Auto: " + this.marca);
        System.out.println("Color del Auto: " + this.color);
        System.out.println("Modelo del Auto: " + this.modelo);
        System.out.println("Placa del Auto: " + this.placa);
        System.out.println("Cilindraje del Auto: " + this.cilindraje);
        System.out.println("Cantidad de Pasajeros en el Auto: " + this.pasajeros);
        
        
    }
    
}
