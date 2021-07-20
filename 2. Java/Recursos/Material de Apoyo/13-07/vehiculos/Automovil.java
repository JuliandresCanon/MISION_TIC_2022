package mintic.vehiculos;

import javax.swing.text.View;

/**
 *
 * @author farma
 */
public class Automovil extends Combustion{
    private String year, fabricante;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getTipo() {
        return super.getTipo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setColor(String color) {
        super.setColor(color); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColor() {
        return super.getColor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EjemploClaseAbstract(String ejemplo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean pruebElectrico(Vehiculo vehiculo, Motocicleta motocicleta) {
        
        return true;
    }

    @Override
    public void testeoComponentes(String parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onClick(View view) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
