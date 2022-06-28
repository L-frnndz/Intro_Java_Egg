/*
Hacer un programa que recorra un vector de N enteros contabilizando
cuantos numeros son de 1 digito, cuantos de 2 digitos (hasta 5 digitos).
 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int vector [];
        int i, num, cont1, cont2, cont3, cont4, cont5;
        
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0; 
        cont5 = 0;
        
        System.out.println("Ingrese un tamaño al vector");
        int N = leer.nextInt();
        
        vector = new int [N];
        
        for(i = 0 ; i < N ; i++){
            
            vector[i] = num = leer.nextInt();
            
        }
        
        for(i = 0; i < N; i++){
            
            if(vector[i] < 10){
                
                cont1++;
            }
            else if(vector[i] < 100){
                
                cont2++;
            }
            else if(vector[i] < 1000){
                
                cont3++;
            }
            else if(vector[i] < 10000){
                
                cont4++;
            }
            else if(vector[i] < 100000){
                
                cont5++;
            }
        }
        
        System.out.println("La cantidad de numeros de un digito son: " +cont1);
        System.out.println("La cantidad de numeros de dos digitos son: " +cont2);
        System.out.println("La cantidad de numeros de tres digitos son: " +cont3);
        System.out.println("La cantidad de numeros de cuatro digitos son: " +cont4);
        System.out.println("La cantidad de numeros de cinco digitos son: " +cont5);
    }
    
}
