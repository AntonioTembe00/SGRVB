
package dao;

import model.Categoria;
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
public class CategoriaDAO {

    @Inject 
    private EntityManager manager;
    
    public CategoriaDAO() {
    }

    
    public Categoria create(Categoria entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Categoria update(Categoria entity) {
        manager.merge(entity);
        return entity;
    }

    public Categoria find(Integer id) {
        return manager.find(Categoria.class, id);
    }

    public boolean delete(Categoria entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Categoria> findAllUsers() {
        try {
            List<Categoria> lista = manager.createQuery("from Categoria e where e.estado=1 order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Categoria> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Categoria u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Categoria> u = q.getResultList();
        return u;
    }
}
