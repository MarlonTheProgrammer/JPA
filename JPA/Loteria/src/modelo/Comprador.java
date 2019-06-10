package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Comprador")
public class Comprador {
    @Id
    private int cedula;
    @Column(nullable = false, length = 100)
    private String nombre;
     @Column(precision = 10)
    private int celular;
    @Column(precision = 20)
    private String direccion;

    public Comprador() {
    }

    public Comprador(int cedula, String nombre, int celular, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.celular = celular;
        this.direccion = direccion;
    }


    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Comprador{" + "cedula=" + cedula + ", nombre=" + nombre + ", celular=" + celular + ", direccion=" + direccion + '}';
    }
    
}
