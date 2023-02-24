package carworkshop.core.entities;

import javax.persistence.*;

@Entity
@Table(name = "totales_factura")
public class TotalesFactura {
    @Id
    @Column(name = "id_factura", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_factura", nullable = false)
    private FacturaCabecera facturaCabecera;

    @Column(name = "total_piezas", nullable = false)
    private Float totalPiezas;

    @Column(name = "total_mo", nullable = false)
    private Float totalMo;

    @Column(name = "iva", nullable = false)
    private Float iva;

    @Column(name = "total_factura", nullable = false)
    private Float totalFactura;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FacturaCabecera getFacturaCabecera() {
        return facturaCabecera;
    }

    public void setFacturaCabecera(FacturaCabecera facturaCabecera) {
        this.facturaCabecera = facturaCabecera;
    }

    public Float getTotalPiezas() {
        return totalPiezas;
    }

    public void setTotalPiezas(Float totalPiezas) {
        this.totalPiezas = totalPiezas;
    }

    public Float getTotalMo() {
        return totalMo;
    }

    public void setTotalMo(Float totalMo) {
        this.totalMo = totalMo;
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    public Float getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(Float totalFactura) {
        this.totalFactura = totalFactura;
    }

}