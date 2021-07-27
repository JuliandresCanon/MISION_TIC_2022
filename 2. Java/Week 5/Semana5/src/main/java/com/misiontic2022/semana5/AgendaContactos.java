package com.misiontic2022.semana5;

// @author JuliandresCanon

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class AgendaContactos {

    
    public static void main(String[] args) {
        
        TreeMap<String, String> Agenda = new TreeMap<String, String>();
        String nombre, telefono;
        int opcionMenu(0);
        Scanner teclado = new Scanner(System.in);
        
        while (opcionMenu<=5) {
            
        
        
        //// Menú de opciones para la agenda
        opcionMenu = teclado.nextInt();
            
            System.out.println("Seleccione la opcion del menú");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Editar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Listar contactos de la agenda");
            opcionMenu = teclado.nextInt();
            
            switch (opcionMenu){
                
                case 1:
                    System.out.println("Digite el Nombre: ");
                    nombre = teclado.nextLine();
                    System.out.println("Digite el Apellido: ");
                    nombre = teclado.nextLine();
                    System.out.println("Digite el Direcccion: ");
                    nombre = teclado.nextLine();
                    System.out.println("Digite el Telefono: ");
                    telefono = teclado.nextInt();
                    AgregarContacto(nombre, telefono, Agenda);
                
                case 2:
                    
                    
                
            }
        }
        
        //// Metodo para agregar contacto nuevo
        public static void AgregarContacto(String nombre, String telefono, TreeMap<String, String> Agenda) {
            
            if (AgregarContacto) {
                
            }
            Agenda.put(nombre, telefono);
            
        }
        
        public static void EditarContacto(String nombre, String telefono, TreeMap<String, String> Agenda) {
            Agenda.replace(nombre, telefono);
            
        }
        
        
        //Metodo para mostrar contactos
        public static void MostrarContacto(TreeMap<String, String> Agenda) {
            Agenda.put(nombre, telefono);
            
        }
        
        
        
        
    }
    
}
