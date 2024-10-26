/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author rtkn0_z8ls
 */
public class NodoLinea {
    private Linea element;
    private NodoLinea next;
    private NodoLinea prev;
            
    public NodoLinea(Linea element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    public Linea getElement() {
        return element;
    }

    public void setElement(Linea element) {
        this.element = element;
    }

    public NodoLinea getNext() {
        return next;
    }

    public void setNext(NodoLinea next) {
        this.next = next;
    }

    public NodoLinea getPrev() {
        return prev;
    }

    public void setPrev(NodoLinea prev) {
        this.prev = prev;
    }
    
    
    
    
    
}
