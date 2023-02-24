package carworkshop.core.entities;

import javax.persistence.*;

@Entity
@Table(name = "linea_diagnostico")
public class LineaDiagnostico {
    @EmbeddedId
    private LineaDiagnosticoId id;

    @MapsId("idDiagnostico")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_diagnostico", nullable = false)
    private CabeceraDiagnostico idDiagnostico;

    @Column(name = "descripcion", nullable = false, length = 50)
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_operario", nullable = false)
    private Empleado codigoOperario;

    @Column(name = "cantidad", nullable = false)
    private Float cantidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_iva", nullable = false)
    private TipoIva idTipoIva;

    public LineaDiagnosticoId getId() {
        return id;
    }

    public void setId(LineaDiagnosticoId id) {
        this.id = id;
    }

    public CabeceraDiagnostico getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(CabeceraDiagnostico idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Empleado getCodigoOperario() {
        return codigoOperario;
    }

    public void setCodigoOperario(Empleado codigoOperario) {
        this.codigoOperario = codigoOperario;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public TipoIva getIdTipoIva() {
        return idTipoIva;
    }

    public void setIdTipoIva(TipoIva idTipoIva) {
        this.idTipoIva = idTipoIva;
    }

}