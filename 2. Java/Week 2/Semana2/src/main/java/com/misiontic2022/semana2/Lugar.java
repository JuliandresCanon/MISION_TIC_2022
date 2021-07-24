package com.misiontic2022.semana2;

// @author JuliandresCanon

public class Lugar {
    
    private String nombre;
    private String direccion;
    private int telefono;
    private String url;
    private String comentario;
    private double valoracion;

    public Lugar(String nombre, String direccion, int telefono, String url, String comentario, double valoracion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.url = url;
        this.comentario = comentario;
        this.valoracion = valoracion;
    }
    
    public void DatosLugar() {
        
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Website: " + this.url);
        System.out.println("Comentario: " + this.comentario);
        System.out.println("Calificación: " + this.valoracion);
        
    }
    
}
