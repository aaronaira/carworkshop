package carworkshop.clases;

public class Factura_linea {

        private int id_factura;
        private String concepto_pieza;
        private String concepto_mo;
        private double cantidad;
        private double precio_unit;
        private int id_tipo_iva;

        public int getId_factura(){
            return id_factura;
        }

        public void setId_factura(int id_factura){
            this.id_factura=id_factura;
        }

        public String getConcepto_pieza(){
            return concepto_pieza;
        }

        public void setConcepto_pieza(String concepto_pieza){
            this.concepto_pieza=concepto_pieza;
        }

        public String getConcepto_mo(){
            return concepto_mo;
        }

        public void setConcepto_mo(String concepto_mo){
            this.concepto_mo=concepto_mo;
        }

        public double getCantidad(){
            return cantidad;
        }

        public void setCantidad(double cantidad){
            this.cantidad=cantidad;
        }

        public double getPrecio_unit(){
            return precio_unit;
        }

        public void setPrecio_unit(double precio_unit){
            this.precio_unit=precio_unit;
        }

        public int getId_tipo_iva(){
            return id_tipo_iva;
        }

        public void setId_tipo_iva(int id_tipo_iva){
            this.id_tipo_iva=id_tipo_iva;
        }
}
