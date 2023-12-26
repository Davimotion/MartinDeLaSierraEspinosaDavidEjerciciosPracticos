/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * "Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
 */
public class Ave extends Animal{
    private double envergaduraAla;
    private String tipoVuelo;
    private String colorPlumas;
    private String tipoPico;

    public Ave() {
        super();
    }
    
   
    public Ave(int id, String nombre, int edad, String piel, String alimentacion) {
        super(id, nombre, edad, piel, alimentacion);
    }

    
    public Ave(double envergaduraAla, String tipoVuelo, String colorPlumas, String tipoPico, int id, String nombre, int edad, String piel, String alimentacion) {
        super(id, nombre, edad, piel, alimentacion);
        this.envergaduraAla = envergaduraAla;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumas = colorPlumas;
        this.tipoPico = tipoPico;
    }

    public double getEnvergaduraAla() {
        return envergaduraAla;
    }

    public void setEnvergaduraAla(double envergaduraAla) {
        this.envergaduraAla = envergaduraAla;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    

    @Override
    public String toString() {
        return "Ave{" + "envergaduraAla=" + envergaduraAla + ", tipoVuelo=" + tipoVuelo + ", colorPlumas=" + colorPlumas + ", tipoPico=" + tipoPico + '}';
    }

    public void hola(){
        System.out.println("hola soy un ave");
   }
    
}
