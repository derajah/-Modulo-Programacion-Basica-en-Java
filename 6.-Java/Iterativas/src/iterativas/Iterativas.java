/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativas;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Debora
 */
public class Iterativas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {
            //Ejercicios
            System.out.println ("Por favor elija el ejercicio que desea probar, \n 1: Numeros 1 a 100 \n 2: Numeros Pares \n 3: Múltiplos");
            int ejercicio = leer.nextInt();
            switch(ejercicio){
                case 1: unoAl100yViceversa(); break;
                case 2: numerosPares(leer); break;
                case 3: multiplos(leer); break;
                default: System.out.println("Ese ejercicio aún no está programado. "); break;
            }
        } catch (InputMismatchException e) {
            
            System.out.println("Debes insertar un valor correcto");
            leer.next();
        }
        
        
        
    }
    
    private static void unoAl100yViceversa(){

            int numero=0;
            System.out.println ("Números del 1 al 100");
            do {
                numero++;
                System.out.print(numero + ",");
               
                
            } while (numero<100);
            System.out.println(" ");
            System.out.println ("Números del 100 al 1");
            do {
                System.out.print(numero + ",");                
                numero--;
            } while (numero>=1);
            System.out.println(" ");
  
        
    }
    
    private static void numerosPares(Scanner leer){

            System.out.println ("Ingrese la cantidad de números ");
            int numeroPar=2, N=leer.nextInt();
            
            do {
                System.out.print(numeroPar + ",");
                numeroPar+=2;
                
            } while (numeroPar<N);
            
//            System.out.println(" ");
//            
//            for(int i=2; i<N; i+=2){
//                System.out.print(i + ",");
//            }
            
  
        
    }
    
     private static void multiplos(Scanner leer){

            System.out.println ("Ingrese el número para validar múltiplo ");
            int numeros=1, N=leer.nextInt();
            
            do {
                if(numeros % N == 0){
                    System.out.print(numeros + ",");                    
                }
                numeros++;
                
            } while (numeros<=100);
              
        
    }
}
