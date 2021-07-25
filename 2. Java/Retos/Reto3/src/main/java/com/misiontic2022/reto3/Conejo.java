package com.misiontic2022.reto3;

// @author JuliandresCanon

public class Conejo extends Animal{
    
    private double longDientePrinc;

    public Conejo(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getLongDientePrinc() {
        return longDientePrinc;
    }

    public void setLongDientePrinc(double longDientePrinc) {
        this.longDientePrinc = longDientePrinc;
    }
    
}
