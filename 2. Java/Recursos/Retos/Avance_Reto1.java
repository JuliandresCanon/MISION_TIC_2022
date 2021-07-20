import java.util.Arrays;

public class POS {
    Object [][] articulos = new Object [][] {};
    /*
        (variable "articulos")
        OBJETIVO:   Almacenar los articulos que se desean facturar para un cliente individual.
        FORMATO:
            articulos = [
                [nombre_articulo1, cantidad1],
                [nombre_articulo2, cantidad2],
                .
                .
                .
            ]

        Ejemplo:
            articulos = [
                ["Honey", 3],
                ["Negra", 2]
            ]
     */
    int [] ventas = new int[] {};
    /*
        (variable "ventas")
        OBJETIVO:   Almacenar el total de cada venta individual
        FORMATO:
            ventas = [
                total1,
                total2,
                .
                .
                .
            ]

        Ejemplo:
            ventas = [
                49000,  //Equivalente al total de las 3 Honey y las 2 Negra
                .
                .
                .
            ]
     */
    Object [][] productos = new Object [][] {
        {"Honey", 10000},
        {"Malta", 8000},
        {"Negra", 9500}
    };

    public void Factura() {
        String mensaje = "\t\tFACTURA\n";
        mensaje += "Articulo\t\t\tCantidad\t\t\t\t\tValor unitario\t\t\tValor total\n";
        int total = 0;  //Valor total de la venta individual
        //---Tu desarrollo (debes emplear la variable "articulos")--
        /*
        articulos = [
                [nombre_articulo1, cantidad1],  [Object, Object]
                [nombre_articulo2, cantidad2],
                .
                .
                .
            ]
        */
        for (Object [] articulo: articulos) {
            //Informacion usuario
            String nombre = (String)(articulo[0]);
            int cantidad = (int)(articulo[1]);
            
            //Valor unitario
            int valor_unitario = 0;
            for (Object [] producto: productos) {
                String nombre_cerveza = (String)(producto[0]);
                if (nombre.equals(nombre_cerveza)) {
                    valor_unitario = (int)(producto[1]);
                }
            }
            
            //Valor total
            int valor_total = valor_unitario*cantidad;
            total = total + valor_total;
            
            //Mensaje
            mensaje += nombre + "\t\t\t" + cantidad + "\t\t\t\t\t" + valor_unitario + "\t\t\t" + valor_total + "\n";
        }

        mensaje += "TOTAL = " + total;
        System.out.println(mensaje);
        this.nuevaVenta(total);  //Registro de la venta
    }

    public void ResumenVentas() {
        int total = 0;
        //----Calcula el valor total (debes emplear la variable "ventas")----
        for (int venta: ventas ) {
         System.out.println("El valor de la venta fue: " + venta);   
        }

        String mensaje = "El resumen de ventas del dia de hoy es: $" + total;
        System.out.println(mensaje);
    }

    public void nuevoProducto(String art, int cant) {
        articulos = Arrays.copyOf(articulos, articulos.length+1) ;
        articulos[articulos.length-1] = new Object[] {art, cant};
    }

    public void nuevaVenta(int total) {
        ventas = Arrays.copyOf(ventas, ventas.length+1);
        ventas[ventas.length-1] = total;
    }
}
