package com.misiontic2022.carros;

import java.util.Scanner;

// @author JuliandresCanon

public class Carros {

    public static void main(String[] args) {
        
        Scanner ingreso =new Scanner(System.in);
        
        System.out.println("Marca del automovil: ");
        String marca = ingreso.nextLine();
        System.out.println("Color del automovil: ");
        String color = ingreso.nextLine();       
        System.out.println("Placa del automovil: ");
        String placa = ingreso.nextLine();        
        System.out.println("Modelo del automovil: ");
        int modelo = ingreso.nextInt();       
        System.out.println("Cilindraje del automovil: ");
        int cilindraje = ingreso.nextInt();        
        System.out.println("Pasajeros del automovil: ");
        int pasajeros = ingreso.nextInt();
        
        DatosCarros MiCarro = new DatosCarros(marca, color, modelo, placa, cilindraje, pasajeros);
        //DatosCarros TuCarro = new DatosCarros(marca, color, modelo, placa, cilindraje, pasajeros);
        
        MiCarro.TipoCarro();
        //TuCarro.TipoCarro();
        
    }
    
}
