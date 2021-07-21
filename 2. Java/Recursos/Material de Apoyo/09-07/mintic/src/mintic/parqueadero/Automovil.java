package mintic.parqueadero;

/**
 *
 * @author farma
 */
public class Automovil extends Vehiculo{

    public  Automovil(String marca, String matricula){
        this.marca = marca;
        this.matricula = matricula;
        tarifa = 3000;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
//    public void setMarca(String marca){
//        this.marca = marca;
//    }
//    public String getMarca(){
//        return marca;
//    }
    public String getMatricula(){
        return matricula;
    }
    //amd = "";
    //sout(amd)
} 
