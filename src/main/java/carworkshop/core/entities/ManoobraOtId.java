package carworkshop.core.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ManoobraOtId implements Serializable {
    private static final long serialVersionUID = 353418731805343759L;
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "id_ot", nullable = false)
    private Integer idOt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdOt() {
        return idOt;
    }

    public void setIdOt(Integer idOt) {
        this.idOt = idOt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ManoobraOtId entity = (ManoobraOtId) o;
        return Objects.equals(this.idOt, entity.idOt) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOt, id);
    }

}