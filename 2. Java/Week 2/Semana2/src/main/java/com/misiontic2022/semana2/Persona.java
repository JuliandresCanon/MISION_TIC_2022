package com.misiontic2022.semana2;

// @author JuliandresCanon

public class Persona {
    
    private String nombre;
    private int edad;
    private int ID;
    private String sexo = "H";
    private double peso;
    private double altura;
    private double IMC;

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    
    public double calcularIMC() {
        
        double IMC = peso/(altura*altura);
        
        if (IMC<20) {
            IMC = -1;
            
        } else if (IMC>=20 && IMC<=25) {
            IMC = 0;
            
        } else {
            IMC = 1;
        }
        
        return IMC;
    }
    
    public boolean esMayorDeEdad() {
        
        if (edad>=18) {
            return true;
        } else {
            return false;
        }

    }
    
    public String comprobarSexo() {
        
        if (sexo != "H" || sexo != "M") {
            sexo = "H";
        }
        return sexo;
    }
    
    public String toString(){
         //devuelve toda la información del objeto.   
     
         String All =(nombre +"\n"+ edad +"\n"+ ID +"\n"+ comprobarSexo() +"\n"+ peso +"\n"+ altura +"\n"+ calcularIMC());
                  
         return All;
    }     
}
