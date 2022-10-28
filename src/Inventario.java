public class Inventario extends Area{
    private int codigoInventario;

    public Inventario(String codigoArea, int codigoInventario) {
        super(codigoArea);
        this.codigoInventario = codigoInventario;
    }

    public int getCodigoInventario() {
        return codigoInventario;
    }

    public void setCodigoInventario(int codigoInventario) {
        this.codigoInventario = codigoInventario;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "codigoArea='" + codigoArea + '\'' +
                ", codigoInventario=" + codigoInventario +
                '}';
    }
}
