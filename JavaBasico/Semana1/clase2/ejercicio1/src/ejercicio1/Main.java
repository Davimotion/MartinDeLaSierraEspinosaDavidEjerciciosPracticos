package ejercicio1;

import java.util.Scanner;

public class Main {
	
	/*Ejercicio Nº 1 - Estructuras Condicionales - Individual

a) Una recital permite únicamente el ingreso de mayores de 18 años.
 Para ello necesita un programa que, a partir de que un usuario ingrese su edad,
  determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
   El programa debe mostrar (según cada caso) un mensaje informando la situación.*/

	public static void main(String[] args) {
		int edad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la edad del usuario.");
		edad = sc.nextInt();
		if (edad > 18) {System.out.println("El usuario es menor de 18 años y por tanto no puede entrar al recital.");}
		else {System.out.println("El usuario es mayor de 18 y puede entrar al recital.");}
		sc.close();		
	}
}
