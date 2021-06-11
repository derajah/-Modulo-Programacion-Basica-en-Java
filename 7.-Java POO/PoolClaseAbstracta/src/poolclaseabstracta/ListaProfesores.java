/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolclaseabstracta;
import java.util.ArrayList; 
import java.util.Iterator;
/**
 *
 * @author Debora
 */
public class ListaProfesores {
    
    private ArrayList<Profesor> listaProfesores = new ArrayList<>();

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public ListaProfesores() {
        listaProfesores = new ArrayList<>();
    }
    
    public void addProfesor(Profesor profe){
        listaProfesores.add(profe);
    }
    
    public void imprimirLista(){
        String tipoProfe = "";
        System.out.println("Lista de profesores: \n");
        for(Profesor prof: listaProfesores){
            System.out.println(prof.toString());
            if(prof instanceof ProfesorInterino) tipoProfe="Interino";
            else tipoProfe="Titular";
            System.out.println("- Este profesor es de tipo: " + tipoProfe + " - Sueldo: " + prof.sueldoNomina() + "\n");
        }
    }
    
    public float sueldosTotalNominaProfesores(){
        float total = 0f;
        Iterator<Profesor> iteraLista = listaProfesores.iterator();
        while(iteraLista.hasNext()){
            total = total + iteraLista.next().sueldoNomina();
        }
        return total;
    }
    
    
    
}
