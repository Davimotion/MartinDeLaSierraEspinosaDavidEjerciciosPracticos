/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.entidades;

import ejercicio1.interfaces.Combustion;

/**d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. 
* Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible. 
* Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
 *
 * @author Usuario
 */
public class Camioneta extends Vehiculo implements Combustion{
    private double capacidadTanque;
    private double consumoCombustible;

    public Camioneta() {
    }

    public Camioneta(int id, String placa, String marca, String modelo, int año, double costo) {
        super(id, placa, marca, modelo, año, costo);
    }

    public Camioneta(double capacidadTanque, double consumoCombustible) {
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public Camioneta(double capacidadTanque, double consumoCombustible, int id, String placa, String marca, String modelo, int año, double costo) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "capacidadTanque=" + capacidadTanque + ", consumoCombustible=" + consumoCombustible + '}';
    }
    
    
    public void recargarCombustible(){
        
    }
    
    
    @Override
    public void calcular(){
        
    }
}
