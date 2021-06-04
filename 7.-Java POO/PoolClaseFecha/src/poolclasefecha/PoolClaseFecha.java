/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Evidencia "DÍA 5 SEMANA 6" del 02/06:
Crear una Clase Fecha en Java. La clase tendrá 3 atributos privados: día, mes y año, de tipo int. La clase contendrá los siguientes métodos: 
-	Constructor por defecto.
-	Constructor con 3 parámetros para crear objetos con valores iniciales.
-	Métodos set y get para asignar y obtener los valores de los atributos de la clase.
-	Método fechaCorrecta(), que comprueba que la fecha es correcta. Devuelve un valor de tipo boolean indicando si la fecha es correcta o no.
-	Método diaSiguiente(), que cambia la fecha actual por la del día siguiente. El objeto de la clase Fecha al que se le aplique este método deberá quedar siempre en un estado consistente, es decir, la nueva fecha deberá ser correcta.
Escribe un programa para probar la clase Fecha. El método díaSiguiente() pruébalo dentro de un bucle que imprima la fecha durante cada iteración del bucle.

Opcional: considerar los años bisiestos.

 */
package poolclasefecha;

import java.util.Scanner;

/**
 *
 * @author Debora
 */
public class PoolClaseFecha {

    static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Ingrese la fecha que desea validar, formato dd-mm-yy ");
        String[] partesF = leer.nextLine().split("-");

        Fecha fecha = new Fecha(Integer.parseInt(partesF[0]) , Integer.parseInt(partesF[1]), Integer.parseInt(partesF[2]));
        boolean valida = fecha.fechaCorrecta();
        System.out.println("Fecha es " + (valida ? "correcta " : "incorrecta"));
        
        if(valida){
            //por 10 días
            System.out.println();
            System.out.println("Se imprimen 10 días");
            for(int i=0;i<=10;i++){
                fecha = fecha.diaSiguiente(fecha);
            }
        } else {
            System.out.println("Por eso no avanzamos al siguiente dia");
        }
    }
    
}
