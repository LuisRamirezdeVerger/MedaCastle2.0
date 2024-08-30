package juego;
//import java.util.Arrays;

import java.util.Scanner;

import extras.*;
import habitaciones.*;
//import personajes.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	private static void espera() {
		sc.nextLine();
		Temp.LimpiarPantalla();
	}

	public static void main(String[] args) {

		// Llamada a la habitacion de presentacion para poder interactuar con ella
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
		System.out.println("¿Quieres ir al castillo? ¿Si o no?");
		while (!respuesta.toLowerCase().equals("si")) {
			
			respuesta = sc.nextLine();
			if (respuesta.toLowerCase().equals("si")) {
				System.out.println("Muy bien, vamos a empezar");
				// Siguiente paso
			} else {
				// Debe preguntar si quiere volver a intentarlo
				System.out.println("- ¿Cómo? No te he oído bien, ¿Quieres ir al castillo?");
			}
		}

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