/*
Hacer un programa que pida dos numeros positivos y despues muestre
el siguiente menú:

MENU
1.Sumar
2.Restar
3.Multiplicar
4.Dividir
5.Salir
Elija opcion:

El programa debera ejecutarse hasta que el usuario elija la opcion 5, luego
se mostrara un mensaje "Seguro que desea salir del programa? S/N". Si selecciona
Si el programa se termina de ejecutar, caso contrario vuelve al menu principal.

 */
package IntroJavaBucles_Sentencias_desalto_break_y_continue;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new 
        Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese dos numeros enteros positivos.");
        int num1, num2;
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija opcion:");
        
        int opcion;
        opcion = leer.nextInt();
            
        while(opcion != 5){
                    switch(opcion){
            case 1: 
                int suma;
                suma = num1 + num2;
                System.out.println("La suma es: " +suma);
                break;
                
            case 2:
                int resta;
                resta = num1 - num2;
                System.out.println("La resta es: " +resta);
                break;
                
            case 3: 
                int multiplicacion;
                multiplicacion = num1 * num2;
                System.out.println("La multiplicacion es: " +multiplicacion);
                break;
                
            case 4:
                double division;
                division = num1/num2;
                System.out.println("La division es: " +division);
                break;
                
                    }//switch
       
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija opcion:");
                    
              opcion = leer.nextInt();
        
        if (opcion == 5){
            
        System.out.println("¿Estas seguro de querer salir del programa? S/N");
               
        String Si_No;
        Si_No = leer.next();
        
                
                if( Si_No.equals("S")){
                    break;
                }else{
                    opcion = leer.nextInt();
                }
        }
        
  
        
                   }//while
   }
 }