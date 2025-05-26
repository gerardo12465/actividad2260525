// Futbolista.java
public class Futbolista extends Persona {
    private Integer dorsal;
    private String demarcacion;

    public Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad); // Call superclass constructor
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    // Getters and Setters
    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    // Polymorphism: Specific implementation of abstract methods
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se está concentrando para el partido.");
    }

    @Override
    public void viajar() {
        System.out.println(getNombre() + " está viajando con el equipo para el partido.");
    }

    // Specific methods for Futbolista
    public void jugarPartido() {
        System.out.println(getNombre() + " está jugando el partido.");
    }

    public void entrenar() {
        System.out.println(getNombre() + " está entrenando.");
    }

    @Override
    public String toString() {
        return "Futbolista: " + super.toString() + ", Dorsal: " + dorsal + ", Demarcación: " + demarcacion;
    }
}