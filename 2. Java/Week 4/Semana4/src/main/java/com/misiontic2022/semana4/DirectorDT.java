package com.misiontic2022.semana4;

// @author JuliandresCanon

public class DirectorDT extends SeleccionFutbol{
    
    private String IdFcf;

    public DirectorDT(String IdFcf, String Nombre, String Apellido, int ID, int Edad) {
        super(Nombre, Apellido, ID, Edad);
        this.IdFcf = IdFcf;
    }

    public String getIdFcf() {
        return IdFcf;
    }

    public void setIdFcf(String IdFcf) {
        this.IdFcf = IdFcf;
    }
    
    public void PlanificarPartido() {
        System.out.println("Planificar Partido");
    }
    
    @Override
    public void Entrenamiento() {
        System.out.println("Entrenamiento * Clase DirectorDT");
    }

    public void PartidoFutbol() {
        System.out.println("PartidoFutbol * Clase DirectorDT");
    }
}
