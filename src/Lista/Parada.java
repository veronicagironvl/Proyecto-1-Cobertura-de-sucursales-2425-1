/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

import Lista.ListaEnlazada;

/**
 *
 * @author veron
 */
public class Parada {
    private String nombre;
    private int idParada; // Numero identificador asignado para identificar a la parada
    private ListaEnlazada conexiones; // Lista de conexiones directas a otras paradas
    private boolean esSucursal;
    

    public Parada(String nombre) {
        this.nombre = nombre;
        this.esSucursal = false;
        this.conexiones = new ListaEnlazada();
        this.idParada = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIDParada(int numero){
        this.idParada = numero;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void agregarConexion(Parada parada){
        this.conexiones.agregar(parada);
    }
    
    public boolean esSucursal(){
        return esSucursal;
    }
    
    public void setEsSucursal(boolean esSucursal){
        this.esSucursal = esSucursal;
    }
    
}
