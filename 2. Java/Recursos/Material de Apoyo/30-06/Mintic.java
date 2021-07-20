package mintic;

/**
 *
 * @author Adrian Ruiz
 */
public class Mintic {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
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
    
}
