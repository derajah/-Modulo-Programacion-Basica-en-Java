/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolclasecuenta;

/**
 *
 * @author Debora
 */
public class Cuenta {
    
    private String numeroCuenta;
    private String nombreCliente;
    private double saldo;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    public Cuenta(){
        
    }
    
    public Cuenta(String numeroCuenta, double saldo, String nombreCliente){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public double abonar(String numeroCuenta, double abono ){
        // se debería buscar la cuenta con el numero de cuenta
        saldo = saldo + abono;
        return  saldo;        
    }
    
    public double girar(String numeroCuenta, double giro ){
        // se debería buscar la cuenta con el numero de cuenta
        if(validarGiro(numeroCuenta, giro)){
            saldo = saldo - giro;
        }
        
        return  saldo;        
    }
    
    private boolean validarGiro(String numeroCuenta, double giro){
        return !(giro > saldo);
    }
    
    public boolean transferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto){
        double nuevoSaldo = cuentaOrigen.girar(cuentaOrigen.nombreCliente, monto);
        boolean fueExitosa = false;
        if(cuentaOrigen.saldo >= nuevoSaldo){
            cuentaDestino.abonar(cuentaDestino.numeroCuenta, monto);
            fueExitosa = true;
        } 
        return fueExitosa;
    }
}
