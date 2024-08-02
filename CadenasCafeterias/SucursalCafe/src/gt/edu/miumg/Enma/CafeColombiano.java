package gt.edu.miumg.Enma;

public class CafeColombiano extends  Cafe {

    public CafeColombiano(String nombre, String tamano, double precio, String tipoGrano) {
        super(nombre, tamano, precio);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Cafe Colombiano.");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo Cafe Colombiano.");
    }

}
