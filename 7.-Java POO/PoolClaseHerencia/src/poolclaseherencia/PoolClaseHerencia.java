/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Evidencia “DÍA 3 SEMANA 7” (el primero, hay dos “DÍA 3 SEMANA 7” 🙄) del 07/06:
Crear una superclase Electrodoméstico con sus respectivos atributos y métodos propios de la clase, luego a partir de esta clase crear como mínimo tres subclases.

 */
package poolclaseherencia;

import java.util.Scanner;

/**
 *
 * @author Debora
 */
public class PoolClaseHerencia {

    static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Quiere hacer su propio pan integral?");
        System.out.println("Compre la maravillosa máquina Würden 3.0!!! a un precio excepcional de oferta $30.000");
        System.out.println("Quiere opción 1: comprar u opción 2: comprar");
        int compra = leer.nextInt();
        System.out.println("Muy buena elección!!!");
        if(compra != 1 || compra != 2){
            System.out.println("Aunque eligió otra opción, sospechamos que quería comprar, asi que no se preocupe su compra esta lista");
        }
        Electrodomestico electro = new Electrodomestico();
        electro.comprar();
        System.out.println();
        MaquinaPan maquinaPan = new MaquinaPan("Wurden", 30000, "plateado", 'A', 1000, 0, 0, 'B', 'M');
        System.out.println("Ahora que ya compro su maquinita de pancito! Hagamos pan");
        System.out.println("Ponga primero los ingredientes liquidos y luego los secos");
        System.out.println("Ahora que ya tiene todos los ingredientes. \n Elija el programa: \n 1: pan integral \n 2: pan frances \n 3: pan de huevo");
        int programa = leer.nextInt();
        maquinaPan.setNroProgramas(programa);
        
        System.out.println("\n Elija nivel temperatura: \n 100 °C \n 200 °C \n 220 °C");
        int nivel = leer.nextInt();
        maquinaPan.setNroNivelesT(nivel);
        
        System.out.println("\n Elija el tamaño: \n C (chico) \n M (mediano) \n G (grande)");
        char tamano= leer.next().charAt(0);
        maquinaPan.setTamañoPan(tamano);
        
        System.out.println("\n Elija tipo tostado: \n T \n M \n B");
        char tost = leer.next().charAt(0);
        maquinaPan.setTipoTostado(tost);
        maquinaPan.hacerPan();
        
        
                
        
    }
    
}
