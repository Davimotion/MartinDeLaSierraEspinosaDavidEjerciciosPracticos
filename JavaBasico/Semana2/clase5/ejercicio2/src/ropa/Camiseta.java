/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ropa;

/**
 *
 * Camiseta: manga, cuello
 */
public class Camiseta extends Vestimenta {
    private String manga;
    private String cuello;

    public Camiseta() {
    }

    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
    }

    public Camiseta(String manga, String cuello) {
        this.manga = manga;
        this.cuello = cuello;
    }

    public Camiseta(String manga, String cuello, int codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    @Override
    public String toString() {
        return "Camiseta{" + "manga=" + manga + ", cuello=" + cuello + '}';
    }
    
     public void mensaje(){
        System.out.println("Esta camiseta es de marca: " + this.getMarca());
    }
}
