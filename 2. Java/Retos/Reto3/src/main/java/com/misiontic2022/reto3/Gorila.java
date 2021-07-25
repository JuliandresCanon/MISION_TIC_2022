package com.misiontic2022.reto3;

// @author JuliandresCanon

public class Gorila extends Animal{
    
    public Gorila(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        this.alimsIngeridos = alimsIngeridos;
    }

    public double getPesoAlims() {
        
        int i;
        double pesoAlims = 0;
        
        for (i=0; i<this.alimsIngeridos.length; i++) {
            pesoAlims += this.alimsIngeridos[i].getGramos();
        }
        
        return pesoAlims;
    }
           
    public double getIMC() {
        double IMC = (this.peso+(getPesoAlims()/1000))/(altura*altura);
        return IMC;
    }
}
