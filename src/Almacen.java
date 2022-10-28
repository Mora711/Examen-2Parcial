import java.util.List;

public class Almacen extends Area {
    private String codigoAlmacen;
    private List<SalidaAlmacen> salida;
    private List<Factura> facturas;

    public Almacen(String codigoArea, String codigoAlmacen, List<SalidaAlmacen> salida, List<Factura> facturas) {
        super(codigoArea);
        this.codigoAlmacen = codigoAlmacen;
        this.salida = salida;
        this.facturas = facturas;
    }

    public String getCodigoAlmacen() {
        return codigoAlmacen;
    }

    public void setCodigoAlmacen(String codigoAlmacen) {
        this.codigoAlmacen = codigoAlmacen;
    }

    public List<SalidaAlmacen> getSalida() {
        return salida;
    }

    public void setSalida(List<SalidaAlmacen> salida) {
        this.salida = salida;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "codigoAlmacen='" + codigoAlmacen + '\'' +
                ", salida=" + salida +
                ", facturas=" + facturas +
                ", codigoArea='" + codigoArea + '\'' +
                '}';
    }
}
