package habitaciones;

import extras.*;
//import juego.*;
//import personajes.*;
import java.util.*;

public class FabricaHabitaciones {

    private static final Map<Posicion, Habitacion> habitaciones = new HashMap<>();

    public static Habitacion getHabitacion(Posicion posicion) {
        return habitaciones.get(posicion);
    }

    public static void agregarHab(Posicion posicion, Habitacion habitacion){
        habitaciones.put(posicion, habitacion);
    }
    

    // private static Scanner sc = new Scanner (System.in);
    public static void inicializarHabitaciones() {
        // Creamos y asignamos habitaciones a posiciones específicas
        // Las 4 primeras carecen de posicion, ya que no es necesario
        // habitaciones.put(new Posicion(0, 0), creaHabitacionPresentacion());
        // habitaciones.put(new Posicion(0, 0), creaHabIntro());
        // habitaciones.put(new Posicion(0, 0), creaHabTuto());
        // habitaciones.put(new Posicion(0, 0), creaHabitacionHab0());
        habitaciones.put(new Posicion(2, 0), creaHabitacionHab1());
        habitaciones.put(new Posicion(2, 1), creaHabitacionHab2());
        habitaciones.put(new Posicion(2, 2), creaHabitacionHab3());
        habitaciones.put(new Posicion(1, 0), creaHabitacionHab4());
        habitaciones.put(new Posicion(1, 1), creaHabitacionHab5());
        habitaciones.put(new Posicion(1, 2), creaHabitacionHab6());
        habitaciones.put(new Posicion(0, 0), creaHabitacionHab7());
        habitaciones.put(new Posicion(0, 1), creaHabitacionHab8());
        habitaciones.put(new Posicion(0, 2), creaHabitacionHab9());

        // Añadir más habitaciones según sea necesario
    }

    public static Habitacion creaHabitacionPresentacion() {
        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("¡Bienvenid@s al interciclo de 1º de Desarrollo de Aplicaciones Multiplataforma! ");
        habitacion.setDialogo(new String[] {
                "Hemos preparado una pequeña demo de un juego. En este caso es...  ",
                "Bueno, ahora lo veréis... ¡Esperamos que os guste! :) ", 
                "Como podéis comprobar, el juego carece de gráficos. Por tanto, sugerimos que leáis detenidamente.", 
                "La respuesta puede estar en el texto... ",
                "En serio...", "...", "Responde con cuidado... ", "¡Esperamos que lo disfrutéis! ",
                "Presiona Enter para continuar... "
        });

        Temp.LimpiarPantalla();

        return habitacion;
    }

    public static Habitacion creaHabIntro() {
        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("¡Introducción!");
        habitacion.setDialogo(new String[] {
                "¡Por fin acabó el primer curso!",
                "Tú y tus amigos habéis quedado para unas vacaciones en un camping. ",
                "Al llegar, dejáis vuestras pertenencias en el bungaloo asignado. ",
                "*TOC, TOC, TOC!* Llaman a la puerta...",
                "¿Se puede? - Pregunta alguien con voz masculina...",
                "Perdonad chicos, pero parece que tenemos un problema con las instalaciones.",
                "-'Parece ser quien se encarga.'-",
                "Necesitamos que dejéis las instalaciones tan solo una hora. Para entonces todo estará resuelto.",
                "Sabemos que acabáis de llegar, nos ha surgido un imprevisto. Os recompensaremos por las molestias.",
                "Estamos en terrenos de 'Lord Medac', Conde de estas tierras. Si miráis al norte al salir, veréis su castillo. ¡Es una gran atracción en el lugar!",
                "Bueno, he de seguir con la ruta de aviso, luego nos vemos. ¡Disfrutad de la exploración!",
                "Presiona Enter para continuar... "
        });

        Temp.LimpiarPantalla();

        return habitacion;
    }

    public static Habitacion creaHabTuto() {
        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("¡HabTuto!");
        habitacion.setDialogo(new String[] {
                "- ¡Bien! Tampoco tenemos nada mejor que hacer, ¡vayamos al castillo! ",
                "~ Exclama un compañero ~", "A todos os parece una buena idea, y sin dudar, partís. ",
                "Seguís las indicaciones de la persona al cargo, y, tras 9 minutos, llegáis al castillo. ",
                "Es un castillo de lo más normal, con su puente levadizo, ",
                "torretas para catapultas y varios puntos estratégicos necesarios en la época. ",
                "Está un poco en ruinas, tiene varias brechas en los muros, el río está seco y... ",
                "Tu corazón empieza a acelerarse. ",
                "Sientes una extraña sensación y te planteas dar media vuelta... ", 
                "¿Uh? Estás bien, colega? -Te preguntan. "
        });
        

        Temp.LimpiarPantalla();
        // Ejemplo de enemigo
        // Enemigo enemigoTuto = new Enemigo("Lord Medac", 100, 10, 5);
        // Puede dar fallos, pero es un ejemplo de objeto
        // Objeto llave = new Objeto("Llave", 1, null, null);

        return habitacion;
    }

    public static Habitacion creaHabitacionHab0() {
        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("¡Hab0!"); 

        habitacion.setDialogo(new String[] {
                "Con mucha confianza, y sin pensarlo dos veces, te sacudes los miedos y cruzas corriendo el puente levadizo.",
                "Será todo un descubrimiento! ~ piensas ~ ... ",
                "*Acabas de entrar en el castillo...*",
                "Escuchas levemente la voz de tu una de tus compañeras. ",
                "Te das media vuelta para saber que está pasando... ",
                "¡¡Oh, f*ck!! ",
                "Al mirar atrás, ves como el puente se ha cerrado detrás tuya... ",
                "Eh! Eh!!- Escuchas un grito detrás del puente levado - ", 
                "Avisaremos a la persona al cargo y vendremos a por ti,",
                "intenta buscar alguna salida mientras y no te metas en líos! ",
                "Presiona Enter para continuar. "
        });

        return habitacion;
    }

    public static Habitacion creaHabitacionHab1() {
        Habitacion habitacion = new Habitacion();
        habitacion.setVisitada(false);
        habitacion.setDescripcion("La entrada. ");

        if (habitacion.getVisitada()) {
            habitacion.setVisitada(true);
             habitacion.setDialogo(new String[] {
                "Te quedas en shock con la cara un tanto descompuesta...",
                "Después de unos minutos mirando a la puerta como alguien de poco IQ, decides que será divertido explorar un castillo abandonado. ",
                "Pronto llegarán. -Piensas-"
        });
        } else {
            habitacion.setDialogo(new String[] {
                "Ya has estado por aquí, no queda mucho más que hacer. ",
                "¿Estás list@ para continuar? ",
                "¡Vamos! ¡No hay tiempo que perder! "
            });
        }
       
        // Aquí agregar un menú para que el jugador pueda elegir si quiere seguir o no

        // habitacion.setPistas( "Pistas de la habitación 1");
        // System.out.print("Presiona Enter para continuar...");
        // sc.nextLine();
        Temp.LimpiarPantalla();

        return habitacion;
    }

    public static Habitacion creaHabitacionHab2() {
        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("El Pasillo. ");
        habitacion.setDialogo(new String[] {
                "Entras en el pasillo y te paras. Parece un pasillo normal, pero sabes que no lo será.",
                "Das un paso dudoso y piensas que tienes que tener más decisión si quieres llegar a la siguiente habitación.",
                "Respiras hondo y comienzas a caminar. Entornas los ojos y de repente suena un ruido de engranajes.",
                "¡Mierda! Las paredes del pasillo comienzan a acercarse lentamente y cada sonido del engranaje se clava en ti.",
                "Está bien -piensas-, no es el momento de morir en versión 2D.",
                "Sólo tienes dos opciones y tienes que salir rápido de este pasillo.",
                "Las paredes se siguen cerrando y casi puedes tocarlas con ambas manos a la vez. ",
                "Sigue hacia el norte o dirígete al este. ¡DECIDE! ¡¡VAMOS!! ",
        });
        // habitacion.setPistas( "Pistas de la habitación 2");
        // "Elige una opción: \n",
        // "1.- Hacia el norte ",
        // "2.- Hacia el oeste"

        // System.out.print("Presiona Enter para continuar...");
        // sc.nextLine();
        // Temp.LimpiarPantalla();

        return habitacion;
    }

    public static Habitacion creaHabitacionHab3() {
        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("¡La Sala Secreta! ");
        habitacion.setDialogo(new String[] { 
                "*Crack*",
                "Oh oh, creo que no estás sol@...",
                "Aparece una sombra",
                "Desde la sombra empiezas a distinguir algo",
                "Sea lo que sea, está claro que no es humano",
                "Y los más de 2 metros de altura no ayudan a mantener la calma",
                "Te das la vuelta y te diriges rápidamente hacia la puerta",
                "Vaya, parece que está bloqueada, no tienes escapatoria...",
                "En este momento, eres tú o ese ser de procedencia desconocida",
                "", // el jugador debe interactuar para derrotar al monstruo
                "No ha sido fácil... ¡pero lo lograste!",
                "Es momento de descubrir si la puerta sigue bloqueada o no..." // el jugador se dirige a la puerta y al
                                                                               // haber derrotado al monstruo la puerta
                                                                               // se ha desbloqueado y ya puede salir y
                                                                               // avanzar
        });
        // Introducir minijuego de combate
        // Temp.LimpiarPantalla();

        return habitacion;
    }

    public static Habitacion creaHabitacionHab4() {
        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("El Salón Mortífero. ");
        habitacion.setDialogo(new String[] {
                "Has llegado y necesitas coger un poco de aire, te falta el aliento",
                "El salón es pequeño, pero el techo es demasiado alto, lo que le imprime un aire de fábrica abandonada. El silencio es sepulcral",
                "En el salón sólo hay tres puertas, aunque ya sabes que una de ellas es la puerta de la Sala Principal, en medio una alfombra vieja y pegada a la pared, una mesa con cajoneras",
                "Te acercas a las otras dos puertas y ¡oh, qué casualidad!, están cerradas",
                "Te diriges a la mesa y descubres que uno de los cajones tiene un candado, un candado que sólo puede abrirse con 2 dígitos",
                "Estás exhausto, y no tienes ganas de pensar. Casi estás a punto de rendirte, cuando de repente...¿qué cóño hay dibujado en la alfombra?",
                "¿Es el mapa del instituto Medac? Joder!, eso parece! ¿Qué mierda significa esto?",
                "Te agachas y comienzas a tocar la alfombra, sigues el plano con tus dedos, mientras piensas que aquí tiene que estar la clave del candado",
                "Son dos dígitos, piensa joder, sólo tres dígitos",
                "Avanzas con el dedo sobre el mapa y descubres que una de las salas está redondeada",
                "Miras fíjamente, piensas...qué mierda significa? Te levantas para coger perspectiva sobre el mapa y de repente lo tienes",
                "Es el aula contigua a la sala de enfermería. Lo recuerdas porque una vez hiciste allí unos exámenes de trimestre",
                "Ya lo sabes, si! el número del aula tiene que ser lo que abra el candado, son dos dígitos!!",
                "Ahora debes elegir entre los dos siguientes números, sólo uno de ellos abre el candado que cierra el cajón donde estarán las llaves de las puertas",
                // El número que abre el candado es 11//la otra opción podrá ser el número 12/
                // 
        });
        System.out.println(habitacion.getDescripcion());
        // Intro minijuego de candado

        // System.out.print("Presiona Enter para continuar...",
        // sc.nextLine();
        // Temp.LimpiarPantalla();

        return habitacion;
    }

    public static Habitacion creaHabitacionHab5() {
        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("¡Hab5!");
        habitacion.setDialogo(new String[] {
                "  Falta Texto en la HAbitacion"
        });
        // habitacion.setPistas( "Pistas de la habitación 5");
        // sc.nextLine();
        // Temp.LimpiarPantalla();

        return habitacion;
    }

    public static Habitacion creaHabitacionHab6() {
        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("La BiblioMedac. ");
        habitacion.setDialogo(new String[] { 
                "Estás en la sala 6 por fin, después de una lucha a vida o muerte con el ente de la sala 3. La biblioteca tiene chimenea y el suelo y las paredes enmoquetadas. Las estanterías son kilométricas",
                "Una biblioteca parece un sitio amable para tomar un respiro. Te diriges lentamente hacia el sillón que hay, pero empiezas a notar cómo las luces empiezan a decaer",
                "Todo se está oscureciendo y puedes ver claramente cómo en una de las paredes va apareciendo un mensaje fluorescente",
                "Estás tranquil@, nada parece amenazante ahora. Te sientas y esperas a poder leer bien el mensaje",
                "Este es el mensaje que aparece en la pared: Me pinché con una rueca y cien años me dormí, hasta que un beso del príncipe hizo que volviese en mí.",
                "Sabes que ese mensaje es de una película que te recuerda a tu infancia...",
                "Tienes dos títulos en la cabeza y sabe que el correcto te llevará al libro que te dará la salida",
                // El usuario debe elegir entre dos opciones: A)La bella durmienta , B) Blanca
                // Nieves//
                "la Bella Duermiente sin duda. Corres a la estantería repleta de libros y comienzas a buscar el título",
                "¡Lo tienes!¡Aquí está! Intentas cogerlo, pero no puedes, ¡mierda! ¿qué pasa ahora?",
                "Pegas un golpe fuerte contra el libro y este se hunde..¿qué? Una estantería se abre detrás tuya, te vuelves, la estantería es la entrada a un corredizo demasiado pequeño",
        });
        // habitacion.setPistas( "Pistas de la habitación 6");
        // System.out.print("Presiona Enter para continuar...");
        // sc.nextLine();
        // Temp.LimpiarPantalla();

        return habitacion;
    }

    public static Habitacion creaHabitacionHab7() {
        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("El baño. ");
        habitacion.setDialogo(new String[] {
                "¡Bienvenid@ al baño de esta humilde morada!",
                "Como puedes observar la limpieza brilla por su ausencia...",
                "*¡Plaf!*",
                "*¡Crash!*",
                "Una de las puertas de la ducha se ha descolgado y ha acabado en el suelo hecha añicos.",
                "*¡Menudo susto!*",
                "Al girarte hacia la puerta o donde creías recordar que estaba, te percatas de que esta ha desaparecido.",
                "La ventana que está encima del WC parece que va por el mismo camino...",
                "Cuando te quieres dar cuenta también ha desaparecido",
                "*¡¿QUÉ ES ESO?!*",
                "*El WC empieza a convertirse en algo extraño...*",
                "Ten cuidado de no resbalarte o cortarte con algún trozo de cristal",
                // el jugador debe interactuar para luchar contra el monstruo
                "Al derrotar a tu oponente, este empieza a desintegrarse y convertirse en ceniza que se mezcla en el ambiente hasta hacer que reaparezcan la puerta y la ventana.",
                // QUE SALGA
        });
        // habitacion.setPistas( "Pistas de la habitación 7");

        // System.out.print("Presiona Enter para continuar...");
        // sc.nextLine();
        // Temp.LimpiarPantalla();

        return habitacion;
    }

    public static Habitacion creaHabitacionHab8() {
        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("El Dormitorio Principal. ");
        habitacion.setDialogo(new String[] { 
                "Cruzas la puerta hacia el dormitorio principal desde el baño y de repente un aura te rodea. Ese aura te hace sentir muy bien, muy fuerte y seguro y puedes ver cómo la espada se torna azul", 
                "Te adentras en el dormitorio. Está sucio, abandonado descde hace mucho, no tiene ventanas, pero sí tres puertas de madera con pomos metálicos",
                "Sientes un escalofrío y sabes que algo no está bien allí, pero la habitación parece vacía",
                "La cama está deshecha, te acercas despacio, tocas el colchón desnudo y notas que está caliente",
                "De forma instintiva agarras fuerte el mango de la espada. Te alejas despacio de la cama y las sábanas empiezan la removerse",
                "¡Mierda! ¡Qué hay ahí metido! Corres hacia la puerta por la que entraste, pero está cerrada. Corres al resto de puertas y tambienén están cerradas",
                "No sabes qué pasa, pero nunca has sentido tanto miedo antes",
                "De las sábanas surge la figura casi imperceptible de Jessi, la Jefa de Estudios, pero no es ella exactamente, miras fíjametente aterrorizad@, es Jessi con aspecto de una mujer muy muy mayor",
                "Su aspecto es decrépito, lleva un camisón rasgado y de su boca sólo sale un sonido perceptible",
                "aaaaaaaaggggggggg" + "aaaaaaaagggggggg",
                "Se te hiela la sangre. Sus ojos son amarillos y comienza a alevarse hacia el techo. Agarras con fuerza la empuñadura de tu espada, sigue azul, tú sigues rodeado de un aura azul",
                "*Jessi balbucea* - Tú debes morir..." + "y a continuación se lanza sobre ti",
                // El usuario comienza a luchar

        });

        // Intro minijuego 

        // System.out.print("Presiona Enter para continuar...");
        // sc.nextLine();
        // Temp.LimpiarPantalla();

        return habitacion;
    }

    public static Habitacion creaHabitacionHab9() {
        Habitacion habitacion = new Habitacion();
        habitacion.setDescripcion("¡Hab9!");
        habitacion.setDialogo(new String[] {
                "Has llegado a la última habitación, ¿preparad@?",
                "Te das la vuelta y notas el frío en la cara, en las manos. Descubres que has salido del castillo y ahora estás en el jardín.",
                "Al salir al exterior, el castillo desaparece y detrás tuya se forma un muro de arbustos dejándote encerrad@. No tienes más opciones que explorar el jardín.",
                "La salida al exterior y tu supervivencia dependen de que consigas encontrar la pista y el desafío final.",
                "El jardín parece ser rectangular. A unos metros hay una mesa con una sombrilla en el medio y cuatro sillas alrededor un tanto estropeadas.",
                "Hay numerosos arbustos distribuidos por el jardín junto con cetros, encinas, alcornoques... El jardín está bastante descuidado.",
                "Es hora de empezar a explorar.",
                "Recuerda elegir bien cada decisión que tomes y atent@ a lo que te puedas encontrar.",
                // que el jugador interactúe para decidir que hacer
                "Debajo de la mesa, entre el césped hay una nota:",
                // esto será cuando le de a buscar pistas
                "*¿Cuál es la función principal de una VARIABLE en programación?*",
                // esto será cuando le de a buscar pistas
                /*
                 * "Elige tu respuesta:");
                 * //"1. Almacenar información \r\n" +
                 * "2. Ejecutar funciones matemáticas \r\n" +
                 * "3. Imprimir resultados en pantalla \r\n" +
                 * "4. Reparar errores en el código"); // LA VERDADERA ES LA 1
                 * esto será cuando le de a buscar pistas  / SI ACIERTA LA PREGUNTA, FINALIZA 
                 * L extras.*
                 */
                "Oh oh... Desearás haber acertado...",
                // esto es lo que aparece cuando fallan la pregunta, aparece el monstruo
                "Empiezas a escuchar un ruido un tanto alejado a tus espaldas...",
                "¡Grrrrr...!",
                "Al darte la vuelta entre una neblina (que antes no estaba) se empieza a perfilar ni más ni menos... ¡QUE UN MEDACGORGON!",
                "Su presencia induce un escalofrío en el más valiente. La piel, rugosa y pálida, parece absorber la luz, dejando solo sus ojos brillantes y malévolos visibles. Colmillos afilados asoman de su boca entreabierta, y sus garras arañan el aire con cada movimiento",
                "¡VA DIRECTO HACIA TÍ?!",
                // tiene que luchar
        });
        // habitacion.setPistas"Pistas);
        // System.out.print("Presiona Enter para continuar...");
        // sc.nextLine();
        // Temp.LimpiarPantalla();

        return habitacion;
    }

}