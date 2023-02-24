package carworkshop.core.entities;

import javax.persistence.*;

@Entity
@Table(name = "piezas_ot")
public class PiezasOt {
    @EmbeddedId
    private PiezasOtId id;

    @MapsId("idOt")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_ot", nullable = false)
    private OtCabecera idOt;

    @MapsId("idPieza")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_pieza", nullable = false)
    private Pieza idPieza;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    public PiezasOtId getId() {
        return id;
    }

    public void setId(PiezasOtId id) {
        this.id = id;
    }

    public OtCabecera getIdOt() {
        return idOt;
    }

    public void setIdOt(OtCabecera idOt) {
        this.idOt = idOt;
    }

    public Pieza getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(Pieza idPieza) {
        this.idPieza = idPieza;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

}