public class Compra extends Area{
    private String codigoCompra;

    public Compra(String codigoArea, String codigoCompra) {
        super(codigoArea);
        this.codigoCompra = codigoCompra;
    }

    public String getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "codigoArea='" + codigoArea + '\'' +
                ", codigoCompra='" + codigoCompra + '\'' +
                '}';
    }
}
