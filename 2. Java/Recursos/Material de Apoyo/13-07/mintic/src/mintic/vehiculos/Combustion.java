package mintic.vehiculos;

/**
 *
 * @author farma
 */
public abstract class Combustion extends Vehiculo implements IElectrico{
    private String tipo_combustible;

    abstract public void EjemploClaseAbstract(String ejemplo);
    
    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }
    
    
}
