public class ItemContractual extends Item {

    private int cantidaDespachada;

    public ItemContractual(String codigoItem, int unidadMedida, int cantidadSolicitud, double valorUnitario, double valorTotal, int cantidaDespachada, int cantidaDespachada1) {
        super(codigoItem, unidadMedida, cantidadSolicitud, valorUnitario, valorTotal, cantidaDespachada);
        this.cantidaDespachada = cantidaDespachada1;
    }

    @Override
    public int getCantidaDespachada() {
        return cantidaDespachada;
    }

    @Override
    public void setCantidaDespachada(int cantidaDespachada) {
        this.cantidaDespachada = cantidaDespachada;
    }

    @Override
    public String toString() {
        return "ItemContractual{" +
                "cantidaDespachada=" + cantidaDespachada +
                '}';
    }
}
