public class Personaje {
    private String nombre;
    private Pelicula pelicula;

    public Personaje(String nombre, Pelicula pelicula) {
        this.nombre = nombre;
        this.pelicula = pelicula;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
}