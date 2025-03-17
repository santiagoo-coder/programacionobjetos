import java.util.Date;

public abstract class Persona {
    private String idPersona;
    private String nombre;
    private String nacionalidad;
    private Date fechaNacimiento;
    private String biografia;

    public Persona(String idPersona, String nombre, String nacionalidad, Date fechaNacimiento) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.biografia = "";
    }

    // Getters y setters
    public String getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}