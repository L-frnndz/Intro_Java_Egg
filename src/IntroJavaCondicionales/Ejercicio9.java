/*
Hacer un programa que permita introducir solo frases o palabras de 8 de largo.
Si se ingresa una frase o palabra de 8 de largo mostrar un mensaje que 
diga "CORRECTO", sino mostrar un mensaje que diga "INCORRECTO".
 */
package IntroJavaCondicionales;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase unicamente de 8 de largo.");
        
        String frase = leer.nextLine();
        
        int cantidad;
        cantidad = frase.length();
        
        if(cantidad == 8) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
    
}
