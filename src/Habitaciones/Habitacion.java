package habitaciones;
import java.util.ArrayList;

import juego.*;
import personajes.*;

public class Habitacion {

    private String descripcion;
    private String[] dialogo;
    private String[] pistas;
    private Objeto objetos;
    private Enemigo enemigo;
    // Constructor
    public Habitacion(String descripcion, String[] dialogo, String[] pistas, Objeto objetos, Enemigo enemigo) {
        this.descripcion = descripcion;
        this.dialogo = dialogo;
        this.pistas = pistas;
        this.objetos = objetos;
        this.enemigo = enemigo;
    }

    // Getters y setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String newDescripcion) {
        this.descripcion = newDescripcion;
    }

    public String[] getDialogo() {
        return dialogo;
    }

    public void setDialogo(String[] newDialogo) {
        this.dialogo = newDialogo;
    }

    public String[] getPistas() {
        return pistas;
    }

    public void setPistas(String[] newPistas) {
        this.pistas = newPistas;
    }

    public Objeto getObjetos() {
        return objetos;
   }

    public void setObjetos(Objeto newObjetos) {
        this.objetos = newObjetos;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    public void mostrarPistas() {
        System.out.println("Pistas:");
        for (String pista : pistas) {
            System.out.println(" " + pista);
        }
    }
}
