/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclase1;

/**
 *
 * @author Debora
 */
public class Cliente {
    
    private String rut;
    private String nombre;
    private String apellido1;
    private String direccion;
    private String email;
    private String telefono;
    private char genero;
    private char estadoCivil;
    private int edad;
    
    public String getRut(){
        return rut;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
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
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public char getGenero(){
        return genero;
    }
    public void setGenero(char genero){
        this.genero = genero;
    }
    public char getEstadoCivil(){
        return estadoCivil;
    }
    public void setEstadoCivil(char estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
}
