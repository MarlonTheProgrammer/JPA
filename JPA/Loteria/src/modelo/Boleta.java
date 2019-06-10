package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Boleta")
public class Boleta {
    @Id
    private int numeroBoleta;
    @Column(nullable = false, length = 100)
    private int valorBoleta;
    @Column(nullable = false, length = 100)
    private String estado;
    @Column(nullable = false, length = 100)
    private String cedulaComprador;
    public Boleta() {
    }

    public int getValorBoleta() {
        return valorBoleta;
    }

    public void setValorBoleta(int valorBoleta) {
        this.valorBoleta = valorBoleta;
    }

    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCedulaComprador() {
        return cedulaComprador;
    }

    public void setCedulaComprador(String cedulaComprador) {
        this.cedulaComprador = cedulaComprador;
    }

    @Override
    public String toString() {
        return "Boleta{" + "numeroBoleta=" + numeroBoleta + ", valorBoleta=" + valorBoleta + ", estado=" + estado + ", cedulaComprador=" + cedulaComprador + '}';
    }
}
