import java.util.Date;
public class Proveedor {
    private String codigoProveedor;
    private String nombreProveedor;
    private Date fechaEntrega;
    private Date fechaOrden;
    private int montoTotalOrden;

    public Proveedor(String codigoProveedor, String nombreProveedor, Date fechaEntrega, Date fechaOrden, int montoTotalOrden) {
        this.codigoProveedor = codigoProveedor;
        this.nombreProveedor = nombreProveedor;
        this.fechaEntrega = fechaEntrega;
        this.fechaOrden = fechaOrden;
        this.montoTotalOrden = montoTotalOrden;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public int getMontoTotalOrden() {
        return montoTotalOrden;
    }

    public void setMontoTotalOrden(int montoTotalOrden) {
        this.montoTotalOrden = montoTotalOrden;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "codigoProveedor='" + codigoProveedor + '\'' +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", fechaEntrega=" + fechaEntrega +
                ", fechaOrden=" + fechaOrden +
                ", montoTotalOrden=" + montoTotalOrden +
                '}';
    }
}
