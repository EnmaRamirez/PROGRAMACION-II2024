package gt.edu.miumg.Enma;

public class Leche implements  Ingrediente{
    private final String tipo;
    private final double cantidad;

    public  Leche(String tipo, double cantidad){
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public  String obtenerNombre(){
        return tipo;
    }

    @Override
    public  double obtenerCantidad(){
        return cantidad;
    }

}
