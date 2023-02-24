package carworkshop.core.entities;

import javax.persistence.*;

@Entity
@Table(name = "cliente_factura_recibo")
public class ClienteFacturaRecibo {
    @EmbeddedId
    private ClienteFacturaReciboId id;

    @MapsId("idCliente")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente idCliente;

    @MapsId("idFactura")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_factura", nullable = false)
    private FacturaCabecera idFactura;

    @MapsId("idRecibo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_recibo", nullable = false, referencedColumnName = "id")
    private Recibo idRecibo;

    public ClienteFacturaReciboId getId() {
        return id;
    }

    public void setId(ClienteFacturaReciboId id) {
        this.id = id;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public FacturaCabecera getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(FacturaCabecera idFactura) {
        this.idFactura = idFactura;
    }

    public Recibo getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(Recibo idRecibo) {
        this.idRecibo = idRecibo;
    }

}