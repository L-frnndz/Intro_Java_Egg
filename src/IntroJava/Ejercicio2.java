/*
Hacer un programa que pida tu nombre, lo guarde en una variable
y despues lo muestre por pantalla.
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre.");
        
        String nombre = leer.nextLine();
        
        System.out.println("A continuacion se mostrara el nombre ingresado:");
        
        System.out.println(nombre);
        
    }
    
}
