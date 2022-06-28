/*
Hacer un programa que rellene un vector con los 100 primeros numeros
enteros y los muestre por pantalla en orden descendente.
 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int [] vector;
        vector = new int [101];
        int i;
        
        for(i = 100 ; i > 0 ; i-- ){
            
            vector[i] = i;
            
            System.out.print("[" + vector[i] + "]");
            
        }
    }
    
}
