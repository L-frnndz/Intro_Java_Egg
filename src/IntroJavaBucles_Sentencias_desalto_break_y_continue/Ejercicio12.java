/*
Hacer un programa que valide si una nota esta entre 0 y 10, si la
nota no esta entre 0 y 10 se volvera a pedir hasta que sea la nota correcta.
 */
package IntroJavaBucles_Sentencias_desalto_break_y_continue;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int nota;
        System.out.println("Ingresar nota (entre 0 y 10)");
        
        nota = leer.nextInt();
        
        while (nota < 0 || nota > 10){
            
            System.out.println("La nota ingresada no es valida. Ingrese una "
                    + "nota valida.");
            nota = leer.nextInt();
            
        }
    }
    
}
