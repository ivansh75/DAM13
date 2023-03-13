/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam13_control;

import com.google.gson.Gson;
import dam13_comunicacion.RecibeValores;
import dam13_comunicacion.RetornaValores;
import dam13_objetostablas.Usuario;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ivimar
 */
public class ControlRespuestas {

    private final String defaultResponse = null;  // default response property

    // nombre dellas solicitudes
    public static final String LOGIN = "LOGIN";
    public static final String LOGOUT = "LOGOUT";
    public static final String LIST_USERS = "LIST_USERS";
    public static final String ADD_USER = "ADD_USER";

    //códigos predefine
    private static final int SESSION_CODE = 456;
    public static final int OK_RETURN_CODE = 0;
    public static final int ERROR_RETURN_CODE = 1;

    private static boolean isLoggedIn = false;

    // initial mock values 
    private static final Usuario[] usersArray
            = {
                new Usuario("M13", "Project manager"),
                new Usuario("M01", "System Manager"),
                new Usuario("M02", "Data Manager")
            };

    // runtime mock values
    private static ArrayList<Usuario> users = new ArrayList();

    //  Dynamic users list initialization
    static {
        users.addAll(Arrays.asList(usersArray));
    }

    public static void resetServerData() {
        isLoggedIn = false;
        users.clear();
        users.addAll(Arrays.asList(usersArray));
    }

    /**
     * Returns server response corresponding to client request Also, log file is
     * updated
     *
     * @param message client message
     * @return server response
     */
    public static String answer(String message) {

        Gson gson = new Gson();
        RecibeValores input = gson.fromJson(message, RecibeValores.class);

        RetornaValores returnValue = null;

        String order = input.getOrder();

        if (order.equals(LOGIN)) {

            String userName = (String) input.getData(0, String.class);
            String password = (String) input.getData(1, String.class);
            if (userName.equals("M13") && password.equals("123") && !isLoggedIn) {  // single user supported
                isLoggedIn = true;
                returnValue = new RetornaValores(OK_RETURN_CODE);
                returnValue.addDataObject(SESSION_CODE);
            } else {
                returnValue = new RetornaValores(ERROR_RETURN_CODE);
            }
        } else {  // calls requiring an open session
            int sessionNumber = (Integer) input.getData(0, Integer.class);
            if (sessionNumber != SESSION_CODE || !isLoggedIn) {
                returnValue = new RetornaValores(ERROR_RETURN_CODE);
            } else if (order.equals(LOGOUT)) {
                returnValue = new RetornaValores(OK_RETURN_CODE);
                isLoggedIn = false;
            } else if (order.equals(LIST_USERS)) {
                Usuario[] array = users.toArray(new Usuario[0]);
                returnValue = new RetornaValores(OK_RETURN_CODE);
                returnValue.addDataObject(array);
            } else if (order.equals(ADD_USER)) {
                Usuario user = (Usuario) input.getData(1, Usuario.class);
                if (user.getPassword().equals("99")) { // simulates duplicate key
                    returnValue = new RetornaValores(OK_RETURN_CODE);
                } else {
                    returnValue = new RetornaValores(OK_RETURN_CODE);
                    users.add(user);
                }
            } else { // bad request

                returnValue = new RetornaValores(OK_RETURN_CODE);
            }
        }
        return gson.toJson(returnValue);

    }

}
