
package ejercicio1;

import java.time.LocalDate;

/**
 *nombre, destino, fecha de viaje y número de asientos deseados.
 *
 */
public class Reserva {
    private String nombre;
    private String destino;
    private LocalDate fecha;
    private int numAsientos;

    public Reserva() {
    }

    public Reserva(String nombre, String destino, LocalDate fecha, int numAsientos) {
        this.nombre = nombre;
        this.destino = destino;
        this.fecha = fecha;
        this.numAsientos = numAsientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nombre=" + nombre + ", destino=" + destino + ", fecha=" + fecha + ", numAsientos=" + numAsientos + '}';
    }
    
    
    
}
