/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.espadas;

/**
 *
 * @author farma
 */
public class Espada {
    private String material, medida, mango, color;
    private int filos;
    protected String sin;
    private String con;

    public Espada(String material, String medida, String mango, String color, int filos) {
        this.material = material;
        this.medida = medida;
        this.mango = mango;
        this.color = color;
        this.filos = filos;
    }
    //Espada spada = null;
    //Espada spada = new Espada();
//    public Espada() {
//        this.material = "NN";
//        this.medida = "1/2 metro";
//        this.mango = "piel";
//        this.color = "negro";
//        this.filos = 1;
//        System.out.println("Hola, soy Espada");
//    }

    public Espada(String material, String medida, int filos) {
        this.material = material;
        this.medida = medida;
        this.filos = filos;
        this.color = "negro";
        this.mango = "piel";
        System.out.println("Espada");
    }

    public String getSin() {
        return sin;
    }

    public void setSin(String sin) {
        this.sin = sin;
    }
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getMango() {
        return mango;
    }

    public void setMango(String mango) {
        this.mango = mango;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFilos() {
        return filos;
    }

    public void setFilos(int filos) {
        this.filos = filos;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }
    
    //atacar
    public float cortar(){
        System.out.println("Cortar desde Espada");
        return 1f;
    }
    
}
