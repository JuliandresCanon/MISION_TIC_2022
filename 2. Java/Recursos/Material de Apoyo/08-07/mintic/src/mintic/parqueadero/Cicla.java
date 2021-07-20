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
public class Cicla extends Vehiculo{
    
    public Cicla(String marca, String serial){
        this.marca = marca;
        this.matricula = serial;
        tarifa = 500;
    }
    public String getSerial(){
        return matricula;
    }
    public void setSerial(String serial){
        matricula = serial;
    }
}
