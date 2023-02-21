package carworkshop.clases;

public abstract class Persona {

    String dni;
    String nombre;
    String apellidos;
    String direccion;
    String email;

    public Persona(String dni, String nombre, String apellidos, String direccion, String email) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
    }

    public abstract String getDni();

    public abstract void setDni();

    public abstract String getNombre();

    public abstract void setNombre();

    public abstract String getApellidos();

    public abstract void setApellidos();

    public abstract String getDireccion();

    public abstract void setDireccion();

    public abstract String getEmail();

    public abstract void setEmail();

}
