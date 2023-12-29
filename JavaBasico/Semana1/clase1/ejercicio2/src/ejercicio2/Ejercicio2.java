/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 2:");
        String cadena = "Esto es un String";
        int numeroEntero = 5;
        double numero = 5.5;
        boolean interruptor = true;

        System.out.println("Variable String: "+ cadena);
        System.out.println("Variable int "+ numeroEntero);
        System.out.println("Variable double "+ numero);
        System.out.println("Variable booleana "+ interruptor);

        //Las variables String pueden almacenar texto, incluído caracteres numéricos, pero se guardan como texto y no
        //como valores, por lo tanto no se puede usar la variable para calculos matemáticos. No da error porque guarda
        //números como texto.
        String cadenaMal = "5";
        //Las variables int almacenan números enteros, no pueden almacenar decimales. Da error cuando añades un decimal.
      //int numeroEnteroMal = 5.5;
        //Las variables double pueden almacenar números con decimales, no aceptan texto y da error.
      //double numeroMal = "hola";
        //Las variables booleanas solo aceptan dos valores: "true" o "false". Da error si introduces cualquier otro valor.
      //boolean interruptorMal = 7;
        System.out.println();
    }
    
}
