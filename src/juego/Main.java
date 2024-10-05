package juego;
//import java.util.Arrays;

import java.util.Scanner;

import extras.*;
import habitaciones.*;
import personajes.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	private static void espera() {
		sc.nextLine();
		Temp.LimpiarPantalla();
	}

	public static void main(String[] args) {
		boolean game = true;

		//Inicializamos las habitaciones
		FabricaHabitaciones.inicializarHabitaciones();

		// Crear jugador
        Jugador jugador = new Jugador("Jugador", 100, 10, 5, new Posicion(2, 0));

		//Habitacion actual
		@SuppressWarnings("unused")
		Habitacion habActual = FabricaHabitaciones.getHabitacion(jugador.getPosicion());


		// Llamada a la habitaciones para poder interactuar con ellas
		Habitacion presentacion = FabricaHabitaciones.creaHabitacionPresentacion();
		Habitacion intro = FabricaHabitaciones.creaHabIntro();
		Habitacion tutorial = FabricaHabitaciones.creaHabTuto();
		Habitacion hab0 = FabricaHabitaciones.creaHabitacionHab0();
		Habitacion hab1 = FabricaHabitaciones.creaHabitacionHab1();
		Habitacion hab2 = FabricaHabitaciones.creaHabitacionHab2();
		Habitacion hab3 = FabricaHabitaciones.creaHabitacionHab3();
		Habitacion hab4 = FabricaHabitaciones.creaHabitacionHab4();
		Habitacion hab5 = FabricaHabitaciones.creaHabitacionHab5();
		Habitacion hab6 = FabricaHabitaciones.creaHabitacionHab6();
		Habitacion hab7 = FabricaHabitaciones.creaHabitacionHab7();
		Habitacion hab8 = FabricaHabitaciones.creaHabitacionHab8();
		Habitacion hab9 = FabricaHabitaciones.creaHabitacionHab9();

		//Direccionamiento de las habitaciones
		//Habitacion 1
		hab1.setNorte(hab4);
		hab1.setEste(hab2);
		
		//Habitacion 2
		hab2.setNorte(hab5);
		hab2.setOeste(hab1);

		//Habitacion 3
		hab3.setNorte(hab6);

		//Habitacion 4
		hab4.setNorte(hab7);
		hab4.setSur(hab1);
		hab4.setEste(hab5);
		
		//Habitacion 5
		hab5.setNorte(hab8);
		hab5.setSur(hab2);
		hab5.setEste(hab6);
		hab5.setOeste(hab4);

		//Habitacion 6
		hab6.setSur(hab3);
		hab6.setOeste(hab5);

		//Habitacion 7
		hab7.setSur(hab4);
		hab7.setEste(hab8);

		//Habitacion 8
		hab8.setSur(hab5);
		hab8.setEste(hab9);
		hab8.setOeste(hab7);

		//Habitacion 9
		hab9.setOeste(hab8);

		
		//Agregamos las habitaciones al mapa
		//Las cuatro primeras habitaciones no necesitan posición
		FabricaHabitaciones.agregarHab(null, presentacion);
		FabricaHabitaciones.agregarHab(null, intro);
		FabricaHabitaciones.agregarHab(null, tutorial);
		FabricaHabitaciones.agregarHab(null, hab0);
		FabricaHabitaciones.agregarHab(new Posicion(2, 0), hab1);
		FabricaHabitaciones.agregarHab(new Posicion(2, 1), hab2);
		FabricaHabitaciones.agregarHab(new Posicion(2, 2), hab3);
		FabricaHabitaciones.agregarHab(new Posicion(1, 0), hab4);
		FabricaHabitaciones.agregarHab(new Posicion(1, 1), hab5);
		FabricaHabitaciones.agregarHab(new Posicion(1, 2), hab6);
		FabricaHabitaciones.agregarHab(new Posicion(0, 0), hab7);
		FabricaHabitaciones.agregarHab(new Posicion(0, 1), hab8);
		FabricaHabitaciones.agregarHab(new Posicion(0, 2), hab9);


		// Muestra el array de dialogo de la habitacion en 1 sola linea
		// System.out.println(Arrays.toString(FabricaHabitaciones.creaHabitacionPresentacion().getDialogo()));

		// Muestra el array de dialogo de la habitacion en varias lineas
		// De esta forma es más facil de leer
		
		System.out.println(presentacion.getDescripcion());

		for (String linea : presentacion.getDialogo()) {
			System.out.println(linea);
			Temp.Temporizador(0000);
		}

		espera();

		for (String linea : intro.getDialogo()) {
			System.out.println(linea);
			Temp.Temporizador(0000);
		}

		espera();

		for (String linea : tutorial.getDialogo()) {
			System.out.println(linea);
			Temp.Temporizador(0000);
		}

		String respuesta = sc.nextLine();
		while (!respuesta.toLowerCase().equals("si")) {
			System.out.println("- ¿Cómo? No te he oído bien, ¿Quieres ir al castillo? ");
			respuesta = sc.nextLine();
		} if (respuesta.toLowerCase().equals("si")) {
			System.out.println("¡Perfecto! ¡Vamos allá! ");
			System.out.println("Pulsa enter para continuar. ");
		} 

		espera();

		for (String linea : hab0.getDialogo()) {
			System.out.println(linea);
			Temp.Temporizador(0000);
		}

		espera();

		for (String linea : hab1.getDialogo()) {
			System.out.println(linea);
			Temp.Temporizador(0000);
		}
	

		do {
			Jugador.menu();
			String opcion = sc.nextLine();
			if (opcion.equals("1")) {
				Jugador.moverse();
			} else if (opcion.equals("2")) {
				System.out.println("Inventario vacío. ");
				Jugador.menu();
			} else if (opcion.equals("3")) {
				System.out.println("Pistas. ");
				Jugador.menu();
			} else if (opcion.equals("4")) {
				game = false;
			} else {
				System.out.println("No has hecho nada. ");
				Jugador.menu();
			}
		} while (game == true);
		System.out.println("¡Gracias por probar el juego! Espero que te haya entretenido, aunque sea el descargarlo. ");
		System.out.println("¡Hasta el siguiente proyecto! ");
		System.out.println("Code is life. ");
		System.out.println("Creado por @Wito_015 con mucho amor. ");

		//Jugador.menu();
		//opcion = sc.nextLine();
		//if (opcion.equals("1")) {
		//	Jugador.moverse();
		//} else if (opcion.equals("2")) {
		//	System.out.println("Inventario vacío. ");
		//} else {
		//	System.out.println("No has hecho nada. ");
		//	Jugador.menu();
		//}

		/*
		 * --- Terreno de pruebas ---
		 * 
		 * //Ambas cumplen la misma función, pero la segunda es más legible
		 * System.out.println(FabricaHabitaciones.creaHabitacionPresentacion().getPistas
		 * ());
		 * System.out.println(tutorial.getPistas());
		 * 
		 * //tutorial.getPistas(asd);
		 * //Prueba de combate con un objeto
		 * Objeto espada = new Objeto("Espada", 100, 10, null);
		 * //Es posible que haya que cambiar la forma en que recibe el daño incremental 
		 * el objeto
		 * Jugador jugador = new Jugador("Jugador", 100, (10 + Objeto.getDmgValor()),
		 * 5);
		 * Enemigo enemigo = new Enemigo("Lord medac", 50, 10, 2);
		 * Combate combate = new Combate(jugador, enemigo);
		 * combate.iniciarCombate();
		 * 
		 */
	}

}