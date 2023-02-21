package carworkshop.clases;

public class Empleado extends Persona {

    private String puesto;
    private String departamento;
    public Empleado(String dni, String nombre, String apellidos, String direccion, String email, String puesto, String departamento) {
        super(dni, nombre, apellidos, direccion, email);
        this.puesto = puesto;
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String getDni() {
        return null;
    }

    @Override
    public void setDni() {

    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public void setNombre() {

    }

    @Override
    public String getApellidos() {
        return null;
    }

    @Override
    public void setApellidos() {

    }

    @Override
    public String getDireccion() {
        return null;
    }

    @Override
    public void setDireccion() {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail() {

    }

}