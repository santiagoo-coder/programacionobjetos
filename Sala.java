public class Sala {
    private String idSala;
    private String nombre;
    private int capacidad;

    public Sala(String idSala, String nombre, int capacidad) {
        this.idSala = idSala;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    // Getters
    public String getIdSala() {
        return idSala;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }
}