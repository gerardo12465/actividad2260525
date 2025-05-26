// Persona.java
public abstract class Persona {
    // Encapsulation: Attributes are private
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;

    // Constructor
    public Persona(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Getters and Setters (Encapsulation)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    // Abstract methods (Abstraction & Polymorphism)
    public abstract void concentrarse();
    
    public abstract void viajar();

    // You could add a common toString() method here
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + " " + apellidos + ", Edad: " + edad;
    }
}