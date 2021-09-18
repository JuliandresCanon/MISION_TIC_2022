package Modelo;

// @author JuliandresCanon

import Controlador.Controlador;
import Vista.Vista;
import java.util.ArrayList;


public class Modelo {
    
    private ArrayList <Producto> ListaProductos;
    private Controlador MiControlador;
    private Vista MiVista;
    
    public Modelo() {
        this.ListaProductos = new ArrayList<Producto>();
    }
    
    public void setControlador(Controlador MiControlador) {
        this.MiControlador = MiControlador;
    }

    public void setVista(Vista MiVista) {
        this.MiVista = MiVista;
    }
    
    public void GuardarProducto(Producto producto1) {
        
        this.ListaProductos.add(producto1);
        System.out.println(ListaProductos);
        
    }

}
