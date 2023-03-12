
package dam13_comunicacion;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;

/**
  * Representación de la orden a enviar al servidor
  * @autor Ivimar
  */
public class GestionDatos {

    private ArrayList <String> data = new ArrayList<>();


    /**
      * Añade un dato al pedido al finalizar.
      * Datos de @param datos que se agregarán
      */
    public void addDataObject(Object data){
        Gson gson = new Gson();
        this.data.add(gson.toJson(data));
    }

    /**
     * Añade un dato al pedido al finalizar.
     * @param data data to be added
     */
    public void addPrimitiveData(Object data){
        this.data.add(data+"");
       
    }

    
    /**
     * Gets the data, at the specified position, as an object of the specified class.
     * @param DataNumber data position (starting with 0)
     * @param clasz data class
     * @return parameter value
     */
    public Object getData(int DataNumber, Class clasz){
        try{
            Gson gson = new Gson();
            return gson.fromJson(data.get(DataNumber),clasz);
        }catch(JsonSyntaxException ex){return null;}
    }
}
