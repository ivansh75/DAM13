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

    private String username;
    private String name;

    /**
     * Default constructor.
     */
    public Usuario() {
    }

    /**
     * Constructs a user with specified username and name.
     *
     * @param username user's username
     * @param name user name
     */
    public Usuario(String username, String name) {
        this.username = username;
        this.name = name;
    }

    /**
     * Get the value of username
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the value of username
     *
     * @param username new value of username
     */
    public void setUsername(String username) {
        this.username = username;
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
