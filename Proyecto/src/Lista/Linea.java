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
    private ListaDobleEnlazada lineaParadas;
   
    public Linea(String nombre) {
        this.nombre = nombre;
        this.lineaParadas = new ListaDobleEnlazada();
    }
    
    
    public void agregarParada(Parada parada) {
        lineaParadas.agregarAlFinal(parada);
    }
    
    
}
