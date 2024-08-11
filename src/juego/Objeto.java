package juego;

public class Objeto {
    private String nombre;
    private int durabilidad;
    private static Integer dmgValor; // Integer para poder ser null
    private Integer healValor;
    private Inventario inventario;


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

    public static Integer getDmgValor() {
        return dmgValor;
    }

    public static void setDmgValor(Integer newDmgValor) {
        Objeto.dmgValor = newDmgValor;
    }

    public Integer getHealValor() {
        return healValor;
    }

    public void setHealValor(Integer newHealValor) {
        this.healValor = newHealValor;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario newInventario) {
        this.inventario = newInventario;
    }

    // Método para usar el objeto
    //hay que probarlo
    public void reducirDurabilidad() {
        if (this.durabilidad > 0) {
            this.durabilidad--;
        } else {
            Inventario inventario = this.getInventario();
            System.out.println("El objeto " + this.nombre + " se ha roto, no podrás usarlo más.");
            inventario.eliminarObjeto(this);
        }
    }

    //Método para controlar el uso del objeto
    public void conseguirObjeto() {
        Inventario inventario = this.getInventario();
        inventario.agregarObjeto(this);
    }

    
}
