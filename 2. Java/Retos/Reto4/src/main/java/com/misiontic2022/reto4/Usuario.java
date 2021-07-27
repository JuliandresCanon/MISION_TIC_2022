package com.misiontic2022.reto4;

// @author JuliandresCanon

import java.util.ArrayList;
import java.util.Collections;

public class Usuario {

    private ArrayList<String> telefonos;

    public Usuario() {
        telefonos = new ArrayList<>();
    }
    
// Crear los métodos para agregar y listar usuarios
        
    void addTelefono(String telefono) {
        if (telefonos.indexOf(telefono) == -1) {
            telefonos.add(telefono);
        }
    }
    
    void mostrarTelefonos() {
        
        Collections.sort(telefonos);
        System.out.println(telefonos);
        
    }

}    
