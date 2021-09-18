package Modelo;

// @author JuliandresCanon

import Controlador.Controlador;
import Vista.Vista;


public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Modelo MiModelo = new Modelo();
        Vista MiVista = new Vista();
        Controlador MiControlador = new Controlador();
        MiVista.setVisible(true);

        MiModelo.setVista(MiVista);
        MiModelo.setControlador(MiControlador);
        
        MiControlador.setModelo(MiModelo);
        MiControlador.setVista(MiVista);
        
        MiVista.setModelo(MiModelo);
        MiVista.setControlador(MiControlador);
        
    }
    
}
