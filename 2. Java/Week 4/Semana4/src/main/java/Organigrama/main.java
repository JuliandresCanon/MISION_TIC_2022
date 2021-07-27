package Organigrama;

// @author JuliandresCanon

import java.util.Map;
import java.util.TreeMap;


public class main {

    public static void main(String[] args) {
        
        Directivo Dir1 = new Directivo("Proyectos", "Leonardo", "Ospina", "Masculino", 54); 
        JefeArea Jefe1 = new JefeArea("Diseño", "Alejandra", "Robayo", "Femenino", 30); 
        Profesional Prof1 = new Profesional("Estructuras","Diseño", "Julián", "Cañón", "Masculino", 26);
        Profesional Prof2 = new Profesional("Geotecnia","Diseño", "Cristian", "Arias", "Masculino", 25);
        Tecnologo Tec1 = new Tecnologo("Delineante","Diseño", "Paola", "Tunarosa", "Femenino", 18); 
         
        Map<String, Persona> Empleados = new TreeMap<String, Persona>();
        
        Empleados.put("Director", Dir1 );
        Empleados.put("Jefe", Jefe1 );
        Empleados.put("Profesional 1", Prof1 );
        Empleados.put("Profesional 2", Prof2 );
        Empleados.put("Tecnologo", Tec1 );
        
        System.out.println("Los empleados de la compañia son:\n");
        
        for (String i: Empleados.keySet()) {
            
            System.out.println("Empleado " + Empleados.get(i));
            
        }

        EdadPromedio(Empleados);
        OrdenEdad(Empleados);
        
    }

    private static void EdadPromedio(Map<String, Persona> Empleados) {
        
        System.out.println("\nLa edad promedio de los empleados:");
        
        int edad = 0;
        
        for (String i: Empleados.keySet()) {
            
            edad += Empleados.get(i).getEdad();
            
        }
        
        int prom = edad/Empleados.size();
        
        System.out.println(prom);
    }
    
    private static void OrdenEdad(Map<String, Persona> Empleados) {
        
        System.out.println("\nLista de empleados por edad:");
        
        Map<String, Persona> Edades = new TreeMap<String, Persona>();
        
        for (String i: Empleados.keySet()) {
            
            String llave = Empleados.get(i).getNombre();
            int valor = Empleados.get(i).getEdad();
            
            System.out.println(llave + " " + valor);
            
        }
    }
    
        //System.out.println("\nEl empleado mayor es: \n");
}
