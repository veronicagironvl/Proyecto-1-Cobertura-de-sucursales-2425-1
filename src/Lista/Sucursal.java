package Lista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veron
 */
public class Sucursal {
    private Parada parada;
    private ListaAdyacencia zonaComercial;
    
    public Sucursal(Parada parada){
        this.parada = parada;
        this.zonaComercial = new ListaAdyacencia();
    }
    
    public Parada getParada(){
        return parada;
    }
}
