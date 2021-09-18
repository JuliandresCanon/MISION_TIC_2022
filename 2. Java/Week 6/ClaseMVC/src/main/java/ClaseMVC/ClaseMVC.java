package ClaseMVC;

import Controlador.Controlador;
import LogicaPrograma.LogicaPrograma;
import Vistas.Ventana1;

// @author JuliandresCanon

public class ClaseMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ventana1 MiVentana = new Ventana1();
        LogicaPrograma MiLogica = new LogicaPrograma();
        Controlador MiControl = new Controlador();
        
        MiVentana.setControlador(MiControl);
        MiLogica.setControlador(MiControl);
        
        MiControl.setVentana1(MiVentana);
        MiControl.setLogicaPrograma(MiLogica);
        
        MiVentana.setVisible(true);
    }
    
}
