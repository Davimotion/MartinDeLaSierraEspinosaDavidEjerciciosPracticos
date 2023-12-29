package ejercicioPoo2;

/*Ejercicio Nº 2 - POO - Individual

Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.

b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.

c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.

d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.*/

public class Main {

	public static void main(String[] args) {
		
		//Creamos los objetos
		Persona p1 = new Persona(1, "David", 27, "Calle 1", "666");
		Persona p2 = new Persona(2, "Isa", 26, "Raval 1", "6969");
		Persona p3 = new Persona(3, "Jorge", 31, "Quinto Pino", "420");
		Persona p4 = new Persona(4, "Enrique", 25, "Carrús 214", "7444");
		Persona p5 = new Persona(5, "Oscar", 35, "Aparadora", "1234");
		
		//Creamos el array y le asignamos los objetos a las posiciones
		Persona[] lista = new Persona [5];
		lista[0]= p1;
		lista[1]= p2;
		lista[2]= p3;
		lista[3]= p4;
		lista[4]= p5;
		
		//Recorremos el array y lo mostramos en terminal.
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
		//Mostramos el antes
		System.out.println("Se va a cambiar el nombre de: ");
		System.out.println(lista[1]);
		System.out.println(lista[3]);
		System.out.println("a: ");
		//Cambiamos el nombre y lo mostramos en terminal.
		p2.setNombre("Pablo");
		p4.setNombre("Jose");
		System.out.println(lista[1]);
		System.out.println(lista[3]);
		
		System.out.println("Las personas cuya edad es mayor que 30 son: ");
		for(int i = 0; i < lista.length; i++) {
			if(lista[i].getEdad()> 30) {
				System.out.println(lista[i]);
			}
		}
		
		
		
	}

}
