public class Area {
    protected String codigoArea;

    public Area(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    @Override
    public String toString() {
        return "Area{" +
                "codigoArea='" + codigoArea + '\'' +
                '}';
    }
}
