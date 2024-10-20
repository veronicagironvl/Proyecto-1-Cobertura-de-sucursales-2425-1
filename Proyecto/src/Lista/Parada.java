/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author veron
 */
public class Parada {
    private String nombre;
    private ListaAdyacencia conexiones; // Lista de conexiones directas a otras paradas
    private boolean esSucursal;
    

    public Parada(String nombre) {
        this.nombre = nombre;
        this.esSucursal = false;
        this.conexiones = new ListaAdyacencia();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void agregarConexion(Parada parada){
        
    }
    
    public boolean esSucursal(){
        return esSucursal;
    }
    
    public void setEsSucursal(boolean esSucursal){
        this.esSucursal = esSucursal;
    }
    
}