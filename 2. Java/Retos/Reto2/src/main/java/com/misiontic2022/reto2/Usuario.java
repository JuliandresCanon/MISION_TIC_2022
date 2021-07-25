package com.misiontic2022.reto2;

// @author JuliandresCanon

public class Usuario {
    
    private String nombre;
    private int identificacion;
    private String correo;
    private int edad;
    private String area;
    private boolean jefe;

    public Usuario(String nombre, int identificacion, String correo, int edad, String area, boolean jefe) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
        this.edad = edad;
        this.area = area;
        this.jefe = jefe;
    }
    
    public void info() {
        
        double salario = 0;
        double smmlv = 908526;
        
        switch (area) {
            case "desarrollo":
                if (jefe) {
                    salario = 4500000 + 2500000;
                } else {
                    salario = 4500000;
                }
            break;
            case "administrativa":
                if (jefe) {
                    salario = 3500000 + 3000000;
                } else {
                    salario = 3500000;
                }                
            break;
            default:
                System.out.println("Ingrese un área valida...");
            break;
        }
        
        /*
        if (this.jefe == true) {
            
            if (this.area == "desarrollo") {
                salario = 4500000 + 2500000;
            } else if (this.area == "administrativa") {
                salario = 3500000 + 3000000;
            }
       
        } else {

            if (this.area == "desarrollo") {
                salario = 4500000;
            } else if (this.area == "administrativa") {
                salario = 3500000;
            }
            
        }
        */

        double nomina = 0;
        
        if (salario >=4*smmlv) {
            nomina = salario - (salario*0.09);
        } else {
            nomina = salario - (salario*0.08);           
        }
        
        System.out.println("[Usuario]:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Identificacion: " + this.identificacion);
        System.out.println("Email: " + this.correo);
        System.out.println("Edad: " + this.edad);
        System.out.println("Area: " + this.area);
        System.out.println("Salario: " + nomina);
        
    }
}
