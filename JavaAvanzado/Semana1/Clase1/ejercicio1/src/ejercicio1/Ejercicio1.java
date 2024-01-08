package ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Imagina que estás desarrollando un sistema de reservas de vuelos para una
 * aerolínea. Los usuarios pueden realizar reservas de vuelos proporcionando
 * información como su nombre, destino, fecha de viaje y número de asientos
 * deseados. Tu tarea es implementar una función de reserva de vuelos que valide
 * los datos ingresados y maneje excepciones si los datos son incorrectos o si
 * no hay suficientes asientos disponibles en el vuelo.
 *
 * Debes crear una excepción personalizada, por ejemplo,
 * ReservaInvalidaException, que se lance en situaciones excepcionales, como
 * cuando un usuario intenta reservar más asientos de los disponibles o si falta
 * información esencial. La excepción personalizada debe proporcionar un mensaje
 * claro sobre la causa del error.
 */
public class Ejercicio1 {
public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        boolean trigger = false;
        ArrayList<Reserva> ListaReservas = new ArrayList<Reserva>();
        do {            
            int asientosMaximos = 50;
            int asientosOcupados = contarLista(ListaReservas);
            int asientosDisponibles = asientosMaximos - asientosOcupados;
            System.out.println("Asientos maximos: " + asientosMaximos);
            System.out.println("asientos ocupados: "+asientosOcupados);
            System.out.println("Asientos disponibles: " + asientosDisponibles);
            
            Reserva proceso = crearReserva();
            ListaReservas = validarReserva(ListaReservas, proceso, asientosDisponibles);
            for (Reserva reserva : ListaReservas) {
                System.out.println(reserva);
                
            }
            
            System.out.println("Continuar? 1: SI   2: NO.");
            switch (sc.nextLine()){
                case "1" -> {
                    
                }
                case "2" ->{
                    trigger = true;
                }
                default ->{
                    System.out.println("Solo tenias un trabajo macho.");
                }
            }   
        } while (trigger == false);
    }

    public static Reserva crearReserva() {
        Reserva r = new Reserva();

        System.out.println("Introduzca su nombre.");
        r.setNombre(sc.nextLine());

        System.out.println("Introduzca su destino");
        r.setDestino(sc.nextLine());

        System.out.println("Introduzca la fecha de su viaje en formato YYYY-MM-DD");
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                String input = sc.nextLine();
                r.setFecha(LocalDate.parse(input, DateTimeFormatter.ISO_LOCAL_DATE));
                entradaValida = true;
            } catch (Exception ReservaInvalidaException) {
                System.out.println("Error al introducir la fecha. Introduzca la fecha de su viaje en formato YYYY-MM-DD");
            }
        }

        System.out.println("Introduzca el número de asientos que desea reservar.");
        boolean entradaValida2 = false;
        while (!entradaValida2) {
            try {
                String input2 = sc.nextLine();
                int inputNum = Integer.parseInt(input2);
                if (inputNum <= 0) {
                    System.out.println("Introduzca un número mayor que 0");
                } else {
                    System.out.println("Se está procesando su reserva.");
                    r.setNumAsientos(inputNum);
                    entradaValida2 = true;
                }
            } catch (Exception ReservaInvalidaException) {
                System.out.println("Por favor introduzca un número entero válido");
            }
        }
        return r;
    }

    public static int contarLista(ArrayList<Reserva> lista) {
        int recuento = 0;
        for (Reserva reserva : lista) {
            recuento = recuento + reserva.getNumAsientos();
        }

        return recuento;
    }

    public static ArrayList validarReserva(ArrayList<Reserva> Lista, Reserva proceso, int asientosDisponibles) {
        if (proceso.getNumAsientos() <= asientosDisponibles) {
            Lista.add(proceso);
            System.out.println("Se ha procesado su reserva.");
        } else {
            System.out.println("El número de asientos solicitado sobrepasa el número de asientos disponibles.");
        }
        return Lista;
    }
    

}
