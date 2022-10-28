public class ItemSolicitud extends Item{
    private String nombreBien;

    public ItemSolicitud(String codigoItem, int unidadMedida, int cantidadSolicitud, double valorUnitario, double valorTotal, int cantidaDespachada, String nombreBien) {
        super(codigoItem, unidadMedida, cantidadSolicitud, valorUnitario, valorTotal, cantidaDespachada);
        this.nombreBien = nombreBien;
    }

    public String getNombreBien() {
        return nombreBien;
    }

    public void setNombreBien(String nombreBien) {
        this.nombreBien = nombreBien;
    }

    @Override
    public String toString() {
        return "ItemSolicitud{" +
                "nombreBien='" + nombreBien + '\'' +
                '}';
    }
}
