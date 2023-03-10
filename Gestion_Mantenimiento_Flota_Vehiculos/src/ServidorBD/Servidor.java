package ServidorBD;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vistas.PantallaInicilAdmin;
import vistas.VistaUsuarios;

/**
 *
 * @author Ivan Sanchez Hernandez
 */
public class Servidor {

    /**
     * @main principal para conectar base de datos por panel
     */
    public static void main(String[] args) {
        int puerto = 8888;
        int i = 0;

        //Abrimos el frame para conecta
        VistaUsuarios frame = new VistaUsuarios();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        try {

            ServerSocket server = new ServerSocket(puerto);

            while (true) {

                System.out.println("Esperant client...");
                Socket socket = server.accept();
                System.out.println("Client connectat" + i);
                i++;
                JOptionPane.showMessageDialog(null, "La Conexión se realizo exitosamente con la Base de Datos");

            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
