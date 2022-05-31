/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expos;

/**
 *
 * @author Metodos
 */
public class TarjetaDeCredito {
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;

    }
    
    public boolean tieneSaldoDisponible(double monto) {
        return saldo >= monto; 
    }

    public void descontar(double monto) {
        saldo = saldo - monto;
        // saldo -= monto;
    }

    public String nombreCompletoDeTitular() {
        return titular.nombreCompleto();
    }
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
}
