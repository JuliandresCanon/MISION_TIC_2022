package com.misiontic2022.semana4;

// @author JuliandresCanon

import java.util.ArrayList;


public class Semana4 {
    
    //crear un arreglo tipo lista para guardar objetos derivados de la clase abstracta
    
    public static ArrayList <SeleccionFutbol> SeleccionMINTIC = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {
        
    Futbol();    
        
    }
    
    public static void Futbol() {
        
        SeleccionFutbol jugador1 = new Jugador(10, "Lateral", "James", "Rodriguez", 1072366624, 27);
        SeleccionFutbol director1 = new DirectorDT("DT1994", "Reynaldo", "Rueda", 3047119, 58);
        SeleccionFutbol fisio1 = new Fisioterapeuta("Medico", 2006, "Carolina", "Cepeda", 20626642, 30);

        SeleccionMINTIC.add(jugador1);
        SeleccionMINTIC.add(director1);
        SeleccionMINTIC.add(fisio1);
        
//        SeleccionMINTIC.get(0).PartidoFutbol();
//        SeleccionMINTIC.get(0).Entrenamiento();
//        SeleccionMINTIC.get(1).Entrenamiento();
//        SeleccionMINTIC.get(2).Entrenamiento();
        
        System.out.println("Esta es la planilla de Eventos");
        
        for (int i=0; i<SeleccionMINTIC.size(); i++) {
            
            System.out.println(SeleccionMINTIC.get(i).getID() +" "+ SeleccionMINTIC.get(i).getNombre() +" "+ SeleccionMINTIC.get(i).getApellido() );
            
            SeleccionMINTIC.get(i).Entrenamiento();            
        }
        
        
    }
    
}
