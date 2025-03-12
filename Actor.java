import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String idActor;
    private String nombre;
    private List<Personaje> personajesInterpretados;

    public Actor(String idActor, String nombre) {
        this.idActor = idActor;
        this.nombre = nombre;
        this.personajesInterpretados = new ArrayList<>();
    }

    public void agregarPersonajeInterpretado(Personaje personaje) {
        personajesInterpretados.add(personaje);
    }

    // Getters
    public String getIdActor() {
        return idActor;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Personaje> getPersonajesInterpretados() {
        return personajesInterpretados;
    }
}