public class Solicitud {
    private String numeroSolicitud;
    private String centroCostos;
    private String rubro;
    private Compra compra;

    public Solicitud(String numeroSolicitud, String centroCostos, String rubro, Compra compra) {
        this.numeroSolicitud = numeroSolicitud;
        this.centroCostos = centroCostos;
        this.rubro = rubro;
        this.compra = compra;
    }

    public String getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(String numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public String getCentroCostos() {
        return centroCostos;
    }

    public void setCentroCostos(String centroCostos) {
        this.centroCostos = centroCostos;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "numeroSolicitud='" + numeroSolicitud + '\'' +
                ", centroCostos='" + centroCostos + '\'' +
                ", rubro='" + rubro + '\'' +
                ", compra=" + compra +
                '}';
    }
}
