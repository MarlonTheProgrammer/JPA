package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Loteria")
public class Loteria {
    @Id
    private String ciudad;

    public Loteria() {
    }

    public Loteria(String ciudad, String fecha, int numeroGanador) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    } 

    @Override
    public String toString() {
        return "Loteria{" + "ciudad=" + ciudad + '}';
    }
}
