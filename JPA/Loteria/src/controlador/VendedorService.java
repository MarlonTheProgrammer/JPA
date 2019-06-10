package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.Vendedor;

public class VendedorService {
    
    
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Loteria");

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Vendedor guardarVendedor(Vendedor vendedor) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        vendedor = em.merge(vendedor);
        em.getTransaction().commit();
        em.close();
        return vendedor;
    }

    public List<Vendedor> listarVendedores() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u FROM Vendedor u");
        List<Vendedor> resp = (List<Vendedor>) query.getResultList();
        em.close();
        return resp;
    }

    public Vendedor consultarAsesor(String id) {
        EntityManager em = getEntityManager();
        Vendedor resp = em.find(Vendedor.class, id);
        em.close();
        return resp;
    }     
}
