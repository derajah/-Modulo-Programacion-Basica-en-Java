/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercambiovalores;
import java.util.Scanner;

/**
 *
 * @author Debora
 */
public class IntercambioValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
        
            System.out.println ("Empezamos el programa");
            System.out.println ("Por favor introduzca un valor entero para A:");

            int valorA, valorB;
            Scanner entradaScanner = new Scanner(System.in);
            valorA = entradaScanner.nextInt();
            System.out.println ("Por favor introduzca un valor entero para B:");
            valorB = entradaScanner.nextInt();

            valorA=valorA+valorB;
            valorB=valorA-valorB;
            valorA=valorA-valorB;

            System.out.println ("El intercambio entre A y B es, nuevo valor de A: " + valorA + " nuevo valor de B: " + valorB);
            
        } catch (Exception e) {
            System.out.println("Si ingreso letras intente de nuevo con números");
            main(args);
        }
        
    }
    

}
