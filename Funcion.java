import java.time.LocalDateTime;

public class Funcion {
    private String idFuncion;
    private LocalDateTime fechaHora;
    private Sala sala;
    private Pelicula pelicula;
    private Promocion promocion; // Promoción asociada a la función

    public Funcion(String idFuncion, LocalDateTime fechaHora, Sala sala, Pelicula pelicula) {
        this.idFuncion = idFuncion;
        this.fechaHora = fechaHora;
        this.sala = sala;
        this.pelicula = pelicula;
    }

    // Método para asignar una promoción a la función
    public void asignarPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    // Getters
    public String getIdFuncion() {
        return idFuncion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Sala getSala() {
        return sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    // Método para mostrar detalles de la función
    public void mostrarDetalles() {
        System.out.println("ID: " + idFuncion);
        System.out.println("Fecha y hora: " + fechaHora);
        System.out.println("Sala: " + sala.getNombre());
        System.out.println("Película: " + pelicula.getTituloDistribucion());

        if (promocion != null) {
            System.out.println("\nPromoción aplicable:");
            promocion.mostrarDetalles();
        }
    }
}