package juego;
import java.util.Scanner;

import extras.Temp;
import personajes.*;

public class Combate {

    private Jugador jugador;
    private Enemigo enemigo;
    private Scanner sc = new Scanner(System.in);

    public Combate(Jugador jugador, Enemigo enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador newJugador) {
        this.jugador = newJugador;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Enemigo newEnemigo) {
        this.enemigo = newEnemigo;
    }

    public void iniciarCombate() {
        System.out.println("Combate iniciado");
        
        while (jugador.getVida() > 0 && enemigo.getVida() > 0) {
            turnoJugador();
            if (enemigo.getVida() <= 0) {
                System.out.println("Has derrotado a " + enemigo.getNombre());
                break;
            }
            turnoEnemigo();
            if (jugador.getVida() <= 0) {
                System.out.println("Has sido derrotado por " + enemigo.getNombre());
                break;
            }
        }
    }

    private void turnoJugador() {
        System.out.println("Tu turno");
        System.out.println("Vida del enemigo: " + enemigo.getVida());
        System.out.println("Vida del jugador: " + jugador.getVida());
        System.out.println("1. Atacar");
        System.out.println("2. Curar");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                int dmgJugador = calcularDmg(jugador.getAtaque(), enemigo.getDefensa());
                System.out.println("Haces " + dmgJugador + " de daño a " + enemigo.getNombre());
                Temp.Temporizador(2000);
                enemigo.setVida(enemigo.getVida() - dmgJugador);  
                break;
            case 2:
                // Curar
                //Debe de posser una poción en el inventario
                jugador.setVida(jugador.getVida() + 10);
                Temp.Temporizador(2000);
                System.out.println("Te curas 10 puntos de vida");
                break;
            default:
                break;
        }

        
    }

    private int calcularDmg(int ataque, int defensa) {
        return Math.max(ataque - defensa, 0);
    }

    private void turnoEnemigo(){
        System.out.println("Turno del enemigo");
        int dmgEnemigo = calcularDmg(enemigo.getAtaque(), jugador.getDefensa());
        System.out.println(enemigo.getNombre() + " te hace " + dmgEnemigo + " de daño");
        jugador.setVida(jugador.getVida() - dmgEnemigo);
    }
   
}
