package juego;
import java.util.*;

public class Inventario {
    private ArrayList<Objeto> objetos;

    public Inventario(){
        this.objetos = new ArrayList<>();
    }

    public ArrayList<Objeto> getObjetos(){
        return this.objetos;
    }

    public void setObjetos (ArrayList<Objeto> newObjetos){
        this.objetos = newObjetos;
    }
    
    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }

    public void eliminarObjeto(Objeto objeto) {
        objetos.remove(objeto);
    }
    public void mostrarInventario() {
        System.out.println("Inventario: ");
        if (!objetos.isEmpty()) {
            for (Objeto objeto : objetos) {
                System.out.println("- " + objeto.getNombre() + ": Durabilidad " + objeto.getDurabilidad());
            }
        } else {
            System.out.println("El inventario está vacío. ");
        }
    }
}