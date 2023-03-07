/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServidorBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivimar
 */
public class Conexion {

    public Conexion() {
    }

    Connection conectar = null;

    String usuario = "postgres";
    String password = "isanchez";
    String db = "GestionMantenimientoFlotaVehiculo";
    String ip = "127.0.0.1";
    String puerto = "5432";

    String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + db;

    public Connection establecerconexion() {

        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, password);
            JOptionPane.showMessageDialog(null, "La Conexión se realizo exitosamente con la Base de Datos");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos, error:"+e,"conexión",JOptionPane.ERROR_MESSAGE);
        }

        return conectar;
    }

    public void cerrarConexion() {
        try {
            conectar.close();
            JOptionPane.showMessageDialog(null, "La Desconexión se realizo exitosamente con la Base de Datos");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al Desconectar con la Base de Datos, error:"+ex,"conexión",JOptionPane.ERROR_MESSAGE);
        }

    }
    
}
