/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ropa;

/**
 * estilo, tipoTejido
 * @author Usuario
 */
public class Pantalon extends Vestimenta{
    private String estilo;
    private String tipoTejido;

    public Pantalon() {
    }

    public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
    }

    public Pantalon(String estilo, String tipoTejido) {
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public Pantalon(String estilo, String tipoTejido, int codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    @Override
    public String toString() {
        return "Pantalon{" + "estilo=" + estilo + ", tipoTejido=" + tipoTejido + '}';
    }
    
     public void mensaje(){
        System.out.println("Este pantalon es de marca: " + this.getMarca());
    }
}
