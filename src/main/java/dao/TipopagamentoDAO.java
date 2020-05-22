
package dao;

import model.Tipopagamento;
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
public class TipopagamentoDAO {

    @Inject 
    private EntityManager manager;
    
    public TipopagamentoDAO() {
    }

    
    public Tipopagamento create(Tipopagamento entity) {
        try {
            entity.setId(null);
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Tipopagamento update(Tipopagamento entity) {
        manager.merge(entity);
        return entity;
    }

    public Tipopagamento find(Integer id) {
        return manager.find(Tipopagamento.class, id);
    }

    public boolean delete(Tipopagamento entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Tipopagamento> findAllUsers() {
        try {
            List<Tipopagamento> lista = manager.createQuery("from Tipopagamento e where e.estado=1  order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Tipopagamento> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Tipopagamento u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Tipopagamento> u = q.getResultList();
        return u;
    }
}
