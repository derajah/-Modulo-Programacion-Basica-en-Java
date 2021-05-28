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
            case 2: abonarCuenta(); break;
            default: System.out.println("opción inexistente vuelva otro día"); break;
        }
        
        
    }
    
    public static void crearCuenta(){
        
        try {
            
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
            System.out.println("ingrese genero cliente F o M");
            char generoCliente = leer.next().charAt(0);
            System.out.println("ingrese estado Civil cliente S, C o V");
            char estadoCivilCliente = leer.next().charAt(0);
            System.out.println("ingrese edad cliente ");
            int edadCliente = leer.nextInt();

            validacionesCrearCuenta(rutCliente, emailCliente, telefonoCliente, generoCliente, estadoCivilCliente, edadCliente);

            cli.setRut(rutCliente);
            cli.setNombre(nombreCliente);
            cli.setApellido1(apellidoCliente);
            cli.setDireccion(direccionCliente);
            cli.setEmail(emailCliente);
            cli.setTelefono(telefonoCliente);
            cli.setGenero(generoCliente);
            cli.setEstadoCivil(estadoCivilCliente);
            cli.setEdad(edadCliente);

            System.out.println("ingrese tipo de cuenta: ");
            for (TipoCuenta tc: TipoCuenta.values() ) {
                System.out.print(tc.toString()+ ":" + tc.getNombre()+"\n");   } 
            char tipoCuenta = leer.next().charAt(0);
            System.out.println(tipoCuenta);
            TipoCuenta tpoCta = asignarTipoCuenta(tipoCuenta);


            long saldoInicial = 0;
            if(tpoCta.getTipo() == 'A'){
                System.out.println("ingrese saldo inicial");
                saldoInicial = leer.nextLong();
            }  
            Ejecutivo ejecutivo = new Ejecutivo();
            ejecutivo.setNombre("Pedro");
            ejecutivo.setNombre("Olivares");
            CuentaBancaria ctaBancaria = new CuentaBancaria(tpoCta, saldoInicial, cli, ejecutivo);

            System.out.println();
            System.out.println("Cuenta creada exitosamente \n Cta Numero: " + ctaBancaria.numeroCuenta +"\n Tipo Cuenta: " + ctaBancaria.tipoCuenta + "\n Saldo: " + ctaBancaria.saldo+"\n" );
            System.out.println("Cliente: \n " + ctaBancaria.cliente.getNombre() +  " " + ctaBancaria.cliente.getApellido1() + "\n");
            System.out.println("Cliente: \n " + ctaBancaria.ejecutivo.getNombre() +  " " + ctaBancaria.ejecutivo.getApellido1()+ "\n");
            
        } catch (InputMismatchException e) {
            System.out.println("Ingrese dato correcto");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
    
    public static void abonarCuenta() {
        
    }
    
    
    private static TipoCuenta asignarTipoCuenta(char tipoSeleccionado){
        TipoCuenta tpoCta = TipoCuenta.V;
        switch(tipoSeleccionado) {
            case 'A':
                tpoCta = TipoCuenta.A;
                break;
            case 'V':
                tpoCta = TipoCuenta.V;
                break;
            case 'C':
                tpoCta = TipoCuenta.C;
                break;
            default:
                System.out.printf("No existe tipo de cuenta \n");
                break;
        }
        return tpoCta;
                
    }
    
    private static void validacionesCrearCuenta(String rutCliente, String emailCliente, long telefonoCliente, char generoCliente, char estadoCivilCliente, int edadCliente){
        
        boolean rutValido = Validacion.validarRut(rutCliente);
        boolean emailValido = Validacion.validarEmail(emailCliente);
        if(!emailValido)
            System.out.println(!rutValido && !emailValido ? "Rut y email inválido \n": (!rutValido ? "Rut Inválido": (!emailValido ? "Email inválido":"")));
    }
    
}
