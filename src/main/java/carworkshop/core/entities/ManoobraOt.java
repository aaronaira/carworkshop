package carworkshop.core.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "manoobra_ot")
public class ManoobraOt {
    @EmbeddedId
    private ManoobraOtId id;

    @MapsId("idOt")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_ot", nullable = false)
    private OtCabecera idOt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tarifa", nullable = false)
    private Tarifa tarifa;

    @Column(name = "operacion", nullable = false, length = 50)
    private String operacion;

    @Column(name = "ts_inicio", nullable = false)
    private Instant tsInicio;

    @Column(name = "ts_fin", nullable = false)
    private Instant tsFin;

    public ManoobraOtId getId() {
        return id;
    }

    public void setId(ManoobraOtId id) {
        this.id = id;
    }

    public OtCabecera getIdOt() {
        return idOt;
    }

    public void setIdOt(OtCabecera idOt) {
        this.idOt = idOt;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Instant getTsInicio() {
        return tsInicio;
    }

    public void setTsInicio(Instant tsInicio) {
        this.tsInicio = tsInicio;
    }

    public Instant getTsFin() {
        return tsFin;
    }

    public void setTsFin(Instant tsFin) {
        this.tsFin = tsFin;
    }

}