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
public class PooClase1 {

    static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Menu banco, \n 1:Crear cuenta ");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1: crearCuenta(); break;
            default: System.out.println("opción inexistente vuelva otro día"); break;
        }
        
        
    }
    
    public static void crearCuenta(){
        
        Cliente cli = new Cliente();
        leer.nextLine();
        System.out.println("ingrese rut cliente ");
        String rutCliente = leer.nextLine();
        System.out.println("ingrese nombre cliente ");
        String nombreCliente = leer.nextLine();
        System.out.println("ingrese apellido cliente ");
        String apellidoCliente = leer.nextLine();
        System.out.println("ingrese direccion cliente ");
        String direccionCliente = leer.nextLine();
        System.out.println("ingrese email cliente ");
        String emailCliente = leer.nextLine();
        System.out.println("ingrese telefono cliente ");
        long telefonoCliente = leer.nextLong();
        System.out.println("ingrese genero cliente ");
        char generoCliente = leer.next().charAt(0);
        System.out.println("ingrese estado Civil cliente ");
        char estadoCivilCliente = leer.next().charAt(0);
        System.out.println("ingrese edad cliente ");
        int edadCliente = leer.nextInt();
        cli.setRut(rutCliente);
        cli.setNombre(nombreCliente);
        cli.setApellido1(apellidoCliente);
        cli.setDireccion(direccionCliente);
        cli.setEmail(emailCliente);
        cli.setTelefono(telefonoCliente);
        cli.setGenero(generoCliente);
        cli.setEstadoCivil(estadoCivilCliente);
        cli.setEdad(edadCliente);
        
        System.out.println("ingrese tipo de cuenta, C: cuenta corriente, A: cuenta ahorro, V: cuenta vista ");
        char tipoCuenta = leer.next().charAt(0);
        long saldoInicial = 0;
        if(tipoCuenta == 'A'){
            System.out.println("ingrese saldo inicial");
            saldoInicial = leer.nextLong();
        }       
        CuentaBancaria ctaBancaria = new CuentaBancaria();       
        ctaBancaria.crearCuenta(tipoCuenta, saldoInicial, cli);     
        
        System.out.println("Cuenta creada exitosamente \n Cta Numero: " + ctaBancaria.numeroCuenta+"\n Tipo Cuenta: " + ctaBancaria.tipoCuenta + "\n Saldo: " + ctaBancaria.saldo+"\n" );
        System.out.println("Cliente: \n " + ctaBancaria.cliente.getNombre() +  " " + ctaBancaria.cliente.getApellido1());
        
    }
    
}
