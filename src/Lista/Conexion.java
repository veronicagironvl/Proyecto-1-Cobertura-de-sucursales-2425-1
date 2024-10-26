package Lista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Conexion {
    private Parada destino;
    private boolean esConexionPeatonal;
    private Conexion siguienteParada; // Referencia al siguiente nodo (parada) en la lista 
    
    public Conexion(Parada destino, boolean esConexionPeatonal){
        this.destino = destino;
        this.esConexionPeatonal = esConexionPeatonal;
        this.siguienteParada = null;
    }
    
    public Parada getDestino(){
        return destino;
    }
    
    public boolean esConexionPeatonal(){
        return esConexionPeatonal;
    }
    
    public Conexion getSiguienteParada(){
        return siguienteParada;
    }
    
    public void setSiguienteParada(Conexion siguienteParada){
        this.siguienteParada = siguienteParada;
    }
}
