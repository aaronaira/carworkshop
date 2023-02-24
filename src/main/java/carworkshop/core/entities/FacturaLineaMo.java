package carworkshop.core.entities;

import javax.persistence.*;

@Entity
@Table(name = "factura_linea_mo")
public class FacturaLineaMo {
    @EmbeddedId
    private FacturaLineaMoId id;

    @MapsId("idFactura")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_factura", nullable = false)
    private FacturaCabecera idFactura;

    @MapsId("nLinea")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "n_linea", nullable = false, referencedColumnName = "n_linea")
    private FacturaLinea nLinea;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_pieza", nullable = false)
    private Pieza idPieza;

    @Column(name = "concepto", nullable = false, length = 50)
    private String concepto;

    @Column(name = "cantidad", nullable = false)
    private Float cantidad;

    @Column(name = "precio_unit", nullable = false)
    private Float precioUnit;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_iva", nullable = false)
    private TipoIva idTipoIva;

    public FacturaLineaMoId getId() {
        return id;
    }

    public void setId(FacturaLineaMoId id) {
        this.id = id;
    }

    public FacturaCabecera getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(FacturaCabecera idFactura) {
        this.idFactura = idFactura;
    }

    public FacturaLinea getNLinea() {
        return nLinea;
    }

    public void setNLinea(FacturaLinea nLinea) {
        this.nLinea = nLinea;
    }

    public Pieza getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(Pieza idPieza) {
        this.idPieza = idPieza;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(Float precioUnit) {
        this.precioUnit = precioUnit;
    }

    public TipoIva getIdTipoIva() {
        return idTipoIva;
    }

    public void setIdTipoIva(TipoIva idTipoIva) {
        this.idTipoIva = idTipoIva;
    }

}