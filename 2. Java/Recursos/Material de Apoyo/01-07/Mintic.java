package mintic;

import java.util.Scanner;



/**
 *
 * @author Adrian Ruiz
 */
public class Mintic {
    
    public static void main1(String[] args) {
        //Tipos de datos en Java
        //primitivos
        long x = 20l;
        int cantidad = 2; int edad = 20;
        short medio = 123; byte n = 4;
        double valor1 = 18000.50d, valor2 = 2500;
        float menor = (float) 2500.0d;
        boolean flag = false;
        
        //Complejos
        String cantidad2 = "3";
        String nombre1 = "Pedro", nombre2 = "Pedro ";
        
        
        //Mensajes de salida
        
        System.out.println("Total :" + cantidad * valor1);
        
        //Operadores logicos
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        
        System.out.println(!false);
        System.out.println(!true);
        boolean vida = true;
        System.out.println(!vida);
        System.out.println(vida);
        
        //Operadores relacionales
        //Forma recomendada para comparar igualdad entre Strings
        System.out.println(!nombre1.equals(nombre2));
        //No se recomienda
        System.out.println(nombre1 != nombre2);
        
        System.out.println(edad > 20);
        System.out.println(edad >= 20);
        System.out.println(edad < 20);
        System.out.println(edad <= 20);
        System.out.println(edad != 20);
        
        //Operadores matematicos
        System.out.println(edad);
        System.out.println(edad++);
        System.out.println(edad);
        System.out.println(++edad);
        System.out.println(edad);
        
        System.out.println("Total: " + cantidad * valor1);
        System.out.println("Total: " + cantidad / valor1);
        System.out.println("Total: " + cantidad % valor1);
        System.out.println("Total: " + (cantidad + valor1));
        
        //Operadores de asignacion
        
        edad = edad + 19;
        edad += 19;
        System.out.println(edad);
        
        
        //Estructura condicional si-no
        if(edad > 20){
            //...
        }else if(true){
            //...
        }else{
            //...
        }
        //python
        //if a > b :
        //    print("")
        
        
        //Estructuras repetitivas, ciclos o bucles
        for(int a =0; a< 10;a++){
            //..
        }
        
        for(int numero : new Integer[]{1,2,3}){
            //..
        }
        
        while(edad > 10){
            //..
        }
        
        do{
            //..
        }while (true);       

    }
    
    public static void main2(String[] args) {
        
//        if(true && true || true || !true){
//            
//        }
//        
//        if(true){
//            
//        }else{
//            
//        }
//        
//        if(true){
//            
//        }else if(true){
//            
//        }else if(true){
//            
//        }else{
//            
//        }
        int a = 3, b = 3;
        if(a > b){
          System.out.println("a es mayor que b");
        }else if(b > a){
            System.out.println("b es mayor que a");
        }else{
            //pass
        }
        /**
         Programa que solicite 3 números los muestre en pantalla y definir cuál es el número mayor
          y el número menor.
         */
        //double valores = new Scanner(System.in).nextDouble();
        //int a = 3, b = 3;
        Scanner cmd =  new Scanner(System.in);
        System.out.println("Ingrese los valores para el numero 1");
        a = cmd.nextInt(); 
        System.out.println("Ingrese los valores para el numero 2");
        b = cmd.nextInt();
        System.out.println("Ingrese los valores para el numero 3");
        int c = cmd.nextInt();
        
        //Double
        cmd.nextDouble();
        //Float
        cmd.nextFloat();
        //String
        cmd.nextLine();
        
        
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        
        if(a > b && a > c){
            System.out.println("a = "+a+" es mayor");
            if(b > c){
                System.out.println("c = "+c+" es menor");
            }else{
                System.out.println("b = "+b+" es menor");
            }
        }else if(b > c && b > a){
            System.out.println("b = "+b+" es mayor");
            if(a > c){
                System.out.println("c = "+c+" es menor");
            }else{
                System.out.println("a = "+a+" es menor");
            }
        }else{
            System.out.println("c = "+c+" es mayor");
            if(b > a){
                System.out.println("a = "+a+" es menor");
            }else{
                System.out.println("b = "+b+" es menor");
            }
        }
        
    }
    
    static double impuesto(int precioBase){
        double iva = 0;
        if(precioBase > 150000){
            iva = precioBase * 0.19;
        }else{
            iva = precioBase * 0.16;
        }
        return iva;
    }
    
    public static void main(String[] args) {
        /**
         Programa que lea un valor de precio base y calcule su impuesto, si es valor es mayor de
         150.000 se le aplicará un 19% de impuestos, en caso contrario se le aplicará un 16%.
         */
        Scanner cmd = new Scanner(System.in);
//        int b = 10, index = 0;
//        for(b = 0; b < 10; b++){
//            index = b;
//        }
//        int a = 12;
        //int can = 0;
        while(true){
            //can++;
            System.out.println("Menu:\n1 -> Calcular impuesto\n2 -> Salir");
            int opc = cmd.nextInt();
            
            if(opc == 1){
                System.out.println("Ingrese el valor base: ");
                int precioBase = cmd.nextInt();
                System.out.println("El valor del iva es de: "+ impuesto(precioBase));
            }else{
                break;
            } 
//            for(String palabra : new String[]{"Hola","tripulantes"}){
//                
//            
//            }
        }
        
        do{
            System.out.println("Menu:\n1 -> Calcular impuesto\n2 -> Salir");
            int opc = cmd.nextInt();
            
            if(opc == 1){
                System.out.println("Ingrese el valor base: ");
                int precioBase = cmd.nextInt();

                System.out.println("El valor del iva es de: "+impuesto(precioBase));
            }else{
                break;
            } 
        }while(true);
        
        
        //double e = Math.E;
        //return 0;
    }
    
}
