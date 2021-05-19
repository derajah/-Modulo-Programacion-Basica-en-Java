/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosvarios;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Debora
 */
public class EjerciciosVarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicios
        Scanner leer = new Scanner(System.in);
        System.out.println ("Por favor elija el ejercio que desea probar, 1: Mayor3Numeros - 2:ChismeFone - 3:usoDeSwitch");
        int ejercicio = leer.nextInt();
        switch(ejercicio){
            case 1: mayorDe3(leer); break;
            case 2: chismeFone(leer); break;
            case 3: usoDeSwitch(leer); break;
            default: System.out.println("Ese ejercicio aún no está programado. "); break;
        }
        
        
    }
    
    private static void mayorDe3(Scanner leer){
        int numeros[];
        numeros = new int[3];
        for(int i=0; i<3; i++){
            System.out.println("Ingrese el número " + (i+1));
            numeros[i]= leer.nextInt();
        }
        int mayor = numeros[0];
        for(int i=1; i<3; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
    
    private static void chismeFone(Scanner leer){
        System.out.println ("Por favor introduzca el día que hará la llamada, 1:Lunes a Sábado, 2:Domingo ");
        int diaLlamada = leer.nextInt();
        System.out.println ("Por favor introduzca cantidad de minutos ");
        double minutos = leer.nextDouble();
        System.out.println ("Por favor introduzca el turno, M:matutino y V:vespertino ");
        char turno = leer.next().charAt(0);
        double costoLlamada = 0;
        if(minutos > 10){
            costoLlamada = 850 + (minutos - 10)*50;
        } else{
            
            if(minutos <= 5){
                costoLlamada = minutos*100;
            } else {
                
                if(minutos > 5 && minutos <=8){
                    costoLlamada = 500 + (minutos-5)*80;
                } else {
                    costoLlamada = 710 + (minutos-8)*70;
                }                
            }            
        }
        if(diaLlamada == 2){
            costoLlamada = costoLlamada*1.03;
        } else {
            if(turno=='V'){
                costoLlamada = costoLlamada*1.1;
            } else {
                costoLlamada = costoLlamada*1.15;
            }
        }
        System.out.println("Total de la llamada es " + costoLlamada);
    }
    
    private static void usoDeSwitch(Scanner leer){
        try {
            
            
            int costoTotal=0,costoPersona = 0;
            boolean repetir = true;
            do {
                System.out.println ("Por favor introduzca la cantidad de alumnos ");
                int cantidadAlumnos = leer.nextInt();
                System.out.println ("Por favor introduzca la cantidad de kilometros ");
                int km = leer.nextInt();
                System.out.println ("Por favor introduzca el autobus a cotizar A, B o C  ");
                char bus = leer.next().charAt(0);
                repetir = true;
                
                switch (bus){
                    case 'A': {
                        if(cantidadAlumnos >=20){
                            costoTotal = cantidadAlumnos*km*200;
                            costoPersona = 200*km;
                        } else {
                            costoTotal = 20*km*200;
                            costoPersona = costoTotal/cantidadAlumnos;
                        }
                    } break;
                    case 'B': {
                        if(cantidadAlumnos >=20){
                            costoTotal = cantidadAlumnos*km*250;
                            costoPersona = 250*km;
                        } else {
                            costoTotal = 20*km*250;
                            costoPersona = costoTotal/cantidadAlumnos;
                        } 
                    } break;
                    case 'C': {
                        if(cantidadAlumnos >=20){
                            costoTotal = cantidadAlumnos*km*300;
                            costoPersona = 250*km;
                        } else {
                            costoTotal = 20*km*300;
                            costoPersona = costoTotal/cantidadAlumnos;
                        } 
                    } break;
                    default: {
                        System.out.println("Ese bus no existe, elija otro");
                        repetir = false;
                    } break;

                }
                
                System.out.println("El costo para el autobus " + bus + " es " + costoTotal + " y por persona es " + costoPersona);
                System.out.println(" ");
            } while (!repetir);
            

            
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un valor correcto");
            leer.next();
        }
        
        
        
  
        
    }
    
    
}
