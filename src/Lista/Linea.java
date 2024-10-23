/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author veron
 */
public class Linea {
    private String nombre;
    ListaEnlazada paradas; // Lista enlazada de paradas
    
    public Linea(String nombre){
        this.nombre = nombre;
        this.paradas = new ListaEnlazada();
    }
    
    public void agregarParada(Parada parada){
        paradas.agregar(parada);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    
}
