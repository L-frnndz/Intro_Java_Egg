/*
Hacer un programa que determine si 
un numero es par o impar.
 */
package IntroJavaCondicionales;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para determinar si es par o impar.");
        
        int num;
        num = leer.nextInt();
        
        if(num % 2 == 0) {
            System.out.println("El numero es par.");
                    
        }else{
            
            System.out.println("El numero es impar.");
        }
        }
        
    }
