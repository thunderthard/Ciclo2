/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actoresenempresa;

import java.util.ArrayList;
import java.util.Scanner;
import paqueadero.Cliente;
import paqueadero.Ticket;
import paqueadero.Vehiculo;

/**
 *
 * @author harld
 */
public class Empleado extends Persona {

    protected long id;
    protected double salario;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    protected Cargo miCargo;

    public Empleado(int id, double salario, int cedula, String nombres, String apellidos, String telefono, String direccion, Cargo miCargo) {
        //super(cedula, nombres, apellidos, telefono, direccion);
        this.id = id;
        this.salario = salario;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.miCargo = miCargo;
    }

    public Empleado() {

    }

    public boolean setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
        return true;
    }

    public boolean setMiCargo(Cargo miCargo) {
        this.miCargo = miCargo;
        return true;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cargo getMiCargo() {
        return miCargo;
    }

    public boolean setId(long id) {
        this.id = id;
        return true;
    }

    public boolean setSalario(double salario) {
        this.salario = salario;
        return true;
    }

    public long getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public double generarCobro(Cliente miCliente) {
        int horas_en_el_parqueadero = Integer.parseInt(miCliente.getMiVehiculo().getHoraIngreso()) - Integer.parseInt(miCliente.getMiVehiculo().getHoraSalida());
        double cobro;
        if ("auto".equals(miCliente.getMiVehiculo().getTipoVehiculo())) {
            cobro = horas_en_el_parqueadero * 2000;
        } else {
            cobro = horas_en_el_parqueadero * 200;
        }
        return cobro;
    }

    public boolean recibirCliente(Cliente miCliente) {
        boolean cliente = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).equals(miCliente)) {
                cliente = true;
            }
        }
        return cliente;
    }

    public void crud() {
        System.out.println("1.para crear un cliente");
        System.out.println("2.para editar cliente");
        System.out.print("3.para Traer informacion de un cliente");
        System.out.println("4.para borrar cliente");
        int id;
        int cedula;
        String nombres;
        String apellidos;
        String telefono;
        String direccion;
        Scanner entrada = new Scanner(System.in);
        boolean existe;
        if (entrada.nextLine().equals("1")) {
            System.out.println("Ingrese el id:");
            id = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese la cedula:");
            cedula = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese los nombres:");
            nombres = entrada.nextLine();
            System.out.println("Ingrese los apellidos:");
            apellidos = entrada.nextLine();
            System.out.println("Ingrese los telefono:");
            telefono = entrada.nextLine();
            System.out.println("Ingrese la direccion:");
            direccion = entrada.nextLine();

            Ticket nuevoTikcet = new Ticket(1);

            System.out.println("Ingrese la placa");
            String placa = entrada.nextLine();
            System.out.println("Ingrese el tipo de vehiculo");
            String tipo = entrada.nextLine();
            System.out.println("Ingrese la fecha dd/mm/aaaa:");
            String fecha = entrada.nextLine();
            System.out.println("Ingrese la hora de ingreso");
            String hora_inicio = entrada.nextLine();
            Vehiculo nuevoVehiculo = new Vehiculo(placa, tipo, fecha, hora_inicio);

            Cliente nuevoCliente = new Cliente(id, cedula, nombres, apellidos, telefono, direccion, nuevoTikcet, nuevoVehiculo);
            clientes.add(nuevoCliente);
        } else if (entrada.nextLine().equals("2")) {
            System.out.println("Ingrese el id del usuario:");
            id = Integer.parseInt(entrada.nextLine());
            for (int i = 0; i < clientes.size(); i++) {
                if (id == clientes.get(i).getId()) {
                    Cliente clienteCambio = clientes.get(i);
                    System.out.println("que desea modificar");
                    System.out.println("1. cedula");
                    System.out.println("2. nombres");
                    System.out.println("3. apellidos");
                    System.out.println("4. telefono");
                    System.out.println("5. direccion");
                    System.out.println("6. placa");
                    System.out.println("7. tipo de vehiculo");
                    int operacion = Integer.parseInt(entrada.nextLine());
                    switch (operacion) {
                        case 1:
                            System.out.println("Ingrese el cedula:");
                            cedula = Integer.parseInt(entrada.nextLine());
                            clienteCambio.setCedula(id);
                            break;
                        case 2:
                            System.out.println("Ingrese los nombres:");
                            nombres = entrada.nextLine();
                            clienteCambio.setNombres(nombres);
                            break;
                        case 3:
                            System.out.println("Ingrese los apellidos:");
                            apellidos = entrada.nextLine();
                            clienteCambio.setApellidos(apellidos);
                            break;
                        case 4:
                            System.out.println("Ingrese el telefono:");
                            telefono = entrada.nextLine();
                            clienteCambio.setTelefono(telefono);
                            break;
                        case 5:
                            System.out.println("Ingrese la direccion:");
                            direccion = entrada.nextLine();
                            clienteCambio.setDireccion(direccion);
                            break;
                        case 6:
                            System.out.println("Ingrese la placa");
                            String placa = entrada.nextLine();
                            clienteCambio.getMiVehiculo().setPlaca(placa);
                            break;
                        case 7:
                            System.out.println("Ingrese el tipo de vehiculo");
                            String tipo = entrada.nextLine();
                            clienteCambio.getMiVehiculo().setTipoVehiculo(tipo);
                            break;
                    }
                    clientes.set(i, clienteCambio);
                }
            }
        } else if (entrada.nextLine().equals("3")) {
            System.out.println("Ingrese el id del usuario:");
            id = Integer.parseInt(entrada.nextLine());
            existe = true;
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getId() == id) {
                    System.out.println("los nombres son: " + clientes.get(i).getNombres());
                    System.out.println("los apellidos son: " + clientes.get(i).getApellidos());
                    System.out.println("el telefono es: " + clientes.get(i).getTelefono());
                    System.out.println("la direccion es: " + clientes.get(i).getDireccion());
                    System.out.println("la placa es: " + clientes.get(i).getMiVehiculo().getPlaca());
                    System.out.println("el tipo de vehiculo es: " + clientes.get(i).getMiVehiculo().getTipoVehiculo());
                    System.out.println("la fecha de ingreso del vehiculo es: " + clientes.get(i).getMiVehiculo().getFecha());
                    System.out.println("la hora de ingreso del vehiculo es: " + clientes.get(i).getMiVehiculo().getHoraIngreso());
                    System.out.println("la hora de salida del vehiculo es: " + clientes.get(i).getMiVehiculo().getHoraSalida());
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
            for (int i = 0; i < clientes.size(); i++) {
                if (id == clientes.get(i).getId()) {
                    clientes.remove(i);
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
