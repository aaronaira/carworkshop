package carworkshop.core.entities;

import javax.persistence.*;

@Entity
@Table(name = "pref_cliente")
public class PrefCliente {
    @EmbeddedId
    private PrefClienteId id;

    @MapsId("idCliente")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente idCliente;

    @Column(name = "dia", nullable = false, length = 50)
    private String dia;

    @Column(name = "turno", nullable = false, length = 50)
    private String turno;

    public PrefClienteId getId() {
        return id;
    }

    public void setId(PrefClienteId id) {
        this.id = id;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

}