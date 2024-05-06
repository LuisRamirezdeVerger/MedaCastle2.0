package juego;
import java.util.List;

public class HabitacionES {
    private String nombre;
    private String descripcion;
    private Inventario inventario;
    private static HabitacionES habitacionNorte;
    private static HabitacionES habitacionSur;
    private static HabitacionES habitacionEste;
    private static HabitacionES habitacionOeste;

    public HabitacionES (String nombre, String descripcion, Inventario inventario){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.inventario = inventario;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String nuevoDescripcion){
        this.descripcion = nuevoDescripcion;
    }

    public Inventario getInventario(){
        return this.inventario;
    }

    public void setInventario(Inventario nuevoInventario){
        this.inventario = nuevoInventario;
    }

    public void setHabitacionNorte(HabitacionES nuevoHabitacionNorte){
        HabitacionES.habitacionNorte = nuevoHabitacionNorte;
    }

    public void setHabitacionSur(HabitacionES nuevoHabitacionSur){
        HabitacionES.habitacionSur = nuevoHabitacionSur;
    }

    public void setHabitacionEste(HabitacionES nuevoHabitacionEste){
        HabitacionES.habitacionEste = nuevoHabitacionEste;
    }

    public void setHabitacionOeste(HabitacionES nuevoHabitacionOeste){
        HabitacionES.habitacionOeste = nuevoHabitacionOeste;
    }

    public static HabitacionES getHabitacionNorte(){
        return habitacionNorte;
    }

    public static HabitacionES getHabitacionSur(){
        return habitacionSur;
    }

    public static HabitacionES getHabitacionEste(){
        return habitacionEste;
    }

    public static HabitacionES getHabitacionOeste(){
        return habitacionOeste;
    }


    //Esto mostrará la info de la hab, podemos usarla para programar y ver resultados
    //Se está usando en el modo extra -> ¿Dónde estoy?
    public void mostrarInfoHabitacion(){
        System.out.println("Habitación " + getNombre());

        Inventario inventarioHabitacion = getInventario();
        List<Objeto> objetosHabitacion = inventarioHabitacion.getObjetos();

        if (!objetosHabitacion.isEmpty()) {
            System.out.println("Objetos que puedes recoger: ");

            for(Objeto objeto : objetosHabitacion){
                System.out.println("- " + objeto.getNombre());
            }
        } else {
            System.out.println("No hay nada que puedas recoger :( ");
        }

    }


    @Override
    public String toString(){
        return "Habitacion{" +
        "nombre='" + nombre + '\'' +
        ", objeto=" + inventario +
        '}';
    }
}
