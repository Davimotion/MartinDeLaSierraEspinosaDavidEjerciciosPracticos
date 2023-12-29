package ejercicio2;

import java.util.Scanner;

public class Main {
	
//Ejercicio Nº 2 - Estructuras Repetitivas - Individual
	/*a) Imagina que eres un cajero en un supermercado.
	 *  Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
	
	Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar.
	Luego, muestra el total de la compra que debe abonar.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String input = null;
	    double total = 0;
	    boolean fin = false;
		while(fin == false) { 
			System.out.println("Introduzca el precio de un producto para sumar al total. Cuando haya terminado escriba 'fin'");
			input = sc.nextLine();
				if(input.equals("fin")) {
					fin = true;
					System.out.println("El total de sus productos es: "+ total);
					sc.close();
					}
				else {double precio =  Double.valueOf(input);
			total = total + precio;
			System.out.println(total);}
		}	   
	}
}
