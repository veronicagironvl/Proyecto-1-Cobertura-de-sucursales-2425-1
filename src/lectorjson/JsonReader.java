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

   
