package LogicaPrograma;

import Controlador.Controlador;

// @author JuliandresCanon

public class LogicaPrograma {

    private Controlador MiControl;
    
    public int SumarNumeros(String numero1, String numero2) {
        
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int resultado = num1 + num2;
        return resultado;
    }
    
    public void setControlador(Controlador MiControl) {
        
        this.MiControl = MiControl;
        
    }

}
