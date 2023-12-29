/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.entidades;

import ejercicio1.interfaces.Electrico;

/**c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. 
* Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs). 
* Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.
 *
 * @author Usuario
 */
public class Auto extends Vehiculo implements Electrico{
    private double capacidadBateria;
    private double autonomia;

    public Auto() {
    }

    public Auto(int id, String placa, String marca, String modelo, int año, double costo) {
        super(id, placa, marca, modelo, año, costo);
    }

    public Auto(double capacidadBateria, double autonomia) {
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public Auto(double capacidadBateria, double autonomia, int id, String placa, String marca, String modelo, int año, double costo) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "Auto{" + "capacidadBateria=" + capacidadBateria + ", autonomia=" + autonomia + '}';
    }

    
    @Override
    public void calcular(){
        
    }
   
    public void cargarEnergia(){
        System.out.println("cargando");
    }
}
