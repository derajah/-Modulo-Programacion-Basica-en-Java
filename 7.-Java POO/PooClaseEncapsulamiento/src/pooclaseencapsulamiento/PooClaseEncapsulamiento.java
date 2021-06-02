/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclaseencapsulamiento;

import java.util.Scanner;

/**
 *
 * @author Debora
 */
public class PooClaseEncapsulamiento {

    static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        
        System.out.print("Ingrese nombre completo del Jugador: ");
        jugador.setNombreCompleto(leer.nextLine());
        System.out.print("Ingrese genero del Jugador: ");
        jugador.setGenero(leer.next().toUpperCase().charAt(0));
        System.out.print("Ingrese edad del Jugador: ");
        jugador.setEdad(leer.nextInt());
        
        Tablero tablero = new Tablero(jugador);
        int vidas = tablero.jugar();
        if(vidas==0)
            tablero.dibujar(vidas);
        else       
            tablero.finalizar();
             
        
    }
 
    
        
    
    
}
