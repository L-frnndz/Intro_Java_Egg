/*
Hacer un programa que rellene una matriz 4x4 de valores aleatorios
y muestre la traspuesta de la matriz.
 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        int matriz [][];
        int i, j;
        
        matriz = new int [4][4];
     
        for(i = 0 ; i < 4 ; i++){
           for(j = 0 ; j < 4 ; j++){
               
               matriz[i][j] = (int) (Math.random() * 20);
           }
        }
        
        for(i = 0; i < 4; i++){
            for(j = 0; j < 4; j++){
                
                System.out.print("[" +matriz[i][j]+ "]");
            }
            System.out.println(" ");
        }
        
        System.out.println("");
        System.out.println("");
        
           int aux;
           
           for(i = 0 ; i < 4 ; i++){
               for(j = 0 ; j < i ; j++){
                   
                   aux = matriz[i][j];
                   matriz[i][j] = matriz[j][i];
                   matriz[j][i] = aux;
                   
               }
               
               for(i = 0 ; i < 4; i++){
                   for(j = 0; j < 4; j++){
                       
                       System.out.print("[" +matriz[j][i]+ "]");
                   }
                   
                   System.out.println(" ");
                   
               }
               
           }
           
        
    }
    
}
  