package com.misiontic2022.semana3;

// @author JuliandresCanon

public class Banco {
    
    private String nombre;
    private Empleado empleado[];

    public Banco(String nombre, Empleado[] empleado) {
        this.nombre = nombre;
        this.empleado = empleado;
    }
    
    public void EmpleadoNuevo(Empleado NuevoEmpleado, int indice) {
        
        this.empleado[indice] = NuevoEmpleado;
        System.out.println("¡Empleado agregado Exitosamente!");
    }
       
}
