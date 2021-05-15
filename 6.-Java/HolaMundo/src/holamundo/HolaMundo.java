/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.Scanner;

/**
 *
 * @author Debora
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //tipo de dato luego nombre de la variable
        
        System.out.println ("Empezamos el programa");
        System.out.println ("Por favor introduzca el numero de notas:");

        int totalNotas;
        Scanner entradaScanner = new Scanner(System.in);
        totalNotas = entradaScanner.nextInt();
        
        if(totalNotas == 0){
            System.out.println ("Debe ingresar numero mayor que 0 ");
            main(args);
        } else {
            int Suma=0, Promedio, nota;
            for(int i=1;i<=totalNotas;i++){
                System.out.println ("Por favor introduzca la nota " + i);
                nota = entradaScanner.nextInt();
                Suma = Suma + nota;
            }

            Promedio = Suma/totalNotas;

            System.out.println("El promedio es " + Promedio);
        
        }
                
    }
    
}
