package gt.edu.miumg.Enma;

abstract class Cafe {
    protected String nombre;
    protected String tamano;
    protected double precio;

    public Cafe(String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }
    public  abstract  void  preparar();

    public abstract void servir();

}
