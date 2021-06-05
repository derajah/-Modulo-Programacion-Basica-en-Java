/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolclaselibro;

/**
 *
 * @author Debora
 */
public class Libro {
    
    private String codigo;
    private String titulo;
    private String autor;
    private int nroEjemplares;
    private int nroPrestados;

    public String getCodigo() {
        return codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNroEjemplares() {
        return nroEjemplares;
    }

    public int getNroPrestados() {
        return nroPrestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNroEjemplares(int nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public void setNroPrestados(int nroPrestados) {
        this.nroPrestados = nroPrestados;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    public Libro(){
        
    }
    public Libro(String titulo, String autor, int nroEjem, int nroPres, String codigo){
        this.titulo = titulo;
        this.autor = autor;
        this.nroEjemplares = nroEjem;
        this.nroPrestados = nroPres;
        this.codigo = codigo;
    }
    
    public boolean prestamo(){
        boolean sePresto = true;        
        if(nroPrestados==nroEjemplares)
            sePresto = false;
        else 
            nroPrestados++;      
        
        return sePresto;
    }
    
    public boolean devolucion(){
        boolean seDevolvio = true;
        if(nroPrestados==0)
            seDevolvio = false;
        else 
            nroPrestados--;     
        
        return seDevolvio;
    }
    
}
