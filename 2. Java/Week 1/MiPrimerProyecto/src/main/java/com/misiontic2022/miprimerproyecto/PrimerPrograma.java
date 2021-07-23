package com.misiontic2022.miprimerproyecto;

import java.util.Scanner;
import java.lang.Math;

public class PrimerPrograma {

    public static void main(String[] args) {
        
    //  LecturaDatos();
    //  ParesImpares();
    //  Notas();
    //  CompraComputadoras();
    //  Fruteria();
        Bosque();
        
    }

    public static void LecturaDatos() {
    
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
    
    public static void ParesImpares() {
    
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese el número");
        int numero = ingreso.nextInt();
        
        if (numero%2 == 0) {
            double cuadrado = Math.pow(numero, 2);
            System.out.println("El número al cuadrado es: " + cuadrado);
        } else {
            double cubo = Math.pow(numero, 3);
            System.out.println("El número al cubo es: " + cubo);
        }
        
    }
    
    public static void Notas() {
    
        Scanner notas = new Scanner(System.in);
        
        System.out.println("Ingrese Nota 1");
        double nota1 = notas.nextDouble();
        System.out.println("Ingrese Nota 2");
        double nota2 = notas.nextDouble();
        System.out.println("Ingrese Nota 3");
        double nota3 = notas.nextDouble();
        System.out.println("Ingrese Nota 4");
        double nota4= notas.nextDouble();
        System.out.println("Ingrese Nota 5");
        double nota5 = notas.nextDouble();
        
        double promedio = nota1*0.15 + nota2*0.30 + nota3*0.25 + nota4*0.10 + nota5*0.20;
        System.out.println("El promedio del estudiante es: " + promedio);
        
        int costo = 1000000;
        
        if (promedio >= 4.5) {
            double pago = costo*0.70 + costo*0.0;
            System.out.println("El valor a pagar de Colegiatura es: $" + pago);
        } else {
            double pago = costo + costo*0.1;
            System.out.println("El valor a pagar de Colegiatura es: $" + pago);
        }
    }

    public static void CompraComputadoras() {
        
        //En una fabrica de computadoras se planea ofrecer a los clientes un descuento
        //que dependera del numero de computadoras que compre. Si las computadoras son
        //menos de cinco se les dar'a un 10% de descuento sobre el total de la compra;
        //si el numero de computadoras es mayor o igual a cinco pero menos de diez se
        //le otorga un 20% de descuento; y si son 10 o mas se les da un 40% del descuento.
        //El precio de cada computadora es de $985000
        
        Scanner computadora = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de computadoras a comprar: ");
        double total;
        int cant = computadora.nextInt();
        
        if(cant<5) {
            total = (cant * 985000 * 0.9);
        } else if (cant>=5 && cant<10) {
            total = (cant * 985000 * 0.8);
        } else {
            total = (cant * 985000 * 0.6);
        }
        
        System.out.println("El total a pagar es: $" + total);
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

        Scanner manzanas = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de manzanas a comprar (kg): ");
        double cant = manzanas.nextDouble();
        
        double total;
        
        if(cant<=2) {
            total = (cant*5000 - cant*5000*0.0);
        } else if (cant>2 && cant<=5) {
            total = (cant*5000 - cant*5000*0.1);
        } else if (cant>5 && cant<=10) {
            total = (cant*5000 - cant*5000*0.15);
        } else {
            total = (cant*5000 - cant*5000*0.20);
        }   
        
        System.out.println("El total a pagar es: $" + total);        
    }

    public static void Bosque() {
        
        //El gobierno desea reforestar un bosque que mide determinado número de hectáreas.
        //Si la superficie del terreno excede a 1 millón de metros cuadrados, entonces
        //decidirá sembrar de la siguiente manera:
        
        //Porcentaje de la superficie del bosque    Tipo de árbol
        //                 70%	                        Pino
        //                 20%	                       Oyamel
        //                 10%	                        Cedro 
        
        //Si la superficie del terreno es menor o igual a un millón de metros cuadrados, 
        //entonces decidirá sembrar de la siguiente Manera:
        
        //Porcentaje de la superficie del bosque     Tipo de árbol
        //                 50%	                        Pino
        //                 30%	                       Oyamel
        //                 20%	                        Cedro
        
        //El gobierno desea saber el número de pinos, oyameles y cedros que tendrá que
        //sembrar en el bosque, si se sabe que en 10 metros cuadrados caben 8 pinos,
        //en 15 metros cuadrados caben 15 oyameles y en 18 metros cuadrados caben 10 cedros. 
        //También se sabe que una hectárea equivale a 10 mil metros cuadrados.
        
        Scanner bosque = new Scanner(System.in);
        
        System.out.println("Ingrese el area del bosque (ha): ");
        int area = bosque.nextInt();
        
        int area_m2 = area * 10000;
        System.out.println("Area del bosque (m2): " + area_m2);
        
        int AreaPinos, AreaOyamel, AreaCedro;
        
        if (area_m2 > 1000000) {

            AreaPinos = (int) (area_m2*0.70);
            AreaOyamel = (int) (area_m2*0.20);
            AreaCedro = (int) (area_m2*0.10);

        } else {
            AreaPinos = (int) (area_m2*0.50);
            AreaOyamel = (int) (area_m2*0.30);
            AreaCedro = (int) (area_m2*0.20);
        }
        
        int CantPinos = AreaPinos * 8 / 10;
        int CantOyamel = AreaOyamel * 15 / 15;
        int CantCedro = AreaCedro * 10 / 18;
            
        System.out.println("Se deben sembrar " + CantPinos + " Pinos en el bosque");
        System.out.println("Se deben sembrar " + CantOyamel + " Oyameles en el bosque");
        System.out.println("Se deben sembrar " + CantCedro + " Cedros en el bosque");
        
    }
}
