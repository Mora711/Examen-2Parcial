import java.util.Date;

public class Bien {
    private String codigoUniversal;
    private String nombreBien;
    private Date fechaEntrega;
    private String direccion;
    private Empleado empleado;

    public Bien(String codigoUniversal, String nombreBien, Date fechaEntrega, String direccion, Empleado empleado) {
        this.codigoUniversal = codigoUniversal;
        this.nombreBien = nombreBien;
        this.fechaEntrega = fechaEntrega;
        this.direccion = direccion;
        this.empleado = empleado;
    }

    public String getCodigoUniversal() {
        return codigoUniversal;
    }

    public void setCodigoUniversal(String codigoUniversal) {
        this.codigoUniversal = codigoUniversal;
    }

    public String getNombreBien() {
        return nombreBien;
    }

    public void setNombreBien(String nombreBien) {
        this.nombreBien = nombreBien;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Bien{" +
                "codigoUniversal='" + codigoUniversal + '\'' +
                ", nombreBien='" + nombreBien + '\'' +
                ", fechaEntrega=" + fechaEntrega +
                ", direccion='" + direccion + '\'' +
                ", empleado=" + empleado +
                '}';
    }
}
