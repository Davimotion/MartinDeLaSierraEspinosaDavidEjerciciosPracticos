/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ropa;

/**
 *Sombrero: tipo, tamaño
 * @author Usuario
 */
public class Sombrero extends Vestimenta{
    private String tipo;
    private double tamaño;

    public Sombrero() {
    }

    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
    }

    public Sombrero(String tipo, double tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public Sombrero(String tipo, double tamaño, int codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Sombrero{" + "tipo=" + tipo + ", tama\u00f1o=" + tamaño + '}';
    }

    
    
     public void mensaje(){
        System.out.println("Este sombrero es de marca: " + this.getMarca());
    }
}
