/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolclaseabstracta;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Debora
 */
public class PoolClaseAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Calendar fecha = Calendar.getInstance();
        System.out.println("Ingrese la fecha "); // falta el tema de la pedir que ingrese fechas
        fecha.set(2021,06,22); 

        ProfesorInterino pi1 = new ProfesorInterino(fecha,"15048876-1", "Juanito", "Perez Cotapos", 40);

        ProfesorInterino pi2 = new ProfesorInterino(fecha, "24900020-1", "Andronico", "Luksic", 87);

        ProfesorInterino pi3 = new ProfesorInterino (fecha, "13332256-6", "Chino", "Ríos Mesa", 50);

        ProfesorTitular pt1 = new ProfesorTitular ("4938711-3","Flavio", "Picaporte Pérez", 23);

        ProfesorTitular pt2 = new ProfesorTitular ("8691896-K", "Alberto", "Fuma Mota", 59);

        ProfesorTitular pt3 = new ProfesorTitular ("17968716-K", "Alberto", "De la Ossa", 49);

        ListaProfesores listaDeProfesores = new ListaProfesores();

        listaDeProfesores.addProfesor(pi1); 
        listaDeProfesores.addProfesor(pi2); 
        listaDeProfesores.addProfesor(pi3);

        listaDeProfesores.addProfesor(pt1); 
        listaDeProfesores.addProfesor(pt2); 
        listaDeProfesores.addProfesor(pt3);

        listaDeProfesores.imprimirLista();

        System.out.println ("El sueldo total de las nóminas del profesorado es " +

        listaDeProfesores.sueldosTotalNominaProfesores() + " pesos");
    }
    
}
