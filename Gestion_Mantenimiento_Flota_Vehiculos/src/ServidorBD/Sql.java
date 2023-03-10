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

    public String comprobarUsuario(String nombre, String dni) {
        Conexion cn = new Conexion();
        Connection con = cn.establecerConexion();
        Statement st;
        ResultSet rs;
        String categoria = "";

        try {
            st = (Statement) con.createStatement();
            //rs = st.executeQuery("SELECT categoria FROM public.empleados where UPPER(nombre)=UPPER("+nombre+")AND dni="+dni);
            rs = st.executeQuery("SELECT categoria\n"
                    + "FROM empleados\n"
                    + "WHERE UPPER (nombre) = UPPER ('"+nombre+"') AND dni = '"+dni+"'");

            if (rs.next()) {
                categoria = rs.getString("categoria");
                System.out.println("estoy en sql comprobar usuario" + rs);
            } else {
                System.out.println("No se encontro ningun empleado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return categoria;

    }

    public ResultSet verTodosVehiculos() {
        Conexion cn = new Conexion();
        Connection con = cn.establecerConexion();
        Statement st;
        ResultSet rs = null;

        try {
            st = (Statement) con.createStatement();
            rs = st.executeQuery("SELECT * FROM vehiculos");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;

    }

}
