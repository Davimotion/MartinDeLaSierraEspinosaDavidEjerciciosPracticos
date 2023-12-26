
package ejercicio4;

import java.util.Scanner;

/*Ejercicio Nº 4 - Matrices - Grupal

Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. 
Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:

Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").

Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). 
El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.

Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.

A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.

Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro. 
¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?

El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.

Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.*/
public class Ejercicio4 {

   
    public static void main(String[] args) {
        boolean[][] asientos = new boolean[5][5];
        Scanner sc = new Scanner (System.in);
        String inputFila = null;
        String inputColumna = null;
        boolean fin = false;
        
       while(fin == false){
           System.out.println("Introduzca el número de la fila donde quiere sentarse.");
           inputFila = sc.nextLine();
           int numFila = Integer.valueOf(inputFila) -1;
           
           //en caso de pedir un asiento inexistente, lo vuelve a pedir
           while (numFila > 4 || numFila < 0){
                System.out.println("El número de fila no es válido, por favor introduzca un número del 1 al 5");				
                inputFila = sc.nextLine();  
                numFila = Integer.valueOf(inputFila) -1;
            }
            System.out.println("Introduzca el número del asiento donde quiere sentarse.");
            inputColumna = sc.nextLine();
            int numColumna =Integer.valueOf(inputColumna)-1;
            
            //en caso de pedir un asiento inexistente, lo vuelve a pedir
            while(numColumna > 4 || numColumna < 0){
                System.out.println("El número de asiento no es válido, por favor introduzca un número del 1 al 5");
                inputColumna = sc.nextLine();
                numColumna =Integer.valueOf(inputColumna)-1;
            }
            
            if(asientos[numFila][numColumna]==false) {
                asientos[numFila][numColumna]= true;
                System.out.println("Se le ha asignado el asiento");
            } else{
                System.out.println("El asiento está ocupado");
            }
          
             //bucle para imprimir por pantalla el plano de las butacas.
            for (int fila = 0; fila < asientos.length; fila++){
                System.out.println();
                for (int columna =0; columna< 5; columna++){
                    if(asientos[fila][columna]== true){
                        System.out.print("|X|");
                    } 
                    else{
                        System.out.print("|O|");			
                    }
                }
                System.out.println();                          	
            }
            System.out.println("Ha terminado su reserva? si o no?");
             String respuesta = sc.nextLine();
             if(respuesta.equalsIgnoreCase("si")){
                 fin = true;
             }
       }
        
       
    }
    
}
