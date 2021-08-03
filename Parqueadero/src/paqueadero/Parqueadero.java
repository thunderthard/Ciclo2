/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueadero;

import actoresenempresa.Administrador;
import actoresenempresa.Empresa;

/**
 *
 * @author harld
 */
public class Parqueadero extends Empresa {

    private long codigoParqueadero;

    public Parqueadero(long codigoParqueadero, String nombre, long nit, String direccion, Administrador primerAdministrador) {
//        super(nombre, nit, direccion, primerAdministrador); //este es otro metodo de inicializarlo los variables(atributos) de la clase padre
        this.codigoParqueadero=codigoParqueadero;
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
    }

    public Parqueadero(String nombre, long nit, String direccion, Administrador primerAdministrador) {
//        super(nombre, nit, direccion, primerAdministrador); //este es otro metodo de inicializarlo los variables(atributos) de la clase padre
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
    }
    
    public Parqueadero() {

    }

    public long getCodigoParqueadero() {
        return codigoParqueadero;
    }

    public boolean setCodigoParqueadero(long codigoParqueadero) {
        this.codigoParqueadero = codigoParqueadero;
        return true;
    }    
}
