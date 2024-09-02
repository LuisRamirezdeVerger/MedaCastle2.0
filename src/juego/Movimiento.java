package juego;

import personajes.*;
//import extras.*;

public class Movimiento {

    public static void moverJugador(Jugador jugador, String direccion) {
        switch (direccion) {
            case "norte":
                jugador.getPosicion().setY(jugador.getPosicion().getY() - 1);
                break;
            case "sur":
                jugador.getPosicion().setY(jugador.getPosicion().getY() + 1);
                break;
            case "este":
                jugador.getPosicion().setX(jugador.getPosicion().getX() + 1);
                break;
            case "oeste":
                jugador.getPosicion().setX(jugador.getPosicion().getX() - 1);
                break;
            default:
                System.out.println("Dirección no válida");
                break;
        }
    }
    
}
