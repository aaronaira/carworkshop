package carworkshop.core.entities;

import javax.persistence.*;

@Entity
@Table(name = "totales_diagnostico")
public class TotalesDiagnostico {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private CabeceraDiagnostico cabeceraDiagnostico;

    @Column(name = "total_piezas", nullable = false)
    private Integer totalPiezas;

    @Column(name = "total_mo", nullable = false)
    private Float totalMo;

    @Column(name = "tiempo_total", nullable = false)
    private Float tiempoTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CabeceraDiagnostico getCabeceraDiagnostico() {
        return cabeceraDiagnostico;
    }

    public void setCabeceraDiagnostico(CabeceraDiagnostico cabeceraDiagnostico) {
        this.cabeceraDiagnostico = cabeceraDiagnostico;
    }

    public Integer getTotalPiezas() {
        return totalPiezas;
    }

    public void setTotalPiezas(Integer totalPiezas) {
        this.totalPiezas = totalPiezas;
    }

    public Float getTotalMo() {
        return totalMo;
    }

    public void setTotalMo(Float totalMo) {
        this.totalMo = totalMo;
    }

    public Float getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(Float tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

}