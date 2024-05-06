package juego;
import habitaciones.*;


public class Main {

	public static void main(String[] args) {
		Habitacion habIntro = FabricaHabitaciones.creaHabitacionHab0();
		habIntro.mostrarPistas();
	}

}
