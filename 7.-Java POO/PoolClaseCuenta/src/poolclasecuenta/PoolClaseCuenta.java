/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Evidencia "DÍA 6 SEMANA 6" del 03/06:
Crear una clase Cuenta para representar una cuenta bancaria. Los datos de la cuenta son: nombre del cliente (String), número de cuenta (String) y saldo (double). Con los siguientes métodos:
-	Constructor por defecto.
-	Constructor con todos los parámetros.
-	Métodos setters/getters para asignar y obtener los datos de la cuenta.
-	Métodos depósito y giro (debe comprobar que hay saldo suficiente).
-	Método transferencia que permita pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya dinero suficiente para poder hacerla
 */
package poolclasecuenta;
import java.util.Scanner;
/**
 *
 * @author Debora
 */
public class PoolClaseCuenta {

    static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cu = new Cuenta();
        System.out.println("Ingrese nombre cliente ");
        String nombreCliente = leer.nextLine();
        System.out.println("Ingrese nro cuenta cliente ");
        String nroCuenta = leer.nextLine();
        System.out.println("Ingrese saldo inicial");
        double saldoInicial = leer.nextDouble();
        cu.setNombreCliente(nombreCliente);
        cu.setNumeroCuenta(nroCuenta);
        cu.setSaldo(saldoInicial);
        System.out.println("");
        menu(cu);
        
    }
    
    private static void menu(Cuenta cu){
        System.out.println("Menu banco, \n 1: Depositar en cuenta \n 2: Girar de cuenta \n 3: Transferir ");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1: abonarCuenta(cu); break;
            case 2: girarCuenta(cu); break;
            case 3: transferir(cu);break;
            default: System.out.println("opción inexistente vuelva otro día"); break;
        }
    }
    private static void repetir(Cuenta cta){
        System.out.println();
        System.out.println("Desea otra realizar otra transacción? 1.Si 2.No");
        int opcion = leer.nextInt();
        if(opcion==1) menu(cta);
        else System.out.println("Gracias por operar con Banca Rota");
    }
    
    public static void abonarCuenta(Cuenta cta) {
        leer.nextLine();
        System.out.println("Ingrese monto de abono ");
        double abono = leer.nextDouble();
        double saldo = cta.abonar(cta.getNumeroCuenta(), abono);
        System.out.println("Su nuevo saldo es " + saldo);
        repetir(cta);
    }
    
    public static void girarCuenta(Cuenta cta) {

        boolean repetir = false;
        leer.nextLine();
        while (!repetir) {
            
            System.out.println("Ingrese monto a girar ");
            double giro = leer.nextDouble();

            double saldo = cta.girar(cta.getNumeroCuenta(), giro);
            if(saldo != 0 && saldo == cta.getSaldo()){
                System.out.println("Saldo no es suficiente: " + cta.getSaldo() + ", intente monto más bajo");
            }
            else{
                System.out.println("Su nuevo saldo es " + saldo);
                repetir = true;
                repetir(cta);
            }            
        }
    }
    
    public static void transferir(Cuenta cta){
        
        leer.nextLine();
        System.out.println("Ingrese nombre destinatario ");
        String nombreDestinatario = leer.nextLine();
        System.out.println("Ingrese numero cuenta destino ");
        String nroCtaDestino = leer.nextLine();
        Cuenta ctaDestino = new Cuenta(nroCtaDestino, 0, nombreDestinatario);
                
        System.out.println("Ingrese monto transferencia");
        double monto = leer.nextDouble();
        boolean pudoTransferir = cta.transferir(cta, ctaDestino, monto);
        if(pudoTransferir)
            System.out.println("Su nuevo saldo es " + cta.getSaldo());
        else
            System.out.println("Saldo insuficiente");
        
        repetir(cta);
        
    }
    
}
