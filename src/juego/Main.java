package juego;
import habitaciones.*;
import personajes.*;


public class Main {

	public static void main(String[] args) {
		
		Habitacion tutorial = FabricaHabitaciones.creaHabTuto();

		//tutorial.getDialogo(asdas);

		System.out.println(tutorial.getPistas());
		
		//tutorial.getPistas(asd);

		
			Jugador jugador = new Jugador("Jugador", 100, 10, 5);
			Enemigo enemigo = new Enemigo("Lord medac", 50, 10, 2);
			Combate combate = new Combate(jugador, enemigo);
			combate.iniciarCombate();	
		
	}

}