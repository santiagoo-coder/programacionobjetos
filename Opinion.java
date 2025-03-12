import java.time.LocalDate;

public class Opinion {
    private String idOpinion;
    private String nombreCritico;
    private int edadCritico;
    private LocalDate fechaRegistro;
    private String calificacion; // Obra Maestra, Muy Buena, Buena, Regular, Mala
    private String comentario;

    public Opinion(String idOpinion, String nombreCritico, int edadCritico, LocalDate fechaRegistro, String calificacion, String comentario) {
        this.idOpinion = idOpinion;
        this.nombreCritico = nombreCritico;
        this.edadCritico = edadCritico;
        this.fechaRegistro = fechaRegistro;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    // Getters
    public String getIdOpinion() {
        return idOpinion;
    }

    public String getNombreCritico() {
        return nombreCritico;
    }

    public int getEdadCritico() {
        return edadCritico;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    // Método para mostrar detalles de la opinión
    public void mostrarDetalles() {
        System.out.println("ID: " + idOpinion);
        System.out.println("Crítico: " + nombreCritico + " (Edad: " + edadCritico + ")");
        System.out.println("Fecha de registro: " + fechaRegistro);
        System.out.println("Calificación: " + calificacion);
        System.out.println("Comentario: " + comentario);
    }
}