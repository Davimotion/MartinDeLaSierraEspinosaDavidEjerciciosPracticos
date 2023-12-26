
package animales;

/**
 *
 *"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.
 */
public class Mamifero extends Animal {
    private int patas;
    private String reproduccion;
    private String color;
    private String habitat;

    public Mamifero() {
        super();
    }

    public Mamifero(int id, String nombre, int edad, String piel, String alimentacion) {
        super(id, nombre, edad, piel, alimentacion);
    }

    public Mamifero(int patas, String reproduccion, String color, String habitat, int id, String nombre, int edad, String piel, String alimentacion) {
        super(id, nombre, edad, piel, alimentacion);
        this.patas = patas;
        this.reproduccion = reproduccion;
        this.color = color;
        this.habitat = habitat;
    }
    
    
    
    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "patas=" + patas + ", reproduccion=" + reproduccion + ", color=" + color + ", habitat=" + habitat + '}';
    }

   public void hola(){
       System.out.println("hola soy un mamífero");
   }
    
}
