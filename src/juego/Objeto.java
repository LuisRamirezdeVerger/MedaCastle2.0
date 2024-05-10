package juego;

public class Objeto {
    private String nombre;
    private int durabilidad;
    private Integer dmgValor; // Integer para poder ser null
    private Integer healValor;


    //Libro como objeto que den estadisticas

    public Objeto(String nombre, int durabilidad, Integer dmgValor, Integer healValor) {
        this.nombre = nombre;
        this.durabilidad = durabilidad;
        this.dmgValor = dmgValor;
        this.healValor = healValor;
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

    public Integer getDmgValor() {
        return dmgValor;
    }

    public void setDmgValor(Integer newDmgValor) {
        this.dmgValor = newDmgValor;
    }

    public Integer getHealValor() {
        return healValor;
    }

    public void setHealValor(Integer newHealValor) {
        this.healValor = newHealValor;
    }
}
