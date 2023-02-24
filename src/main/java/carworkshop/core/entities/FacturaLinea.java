package carworkshop.core.entities;

import javax.persistence.*;

@Entity
@Table(name = "factura_linea")
public class FacturaLinea {
    @EmbeddedId
    private FacturaLineaId id;

    @MapsId("idFactura")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_factura", nullable = false)
    private FacturaCabecera idFactura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "concepto_pieza", referencedColumnName = "concepto")
    private FacturaLineaPieza conceptoPieza;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "concepto_mo", referencedColumnName = "concepto")
    private FacturaLineaMo conceptoMo;

    @Column(name = "cantidad", nullable = false)
    private Float cantidad;

    @Column(name = "precio_unit", nullable = false)
    private Float precioUnit;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_iva", nullable = false)
    private TipoIva idTipoIva;

    public FacturaLineaId getId() {
        return id;
    }

    public void setId(FacturaLineaId id) {
        this.id = id;
    }

    public FacturaCabecera getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(FacturaCabecera idFactura) {
        this.idFactura = idFactura;
    }

    public FacturaLineaPieza getConceptoPieza() {
        return conceptoPieza;
    }

    public void setConceptoPieza(FacturaLineaPieza conceptoPieza) {
        this.conceptoPieza = conceptoPieza;
    }

    public FacturaLineaMo getConceptoMo() {
        return conceptoMo;
    }

    public void setConceptoMo(FacturaLineaMo conceptoMo) {
        this.conceptoMo = conceptoMo;
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