/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.prueba3;

/**
 *
 * @author farma
 */
public abstract class Animal {
    protected double peso, altura;
    protected Alimento[] alimsIngeridos;

    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Alimento[] getAlimsIngeridos() {
        return alimsIngeridos;
    }

    public void setAlimsIngeridos(Alimento[] alimsIngeridos) {
        this.alimsIngeridos = alimsIngeridos;
    }
    
//    public double getIMC(){
//        return peso / Math.pow(altura, 2);
//    }
    
    public abstract double getIMC();
    
    
}
