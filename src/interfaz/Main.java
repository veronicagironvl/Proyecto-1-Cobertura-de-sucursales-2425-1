
package interfaz;

import Lista.Linea;
import Lista.Parada;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;




public class Main {

    public static void main(String[] args) {
       Menu v1 = new Menu();
       v1.setVisible(true);
       
    }
  
    
/*
public static void procesarRedDeTransporte(JsonObject jsonObject, RedTransporte red) {
    // Iterar sobre las redes (e.g., Metro de Caracas, Transmilenio)
    for (String nombreRed : jsonObject.keySet()) {
        JsonArray lineasArray = jsonObject.getAsJsonArray(nombreRed);

        // Iterar sobre las líneas de transporte dentro de la red
        for (JsonElement lineaElement : lineasArray) {
            JsonObject lineaObj = lineaElement.getAsJsonObject();

            // Cada línea tiene un solo nombre, extraemos el nombre de la línea
            for (String nombreLinea : lineaObj.keySet()) {
                Linea lineaActual = new Linea(nombreLinea);
                red.agregarLinea(lineaActual);

                JsonArray paradas = lineaObj.getAsJsonArray(nombreLinea);
                
                // Iterar sobre las paradas dentro de la línea
                for (JsonElement paradaElement : paradas) {
                    if (paradaElement.isJsonObject()) {
                        // Es una conexión peatonal
                        JsonObject conexionPeatonal = paradaElement.getAsJsonObject();
                        for (String nombreParadaA : conexionPeatonal.keySet()) {
                            String nombreParadaB = conexionPeatonal.get(nombreParadaA).getAsString();
                            
                            // Procesar las conexiones peatonales
                            Parada paradaA = red.buscarParada(nombreParadaA);
                            if (paradaA == null) {
                                paradaA = new Parada(nombreParadaA);
                                red.agregarParada(paradaA);
                            }

                            Parada paradaB = red.buscarParada(nombreParadaB);
                            if (paradaB == null) {
                                paradaB = new Parada(nombreParadaB);
                                red.agregarParada(paradaB);
                            }

                            paradaA.agregarConexion(paradaB); // Conexión bidireccional
                            paradaB.agregarConexion(paradaA);
                        }
                    } else if (paradaElement.isJsonPrimitive()) {
                        // Es una parada individual
                        String nombreParada = paradaElement.getAsString();
                        Parada parada = red.buscarParada(nombreParada);

                        if (parada == null) {
                            parada = new Parada(nombreParada);
                            red.agregarParada(parada);
                        }

                        // Agregar la parada a la línea actual
                        lineaActual.agregarParada(parada);
                    }
                }
            }
        }
    }
}
*/

}
