package carworkshop.core.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LineaDiagnosticoId implements Serializable {
    private static final long serialVersionUID = 5831207822262983368L;
    @Column(name = "id_diagnostico", nullable = false)
    private Integer idDiagnostico;

    @Column(name = "n_linea", nullable = false)
    private Integer nLinea;

    public Integer getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
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
        LineaDiagnosticoId entity = (LineaDiagnosticoId) o;
        return Objects.equals(this.idDiagnostico, entity.idDiagnostico) &&
                Objects.equals(this.nLinea, entity.nLinea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDiagnostico, nLinea);
    }

}