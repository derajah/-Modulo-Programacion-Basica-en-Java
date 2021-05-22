/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativasclase2;

import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.Arrays;

/**
 *
 * @author Debora
 */
public class IterativasClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {
            //Ejercicios
            System.out.println ("Por favor elija el ejercicio que desea probar, \n 1: Promedio notas \n 2: Suma números Pares y Multi Impares \n 3: Perfectos");
            int ejercicio = leer.nextInt();
            switch(ejercicio){
                case 1: promedioNotas(leer); break;
                case 2: sumaParesMultipImpares(leer); break;
                case 3: numeroPerfecto(leer); break;
                default: System.out.println("Ese ejercicio aún no está programado. "); break;
            }
        } catch (InputMismatchException e) {
            
            System.out.println("Debes insertar un valor correcto");
            leer.next();
        }
    }
       
    private static void promedioNotas(Scanner leer){

        
            System.out.println ("Ingrese la cantidad de notas a promediar ");
            double promedio=0, suma=0;
            int n=leer.nextInt();
            
            if(n==0){
                System.out.println("Ingrese cantidad de notas > 0 \n");
                promedioNotas(leer);
            } else {
                for(int i=1; i<=n; i++){
                    System.out.println ("Ingrese nota "+ i);
                    double nota=leer.nextDouble();
                    suma = suma + nota;
                }
                promedio = suma/n;
                System.out.println("El promedio es " + promedio);
            }
            
    }
    private static void sumaParesMultipImpares(Scanner leer){
          
            System.out.println ("Ingrese la cantidad de números a operar ");
            int multiplicacion=1, suma=0, contPar=0, contImpar=0;
            int cantNumeros=leer.nextInt();
            
            for(int i=1; i<=cantNumeros; i++){
                System.out.println ("Ingrese número "+ i);
                int numero=leer.nextInt();
                
                if(numero%2==0){
                    suma = suma + numero;
                    contPar++;
                } else {
                    multiplicacion = multiplicacion*numero;
                    contImpar++;
                }
            }

            System.out.println("La suma de los pares es " + suma);
            System.out.println("La multiplicación de los impares es " + multiplicacion);
            
            System.out.println(contPar > contImpar ? "cantidad de pares es mayor que impares " + contPar + " > " + contImpar : (contPar == contImpar ? "cantidad de pares es igual que impares " + contPar + " = " + contImpar : "cantidad de pares es menor que impares " + contPar + " < " + contImpar));
    }
    private static void numeroPerfecto(Scanner leer){
          
            System.out.println ("Ingrese el número ");
            long numero=leer.nextLong();
            long suma = 0;
            long esMultiplo = 1;            
            
            while (esMultiplo <= (numero/2) ){
                if(numero%esMultiplo==0){
                    suma = suma + esMultiplo;
                }
                esMultiplo++;
            }

            if(suma == numero){
                System.out.println("El número " + numero + " es perfecto.");
            } else {
                System.out.println("El número "+numero+ " no es perfecto.");
            }
    }
    
//    private static <Long> Long[] push(Long[] array, Long item){
//        Long[] tmp = Arrays.copyOf(array, array.length + 1);
//        tmp[tmp.length - 1] = item;
//        return tmp;
//    }
}
