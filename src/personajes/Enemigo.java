package personajes;

public class Enemigo {

    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;


    public Enemigo(String nombre, int vida, int ataque, int defensa){
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public int getVida(){
        return this.vida;
    }  

    public void setVida(int newVida){
        this.vida = newVida;
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
