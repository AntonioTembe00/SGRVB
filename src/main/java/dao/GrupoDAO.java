
package dao;

import model.Grupo;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Jasse
 */
@RequestScoped
public class GrupoDAO {

    @Inject 
    private EntityManager manager;
    
    public GrupoDAO() {
    }

    
    public Grupo create(Grupo entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Grupo update(Grupo entity) {
        manager.merge(entity);
        return entity;
    }

    public Grupo find(Integer id) {
        return manager.find(Grupo.class, id);
    }

    public boolean delete(Grupo entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Grupo> findAllUsers() {
        try {
            List<Grupo> lista = manager.createQuery("from Grupo e where e.estado=1 order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Grupo> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Grupo u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Grupo> u = q.getResultList();
        return u;
    }
}
