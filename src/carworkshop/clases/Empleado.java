package carworkshop.clases;

public class Empleado {

        private String dni;
        private String nombre;
        private String apellidos;

    public Empleado(String dni, String nombre, String apellidos, String direccion, String email, String puesto, String departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.puesto = puesto;
        this.departamento = departamento;
    }

    private String direccion;
        private String email;
        private String puesto;
        private String departamento;

        public String getDni(){
            return dni;
        }

        public void setDni(String dni){
            this.dni=dni;
        }

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre=nombre;
        }

        public String getApellidos(){
            return apellidos;
        }

        public void setApellidos(String apellidos){
            this.apellidos=apellidos;
        }

        public String getDireccion(){
            return direccion;
        }

        public void setDireccion(String direccion){
            this.direccion=direccion;
        }

        public String getEmail(){
            return email;
        }

        public void setEmail(String email){
            this.email=email;
        }

        public String getPuesto(){
            return puesto;
        }

        public void setPuesto(String puesto){
            this.puesto=puesto;
        }

        public String getDepartamento(){
            return departamento;
        }

        public void setDepartamento(String departamento){
            this.departamento=departamento;
        }
}

