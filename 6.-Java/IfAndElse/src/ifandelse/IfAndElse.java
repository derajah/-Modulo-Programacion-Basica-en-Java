/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifandelse;
import java.util.Scanner;

/**
 *
 * @author Debora
 */
public class IfAndElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        //ejercicio 1
        System.out.println ("Ejercicio1: Costo de la consulta con doctor T. Mata Lozano");
        String mensajeDoctor = doctorTMata(leer);         
        System.out.println (mensajeDoctor);
        System.out.println (" ");
        //ejercicio 2
        System.out.println ("Ejercicio2: Ganancia de uvas");
        String mensajeEnvio = costoUvas(leer);
        System.out.println(mensajeEnvio);
        System.out.println (" ");
        //ejercicio 1
        System.out.println ("Ejercicio3: Número par e impar");
        String mensajeParImpar = esParImpar(leer);
        System.out.println(mensajeParImpar);
        System.out.println (" ");
        
    }
    
    private static String doctorTMata(Scanner leer){
        
        System.out.println ("Por favor introduzca el número de la consulta ");
        int nroConsulta = leer.nextInt();
        int CostoConsulta, CostoTotal = 0;
        if(nroConsulta <=3){
            CostoConsulta = 200;
            CostoTotal = CostoConsulta*nroConsulta;
        } else{
            
            if(nroConsulta > 3 && nroConsulta <= 5){
                CostoConsulta = 150;
                CostoTotal = 600 + (nroConsulta-3)*CostoConsulta;
            } else {
                
                if(nroConsulta > 5 && nroConsulta <=8){
                    CostoConsulta = 100;
                    CostoTotal = 900 + (nroConsulta-5)*CostoConsulta;
                } else {
                    CostoConsulta = 50;
                    CostoTotal = 1200 + (nroConsulta-8)*CostoConsulta;
                }                
            }            
        }
        return "Total de la cita es " + CostoConsulta + " y el costo total del tratamiento es "+ CostoTotal;
    }
    
    private static String costoUvas(Scanner leer){
        
        System.out.println ("Por favor introduzca el tipo de uva A o B ");
        char tipoUva = leer.next().charAt(0);
        System.out.println ("Por favor introduzca el tamaño 1 o 2 ");
        int tamañoUva = leer.nextInt();
        System.out.println ("Por favor introduzca cantidad de kilos ");
        int kilosUva = leer.nextInt();
        int totalGanancias = 0;
        int PrecioInicial = 300;
        
        if(tipoUva == 'A'){
            switch (tamañoUva){
                
                case 1:   totalGanancias=(PrecioInicial+20)*kilosUva; break;
                case 2:   totalGanancias=(PrecioInicial+30)*kilosUva; break;
                default:  totalGanancias= 0; break;
            } 
        } else {
            if(tipoUva == 'B'){
                switch (tamañoUva){

                    case 1:   totalGanancias=(PrecioInicial-30)*kilosUva; break;
                    case 2:   totalGanancias=(PrecioInicial-50)*kilosUva; break;
                    default:  totalGanancias= 0; break;
                } 
            } 
        }
        
        return "Las ganancias son " + totalGanancias;
        
    }

    private static String esParImpar(Scanner leer){
       
        System.out.println ("Por favor introduzca el número ");
        int numero = leer.nextInt();
        
        if(numero%2==0){
            return "El numero es par ";
        } else {
            return "El numero es impar ";
        }
    }
}
