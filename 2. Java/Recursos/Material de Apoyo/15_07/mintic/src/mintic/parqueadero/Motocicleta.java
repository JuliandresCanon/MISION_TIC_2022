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
public class Motocicleta extends Vehiculo{
    
    public Motocicleta(String marca, String matricula){
        this.marca = marca;
        this.matricula = matricula;
        tarifa = 1800;
    }
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}
