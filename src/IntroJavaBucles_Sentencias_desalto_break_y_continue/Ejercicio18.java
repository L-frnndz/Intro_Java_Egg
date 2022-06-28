/*
Hacer un programa que lea 4 numeros(entre 1 y 20) e imprima el numero ingresado
seguido de tantos asteriscos como indique su valor.
 */
package IntroJavaBucles_Sentencias_desalto_break_y_continue;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 4 numeros que sean entre 1 y 20.");
        
        int num, i, j;
        
        num = leer.nextInt();
        
        for(i = 1; i <= 4; i++){
            
            while(num < 1 || num > 20){
                System.out.println("El numero ingresado no es valido, "
                        + "ingrese un numero nuevamente.");
                num = leer.nextInt();
                
            }//while
            
            System.out.print(+num);
            System.out.print(" ");
            for(j = 0; j < num; j++){
                
                System.out.print("*");
                
            }//for2
            System.out.println(" ");
            if(i == 4){
                break;
            }
            num = leer.nextInt();
        }//for1
    }
    
}
