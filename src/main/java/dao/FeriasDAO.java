
package dao;

import model.Ferias;
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
public class FeriasDAO {

    @Inject 
    private EntityManager manager;
    
    public FeriasDAO() {
    }

    
    public Ferias create(Ferias entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Ferias update(Ferias entity) {
        manager.merge(entity);
        return entity;
    }

    public Ferias find(Integer id) {
        return manager.find(Ferias.class, id);
    }

    public boolean delete(Ferias entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Ferias> findAllUsers() {
        try {
            List<Ferias> lista = manager.createQuery("from Ferias e where e.estado=1 order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Ferias> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Ferias u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Ferias> u = q.getResultList();
        return u;
    }
}
