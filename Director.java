import java.util.ArrayList;
import java.util.List;

public class Director {
    private String idDirector;
    private String nombre;
    private List<Pelicula> peliculasDirigidas;

    public Director(String idDirector, String nombre) {
        this.idDirector = idDirector;
        this.nombre = nombre;
        this.peliculasDirigidas = new ArrayList<>();
    }

    public void agregarPeliculaDirigida(Pelicula pelicula) {
        peliculasDirigidas.add(pelicula);
    }

    // Getters
    public String getIdDirector() {
        return idDirector;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pelicula> getPeliculasDirigidas() {
        return peliculasDirigidas;
    }
}