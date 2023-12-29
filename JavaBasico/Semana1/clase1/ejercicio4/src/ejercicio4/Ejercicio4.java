/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 4");
        System.out.println("Introduce un número entero");
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce otro número entero");
        int num2 =  Integer.parseInt(sc.nextLine());
        sc.close();


        System.out.println("La suma de los números es: " + (num1 + num2));
        System.out.println("La resta de los números es: "+ (num1 - num2));
        System.out.println("La multiplicación de los números es: "+num1*num2);
        if (num2 == 0){
            System.out.println("No se puede dividir entre 0");}
            else {
            System.out.println("La división de los números es: "+ num1/num2);
        }
    }
    
}
