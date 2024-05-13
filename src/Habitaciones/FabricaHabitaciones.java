package habitaciones;

import extras.*;
import juego.*;
import personajes.*;

import java.util.*;

public class FabricaHabitaciones {
    private static Scanner sc = new Scanner (System.in);

    public static Habitacion creaHabitacionPresentacion(){
        String descripcion = "¡Bienvenid@s al interciclo de 1º de Desarrollo de Aplicaciones Multiplataforma! ";
        String[] dialogo = {
        "Hemos preparado una pequeña demo de un juego. En este caso es...  ",
        "Bueno, ahora lo veréis... ¡Esperamos que os guste! :) ", 
        "Como podéis comprobar, el juego carece de gráficos. Por tanto, sugerimos que leáis detenidamente.", 
        "La respuesta puede estar en el texto... ",
        "En serio...", "...", "Responde con cuidado... ", "¡Esperamos que lo disfrutéis! "
        };

        //for (String linea : dialogo) {
        //    System.out.println(linea);
        //    Temp.Temporizador(3000); // Pausa de 3 segundos entre cada línea
        //}

        String pistas = "Puedes ver una llave tirada en el suelo. ";
        System.out.print("Presiona Enter para continuar... ");
        sc.nextLine();
        Temp.LimpiarPantalla();

        //Arreglar
        return new Habitacion(descripcion, dialogo, pistas, null, null);
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
            };


        String pistas = "Pistas del tutorial";
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null, null);
    }

    public static Habitacion creaHabTuto(){
        String descripcion = "¡HabFinal!";
        String[] dialogo = {
            "- ¡Bien! Tampoco tenemos nada mejor que hacer, vayamos al castillo!.", 
            "~ Exclama un compañero ~ A todos os parece una buena idea, y sin dudar, partís.",
            "Seguís las indicaciones de la persona al cargo, y, tras 9 minutos, llegáis al castillo.",
            "Es un castillo de lo más normal, con su puente levadizo",
            " torretas para catapultas y varios puntos estrátegicos necesarios en la época.",
            "Está un poco en ruinas, tiene varias brechas en los muros, el río está seco y...",
            "Ahora que lo miras detenidamente, tu corazón empieza a acelerarse.",
            "Sientes una extraña sensación y te planteas dar media vuelta...", 
            "¿Uh? Estás bien, colega? -Te preguntan."
        };

        /* 
        System.out.print("Elige tu respuesta: " );
        Temp.Temporizador(2000);
        System.out.println("\nMenú: \n1.- Sí.\n2.- No.");
        int eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Perfecto! Justo ahí tenemos el castillo. ENTREMOS!!");
                sc.nextLine();
                break;
            case 2:
                System.out.println("Tranqui. Esos son los nervios de entrar al castillo. ¡Me pasa lo mismo! No te preocupes, lleva años en desuso y es una atracción como nos dijeron.");
                sc.nextLine();
                break;
            default:
                System.out.println("¿Cómo? No entendí bien");
                break;
       asdf }
*/
        String pistas = "Pistas de la habitación final";

        //Quizás sea necesario implementar  "LimpiarPantalla()" en
        Temp.LimpiarPantalla();
        //Ejemplo de enemigo
        Enemigo enemigoTuto = new Enemigo("Lord Medac", 100, 10, 5);
        //Puede dar fallos, pero es un ejemplo
        Objeto llave = new Objeto("Llave", 1, null, null);

        return new Habitacion(descripcion, dialogo, pistas, llave, enemigoTuto);
    }

    public static Habitacion creaHabitacionHab0(){
        String descripcion = "¡Hab0!";
        String[] dialogo = {

            "Con mucha confianza, y sin pensarlo dos veces, te sacudes los miedos y cruzas corriendo el puente levadizo.",
            "*Acabas de entrar en el castillo...*",
            "Al escuchar la voz de tu compi, te das media vuelta para saber que está pasando...",
            "¡¡Oh, f*ck!! ",
            "Presiona Enter para continuar...",
            "Al mirar atrás, ves como el puente se ha cerrado detrás tuya...",
            "Eh! Eh!!- Escuchas un grito detrás del puente levado - ", 
            "Avisaremos a la persona al cargo y vendremos a por ti,",
            "intenta buscar alguna salida mientras y no te metas en líos!",
            "Presiona Enter para continuar."
        };

        String pistas = "Pistas de la habitación 0";
 
        return new Habitacion(descripcion, dialogo, pistas, null, null);
    }

    public static Habitacion creaHabitacionHab1(){
        String descripcion = "¡Hab1!";
        String[] dialogo = {
            "Te quedas en shock con la cara un tanto descompuesta...",
            "Después de unos minutos mirando a la puerta como alguien de poco IQ, decides que será divertido explorar un castillo abandonado. ",
            "Pronto llegarán. -Piensas-",
            "¿Qué quieres hacer?"
        };
            //Aquí agregar un menú para que el jugador pueda elegir si quiere seguir o no

        String pistas = "Pistas de la habitación 1";
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null, null);
    }
    public static Habitacion creaHabitacionHab2(){
        String descripcion = "¡Hab2!";
        String[] dialogo = {
        
        "Entras en el pasillo y te paras. Parece un pasillo normal, pero sabes que no lo será.",
        "Das un paso dudoso y piensas que tienes que tener más decisión si quieres llegar a la siguiente habitación.",
        "Respiras hondo y comienzas a caminar. Entornas los ojos y de repente suena un ruido de engranajes.",
        "¡Mierda! Las paredes del pasillo comienzan a cerrarse lentamente y cada sonido del engranaje se clava en tus entrañas.",
        "Está bien -piensas-, es el momento de pensar rápido si no quiero morir en versión 2D.",
        "Sólo tienes dos opciones y tienes que salir rápido de este pasillo. Las paredes se siguen cerrando y casi puedes tocarlas con ambas manos a la vez. ",
        "Sigue hacia delante o gira a la derecha. ¡DECIDE! ¡¡VAMOS!! ",
      

        };
        //"Elige una opción: \n",
        //"1.- Hacia adelante ",
        //"2.- Hacia la izquierda"

        String pistas = "Pistas de la habitación 2";
        //System.out.print("Presiona Enter para continuar...");
        //sc.nextLine();
        //Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null, null);
    }

    public static Habitacion creaHabitacionHab3(){
        String descripcion = "¡Hab3!";
        String[] dialogo = {

        "¡Has descubierto la sala secreta!",
        "*Crac*",
        "Oh oh, creo que no estás sol@...",
        "Aparece una sombra",
        "Desde la sombra empiezas a distinguir algo",
        "Sea lo que sea, está claro que no es humano",
        "Y los más de 2 metros de altura no ayudan a mantener la calma",
        "Te das la vuelta y te diriges rápidamente hacia la puerta",
        "Vaya parece que está bloqueada, no tienes escapatoria",
        "En este momento, eres tú o ese ser de procedencia desconocida",
        "", // el jugador debe interactuar para derrotar al monstruo
        "No ha sido fácil... ¡pero lo lograste!",
        "Es momento de descubrir si la puerta sigue bloqueada o no..." // el jugador se dirige a la puerta y al haber derrotado al monstruo la puerta se ha desbloqueado y ya puede salir y avanzar
        };


        String pistas = "Pistas de la habitación 3";
        //System.out.print("Presiona Enter para continuar...");
        //sc.nextLine();
        //Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null, null);
    }

    public static Habitacion creaHabitacionHab4(){
        String descripcion = "¡Hab4!";
        String[] dialogo = {" "};

    

        String pistas = "Pistas de la habitación 4";
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null, null);
    }

    public static Habitacion creaHabitacionHab5(){
        String descripcion = "¡Hab5!";
        String[] dialogo = {" "};

   

        String pistas = "Pistas de la habitación 5";
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null, null);
    }

    public static Habitacion creaHabitacionHab6(){
        String descripcion = "¡Hab6!";
        String[] dialogo = {" "};

    

        String pistas = "Pistas de la habitación 6";
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null, null);
    }

    public static Habitacion creaHabitacionHab7(){
        String descripcion = "¡Hab7!";
        String[] dialogo = {" "};

   

        String pistas = "Pistas de la habitación 7";
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null, null);
    }

    public static Habitacion creaHabitacionHab8(){
        String descripcion = "¡Hab8!";
        String[] dialogo = {" "};



        String pistas = "Pistas de la habitación 8";
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null, null);
    }

    public static Habitacion creaHabitacionHab9(){
        String descripcion = "¡Hab9!";
        String[] dialogo = {" "};


        String pistas = "Pistas de la habitación 9";
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine();
        Temp.LimpiarPantalla();

        return new Habitacion(descripcion, dialogo, pistas, null, null);
    }


    
    
}