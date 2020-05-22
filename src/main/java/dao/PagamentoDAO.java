
package dao;

import model.Pagamento;
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
public class PagamentoDAO {

    @Inject 
    private EntityManager manager;
    
    public PagamentoDAO() {
    }

    
    public Pagamento create(Pagamento entity) {
        try {
            manager.persist(entity);
        } catch (Exception e) {
            return null;
        }
        return entity;
    }

    public Pagamento update(Pagamento entity) {
        manager.merge(entity);
        return entity;
    }

    public Pagamento find(Integer id) {
        return manager.find(Pagamento.class, id);
    }

    public boolean delete(Pagamento entity) {
        try {
            manager.remove(entity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public List<Pagamento> findAllUsers() {
        try {
            List<Pagamento> lista = manager.createQuery("from Pagamento e where e.estado=1 order by e.id").getResultList();
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Pagamento> getByNome(String nome){
        Query q = manager.createQuery("SELECT u FROM Pagamento u WHERE lower(u.nome) LIKE lower(:nome)");
        q.setParameter("nome", "%" + nome + "%");
        List<Pagamento> u = q.getResultList();
        return u;
    }
}
