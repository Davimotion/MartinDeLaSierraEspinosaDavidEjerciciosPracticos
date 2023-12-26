/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * "Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
 */
public class Reptil extends Animal {
    private double longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String tipoHabitat;

    public Reptil() {
        super();
    }

    public Reptil(int id, String nombre, int edad, String piel, String alimentacion) {
        super(id, nombre, edad, piel, alimentacion);
    }

    public Reptil(double longitud, String tipoEscamas, String tipoVeneno, String tipoHabitat, int id, String nombre, int edad, String piel, String alimentacion) {
        super(id, nombre, edad, piel, alimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.tipoHabitat = tipoHabitat;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString() {
        return "Reptil{" + "longitud=" + longitud + ", tipoEscamas=" + tipoEscamas + ", tipoVeneno=" + tipoVeneno + ", tipoHabitat=" + tipoHabitat + '}';
    }
    
    public void hola(){
        System.out.println("hola soy un reptil");
   }
    
    
}
