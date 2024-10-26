/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

import java.io.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 *
 * @author veron
 */
public class RedTransporte {
    ListaEnlazada lineas;
    ListaEnlazada paradas; // Lista de todas las paradas en la red
    
    public RedTransporte(){
        this.lineas = new ListaEnlazada();
        this.paradas = new ListaEnlazada();
    }
    
    public void agregarLinea(Linea linea){
        this.lineas.agregar(linea);
    }
    
    public void agregarParada(Parada parada){
        this.paradas.agregar(parada);
    }
    
    public Parada buscarParada(String nombre){
        Nodo actual = paradas.cabeza;
        while (actual != null) {
            if (((Parada) actual.dato).getNombre().equals(nombre)) {
                return (Parada) actual.dato;
            }
            actual = actual.siguiente;
        }
        return null;
    }
    
}
