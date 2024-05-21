package juego;
import habitaciones.*;
import personajes.*;


public class Main {

	public static void main(String[] args) {
		
		Habitacion tutorial = FabricaHabitaciones.creaHabTuto();

		//tutorial.getDialogo(asdas);

		System.out.println(tutorial.getPistas());
		
		//tutorial.getPistas(asd);
			//Prueba de combate con un objeto 
			Objeto espada = new Objeto("Espada", 100, 10, null);
			//Es posible que haya que cambiar la forma en que recibe el daño incremental del objeto
			Jugador jugador = new Jugador("Jugador", 100, (10 + Objeto.getDmgValor()), 5);
			Enemigo enemigo = new Enemigo("Lord medac", 50, 10, 2);
			Combate combate = new Combate(jugador, enemigo);
			combate.iniciarCombate();	
		
	}

}