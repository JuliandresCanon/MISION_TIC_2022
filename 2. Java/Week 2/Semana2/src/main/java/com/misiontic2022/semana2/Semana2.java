package com.misiontic2022.semana2;

// @author JuliandresCanon

import java.util.Scanner;

public class Semana2 {


    public static void main(String[] args) {
        
    //  Personas();
    //  Animal();
    //  Lugar();
        Muebles();
        
    }
    
    public static void Personas() {
        
        Scanner Ingreso = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String nombre = Ingreso.nextLine();
        System.out.println("Apellido: ");
        String apellido = Ingreso.nextLine();
        System.out.println("Documento: ");
        String documento = Ingreso.nextLine();
        System.out.println("Email: ");
        String correo = Ingreso.nextLine();
        System.out.println("Lugar de Nacimiento: ");
        String lugar = Ingreso.nextLine();
        System.out.println("Edad: ");
        int edad = Ingreso.nextInt();
        
        Personas Persona1 = new Personas(nombre, apellido, documento, edad, correo, lugar);
        
        Persona1.DatosPersonas();
        
    }
    
     public static void Animal() {
        
        Scanner Ingreso = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String nombre = Ingreso.nextLine();
        System.out.println("Especie: ");
        String especie = Ingreso.nextLine();
        System.out.println("Edad: ");
        int edad = Ingreso.nextInt();
        
        Animal Animal1 = new Animal(nombre, edad, especie);
        
        Animal1.DatosAnimal();
        
    }
    
     public static void Lugar() {
        
        Scanner Ingreso = new Scanner(System.in);
        
        System.out.println("Nombre del lugar: ");
        String nombre = Ingreso.nextLine();
        System.out.println("Dirección: ");
        String direccion = Ingreso.nextLine();
        System.out.println("Pagina Web: ");
        String url = Ingreso.nextLine();
        System.out.println("Comentario: ");
        String comentario = Ingreso.nextLine();
        System.out.println("Telefono: ");
        int telefono = Ingreso.nextInt();        
        System.out.println("Valoración: ");
        double valoracion = Ingreso.nextDouble();
        
        Lugar Lugar1 = new Lugar(nombre, direccion, telefono, url, comentario, valoracion);
        
        Lugar1.DatosLugar();
        
    }    
     
    
     public static void Muebles() {
        
        Scanner Ingreso = new Scanner(System.in);
        
        System.out.println("Color del Mueble: ");
        String color = Ingreso.nextLine();
        System.out.println("Material: ");
        String material = Ingreso.nextLine();
        System.out.println("Altura: ");
        double alto = Ingreso.nextDouble();
        System.out.println("Ancho: ");
        double ancho = Ingreso.nextDouble();
        System.out.println("Largo: ");
        double largo = Ingreso.nextDouble();
        
        
        Mueble Mueble1 = new Mueble(color, alto, ancho, largo, material);
        
        Mueble1.infoMueble(alto, ancho, largo);
        
    }         
}
