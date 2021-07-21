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
public class EspadaReforzada extends EspadaHierro{

    public EspadaReforzada(int durabilidad, String material, String medida, int filos) {
        super(durabilidad, material, medida, filos);
        System.out.println("Reforzada!!!");
    }

   

    
    @Override
    public float cortar() {
        return 5f;
    }

    @Override
    public int getDurabilidad() {
        return super.getDurabilidad() + 10;
    }
    
    
    
}
