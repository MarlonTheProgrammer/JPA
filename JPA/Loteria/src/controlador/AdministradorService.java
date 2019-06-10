package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.Administrador;

public class AdministradorService {
    
    
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Loteria");

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Administrador guardarAdministrador(Administrador administrador) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        administrador = em.merge(administrador);
        em.getTransaction().commit();
        em.close();
        return administrador;
    }

    public List<Administrador> listarAdministradores() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u FROM Administrador u");
        List<Administrador> resp = (List<Administrador>) query.getResultList();
        em.close();
        return resp;
    }

    public Administrador consultarAsesor(String id) {
        EntityManager em = getEntityManager();
        Administrador resp = em.find(Administrador.class, id);
        em.close();
        return resp;
    }     
}
