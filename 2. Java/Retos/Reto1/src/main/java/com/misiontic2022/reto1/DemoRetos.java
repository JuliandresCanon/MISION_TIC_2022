package com.misiontic2022.reto1;

// @author JuliandresCanon

public class DemoRetos {
    
    public static double calcularPorcentajeBono(int anios,float bono) {

        double porcentaje;
        
        if (anios >= 10){
            porcentaje = 0.3;
        }else if (anios >= 5 && anios < 10){
            porcentaje = 0.2;
        }else if (anios >= 3 && anios < 5){
            porcentaje = 0.1;
        }else{
            porcentaje = 0.05;
        }
        
        return porcentaje*bono;
        
    }

    public static void main(String[] args) {
        
        int bono=500000;
        int anios=25;
        System.out.println(DemoRetos.calcularPorcentajeBono(anios,bono));
        
    }
    
}