/*
Hacer un programa que pida una frase, si esa frase
es igual a "eureka" el programa pondra un mensaje de
Correcto, sino mostrara un mensaje de Incorrecto.
 */
package IntroJavaCondicionales;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase.");
        
        String frase;
        String eureka;
        frase = leer.nextLine();
        eureka = "eureka";
        
        if (frase.equals(eureka)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
    
}
