/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServidorBD;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import vistas.PantallaInicilAdmin;
import vistas.VistaUsuarios;

/**
 *
 * @author Ivimar
 */
public class Usuario {

    private static final String USUARIO_ADMIN = "rrhh";
    private static final String USUARIO = "conductor";
    private static final String HOST = "localhost";
    private static final int PUERTO = 8888;

    public Usuario() {
    }

    public String comprobarUsuario(String nombre, String passw) {
        String nom = nombre;
        String dni = passw;
        String usuario;
        boolean control = false;
        
        Sql sql = new Sql();
        usuario = sql.comprobarUsuario(nom, dni);

        if (usuario.equalsIgnoreCase(USUARIO_ADMIN)) {
            usuarioSocket(usuario);
            return  usuario;
            
        } else if (usuario.equalsIgnoreCase(USUARIO)) {
            usuarioSocket(usuario);
            return usuario;
        } else {
            JOptionPane.showMessageDialog(null, "El Usuario o password es Incorrecto" + JOptionPane.ERROR_MESSAGE );
        }
        return usuario;
    }

    public void usuarioSocket(String usuario) {
        //Variables paracomunicar con el servidor
        PrintWriter escriptor;
        BufferedReader lector;

        try {

            Socket sck = new Socket(HOST, PUERTO);
            //escrivimos al servidor que nos hemos conectado
            escriptor = new PrintWriter(sck.getOutputStream(), true);
            //Leemosdel servidor
            //lector = new BufferedReader(new InputStreamReader(sck.getInputStream()));
            //Abrimos el frame para conecta
            PantallaInicilAdmin frame = new PantallaInicilAdmin();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos, error:" + e, "conexión", JOptionPane.ERROR_MESSAGE);
        }

    }

}
