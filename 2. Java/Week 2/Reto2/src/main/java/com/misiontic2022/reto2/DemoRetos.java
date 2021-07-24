package com.misiontic2022.reto2;

// @author JuliandresCanon

public class DemoRetos {
    
    public static void main(String[] args) {
        
        String nombre = "Lucia Gomez";
        String identificacion = "1097000000";
        String correo = "lucia.gomezn@correo.com";
        int edad = 25;
        String area = "desarrollo";
        boolean jefe = false;

        Usuario Usuario1 = new Usuario(nombre, identificacion, correo, edad, area, jefe);
        Usuario1.info();
                
    }
}
