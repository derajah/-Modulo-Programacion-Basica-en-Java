/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Evidencia "DÍA 1 SEMANA 7" del 04/06:
1 - Avance del ejercicio anterior del 03/06 si no lo habían terminado.
2 - Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. La clase contendrá los siguientes métodos:
-	Constructor por defecto.
-	Constructor con parámetros.
-	Métodos setters/getters.
-	Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en caso contrario.
-	Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.


 */
package poolclaselibro;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Optional;

/**
 *
 * @author Debora
 */
public class PoolClaseLibro {
    
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Libro> biblioteca = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        poblarBiblioteca();
        menu();
        
        
        
        
    }
    
    private static void poblarBiblioteca(){               
       
       Libro s = new Libro("The Hobbit", "J.R.R.", 10, 0, "HB01");
       biblioteca.add(s);
       s = new Libro("Lear, rey y mendigo", "Nicanor Parra", 20, 0, "LR01");
       biblioteca.add(s);
       s = new Libro("El Lobo Estepario", "Herman Hesse", 12, 0, "LE01");
       biblioteca.add(s);
       s = new Libro("La Soledad de los Numeros Primos", "Paolo Giordano", 8, 0, "SP01");
       biblioteca.add(s);
       s = new Libro("Pensar rapido, pensar despacio", "Daniel Kahneman", 5, 3, "PR01");
       biblioteca.add(s);
       s = new Libro("A sangre fria", "Truman Capote", 15, 0, "SF01");
       biblioteca.add(s);
       s = new Libro("Cronica de una muerte anunciada", "Gabriel G. Marquez", 16, 3, "CM01");
       biblioteca.add(s);
       s = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 7, 2, "QM01");
       biblioteca.add(s);
       s = new Libro("El principito", "Antoine de Saint-Exupéry", 22, 15, "EP01");
       biblioteca.add(s); 
       
       
    }
    private static void menu(){
        System.out.println("Menu biblioteca, \n 1: Listar libros \n 2: Devolución \n 3: Préstamo ");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1: listar(); break;
            case 2: devolver(); break;
            case 3: prestar();break;
            default: System.out.println("opción inexistente vuelva otro día"); break;
        }
    }
    
    private static void listar(){
        System.out.println("Lista de libros y cantidad disponible");
        for(int i=0; i< biblioteca.size();i++){
            System.out.println("'" + biblioteca.get(i).getTitulo() + "'" + ", codigo: "+ biblioteca.get(i).getCodigo() + " , total unidades: " + biblioteca.get(i).getNroEjemplares() + " , total prestados: " + biblioteca.get(i).getNroPrestados() + " , disponibles: " + (biblioteca.get(i).getNroEjemplares()-biblioteca.get(i).getNroPrestados()));
        }
        repetir();
    }
    
    private static void devolver(){
        leer.nextLine();
        System.out.println("Ingrese codigo del libro a devolver");
        String codigo = leer.nextLine();
        Optional<Libro> libro = biblioteca.stream()
                .filter(l->l.getCodigo().equals(codigo))
                .findFirst();
        Libro libroDevuelve = libro.isPresent() ? libro.get(): null;
        if(libroDevuelve != null){
            boolean devuelto = libroDevuelve.devolucion();
            if(devuelto)
                listar();
            else
                System.out.println("Libro no ha sido prestado !!!");
        } else {
            System.out.println("Libro no existe");
        }      
        
    }
    private static void prestar(){
        leer.nextLine();
        System.out.println("Ingrese titulo del libro que quiere pedir prestado");
        String titulo = leer.nextLine();
        Optional<Libro> libro = biblioteca.stream()
                .filter(l->l.getTitulo().equalsIgnoreCase(titulo))
                .findFirst();
        Libro libroPresta = libro.isPresent() ? libro.get(): null;
        //tambien podria haber usar ifPresent de Optional
        if(libroPresta != null){
            boolean prestado = libroPresta.prestamo();
            if(prestado){
                System.out.println("Que disfrutes de tu libro !!! \n");
                listar();
            }
            else
                System.out.println("No quedan disponibles !!!");
        } else {
            System.out.println("Libro no existe");
        }   
    }
    
    private static void repetir(){
        System.out.println();
        System.out.println("Desea otra realizar otra operación? 1.Si 2.No");
        int opcion = leer.nextInt();
        if(opcion==1) menu();
        else System.out.println("Gracias por preferir nuestra biblioteca");
    }
}
