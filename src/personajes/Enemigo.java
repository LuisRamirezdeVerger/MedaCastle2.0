package personajes;

public class Enemigo {

    private String nombre;
    private int salud;
    private int ataque;
    private int defensa;


    public Enemigo(String nombre, int salud, int ataque, int defensa){
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public int getSalud(){
        return this.salud;
    }  

    public void setSalud(int newSalud){
        this.salud = newSalud;
    }

    public int getAtaque(){
        return this.ataque;
    }   

    public void setAtaque(int newAtaque){
        this.ataque = newAtaque;
    }

    public int getDefensa(){
        return this.defensa;
    }

    public void setDefensa(int newDefensa){
        this.defensa = newDefensa;
    }
}
