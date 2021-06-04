/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolclasefecha;
import java.time.LocalDate;
import java.time.DateTimeException;


/**
 *
 * @author Debora
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int anno;
    
    public int getDia(){
        return dia;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAnno(){
        return anno;
    }
    
    public void setAnno(int anno){
        this.anno = anno;
    }
    
    
    public Fecha(){
        
    }
    public Fecha(int dia, int mes, int anno){
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }
    
    public boolean fechaCorrecta(){
        boolean esFechaCorrecta = true;
        try{
            LocalDate.of(anno, mes, dia);
        }catch(DateTimeException e) {
            esFechaCorrecta = false;
        }
        return esFechaCorrecta;
    }
    
    public Fecha diaSiguiente(Fecha fecha){
        
        LocalDate hoy = LocalDate.of(anno, mes, dia);
        LocalDate mañana = hoy.plusDays(1);
        fecha.setDia(mañana.getDayOfMonth());
        fecha.setMes(mañana.getMonthValue());
        fecha.setAnno(mañana.getYear());
        System.out.println("fechas correlativas siguientes " + fecha.getDia() + "-" + fecha.getMes() + "-" + fecha.getAnno());
        
        
        return fecha;
        
        
    }
    
}
