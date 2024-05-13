package juego;
import habitaciones.*;


public class Main {

	public static void main(String[] args) {
		
		Habitacion tutorial = FabricaHabitaciones.creaHabTuto();

		//tutorial.getDialogo(asdas);

		System.out.println(tutorial.getPistas());
		
		//tutorial.getPistas(asd);
	}

}