
package ejercicio2;

import ropa.*;


/**Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).

a) Crear las siguientes clases hijas que compartan sus atributos y métodos:

Zapato: material, tipoCierre

Pantalon: estilo, tipoTejido

Camiseta: manga, cuello

Sombrero: tipo, tamaño

b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).

c) Crear los siguientes métodos (en cada subclase correspondiente):

Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).

Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).

Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).

Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).

d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
 *
 * 
 */
public class Ejercicio2 {

    
    public static void main(String[] args) {
       Vestimenta[] lista = new Vestimenta[9];
       
       lista[0] = new Zapato("cuero", "cordones", 0, "pepe", 17.20, "Nike", "42", "rojo");
       lista[1] = new Zapato("polipiel ", "cremallera", 1, "paco", 11.80, "Rebook", "38", "blanco");
       lista[2] = new Zapato("lona", "velcro", 2, "Espartero", 7.5, "Tims", "41", "negro");
       lista[3] = new Pantalon("corto", "poliester ", 3, "Carlos", 8.90, "la pepa", "M", "rojo");
       lista[4] = new Pantalon("largo", "pana", 4, "alberto", 13.50, "Lefties", "L", "Azul");
       lista[5] = new Pantalon("pitillo", "vaquero", 5, "Juan", 15.80, "Addidas", "L", "azul");
       lista[6] = new Camiseta("larga", "cerrado", 6, "Pedro", 14.20, "Gucci", "L", "blanco");
       lista[7] = new Camiseta("corta", "largo", 7, "Fran", 18.90, "Springfield", "M", "gris");
       lista[8] = new Sombrero("de copa", 13.5, 8, "Wellington", 25.20, "sombrerington", "XL", "negro");
       
       for(int i = 0 ; i < 9 ; i++ ){
            lista[i].mensaje();            
       }
    }
    
}
