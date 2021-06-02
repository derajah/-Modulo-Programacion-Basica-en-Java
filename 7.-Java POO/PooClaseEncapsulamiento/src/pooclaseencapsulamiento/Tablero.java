/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclaseencapsulamiento;
import java.util.Arrays;
/**
 *
 * @author Debora
 */
public class Tablero {
    private int vidas = 6;
    String[] palabrasAdultos = new String[]{"aplicaciones", "goma", "libreta", "maestro", "calavera", "paralelepipedo"};
    String[] palabrasNinos = new String[]{"juguete", "goma", "dulce", "juego", "pelota", "pato"};
    private String palabra;
    private int aciertos = 0;
    private int tamaño;
    private char[] respuesta;
    private Jugador jugador;
    private String opcion;
    
    public Tablero(Jugador jugador){  
        this.jugador = jugador;
        obtenerPalabra();
        tamaño = palabra.length();
        respuesta = new char[tamaño];         
        
        for (int i = 0; i < tamaño; i++) {
            respuesta[i] = 'X';
        }
        
    }
    
    private void obtenerPalabra(){

        if(jugador.getEdad() <= 10){
            palabra = palabrasNinos[(int) (Math.random() * 5)];
        } else {
            palabra = palabrasAdultos[(int) (Math.random() * 5)];
        }
    }
    
    public int jugar() {
        int contador = 0;
        System.out.println();
        System.out.println("Bienvenid" + (jugador.getGenero() == 'F'? "a ":"o ") + jugador.getNombreCompleto());
        System.out.println(jugador.getEdad() <= 10 ? "Como eres un niño te presentamos el conjunto de palabras posibles " + Arrays.toString(palabrasNinos) + "\n": "\n");
        while (aciertos != tamaño && vidas != 0) {
            System.out.println("========= AHORCADO ==========          VIDAS="+vidas +" Aciertos= "+aciertos);
            dibujar(vidas);
            System.out.println("");
            for (int i = 0; i < tamaño; i++) {
 
                System.out.print(respuesta[i] + "  ");
            }
            opcion = jugador.ingresarLetra();
            if (palabra.contains(opcion)) {
                for (int i = 0; i < tamaño; i++) {
                    if (palabra.charAt(i) == opcion.charAt(0)) {
                        respuesta[i] = opcion.charAt(0);
                        contador++;
                    }
                }
 
                aciertos = aciertos + contador;
            } else {
                vidas--;
            }
 
            contador = 0;
        }
        return vidas;
    }

    public void finalizar(){
        System.out.println("");
        for (int i = 0; i < tamaño; i++) {

            System.out.print( respuesta[i] + " ");
        }
        System.out.println();
        System.out.println("TU GANAS :)");
    }
    
    public void dibujar(int i) {
        switch (i) {
            case 6:
                System.out.println(" ---------------------");
                for (int j = 0; j < 15; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 5:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                for (int j = 0; j < 10; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 4:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 3:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 2:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 1:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 0:
               System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                System.out.println("GAME OVER");
                break;
        }
    }
    
}
