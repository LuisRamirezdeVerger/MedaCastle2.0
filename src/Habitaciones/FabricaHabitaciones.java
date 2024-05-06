package habitaciones;

import extras.Temp;
import java.util.*;

public class FabricaHabitaciones {
    private static Scanner sc = new Scanner (System.in);

    public static Habitacion creaHabitacionIntro(){
        String descripcion = "¡Bienvenid@s al interciclo de 1º de Desarrollo de Aplicaciones Multiplataforma!";
        String[] dialogo = {
        "Hemos preparado una pequeña demo de un juego. En este caso es...  ",
        "Bueno, ahora lo veréis1... ¡Esperamos que os guste! :)", 
        "Como podéis comprobar, el juego carece de gráficos. Por tanto, sugerimos que leáis detenidamente. La respuesta puede estar en el texto... ",
        "En serio...", "...", "Responde con cuidado... ", "¡Esperamos que lo disfrutéis!"
        };

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); // Pausa de 2 segundos entre cada línea
        }

        String[] pistas = {"Puedes ver una llave tirada en el suelo"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        Habitacion habitacionIntro = new Habitacion(descripcion, dialogo, pistas);
        habitacionIntro.mostrarPistas();

        return habitacionIntro;
    }

    public static Habitacion creaHabitacionHab0(){
        String descripcion = "¡Bienvenid@s al interciclo de 1º de Desarrollo de Aplicaciones Multiplataforma!";
        String[] dialogo = {
        "Hemos preparado una pequeña demo de un juego. En este caso es...  ",
        "Bueno, ahora lo veréis... ¡Esperamos que os guste! :)", 
        "Como podéis comprobar, el juego carece de gráficos. Por tanto, sugerimos que leáis detenidamente. La respuesta puede estar en el texto... ",
        "En serio...", "...", "Responde con cuidado... ", "¡Esperamos que lo disfrutéis!"
        };

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); // Pausa de 2 segundos entre cada línea
        }

        String[] pistas = {"Puedes ver una llave tirada en el suelo"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas);
    }
}
