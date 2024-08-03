package gt.edu.miumg.Enma;

public class Granos implements Ingrediente {
    private final String tipo;
    private final double cantidad;

    public  Granos(String tipo, double cantidad){
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public  String obtenerNombre(){
        System.out.println("Ingrese el nombre del grano");
        return "nombre";
    }

    @Override
    public  double obtenerCantidad(){
        System.out.println("Ingrese el cantidad del grano");
        return 0;
    }

}
