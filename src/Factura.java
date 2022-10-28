import java.util.Date;
public class Factura {
    private int numeroEntrada;
    private Date fecha;
    private int numeroFactura;
    private Proveedor proveedor;
    private double valorTotal;

    public Factura(int numeroEntrada, Date fecha, int numeroFactura, Proveedor proveedor, double valorTotal) {
        this.numeroEntrada = numeroEntrada;
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        this.proveedor = proveedor;
        this.valorTotal = valorTotal;
    }

    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(int numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numeroEntrada=" + numeroEntrada +
                ", fecha=" + fecha +
                ", numeroFactura=" + numeroFactura +
                ", proveedor=" + proveedor +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
