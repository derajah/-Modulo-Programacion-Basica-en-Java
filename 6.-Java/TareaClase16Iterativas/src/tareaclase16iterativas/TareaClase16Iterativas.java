/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaclase16iterativas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Debora
 */
public class TareaClase16Iterativas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {
            //Ejercicios
            System.out.println ("Por favor elija el ejercicio que desea probar, \n 1: Número Amigos \n 2: Buscar número mayor \n 3: Acabados en dos");
            int ejercicio = leer.nextInt();
            switch(ejercicio){
                case 1: numerosAmigos(leer); break;
                case 2: buscarMayor(leer); break;
                case 3: acabadoDos(leer); break;
                default: System.out.println("Ese ejercicio aún no está programado. "); break;
            }
        } catch (InputMismatchException e) {
            
            System.out.println("Debes insertar un valor correcto");
            leer.next();
        }
    }
    
    private static void numerosAmigos(Scanner leer){

        
            System.out.println ("Ingrese primer número amigo ");
            long numero1=leer.nextLong();
            System.out.println ("Ingrese segundo número amigo ");
            long numero2=leer.nextLong();
            long suma = 0;
            long esMultiplo = 1;            
            
            while (esMultiplo <= (numero1/2) ){
                if(numero1%esMultiplo==0){
                    suma = suma + esMultiplo;
                }
                esMultiplo++;
            }
            
            if(suma == numero2 ){
                esMultiplo = 1;
                suma = 0;
                while (esMultiplo <= (numero2/2) ){
                    if(numero2%esMultiplo==0){
                        suma = suma + esMultiplo;
                    }
                    esMultiplo++;
                }
                
                if(suma == numero1){
                    System.out.println( numero1 + " y " + numero2 + " son buenos amigos ");
                } else {
                    System.out.println(numero1 + " y " + numero2 + " no se llevan bien ");
                }
                
            } else {
                System.out.println(numero1 + " y " + numero2 + " no se llevan bien ");
            }
            
    }
    private static void buscarMayor(Scanner leer){
          
        System.out.println ("Ingrese cantidad de números a evaluar ");
        int cantidad=leer.nextInt();
        System.out.println("Escriba número ");
        int elMayor = leer.nextInt();

        for(int i=2; i<=cantidad;i++){
            System.out.println("Escriba número ");
            int numero = leer.nextInt();
            if(numero > elMayor){
                elMayor = numero;
            }           
        }
        System.out.println("El número mayor es " + elMayor);
            

    }
    private static void acabadoDos(Scanner leer){
          
            int numero, contador = 0;  

            do{
                System.out.println ("Ingrese número positivo, si ingresa negativo programa se detiene ");
                numero=leer.nextInt();                
                if(numero%10==2){
                    contador++;
                }
            } while(numero >=0);
            System.out.println("Introdujo " + contador + " números acabados en 2.");
    }
    
}
