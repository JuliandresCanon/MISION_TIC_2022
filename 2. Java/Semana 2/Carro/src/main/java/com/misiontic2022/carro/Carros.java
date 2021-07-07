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
public class Carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Marca del Auto: ");
        String marca=entrada.next.Line();
        System.out.println("Color del Vehiculo: ");
        String color=entrada.next.Line();
        System.out.println("Modelo del Vehiculo: ");
        int modelo=entrada.next.Line();
        System.out.println("Placa del Vehiculo: ");
        String placa=entrada.next.Line();
        System.out.println("Cilindraje del Vehiculo: ");
        int cilindraje=entrada.next.Line();
        System.out.println("Capacidad del Vehiculo: ");
        int pasajeros=entrada.next.Line();
        
        DatosCarro MiCarro = new DatosCarro(marca, color, modelo, placa, cilindraje, pasajeros);
        MiCarro.TipoCarro();
        
        
    }
    
}
