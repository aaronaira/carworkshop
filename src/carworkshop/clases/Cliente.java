package carworkshop.clases;

public class Cliente extends Persona{

    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;

    public Cliente(String nombre, String apellidos, String dni, String direccion, String email) {
        super(dni, nombre, apellidos, direccion, email);

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
