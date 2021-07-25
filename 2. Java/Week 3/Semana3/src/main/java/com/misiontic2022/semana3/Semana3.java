package com.misiontic2022.semana3;

// @author JuliandresCanon

public class Semana3 {

    public static void main(String[] args) {
        
        Banco();
        
        
    }
    
    public static void Banco() {
                
        Empleado emp1 = new Empleado("Jorge", "Macías");
        Empleado emp2 = new Empleado("Ángela", "Cucalón");
        Empleado emp3 = new Empleado("Irma", "Caceres");
        Empleado emp4 = new Empleado("Julián", "Socarras");
        
        // Array que almacena hasta 200 empleados
        
        Empleado ListaEmpleados[] = new Empleado[4];
        ListaEmpleados[0] = emp1;
        ListaEmpleados[1] = emp2;
        
        Banco MiBanco= new Banco("Bancolombia", ListaEmpleados);
            
            MiBanco.EmpleadoNuevo(emp3, 2);
            MiBanco.EmpleadoNuevo(emp4, 3);
            
            int cont=0;
            System.out.println("LISTA DE EMPLEADOS");
            
            while (cont<ListaEmpleados.length) {
                System.out.println(ListaEmpleados[cont].getNombre()+" "+ListaEmpleados[cont].getApellido());
                
                cont+=1;
            }
        
    }
    
}
