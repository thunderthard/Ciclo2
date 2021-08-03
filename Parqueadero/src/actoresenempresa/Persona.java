/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actoresenempresa;

/**
 *
 * @author harld
 */
public class Persona {
    protected int cedula;
    protected String nombres;
    protected String apellidos;
    protected String telefono;
    protected String direccion ;
    
    public Persona(int cedula, String nombres,String apellidos,String telefono, String direccion){
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.direccion=direccion;
    }
    
    public Persona(){
        
    }

    public int getCedula() {
        return cedula;
    }

    public boolean setCedula(int cedula) {
        this.cedula = cedula;
           return true;
    }

    public boolean setNombres(String nombres) {
        this.nombres = nombres;
        return true;
    }

    public boolean  setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return true;
    }

    public boolean setTelefono(String telefono) {
        this.telefono = telefono;
           return true;
    }

    public boolean setDireccion(String direccion) {
        this.direccion = direccion;
           return true;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
    
}
