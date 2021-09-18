package Controlador;

// @author JuliandresCanon

import Modelo.Modelo;
import Modelo.Producto;
import Vista.Vista;


public class Controlador {
    
    private Modelo MiModelo;
    private Vista MiVista;
    private Producto MiProducto;

    public void setModelo(Modelo MiModelo) {
        this.MiModelo = MiModelo;
    }

    public void setVista(Vista MiVista) {
        this.MiVista = MiVista;
    }

    public void setProducto(Producto MiProducto) {
        this.MiProducto = MiProducto;
    }
    
       
    public Object CrearProducto(String nombre, int cantidad, String categoria, double precio) {
        
        Producto producto1 = new Producto(nombre, cantidad, categoria, precio);
        
        MiModelo.GuardarProducto(producto1);
        
        return producto1;
    }
    
}
