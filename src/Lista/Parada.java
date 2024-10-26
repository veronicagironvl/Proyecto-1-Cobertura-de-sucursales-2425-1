/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author veron
 */
public class Parada {
    private String nombre;
    private ListaDobleEnlazada conexiones;
    private boolean tieneSucursal;
    private ListaDobleEnlazada zonaComercial;
    
    public Parada(String nombre){
        this.nombre = nombre;
        this.conexiones = new ListaDobleEnlazada();
        this.tieneSucursal = false;
        this.zonaComercial = new ListaDobleEnlazada();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public  ListaDobleEnlazada getConexiones(){
        return conexiones;
    }
    
    public void agregarConexion(Parada parada){
        conexiones.agregarAlFinal(parada);
    }
    
    public boolean tieneSucursal(){
        return tieneSucursal;
    }
    
    public void colocarSucursal(){
        this.tieneSucursal = true;
    }
    
    public void removerSucursal(){
        this.tieneSucursal = false;
        this.zonaComercial.vaciarLista(); // Limpia la zona comercial
    }
    
    public ListaDobleEnlazada getZonaComercial(){
        return zonaComercial;
    }
}
