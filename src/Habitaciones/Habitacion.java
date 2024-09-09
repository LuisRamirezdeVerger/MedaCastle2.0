package habitaciones;

import juego.*;
import personajes.*;

public class Habitacion {

    private String descripcion;
    private String[] dialogo;
    private String pistas;
    private Objeto objetos;
    private Enemigo enemigo;
    //Creamos las posibles direcciones a las que se puede mover el jugador
    private Habitacion norte;
    private Habitacion sur;
    private Habitacion este;
    private Habitacion oeste;
    //Creamos el parámetro para saber si la habitación ha sido visitada
    private boolean visitada;

     
    // Constructor
    public Habitacion() {

    }

    // Getters y setters
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String newDescripcion) {
        descripcion = newDescripcion;
    }

    public String[] getDialogo() {
        return this.dialogo;
    }

    public void setDialogo(String[] newDialogo) {
        this.dialogo = newDialogo;
    }

    public String getPistas() {
        return this.pistas;
    }

    public void setPistas(String newPistas) {
        this.pistas = newPistas;
    }

    public Objeto getObjetos() {
        return this.objetos;
   }

    public void setObjetos(Objeto newObjetos) {
        this.objetos = newObjetos;
    }

    public Enemigo getEnemigo() {
        return this.enemigo;
    }

    public void setEnemigo(Enemigo newEnemigo) {
        this.enemigo = newEnemigo;
    }

    public Habitacion getNorte() {
        return this.norte;
    }  

    public void setNorte(Habitacion newNorte) {
        this.norte = newNorte;
    }

    public Habitacion getSur(){
        return this.sur;
    }

    public void setSur(Habitacion newSur){
        this.sur = newSur;
    }

    public Habitacion getEste(){
        return this.este;
    }

    public void setEste (Habitacion newEste){
        this.este = newEste;
    }

    public Habitacion getOeste(){
        return this.oeste;
    }

    public void setOeste(Habitacion newOeste){
        this.oeste = newOeste;
    }

    public boolean getVisitada(){
        return visitada;
    }

    public void setVisitada(boolean newVisitada){
        this.visitada = newVisitada;
    }

    /* 
    public void mostrarPistas() {
        System.out.println("Pistas:");
        for (String pista : pistas) {
            System.out.println(" " + pista);
        }
    }
    */
}
