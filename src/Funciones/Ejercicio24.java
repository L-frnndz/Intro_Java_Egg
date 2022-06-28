/*
Hacer un programa que compurebe si una matriz dada es anti simetrica

 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int matriz [][];
        System.out.println("Ingrese un tamaño a la matriz");
        int n = leer.nextInt();
        int i, j;
        
        matriz = new int [n][n];
        
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                
                matriz[i][j] = leer.nextInt();
            }
        }
        
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print(" " +matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        
        boolean verfal = false;
        
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                
                if(matriz[i][j] != -matriz[j][i]){
                   verfal = true;
                }
            }
        }
        
        if(verfal){
            System.out.println("La matriz no es anti simetrica");
        }else{
            System.out.println("La matriz es anti simetrica");
        }
        
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print(" " +matriz[j][i]+ " ");
                
            }
            System.out.println(" ");
        }
        
    }
    
}
