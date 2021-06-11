/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolclaseabstracta;

/**
 *
 * @author Debora
 */
public abstract class Profesor extends Persona{
    
    private String rutProfesor;

    public String getRutProfesor() {
        return rutProfesor;
    }

    public void setRutProfesor(String idProfesor) {
        this.rutProfesor = idProfesor;
    }

    public Profesor(String idProfesor) {
        this.rutProfesor = idProfesor;
    }

    public Profesor() {
    }

    public Profesor(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        rutProfesor = "Unknown"; 
    }    
    
    public Profesor(String idProfesor, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.rutProfesor = idProfesor;
    }
    
    public void mostrarDatos(){
        System.out.println ("Datos Profesor. Profesor de nombre: " + getNombre() + " " + getApellidos() + " con Id de profesor: " + getRutProfesor() );
    }
    
    @Override
    public String toString () { 
        return super.toString().concat(" - IdProfesor: ").concat(rutProfesor); 
    }
    
    abstract public float sueldoNomina ();
}
