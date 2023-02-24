package carworkshop.core.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ot_cabecera")
public class OtCabecera {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "fecha_hora", nullable = false)
    private Instant fechaHora;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private Vehiculo idVehiculo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_diagnostico", nullable = false)
    private CabeceraDiagnostico idDiagnostico;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Instant fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Vehiculo getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Vehiculo idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public CabeceraDiagnostico getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(CabeceraDiagnostico idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

}