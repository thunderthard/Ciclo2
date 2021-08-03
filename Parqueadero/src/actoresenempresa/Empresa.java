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
public class Empresa {

    protected String nombre;
    protected long nit;
    protected String direccion;
    protected ArrayList<Administrador> misAdministradores = new ArrayList<>();
    protected ArrayList<Cargo> cargosEmpresa = new ArrayList<>();
    protected Scanner entrada = new Scanner(System.in);

    public Empresa(String nombre, long nit, String direccion, Administrador primerAdministrador) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        misAdministradores.add(primerAdministrador);
    }

    public Empresa() {

    }

    public String getNombre() {
        return nombre;
    }

    public long getNit() {
        return nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Administrador> getMisAdministradores() {
        return misAdministradores;
    }

    public ArrayList<Cargo> getCargosEmpresa() {
        return cargosEmpresa;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public boolean setNombre(String nombre) {
        this.nombre = nombre;
        return true;
    }

    public boolean setNit(long nit) {
        this.nit = nit;
        return true;
    }

    public boolean setDireccion(String direccion) {
        this.direccion = direccion;
        return true;
    }

    public boolean setMisAdministradores(ArrayList<Administrador> misAdministradores) {
        this.misAdministradores = misAdministradores;
        return true;
    }

    public boolean setCargosEmpresa(ArrayList<Cargo> cargosEmpresa) {
        this.cargosEmpresa = cargosEmpresa;
        return true;
    }

    public boolean setEntrada(Scanner entrada) {
        this.entrada = entrada;
        return true;
    }
    
    public void crearCargo() {
        System.out.println("Ingrese el numero de funciones:");
        Scanner entrada = new Scanner(System.in);
        int funcionesEmpleado = Integer.parseInt(entrada.nextLine());
        ArrayList<String> funciones = new ArrayList<>();
        for (int j = 0; j < funcionesEmpleado; j++) {
            System.out.println("Ingrese la funcion:");
            funciones.add(entrada.nextLine());
        }
        System.out.println("Ingrese el Cargo:");
        String nombreCargo = entrada.nextLine();
        Cargo elCargo = new Cargo(nombreCargo, funciones);
        cargosEmpresa.add(elCargo);
    }

    public void crud() {
        System.out.println("1.para crear un empleado administrador");
        System.out.println("2.para editar empleado adminstrador");
        System.out.print("3.para Traer informacion del empleado administrativo");
        System.out.println("4.para borrar empleado adminitrativo");
        int id;
        int cedula;
        String nombres;
        String apellidos;
        String telefono;
        String direccion;
        boolean existe;
        double salario;
        int funcionesEmpleado;
        String nombreCargo;
        String categoria;
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

            Administrador nuevoAdministrador = new Administrador(categoria, id, salario, cedula, nombres, apellidos, telefono, direccion, elCargo);
            misAdministradores.add(nuevoAdministrador);
        } else if (entrada.nextLine().equals("2")) {
            System.out.println("Ingrese el id del empleado administrador:");
            id = Integer.parseInt(entrada.next());
            for (int i = 0; i < misAdministradores.size(); i++) {
                if (id == misAdministradores.get(i).getId()) {
                    Administrador administadorCambio = misAdministradores.get(i);
                    System.out.println("que desea modificar");
                    System.out.println("1. cedula");
                    System.out.println("2. nombres");
                    System.out.println("3. apellidos");
                    System.out.println("4. telefono");
                    System.out.println("5. direccion");
                    System.out.println("6. salario");
                    System.out.println("7. cargo");
                    System.out.println("7. categoria");
                    int operacion = Integer.parseInt(entrada.nextLine());
                    switch (operacion) {
                        case 1:
                            System.out.println("Ingrese el cedula:");
                            cedula = Integer.parseInt(entrada.nextLine());
                            administadorCambio.setCedula(id);
                            break;
                        case 2:
                            System.out.println("Ingrese los nombres:");
                            nombres = entrada.nextLine();
                            administadorCambio.setNombres(nombres);
                            break;
                        case 3:
                            System.out.println("Ingrese los apellidos:");
                            apellidos = entrada.nextLine();
                            administadorCambio.setApellidos(apellidos);
                            break;
                        case 4:
                            System.out.println("Ingrese el telefono:");
                            telefono = entrada.nextLine();
                            administadorCambio.setTelefono(telefono);
                            break;
                        case 5:
                            System.out.println("Ingrese la direccion:");
                            direccion = entrada.nextLine();
                            administadorCambio.setDireccion(direccion);
                            break;
                        case 6:
                            System.out.println("Ingrese el salario");
                            salario = Integer.parseInt(entrada.nextLine());
                            administadorCambio.setSalario(salario);
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
                            administadorCambio.setMiCargo(elCargo);
                            break;
                        case 8:
                            System.out.println("Ingrese la categoria:");
                            categoria = entrada.nextLine();
                            administadorCambio.setCategoria(categoria);
                            break;
                    }
                    misAdministradores.set(i, administadorCambio);
                }
            }
        } else if (entrada.nextLine().equals("3")) {
            System.out.println("Ingrese el id del usuario:");
            id = Integer.parseInt(entrada.nextLine());
            existe = true;
            for (int i = 0; i < misAdministradores.size(); i++) {
                if (misAdministradores.get(i).getId() == id) {
                    System.out.println("los nombres son: " + misAdministradores.get(i).getNombres());
                    System.out.println("los apellidos son: " + misAdministradores.get(i).getApellidos());
                    System.out.println("el telefono es: " + misAdministradores.get(i).getTelefono());
                    System.out.println("la direccion es: " + misAdministradores.get(i).getDireccion());
                    System.out.println("el cargo es: " + misAdministradores.get(i).getMiCargo().getNombre());
                    System.out.println("Las funciones son:");
                    for (int j = 0; j < misAdministradores.get(i).getMiCargo().getFunciones().size(); j++) {
                        System.out.println("*" + misAdministradores.get(j).getMiCargo().getFunciones().get(j));
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
            for (int i = 0; i < misAdministradores.size(); i++) {
                if (id == misAdministradores.get(i).getId()) {
                    misAdministradores.remove(i);
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

    public void init() {
        System.out.println("ingrese el nombre de la empresa");
        String nombre = entrada.nextLine();
        System.out.println("ingrese el nit de la empresa");
        long nit = Long.parseLong(entrada.nextLine());
        System.out.println("ingrese la direccion de la empresa");
        String direccionEmp = entrada.nextLine();
        System.out.println("Ingrese el id:");
        int id = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese la cedula:");
        int cedula = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese los nombres:");
        entrada.nextLine();
        String nombres = entrada.nextLine();
        System.out.println("Ingrese los apellidos:");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese los telefono:");
        String telefono = entrada.nextLine();
        System.out.println("Ingrese la direccion:");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese el salario:");
        double salario = Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese la categoria:");
        String categoria = entrada.nextLine();
        System.out.println("Ingrese el numero de funciones:");
        int funcionesEmpleado = Integer.parseInt(entrada.nextLine());
        ArrayList<String> funciones = new ArrayList<>();
        for (int j = 0; j < funcionesEmpleado; j++) {
            System.out.println("Ingrese la funcion:");
            funciones.add(entrada.nextLine());
        }
        System.out.println("Ingrese el Cargo:");
        String nombreCargo = entrada.nextLine();
        Cargo elCargo = new Cargo(nombreCargo, funciones);

        Administrador nuevoAdministrador = new Administrador(categoria, id, salario, cedula, nombres, apellidos, telefono, direccion, elCargo);
        misAdministradores.add(nuevoAdministrador);
        crud();
    }
}
