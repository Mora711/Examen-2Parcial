import java.util.Date;
public class SalidaAlmacen {
    private int numeroSalida;
    private Empleado responsable;
    private Date fechaSalida;
    private Date fechaEntrega;

    public SalidaAlmacen(int numeroSalida, Empleado responsable, Date fechaSalida, Date fechaEntrega) {
        this.numeroSalida = numeroSalida;
        this.responsable = responsable;
        this.fechaSalida = fechaSalida;
        this.fechaEntrega = fechaEntrega;
    }

    public int getNumeroSalida() {
        return numeroSalida;
    }

    public void setNumeroSalida(int numeroSalida) {
        this.numeroSalida = numeroSalida;
    }

    public Empleado getResponsable() {
        return responsable;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "SalidaAlmacen{" +
                "numeroSalida=" + numeroSalida +
                ", responsable=" + responsable +
                ", fechaSalida=" + fechaSalida +
                ", fechaEntrega=" + fechaEntrega +
                '}';
    }
}
