/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author veron
 */
public class Nodo {
    private Parada parada;
    private Nodo pNext;
    private Nodo pPrev;

    // Constructor que inicializa con una parada
    public Nodo(Parada parada) {
        this.parada = parada;
        this.pNext = null;
        this.pPrev = null;
    }

    // Getters y Setters
    public Parada getParada() {
        return parada;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }

    public Nodo getpNext() {
        return pNext;
    }

    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }

    public Nodo getpPrev() {
        return pPrev;
    }

    public void setpPrev(Nodo pPrev) {
        this.pPrev = pPrev;
    }
}
