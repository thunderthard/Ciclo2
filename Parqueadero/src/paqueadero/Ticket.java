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
public class Ticket {
    private long id;
    private double valoraPagar=0d;
    public Ticket(int id){
        this.id=id;
    }

    public long getId() {
        return id;
    }

    public double getValoraPagar() {
        return valoraPagar;
    }

    public boolean setId(long id) {
        this.id = id;
        return true;
    }

    public boolean setValoraPagar(double valoraPagar) {
        this.valoraPagar = valoraPagar;
        return true;
    }
    
}
