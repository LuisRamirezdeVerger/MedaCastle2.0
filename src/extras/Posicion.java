package extras;

import java.util.Objects;

public class Posicion {
    private int x, y;

    public Posicion (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public void setX(int newX){
        this.x = newX;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int newY){
        this.y = newY;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
        return true;
        if(obj == null || getClass() != obj.getClass())
        return false;
        Posicion posicion = (Posicion) obj;
        return x == posicion.x && y == posicion.y;
    }

    @Override
    public int hashCode(){
        return Objects.hash(x, y);
    }
}
