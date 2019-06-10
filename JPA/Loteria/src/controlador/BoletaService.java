package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.Boleta;

public class BoletaService {
    
    
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Loteria");

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Boleta guardarBoleta(Boleta boleta) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        boleta = em.merge(boleta);
        em.getTransaction().commit();
        em.close();
        return boleta;
    }

    public List<Boleta> listarBoleta() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u FROM Boleta u");
        List<Boleta> resp = (List<Boleta>) query.getResultList();
        em.close();
        return resp;
    }

    public Boleta consultarAsesor(String id) {
        EntityManager em = getEntityManager();
        Boleta resp = em.find(Boleta.class, id);
        em.close();
        return resp;
    }     
}
