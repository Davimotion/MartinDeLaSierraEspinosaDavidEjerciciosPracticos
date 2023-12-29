/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.entidades;

import ejercicio1.interfaces.Combustion;

/**e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. 
* Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor. 
* Implementa los métodos abstractos de la clase abstracta y los de la interfaz
 *
 * @author Usuario
 */
public class Moto extends Vehiculo implements Combustion{
    private String cilindrada;
    private String tipoMotor;
    
    @Override
    public void calcular(){
        
    }
}
