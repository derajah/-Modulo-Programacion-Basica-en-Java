/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolclaseherencia;

/**
 *
 * @author Debora
 */
public class Plancha extends Electrodomestico{
    
    private double TMax;
    private boolean usaVapor;

    public double getTMax() {
        return TMax;
    }

    public void setTMax(double TMax) {
        this.TMax = TMax;
    }

    public boolean getUsaVapor() {
        return usaVapor;
    }

    public void setUsaVapor(boolean usaVapor) {
        this.usaVapor = usaVapor;
    }
    
    public Plancha(String marca, double precio, String color, char letraE, double peso, double tmax, boolean usavapor){
        super(marca, precio, color, letraE, peso);
        this.TMax = tmax;
        this.usaVapor = usavapor;
    }
    
}
