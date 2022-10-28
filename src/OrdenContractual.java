import java.util.List;

public class OrdenContractual {
    private int numeroContractual;
    private int nit;
    private Proveedor proveedor;
    private List<Item> items;

    public OrdenContractual(int numeroContractual, int nit, Proveedor proveedor, List<Item> items) {
        this.numeroContractual = numeroContractual;
        this.nit = nit;
        this.proveedor = proveedor;
        this.items = items;
    }

    public int getNumeroContractual() {
        return numeroContractual;
    }

    public void setNumeroContractual(int numeroContractual) {
        this.numeroContractual = numeroContractual;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "OrdenContractual{" +
                "numeroContractual=" + numeroContractual +
                ", nit=" + nit +
                ", proveedor=" + proveedor +
                ", items=" + items +
                '}';
    }
}
