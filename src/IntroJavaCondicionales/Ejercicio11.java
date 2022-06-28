/*
Definir una variable tipoMotor y que el usuario ingrese
un numero entre 1 y 4.
1:"La bomba es una bomba de agua"
2:"La bomba es una bomba de gasolina"
3:"La bomba es una bomba de hormigon"
4:"La bomba es una bomba de pasta alimenticia"
Si no cumple con ningun valor anterior mostrar un mensaje que diga:
"No existe un valor valido para tipo de bomba"
 */
package IntroJavaCondicionales;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int tipoMotor;
        
        System.out.println("Ingrese un numero entre 1 y 4 para saber"
                + "que tipo de bomba es.");
        
        tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            
            case 1: System.out.println("La bomba es una bomba de agua.");
            break;
            
            case 2: System.out.println("La bomba es una bomba de gasolina.");
            break;
            
            case 3: System.out.println("La bomba es una bomba de hormigon.");
            break;
            
            case 4: System.out.println("La bomba es una bomba de pasta alimenticia.");
            break;
            
            default : System.out.println("No existe un valor valido para tipo de bomba.");
            
        }
    }
    
}
