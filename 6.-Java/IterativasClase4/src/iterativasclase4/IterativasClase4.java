/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativasclase4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

/**
 *
 * @author Debora
 */
public class IterativasClase4 {

    public static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            //Ejercicios
            System.out.println ("Por favor elija el ejercicio que desea probar, \n 1: Cajero, \n 2: Arreglo, \n 3: SumarArreglo, \n 4: Búsqueda Binaria");
            int ejercicio = leer.nextInt();
            switch(ejercicio){
                case 1: cajero(); break;
                case 2: arreglo();break;
                case 3: sumarArreglo(); break;
                case 4: busquedaBinaria(); break;
                default: System.out.println("Ese ejercicio aún no está programado. "); break;
            }
        } catch (InputMismatchException e) {
            
            System.out.println("Debes insertar un valor correcto");
            leer.next();
        }
        
        
    }
    
    
    private static void cajero(){

        try {
            boolean repetir;
            Integer saldoInicial = 3000;            
            
            do {
                System.out.println ("Seleccione operación \n 1:Consultar Saldo, \n 2:Abonar, \n 3:Girar ");
                Integer operacion = leer.nextInt();
                System.out.println();
                repetir = true;
                switch(operacion){
                    case 1: {
                        System.out.println("Su saldo es " + saldoInicial);
                        System.out.println ("Quiere seleccionar otra operación 1:Si, 2:No ");
                        Integer otraVez = leer.nextInt();
                        repetir = (otraVez != 1);
                    } break;
                    case 2: {
                        System.out.println("Cuanto desea abonar ");
                        Integer abono = leer.nextInt();
                        saldoInicial += abono;
                        System.out.println("Su nuevo saldo es " +  saldoInicial);
                        System.out.println ("Quiere seleccionar otra operación 1:Si, 2:No ");
                        Integer otraVez = leer.nextInt();
                        repetir = (otraVez != 1);
                    } break;
                    case 3: {
                        System.out.println("Cuando desea girar ");
                        Integer giro = leer.nextInt();
                        if(saldoInicial<giro){
                            System.out.println("Giro excede el máximo. Su saldo es " + saldoInicial);
                        } else {
                            saldoInicial -= giro;
                            System.out.println("Su nuevo saldo es " +  saldoInicial);
                        }

                        System.out.println ("Quiere seleccionar otra operación 1:Si, 2:No ");
                        Integer otraVez = leer.nextInt();
                        repetir = (otraVez != 1);
                    } break;
                    default: {
                        System.out.println("Esa operación no existe ");
                        System.out.println();
                        repetir = false;
                    } break;
                }
                
            } while (!repetir);
            
            
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error " + e);
        }
            
            
            
    }
    
    private static void arreglo(){
        
        int[] datos = new int[3];
        for(int i=0;i<datos.length;i++){
            System.out.println("Ingrese número entero");
            datos[i] = leer.nextInt();
        }
        System.out.println("El array tiene " + Arrays.toString(datos));
    }
    
    private static void sumarArreglo(){
        
        Integer[] datos = new Integer[3];
        for(int i=0;i<datos.length;i++){
            System.out.println("Ingrese número entero");
            datos[i] = leer.nextInt();
        }
        List<Integer> list = Arrays.asList(datos);
        Integer suma = list.stream().mapToInt(a->a).sum();
        System.out.println("La suma es " + suma);
    }
    
     private static void busquedaBinaria(){
        
        System.out.println("Ingrese tamaño del arreglo");
        int tamanoArray = leer.nextInt();
        int[] numeros = new int[tamanoArray];
        Random r = new Random();
        for(int t=0;t<tamanoArray;t++){
            numeros[t] = r.nextInt(50);
        }
        Arrays.sort(numeros);
        System.out.println("Acabó llenado, este sería el array " + Arrays.toString(numeros));
        System.out.println("Ingrese numero a buscar ");
        int buscar = leer.nextInt();
        
        int i=0,j = tamanoArray-1, k=0;
        
        do {
            k= (i+j)/2;
            if(numeros[k] <= buscar)  {
                i=k+1;
            }
            
            if(numeros[k] >= buscar){
                j=k-1;
            }
            

        } while (i<=j);
        
         System.out.println("El elemento " + buscar + " esta en la posición "  + k + " (recuerdo que arreglo comienza en 0)");
    }
}

