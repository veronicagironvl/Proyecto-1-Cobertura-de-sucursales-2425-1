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
    private Nodo pSiguiente;
    private Nodo pAnterior;
    
    
    public Nodo(Parada parada){
        this.parada = parada;
    }

    public Nodo(Parada parada, Nodo pSiguiente, Nodo pAnterior) {
        this.parada = parada;
        this.pSiguiente = pSiguiente;
        this.pAnterior = pAnterior;
    }

    public Parada getParada() {
        return parada;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }


    public Nodo getpSiguiente() {
        return pSiguiente;
    }

    public Nodo getpAnterior() {
        return pAnterior;
    }

    public void setpSiguiente(Nodo pSiguiente) {
        this.pSiguiente = pSiguiente;
    }

    public void setpAnterior(Nodo pAnterior) {
        this.pAnterior = pAnterior;
    }
    
    
}
