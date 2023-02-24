package carworkshop.core.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReciboId implements Serializable {
    private static final long serialVersionUID = 1660977004674951559L;
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "id_factura", nullable = false)
    private Integer idFactura;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReciboId entity = (ReciboId) o;
        return Objects.equals(this.idFactura, entity.idFactura) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura, id);
    }

}