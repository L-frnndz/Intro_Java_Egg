/*
Hacer un programa que lea 20 numeros. Si el numero leido es 0 se debe
salir del bucle y mostrar un mensaje "Se capturo el numero cero." El programa
debera calcular y mostrar el resultado de la suma de los numeros leidos, pero
si el numero es negativo no debe sumarse.
 */
package IntroJavaBucles_Sentencias_desalto_break_y_continue;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 20 numeros");
        System.out.println("***AVISO***");
        System.out.println("**Si el numero es 0 se cancelara la introduccion de "
                + "los numeros y se mostrara un mensaje**");
        System.out.println("**Se calculara la suma de los numeros ingresados y se "
                + "se mostrara por pantalla**");
        System.out.println("**Si hay un numero negativo no se sumara**");
        
        int numero;
        numero = leer.nextInt();
        
        int suma;
        suma = numero;
        
        for(int i = 1 ; i < 20 ; i++){
            
            numero = leer.nextInt();
            if(numero < 0){
                continue;
            }
            suma = suma + numero;
            
            if(numero == 0){
                System.out.println("Se capturó el numero cero.");
                break;
            }
        }
        System.out.println("La sumatoria de los numeros ingresados es: " +suma);
    }
    
}
