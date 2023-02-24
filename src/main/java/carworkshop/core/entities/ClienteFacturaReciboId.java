package carworkshop.core.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ClienteFacturaReciboId implements Serializable {
    private static final long serialVersionUID = 4796663532172160844L;
    @Column(name = "id_cliente", nullable = false)
    private Integer idCliente;

    @Column(name = "id_factura", nullable = false)
    private Integer idFactura;

    @Column(name = "id_recibo", nullable = false)
    private Integer idRecibo;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(Integer idRecibo) {
        this.idRecibo = idRecibo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ClienteFacturaReciboId entity = (ClienteFacturaReciboId) o;
        return Objects.equals(this.idCliente, entity.idCliente) &&
                Objects.equals(this.idRecibo, entity.idRecibo) &&
                Objects.equals(this.idFactura, entity.idFactura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, idRecibo, idFactura);
    }

}