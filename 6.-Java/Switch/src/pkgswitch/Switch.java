/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Debora
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {
            
            
            int costoServicio=0;
            boolean repetir;
            do {
                System.out.println ("Por favor introduzca la zona: 1,2,3,4,5 ");
                int zona = leer.nextInt();
                System.out.println ("Por favor introduzca el peso del paquete en gramos ");
                int pesoPaquete = leer.nextInt();             
                repetir = true;
                
                if(pesoPaquete > 5000){
                    System.out.println("No es posible despachar su paquete por superar el máximo peso permitido 5kg");
                    System.out.println(" ");
                } else {
                    switch (zona){
                        case 1: {
                            costoServicio = pesoPaquete*110;
                        } break;
                        case 2: {
                            costoServicio = pesoPaquete*100;
                        } break;
                        case 3: {
                            costoServicio = pesoPaquete*120;
                        } break;
                        case 4: {
                            costoServicio = pesoPaquete*240;
                        } break;
                        case 5: {
                            costoServicio = pesoPaquete*270;
                        } break;
                        default: {
                            System.out.println("Esa zona no existe");
                            repetir = false;
                        } break;

                    }

                    System.out.println("El costo del despacho es " + costoServicio);
                    System.out.println(" ");
                }
                
            } while (!repetir);
            

            
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un valor correcto");
            leer.next();
        }
    }
    
}
