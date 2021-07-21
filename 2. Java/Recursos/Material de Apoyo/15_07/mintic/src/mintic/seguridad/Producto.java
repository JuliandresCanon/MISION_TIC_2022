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
public abstract class Producto {
    protected String talla, material, color;

    public Producto(String talla, String material, String color) {
        this.talla = talla;
        this.material = material;
        this.color = color;
    }

    
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
