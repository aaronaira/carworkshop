package carworkshop.core.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PiezasOtId implements Serializable {
    private static final long serialVersionUID = -4068693244867325521L;
    @Column(name = "id_ot", nullable = false)
    private Integer idOt;

    @Column(name = "id_pieza", nullable = false)
    private Integer idPieza;

    public Integer getIdOt() {
        return idOt;
    }

    public void setIdOt(Integer idOt) {
        this.idOt = idOt;
    }

    public Integer getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(Integer idPieza) {
        this.idPieza = idPieza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PiezasOtId entity = (PiezasOtId) o;
        return Objects.equals(this.idOt, entity.idOt) &&
                Objects.equals(this.idPieza, entity.idPieza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOt, idPieza);
    }

}