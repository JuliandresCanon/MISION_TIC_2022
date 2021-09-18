/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

// @author JuliandresCanon

import LogicaPrograma.LogicaPrograma;
import Vistas.Ventana1;


public class Controlador {

    private Ventana1 MiVentana;
    private LogicaPrograma MiLogica;
    
    public void setVentana1(Ventana1 MiVentana) {
        
        this.MiVentana = MiVentana;
        
        
    }
    
    public void setLogicaPrograma(LogicaPrograma MiLogica) {
        
        this.MiLogica = MiLogica;
        
        
    }

    public int SumarNumeros(String numero1, String numero2) {
        
        return (MiLogica.SumarNumeros(numero1, numero2));
        
    }
    
}
