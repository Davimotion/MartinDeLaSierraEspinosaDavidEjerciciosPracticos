package ejercicio3;

import java.util.Scanner;

public class Main {
	/*Ejercicio Nº 3 - Arreglos: Vectores - Individual

	Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana,
	 calcule la temperatura máxima promedio que hubo.

	Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día.
	 Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.*/
	
	public static void main(String[] args) {
		double[] temperaturas = new double[7];
		Scanner sc = new Scanner(System.in);
		double suma = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("introduzca la temperatura número "+ (i+1));
			String input =sc.nextLine();
			temperaturas[i]= Double.valueOf(input); //he tenido que usar este método porque sc.nextDouble() hacia que el programa crasheara al introducir un decimal.
			System.out.println("Registrada temperatura de "+ temperaturas[i]+ " grados");
			suma = suma + temperaturas[i];
		} 
		sc.close();
		double media = suma / 7;
		System.out.println("La temperatura media de la última semana es de " + media + " grados.");
	}

}
