package ar.edu.unahur.obj2.uml;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Alquiler> alquileres = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void alquilarVehiculo(Alquiler alquiler){
        alquileres.add(alquiler);
    }

}
