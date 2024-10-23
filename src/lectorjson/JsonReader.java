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
        
    
    /*
    NOTA: La ruta va a ser el archivo JSON que le quieras pasar. Si metes el de Bogota y Caracas en la carpeta del proyecto,
    bastara ponerlo como te explico abajo: Nombre.json
    
    En cambio, si usas el jFileChooser para que escoja el archivo, la ruta que te devuelva es la que le pasaras a esta funcion.
    
    Ademas, para crear los objetos tienen mas abajo en el ultimo metodo explicado que variables guardan los nombres de las lineas y
    los de las estaciones para que puedan usarlos.
    */
    public  void leerArchivo(String ruta) {
        // Definimos la ruta del archivo JSON que se va a leer
        String filePath = "Caracas.json"; // Si pones el archivo dentro de la carpeta del proyecto, deberia leertelo asi      
        // Leemos el contenido del archivo
        String jsonContent = readJsonFile(filePath);
        
        // Si encuentra y lee el archivo, convertimos el contenido en un elemento Json (basicamente un diccionario)
        if (jsonContent != null) {
            JsonElement jsonElement = JsonParser.parseString(jsonContent); // Convertimos el String a JSON
            printLineasYEstaciones(jsonElement); // Llamamos al metodo para leer cada linea y estacion
        }
    }

   