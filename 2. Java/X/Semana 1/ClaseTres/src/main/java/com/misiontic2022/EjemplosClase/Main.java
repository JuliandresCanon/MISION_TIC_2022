/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic2022.ejemplosclase;

import java.util.Scanner;

/**
 *
 * @author TCI-JULIÁN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PagoMatricula();
        
        CompraComputadoras();
        
        Fruteria();
        
        Bosque();
        
    }

    public static void Bosque() {
        
        //El gobierno desea reforestar un bosque que mide determinado número de hectáreas.
        //Si la superficie del terreno excede a 1 millón de metros cuadrados, entonces
        //decidirá sembrar de la siguiente manera:
        
        //Porcentaje de la superficie del bosque 	Tipo de árbol
        //                 70%	                        Pino
        //                 20%	                       Oyamel
        //                 10%	                       Cedro 
        
        //Si la superficie del terreno es menor o igual a un millón de metros cuadrados, 
        //entonces decidirá sembrar de la siguiente Manera:
        
        //Porcentaje de la superficie del bosque  	Tipo de árbol
        //                 50%	                        Pino
        //                 30%	                       Oyamel
        //                 20%	                       Cedro
        
        //El gobierno desea saber el número de pinos, oyameles y cedros que tendrá que
        //sembrar en el bosque, si se sabe que en 10 metros cuadrados caben 8 pinos,
        //en 15 metros cuadrados caben 15 oyameles y en 18 metros cuadrados caben 10 cedros. 
        //También se sabe que una hectárea equivale a 10 mil metros cuadrados.
        
        Scanner bosque = new Scanner (System.in);
        System.out.println("Ingrese el area del bosque (ha): ");
        int area = bosque.nextInt();
        
        int area_m2 = area * 10000
        
        if (area_m2 > 1000000) 
        {
            
        }
        
        
    }

    public static void Fruteria() {
        
        //Una fruteria ofrece las manzanas con descuento según la siguiente tabla
        // No. kg comprados          Descuentos
        // 0.00 - 2.00                    0%
        // 2.01 - 5.00                   10%
        // 5.01 - 10.00                  15%
        // 10.01 en adelante             20%
        //Determinar cuanto pagara una persona que compre manzanas en esta fruteria 
        //El precio por kilo es de $5000
        Bosque();
        double cant = datos.nextDouble();
        
        double pago;
        
        int cant = computadora.nextInt();
        
        if(cant<5)
        {
            total = (cant * 985000 * 0.9);
        }
        
        else if (cant>=5 && cant<10)
        {
            total = (cant * 985000 * 0.8);
        }
        
        else
        {
            total = (cant * 985000 * 0.6);
        }
        
        
        
        
        
    }

    public static void CompraComputadoras() {
        
        //En una fabrica de computadoras se planea ofrecer a los clientes un descuento
        //que dependera del numero de computadoras que compre. Si las computadoras son
        //menos de cinco se les dar'a un 10% de descuento sobre el total de la compra;
        //si el numero de computadoras es mayor o igual a cinco pero menos de diez se
        //le otorga un 20% de descuento; y si son 10 o mas se les da un 40% del descuento.
        //El precio de cada computadora es de $985000
        
        
        //CLASE 3
        //Descuento Computadoras
        
        
        Scanner computadora = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de computadoras a comprar: ");
        double total;
        int cant = computadora.nextInt();
        
        if(cant<5);
        {
            total = (cant * 985000 * 0.9);
        }
        
        else if (cant>=5 && cant<10)
        {
            total = (cant * 985000 * 0.8);
        }
        
        else
        {
            total = (cant * 985000 * 0.6);
        }
        
        System.out.println("El total a pagar es: " + total);

    }

    public static void PagoMatricula() {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el nombre del Estudiante: ");
        String nombre = entrada.nextDouble();
        
        System.out.println("Digite la nota de la asignatura 1: ");
        double nota1 = entrada.nextDouble();
        
        System.out.println("Digite la nota de la asignatura 2: ");
        double nota2 = entrada.nextDouble();
        
        System.out.println("Digite la nota de la asignatura 3: ");
        double nota3 = entrada.nextDouble();
        
        System.out.println("Digite la nota de la asignatura 4: ");
        double nota4 = entrada.nextDouble();
        
        System.out.println("Digite la nota de la asignatura 5: ");
        double nota5 = entrada.nextDouble();
        
        double prom = ((nota1*0.15)+(nota2*0.30)+(nota3*0.25)+(nota4*0.10)+(nota5*0.20));
                
        System.out.println("Digite el valor de la matricula: ");
        double costo = entrada.nextDouble();
        
        
        System.out.println(nombre + " el valor a pagar de su matricula es: "+ matricula);
        
    }
    
}
