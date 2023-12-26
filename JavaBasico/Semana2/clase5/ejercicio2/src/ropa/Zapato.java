/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ropa;

/**
 *material, tipoCierre
 * @author Usuario
 */
public class Zapato extends Vestimenta{
    private String material;
    private String tipoCierra;

    public Zapato() {
    }
    
    

    public Zapato(String material, String tipoCierra, int codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierra = tipoCierra;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierra() {
        return tipoCierra;
    }

    public void setTipoCierra(String tipoCierra) {
        this.tipoCierra = tipoCierra;
    }

    @Override
    public String toString() {
        return "Zapato{" + "material=" + material + ", tipoCierra=" + tipoCierra + '}';
    }
    
    public void mensaje(){
        System.out.println("Este zapato es de marca: " + this.getMarca());
    }
}
