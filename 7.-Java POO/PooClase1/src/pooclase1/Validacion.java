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
    
}
