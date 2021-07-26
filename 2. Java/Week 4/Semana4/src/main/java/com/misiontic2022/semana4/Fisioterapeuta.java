package com.misiontic2022.semana4;

// @author JuliandresCanon

public class Fisioterapeuta extends SeleccionFutbol{
    
    private String Titulacion;
    private int AnioExp;

    public Fisioterapeuta(String Titulacion, int AnioExp, String Nombre, String Apellido, int ID, int Edad) {
        super(Nombre, Apellido, ID, Edad);
        this.Titulacion = Titulacion;
        this.AnioExp = AnioExp;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public int getAnioExp() {
        return AnioExp;
    }

    public void setAnioExp(int AnioExp) {
        this.AnioExp = AnioExp;
    }
    
    public void DarTerapia() {
        System.out.println("DarTerapia");
    }
    
    @Override
    public void PartidoFutbol() {
        System.out.println("PartidoFutbol * Fisioterapeuta");
    }
    
}
