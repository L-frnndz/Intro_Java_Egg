/*
Hacer un programa que simule el fincionamiento de un dispositivo RS232.
Lee cadenas enviada por el usuario, estas deben llegar con un formato fijo:
tienen que ser de un maximo de 5 caracteres de largo, el primer caracter tiene que
ser X y el ultimo una O.

Las secuencias leidas que respeten el formato se consideran correctas.
La secuencia especial "&&&&&" marca el final de los envíos(FDE).
Toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas.
 */
package IntroJavaBucles_Sentencias_desalto_break_y_continue;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        String cadena, especial;
        int correctas, incorrectas, cantidad;
        
        correctas = 0;
        incorrectas = 0;
        
        System.out.println("Ingrese cadenas de 5 de largo, que empiecen con X y ");
        System.out.println("terminen con una O. Si la cadena ingresada no cumple con la ");  
        System.out.println("condicion antes dicha se considerara incorrecta. "); 
        System.out.println("\"Para finalizar ingrese la secuencia especial '&&&&&'");
                
        cadena = leer.nextLine();
        especial = "&&&&&";
        
        while(!cadena.equals(especial)){
            
 
            cantidad = cadena.length();
                
                if(!"X".equals(cadena.substring(0,1)) || !"O".equals(cadena.substring(4,5))
                        || cantidad > 5){
                    
                    incorrectas = incorrectas + 1;
                    
                }else{
                    correctas = correctas + 1;
                }
            
                           cadena = leer.nextLine();
        }//while
        
        System.out.println("Las cadenas correctas ingresadas son: " +correctas);
        System.out.println("Las cadenas incorrectas ingresadas son: " +incorrectas);
        
        
    }
    
}
