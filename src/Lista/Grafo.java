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
    
    
    public Grafo(){
        this.nodos = new ListaDobleEnlazada();
    }
    
    public void agregarNodo(Parada parada) {
        nodos.agregarAlFinal(parada);
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

