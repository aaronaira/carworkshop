package carworkshop.core.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FacturaLineaPiezaId implements Serializable {
    private static final long serialVersionUID = 6271629406924724272L;
    @Column(name = "id_factura", nullable = false)
    private Integer idFactura;

    @Column(name = "n_linea", nullable = false)
    private Integer nLinea;

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getNLinea() {
        return nLinea;
    }

    public void setNLinea(Integer nLinea) {
        this.nLinea = nLinea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FacturaLineaPiezaId entity = (FacturaLineaPiezaId) o;
        return Objects.equals(this.idFactura, entity.idFactura) &&
                Objects.equals(this.nLinea, entity.nLinea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura, nLinea);
    }

}