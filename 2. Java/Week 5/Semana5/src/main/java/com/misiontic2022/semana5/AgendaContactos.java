package com.misiontic2022.semana5;

// @author JuliandresCanon

import java.util.Scanner;
import java.util.TreeMap;

public class AgendaContactos {

    
    public static void main(String[] args) {
        
        TreeMap<String, String> Agenda = new TreeMap<String, String>();
        String nombre = null;
        String telefono = null;
        int opcionMenu = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        while (opcionMenu!=5) {
            
        //// Menú de opciones para la agenda
            System.out.println("\n Seleccione la opcion del menú");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Editar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Listar contactos de la agenda");
            System.out.println("5. Salir");
            opcionMenu = teclado.nextInt();
            
            switch (opcionMenu){
                
                case 1:
                    System.out.println("Digite el Nombre: ");
                    nombre = teclado.next();
                    System.out.println("Digite el Telefono: ");
                    telefono = teclado.next();
                    AgregarContacto(nombre, telefono, Agenda);
                    break;
                
                case 2:
                    System.out.println("Digite el Nombre: ");
                    nombre = teclado.next();
                    System.out.println("Digite el Telefono: ");
                    telefono = teclado.next();
                    EditarContacto(nombre, telefono, Agenda);
                    break;
                
                case 3:
                    System.out.println("Digite el nombre:");
                    nombre = teclado.next();
                    BorrarContacto(nombre, Agenda);
                    break;
                
                case 4:
                    MostrarContacto(nombre, telefono, Agenda);
                    break;
                
                default:
                    System.out.println("Seleccione una opción válida.");
            }
        }
    }
    
    
    
    //// METODOS DE MODIFICACIÓN DE CONTACTOS
    
    //// Metodo para agregar contacto nuevo
    public static void AgregarContacto(String nombre, String telefono, TreeMap<String, String> Agenda) {
        
        Agenda.put(nombre, telefono);
            
    }
    
    //// Metodo para editar contacto
    public static void EditarContacto(String nombre, String telefono, TreeMap<String, String> Agenda) {
        
        if (Agenda.containsKey(nombre)) {
            Agenda.replace(nombre, telefono);
        } else { 
            System.out.println("El contacto no existe");
        }
    }
    
    ////Metodo para borrar contactos
    public static void BorrarContacto(String nombre, TreeMap<String, String> Agenda){
        Agenda.remove(nombre);
        System.out.println("¡Contacto Eliminado!");
    }

    //// Metodo para visualizar los contactos
    public static void MostrarContacto(String nombre, String telefono, TreeMap<String, String> Agenda) {        
        for (String i : Agenda.keySet()) {
            System.out.println("Nombre: " + i + "\n Telefono: " + Agenda.get(i));
        }
    }
}
