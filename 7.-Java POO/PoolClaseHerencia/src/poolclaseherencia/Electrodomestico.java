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
public class Electrodomestico {
    
    private String tipo;
    private String marca;
    private double precio_base;
    private String color;
    private char letraEnergia;
    private double peso; 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetraEnergia() {
        return letraEnergia;
    }

    public void setLetraEnergia(char letraEnergia) {
        this.letraEnergia = letraEnergia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public Electrodomestico(){
        
    }
    
    public Electrodomestico(String tipo, String marca, double precio, String color, char letraE, double peso){
        this.marca = marca;
        this.precio_base = precio;
        this.color = color;
        this.letraEnergia = letraE;
        this.peso = peso;
        this.tipo = tipo;
    }
    
    public void comprar(){
        System.out.println("Gracias por su compra!");
    }
    
}
