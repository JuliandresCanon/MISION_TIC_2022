/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic2022.miprimerproyecto;

import java.util.Scanner;

/**
 *
 * @author JuliandresCanon
 */
public class PrimerPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Escriba una palabra");
        String palabra = lectura.nextLine();
        System.out.println("Usted ha ingresado la cadena: "+palabra);
        
        System.out.println("Digite un numero entero: ");
        int entero = lectura.nextInt();
        System.out.println("Usted ha ingresado el entero: "+entero);
        
        System.out.println("Digite un numero decimal: ");
        float decimal = lectura.nextFloat();
        System.out.println("Usted ha ingresado el decimal: "+decimal);
    }
    
    public static void circulo(){
        
        Scanner datos = new Scanner(System.in);
        
        System.out.println("Ingrese el diametro del circulo: ");
        int diametro = datos.nextInt();

        final double pi;
        pi = 3.1416;

        double area = pi/4 * (Math.pow(diametro, 2));
        
        System.out.println("El área del circulo es: "+area);
            
    }
    
}
