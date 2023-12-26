
package ejercicio1;

import animales.Animal;
import animales.Ave;
import animales.Mamifero;
import animales.Reptil;

/*Ejercicio Nº 1 - Herencia, Polimorfismo y Encapsulamiento - Individual

Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación (con sus métodos y constructores correspondientes). 
Agregar también un método llamado saludar que emita un mensaje por pantalla que diga “Hola, soy un animal”. A partir de esto hacer lo siguientes pasos:

a) Crear sus clases hijas que compartan sus atributos y métodos:

"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.

"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.

"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.

b)  Una vez creadas las clases, crear los siguientes métodos:

"Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".

"Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".

"Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".

c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.

d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?

E) Cambiar el modificador de acceso de los métodos de "public" a "private". 
Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?*/

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //todos
        Mamifero perro = new Mamifero(4, "sexual", "marron", "ciudad", 1, "Pipo", 5, "suave", "carne");
        Ave gaviota = new Ave(12.5, "bajo", "blanco", "largo", 2, "Morgans", 7, "emplumada", "peces");
        Reptil piton = new Reptil(38.7, "pequeñas", "no", "jungla", 3, "Javier", 6, "escamada", "ratones");
        
        //muestro los objetos por terminal
        System.out.println(perro);
        System.out.println(gaviota);
        System.out.println(piton);
        
        //ejecuto las funciones que llaman a la funcion heredada de Animal. Si la funcion en la clase padre es private solo puedo llamarla
        //desde un objeto de clase heredada. Si las funciones en las clases heredadas son private no puedo llamarlas desde el Main.
        perro.hola();
        gaviota.hola();
        piton.hola();
        
        //creo un nuevo animal
        Animal prueba = new Animal();
        //el Animal prueba contiene el objeto heredado perro.
        prueba = perro;
        System.out.println(prueba.getNombre());
       
        System.out.println( "el objeto de tipo Animal tiene los atributos de perro por polimorfismo: " + prueba);
        
        
        
        
    }
    
}
