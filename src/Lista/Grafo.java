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
    private ListaDobleEnlazada nodos;
    private int t;
    
    
    public Grafo(){
        this.nodos = new ListaDobleEnlazada();
    }
    
    public void agregarNodo(Parada parada) {
        nodos.agregarAlFinal(parada);
        this.t = 3; // Valor inicial de t
    }
    
    public void setT(int nuevoT){
        this.t = nuevoT;
        actualizarCoberturaSucursales();
    }
    
    public void colocarSucursal(Parada parada){
        parada.colocarSucursal();
        calcularCoberturaDFS(parada, t);
    }
    
    public void removerSucursal(Parada parada){
        parada.removerSucursal();
    }
    
    // DFS para calcular cobertura de sucursal
    public void calcularCoberturaDFS(Parada sucursal, int limite) {
        ListaDobleEnlazada visitadas = new ListaDobleEnlazada();
        dfs(sucursal, limite, visitadas);
        sucursal.getZonaComercial().vaciarLista();

        Nodo nodo = visitadas.getCabeza();
        while (nodo != null) {
            sucursal.getZonaComercial().agregarAlFinal(nodo.getParada());
            nodo = nodo.getpNext();
        }
    }
    
    private void dfs(Parada parada, int limite, ListaDobleEnlazada visitadas) {
        if (limite < 0 || visitadas.buscar(parada)) return;
        visitadas.agregarAlFinal(parada);

        Nodo conexion = parada.getConexiones().getCabeza();
        while (conexion != null) {
            dfs(conexion.getParada(), limite - 1, visitadas);
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
    
    
}

