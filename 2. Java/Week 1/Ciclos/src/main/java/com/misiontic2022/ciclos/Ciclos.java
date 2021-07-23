package com.misiontic2022.ciclos;

// @author JuliandresCanon

import java.util.Scanner;
import java.lang.Math;

public class Ciclos {

    public static void main(String[] args) {
        
    //  Ciclo1();
    //  Ciclo2();
    //  Ciclo3();
        Ciclo4();
        
        
    }

    public static void Ciclo1() {
        
        int x;
        x = 1;
        
        while (x<=100) {
            System.out.println(x);
            
            x++;
        }
            
    }
    
    public static void Ciclo2() {
        
        Scanner dato = new Scanner(System.in);
        int cont, fact, num;
        
        System.out.println("Digite un número: ");       
        num = dato.nextInt();
        
        cont = 1;
        fact = 1;
        
        while (cont<=num) {
            
            fact = fact*cont;
            cont++;
            
        }
        
        System.out.println("El factorial de: " + num + " es " + fact);
    
    }
    
    public static void Ciclo3() {
        
        //Resolver sumatoria
        
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Digite un número: ");       
        int num = dato.nextInt();        
        int x=1;
        int sum=0;
        
        while (x<=num) {
            
            sum += (int) (Math.pow(x,2) + 3);
            
            x++;
        }
        
        System.out.println("El resultado de la Sumatoria es: " + sum);
    }
    
    public static void Ciclo4() {
        
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Digite un número: ");       
        int num = dato.nextInt(); 
        double x = 1;
        double sum=0;
        
        while (x<=num) {
            
            if (x%2 == 0) {
                sum -= (1/x);
            } else {
                sum += (1/x);
            }
            
            x++;
        }

        System.out.println("El resultado de la Serie es: " + sum);                       
        
    }
}
