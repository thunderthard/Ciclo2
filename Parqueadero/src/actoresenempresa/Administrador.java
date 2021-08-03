/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actoresenempresa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author harld
 */
public class Administrador extends Empleado {

    private String categoria;
    private ArrayList<Empleado> subordinados = new ArrayList<>();

    public Administrador(String categoria, int id, double salario, int cedula, String nombres, String apellidos, String telefono, String direccion, Cargo miCargo) {
        //super(id, salario ,cedula, nombres, apellidos, telefono, direccion);
        this.categoria = categoria;
        this.id = id;
        this.salario = salario;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.miCargo = miCargo;
    }

    public Administrador() {

    }

    public String getCategoria() {
        return categoria;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public boolean setCategoria(String categoria) {
        this.categoria = categoria;
        return true;
    }

    public boolean setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
        return true;
    }
    
    @Override
    public void crud() {
        System.out.println("1.para crear un empleado");
        System.out.println("2.para editar empleado");
        System.out.print("3.para Traer informacion de un empleado");
        System.out.println("4.para borrar empleado");
        int id;
        int cedula;
        String nombres;
        String apellidos;
        String telefono;
        String direccion;
        Scanner entrada = new Scanner(System.in);
        boolean existe;
        double salario;
        int funcionesEmpleado;
        String nombreCargo;
        if (entrada.nextLine().equals("1")) {
            System.out.println("Ingrese el id:");
            id = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese la cedula:");
            cedula = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese los nombres:");
            entrada.nextLine();
            nombres = entrada.nextLine();
            System.out.println("Ingrese los apellidos:");
            apellidos = entrada.nextLine();
            System.out.println("Ingrese los telefono:");
            telefono = entrada.nextLine();
            System.out.println("Ingrese la direccion:");
            direccion = entrada.nextLine();
            System.out.println("Ingrese el salario:");
            salario = Double.parseDouble(entrada.nextLine());
            System.out.println("Ingrese la categoria:");
            categoria = entrada.nextLine();
            System.out.println("Ingrese el numero de funciones:");
            funcionesEmpleado = Integer.parseInt(entrada.nextLine());
            ArrayList<String> funciones = new ArrayList<>();
            for (int j = 0; j < funcionesEmpleado; j++) {
                System.out.println("Ingrese la funcion:");
                funciones.add(entrada.nextLine());
            }
            System.out.println("Ingrese el Cargo:");
            nombreCargo = entrada.nextLine();
            Cargo elCargo = new Cargo(nombreCargo, funciones);

            Empleado nuevoEmpleado = new Empleado(id, salario, cedula, nombres, apellidos, telefono, direccion, elCargo);
            subordinados.add(nuevoEmpleado);
        } else if (entrada.nextLine().equals("2")) {
            System.out.println("Ingrese el id del empleado:");
            id = Integer.parseInt(entrada.nextLine());
            for (int i = 0; i < subordinados.size(); i++) {
                if (id == subordinados.get(i).getId()) {
                    Empleado subordinadoCambio = subordinados.get(i);
                    System.out.println("que desea modificar");
                    System.out.println("1. cedula");
                    System.out.println("2. nombres");
                    System.out.println("3. apellidos");
                    System.out.println("4. telefono");
                    System.out.println("5. direccion");
                    System.out.println("6. salario");
                    System.out.println("7. cargo");
                    int operacion = Integer.parseInt(entrada.nextLine());
                    switch (operacion) {
                        case 1:
                            System.out.println("Ingrese el cedula:");
                            cedula = Integer.parseInt(entrada.nextLine());
                            subordinadoCambio.setCedula(id);
                            break;
                        case 2:
                            System.out.println("Ingrese los nombres:");
                            nombres = entrada.nextLine();
                            subordinadoCambio.setNombres(nombres);
                            break;
                        case 3:
                            System.out.println("Ingrese los apellidos:");
                            apellidos = entrada.nextLine();
                            subordinadoCambio.setApellidos(apellidos);
                            break;
                        case 4:
                            System.out.println("Ingrese el telefono:");
                            telefono = entrada.nextLine();
                            subordinadoCambio.setTelefono(telefono);
                            break;
                        case 5:
                            System.out.println("Ingrese la direccion:");
                            direccion = entrada.nextLine();
                            subordinadoCambio.setDireccion(direccion);
                            break;
                        case 6:
                            System.out.println("Ingrese el salario");
                            salario = Double.parseDouble(entrada.nextLine());
                            subordinadoCambio.setSalario(salario);
                            break;
                        case 7:
                            System.out.println("Ingrese el numero de funciones:");
                            funcionesEmpleado = Integer.parseInt(entrada.nextLine());
                            ArrayList<String> funciones = new ArrayList<>();
                            for (int j = 0; j <= funcionesEmpleado; j++) {
                                System.out.println("Ingrese la funcion:");
                                funciones.add(entrada.nextLine());
                            }
                            System.out.println("Ingrese el Cargo:");
                            nombreCargo = entrada.nextLine();
                            Cargo elCargo = new Cargo(nombreCargo, funciones);
                            subordinadoCambio.setMiCargo(elCargo);
                            break;
                    }
                    subordinados.set(i, subordinadoCambio);
                }
            }
        } else if (entrada.next().equals("3")) {
            System.out.println("Ingrese el id del usuario:");
            id = Integer.parseInt(entrada.nextLine());
            existe = true;
            for (int i = 0; i < subordinados.size(); i++) {
                if (subordinados.get(i).getId() == id) {
                    System.out.println("los nombres son: " + subordinados.get(i).getNombres());
                    System.out.println("los apellidos son: " + subordinados.get(i).getApellidos());
                    System.out.println("el telefono es: " + subordinados.get(i).getTelefono());
                    System.out.println("la direccion es: " + subordinados.get(i).getDireccion());
                    System.out.println("el cargo es: " + subordinados.get(i).getMiCargo().getNombre());
                    System.out.println("Las funciones son:");
                    for (int j = 0; j < subordinados.get(i).getMiCargo().getFunciones().size(); j++) {
                        System.out.println("*" + subordinados.get(j).getMiCargo().getFunciones().get(j));
                    }
                    existe = false;
                }
                if (existe) {
                    System.out.println("no existe el cliente");
                }
            }
        } else if (entrada.nextLine().equals("4")) {
            System.out.println("Ingrese el id del usuario:");
            id = Integer.parseInt(entrada.nextLine());
            existe = true;
            for (int i = 0; i < subordinados.size(); i++) {
                if (id == subordinados.get(i).getId()) {
                    subordinados.remove(i);
                    existe = false;
                }
            }
            if (existe) {
                System.out.println("no existe el cliente");
            }
        } else {
            System.out.println("Error no ingreso una opcion valida");
        }
    }
}
