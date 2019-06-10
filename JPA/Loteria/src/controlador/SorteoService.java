package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.Sorteo;

public class SorteoService {
    
    
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Loteria");

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Sorteo guardarSorteo(Sorteo sorteo) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();    
        sorteo = em.merge(sorteo);
        em.getTransaction().commit();
        em.close();
        return sorteo;
    }

    public List<Sorteo> listarSorteos() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u FROM Sorteo u");
        List<Sorteo> resp = (List<Sorteo>) query.getResultList();
        em.close();
        return resp;
    }

    public Sorteo consultarAsesor(String id) {
        EntityManager em = getEntityManager();
        Sorteo resp = em.find(Sorteo.class, id);
        em.close();
        return resp;
    }     
}
