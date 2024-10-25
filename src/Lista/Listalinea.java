/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author rtkn0_z8ls
 */
public class Listalinea {
    private NodoLinea head;
    private NodoLinea tail;
    private int size;

    public Listalinea() {
        this.head = head;
        this.tail = tail;
        this.size = 0;
    }

    public NodoLinea getHead() {
        return head;
    }

    public void setHead(NodoLinea head) {
        this.head = head;
    }

    public NodoLinea getTail() {
        return tail;
    }

    public void setTail(NodoLinea tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
     public void agregarAlFinal(Linea element) {
        NodoLinea nodo = new NodoLinea (element);
        if (isEmpty()) {
            setHead(nodo);
            setTail(nodo);
        } else {
            getTail().setNext(nodo);
            nodo.setPrev(getTail());
            setTail(nodo);
        }
        size++;
    }
     public boolean isEmpty(){
        return getHead() == null;
    }
     
    
}
