package carworkshop.core.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "recepcion")
public class Recepcion {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "foto", nullable = false, length = 50)
    private String foto;

    @Column(name = "fecha_hora", nullable = false)
    private Instant fechaHora;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private Vehiculo idVehiculo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_empleado_recepcion", nullable = false)
    private Empleado idEmpleadoRecepcion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_diagnostico_inicial", nullable = false)
    private CabeceraDiagnostico idDiagnosticoInicial;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_diagnostico_recepcion", nullable = false)
    private CabeceraDiagnostico idDiagnosticoRecepcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
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

    public Empleado getIdEmpleadoRecepcion() {
        return idEmpleadoRecepcion;
    }

    public void setIdEmpleadoRecepcion(Empleado idEmpleadoRecepcion) {
        this.idEmpleadoRecepcion = idEmpleadoRecepcion;
    }

    public CabeceraDiagnostico getIdDiagnosticoInicial() {
        return idDiagnosticoInicial;
    }

    public void setIdDiagnosticoInicial(CabeceraDiagnostico idDiagnosticoInicial) {
        this.idDiagnosticoInicial = idDiagnosticoInicial;
    }

    public CabeceraDiagnostico getIdDiagnosticoRecepcion() {
        return idDiagnosticoRecepcion;
    }

    public void setIdDiagnosticoRecepcion(CabeceraDiagnostico idDiagnosticoRecepcion) {
        this.idDiagnosticoRecepcion = idDiagnosticoRecepcion;
    }

}