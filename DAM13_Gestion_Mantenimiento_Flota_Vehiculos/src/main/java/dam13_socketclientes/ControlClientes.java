/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam13_socketclientes;

import com.google.gson.Gson;
import dam13_comunicacion.RecibeValores;
import dam13_comunicacion.RetornaValores;
import static dam13_control.ControlRespuestas.ADD_USER;
import static dam13_control.ControlRespuestas.LIST_USERS;
import static dam13_control.ControlRespuestas.LOGIN;
import static dam13_control.ControlRespuestas.LOGOUT;
import static dam13_control.ControlRespuestas.OK_RETURN_CODE;
import dam13_objetostablas.Usuario;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Ivimar
 */
public class ControlClientes {
    public static int BAD_VALUE = -1;
    private static int sessionCode=BAD_VALUE; 
    private static int puerto=8180;//BAD_VALUE;
    private static String serverName="localhost";
    
    //opens a connection to the server
    private static Socket connect() {
        Socket s;
        if(puerto==BAD_VALUE || serverName == null){
            return null;
        }else {
            try {        
                s=new Socket(serverName, puerto);
                s.setSoTimeout(4000);
                return s;
            } catch (IOException ex) {
                return null;
            }
        }
    }
    

    /**
     * Set the value of puerto
     *
     * @param puerto new value of port
     */
    public static void setPuerto(int puerto) {
         ControlClientes.puerto = puerto;
    }

    /**
     * Set the value of serverName
     *
     * @param serverName new value of serverName
     */
    public static void setServerName(String serverName) {
        ControlClientes.serverName = serverName;
    }
    
    
    /**
     * Makes a login request to the server
     * @param user  username
     * @param password password
     * @return result code
     */
    public static int doLogin(String user, String password){
        RecibeValores login = new RecibeValores(LOGIN);
        login.addPrimitiveData(user);
        login.addPrimitiveData(password);
        RetornaValores ret=talkToServer(login);
        
        if(ret==null) return BAD_VALUE;
        
        int returnCode=ret.getReturnCode();
        
        if(returnCode==OK_RETURN_CODE){
            sessionCode=(Integer) ret.getData(0, Integer.class);
        }
        
        return ret.getReturnCode();
    }

    /**
     * Makes a logout request to the server
     * @return result code
     */
    public static int doLogout(){

        if(sessionCode==BAD_VALUE) return OK_RETURN_CODE;

        RecibeValores logout = new RecibeValores(LOGOUT);
        
        logout.addPrimitiveData(sessionCode);

        RetornaValores ret=talkToServer(logout);
        
        if(ret==null) return BAD_VALUE;
        
        int code= ret.getReturnCode();
        
        if(code==OK_RETURN_CODE){
            sessionCode=BAD_VALUE;
        }
        
        return code;

    }
    /**
     * Makes a "list user" request to the server
     * @return result users array; null if error.
     */
    public static Usuario[] doListUsers(){
        
        if(sessionCode==BAD_VALUE) return null;

        RecibeValores listUsers = new RecibeValores(LIST_USERS);
        
        listUsers.addPrimitiveData(sessionCode);

        RetornaValores ret=talkToServer(listUsers);
        
        if(ret==null) return null;
        
        int returnCode=ret.getReturnCode();
        
        if(returnCode==OK_RETURN_CODE){
            Usuario [] users={};
            return ( Usuario []) ret.getData(0, users.getClass());
        }
        else {
            return null;
        }
        
    }

    /**
     * Makes an "add user" request to the server
     * @param user  user to be added
     * @return result code
     */    
    public static int doAddUser(Usuario user){
        
        RecibeValores addUser = new RecibeValores(ADD_USER);
        addUser.addPrimitiveData(sessionCode);
        addUser.addDataObject(user);

        RetornaValores ret=talkToServer(addUser);
        
        if(ret==null) return BAD_VALUE;
        
        return ret.getReturnCode();

    }

    /**
     * Makes a "query user" request to the server
     * @param username  username to search
     * @return result user with this username; null if error
     */       
    public static Usuario doQueryUser(String username){
        
       if(username.equals("99")) { // simulates non-existent key
            return null;
        }else{
            return new Usuario(username,"Mock value");
        }

    }
    
    // Sends message to the server and returns its response.
    // messages are serialized as Json values before and after communication
    private static RetornaValores talkToServer(RecibeValores message){
        try {       
            Socket socket = connect();

            Gson gson= new Gson();
            
            if(socket==null) return null;
            
            PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

 
            output.println(gson.toJson(message));

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream())); 

            String data = input.readLine();

            RetornaValores ret=gson.fromJson(data,RetornaValores.class);

            socket.close();
            
            return ret;
            
        } catch (IOException ex) {
            return null;
        }
            
 
    }
    
}
