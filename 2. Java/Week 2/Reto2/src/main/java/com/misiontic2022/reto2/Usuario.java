package com.misiontic2022.reto2;

// @author JuliandresCanon

public class Usuario {
    
    private String nombre;
    private String identificacion;
    private String correo;
    private int edad;
    private String area;
    private boolean jefe;

    public Usuario(String nombre, String identificacion, String correo, int edad, String area, boolean jefe) {
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
        
        if (this.jefe == true) {
            
            if (this.area == "desarrollo") {
                salario = 4500000 +2500000;
            } else if (this.area == "administrativa") {
                salario = 3500000 +3000000;
            }
       
        } else {

            if (this.area == "desarrollo") {
                salario = 4500000;
            } else if (this.area == "administrativa") {
                salario = 3500000;
            }
            
        }
        
        double nomina = 0;
        
        if (salario >=4*smmlv) {
            nomina = salario - (salario*0.09);
        } else {
            nomina = salario - (salario*0.08);           
        }
        
        System.out.println(this.nombre);
        System.out.println(this.identificacion);
        System.out.println(this.correo);
        System.out.println(this.edad);
        System.out.println(this.area);
        System.out.println(nomina);
        
    }
}
