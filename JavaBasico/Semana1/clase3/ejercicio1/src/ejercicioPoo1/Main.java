package ejercicioPoo1;

public class Main {

	public static void main(String[] args) {
		Electrodomestico nevera = new Electrodomestico(1, "Bosch", 7.5, "blanco");
		Electrodomestico tostadora = new Electrodomestico(2, "LG", 1.3, "rojo");
		Electrodomestico microondas = new Electrodomestico(3, "Samsung", 2.8, "verde");
		Electrodomestico vacio = new Electrodomestico();
		
		System.out.println(nevera.getMarca() + nevera.getConsumo() + nevera.getColor());
		System.out.println(tostadora.getMarca() + nevera.getConsumo() + nevera.getColor());
		System.out.println(microondas.getMarca()+microondas.getConsumo()+microondas.getColor());
		System.out.println(vacio.getMarca()); //escribe null
		
	}

}
