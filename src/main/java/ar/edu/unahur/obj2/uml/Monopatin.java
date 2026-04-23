package ar.edu.unahur.obj2.uml;

public class Monopatin extends Vehiculo{
    private String marca;
    private Boolean disponible;

    public Monopatin(Boolean disponible, String marca) {
        this.disponible = disponible;
        this.marca = marca;
    }
    

    @Override
    public Boolean estaDisponible() {
        return this.disponible;
    }

    @Override
    public void setDisponible(Boolean bool) {
        this.disponible = bool;
    }

    


}
