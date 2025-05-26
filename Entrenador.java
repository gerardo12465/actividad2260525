

 class Entrenador extends Persona {
    private String idFederacion;

    public Entrenador(Integer id, String nombre, String apellidos, Integer edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    // Getters and Setters
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    // Polymorphism: Specific implementation of abstract methods
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se está concentrando en la estrategia del equipo.");
    }

    @Override
    public void viajar() {
        System.out.println(getNombre() + " está viajando con el equipo.");
    }

    // Specific methods for Entrenador
    public void dirigirPartido() {
        System.out.println(getNombre() + " está dirigiendo el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " está dirigiendo el entrenamiento.");
    }

    @Override
    public String toString() {
        return "Entrenador: " + super.toString() + ", ID Federación: " + idFederacion;
    }
}


