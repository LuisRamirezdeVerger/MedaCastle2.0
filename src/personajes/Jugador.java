package personajes;

import java.util.*;
import extras.*;
import habitaciones.*;

public class Jugador {

    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private static Posicion posicion;
    private static Scanner sc = new Scanner(System.in);

    public Jugador(String nombre, int vida, int ataque, int defensa, Posicion posicion) {
        this.nombre = nombre;
        this.vida = 10;
        this.ataque = 2;
        this.defensa = 0;
        Jugador.posicion = new Posicion(2, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int newVida) {
        this.vida = newVida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int newAtaque) {
        this.ataque = newAtaque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int newDefensa) {
        this.defensa = newDefensa;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        Jugador.posicion = posicion;
    }

    public void totalDmg() {
        // MÃƒÂ©todo para calcular el daÃƒÂ±o total

    }

    public static void menu() {
        System.out.println("1.- Moverme ");
        System.out.println("2.- Ver inventario ");
        System.out.println("3.- Buscar pistas ");
        System.out.println("4.- Salir ");
    }

    public static void menuCombateActivado() {
        System.out.println("1.- Moverme ");
        System.out.println("2.- Ver inventario ");
        System.out.println("3.- Buscar pistas ");
        System.out.println("4.- Atacar ");
        System.out.println("5.- Salir ");
    }

    public static void moverse() {
        System.out.println("¿A dónde quieres moverte?");
        String direccion = sc.nextLine();
        Habitacion habitacionActual = FabricaHabitaciones.getHabitacion(posicion);
        Habitacion habitacionNueva = null;

        if (habitacionActual == null) {
            System.out.println("No se ha encontrado la habitación actual");
            moverse();

        }

        switch (direccion.toLowerCase()) {
            case "norte":
                habitacionNueva = habitacionActual.getNorte();
                break;
            case "sur":
                habitacionNueva = habitacionActual.getSur();
                break;
            case "este":
                habitacionNueva = habitacionActual.getEste();
                break;
            case "oeste":
                habitacionNueva = habitacionActual.getOeste();
                break;
            default:
                System.out.println("Dirección no válida");
                Jugador.moverse();
                return;
        }

        if (habitacionNueva != null) {
            switch (direccion.toLowerCase()) {
                case "norte":
                    posicion.setX(posicion.getX() - 1);
                    System.out.println(posicion);
                    break;
                case "sur":
                    posicion.setX(posicion.getX() + 1);
                    break;
                case "este":
                    posicion.setY(posicion.getY() + 1);
                    break;
                case "oeste":
                    posicion.setY(posicion.getY() - 1);
                    break;
                default:
                    System.out.println("Dirección no válida");
                    Jugador.moverse();
            }
            System.out.println("Te has movido a la habitación " + habitacionNueva.getDescripcion());
            for (String linea : habitacionNueva.getDialogo()) {
                System.out.println(linea);
                Temp.Temporizador(0000);
            } 
        } else {
            System.out.println("No puedes moverte en esa dirección");
        }
        // Cambiar luego, solo para pruebas
        System.out.println(posicion);
        // Cambiar luego, solo para pruebas
    }
}
