package personajes;

import java.util.*;
import extras.*;

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
        Jugador.posicion = new Posicion(0, 0);
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

    public static void menuCombateActivado(){
        System.out.println("1.- Moverme ");
        System.out.println("2.- Ver inventario ");
        System.out.println("3.- Buscar pistas ");
        System.out.println("4.- Atacar ");
        System.out.println("5.- Salir ");
    }

    public static void moverse() {
        //Cambiar luego, solo para pruebas
        System.out.println(posicion);
        //Cambiar luego, solo para pruebas
        System.out.println("¿A dónde quieres moverte?");
        String direccion = sc.nextLine();
        switch (direccion.toLowerCase()) {
            case "norte":
                posicion.setY(posicion.getY() - 1);
                System.out.println(posicion);
                break;
            case "sur":
                posicion.setY(posicion.getY() + 1);
                break;
            case "este":
                posicion.setX(posicion.getX() + 1);
                break;
            case "oeste":
                posicion.setX(posicion.getX() - 1);
                break;
            default:
                System.out.println("Dirección no válida");
                break;
        }
        //Cambiar luego, solo para pruebas
        System.out.println(posicion);
        //Cambiar luego, solo para pruebas
    }
}
