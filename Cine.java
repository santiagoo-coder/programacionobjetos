import java.util.ArrayList;
import java.util.List;

public class Cine {
    private String idCine;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Sala> salas;

    public Cine(String idCine, String nombre, String direccion, String telefono) {
        this.idCine = idCine;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salas = new ArrayList<>();
    }

    public void agregarSala(Sala sala) {
        salas.add(sala);
    }

    // Getters
    public String getIdCine() {
        return idCine;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    // Método para mostrar detalles del cine
    public void mostrarDetalles() {
        System.out.println("ID: " + idCine);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salas:");
        for (Sala sala : salas) {
            System.out.println("- " + sala.getNombre() + " (Capacidad: " + sala.getCapacidad() + ")");
        }
    }
}