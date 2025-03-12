import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String idPelicula;
    private String tituloDistribucion;
    private String tituloOriginal;
    private String genero;
    private String idiomaOriginal;
    private boolean subtitulosEspanol;
    private List<String> paisesOrigen;
    private int anoProduccion;
    private String urlSitioWeb;
    private int duracionMinutos;
    private String clasificacionEdad;
    private LocalDate fechaEstreno;
    private String resumen;
    private List<Director> directores;
    private List<Actor> actores;
    private List<Personaje> personajes;
    private List<Opinion> opiniones;

    public Pelicula(String idPelicula, String tituloDistribucion, String tituloOriginal, String genero,
                    String idiomaOriginal, boolean subtitulosEspanol, int anoProduccion,
                    int duracionMinutos, String clasificacionEdad, LocalDate fechaEstreno, String resumen) {
        this.idPelicula = idPelicula;
        this.tituloDistribucion = tituloDistribucion;
        this.tituloOriginal = tituloOriginal;
        this.genero = genero;
        this.idiomaOriginal = idiomaOriginal;
        this.subtitulosEspanol = subtitulosEspanol;
        this.anoProduccion = anoProduccion;
        this.duracionMinutos = duracionMinutos;
        this.clasificacionEdad = clasificacionEdad;
        this.fechaEstreno = fechaEstreno;
        this.resumen = resumen;
        this.paisesOrigen = new ArrayList<>();
        this.directores = new ArrayList<>();
        this.actores = new ArrayList<>();
        this.personajes = new ArrayList<>();
        this.opiniones = new ArrayList<>();
    }

    // Métodos para agregar elementos
    public void agregarPaisOrigen(String pais) {
        paisesOrigen.add(pais);
    }

    public void agregarDirector(Director director) {
        directores.add(director);
    }

    public void agregarActor(Actor actor, Personaje personaje) {
        actores.add(actor);
        personajes.add(personaje);
    }

    public void agregarOpinion(Opinion opinion) {
        opiniones.add(opinion);
    }

    // Getters
    public String getIdPelicula() {
        return idPelicula;
    }

    public String getTituloDistribucion() {
        return tituloDistribucion;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public boolean tieneSubtitulosEspanol() {
        return subtitulosEspanol;
    }

    public List<String> getPaisesOrigen() {
        return paisesOrigen;
    }

    public int getAnoProduccion() {
        return anoProduccion;
    }

    public String getUrlSitioWeb() {
        return urlSitioWeb;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public String getResumen() {
        return resumen;
    }

    public List<Director> getDirectores() {
        return directores;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public List<Opinion> getOpiniones() {
        return opiniones;
    }

    // Método para mostrar detalles de la película
    public void mostrarDetalles() {
        System.out.println("ID: " + idPelicula);
        System.out.println("Título de distribución: " + tituloDistribucion);
        System.out.println("Título original: " + tituloOriginal);
        System.out.println("Género: " + genero);
        System.out.println("Idioma original: " + idiomaOriginal);
        System.out.println("Subtítulos en español: " + (subtitulosEspanol ? "Sí" : "No"));
        System.out.println("Países de origen: " + String.join(", ", paisesOrigen));
        System.out.println("Año de producción: " + anoProduccion);
        System.out.println("URL del sitio web: " + urlSitioWeb);
        System.out.println("Duración: " + duracionMinutos / 60 + " h " + duracionMinutos % 60 + " min");
        System.out.println("Clasificación por edades: " + clasificacionEdad);
        System.out.println("Fecha de estreno: " + fechaEstreno);
        System.out.println("Resumen: " + resumen);

        System.out.println("\nDirectores:");
        for (Director director : directores) {
            System.out.println("- " + director.getNombre() + " (Películas dirigidas: " + director.getPeliculasDirigidas().size() + ")");
        }

        System.out.println("\nElenco:");
        for (int i = 0; i < actores.size(); i++) {
            System.out.println("- " + actores.get(i).getNombre() + " como " + personajes.get(i).getNombre() +
                    " (Películas actuadas: " + actores.get(i).getPersonajesInterpretados().size() + ")");
        }
    }

    public void mostrarOpiniones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarOpiniones'");
    }
}