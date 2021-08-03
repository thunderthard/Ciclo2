/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueadero;

import actoresenempresa.Persona;

/**
 *
 * @author harld
 */
public class Cliente extends Persona {
    private int id;
    private Ticket miTicket;
    private Vehiculo miVehiculo;
    public Cliente(int id,int cedula, String nombres,String apellidos,String telefono, String direccion, Ticket miTikcet, Vehiculo miVehiculo){
       // super( cedula,  nombres, apellidos, telefono,  direccion);
         this.id=id;
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.direccion=direccion;
        this.miTicket=miTikcet;
        this.miVehiculo=miVehiculo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMiTicket(Ticket miTicket) {
        this.miTicket = miTicket;
    }

    public void setMiVehiculo(Vehiculo miVehiculo) {
        this.miVehiculo = miVehiculo;
    }

    public void setTicket(Ticket miTikcet){
        this.miTicket=miTikcet;
    }
    
    public int getId() {
        return id;
    }

    public Ticket getMiTicket() {
        return miTicket;
    }

    public Vehiculo getMiVehiculo() {
        return miVehiculo;
    }
    
}
