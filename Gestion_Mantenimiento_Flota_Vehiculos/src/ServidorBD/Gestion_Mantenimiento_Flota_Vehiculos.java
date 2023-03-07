
package ServidorBD;

import vistas.Conectar;

/**
 *
 * @author Ivan Sanchez Hernandez
 */
public class Gestion_Mantenimiento_Flota_Vehiculos {

 
    /**
     * @main principal para conectar base de datos por panel
     */
    public static void main(String[] args) {
             
        //dejamos comentado para hacer por panel JFrame
        //Conexion ObjetoConectar = new Conexion();
        //ObjetoConectar.establecerconexion();
        Conectar frame = new Conectar();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }
    
}
