/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.tienda;

/**
 *
 * @author farma
 */
public class Producto {
    private String nombre, serial;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, String serial, double precio) {
        this.nombre = nombre;
        this.serial = serial;
        this.precio = precio;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " $"+ precio;
    }

    @Override
    public int hashCode() {
        return (int)precio + nombre.hashCode();// + 
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null )
            return false;
        if(getClass() != obj.getClass())
            return false;
        Producto other = (Producto)obj;
        if( nombre == null){
            if(other.nombre != null)
                return false;
            else if(precio != other.precio)
                return false;
        }else if(!nombre.equals(other.nombre))
            return false;
        else if(precio != other.precio)
            return false;
        
        return true; 
    }
    
    
    
    
}
