/*
Dibujar un cuadrado de N elementos por lado con el caracter "*".
 */
package IntroJavaBucles_Sentencias_desalto_break_y_continue;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num, i, j;
        System.out.println("Ingrese un numero.");
        num = leer.nextInt();
        
        for(i = 1; i <= num ; i++){
            
            for(j= 1; j <= num ; j++){
                if(i > 1 && i < num && j > 1 && j < num){
                    System.out.print("  ");
                    
                }else{
                    System.out.print("* ");
                }
                
            }
            System.out.println(" ");
        }
    }

}
