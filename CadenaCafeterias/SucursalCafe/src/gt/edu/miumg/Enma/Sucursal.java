package gt.edu.miumg.Enma;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private final List<Empleado> empleados = new ArrayList<>();
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();
    private List<Cafe> especialidades = new ArrayList<>();

    public  Sucursal(String nombre, String direccion){
    }

    public void agregarEmpleado(Empleado empleado){
        System.out.println("Agregando Empleado");
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        System.out.println("Agregando Ingredientes");
    }

    public void agregarEquipo(Equipo equipo){
        System.out.println("Agregando Equipo");
    }

    public void agregarEspecialidad(Cafe cafe){
        System.out.println("Agregando Especialidades");
    }
}
