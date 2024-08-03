package gt.edu.miumg.Enma;

public class EspressoItaliano extends  Cafe{

    public  EspressoItaliano(String nombre, String tamano, double precio, int intensidad){
        super(nombre, tamano, precio);
    }
    @Override
    public  void preparar(){
        System.out.println("Preparando espreso italiano.");

    }

    @Override
    public void  servir(){
        System.out.println("Sirviendo espreso italiano.");

    }
}
