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
    public void calcularCoberturaDFS(Parada sucursal, int limite){
        ListaDobleEnlazada visitadas = new ListaDobleEnlazada();
        dfs(sucursal, limite, visitadas);
        sucursal.getZonaComercial().vaciarLista();
        
        Nodo nodo = visitadas.getCabeza();
        while(nodo != null){
            sucursal.getZonaComercial().agregarAlFinal(nodo.getParada());
            nodo = nodo.getpNext();
        }
    }
    
    private void dfs(Parada parada, int limite, ListaDobleEnlazada visitadas){
        if(limite <0 || visitadas.buscar(parada)) return;
        visitadas.agregarAlFinal(parada);
        
        Nodo conexion = parada.getConexiones().getCabeza();
        while (conexion != null){
            dfs(conexion.getParada(), limite - 1, visitadas);
            conexion = conexion.getpNext();
        }
    }
    
    // BFS para calcular cobertura de sucursal (alternativa)
    public void calcularCoberturaBFS(Parada sucursal, int limite) {
        ListaDobleEnlazada cola = new ListaDobleEnlazada();
        ListaDobleEnlazada visitadas = new ListaDobleEnlazada();

        cola.agregarAlFinal(sucursal);
        visitadas.agregarAlFinal(sucursal);

        int nivel = 0;
        while (!cola.isEmpty() && nivel <= limite) {
            int nivelSize = cola.getSize();
            for (int i = 0; i < nivelSize; i++) {
                Parada actual = cola.obtenerNodoEnPosicion(0).getParada();
                cola.vaciarLista();

                Nodo conexion = actual.getConexiones().getCabeza();
                while (conexion != null) {
                    Parada vecino = conexion.getParada();
                    if (!visitadas.buscar(vecino)) {
                        cola.agregarAlFinal(vecino);
                        visitadas.agregarAlFinal(vecino);
                    }
                    conexion = conexion.getpNext();
                }
            }
            nivel++;
        }

        sucursal.getZonaComercial().vaciarLista();
        Nodo nodo = visitadas.getCabeza();
        while (nodo != null) {
            sucursal.getZonaComercial().agregarAlFinal(nodo.getParada());
            nodo = nodo.getpNext();
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
    
    public void mostrarGrafo() {
        Graph grafoVisual = new SingleGraph("Grafo de Transporte");

        Nodo actual = nodos.getCabeza();
        while (actual != null) {
            Parada parada = actual.getParada();
            String nombreParada = parada.getNombre();

            if (grafoVisual.getNode(nombreParada) == null) {
                grafoVisual.addNode(nombreParada).setAttribute("ui.label", nombreParada);
            }

            Nodo conexionActual = parada.getConexiones().getCabeza();
            while (conexionActual != null) {
                Parada conexion = conexionActual.getParada();
                String nombreConexion = conexion.getNombre();
                String idArista = nombreParada + "-" + nombreConexion;

                if (grafoVisual.getEdge(idArista) == null && grafoVisual.getEdge(nombreConexion + "-" + nombreParada) == null) {
                    grafoVisual.addEdge(idArista, nombreParada, nombreConexion);
                }

                conexionActual = conexionActual.getpNext();
            }
            actual = actual.getpNext();
        }
        grafoVisual.display();
    }
}

