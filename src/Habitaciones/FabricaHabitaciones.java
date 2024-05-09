package habitaciones;

import extras.Temp;
import java.util.*;

public class FabricaHabitaciones {
    private static Scanner sc = new Scanner (System.in);

    public static Habitacion creaHabitacionPresentacion(){
        String descripcion = "¡Bienvenid@s al interciclo de 1º de Desarrollo de Aplicaciones Multiplataforma! ";
        String[] dialogo = {
        "Hemos preparado una pequeña demo de un juego. En este caso es...  ",
        "Bueno, ahora lo veréis1... ¡Esperamos que os guste! :) ", 
        "Como podéis comprobar, el juego carece de gráficos. Por tanto, sugerimos que leáis detenidamente. La respuesta puede estar en el texto... ",
        "En serio...", "...", "Responde con cuidado... ", "¡Esperamos que lo disfrutéis! "
        };

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); // Pausa de 2 segundos entre cada línea
        }

        String[] pistas = {"Puedes ver una llave tirada en el suelo. "};
        System.out.print("Presiona Enter para continuar... ");
        sc.nextLine();
        Temp.LimpiarPantalla();

        Habitacion habitacionIntro = new Habitacion(descripcion, dialogo, pistas, null);
        habitacionIntro.mostrarPistas();

        return habitacionIntro;
    }

    public static Habitacion creaHabIntro(){
        String descripcion = "¡Introducción!";
        String[] dialogo = {
            "¡Por fin acabó el trimestre!",
            "Tú y tus amigos habéis quedado para unas vacaciones en un camping.",
            "Al llegar, dejáis vuestras pertenencias en el bungaloo asignado.",
            "*TOC, TOC, TOC!* Llaman a la puerta...",
            "¿Se puede? - Pregunta alguien con voz masculina...",
            "Perdonad chicos, pero parece que tenemos un problema con las instalaciones.",
            "-'Parece ser quien se encarga.'-",
            "Necesitamos que dejéis las instalaciones tan solo una hora. Para entonces todo estará resuelto.",
            "Sabemos que acabáis de llegar, nos ha surgido un imprevisto. Os recompensaremos por las molestias.",
            "Estamos en terrenos de 'Lord Medac', Conde de estas tierras. Si miráis al norte al salir, veréis su castillo. ¡Es una gran atracción en el lugar!",
            "Bueno, he de seguir con la ruta de aviso, luego nos vemos. ¡Disfrutad de la exploración!",
            "Presiona Enter para continuar..."};

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); 
        }

        String[] pistas = {"Pistas del tutorial"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null);
    }

    public static Habitacion creaHabTuto(){
        String descripcion = "¡HabFinal!";
        String[] dialogo = {
            "- ¡Bien! Tampoco tenemos nada mejor que hacer, vayamos al castillo!. ~ Exclama un compañero ~ A todos os parece una buena idea, y sin dudar, partís.",
            "Seguís las indicaciones de la persona al cargo, y, tras 9 minutos, llegáis al castillo.",
            "Es un castillo de lo más normal, con su puente levadizo, torretas para catapultas y varios puntos estrátegicos necesarios en la época.",
            "Está un poco en ruinas, tiene varias brechas en los muros, el río está seco y... Ahora que lo miras detenidamente, tu corazón empieza a acelerarse.",
            "Sientes una extraña sensación y te planteas dar media vuelta...",
            "Presiona Enter para continuar...",
            "¿Uh? Estás bien, colega? -Te preguntan.",
            "Elige tu respuesta: ",
            "",
            //Este menú debe ser un if/else para que el jugador pueda elegir si quiere seguir o no
            "\nMenú: ",
            "1.- Sí.",
            "2.- No."};

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); 
        }

        String[] pistas = {"Pistas de la habitación final"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null);
    }

    public static Habitacion creaHabitacionHab0(){
        String descripcion = "¡Hab0!";
        String[] dialogo = {
            "Con mucha confianza, y sin pensarlo dos veces, te sacudes los miedos y cruzas corriendo el puente levadizo.",
            "Acabas de entrar en el castillo...",
            "¿QUÉ? ¡CUIDADO! ¡Espera! ~*Suena un mecanismo*~",
            "Al escuchar la voz de tu compi, te das media vuelta para saber que está pasando...",
            "¡¡Oh, f*ck!! ",
            "Presiona Enter para continuar...",
            ".",
            "..",
            "...",
            "Al mirar atrás, ves como el puente se ha cerrado detrás tuya... ",
            "�h�Eh!!- Escuchas un grito detrás del puente levado",
            "- Avisaremos a la persona al cargo y vendremos a por ti, intenta buscar alguna salida mientras y no te metas en líos!",
            "Presiona Enter para continuar."};

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000);
        }

        String[] pistas = {"Pistas de la habitación 0"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null);
    }

    public static Habitacion creaHabitacionHab1(){
        String descripcion = "¡Hab1!";
        String[] dialogo = {
            "Te quedas en shock con la cara un tanto descompuesta...",
            "Después de unos minutos mirando a la puerta como alguien de poco IQ, decides que será divertido explorar un castillo abandonado. ",
            "Pronto llegarán. -Piensas-",
            "¿Qué quieres hacer?"};
            //Aquí agregar un menú para que el jugador pueda elegir si quiere seguir o no
        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); 
        }

        String[] pistas = {"Pistas de la habitación 1"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null);
    }
    public static Habitacion creaHabitacionHab2(){
        String descripcion = "¡Hab2!";
        String[] dialogo = {" "};

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); 
        }

        String[] pistas = {"Pistas de la habitación 2"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null);
    }

    public static Habitacion creaHabitacionHab3(){
        String descripcion = "¡Hab3!";
        String[] dialogo = {" "};

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); 
        }

        String[] pistas = {"Pistas de la habitación 3"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null);
    }

    public static Habitacion creaHabitacionHab4(){
        String descripcion = "¡Hab4!";
        String[] dialogo = {" "};

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); 
        }

        String[] pistas = {"Pistas de la habitación 4"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null);
    }

    public static Habitacion creaHabitacionHab5(){
        String descripcion = "¡Hab5!";
        String[] dialogo = {" "};

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); 
        }

        String[] pistas = {"Pistas de la habitación 5"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null);
    }

    public static Habitacion creaHabitacionHab6(){
        String descripcion = "¡Hab6!";
        String[] dialogo = {" "};

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); 
        }

        String[] pistas = {"Pistas de la habitación 6"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null);
    }

    public static Habitacion creaHabitacionHab7(){
        String descripcion = "¡Hab7!";
        String[] dialogo = {" "};

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); 
        }

        String[] pistas = {"Pistas de la habitación 7"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null);
    }

    public static Habitacion creaHabitacionHab8(){
        String descripcion = "¡Hab8!";
        String[] dialogo = {" "};

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); 
        }

        String[] pistas = {"Pistas de la habitación 8"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null);
    }

    public static Habitacion creaHabitacionHab9(){
        String descripcion = "¡Hab9!";
        String[] dialogo = {" "};

        for (String linea : dialogo) {
            System.out.println(linea);
            Temp.Temporizador(2000); 
        }

        String[] pistas = {"Pistas de la habitación 9"};
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null);
    }
    
}