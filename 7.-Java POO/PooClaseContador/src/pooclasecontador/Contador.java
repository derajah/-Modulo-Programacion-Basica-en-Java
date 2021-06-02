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
public class Contador {
    
    private int cont;
    
    public int getCont(){
        return cont;
    }
    public void setCont(int contador){
        this.cont = contador;
    }  
    
    public Contador(){
        
    }
    
    public Contador(int contador){
        this.cont = contador;
        if(contador < 0) this.cont = 0;
    }
    
    public int incrementar(){
        return cont++;
    }
    
    public int decrementar(){
        cont--;
        if(cont < 0) cont=0;
        return cont;
    }
}
