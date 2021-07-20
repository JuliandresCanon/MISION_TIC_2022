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
public class Conejo extends Animal{
    private double logDientePrinc;// \n

    public Conejo(double logDientePrinc) {
        this.logDientePrinc = logDientePrinc;
    }

    public double getLogDientePrinc() {
        return logDientePrinc;
    }

    public void setLogDientePrinc(double logDientePrinc) {
        this.logDientePrinc = logDientePrinc;
    }

    @Override
    public double getIMC() {
        return peso / Math.pow(altura, 2);
    }
    
    
}
