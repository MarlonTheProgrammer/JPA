package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.Comprador;

public class CompradorService {
    
    
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Loteria");

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Comprador guardarComprador(Comprador comprador) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        comprador = em.merge(comprador);
        em.getTransaction().commit();
        em.close();
        return comprador;
    }

    public List<Comprador> listarCompradores() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u FROM Comprador u");
        List<Comprador> resp = (List<Comprador>) query.getResultList();
        em.close();
        return resp;
    }

    public Comprador consultarAsesor(String id) {
        EntityManager em = getEntityManager();
        Comprador resp = em.find(Comprador.class, id);
        em.close();
        return resp;
    }     
}
