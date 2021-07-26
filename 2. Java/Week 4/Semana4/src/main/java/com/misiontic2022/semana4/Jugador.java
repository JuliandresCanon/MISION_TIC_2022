package com.misiontic2022.semana4;

// @author JuliandresCanon

public class Jugador extends SeleccionFutbol{
    
    private int numero;
    private String posicion;

    public Jugador(int numero, String posicion, String Nombre, String Apellido, int ID, int Edad) {
        super(Nombre, Apellido, ID, Edad);
        this.numero = numero;
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public void Entrevista() {
        System.out.println("Entrevista");
    }
    
    
    //Marca el metodo como un metodo de sobreescritura. Ya que en la superclase existe el metodo con el mismo nombre.
    @Override
    public void Entrenamiento() {
        System.out.println("Entrenamiento * Clase Jugador");
    }    
}
