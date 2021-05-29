/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclase1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Debora
 */
public class Validacion {
    
    
    
    
    public static boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut =  rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {

        } catch (Exception e) {
        }
        return validacion;
    }
    
    public static boolean validarEmail(String email) {
 
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                      + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); 
        Matcher mather = pattern.matcher(email);
        boolean validacion = false;
        if (mather.find() == true) {
            validacion = true;
        } 
        return validacion;
    }
    
    public static boolean validarTelefono(String telefono) {
 
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^(\\+?56)?(\\s?)(0?9)(\\s?)[9876543]\\d{7}$"); 
        Matcher mather = pattern.matcher(telefono);
        boolean validacion = false;
        if (mather.find() == true) {
            validacion = true;
        } 
        return validacion;
    }
    
    public static boolean validarGenero(char genero) {
 
        boolean validacion = false;
        String generoString = String.valueOf(genero).toUpperCase();
        if ("F".equals(generoString) || "M".equals(generoString)) {
            validacion = true;
        } 
        return validacion;
    }
    
    public static boolean validarEstadoCivil(char estado) {
 
        boolean validacion = false;
        String estadoString = String.valueOf(estado).toUpperCase();
        
        if ("S".equals(estadoString) || "C".equals(estadoString) || "V".equals(estadoString)) {
            validacion = true;
        } 
        return validacion;
    }
    
    public static boolean validarEdad(int edad) {
 
        boolean validacion = false;
        if (edad >=0 && edad <=65) {
            validacion = true;
        } 
        return validacion;
    }
}
