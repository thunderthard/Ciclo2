/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actoresenempresa;

import java.util.ArrayList;

/**
 *
 * @author harld
 */
public class Cargo {
 private String nombre;
 private  ArrayList<String> funciones =new ArrayList<>();
 
 public Cargo(String nombre,ArrayList funciones){
     this.nombre=nombre;
     this.funciones=funciones;
 }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getFunciones() {
        return funciones;
    }

    public boolean setNombre(String nombre) {
        this.nombre = nombre;
        return true;
    }

    public boolean setFunciones(ArrayList<String> funciones) {
        this.funciones = funciones;
        return true;
    }
 
}
