package juego;
//import java.util.Arrays;

import java.util.Scanner;

import extras.*;
import habitaciones.*;
//import personajes.*;
import personajes.Jugador;

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
		while (!respuesta.toLowerCase().equals("si")) {
			System.out.println("- ¿Cómo? No te he oído bien, ¿Quieres ir al castillo?");
			respuesta = sc.nextLine();
		}

		espera();

		for (String linea : hab0.getDialogo()) {
			System.out.println(linea);
			Temp.Temporizador(0000);
		}

		espera();

		for (String linea : hab1.getDialogo()) {
			System.out.println(linea);
			Temp.Temporizador(2000);
		}

		System.out.println("¿Qué quieres hacer?");
		Jugador.menu();
		String opcion = sc.nextLine();
		if (opcion.equals("1")) {
			Jugador.moverse();
		} else if (opcion.equals("2")) {
			System.out.println("Inventario");
		} else {
			System.out.println("No has hecho nada");

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