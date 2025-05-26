public class Masajista extends Persona {

    private String titulacion;
    private Integer aniosExperiencia;

    public Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Getters and Setters
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // Polymorphism: Specific implementation of abstract methods
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se está concentrando en las necesidades de los jugadores.");
    }

    @Override
    public void viajar() {
        System.out.println(getNombre() + " está viajando con el equipo para dar apoyo.");
    }

    // Specific method for Masajista
    public void darMasaje() {
        System.out.println(getNombre() + " está dando un masaje.");
    }

    
}
