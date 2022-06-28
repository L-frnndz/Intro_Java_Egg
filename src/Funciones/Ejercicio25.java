/*
Hacer un programa que permita introducir un cuadrado por teclado y determine
si este cuadrado es magico o no.
El programa debera comprobar que los numeros introducidos son correctos
(entre el 1 y el 9).
 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamaño a la matriz.");
        
        int matriz [][];
        matriz = new int [3][3];
        
        System.out.println("Rellene la matriz con valores entre 1 y 9.");
        int i, j, k;
        

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                matriz[i][j] = leer.nextInt();
                while(matriz[i][j] < 1 || matriz[i][j] > 9){
                    
                    System.out.println("El numero ingresado no es valido. Por favor, "
                            + "vuelva a ingresar un numero.");
                    matriz[i][j] = leer.nextInt();
                    
                }
                
            }
        }
        
        int sumaC1, sumaC2, sumaC3;
        int sumaF1, sumaF2, sumaF3;
        int sumaD1, sumaD2;
        sumaC1 = 0;
        sumaC2 = 0;
        sumaC3 = 0;
        sumaF1 = 0;
        sumaF2 = 0;
        sumaF3 = 0;
        sumaD1 = 0;
        sumaD2 = 0;
        
        for(j = 0; j < 3; j++){
            
            sumaF1 = sumaF1 + matriz[0][j];
            sumaF2 = sumaF2 + matriz[1][j];
            sumaF3 = sumaF3 + matriz[2][j];
        }
        
        for(i = 0; i < 3; i++){
            
            sumaC1 = sumaC1 + matriz[i][0];
            sumaC2 = sumaC2 + matriz[i][1];
            sumaC3 = sumaC3 + matriz[i][2];
        }
        
        for(i = 0; i < 3; i++){
            
            sumaD1 = sumaD1 + matriz[i][i];
        }
        
        k = 2;
        for(i = 0; i < 3; i++){
            
            sumaD2 = sumaD2 + matriz [i][k];
            k = k - 1;
        }
        
        if(sumaC1==15 && sumaC2==15 && sumaC3==15 && sumaF1==15 && sumaF2==15 &&
                sumaF3==15 && sumaD1==15 && sumaD2==15){
            
            System.out.println("La matriz es magica");
            }else{
            System.out.println("la matriz no es magica");
        }
    }
    
}
