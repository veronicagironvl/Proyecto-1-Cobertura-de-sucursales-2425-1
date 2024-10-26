/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author rtkn0_z8ls
 */
public class ListaParada {
        private Nodo head;
        private Nodo tail;
        private int size;

    public ListaParada() {
        this.head = head;
        this.tail = tail;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
      public boolean isEmpty(){
        return getHead() == null;
    }
    
    public void insertFinal(Parada parada) {
        Nodo nodo = new Nodo(parada);
        if (isEmpty()) {
            setHead(nodo);
            setTail(nodo);
        } else {
            getTail().setpNext(nodo);
            nodo.setpPrev(getTail());
            setTail(nodo);
        }
        size++;
    }    
    
}
