/*
Hacer un programa que muestre el equivalente
de una cantidad de grados centigrados a grados Farenheit.
La formula es: F = 32 + (9*C/5).
*/
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de grados Centigrados.");
        
        int centigrados = leer.nextInt();
        
        int farenheit;
        
        farenheit = 32 + (9*centigrados/5);
        
        System.out.println("La equivalencia del valor ingresado a farenheit es: " +farenheit );
        
        
        
    }
    
}
