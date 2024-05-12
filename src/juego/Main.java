package juego;
import habitaciones.*;


public class Main {

	public static void main(String[] args) {

		Habitacion tutorial = FabricaHabitaciones.creaHabTuto();
		
		System.out.println(tutorial.getDescripcion());
		System.out.println(tutorial.getDialogo());
		

	}

}