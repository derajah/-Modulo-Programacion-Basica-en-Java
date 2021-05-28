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
public enum TipoCuenta {
    
    C("corriente", 'C'), V("vista", 'V'), A("ahorro",'A');
    private String nombre;
    private char tipo;
    
    private TipoCuenta(String nombre, char tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public String getNombre() {
	return nombre;
    }

    public char getTipo() {
        return tipo;
    }
    
}
