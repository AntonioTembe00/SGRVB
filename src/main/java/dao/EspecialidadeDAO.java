
package dao;

import model.Especialidade;
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
public class EspecialidadeDAO {

    @Inject 
    private EntityManager manager;
    
    public EspecialidadeDAO() {
    }

    
    public Especialidade create(Especialidade entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Especialidade update(Especialidade entity) {
        manager.merge(entity);
        return entity;
    }

    public Especialidade find(Integer id) {
        return manager.find(Especialidade.class, id);
    }

    public boolean delete(Especialidade entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Especialidade> findAllUsers() {
        try {
            List<Especialidade> lista = manager.createQuery("from Especialidade e where e.estado=1 order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Especialidade> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Especialidade u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Especialidade> u = q.getResultList();
        return u;
    }
}
