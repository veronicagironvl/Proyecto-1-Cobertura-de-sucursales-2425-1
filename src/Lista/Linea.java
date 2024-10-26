/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author rtkn0_z8ls
 */
public class Linea {
    private String nombre; // Nombre de la linea el sistema de transporte correspondiente 
    private ListaDobleEnlazada lineaParadas;

    public Linea(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombreLinea(String nombre) {
        this.nombre = nombre;
    }
     public void agregarParada(Parada parada) {
        lineaParadas.agregarAlFinal(parada);
    }
    
    

 
    
}
