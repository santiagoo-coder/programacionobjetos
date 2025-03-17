import java.util.ArrayList;
import java.util.List;

public class SoporteCliente {
    private List<String> consultas; 

    public SoporteCliente() {
        this.consultas = new ArrayList<>();
    }

    // Método para agregar una consulta o problema
    public void agregarConsulta(String consulta) {
        consultas.add(consulta);
        System.out.println("Consulta registrada: " + consulta);
    }

    // Método para mostrar todas las consultas
    public void mostrarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("No hay consultas registradas.");
        } else {
            System.out.println("=== Consultas de soporte al cliente ===");
            for (String consulta : consultas) {
                System.out.println("- " + consulta);
            }
        }
    }
}