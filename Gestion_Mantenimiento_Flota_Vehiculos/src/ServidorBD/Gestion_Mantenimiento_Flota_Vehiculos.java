package ServidorBD;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
        int puerto = 8888;
        int i = 0;
        //Abrimos el frame para conecta
        Conectar frame = new Conectar();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        try {

            ServerSocket server = new ServerSocket(puerto);

            while (true) {

                System.out.println("Esperant client...");
                Socket socket = server.accept();
                System.out.println("Client connectat" + i);
                i++;

            }
        } catch (IOException ex) {
            Logger.getLogger(Gestion_Mantenimiento_Flota_Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
