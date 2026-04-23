package ar.edu.unahur.obj2.uml;

public class Bicicleta extends Vehiculo{
    private Integer rodado;
    private Boolean disponible;

    
    public Bicicleta(Integer rodado) {
        this.rodado = rodado;
    }

    public Bicicleta(Boolean disponible, Integer rodado) {
        this.disponible = disponible;
        this.rodado = rodado;
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
