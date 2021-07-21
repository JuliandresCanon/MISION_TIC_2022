/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.seguridad;

/**
 *
 * @author farma
 */
public class OverolConvencional extends Overol{
    //Dril, impermeable, antifluido
    public OverolConvencional(Tallas talla, Opciones material, String color) {
        super(talla.toString(), material.toString(), color);
//        String a = 1 > 2 && 3 > 4 ? "true" : 2 == 2 ? "false" : "false";
//        if(1> 2)
//            a = "true";
//        else
//            if(2 > 3 )
//                a = "false";
//            else 
//                a = "false";
    }
    /**
     * @param talla la talla de la prenda
     * @param material 0- Dril -  1- Impermeable - 2- Antifluido
     * 
    */
    public OverolConvencional(String talla, int material, String color) {
        //super(talla, material == 0 ? "Dril":material == 1 ? "Impermeable" : "Antifluido" , color);
        super(talla, material == 0 ? "Dril": material == 1 ? "Impermeable" : "Antifluido" , color);
        
        String valor = "";
        switch(material){
            case 0:
                valor = "Dril";
            break;
            case 1:
                valor = "Impermeable";
            break;
            case 2:
                valor = "Antifluido";
            break;
        }
        //
    }
    public enum Opciones{
        Dril,
        Impermeable,
        Antifluido
    }
    
    public enum Tallas{
       M,
       XL,
       XXL,
       L,
       S,
       SM
    }
    
    
    
}
