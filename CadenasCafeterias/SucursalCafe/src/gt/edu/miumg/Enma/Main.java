package gt.edu.miumg.Enma;

public class Main {
    public static  void main(String[] args){
        //Creamos ingredientes
        Ingrediente granosColombianos = new Granos("Colombiano", 250);
        Ingrediente agua = new Agua(300);
        Ingrediente leche = new Leche("Leche", 100);

        //Creamos cafes
        Cafe cafeColombiano = new CafeColombiano("Cafe colombiano", "Medio", 5.0, "Arabica" );
        Cafe espressoItaliano = new EspressoItaliano("Espresso Italiano", "Pequeño", 2.5, 2);

        Equipo maquinaCafe = new Equipo("Maquina de cafe", "Operativo");

        //Crear empleados
        Empleado barista = new Empleado("Ana", "Barista", 2000);

        //crear sucursales
        Sucursal sucursalBogota= new Sucursal("Sucursal Bogota", "calle 100");
        Sucursal sucursalRoma = new Sucursal("Sucursal Roma", "Via Roma 10");

        // Agregar elementos a sucursal Bogota
        sucursalBogota.agregarEmpleado(barista);
        sucursalBogota.agregarIngrediente(granosColombianos);
        sucursalBogota.agregarEquipo(maquinaCafe);
        sucursalBogota.agregarEspecialidad(cafeColombiano);

        Equipo.reparar();
        Equipo.apagar();
        Equipo.encender();

        //Uso de metodos
        cafeColombiano.preparar();
        cafeColombiano.servir();

        espressoItaliano.preparar();

    }
}