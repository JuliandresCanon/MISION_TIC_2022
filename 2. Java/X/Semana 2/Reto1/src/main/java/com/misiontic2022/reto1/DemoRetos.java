package com.misiontic2022.reto1;

public class DemoRetos {

    public static void main(String[] args) {
        
        int bono = 500000;
        double porcentaje;
        //tu código acá
        
        Scanner dato = new Scanner(System.in);
        System.out.println("Indique la antiguedad: ");
        int anios = dato.nextInt();
        
        if (anios >= 10){
            porcentaje = 0.3;
        }else if (anios >= 5 && anios < 10){
            porcentaje = 0.2;
        }else if (anios >= 3 && anios < 5){
            porcentaje = 0.1;
        }else{
            porcentaje = 0.05;
        }
        
        System.out.println(porcentaje*bono);
    }
    
}
