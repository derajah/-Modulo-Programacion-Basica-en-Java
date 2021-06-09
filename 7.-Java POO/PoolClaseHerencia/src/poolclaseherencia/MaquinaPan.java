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
public class MaquinaPan extends Electrodomestico{
    
    private int nroProgramas;
    private int nroNivelesT;
    private char tipoTostado;
    private char tamañoPan;

    public int getNroProgramas() {
        return nroProgramas;
    }

    public void setNroProgramas(int nroProgramas) {
        this.nroProgramas = nroProgramas;
    }

    public int getNroNivelesT() {
        return nroNivelesT;
    }

    public void setNroNivelesT(int nroNivelesT) {
        this.nroNivelesT = nroNivelesT;
    }

    public char getTipoTostado() {
        return tipoTostado;
    }

    public void setTipoTostado(char tipoTostado) {
        this.tipoTostado = tipoTostado;
    }

    public char getTamañoPan() {
        return tamañoPan;
    }

    public void setTamañoPan(char tamaño) {
        this.tamañoPan = tamaño;
    }
    
    public MaquinaPan(int nroPrograma, int nroNivelesT, char tipoTostado, char tamaño){
        this.nroProgramas = nroPrograma;
        this.nroNivelesT = nroNivelesT;
        this.tipoTostado = tipoTostado;
        this.tamañoPan = tamaño;
    }
    
    public MaquinaPan(String marca, double precio, String color, char letraE, double peso, int nroPrograma, int nroNivelesT, char tipoTostado, char tamaño){
        super("maquina pan", marca, precio, color, letraE, peso);
        this.nroProgramas = nroPrograma;
        this.nroNivelesT = nroNivelesT;
        this.tipoTostado = tipoTostado;
        this.tamañoPan = tamaño;
    }
    
    public void hacerPan(){
        System.out.println();
        System.out.println("Listo para comenzar");
        System.out.println("Esta es su configuración: ");
        System.out.println("Temperatura: " + nroNivelesT);
        System.out.println("Programa: " + nroProgramas);
        System.out.println("Tipo Tostado: " + tipoTostado);
        System.out.println("Tamaño: " + tamañoPan);
        
        System.out.println("Espera pacientemente unas 3 hrs y tendras un delicioso pan!");

               
    }
    
}
