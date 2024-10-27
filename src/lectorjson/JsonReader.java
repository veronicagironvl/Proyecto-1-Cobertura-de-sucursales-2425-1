/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectorjson;

/**
 *
 * @author Kelly
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {
        
    public  void leerArchivo(String ruta) {
        String filePath = "Caracas.json"; 
        String jsonContent = readJsonFile(filePath);
        
        if (jsonContent != null) {
            JsonElement jsonElement = JsonParser.parseString(jsonContent); 
            printLineasYEstaciones(jsonElement); 
        }
    }
public static String readJsonFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line); 
            }
            return jsonContent.toString(); 
        } catch (IOException e) {
            System.out.println("Error leyendo archivo JSON: " + e.getMessage()); 
            return null; 
        }
    }

  public static void printLineasYEstaciones(JsonElement jsonElement) {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject(); 
            JsonArray lineas = jsonObject.getAsJsonArray("Metro de Caracas"); 
            for (JsonElement lineaElement : lineas) {
                JsonObject linea = lineaElement.getAsJsonObject();                                
                for (String nombreLinea : linea.keySet()) {
                    System.out.println("Línea: " + nombreLinea); 
                    JsonArray estaciones = linea.getAsJsonArray(nombreLinea);                     
                    for (JsonElement estacionElement : estaciones) {
                        if (estacionElement.isJsonObject()) {                            
                            JsonObject estacionObj = estacionElement.getAsJsonObject(); 
                            for (String estacionNombre : estacionObj.keySet()) {                                
                                System.out.println("Estacion " + estacionNombre + " / " + estacionObj.get(estacionNombre).getAsString());
                            }
                        } else {
                            
                            String nombreEstacion = estacionElement.getAsString();
                            System.out.println("Estación: " + nombreEstacion);
                        }
                    }
                }
            }
        } else {
            
            System.out.println("El contenido no es un objeto JSON válido.");
        }
    }
} 
