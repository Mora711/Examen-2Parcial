public class Empleado {
    private String codigoEmpleado;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int telefono;
    private String email;
    private String centroCostos;

    public Empleado(String codigoEmpleado, String nombre, String primerApellido, String segundoApellido, int telefono, String email, String centroCostos) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.email = email;
        this.centroCostos = centroCostos;
    }

}
