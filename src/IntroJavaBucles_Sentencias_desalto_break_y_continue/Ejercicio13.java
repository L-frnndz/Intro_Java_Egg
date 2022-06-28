/*
Hacer un programa que pida ingresar un valor limite positivo
y despues solicite numeros al usuario hasta que la suma de los numeros
introducidos supere el limite inicial.
 */
package IntroJavaBucles_Sentencias_desalto_break_y_continue;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite positivo.");
        
        int valor_limite;
        valor_limite = leer.nextInt();
        System.out.println("Ahora ingrese numeros para sumarlos hasta llegar o "
                + "pasar el valor limite.");
        
        int numeros, suma;
        numeros = leer.nextInt();
        suma = numeros;
        
        while(suma < valor_limite){
            
            numeros = leer.nextInt();
            
            suma = suma + numeros; 
            System.out.println(+suma);
        }
        
        if (suma == valor_limite){
        System.out.println("el valor de la sumatoria ha llegado a " +suma+ " "
                + "igualando el valor limite incial " +valor_limite);
        }else if(suma > valor_limite){
                    System.out.println("el valor de la sumatoria ha llegado a " +suma+ " "
                + "superando el valor limite incial " +valor_limite);
        }
    }
    
}
