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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        POS pos = new POS();
        Persona p = new Persona("40545665", "Pepe", "Gomez", "1112345678", "pepe@fakemail.com");
        TarjetaDeCredito t = new TarjetaDeCredito("FakeBank", "1234567890123456", 18000, p, EntidadFinanciera.VISA);

        System.out.println("Tarjeta antes del pago");
        System.out.println(t);

        System.out.println("Ticket tras pagar...");
        Ticket ticketGenerado = pos.efectuarPago(t, 10000, 5);
        System.out.println(ticketGenerado);

        System.out.println("Tarjeta despues del pago");
        System.out.println(t);

    }
    
}
