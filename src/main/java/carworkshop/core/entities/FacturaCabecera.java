package carworkshop.core.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "factura_cabecera")
public class FacturaCabecera {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "fecha_emision", nullable = false)
    private LocalDate fechaEmision;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente idCliente;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_ot", nullable = false)
    private OtCabecera idOt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public OtCabecera getIdOt() {
        return idOt;
    }

    public void setIdOt(OtCabecera idOt) {
        this.idOt = idOt;
    }

}