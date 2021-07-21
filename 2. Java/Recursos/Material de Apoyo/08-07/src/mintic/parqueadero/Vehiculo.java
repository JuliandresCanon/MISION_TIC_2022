/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.parqueadero;

/**
 *
 * @author farma
 */
//super class
public class Vehiculo {
    String matricula, marca;
    int tarifa;
    
    public int getTarifa(){
        return tarifa;
    }
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
}
