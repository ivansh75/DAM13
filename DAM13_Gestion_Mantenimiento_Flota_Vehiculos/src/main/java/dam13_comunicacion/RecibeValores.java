
package dam13_comunicacion;

/**
     * Gets the data, at the specified position, as an object of the specified class.
     * @param DataNumber data position (starting with 0)
     * @param clasz data class
     * @return parameter value
     */
public class RecibeValores extends GestionDatos {
    private String order;

    
    /**
     * Default constructor
     */
    public RecibeValores() {
        super();
    }
    
    /**
     * Constructor Recibe representa el pedido especificado sin párametos.Estos se pueden llenar mas tarde
     * @param order represented order
     */
    public RecibeValores(String order) {
        super();
        this.order = order;
    }
    
    /**
     * Recibe el pedido
     * @return order
     */

    public String getOrder() {
        return order;
    }

}
