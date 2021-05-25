/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativasclase3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Debora
 */
public class IterativasClase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        try {
            //Ejercicios
            System.out.println ("Por favor elija el ejercicio que desea probar, \n 1: Número de la Suerte, \n 2: Validar hora, \n 3: Calculadora");
            int ejercicio = leer.nextInt();
            switch(ejercicio){
                case 1: numeroSuerte(leer); break;
                case 2: validarHora(leer);break;
                case 3: calculadora(leer);break;
                default: System.out.println("Ese ejercicio aún no está programado. "); break;
            }
        } catch (InputMismatchException e) {
            
            System.out.println("Debes insertar un valor correcto");
            leer.next();
        }
        
        
    }
    
    
    private static void numeroSuerte(Scanner leer2){

            leer2.nextLine();
            System.out.println ("Ingrese su fecha de nacimiento en formato dd-mm-yy ");
            String fechaNacimiento=leer2.nextLine();
            String[] partesFn = fechaNacimiento.split("-");
            Integer suma=0, numeroSuerte=0;
            
            for(int i=0; i<partesFn.length;i++){
                suma += Integer.parseInt(partesFn[i]);
            }
            
            while(suma >0){
                numeroSuerte += suma%10;
                suma = suma/10;
            }
            
            System.out.println("El numero de la suerte es " + numeroSuerte);
            
            
    }
    
    private static void validarHora(Scanner leer2){

        try {
            leer2.nextLine();
            System.out.println ("Ingrese hora en HH:mm:ss ");
            String hora=leer2.nextLine();

            LocalTime local = LocalTime.parse(hora);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String validar = local.format(formatter);
            System.out.println("Hora válida " + validar);
            
        } catch (Exception e) {
            System.out.println("Hora Inválida ");
        }
            
            
            
    }
    private static void calculadora(Scanner leer2){

        try {
            boolean repetir;
            do {
                System.out.println ("Seleccione operación \n 1:Suma, \n 2:Resta, \n 3:Multiplicación \n 4:División ");
                Integer operacion = leer2.nextInt();
                System.out.println();
                repetir = true;
                switch(operacion){
                    case 1: {
                        System.out.println("Selecciono Suma ");
                        System.out.println ("Quiere seleccionar otra operación 1:Si, 2:No ");
                        Integer otraVez = leer2.nextInt();
                        repetir = (otraVez != 1);
                    } break;
                    case 2: {
                        System.out.println("Selecciono Resta ");
                        System.out.println ("Quiere seleccionar otra operación 1:Si, 2:No ");
                        Integer otraVez = leer2.nextInt();
                        repetir = (otraVez != 1);
                    } break;
                    case 3: {
                        System.out.println("Selecciono Multiplacion ");
                        System.out.println ("Quiere seleccionar otra operación 1:Si, 2:No ");
                        Integer otraVez = leer2.nextInt();
                        repetir = (otraVez != 1);
                    } break;
                    case 4: {
                        System.out.println("Selecciono Suma ");
                        System.out.println ("Quiere seleccionar otra operación 1:Si, 2:No ");
                        Integer otraVez = leer2.nextInt();
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
            System.out.println("Hora Inválida ");
        }
            
            
            
    }
    
    
}
