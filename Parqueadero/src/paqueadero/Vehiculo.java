/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueadero;

/**
 *
 * @author harld
 */
public class Vehiculo {
    private String placa;
    private String tipoVehiculo;
    private String fecha;
    private String horaIngreso;
    private String horaSalida;
    
    public Vehiculo(String placa, String tipoVehiculo, String fecha, String horaIngreso){
           this.placa=placa;
           this.tipoVehiculo=tipoVehiculo;
           this.fecha=fecha;
           this.horaIngreso=horaIngreso;
    }
    
    public Vehiculo(){
        
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public boolean setPlaca(String placa) {
        this.placa = placa;
        return true;
    }

    public boolean setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
        return true;
    }

    public boolean setFecha(String fecha) {
        this.fecha = fecha;
        return true;
    }

    public boolean setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
        return true;
    }

    public boolean setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
        return true;
    }
            
}
