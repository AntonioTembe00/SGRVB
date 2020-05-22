
package dao;

import model.Faltas;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author 
 */
@RequestScoped
public class FaltasDAO {

    @Inject 
    private EntityManager manager;
    
    public FaltasDAO() {
    }

    
    public Faltas create(Faltas entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Faltas update(Faltas entity) {
        manager.merge(entity);
        return entity;
    }

    public Faltas find(Integer id) {
        return manager.find(Faltas.class, id);
    }

    public boolean delete(Faltas entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Faltas> findAllUsers() {
        try {
            List<Faltas> lista = manager.createQuery("from Faltas e where e.estado=1 order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Faltas> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Faltas u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Faltas> u = q.getResultList();
        return u;
    }
}
