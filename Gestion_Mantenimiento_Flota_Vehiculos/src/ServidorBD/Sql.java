/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServidorBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivimar
 */
public class Sql {

    public Sql() {
    }
    
      public ResultSet VerTodosVehiculos (){
        Conexion cn = new Conexion();
        Connection con = cn.establecerConexion();
        Statement st;
        ResultSet rs = null;
        
        try {
            st= (Statement) con.createStatement();
            rs= st.executeQuery("SELECT * FROM vehiculos");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
        return rs;
        
    }
    
}
