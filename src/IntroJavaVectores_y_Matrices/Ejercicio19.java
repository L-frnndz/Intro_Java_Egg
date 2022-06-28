/*
Hacer un programa que a traves de una funcion nos convierta
una cantidad de euros introducida por teclado a otra moneda.
Puede ser a dolares, yenes o libras.

La funcion tendra como parametros, la cantidad de euros y la moenda
a convertir que sera una candena.

El cambio de divisas es:
*0.86 libras es un euro
*1.28611 $ es un euro
*129.852 yenes es un euro

 */
package IntroJavaVectores_y_Matrices;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingtrese una cantidad de euros");
        int euros = leer.nextInt();
 
        int converitr;
        String cambio = null;
        
        System.out.println(convertidor(cambio));
        
    }
    
    public static  String convertidor(String cambio){
        Scanner leer = new Scanner(System.in);

        int opcion;
        
        System.out.println("Seleccione a que moenda convertir los euros:");
        System.out.println("1.yenes 2.libras 3.dolares");
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1: 
            cambio = "La moneda se cambio a yenes";
            break;
            
            case 2:
            cambio = "La moneda se cambio a libras";
            break;
            
            case 3: 
            cambio = "La moneda se cambio a dolares";
            break;
        }
        
        return cambio;
    }
    
}
