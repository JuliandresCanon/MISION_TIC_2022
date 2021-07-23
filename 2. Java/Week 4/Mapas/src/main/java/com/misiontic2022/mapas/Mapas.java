package com.misiontic2022.mapas;

import java.util.Map;
import java.util.TreeMap;

// @author JuliandresCanon

public class Mapas {

    // @param args the command line arguments

    public static void main(String[] args) {
        
        Map<String, Departamentos> Gobernadores = new TreeMap<String, Departamentos>();
        
        Gobernadores.put("Garcia", new Departamentos("Cundinamarca", "Bogotá"));
        Gobernadores.put("Suarez", new Departamentos("Antioquia", "Medellín"));
        Gobernadores.put("Orozco", new Departamentos("Tolima", "Ibague"));
        
        for(String i : Gobernadores.keySet()){
            System.out.println("Gobernador " + "" + Gobernadores.get(i));
        }
        
    }
    
    /*
    
    Crear una clase persona, que tenga como parámetros los datos típicos de una persona.
    Crear una clase estudiante que herede de personas y además tenga los datos para un estudiante: Curso y barrio
    Crear la clase docente que herede de persona y además tenga los parámetros: Materia que imparte
    Cada clase debe tener sus métodos constructor, set y get
    Agrupar en un mapa los objetos de las clases estudiante y docente
    Escribir un método para mostrar la lista de estudiantes y la lista de docentes ordenadas ABC
    
    */
}
