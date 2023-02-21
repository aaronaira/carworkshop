package carworkshop.clases;

public class Recepcion {

        private String foto;
        private int id_vehiculo;
        private int id_empleado_recepcion;
        private int id_diagnostico_inicial;
        private int id_diagnostico_recepcion;

        public String getFoto(){
            return foto;
        }

        public void setFoto(String foto){
            this.foto=foto;
        }

        public int getId_vehiculo(){
            return id_vehiculo;
        }

        public void setId_vehiculo(int id_vehiculo){
            this.id_vehiculo=id_vehiculo;
        }

        public int getId_empleado_recepcion(){
            return id_empleado_recepcion;
        }

        public void setId_empleado_recepcion(int id_empleado_recepcion){
            this.id_empleado_recepcion=id_empleado_recepcion;
        }

        public int getId_diagnostico_inicial(){
            return id_diagnostico_inicial;
        }

        public void setId_diagnostico_inicial(int id_diagnostico_inicial){
            this.id_diagnostico_inicial=id_diagnostico_inicial;
        }

        public int getId_diagnostico_recepcion(){
            return id_diagnostico_recepcion;
        }

        public void setId_diagnostico_recepcion(int id_diagnostico_recepcion){
            this.id_diagnostico_recepcion=id_diagnostico_recepcion;
        }
}

