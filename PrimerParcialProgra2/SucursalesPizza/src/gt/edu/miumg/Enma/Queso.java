package gt.edu.miumg.Enma;

public class Queso implements Ingrediente{
    private String tipo;
    private int cantidad;

    public Queso(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
}
