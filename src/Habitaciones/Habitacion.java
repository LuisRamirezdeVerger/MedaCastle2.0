package habitaciones;

public class Habitacion {

    private String descripcion;
    private String[] dialogo;
    private String[] pistas;
    //Por implementar
    //private Inventario[] inventario;
    //private Enemigo enemigo;
     // Constructor (a;adir , Objeto[] objetos, Enemigo enemigo)
    public Habitacion(String descripcion, String[] dialogo, String[] pistas) {
        this.descripcion = descripcion;
        this.dialogo = dialogo;
        this.pistas = pistas;
   //     this.objetos = objetos;
   //     this.enemigo = enemigo;
    }

    // Getters y setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getDialogo() {
        return dialogo;
    }

    public void setDialogo(String[] dialogo) {
        this.dialogo = dialogo;
    }

    public String[] getPistas() {
        return pistas;
    }

    public void setPistas(String[] pistas) {
        this.pistas = pistas;
    }

   // public Objeto[] getObjetos() {
  //      return objetos;
   // }

   // public void setObjetos(Objeto[] objetos) {
   //     this.objetos = objetos;
   // }

   // public Enemigo getEnemigo() {
    //    return enemigo;
    //}

    //public void setEnemigo(Enemigo enemigo) {
   //     this.enemigo = enemigo;
    //}
}
