/*
Hacer un programa que pida una frase y la muestre primero en mayusculas
y despues en minusculas.
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase.");

        String frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
    }
    
}
