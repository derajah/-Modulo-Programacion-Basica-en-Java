/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolclaseabstracta;
import java.util.Calendar;

/**
 *
 * @author Debora
 */
public class ProfesorInterino extends Profesor{
    
    private Calendar fechaInicioInterinidad;

    public Calendar getFechaInicioInterinidad() {
        return fechaInicioInterinidad;
    }

    public void setFechaInicioInterinidad(Calendar fechaInicioInterinidad) {
        this.fechaInicioInterinidad = fechaInicioInterinidad;
    }

    public ProfesorInterino(Calendar fechaInicioInterinidad, String idProfesor) {
        super(idProfesor);
        this.fechaInicioInterinidad = fechaInicioInterinidad;
    }

    public ProfesorInterino(Calendar fechaInicioInterinidad) {
        super();
        this.fechaInicioInterinidad = fechaInicioInterinidad;
    }

    public ProfesorInterino(Calendar fechaInicioInterinidad, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.fechaInicioInterinidad = fechaInicioInterinidad;
    }

    public ProfesorInterino(Calendar fechaInicioInterinidad, String idProfesor, String nombre, String apellidos, int edad) {
        super(idProfesor, nombre, apellidos, edad);
        this.fechaInicioInterinidad = fechaInicioInterinidad;
    }
    
    @Override
    public String toString(){
        return super.toString().concat (" Fecha comienzo interinidad: ").concat (fechaInicioInterinidad.getTime().toString()); 
    }

    @Override
    public float sueldoNomina () { 
        return 30000f * 35.60f ; 
    } 
    
    
    
}
