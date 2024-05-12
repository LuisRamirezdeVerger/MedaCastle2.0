package juego;
import habitaciones.*;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hola Mundo!");
		habitaciones.Habitacion tutorial = FabricaHabitaciones.creaHabTuto();
		tutorial.getDescripcion();
		String[] dialogo = tutorial.getDialogo();
		for (int i = 0; i < dialogo.length; i++) {
			System.out.println(dialogo[i]);
		}
		

	}

}