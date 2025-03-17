import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear película: Capitán América: Un Nuevo Mundo
        Pelicula pelicula1 = new Pelicula("P001", "Capitán América: Un Nuevo Mundo", "Captain America: A New World",
                "Acción", "Inglés", true, 2024, 137, "+12", LocalDate.of(2024, 7, 15),
                "Steve Rogers regresa para enfrentar una nueva amenaza global.");
        pelicula1.agregarPaisOrigen("Estados Unidos");

        Director director1 = new Director("D001", "Anthony Russo");
        pelicula1.agregarDirector(director1);

        Actor actor1 = new Actor("A001", "Chris Evans");
        Personaje personaje1 = new Personaje("Steve Rogers", pelicula1);
        pelicula1.agregarActor(actor1, personaje1);

        // Crear película: Mickey 17
        Pelicula pelicula2 = new Pelicula("P002", "Mickey 17", "Mickey 17",
                "Ciencia ficción", "Inglés", true, 2025, 137, "+17", LocalDate.of(2025, 2, 10),
                "Mickey Barnes (Pattinson) es un hombre de la Tierra que se inscribe en una expedición de colonización a un planeta helado distante y se ofrece como voluntario para un trabajo que lo coloca en situaciones mortales constantemente.");
        pelicula2.agregarPaisOrigen("Estados Unidos");

        Director director2 = new Director("D002", "Bong Joon-ho");
        pelicula2.agregarDirector(director2);

        Actor actor2 = new Actor("A002", "Robert Pattinson");
        Personaje personaje2 = new Personaje("Mickey Barnes", pelicula2);
        pelicula2.agregarActor(actor2, personaje2);

        // Crear película: Mufasa: El Rey León
        Pelicula pelicula3 = new Pelicula("P003", "Mufasa: El Rey León", "Mufasa: The Lion King",
                "Animación", "Inglés", true, 2024, 120, "Apta para todo público", LocalDate.of(2024, 12, 20),
                "La historia de Mufasa, el legendario rey de la sabana, y su ascenso al trono.");
        pelicula3.agregarPaisOrigen("Estados Unidos");

        Director director3 = new Director("D003", "Barry Jenkins");
        pelicula3.agregarDirector(director3);

        Actor actor3 = new Actor("A003", "Aaron Pierre");
        Personaje personaje3 = new Personaje("Mufasa", pelicula3);
        pelicula3.agregarActor(actor3, personaje3);

        // Crear cines
        Cine cine1 = new Cine("C001", "Cine Plaza", "Calle Principal 123", "123-456-7890");
        Cine cine2 = new Cine("C002", "Cine Central", "Avenida Libertad 456", "987-654-3210");

        // Crear salas
        Sala sala1 = new Sala("S001", "Sala 1", 100);
        Sala sala2 = new Sala("S002", "Sala 2", 150);
        Sala sala3 = new Sala("S003", "Sala 3", 200);

        // Asignar salas a los cines
        cine1.agregarSala(sala1);
        cine1.agregarSala(sala2);
        cine2.agregarSala(sala3);

        // Crear funciones
        Funcion funcion1 = new Funcion("F001", LocalDateTime.of(2024, 7, 15, 18, 0), sala1, pelicula1);
        Funcion funcion2 = new Funcion("F002", LocalDateTime.of(2025, 2, 10, 20, 0), sala2, pelicula2);
        Funcion funcion3 = new Funcion("F003", LocalDateTime.of(2024, 12, 20, 19, 30), sala3, pelicula3);

        // Crear promociones
        Promocion promocion1 = new Promocion("PR001", "50% de descuento de lunes a jueves antes de las 18:00", 0.5);
        Promocion promocion2 = new Promocion("PR002", "Entrada gratuita para escolares con uniforme", 1.0);

        // Asignar promociones a las funciones
        funcion1.asignarPromocion(promocion1); // 50% de descuento
        funcion3.asignarPromocion(promocion2); // Entrada gratuita para escolares

        // Crear soporte al cliente
        SoporteCliente soporteCliente = new SoporteCliente();

        // Simular interacción con el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Soporte al cliente ===");
        System.out.println("1. Enviar consulta o reportar problema");
        System.out.println("2. Ver consultas registradas");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (opcion == 1) {
            System.out.print("Ingrese su consulta o problema: ");
            String consulta = scanner.nextLine();
            soporteCliente.agregarConsulta(consulta);
        } else if (opcion == 2) {
            soporteCliente.mostrarConsultas();
        } else {
            System.out.println("Opción no válida.");
        }

        // Mostrar detalles de los cines
        System.out.println("\n=== Detalles de los cines ===");
        cine1.mostrarDetalles();
        System.out.println("\n----------------------------\n");
        cine2.mostrarDetalles();

        // Mostrar detalles de las funciones y elenco
        System.out.println("\n=== Detalles de las funciones ===");
        funcion1.mostrarDetalles();
        System.out.println("\nInformación de la película:");
        funcion1.getPelicula().mostrarDetalles();
        System.out.println("\n----------------------------\n");

        funcion2.mostrarDetalles();
        System.out.println("\nInformación de la película:");
        funcion2.getPelicula().mostrarDetalles();
        System.out.println("\n----------------------------\n");

        funcion3.mostrarDetalles();
        System.out.println("\nInformación de la película:");
        funcion3.getPelicula().mostrarDetalles();
    }
}