package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sorteo")
public class Sorteo {
    @Id
    private int numeroSorteo;
    @Column(nullable = false, length = 100)
    private int numeroCifras;
    @Column(nullable = false, length = 100)
    private int numeroBoletas;
    @Column(nullable = false, length = 100)
    private int numeroReservas;

    public Sorteo() {
    }

    public Sorteo(int numeroSorteo, int numeroCifras, int numeroBoletas, int numeroReservas) {
        this.numeroSorteo = numeroSorteo;
        this.numeroCifras = numeroCifras;
        this.numeroBoletas = numeroBoletas;
        this.numeroReservas = numeroReservas;
    }

    public int getNumeroSorteo() {
        return numeroSorteo;
    }

    public void setNumeroSorteo(int numeroSorteo) {
        this.numeroSorteo = numeroSorteo;
    }

    public int getNumeroCifras() {
        return numeroCifras;
    }

    public void setNumeroCifras(int numeroCifras) {
        this.numeroCifras = numeroCifras;
    }

    public int getNumeroBoletas() {
        return numeroBoletas;
    }

    public void setNumeroBoletas(int numeroBoletas) {
        this.numeroBoletas = numeroBoletas;
    }

    public int getNumeroReservas() {
        return numeroReservas;
    }

    public void setNumeroReservas(int numeroReservas) {
        this.numeroReservas = numeroReservas;
    }

    @Override
    public String toString() {
        return "Sorteo{" + "numeroSorteo=" + numeroSorteo + ", numeroCifras=" + numeroCifras + ", numeroBoletas=" + numeroBoletas + ", numeroReservas=" + numeroReservas + '}';
    }
  
    
    
}
