/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Evidencia “DÍA 3 SEMANA 7” (el primero, hay dos “DÍA 3 SEMANA 7” 🙄) del 07/06:
Crear una superclase Electrodoméstico con sus respectivos atributos y métodos propios de la clase, luego a partir de esta clase crear como mínimo tres subclases.

 */
package poolclaseherencia;

/**
 *
 * @author Debora
 */
public class PoolClaseHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Plancha plancha = new Plancha("xds", 2000, "blanca", 'A', 200, 40, true);
        double temp = plancha.getTMax();
        System.out.println("La temperatura es " + temp);
                
        
    }
    
}
