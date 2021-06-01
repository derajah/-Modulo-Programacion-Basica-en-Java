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
    
    private String nombre;
    private String apellido1;
    private char genero;
    private int edad;
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }    
    public String getApellido1(){
        return apellido1;
    }
    public void setApellido1(String apellido1){
        this.apellido1 = apellido1;
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
