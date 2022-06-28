/*
Hacer un programa que pida una frase o palabra y valide si
la primera letra de esa frase es una 'A'. De ser asi se imprimira
un mensaje por pantalla que diga "CORRECTO", caso contrario un mensaje
que diga "INCORRECTO".
 */
package IntroJavaCondicionales;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer;
        leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra que empiece con la letra 'A'.");
        
        String frase;
        frase = leer.nextLine();
        
        
        if(frase.substring(0, 1).equals("A") ){
            System.out.println("CORRECTO");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
    
}
