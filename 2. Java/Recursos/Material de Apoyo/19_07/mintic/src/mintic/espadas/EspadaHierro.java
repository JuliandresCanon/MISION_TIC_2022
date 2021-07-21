/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.espadas;

/**
 *
 * @author farma
 */
public class EspadaHierro extends Espada {
    private int durabilidad;

    public EspadaHierro(String material, String medida, String mango, String color, int filos, int durabilidad) {
        super(material, medida, mango, color, filos);
        this.durabilidad = durabilidad;
    }

    public EspadaHierro(int durabilidad, String material, String medida, int filos) {
        super(material, medida, filos);
        this.durabilidad = durabilidad;
        System.out.println("Espada Hierro");
    }

    public EspadaHierro() {
        super("material", "medida", 1);
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }
    
    
    
}
