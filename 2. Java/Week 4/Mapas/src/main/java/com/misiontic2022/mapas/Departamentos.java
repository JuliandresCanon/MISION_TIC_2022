package com.misiontic2022.mapas;

// @author JuliandresCanon

public class Departamentos {
     
    public String departamento, capital;
    
        public Departamentos(String departamento, String capital) {
            this.departamento = departamento;
            this.capital = capital;
        }
        
        public String getDepartamento() {
            return departamento;
        }
        
        public void setDepartamento (String departamento) {
            this.departamento = departamento;
        }
        
        public String getCapital() {
            return capital;
        }
        
        public void setCapital(String capital) {
            this.capital = capital;
        }
        
        @Override
        public String toString(){
            return "-> departamento: " + departamento + ", capital: " + capital ;
        }
        
}
