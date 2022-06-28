/*
Hacer un algoritmo que rellene un vector de tamaño N con valores aleatorios
y pida al usuario un numero a buscar el vector.
El programa mostrara donde se encuentra el numero y si se encuentra repetido.
 */
package Funciones;

import java.util.Scanner;

/**
 * 
 * @author HOME
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un tamaño al vector.");
        
        int N = leer.nextInt();
        int i;
        
        int vector [];
        vector = new int [N];
        
        for(i = 0 ; i < N ; i++){
            
            vector [i] = (int) (Math.random() * 5);
        }
        
        System.out.println("Ingrese un numero que desee buscar en el vector.");
        
        int num = leer.nextInt();
        int contador = 0;
        
        for(i = 0 ; i < N ; i++){
            
            if(num == vector[i]){
                
                System.out.println("El numero se encuentra en el subindice " + i + " del vector.");
                contador++;
            }
            
            if(contador >= 2){
                
                System.out.println("El numero " + num + " se encuentra repetido");
            }
            
        }
        
    }
    
}
