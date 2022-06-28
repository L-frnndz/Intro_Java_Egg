/*
Hacer un programa que dado dos numeros enteros determine
cual es el mayor y lo muestre por pantalla.
 */
package IntroJavaCondicionales;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros enteros.");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt(); 
        
        if (num1 > num2) {
            System.out.println("El numero mayor es: " +num1);
            
        }else{
            System.out.println("El numero mayor es: " +num2);
        }
        
    }
    
}
