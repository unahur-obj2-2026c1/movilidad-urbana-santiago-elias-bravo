package ar.edu.unahur.obj2.uml;

public class Alquiler {
    private Integer fechaInicio;
    private Integer fechaFin;

    public void registrarAlquiler(Integer unaFechaI, Integer unaFechaF, Vehiculo unVehiculo, Usuario unUsuario){
        if(unVehiculo.estaDisponible()){
            this.setFechaInicio(unaFechaI);
            this.setFechaFin(unaFechaF);
            unVehiculo.setDisponible(false);
            unUsuario.alquilarVehiculo(this);
        }
    }

    public void setFechaInicio(Integer fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Integer fechaFin) {
        this.fechaFin = fechaFin;
    }
}
