package carworkshop.clases;

public class Vehiculo {
        private String matricula;
        private String marca;
        private String modelo;
        private int v_year;
        private int id_cliente;
        private int tipo_vehiculo;
        private String bastidor;

        public String getMatricula(){
            return matricula;
        }

        public void setMatricula(String matricula){
            this.matricula=matricula;
        }

        public String getMarca(){
            return marca;
        }

        public void setMarca(String marca){
            this.marca=marca;
        }

        public String getModelo(){
            return modelo;
        }

        public void setModelo(String modelo){
            this.modelo=modelo;
        }

        public int getV_year(){
            return v_year;
        }

        public void setV_year(int v_year){
            this.v_year=v_year;
        }

        public int getId_cliente(){
            return id_cliente;
        }

        public void setId_cliente(int id_cliente){
            this.id_cliente=id_cliente;
        }

        public int getTipo_vehiculo(){
            return tipo_vehiculo;
        }

        public void setTipo_vehiculo(int tipo_vehiculo){
            this.tipo_vehiculo=tipo_vehiculo;
        }

        public String getBastidor(){
            return bastidor;
        }

        public void setBastidor(String bastidor){
            this.bastidor=bastidor;
        }
}

