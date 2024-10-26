/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author veron
 */

public class ListaDobleEnlazada {
    private Nodo cabeza;
    private Nodo fin;
    private int size;

    public ListaDobleEnlazada() {
        this.cabeza = null;
        this.fin = null;
        this.size = 0;
    }

    // Verifica si la lista está vacía
    public boolean isEmpty() {
        return cabeza == null;
    }

    // Agrega un nodo al inicio de la lista
    public void agregarAlInicio(Parada parada) {
        Nodo newNodo = new Nodo(parada);
        if (isEmpty()) {
            cabeza = newNodo;
            fin = newNodo;
        } else {
            newNodo.setpNext(cabeza);
            cabeza.setpPrev(newNodo);
            cabeza = newNodo;
        }
        size++;
    }

    // Agrega un nodo al final de la lista
    public void agregarAlFinal(Parada parada) {
        Nodo newNodo = new Nodo(parada);
        if (isEmpty()) {
            cabeza = newNodo;
            fin = newNodo;
        } else {
            newNodo.setpPrev(fin);
            fin.setpNext(newNodo);
            fin = newNodo;
        }
        size++;
    }

    // Busca una parada en la lista
    public boolean buscar(Parada parada) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getParada().equals(parada)) return true;
            temp = temp.getpNext();
        }
        return false;
    }

    // Obtener un nodo en una posición específica
    public Nodo obtenerNodoEnPosicion(int posicion) {
        if (posicion < 0 || posicion >= size) return null;
        Nodo temp = cabeza;
        for (int i = 0; i < posicion; i++) {
            temp = temp.getpNext();
        }
        return temp;
    }

    // Insertar una parada en una posición específica
    public void insertarEnPosicion(Parada parada, int posicion) {
        if (posicion < 0 || posicion > size) return;

        Nodo newNodo = new Nodo(parada);

        if (posicion == 0) {
            agregarAlInicio(parada);
        } else if (posicion == size) {
            agregarAlFinal(parada);
        } else {
            Nodo anterior = obtenerNodoEnPosicion(posicion - 1);
            Nodo siguiente = anterior.getpNext();

            newNodo.setpNext(siguiente);
            newNodo.setpPrev(anterior);

            anterior.setpNext(newNodo);
            siguiente.setpPrev(newNodo);

            size++;
        }
    }

    // Vacía la lista completamente
    public void vaciarLista() {
        cabeza = null;
        fin = null;
        size = 0;
    }

    // Getters y Setters
    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
