/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclase1;

import java.util.*;
/**
 *
 * @author Debora
 */
public class CuentaBancaria {
    
    public String numeroCuenta;
    TipoCuenta tipoCuenta;
    public long saldo;
    Cliente cliente;
    Ejecutivo ejecutivo;
    
    public CuentaBancaria(){
        
    }
    
    public CuentaBancaria(TipoCuenta tipoCuenta, long saldoInicial, Cliente cliente, Ejecutivo ejecutivo){
        Random rnd = new Random(); 
        numeroCuenta="";
        for(int i=0; i<12; i++){
            numeroCuenta = numeroCuenta + String.valueOf(rnd.nextInt(10));
        }
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldoInicial;
        this.cliente = cliente;
        this.ejecutivo = ejecutivo;
    }
    
//    public void crearCuenta(char tipoCuenta, long saldoInicial, Cliente cliente){
//        
//        Random rnd = new Random();        
//        for(int i=0; i<12; i++){
//            numeroCuenta = numeroCuenta + String.valueOf(rnd.nextInt(10));
//        }
//        this.tipoCuenta = tipoCuenta;
//        this.saldo = saldoInicial;
//        this.cliente = cliente;
//    }

    public long abonar(String numeroCuenta, long abono ){
        // se debería buscar la cuenta con el numero de cuenta
        saldo = saldo + abono;
        return  saldo;        
    }
    
    public long girar(String numeroCuenta, long giro ){
        // se debería buscar la cuenta con el numero de cuenta
        saldo = saldo - giro;
        return  saldo;        
    }
    
    public boolean validarGiro(String numeroCuenta, long giro){
        return !(giro > saldo);
    }
}
