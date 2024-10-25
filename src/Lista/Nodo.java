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
    
    public Nodo(Parada parada){
        this.parada = parada;
        this.pNext = null;
        this.pPrev = null;
    }

    /**
     * @return the parada
     */
    public Parada getParada() {
        return parada;
    }

    /**
     * @param parada the parada to set
     */
    public void setParada(Parada parada) {
        this.parada = parada;
    }

    /**
     * @return the pNext
     */
    public Nodo getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the pPrev
     */
    public Nodo getpPrev() {
        return pPrev;
    }

    /**
     * @param pPrev the pPrev to set
     */
    public void setpPrev(Nodo pPrev) {
        this.pPrev = pPrev;
    }

    
}
