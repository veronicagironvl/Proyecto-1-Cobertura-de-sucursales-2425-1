/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author veron
 */

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.graph.Node;


public class Grafo {
    private ListaDobleEnlazada nodos; // Lista doblemente enlazada que contiene las paradas
    private int t; // Valor de cobertura de las sucursales
    
    // Constructor que inicializa la lista de nodos
    public Grafo(){
        this.nodos = new ListaDobleEnlazada();
    }
    
    // Agrega un nodo (parada) al grafo y asigna un valor inicial a t si es la primera vez
    public void agregarNodo(Parada parada) {
        nodos.agregarAlFinal(parada);
        if (nodos.getSize() == 1) {
            this.t = 3; // Valor inicial de t si se está agregando el primer nodo
        }
    }
    
    // Actualiza el valor de t (cobertura de la sucursal) y recalcula la cobertura de todas las sucursales
    public void setT(int nuevoT){
        this.t = nuevoT;
        actualizarCoberturaSucursales(); // Actualizar la cobertura de todas las sucursales al cambiar t
    }
    
    // Coloca una sucursal en una parada y calcula su cobertura con DFS
    public void colocarSucursal(Parada parada){
        parada.colocarSucursal();
        calcularCoberturaDFS(parada, t);
    }
    
    // Elimina una sucursal de una parada
    public void removerSucursal(Parada parada){
        parada.removerSucursal(); // Elimina la sucursal de la parada y limpia su zona comercial
    }
    
    // DFS para calcular cobertura de sucursal
    public void calcularCoberturaDFS(Parada sucursal, int limite) {
        ListaDobleEnlazada visitadas = new ListaDobleEnlazada();
        dfs(sucursal, limite, visitadas); // Realiza la búsqueda en profundidad para calcular la cobertura
        sucursal.getZonaComercial().vaciarLista(); // Limpia la zona comercial antes de actualizarla

        Nodo nodo = visitadas.getCabeza();
        while (nodo != null) {
            sucursal.getZonaComercial().agregarAlFinal(nodo.getParada()); // Agrega todas las paradas visitadas a la zona comercial de la sucursal
            nodo = nodo.getpNext();
        }
    }
    
    // Función auxiliar para realizar DFS recursivo
    private void dfs(Parada parada, int limite, ListaDobleEnlazada visitadas) {
        if (limite < 0 || visitadas.buscar(parada)) return; // Si el límite se agota o la parada ya fue visitada, se detiene la recursión
        visitadas.agregarAlFinal(parada); // Marca la parada como visitada

        Nodo conexion = parada.getConexiones().getCabeza(); // Recorre todas las conexiones de la parada
        while (conexion != null) {
            dfs(conexion.getParada(), limite - 1, visitadas); // Llama recursivamente para las paradas conectadas
            conexion = conexion.getpNext();
        }
    }

    // Verificar cobertura total
    public boolean verificarCoberturaTotal() {
        ListaDobleEnlazada sinCobertura = new ListaDobleEnlazada();
        Nodo nodo = nodos.getCabeza();

        while (nodo != null) {
            Parada parada = nodo.getParada();
            boolean cubierta = false;

            Nodo sucursal = nodos.getCabeza();
            while (sucursal != null) {
                Parada pSucursal = sucursal.getParada();
                if (pSucursal.tieneSucursal() && pSucursal.getZonaComercial().buscar(parada)) {
                    cubierta = true;
                    break;
                }
                sucursal = sucursal.getpNext();
            }

            if (!cubierta) sinCobertura.agregarAlFinal(parada);
            nodo = nodo.getpNext();
        }

        return sinCobertura.isEmpty();
    }

    private void actualizarCoberturaSucursales() {
        Nodo nodo = nodos.getCabeza();
        while (nodo != null) {
            Parada parada = nodo.getParada();
            if (parada.tieneSucursal()) {
                calcularCoberturaDFS(parada, t);
            }
            nodo = nodo.getpNext();
        }
    }
    
   

    public ListaDobleEnlazada getNodos() {
        return nodos;
    }

    public int getT() {
        return t;
    }

    public void setNodos(ListaDobleEnlazada nodos) {
        this.nodos = nodos;
    }
    
    public Parada buscarParada(String nombreParada) {
    Nodo actual = nodos.getCabeza();
    while (actual != null) {
        Parada parada = actual.getParada();
        if (parada.getNombre().equals(nombreParada)) {
            return parada;
        }
        actual = actual.getpNext();
    }
    return null; // Retorna null si no se encuentra la parada
}
    
    // Método para obtener las paradas que tienen sucursales
    public ListaDobleEnlazada obtenerParadasConSucursales() {
        ListaDobleEnlazada paradasConSucursales = new ListaDobleEnlazada();
        Nodo nodo = nodos.getCabeza();
        
        while (nodo != null) {
            Parada parada = nodo.getParada();
            if (parada.tieneSucursal()) {
                paradasConSucursales.agregarAlFinal(parada);
            }
            nodo = nodo.getpNext();
        }
        return paradasConSucursales;
    }
    
    // Método para obtener las paradas que están cubiertas por una zona comercial
    public ListaDobleEnlazada obtenerParadasCubiertas() {
        ListaDobleEnlazada paradasCubiertas = new ListaDobleEnlazada();
        Nodo nodo = nodos.getCabeza();

        while (nodo != null) {
            Parada parada = nodo.getParada();
            Nodo zonaComercial = parada.getZonaComercial().getCabeza(); // Revisamos la zona comercial de cada parada
            while (zonaComercial != null) {
                if (!paradasCubiertas.buscar(zonaComercial.getParada())) { // Si no está ya agregada
                    paradasCubiertas.agregarAlFinal(zonaComercial.getParada());
                }
                zonaComercial = zonaComercial.getpNext();
            }
            nodo = nodo.getpNext();
        }
        return paradasCubiertas;
    }
    
}

