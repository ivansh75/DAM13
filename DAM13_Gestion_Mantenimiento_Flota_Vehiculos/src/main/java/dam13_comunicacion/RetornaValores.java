package dam13_comunicacion;

/**
 * Representation of the returned value from the server.
 *
 * @author Ivimar
 */
public class RetornaValores extends GestionDatos {

    private int returnCode;

    /**
     * Default constructor
     */
    public RetornaValores() {
        super();
    }

    /**
     * Constructor de un RetornarValores que representa una respuesta con el
     * código de retorno especificado sin más datos. Estos pueden ser llenados
     * posteriormente.
     *
     * @param returnCode código de retorno
     */

    public RetornaValores(int returnCode) {
        super();
        this.returnCode = returnCode;
    }

    /**
     * Obtiene el codigo de retornode respuesta
     *
     * @return return code
     */
    public int getReturnCode() {
        return returnCode;
    }

}
