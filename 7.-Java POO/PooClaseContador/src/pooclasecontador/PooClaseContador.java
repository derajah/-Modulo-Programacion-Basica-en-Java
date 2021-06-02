/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclasecontador;

/**
 *
 * @author Debora
 */
public class PooClaseContador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contador contador = new Contador(5);
        System.out.println("El valor del contador es " + contador.getCont());
        contador.incrementar();
        System.out.println("El nuevo valor del contador es " + contador.getCont());
        int j=contador.getCont();
        for(int i=1;i<=(j+1);i++){
            contador.decrementar();
            System.out.println("El valor del contador es " + contador.getCont());
        }
    }
    
}
