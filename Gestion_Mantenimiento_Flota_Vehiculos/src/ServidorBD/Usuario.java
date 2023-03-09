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
import vistas.Conectar;
import vistas.VistaUsuarios;

/**
 *
 * @author Ivimar
 */
public class Usuario {

    private static final String USUARIO_ADMIN = "admin";
    private static final String PASSWORD_ADMIN = "admin";
    private static final String USUARIO = "usuario";
    private static final String PASSWORD = "usuario";
    private static final String HOST = "localhost";
    private static final int PUERTO = 8888;

    public Usuario() {
    }

    public String comprobarUsuario(String usuario, String passw) {
        String user = "";
        boolean control = false;

        if (usuario.equalsIgnoreCase(USUARIO_ADMIN) && passw.equalsIgnoreCase(PASSWORD_ADMIN)) {
            return user = "admin";
        } else if (usuario.equalsIgnoreCase(USUARIO) && passw.equalsIgnoreCase(PASSWORD)) {
            return user = "user";
        } else {
            JOptionPane.showMessageDialog(null, "El Usuario o password es Incorrecto" + JOptionPane.ERROR_MESSAGE );
        }
        return null;
    }

    public void usuarioSocket() {
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
            Conectar frame = new Conectar();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos, error:" + e, "conexión", JOptionPane.ERROR_MESSAGE);
        }

    }

}
