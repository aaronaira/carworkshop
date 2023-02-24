package carworkshop.core.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "encuesta")
public class Encuesta {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "fecha_hora", nullable = false)
    private Instant fechaHora;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_ot", nullable = false)
    private OtCabecera idOt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_factura", nullable = false)
    private FacturaCabecera idFactura;

    @Column(name = "puntuacion")
    private Integer puntuacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Instant fechaHora) {
        this.fechaHora = fechaHora;
    }

    public OtCabecera getIdOt() {
        return idOt;
    }

    public void setIdOt(OtCabecera idOt) {
        this.idOt = idOt;
    }

    public FacturaCabecera getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(FacturaCabecera idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

}