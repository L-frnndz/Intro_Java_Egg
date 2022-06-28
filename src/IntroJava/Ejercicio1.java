/*
Hacer un programa que pida dos numeros enteros por teclado.
Calcular la suma de esos numeros.
Mostrar el resultado de la suma.
*/


package IntroJava;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in) ;
        
        System.out.println("Ingrese dos numeros enteros.");
        
        int num1;
        int num2;
        int suma;
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("La suma de estos numeros es: " +suma);
         
                
                
        
        
    }
    
}
