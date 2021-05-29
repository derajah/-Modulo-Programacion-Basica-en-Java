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
        
        
        System.out.println("Menu banco, \n 1: Crear cuenta \n 2: Abonar en cuenta \n 3: Girar ");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1: crearCuenta(); break;
            case 2: abonarCuenta(); break;
            case 3: girarCuenta(args); break;
            default: System.out.println("opción inexistente vuelva otro día"); break;
        }
        
        
    }
    
    public static void crearCuenta(){
        
        try {
            
            Cliente cli = new Cliente();
            leer.nextLine();
            System.out.println("Ingrese rut cliente ");
            String rutCliente = leer.nextLine();
            System.out.println("Ingrese nombre cliente ");
            String nombreCliente = leer.nextLine();
            System.out.println("Ingrese apellido cliente ");
            String apellidoCliente = leer.nextLine();
            System.out.println("Ingrese direccion cliente ");
            String direccionCliente = leer.nextLine();
            System.out.println("Ingrese email cliente ");
            String emailCliente = leer.nextLine();
            System.out.println("Ingrese telefono cliente formato +569 12345678");
            String telefonoCliente = leer.nextLine();
            System.out.println("Ingrese genero cliente (F o M)");
            char generoCliente = leer.next().charAt(0);
            System.out.println("Ingrese estado Civil cliente (S, C o V)");
            char estadoCivilCliente = leer.next().charAt(0);
            System.out.println("Ingrese edad cliente ");
            int edadCliente = leer.nextInt();

            boolean validador = validacionesCrearCuenta(rutCliente, emailCliente, telefonoCliente, generoCliente, estadoCivilCliente, edadCliente);

            if(!validador) crearCuenta();
            
            
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
            ejecutivo.setApellido1("Olivares");
            CuentaBancaria ctaBancaria = new CuentaBancaria(tpoCta, saldoInicial, cli, ejecutivo);

            System.out.println();
            System.out.println("Cuenta creada exitosamente \n Cta Numero: " + ctaBancaria.numeroCuenta +"\n Tipo Cuenta: " + ctaBancaria.tipoCuenta + "\n Saldo: " + ctaBancaria.saldo+"\n" );
            System.out.println("Cliente: \n " + ctaBancaria.cliente.getNombre() +  " " + ctaBancaria.cliente.getApellido1() + "\n");
            System.out.println("Ejecutivo: \n " + ctaBancaria.ejecutivo.getNombre() +  " " + ctaBancaria.ejecutivo.getApellido1()+ "\n");
            
        } catch (InputMismatchException e) {
            System.out.println("Ingrese dato correcto");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
    
    public static void abonarCuenta() {
        leer.nextLine();
        System.out.println("Ingrese numero de cuenta ");
        String cuenta = leer.nextLine();
        System.out.println("Ingrese monto de abono ");
        long abono = leer.nextLong();
        CuentaBancaria cta = new CuentaBancaria();
        cta.saldo = 30000;
        long saldo = cta.abonar(cuenta, abono);
        System.out.println("Su nuevo saldo es " + saldo);
        
    }
    
    public static void girarCuenta(String[] args) {
        leer.nextLine();
        System.out.println("Ingrese numero de cuenta ");
        String cuenta = leer.nextLine();
        System.out.println("Ingrese monto a girar ");
        long giro = leer.nextLong();
        CuentaBancaria cta = new CuentaBancaria();
        cta.saldo = 30000;
        long saldo = cta.girar(cuenta, giro);
        if(saldo == cta.saldo){
            System.out.println("Saldo no es suficiente: " + saldo + ", intente monto más bajo");
            main(args);
        }
        else
             System.out.println("Su nuevo saldo es " + saldo);
        
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
    
    private static boolean validacionesCrearCuenta(String rutCliente, String emailCliente, String telefonoCliente, char generoCliente, char estadoCivilCliente, int edadCliente){
        
        boolean rutValido = Validacion.validarRut(rutCliente);
        boolean emailValido = Validacion.validarEmail(emailCliente);
        boolean telefonoValido = Validacion.validarTelefono(telefonoCliente);
        boolean generoValido = Validacion.validarGenero(generoCliente);
        boolean estadoValido = Validacion.validarEstadoCivil(estadoCivilCliente);
        boolean edadValido = Validacion.validarEdad(edadCliente);
        
        Map<String, Boolean> map = new HashMap<>(); //uso de diamond operator
        map.put("Rut", rutValido);
        map.put("Email", emailValido);
        map.put("Teléfono", telefonoValido);
        map.put("Genero", generoValido);
        map.put("Estado Civil", estadoValido);
        map.put("Edad", edadValido);
        
        String mensaje = "";
        boolean validador = true;
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            final boolean valorActual = entry.getValue();
            if (!valorActual){
                mensaje= mensaje + entry.getKey()+",";
            }
        }
        if(!"".equals(mensaje)){
            System.out.println(mensaje + " son inválidos ");
            validador = false;
        }
               
        return validador;
       
    }
    
}
