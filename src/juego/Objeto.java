package juego;

public class Objeto {
    private String nombre;
    private int durabilidad;

    public Objeto(String nombre, int durabilidad) {
        this.nombre = nombre;
        this.durabilidad = durabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int newDurabilidad) {
        this.durabilidad = newDurabilidad;
    }
}
