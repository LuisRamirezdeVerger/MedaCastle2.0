package personajes;

public class Jugador {

    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    //Podrían agregarse más atributos como velocidad, nivel, etc.
    //private int velocidad;
    //private int nivel;

    public Jugador(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
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
}
