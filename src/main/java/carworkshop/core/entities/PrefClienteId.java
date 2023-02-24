package carworkshop.core.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Embeddable
public class PrefClienteId implements Serializable {
    private static final long serialVersionUID = -932632745679753127L;
    @Column(name = "id_cliente", nullable = false)
    private Integer idCliente;

    @Column(name = "fecha_hora", nullable = false)
    private Instant fechaHora;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Instant getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Instant fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PrefClienteId entity = (PrefClienteId) o;
        return Objects.equals(this.idCliente, entity.idCliente) &&
                Objects.equals(this.fechaHora, entity.fechaHora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, fechaHora);
    }

}