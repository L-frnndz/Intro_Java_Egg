/*
Hacer un programa que lea un numero entero por teclado 
y muestre por pantalla el doble, triple y la raiz cuadrada de ese numero.
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero.");
        
        int num1 = leer.nextInt();
        
        System.out.println("El doble del numero ingresado es: " +num1*2 );
        System.out.println("El triple del numero ingresado es: " +num1*3 );
        System.out.println("La raiz cuadrada del numero ingresado es: " +Math.sqrt(num1));
    }
    
}
