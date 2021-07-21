package mintic;

/**
 *
 * @author farma
 */
class Carro {
    
    public double peso;
    public String color, modelo;
    
    public String info() {
        example();
        return color + ": "+ modelo+" - "+ peso;
    }
    public static String infoCarro(Carro maxda) {
        //String x = peso + " " +color;
        return maxda.color + ": "+ maxda.modelo+" - "+maxda.peso;
        //return maxda.info();
    }
    protected void example(){
        
    }
}
