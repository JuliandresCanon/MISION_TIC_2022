package mintic.vehiculos;

import javax.swing.text.View;

/**
 *
 * @author farma
 */
public interface IElectrico {
    public static final String NOMBRE_ELECTRICO = "VALOR_DEFINIDO";
    boolean pruebElectrico(Vehiculo vehiculo, Motocicleta motocicleta);
    void testeoComponentes(String parametro);
    void onClick(View view);
    
}
