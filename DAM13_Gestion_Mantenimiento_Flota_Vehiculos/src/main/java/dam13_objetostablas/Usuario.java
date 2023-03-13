/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam13_objetostablas;

/**
 *
 * @author Ivimar
 */
public class Usuario {

    private String password;
    private String name;

    /**
     * Default constructor.
     */
    public Usuario() {
    }

    /**
     * Constructs a user with specified name and password.
     *
     * @param name user name
     * @param password de usuario
     */
    public Usuario(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
     /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Set the value of password
     *
     * @param password new value of name
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

}
