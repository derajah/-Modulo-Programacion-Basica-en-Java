/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclaseencapsulamiento;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Debora
 */
public class Jugador {
    
    private String nombreCompleto;
    private char genero;
    private int edad;
    
    public String getNombreCompleto(){
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombre){
        this.nombreCompleto = nombre;
    }    
    public char getGenero(){
        return genero;
    }
    public void setGenero(char genero){
        this.genero = genero;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
        
    public String ingresarLetra(){
        String valor = " ";
        try {
            Scanner leer = new Scanner(System.in);
            System.out.print("\nIngrese una letra   : ");
            valor = leer.next().toLowerCase();
        } catch (InputMismatchException ex) {
            System.out.println("Ingrese un caracter");;
        }
        return valor;
    }
}
