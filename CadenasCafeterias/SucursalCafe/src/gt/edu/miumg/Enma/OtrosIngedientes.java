package gt.edu.miumg.Enma;

public class OtrosIngedientes implements Ingrediente{
    private final String nombre;
    private final double cantidad;

    public OtrosIngedientes(String nombre, double cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre(){
        return  nombre;
    }

    @Override
    public double obtenerCantidad(){
        return  cantidad;
    }
}
