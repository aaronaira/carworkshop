package carworkshop.core.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "recibo")
public class Recibo {
    @EmbeddedId
    private ReciboId id;

    @Column(name = "importe", nullable = false)
    private Float importe;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_mediopago", nullable = false)
    private MedioPago idMediopago;

    public ReciboId getId() {
        return id;
    }

    public void setId(ReciboId id) {
        this.id = id;
    }

    public Float getImporte() {
        return importe;
    }

    public void setImporte(Float importe) {
        this.importe = importe;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public MedioPago getIdMediopago() {
        return idMediopago;
    }

    public void setIdMediopago(MedioPago idMediopago) {
        this.idMediopago = idMediopago;
    }

}