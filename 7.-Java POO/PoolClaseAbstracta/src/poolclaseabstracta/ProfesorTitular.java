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
public class ProfesorTitular extends Profesor{

    public ProfesorTitular(String idProfesor) {
        super(idProfesor);
    }

    public ProfesorTitular() {
    }

    public ProfesorTitular(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    }

    public ProfesorTitular(String idProfesor, String nombre, String apellidos, int edad) {
        super(idProfesor, nombre, apellidos, edad);
    }
    
    @Override
    public float sueldoNomina(){
        return 50000f*45f;
    }
    
}
