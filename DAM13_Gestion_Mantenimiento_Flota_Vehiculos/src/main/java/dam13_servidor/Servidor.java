/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package dam13_servidor;

import dam13_control.ControlRespuestas;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivimar
 */
public class Servidor {
    private static String file = "C:\\Users\\i\\Documents\\NetBeansProjects\\swing\\Prueba.txt";
    
    public static void main(String[] args) {
        Servidor rn = new Servidor();
        try {
            rn.initialize(8180, file, true);
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //public static void main(String[] args) {
    
    private PrintStream logFile;
    private int puerto = 8180;
    private final String COMMUNICATIONS_LOG = "COMMUNICATIONS LOG";
    private final String INPUT_OUTPUT_ERROR = "Input/Output error";

    // For generate the log
    public final String CLIENT_MESSAGE = "CLI:";
    public final String SERVER_RESPONSE = "SRV:";
    public static final String COMMENT = "COM:";

    // is message time logged?
    private boolean logTime = true;

    private int threadCount = 0;

    

    // server thread
    private class RunnableListener implements Runnable {

        private volatile boolean running = false; // read only property
        private ServerSocket sk = null;

        /**
         * Stops server: closes socket used by run method and sets running
         * property to false to end run method execution
         */
        public void shutdown() {
            if (sk != null && !sk.isClosed()) try {
                sk.close();
                logFile.close();
            } catch (IOException ex) {

            } finally {
                running = false;
                ControlRespuestas.resetServerData();
            }
        }

        /**
         * gets running property value
         *
         * @return running property value
         */
        public boolean isRunning() {
            return running;
        }

        /**
         * Starts server. Server runs until shutdwon method is called. Sets
         * running property to true
         */
        @Override
        public synchronized void run() {
            try {
                running = true;

                sk = new ServerSocket(puerto);

                while (running) {
                    Socket client = sk.accept();

                    BufferedReader input = new BufferedReader(
                            new InputStreamReader(client.getInputStream()));

                    String data = input.readLine();

                    if (logTime) {
                        logFile.println(COMMENT + thisMoment() + "\n");
                    }
                    logFile.println(CLIENT_MESSAGE + "\n" + data + "\n");
                    replay(client, data);  // sends response to client in a new thread and, in this way, continues listening clients

                }
            } catch (IOException e) {
                if (sk != null && !sk.isClosed()) {
                    showIOErrorInformation(e, logFile); // if sk.isClosed can be a "Server stop" operation
                }
            }
        }
    }

    private RunnableListener listener = new RunnableListener();

    /**
     * Creaadas en el servidor
     *
     * @param port port to listen
     * @param logFile file with execution result
     * @throws java.io.IOException if an I/O error occurs
     * @throws Error if files don't have a good structure
     */
    public void initialize(int puerto, String logFile, boolean logTime) throws IOException {

        String log = logFile.trim();
        this.puerto = puerto;
        this.logTime = logTime;

        if (log.isEmpty()) {
            this.logFile = System.out;
        } else {
            this.logFile = new PrintStream(new FileOutputStream(log));
        }

    }

    /**
     * Launches server
     */
    public void run() {

        logFile.println("\n\n\n\n\n\n\n");
        logFile.println(COMMUNICATIONS_LOG);  //writes tittle
        logFile.printf(new String(new char[COMMUNICATIONS_LOG.length()]).replace("\0", "-"));  // writes underscore of the tittle (at Java 11 can be done with repeat() )
        logFile.println();

        if (listener.isRunning()) {
            return;
        }

        Thread thread = new Thread(listener);
        thread.start();

    }

    // Sends response to client
    // Creates a new thread to allow server continue listening 
    private void replay(Socket client, String data) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                threadCount++;
                try {
                    String responseText = ControlRespuestas.answer(data);
                    sendResponse(client, responseText);
                    if (logTime) {
                        logFile.println(COMMENT + thisMoment() + "\n");
                    }
                    logFile.println(SERVER_RESPONSE + "\n" + responseText + "\n");
                } catch (IOException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }
                threadCount--;
            }
        });

        t.start();
    }

    /**
     * stops server: stops main thread and waits until all secundary threads are
     * finshed (each secundary thread just send a response to a client)
     */
    @SuppressWarnings("empty-statement")
    public void stop() {
        listener.shutdown();
        while (threadCount > 0);
    }

    private void showIOErrorInformation(Exception e, PrintStream logFile) {
        logFile.println(INPUT_OUTPUT_ERROR + ":" + e.getMessage());
    }

    // returns formatted current time in an String
    private String thisMoment() {
        return DateFormat.getDateTimeInstance().format(new Date());
    }

    /**
     * Get the value of logFile
     *
     * @return the value of logFile
     */
    public PrintStream getLogFile() {
        return logFile;
    }

    /**
     * Set the value of logFile
     *
     * @param logFile new value of logFile
     */
    public void setLogFile(PrintStream logFile) {
        this.logFile = logFile;
    }

    /**
     * informs if server is running or not return true if server is running,
     * false otherwise
     *
     */
    public boolean isRunning() {
        return listener.isRunning();
    }

    /**
     * send to client a message
     *
     * @param client socket open with the client
     * @param response server response to be sent to client
     *
     * @throws IOException if a network error occurs
     */
    protected void sendResponse(Socket client, String response) throws IOException {
        PrintWriter output = new PrintWriter(new OutputStreamWriter(client.getOutputStream()), true);

        output.println(response);

    }

}
